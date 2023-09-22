package app2;

public class Masina {
    private String tip;
    private String culoare;
    private double viteza;

    public String getType() {
        return this.tip;
    }

    public String getColor() {
        return this.culoare;
    }

    public double getSpeed() {
        return this.viteza;
    }

    public void setType(String type) {
        this.tip = type;
    }

    public void setColor(String color) {
        this.culoare = color;
    }

    public void setSpeed(double speed) {
        this.viteza = speed;
    }

    public String toString() {
        return "Detalii masina:\n" + "culoare: " + this.culoare + "tip:" + this.tip + "speed:" + this.viteza;
    }

}
