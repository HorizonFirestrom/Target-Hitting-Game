package assignmentddoocp;

/**
 *
 * @author imran
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class FinalAssignment extends JFrame {

    JLabel lbl_name_of_Player, lbl_level, lbl_time, lbl_clickable, lbl_color;
    JTextField txt_name, txt_time;
    JButton btn_start, btn_End;
    JComboBox<String> box_level, box_color;
    JScrollBar sb;

    public FinalAssignment() {
        try{
        //creating label for the name
        lbl_name_of_Player = new JLabel(" Enter the Name of player");
        add(lbl_name_of_Player);
        lbl_name_of_Player.setBounds(10, 10, 200, 40);
        //creating label for the level
        lbl_level = new JLabel("Difficulties");
        add(lbl_level);
        lbl_level.setBounds(10, 70, 100, 40);
//creating label for time
        lbl_time = new JLabel("Time");
        add(lbl_time);
        lbl_time.setBounds(10, 120, 100, 40);
//creating labelfor clicking target
        lbl_clickable = new JLabel("Clickable Target");
        add(lbl_clickable);
        lbl_clickable.setBounds(10, 190, 100, 40);
//creating label for colors 
        lbl_color = new JLabel("Colors");
        add(lbl_color);
        lbl_color.setBounds(290, 190, 50, 40);
//creating textfield where we provide the name
        txt_name = new JTextField();
        add(txt_name);
        txt_name.setBounds(200, 10, 100, 30);
// creating the textfield where we provide the time
        txt_time = new JTextField();
        add(txt_time);
        txt_time.setBounds(200, 120, 100, 60);
        txt_time.setEditable(false);

        //creating combobox for the level
        box_level = new JComboBox<>();
        box_level.addItem("Easy");
        box_level.addItem("Medium");
        box_level.addItem("Hard");
        add(box_level);
        box_level.setBounds(200, 70, 100, 40);

        //creating combocox for the color
        box_color = new JComboBox<>();
        box_color.addItem("GREEN");
        box_color.addItem("BLUE");
        box_color.addItem("YELLOW");
        box_color.addItem("WHITE");
        add(box_color);
        box_color.setBounds(200, 190, 80, 40);

        //creating the start button
        btn_start = new JButton("START");
        add(btn_start);
        btn_start.setBounds(50, 300, 100, 40);
        btn_start.addActionListener(new EventButton());

        //creating the end button
        btn_End = new JButton("END");
        add(btn_End);
        btn_End.setBounds(250, 300, 100, 40);
        btn_End.addActionListener(new ClosingWindow());

        //creating the scrollbar to enter the time
        sb = new JScrollBar();
        add(sb);
        sb.setOrientation(JScrollBar.VERTICAL);

        sb.setBounds(300, 120, 35, 50);
        sb.setMaximum(100);
        sb.setMinimum(0);

        sb.addAdjustmentListener(new Adjustment());

        setTitle("First Frame");
        setLayout(null);

        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        }catch(Exception ex){
            System.out.println("Error: "+ ex.getMessage());
        }
    }
//class to get the value in the text field of time by scrolling.

    public class Adjustment implements AdjustmentListener {

        public void adjustmentValueChanged(AdjustmentEvent ae) {
            txt_time.setText("" + sb.getValue());
        }
    }
// function to close the window if End button is clicked

    private class ClosingWindow implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            System.exit(0);
        }

    }

    //class that proform the activities when the start button is clicked.
    private class EventButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("START")) {
                dispose();

                if (box_level.getSelectedItem() == "Easy") {
                    FirstLevel sl = new FirstLevel();

                    sl.FirstLevel(" " + txt_name.getText(), "" + txt_time.getText(), "" + box_level.getSelectedItem(), "" + box_color.getSelectedItem());
                    int a = 0;
                    a = Integer.parseInt("" + txt_time.getText());
                    sl.Counter(a);

                }
                //if this condition is true then secon lavel is called
                if (box_level.getSelectedItem() == "Medium") {
                    SecondLevel sl = new SecondLevel();

                    sl.SecondLevel(" " + txt_name.getText(), "" + txt_time.getText(), "" + box_level.getSelectedItem(), "" + box_color.getSelectedItem());

                    int a = 0;
                    a = Integer.parseInt("" + txt_time.getText());
                    sl.Counter(a);
                }
                // if this condition is satisfied then the third level is called. 
                if (box_level.getSelectedItem() == "Hard") {
                    ThirdLevel tl = new ThirdLevel();

                    tl.ThirdLevel(" " + txt_name.getText(), "" + txt_time.getText(), "" + box_level.getSelectedItem(), "" + box_color.getSelectedItem());

                    int a = 0;
                    a = Integer.parseInt("" + txt_time.getText());
                    tl.Counter(a);
                }

            }
        }
    }

    public static void main(String[] args) {

        FinalAssignment gs = new FinalAssignment();
    }

}
