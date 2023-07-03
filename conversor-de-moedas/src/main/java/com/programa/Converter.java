package com.programa;

import javax.swing.JOptionPane;

public class Converter {
    private static Object valor;

    public static Object getValor() {
        return valor;
    }

    public Object menu(Object option) {
        String[] Options = new String[] {
                "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes",
                "De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais",
                "De Yenes a Reais", "De Won Coreano a Reais"
        };

        Object[] possibleValues = { "Conversor de Moedas" };
        Object selectedOption = JOptionPane.showInputDialog(null,
                "Escolha uma opção:", "Conversor",
                JOptionPane.PLAIN_MESSAGE, null,
                possibleValues, possibleValues.length);
                return selectedOption;
    }

    public void informaValor() {

        valor = JOptionPane.showInputDialog(null, "Insira um valor para converter", "Escolhendo o valor",
                JOptionPane.PLAIN_MESSAGE, null, null, null);
    }

    public float realToDol(float real) {
        float valorEmDolar = 0.21f * real;
        return valorEmDolar;
    }

    public float realToEuro(float real) {
        float valorEmEuro = 0.19f * real;
        return valorEmEuro;
    }

    public float realToLibras(float real) {
        float valorEmLibras = 1.1f * real;
        return valorEmLibras;
    }

    public float realToYenes(float real) {
        float valorEmYene = 30.17f * real;
        return valorEmYene;
    }

    public float realToWonCorean(float real) {
        float valorEmWon = 271.83f * real;
        return valorEmWon;
    }

    //////////////

    public float dolToReal(float value) {
        float valorEmReal = value * 4.80f;
        return valorEmReal;
    }

    public float euroToReal(float value) {
        float valorEmReal = value * 5.23f;
        return valorEmReal;
    }

    public float libraToReal(float value) {
        float valorEmReal = value * 6.08f;
        return valorEmReal;
    }

    public float yeneToReal(float value) {
        float valorEmReal = value * 0.033f;
        return valorEmReal;
    }

    public float wonToReal(float value) {
        float valorEmReal = value * 0.0037f;
        return valorEmReal;
    }
}
