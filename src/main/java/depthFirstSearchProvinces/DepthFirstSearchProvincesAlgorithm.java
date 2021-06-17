package depthFirstSearchProvinces;

public class DepthFirstSearchProvincesAlgorithm {

    // Fonction récursive de visite
    public static void dfs(int[][] M, int[] visited, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(M, visited, j);
            }
        }
    }

    public static int getProvinces(int[][] M) {
            int[] visited = new int[M.length];
            int count = 0;
            for (int i = 0; i < M.length; i++) {
                if (visited[i] == 0) {
                    dfs(M, visited, i);
                    // Fin de la récursion, fin la visite des villes de la province -> changement de ville
                    count++;
                }
            }
            return count;
        }
}

