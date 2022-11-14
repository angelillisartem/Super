public class Contatore {
    private double passo;
    private double valore;

    public Contatore(double passo) {
        this.passo = passo;
        this.valore = valore;
    }
    public double getPasso() {
        return passo;
    }
    public double getValore() {
        return valore;
    }
    public void setPasso(double passo) {
        this.passo = passo;
    }
    public void setValore(double valore) {
        this.valore = valore;
    }
    public double contatore (double x, double y) {
        passo = x;
        valore = y;
        for (int i = 0; i >= x; i++) {
            y += 1;
        }
        return 0;
    }
    public void visualizzaPassi() {
        System.out.print("\nPassi: " + getPasso());
    }
    public void visualizzavalore() {
        System.out.print("\nValore: " + getValore());
    }
}
