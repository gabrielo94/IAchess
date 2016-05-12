
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author quist
 */
public class NavigationPanel extends JPanel {
    JLabel newGameBtn = new JLabel("Sugerencia: ");
    public NavigationPanel(){
        init();
    }
    
    private void init(){
        
        //JButton regretBtn = new JButton("Regret move");
        add(newGameBtn);
        //add(regretBtn);
    }
    public void changesugest(String text){
        newGameBtn.setText("Sugerencia: "+text);
    }
}
