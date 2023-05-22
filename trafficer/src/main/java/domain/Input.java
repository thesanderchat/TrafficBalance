package domain;

public class Input {
    double doubleEaField;
    double doubleFaField;
    double doubleGcField;
    double doubleHcField;
    double doubleJdField;
    double doubleIdField;
    double doubleKbField;
    double doubleLbField;
    boolean ADWayField;
    boolean ABWayField;
    boolean CDWayField;
    boolean CBWayField;

    public Input(double doubleEaField, double doubleFaField, double doubleGcField, double doubleHcField, double doubleJdField, double doubleIdField, double doubleKbField, double doubleLbField, boolean ADWayField, boolean ABWayField, boolean CDWayField, boolean CBWayField) {
        this.doubleEaField = doubleEaField;
        this.doubleFaField = doubleFaField;
        this.doubleGcField = doubleGcField;
        this.doubleHcField = doubleHcField;
        this.doubleJdField = doubleJdField;
        this.doubleIdField = doubleIdField;
        this.doubleKbField = doubleKbField;
        this.doubleLbField = doubleLbField;
        this.ADWayField = ADWayField;
        this.ABWayField = ABWayField;
        this.CDWayField = CDWayField;
        this.CBWayField = CBWayField;
    }

    public double getDoubleEaField() {
        return doubleEaField;
    }

    public double getDoubleFaField() {
        return doubleFaField;
    }

    public double getDoubleGcField() {
        return doubleGcField;
    }

    public double getDoubleHcField() {
        return doubleHcField;
    }

    public double getDoubleJdField() {
        return doubleJdField;
    }

    public double getDoubleIdField() {
        return doubleIdField;
    }

    public double getDoubleKbField() {
        return doubleKbField;
    }

    public double getDoubleLbField() {
        return doubleLbField;
    }

    public boolean isADWayField() {
        return ADWayField;
    }

    public boolean isABWayField() {
        return ABWayField;
    }

    public boolean isCDWayField() {
        return CDWayField;
    }

    public boolean isCBWayField() {
        return CBWayField;
    }
}