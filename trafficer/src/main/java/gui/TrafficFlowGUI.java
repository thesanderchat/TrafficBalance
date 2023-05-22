package gui;

import domain.Input;
import service.TrafficService;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import static java.awt.Image.SCALE_AREA_AVERAGING;

public class TrafficFlowGUI extends JFrame {

    private JTextField eaField, faField, gcField, hcField, jdField, idField, kbField, lbField;
    private JTextField eaWayField, faWayField, gcWayField, hcWayField, jdWayField, idWayField, kbWayField, lbWayField;
    private JTextField ADWayField, ABWayField, CDWayField, CBWayField;

    public TrafficFlowGUI() throws IOException {
        setTitle("Traffic Flow Parameters");
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Создание компонентов интерфейса
        JLabel eaLabel = new JLabel("E And A traffic flow:");
        JLabel faLabel = new JLabel("F And A traffic flow:");
        JLabel gcLabel = new JLabel("G And C traffic flow:");
        JLabel hcLabel = new JLabel("H And C traffic flow:");
        JLabel jdLabel = new JLabel("J And D traffic flow:");
        JLabel idLabel = new JLabel("I And D traffic flow:");
        JLabel kbLabel = new JLabel("K And B traffic flow:");
        JLabel lbLabel = new JLabel("L And B traffic flow:");

        JLabel eaWayLabel = new JLabel("E And A way:");
        JLabel faWayLabel = new JLabel("F And A way:");
        JLabel gcWayLabel = new JLabel("G And C way:");
        JLabel hcWayLabel = new JLabel("H And C way:");
        JLabel jdWayLabel = new JLabel("J And D way:");
        JLabel idWayLabel = new JLabel("I And D way:");
        JLabel kbWayLabel = new JLabel("K And B way:");
        JLabel lbWayLabel = new JLabel("L And B way:");

        JLabel ADWayLabel = new JLabel("A And D way:");
        JLabel ABWayLabel = new JLabel("A And B way:");
        JLabel CDWayLabel = new JLabel("C And D way:");
        JLabel CBWayLabel = new JLabel("C And B way:");

        eaField = new JTextField(10);
        faField = new JTextField(10);
        gcField = new JTextField(10);
        hcField = new JTextField(10);
        jdField = new JTextField(10);
        idField = new JTextField(10);
        kbField = new JTextField(10);
        lbField = new JTextField(10);

        eaWayField = new JTextField(10);
        faWayField = new JTextField(10);
        gcWayField = new JTextField(10);
        hcWayField = new JTextField(10);
        jdWayField = new JTextField(10);
        idWayField = new JTextField(10);
        kbWayField = new JTextField(10);
        lbWayField = new JTextField(10);

        ADWayField = new JTextField(10);
        ABWayField = new JTextField(10);
        CDWayField = new JTextField(10);
        CBWayField = new JTextField(10);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(e -> calculateButtonClicked());

        // Создание панелей для компонентов
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);


        JLabel imageLabel = new JLabel();
        // Установка изображения
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Hp Zbook 15\\IdeaProjects\\Trafficer\\trafficer\\graph.jpg");
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(400, 400, SCALE_AREA_AVERAGING);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        imageLabel.setIcon(scaledImageIcon);
        panel.add(imageLabel);

