/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Osvaldo Francisco Barrantes Paniagua
 */
public class WestPanel extends JPanel {
    JLabel lbl1 = new JLabel("1");
    JLabel lbl2 = new JLabel("2");
    JLabel lbl3 = new JLabel("3");
    JLabel lbl4 = new JLabel("4");
    JLabel lbl5 = new JLabel("5");
    JLabel lbl6 = new JLabel("6");
    JLabel lbl7 = new JLabel("7");
    JLabel lbl8 = new JLabel("8");
    
    public WestPanel () {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setMaximumSize(new Dimension(25, HEIGHT));
        setMinimumSize(new Dimension(25, HEIGHT));
        setPreferredSize(new Dimension(25, HEIGHT));
        init();
    }
    
    private void init() {
        lbl1.setMaximumSize(new Dimension(50, 70));
        lbl2.setMaximumSize(new Dimension(50, 70));
        lbl3.setMaximumSize(new Dimension(50, 70));
        lbl4.setMaximumSize(new Dimension(50, 70));
        lbl5.setMaximumSize(new Dimension(50, 70));
        lbl6.setMaximumSize(new Dimension(50, 70));
        lbl7.setMaximumSize(new Dimension(50, 70));
        lbl8.setMaximumSize(new Dimension(50, 70));
        lbl1.setHorizontalAlignment(0);
        lbl2.setHorizontalAlignment(0);
        lbl3.setHorizontalAlignment(0);
        lbl4.setHorizontalAlignment(0);
        lbl5.setHorizontalAlignment(0);
        lbl6.setHorizontalAlignment(0);
        lbl7.setHorizontalAlignment(0);
        lbl8.setHorizontalAlignment(0);
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
