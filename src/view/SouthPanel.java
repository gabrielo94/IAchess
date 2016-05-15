
package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Osvaldo Francisco Barrantes Paniagua
 */
public class SouthPanel extends JPanel {
    
    JLabel lblSuggest = new JLabel("Cargando movimientos...");
    public SouthPanel(){
        init();
    }
    
    private void init(){
        add(lblSuggest);
    }
    public void changesugest(String text, int heuristica,String busqueda){
        lblSuggest.setText("Sugerencia: " + text+ "\n "+"La heuristica es: "+heuristica+"\n "+"Tipo de busqueda: "+busqueda);
    }
}
