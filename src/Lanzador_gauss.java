public class Lanzador_gauss {

    public static void main(String[] args) {

        double[][] matriz = Defmatrizz.defmatriz();

        GaussJordan.eliminacionGaussJordan(matriz);

        double[] soluciones =
                GaussJordan.obtenerSoluciones(matriz);

        System.out.println("Matriz reducida:");

        for (double[] fila : matriz) {
            for (double valor : fila) {
                System.out.printf("%10.5f ", valor);
            }
            System.out.println();
        }

        System.out.println("Soluciones del sistema:");

        for (int i = 0; i < soluciones.length; i++) {
            System.out.printf(
                    "x%d = %.6f%n",
                    i + 1,
                    soluciones[i]
            );
        }
    }
}
