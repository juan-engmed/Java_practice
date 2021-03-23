/** 
 Mostrar Idioma do Sistema
 **/
package idiomaatual;

import java.util.Locale;

/**
 *
 * @author Juaneng
 */
public class IdiomaAtual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Locale loc = Locale.getDefault();
        System.out.println("O idioma do seu computador é:");
        System.out.println(loc.getDisplayLanguage());
       
    }
    
}
