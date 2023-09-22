package app2;

public class ContBancar {

    private double sold = 0.0;

    public ContBancar(double sold) {
        this.sold = sold;
    }

    public void depozitareSuma(double suma) {
        this.sold += suma;
        System.out.println("Ati depozitat suma de" + suma + "\nSold:" + this.sold + "\n");
    }

    public boolean retragereSuma(double suma) {
        if (suma != 0) {
            boolean succes = this.sold - suma >= 0;
            if (succes) {
                this.sold -= suma;
                System.out.println("Ati retras" + suma);
            }

            return succes;
        }
        System.out.println("Input gresit");
        return false;
    }

    public double interogareSold() {
        return this.sold;
    }

    @Override
    public String toString() {
        return "Account info\n" + "Sold:" + this.sold;
    }
}
