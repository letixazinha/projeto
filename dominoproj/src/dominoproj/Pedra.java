package dominoproj;

import java.util.Random;

public class Pedra {
    private int[] pontas = new int[2];

    void setPedra() {
        int[] nums = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i <= 1; i++) {
            Random rand = new Random();
            int n = rand.nextInt(5);
            pontas[i] = nums[n];
        }
    }

    public String getPedraFormatada() {
        return "[" + pontas[0] + ":" + pontas[1] + "]";
    }

    public String getPedraFormatadaInvertida() {
        return "[" + pontas[1] + ":" + pontas[0] + "]";
    }

    int getValorPedra() {
        int ponta1 = pontas[0];
        int ponta2 = pontas[1];
        int valorPedra;

        if (ponta1 == ponta2) {
            valorPedra = 2 * (ponta1 + ponta2);
        } else if (ponta1 != ponta2 && ponta1 % 2 != 0 && ponta2 % 2 != 0) {
            if (ponta1 > ponta2) {
                valorPedra = 2 * (ponta1) - ponta2;
            } else {
                valorPedra = 2 * (ponta2) - ponta1;
            }
        } else {
            valorPedra = ponta1 + ponta2;
        }
        return valorPedra;
    }
}