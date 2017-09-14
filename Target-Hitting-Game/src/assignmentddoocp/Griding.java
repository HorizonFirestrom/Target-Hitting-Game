/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentddoocp;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Griding extends JFrame {

    JLabel lbl_score_Bord, lbl_total_click, lbl_target_clicked, scorw;

    public void feedBack(int a, int b, int c,double d) {
        lbl_score_Bord = new JLabel("Thanks for playing");
        add(lbl_score_Bord);
        lbl_score_Bord.setBounds(220, 10, 150, 50);

        lbl_total_click = new JLabel("Total Click Generated" + " " + a);
        add(lbl_total_click);
        lbl_total_click.setBounds(210, 100, 250, 50);

        lbl_target_clicked = new JLabel("Number of Click landed on target" + " " + b);
        add(lbl_target_clicked);
        lbl_target_clicked.setBounds(180, 200, 350, 50);

        scorw = new JLabel("Average score is " + " " + (double)c/a);
        add(scorw);
        scorw.setBounds(200, 300, 150, 50);
        
         scorw = new JLabel("You Clicked non clickable graphics before " + " " + d + "Seconds");
        add(scorw);
        scorw.setBounds(150, 350, 350, 50);
        setTitle("Thanks for Playing");
        setLayout(null);
        setSize(800, 700);
        setVisible(true);

    }

    

}
