
package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author quist
 */
public class NorthPanel extends JPanel {
    
    JLabel lbl0 = new JLabel("");
    JLabel lbl1 = new JLabel("A");
    JLabel lbl2 = new JLabel("B");
    JLabel lbl3 = new JLabel("C");
    JLabel lbl4 = new JLabel("D");
    JLabel lbl5 = new JLabel("E");
    JLabel lbl6 = new JLabel("F");
    JLabel lbl7 = new JLabel("G");
    JLabel lbl8 = new JLabel("H");
    
    public NorthPanel(){
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setMaximumSize(new Dimension(WIDTH, 25));
        setMinimumSize(new Dimension(WIDTH, 25));
        setPreferredSize(new Dimension(WIDTH, 25));
        init();
    }
    
    private void init(){
        lbl0.setMaximumSize(new Dimension(70, 70));
        lbl1.setMaximumSize(new Dimension(80, 70));
        lbl2.setMaximumSize(new Dimension(80, 70));
        lbl3.setMaximumSize(new Dimension(80, 70));
        lbl4.setMaximumSize(new Dimension(80, 70));
        lbl5.setMaximumSize(new Dimension(80, 70));
        lbl6.setMaximumSize(new Dimension(80, 70));
        lbl7.setMaximumSize(new Dimension(80, 70));
        lbl8.setMaximumSize(new Dimension(40, 70));
        add(lbl0);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(lbl5);
        add(lbl6);
        add(lbl7);
        add(lbl8);
    }
}
