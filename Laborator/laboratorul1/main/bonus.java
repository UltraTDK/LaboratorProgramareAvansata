package main;

public class bonus {
    public static void main(String args[]) {
        // numarul de varfuri
        int n = 4;
        // initializare matrice de adiacenta
        int[][] matrice_adj = new int[n][n];

        for (int i = 0; i < n; i++) {
            // conectez nodul curent la nodul urmator
            matrice_adj[i][(i + 1) % n] = 1;
            // conectez nodul precedent la nodul curent
            matrice_adj[(i + 1) % n][i] = 1;
        }

        for (int i = 0; i < matrice_adj.length; i++) {
            for (int j = 0; j < matrice_adj[0].length; j++) {
                System.out.print(matrice_adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}
