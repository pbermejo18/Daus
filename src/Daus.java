import java.util.Scanner;


public class Daus {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n = scanner.nextInt();
        int dau1 = 0;
        int dau2 = 0;

        int[] frecuencia = new int[11];


        for (int i = 0; i < n; i++) {
            dau1 = (int) (Math.random()*6 + 1);
            dau2 = (int) (Math.random()*6 + 1);
            int sumdau = dau1 + dau2;
            frecuencia[sumdau-2] ++;
        }
        int j = 2;
        for (int i = 0; i < frecuencia.length; i++) {
            System.out.print(j);
            System.out.print(" --> ");
            System.out.print(frecuencia[i]);
            System.out.println(" vegades");
            j ++;
        }
    }
}