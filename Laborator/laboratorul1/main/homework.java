package main;

public class homework {
    public static void main(String[] args) {
        int n = 0;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException nfe) {
            System.out.println("Argumentul dat trebuie sa fie de tip int.");
            System.exit(1);
        }

        // timpul in ms cand incepe rularea codului
        long startTime = System.currentTimeMillis();
        // initializare matrice
        int[][] matrice = new int[n][n];
        // pentru a sari prima rulare din bucla while
        int ultimulElement = n + 1;
        for (int i = 1; i <= n; i++) {
            int k = 0;
            int temp = ultimulElement;
            // afisez nr de la noul elem pana la 1
            while (temp <= n) {
                if (k < 3) {
                    matrice[k++][i - 1] = temp;
                }
                temp += 1;
            }

            // afisez nr de la 1 la ultimul element
            for (int j = 1; j < ultimulElement; j++)
                if (k < 3) {
                    matrice[k++][i - 1] = j;
                }
            ultimulElement -= 1;
        }

        // timpul in ms cand se termina rularea codului
        long endTime = System.currentTimeMillis();

        if (n <= 20) {
            for (int i = n - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(matrice[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            // timpul in ms dupa ce s-a terminat rularea
            float secunde = (endTime - startTime) / 1000F;
            float milisecunde = (endTime - startTime);
            System.out.println("Timpul de rulare: " + secunde + " s | " + milisecunde + " ms ");
        }
    }
}
