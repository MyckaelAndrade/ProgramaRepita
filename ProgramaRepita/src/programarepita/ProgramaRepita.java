package programarepita;

import javax.swing.JOptionPane;

/**
 * @since 12/11/2023
 * @author myckazs
 */
public class ProgramaRepita {

    public static void main(String[] args) {
        float j, n = 0, c = -1, p = -1, i = 0, m,h=0;
        do {
            j = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html> Digite um numero: <br> <i> 0 para <i><html>"));
            n += j;
            c++;
            if(j%2==0){
                p++;
            }else{
                i++;
            }
            if(j>=100){
                h++;
            }
        } while (j != 0);
        m = n/c;
        JOptionPane.showMessageDialog(null,
                "<html> === Resultado final === <br> <hr> "
                + "<br> <i> Total de Valores: <i>" + c +"<br> <i> Soma: <i>" + n +"<br> <i>Média dos Valores: <i>" + m + "<br> <i> Pares: <i>" + p + "<br> <i> Impares: <i>" + i + "<br> <i> Cem ou acima: <i><html>" + h);

    }

}
