public class GaussJordan {

    public static void eliminacionGaussJordan(double[][] matriz) {
        int n = matriz.length;

        // Paso 1: reutilizar la triangulación superior de Gauss.
        Gauss.eliminacionGaussiana(matriz);

        // Paso 2: normalizar pivotes y eliminar coeficientes superiores.
        for (int i = n - 1; i >= 0; i--) {

            double pivote = matriz[i][i];

            if (Math.abs(pivote) < 1e-12) {
                throw new IllegalArgumentException(
                        "Sistema singular: pivote cero en la fila "
                                + (i + 1)
                );
            }

            // Convertir el pivote en 1.
            for (int k = 0; k <= n; k++) {
                matriz[i][k] /= pivote;
            }

            // Eliminar los coeficientes situados arriba del pivote.
            for (int j = i - 1; j >= 0; j--) {
                double factor = matriz[j][i];

                for (int k = 0; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }

    // Paso 3: leer directamente las soluciones.
    public static double[] obtenerSoluciones(double[][] matriz) {
        int n = matriz.length;
        double[] soluciones = new double[n];

        for (int i = 0; i < n; i++) {
            soluciones[i] = matriz[i][n];
        }

        return soluciones;
    }
}
