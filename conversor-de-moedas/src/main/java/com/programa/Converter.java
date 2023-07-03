package com.programa;

import javax.swing.JOptionPane;

public class Converter {

    private static Object valor;

    public static Object getValor() {
        return valor;
    }

    public void informaValor() {
        valor = JOptionPane.showInputDialog(null, "Insira um valor para converter", "Escolhendo o valor",
                JOptionPane.PLAIN_MESSAGE, null, null, null);
    }

    public float realToDol(float real) {
        float valorEmDolar = 4 * real;
        return valorEmDolar;
    }

    public float realToEuro(float real) {
        float valorEmEuro = 10 * real;
        return valorEmEuro;
    }

    public float realToLibras(float real) {
        float valorEmEuro = 20 * real;
        return valorEmEuro;
    }

   

}
