
package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Osvaldo Francisco Barrantes Paniagua
 */
public class SouthPanel extends JPanel {
    
    JLabel lblSuggest = new JLabel("Sugerencia: ");
    public SouthPanel(){
        init();
    }
    
    private void init(){
        add(lblSuggest);
    }
    public void changesugest(String text){
        lblSuggest.setText("Sugerencia: " + text);
    }
}
