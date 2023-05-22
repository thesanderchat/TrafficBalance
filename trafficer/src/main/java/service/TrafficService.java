package service;

import domain.Input;

import java.util.Arrays;

public class TrafficService {

    public static double[] calculate(Input input) {
        double flowA = input.getDoubleFaField() + input.getDoubleEaField();
        double flowB = input.getDoubleLbField() + input.getDoubleKbField();
        double flowC = input.getDoubleHcField() + input.getDoubleGcField();
        double flowD = input.getDoubleJdField() + input.getDoubleIdField();
        double[][] matrix =
                {
                        {input.isABWayField() ? 1 : -1, 0, 0, input.isADWayField() ? 1 : -1, flowA},
                        {input.isABWayField() ? -1 : 1, input.isCBWayField() ? -1 : 1, 0, 0, flowB},
                        {0, input.isCBWayField() ? 1 : -1, input.isCDWayField() ? 1 : -1, 0, flowC},
                        {0, 0, input.isCDWayField() ? -1 : 1, input.isADWayField() ? -1 : 1, flowD}
                };
        return solveLinearSystem(matrix);
    }

    public static double[] solveLinearSystem(double[][] coefficients) {
        int rows = coefficients.length;
        int columns = coefficients[0].length - 1;

        double[][] augmentedMatrix = new double[rows][columns + 1];

        double[] solution = new double[rows];

        // Создание рас ширенной матрицы
        for (int i = 0; i < rows; i++) {
            System.arraycopy(coefficients[i], 0, augmentedMatrix[i], 0, columns + 1);
        }

        // Приведение матрицы к ступенчатому виду
        for (int pivot = 0; pivot < rows; pivot++) {
            // Поиск максимального элемента в столбце
            int maxRow = pivot;
            double maxValue = Math.abs(augmentedMatrix[pivot][pivot]);
            for (int i = pivot + 1; i < rows; i++) {
                double value = Math.abs(augmentedMatrix[i][pivot]);
                if (value > maxValue) {
                    maxRow = i;
                    maxValue = value;
                }
            }

            if (maxValue == 0) {
                // Все элементы в столбце равны нулю, невозможно продолжить решение
                System.out.printf("Система уравнений имеет бесконечное количество решений или не имеет решений. Взято x%s = 0%n", pivot + 1);
                solution[pivot] = 0;
                continue;
            }

            // Перестановка строк
            if (maxRow != pivot) {
                double[] tempRow = augmentedMatrix[pivot];
                augmentedMatrix[pivot] = augmentedMatrix[maxRow];
                augmentedMatrix[maxRow] = tempRow;
            }

            // Приведение строки с главным элементом к единице
            double pivotValue = augmentedMatrix[pivot][pivot];
            for (int j = pivot; j <= columns; j++) {
                augmentedMatrix[pivot][j] /= pivotValue;
            }

            // Обнуление остальных элементов в столбце
            for (int i = 0; i < rows; i++) {
                if (i != pivot) {
                    double factor = augmentedMatrix[i][pivot];
                    for (int j = pivot; j <= columns; j++) {
                        augmentedMatrix[i][j] -= factor * augmentedMatrix[pivot][j];
                    }
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            solution[i] = augmentedMatrix[i][columns];
        }

        if (Arrays.stream(solution).filter(number -> number < 0).count() == 0) {
            return solution;
        }
        System.out.print("Система не має розв'язків");
        return new double[]{};
    }
}
