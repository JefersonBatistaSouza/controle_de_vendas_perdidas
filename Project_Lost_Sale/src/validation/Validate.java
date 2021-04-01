/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import javax.swing.JOptionPane;

/**
 *
 * @author temporario
 */
public class Validate {

    public static final Boolean validateString(String string, int max_length) {
        if (string.length() < max_length) {
            JOptionPane.showMessageDialog(null, "Error:(Quantidade Caracter) > Dados inválido", "OOOOPS!", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (string.matches("[A-Z]*")) {
            JOptionPane.showMessageDialog(null, "Error:(Apenas Letras) > Dados inválido", "OOOOPS!", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    public static final Boolean validateCode(int code) {
        try {
            if (code <= 0) {
                JOptionPane.showMessageDialog(null, "Error:(codigo <= 0) > Dados inválido", "OOOOPS!", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                return true;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error:(" + ex.getLocalizedMessage() + ") > Dados inválido", "OOOOPS!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
