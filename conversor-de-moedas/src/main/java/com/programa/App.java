package com.programa;

import javax.swing.JOptionPane;
import com.programa.Converter;

public class App {
    public static void main(String[] args) {

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

        if (selectedOption == "Conversor de Moedas") {

            Object typeConversion = JOptionPane.showInputDialog(null, "Agora escolha o tipo de conversão:",
                    "Conversor de Moedas", JOptionPane.PLAIN_MESSAGE, null, Options, Options.length);
            Converter conversion = new Converter();

            if (typeConversion == Options[0]) {
                conversion.informaValor();
                float realEmDolar = conversion.realToDol(Float.parseFloat((String) Converter.getValor()));

                
                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + realEmDolar, "Resultado da Conversão", JOptionPane.PLAIN_MESSAGE);
            }

            if (typeConversion == Options[1]) {
                conversion.informaValor();
                float realEmEuro = conversion.realToEuro(Float.parseFloat((String) Converter.getValor()));
                
                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + realEmEuro, "Resultado da Conversão", JOptionPane.PLAIN_MESSAGE);
            }

            if (typeConversion == Options[2]) {
                conversion.informaValor();
                float realEmLibras = conversion.realToLibras(Float.parseFloat((String) Converter.getValor()));
                
                JOptionPane.showMessageDialog(null, "Resultado da conversão: " + realEmLibras, "Resultado da Conversão", JOptionPane.PLAIN_MESSAGE);
            }


        }
    }
}