        panel.add(eaLabel);
        panel.add(eaField);
        panel.add(faLabel);
        panel.add(faField);
        panel.add(gcLabel);
        panel.add(gcField);
        panel.add(hcLabel);
        panel.add(hcField);
        panel.add(jdLabel);
        panel.add(jdField);
        panel.add(idLabel);
        panel.add(idField);
        panel.add(kbLabel);
        panel.add(kbField);
        panel.add(lbLabel);
        panel.add(lbField);
        panel.add(eaWayLabel);
        panel.add(eaWayField);
        panel.add(faWayLabel);
        panel.add(faWayField);
        panel.add(gcWayLabel);
        panel.add(gcWayField);
        panel.add(hcWayLabel);
        panel.add(hcWayField);
        panel.add(jdWayLabel);
        panel.add(jdWayField);
        panel.add(idWayLabel);
        panel.add(idWayField);
        panel.add(kbWayLabel);
        panel.add(kbWayField);
        panel.add(lbWayLabel);
        panel.add(lbWayField);
        panel.add(ADWayLabel);
        panel.add(ADWayField);
        panel.add(ABWayLabel);
        panel.add(ABWayField);
        panel.add(CDWayLabel);
        panel.add(CDWayField);
        panel.add(CBWayLabel);
        panel.add(CBWayField);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        panel.setLayout(layout);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(imageLabel)
                        .addComponent(eaLabel)
                        .addComponent(faLabel)
                        .addComponent(gcLabel)
                        .addComponent(hcLabel)
                        .addComponent(jdLabel)
                        .addComponent(idLabel)
                        .addComponent(kbLabel)
                        .addComponent(lbLabel)
                        .addComponent(eaWayLabel)
                        .addComponent(faWayLabel)
                        .addComponent(gcWayLabel)
                        .addComponent(hcWayLabel)
                        .addComponent(jdWayLabel)
                        .addComponent(idWayLabel)
                        .addComponent(kbWayLabel)
                        .addComponent(lbWayLabel)
                        .addComponent(ADWayLabel)
                        .addComponent(ABWayLabel)
                        .addComponent(CDWayLabel)
                        .addComponent(CBWayLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(eaField)
                        .addComponent(faField)
                        .addComponent(gcField)
                        .addComponent(hcField)
                        .addComponent(jdField)
                        .addComponent(idField)
                        .addComponent(kbField)
                        .addComponent(lbField)
                        .addComponent(eaWayField)
                        .addComponent(faWayField)
                        .addComponent(gcWayField)
                        .addComponent(hcWayField)
                        .addComponent(jdWayField)
                        .addComponent(idWayField)
                        .addComponent(kbWayField)
                        .addComponent(lbWayField)
                        .addComponent(ADWayField)
                        .addComponent(ABWayField)
                        .addComponent(CDWayField)
                        .addComponent(CBWayField))
                .addComponent(calculateButton));

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(imageLabel)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(eaLabel)
                                .addComponent(eaField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(faLabel)
                                .addComponent(faField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(gcLabel)
                                .addComponent(gcField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(hcLabel)
                                .addComponent(hcField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jdLabel)
                                .addComponent(jdField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(idLabel)
                                .addComponent(idField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(kbLabel)
                                .addComponent(kbField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(lbLabel)
                                .addComponent(lbField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(eaWayLabel)
                                .addComponent(eaWayField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(faWayLabel)
                                .addComponent(faWayField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(gcWayLabel)
                                .addComponent(gcWayField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(hcWayLabel)
                                .addComponent(hcWayField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jdWayLabel)
                                .addComponent(jdWayField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(idWayLabel)
                                .addComponent(idWayField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(kbWayLabel)
                                .addComponent(kbWayField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(lbWayLabel)
                                .addComponent(lbWayField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(ADWayLabel)
                                .addComponent(ADWayField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(ABWayLabel)
                                .addComponent(ABWayField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(CDWayLabel)
                                .addComponent(CDWayField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(CBWayLabel)
                                .addComponent(CBWayField))
                        .addComponent(calculateButton));

        panel.add(calculateButton);

        // Добавление панели на форму
        getContentPane().add(panel);
    }

    private void calculateButtonClicked() {
        // Получение значений из текстовых полей
        double doubleEaField = eaWayField.getText().charAt(0) == 'E' ?
                Double.parseDouble(eaField.getText()) : -1 * Double.parseDouble(eaField.getText());
        double doubleFaField = faWayField.getText().charAt(0) == 'F' ?
                Double.parseDouble(faField.getText()) : -1 * Double.parseDouble(faField.getText());
        double doubleGcField = gcWayField.getText().charAt(0) == 'G' ?
                Double.parseDouble(gcField.getText()) : -1 * Double.parseDouble(gcField.getText());
        double doubleHcField = hcWayField.getText().charAt(0) == 'H' ?
                Double.parseDouble(hcField.getText()) : -1 * Double.parseDouble(hcField.getText());
        double doubleJdField = jdWayField.getText().charAt(0) == 'J' ?
                Double.parseDouble(jdField.getText()) : -1 * Double.parseDouble(jdField.getText());
        double doubleIdField = idWayField.getText().charAt(0) == 'I' ?
                Double.parseDouble(idField.getText()) : -1 * Double.parseDouble(idField.getText());
        double doubleKbField = kbWayField.getText().charAt(0) == 'K' ?
                Double.parseDouble(kbField.getText()) : -1 * Double.parseDouble(kbField.getText());
        double doubleLbField = lbWayField.getText().charAt(0) == 'L' ?
                Double.parseDouble(lbField.getText()) : -1 * Double.parseDouble(lbField.getText());
        boolean adWayField = ADWayField.getText().charAt(0) == 'A';
        boolean abWayField = ABWayField.getText().charAt(0) == 'A';
        boolean cdWayField = CDWayField.getText().charAt(0) == 'C';
        boolean cbWayField = CBWayField.getText().charAt(0) == 'C';
        Input input = new Input(doubleEaField, doubleFaField, doubleGcField, doubleHcField, doubleJdField, doubleIdField, doubleKbField, doubleLbField, adWayField, abWayField, cdWayField, cbWayField);
        double[] response = TrafficService.calculate(input);
        JOptionPane.showMessageDialog(this, displayArray(response));

    }

    private String displayArray(double[] array) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", "); // Add a separator if it's not the last element
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new TrafficFlowGUI().setVisible(true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
