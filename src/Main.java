import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci passi: ");
        double passo = in.nextDouble();
        Contatore contaPasso = new Contatore(passo);
        contaPasso.setPasso(passo);

        System.out.print("Inserisci valore: ");
        double valore = in.nextDouble();
        Contatore contaValore = new Contatore(valore);
        contaValore.setValore(valore);

        contaPasso.visualizzaPassi();
        contaValore.visualizzavalore();
    }
}