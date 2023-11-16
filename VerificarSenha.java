package VerificarSenha;

import javax.swing.*;

public class VerificarSenha {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Dica: Eu gosto de numeros primos" +
                " uma sequencia que volta ao inicio , uma quantidade par seria divertido , 1 byte podendo ser o novo ideal");
        String senha = JOptionPane.showInputDialog("Digite a senha: ");
        int contador = 1;
        
        while (!senha.equals("123456") && contador <= 2) {
            JOptionPane.showMessageDialog(null, "Dica: Eu gosto de numeros primos" +
                    " uma sequencia que volta ao inicio , uma quantidade par seria divertido , 1 byte podendo ser o novo ideal");
            senha = JOptionPane.showInputDialog("Senha Incorreta, Tente novamente: \nTentativas Restantes: " + (3 - contador));
            contador++;
        }

        if (senha.equals("35711357")) {
            JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso Bloqueado (Senha Incorreta");
        }
    }
}
