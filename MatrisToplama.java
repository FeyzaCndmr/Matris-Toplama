import java.util.Scanner;

class Soru1 {
    public static void matrisYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        try {
            System.out.println("Matrislerin satır sayısını giriniz.");
            int satir = scnr.nextInt();
            System.out.println("Matrislerin sütun sayısını giriniz.");
            int sutun = scnr.nextInt();
            int[][] a = new int[satir][sutun];
            int[][] b = new int[satir][sutun];
            int[][] sonuc = new int[satir][sutun];
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    a[i][j] = (int) (Math.random() * 10) + 1;
                    b[i][j] = (int) (Math.random() * 10) + 1;
                }
            }
            matrisYazdir(a);
            System.out.println("--------------------------------");
            matrisYazdir(b);
            System.out.println("--------------------------------");
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    sonuc[i][j] = a[i][j] + b[i][j];

                }

            }
            matrisYazdir(sonuc);
        } finally {
            scnr.close();
        }

    }
}