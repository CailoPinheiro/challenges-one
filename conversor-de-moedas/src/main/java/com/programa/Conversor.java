package com.programa;
import javax.swing.JOptionPane;

public class Conversor {
    public static void main(String[] args) {

        String[] Options = new String[] {
                "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes",
                "De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais",
                "De Yenes a Reais", "De Won Coreano a Reais"
        };

        Object[] possibleValues = { "Conversor de Moedas" };
        boolean restartProgram = true;

        do {
            Object selectedOption = JOptionPane.showInputDialog(null,
                    "Escolha uma opção:", "Conversor",
                    JOptionPane.PLAIN_MESSAGE, null,
                    possibleValues, possibleValues.length);

            if ("Conversor de Moedas".equals(selectedOption)) {

                Object typeConversion = JOptionPane.showInputDialog(null, "Agora escolha o tipo de conversão:",
                        "Conversor de Moedas", JOptionPane.PLAIN_MESSAGE, null, Options, Options.length);

                Converter conversion = new Converter();
                boolean isError = true;

                while (isError) {
                    try {
                        conversion.informaValor();
                        float valor = Float.parseFloat((String) Converter.getValor());

                        float resultado = 0;
                        String nomeMoeda = "reais";

                        if (Options[0].equals(typeConversion)) {
                            resultado = conversion.realToDol(valor);
                            nomeMoeda = "dólares";

                        } else if (Options[1].equals(typeConversion)) {
                            resultado = conversion.realToEuro(valor);
                            nomeMoeda = "euros";
                        }

                        else if (Options[2].equals(typeConversion)) {
                            resultado = conversion.realToLibras(valor);
                            nomeMoeda = "libras";
                        }

                        else if (Options[3].equals(typeConversion)) {
                            resultado = conversion.realToYenes(valor);
                            nomeMoeda = "yenes";
                        }

                        else if (Options[4].equals(typeConversion)) {
                            resultado = conversion.realToWonCorean(valor);
                            nomeMoeda = "wons";
                        }

                        if (Options[5].equals(typeConversion)) {
                            resultado = conversion.dolToReal(valor);

                        } else if (Options[6].equals(typeConversion)) {
                            resultado = conversion.euroToReal(valor);
                        }

                        else if (Options[7].equals(typeConversion)) {
                            resultado = conversion.libraToReal(valor);
                        }

                        else if (Options[8].equals(typeConversion)) {
                            resultado = conversion.yeneToReal(valor);
                        }

                        else if (Options[9].equals(typeConversion)) {
                            resultado = conversion.wonToReal(valor);
                        }

                        JOptionPane.showMessageDialog(null,
                                "O valor da conversão é de R$: " + resultado + " " + nomeMoeda,
                                "Resultado da Conversão", JOptionPane.PLAIN_MESSAGE);
                        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Selecione uma opção.",
                                1, JOptionPane.YES_NO_CANCEL_OPTION, null);

                        switch (resposta) {
                            case 0:
                                break;
                            case 1:
                                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                                restartProgram = false;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Programa Concluído");
                                restartProgram = false;
                                break;
                        }

                        isError = false;
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Valor inválido. Por favor, insira um número válido.",
                                "Erro",
                                JOptionPane.ERROR_MESSAGE);
                        isError = true;
                    }
                }
            } else {
                restartProgram = false;
            }
        } while (restartProgram);
    }
}
