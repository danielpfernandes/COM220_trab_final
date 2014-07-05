/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main.publicacao;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class LimitePublicacao {
     public String[] montaForm() {
        String aDadosForm[] = new String[2];
        aDadosForm[0] = JOptionPane.showInputDialog("Digite o codigo da publicacao");
        aDadosForm[1] = JOptionPane.showInputDialog("Digite o titulo da publicacao");
        return aDadosForm;
    }
}
