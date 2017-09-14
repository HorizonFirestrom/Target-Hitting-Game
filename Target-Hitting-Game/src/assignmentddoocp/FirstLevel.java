
package assignmentddoocp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FirstLevel extends JFrame {

    Timer t, t1, t2;
    JPanel left_panel;
    MyPanel mp;
    JLabel lbl_name, lbl_level, lbl_right_click, lbl_wrong_click, lbl_score, lbl_time_for, lbl_timer;
    ArrayList<Circle> list, list1, list2, list3, list4, list5, list6, list7, list8, list9;//arraylist
    int click = 0, miss_click = 0, right_click = 0;
    int i, j;
    int a, b, d;
    int number_of_click;
    int k;
    double p;
    
    //speed of the ball
           int speed1 =100; 
           int speed2 = 80;
           
           //function to get the time
    public void Counter(int s) {
        j = s;
        i = j * 60;
    }
//constructor of the Fist level
    public void FirstLevel(String name, String time, String level, String Col) {
// declaring and defining left panel where player stats are shown
        left_panel = new JPanel();
        left_panel.setBackground(Color.cyan);
        left_panel.setPreferredSize(new Dimension(200, 800));
        add(left_panel, BorderLayout.LINE_START);
        left_panel.setLayout(null);

        //second panel where graphics is moving.
        mp = new MyPanel();
        mp.setBackground(Color.GRAY);
        mp.setPreferredSize(new Dimension(600, 800));
        add(mp, BorderLayout.CENTER);

        lbl_name = new JLabel("Welcome" + name);
        lbl_name.setBounds(10, 10, 100, 30);
        left_panel.add(lbl_name);

        lbl_level = new JLabel("Level is:" + level);
        lbl_level.setBounds(10, 50, 100, 30);
        left_panel.add(lbl_level);

        lbl_name = new JLabel("Click the" + " " + Col + " " + "Color");
        lbl_name.setBounds(10, 100, 150, 30);
        left_panel.add(lbl_name);

        lbl_right_click = new JLabel();
        lbl_right_click.setBounds(10, 150, 100, 30);
        left_panel.add(lbl_right_click);

        lbl_wrong_click = new JLabel();
        lbl_wrong_click.setBounds(10, 200, 100, 30);
        left_panel.add(lbl_wrong_click);

        lbl_score = new JLabel();
        lbl_score.setBounds(10, 250, 100, 30);
        left_panel.add(lbl_score);

        lbl_time_for = new JLabel("Game for" + time + " " + "Minutes");
        lbl_time_for.setBounds(10, 300, 150, 30);
        left_panel.add(lbl_time_for);

        lbl_timer = new JLabel();
        lbl_timer.setBounds(10, 350, 100, 30);
        left_panel.add(lbl_timer);

        
        //arraylist
        list = new ArrayList<Circle>();
        list1 = new ArrayList<Circle>();
        list2 = new ArrayList<Circle>();
        list3 = new ArrayList<Circle>();
        list4 = new ArrayList<Circle>();
        list5 = new ArrayList<Circle>();
        list6 = new ArrayList<Circle>();
        list7 = new ArrayList<Circle>();
        list8 = new ArrayList<Circle>();
        list9 = new ArrayList<Circle>();
        //to  repaint the circle in the beginning.
        Random r = new Random();
        int lower = 20;
        int higher = 60;
        int i = (int) (Math.random() * (higher - lower)) + 20;
        int j = (int) (Math.random() * (higher - lower)) + 20;

        int i1 = (int) (Math.random() * (higher - lower)) + 20;
        int j1 = (int) (Math.random() * (higher - lower)) + 20;
        int i2 = (int) (Math.random() * (higher - lower)) + 20;
        int j2 = (int) (Math.random() * (higher - lower)) + 20;
        int i3 = (int) (Math.random() * (higher - lower)) + 20;
        int j3 = (int) (Math.random() * (higher - lower)) + 20;

        //random originating area
        int m = r.nextInt(700);
        int m1 = r.nextInt(700);
        int m2 = r.nextInt(700);
        int m3 = r.nextInt(700);
        int m4 = r.nextInt(700);
        int m5 = r.nextInt(700);
        int m6 = r.nextInt(700);

        Circle c = new Circle();
        c.circle(m, m1, i, j);
        list.add(c);

        Circle c1 = new Circle();
        c1.circle1(m1, m2, i1, j1);
        list1.add(c1);

        Circle c2 = new Circle();
        c2.circle2(m2, m3, i2, j2);
        list2.add(c2);

        Circle c3 = new Circle();
        c3.circle3(m3, m4, i3, j3);
        list3.add(c3);

        Circle c4 = new Circle();
        c4.circle4(m4, m5, i, j3);
        list4.add(c4);

        Circle c5 = new Circle();
        c5.circle5(m5, m6, i1, j3);
        list5.add(c5);

        Circle c6 = new Circle();
        c6.circle6(m6, m5, i3, j2);
        list6.add(c6);

        Circle c7 = new Circle();
        c7.circle7(m5, m4, i1, j);
        list7.add(c7);

        Circle c8 = new Circle();
        c8.circle8(m4, m3, i3, j);
        list8.add(c8);

        Circle c9 = new Circle();
        c9.circle9(m3, m2, i3, j3);
        list9.add(c9);

        t1 = new Timer(10000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                // to repaint the circle in the 10 sec of interval
                Random r = new Random();
                int lower = 20;
                int higher = 60;
                int i1 = (int) (Math.random() * (higher - lower)) + 20;
                int j1 = (int) (Math.random() * (higher - lower)) + 20;
                int i2 = (int) (Math.random() * (higher - lower)) + 20;
                int j2 = (int) (Math.random() * (higher - lower)) + 20;
                int i3 = (int) (Math.random() * (higher - lower)) + 20;
                int j3 = (int) (Math.random() * (higher - lower)) + 20;

                //random originating area
                int m = r.nextInt(700);
                int m1 = r.nextInt(700);
                int m2 = r.nextInt(700);
                int m3 = r.nextInt(700);
                int m4 = r.nextInt(700);
                int m5 = r.nextInt(700);
                int m6 = r.nextInt(700);

                Circle c = new Circle();
                c.circle(m, m1, i, j);
                list.add(c);

                Circle c1 = new Circle();
                c1.circle1(m1, m2, i1, j1);
                list1.add(c1);

                Circle c2 = new Circle();
                c2.circle2(m2, m3, i2, j2);
                list2.add(c2);

                Circle c3 = new Circle();
                c3.circle3(m3, m4, i3, j3);
                list3.add(c3);

                Circle c4 = new Circle();
                c4.circle4(m4, m5, i, j3);
                list4.add(c4);

                Circle c5 = new Circle();
                c5.circle5(m5, m6, i1, j3);
                list5.add(c5);

                Circle c6 = new Circle();
                c6.circle6(m6, m5, i3, j2);
                list6.add(c6);

                Circle c7 = new Circle();
                c7.circle7(m5, m4, i1, j);
                list7.add(c7);

                Circle c8 = new Circle();
                c8.circle8(m4, m3, i3, j);
                list8.add(c8);

                Circle c9 = new Circle();
                c9.circle9(m3, m2, i3, j3);
                list9.add(c9);

            }
        });
        t1.start();

        //timer which control the speed of the graphics 
        t2 = new Timer(speed1--, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                for (Circle c : list) {
                    c.move();
                }
                for (Circle c : list) {
                    c.ellipse.setFrame(c.x, c.y, c.w, c.h);

                }
                for (Circle c : list1) {
                    c.move();
                }
                for (Circle c : list1) {
                    c.ellipse1.setFrame(c.a, c.b, c.c, c.d);

                }

                for (Circle c : list2) {
                    c.move();
                }
                for (Circle c : list2) {
                    c.ellipse2.setFrame(c.a1, c.b1, c.c1, c.d1);

                }

                for (Circle c : list3) {
                    c.move();
                }
                for (Circle c : list3) {
                    c.ellipse3.setFrame(c.a2, c.b2, c.c2, c.d2);

                }

                for (Circle c : list4) {
                    c.move();
                }
                for (Circle c : list4) {
                    c.ellipse4.setFrame(c.a3, c.b3, c.c3, c.d3);

                }

                mp.repaint();
            }
        });
        t2.start();
// to generate 5 circle at the speed of 50
        t2 = new Timer(speed2--, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                for (Circle c : list5) {
                    c.move();
                }
                for (Circle c : list5) {
                    c.ellipse5.setFrame(c.a4, c.b4, c.c4, c.d4);

                }

                for (Circle c : list6) {
                    c.move();
                }
                for (Circle c : list6) {
                    c.ellipse6.setFrame(c.a5, c.b5, c.c5, c.d5);

                }

                for (Circle c : list7) {
                    c.move();
                }
                for (Circle c : list7) {
                    c.ellipse7.setFrame(c.a6, c.b6, c.c6, c.d6);

                }

                for (Circle c : list8) {
                    c.move();
                }
                for (Circle c : list8) {
                    c.ellipse8.setFrame(c.a7, c.b7, c.c7, c.d7);

                }

                for (Circle c : list9) {
                    c.move();
                }
                for (Circle c : list9) {
                    c.ellipse9.setFrame(c.a8, c.b8, c.c8, c.d8);

                }

                mp.repaint();
            }
        });
        t2.start();

        setTitle("Second screen");
        setSize(800, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        startTimer();
    }

    
    //MyPanel has in inheritance the property of the JPanel
    public class MyPanel extends JPanel implements MouseListener {

        public MyPanel() {
            addMouseListener(this);
        }

        public void paintComponent(Graphics g) {
            Graphics2D gd = (Graphics2D) g;
            super.paintComponent(g);
            for (Circle c : list) {
                gd.setColor(Color.RED);
                gd.fill(c.ellipse);
            }

            for (Circle c : list1) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse1);
            }

            for (Circle c : list2) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse2);
            }

            for (Circle c : list3) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse3);
            }

            for (Circle c : list4) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse4);
            }
            
            for (Circle c : list5) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse5);
            }

            for (Circle c : list6) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse6);
            }

            for (Circle c : list7) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse7);
            }

            for (Circle c : list8) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse8);
            }

            for (Circle c : list9) {
                gd.setColor(Color.RED);
                gd.fill(c.ellipse9);
            }

        }

        @Override
        public void mouseClicked(MouseEvent me) {
            int xcor = me.getX();
            int ycor = me.getY();
            boolean cli = false;
            for (Circle c : list) {
                if (c.ellipse.contains(xcor, ycor)) {
                    
                    Griding g = new Griding();
                    p = (double) k;
                    a = number_of_click + 8;
                    b = miss_click;
                    d = (click - miss_click);
                   number_of_click = (((j * 60) - i) / 10) * 8 ;
                    g.feedBack(a, right_click, d, p);

                  dispose();
                }
            }

            for (Circle c : list1) {
                if (c.ellipse1.contains(xcor, ycor)) {
                    click++;
                    cli = true;
                    list1.remove(c);
                    break;

                }
            }

            for (Circle c : list2) {
                if (c.ellipse2.contains(xcor, ycor)) {
                    click++;
                    cli = true;
                    list2.remove(c);
                    break;

                }
            }

            for (Circle c : list3) {
                if (c.ellipse3.contains(xcor, ycor)) {
                    click++;
                    cli = true;
                    list3.remove(c);
                    break;

                }
            }

            for (Circle c : list4) {
                if (c.ellipse4.contains(xcor, ycor)) {
                    click++;
                    cli = true;
                    list4.remove(c);
                    break;

                }
            }
            
            for (Circle c : list5) {
                if (c.ellipse5.contains(xcor, ycor)) {
                    click += 2;
                    cli = true;
                    list5.remove(c);
                    break;

                }
            }

            for (Circle c : list6) {
                if (c.ellipse6.contains(xcor, ycor)) {
                    click += 2;
                    cli = true;
                    list6.remove(c);
                    break;

                }
            }

            for (Circle c : list7) {
                if (c.ellipse7.contains(xcor, ycor)) {
                    click += 2;
                    cli = true;
                    list7.remove(c);
                    break;

                }
            }

            for (Circle c : list8) {
                if (c.ellipse8.contains(xcor, ycor)) {
                    click += 2;
                    cli = true;
                    list8.remove(c);
                    break;

                }
            }

            for (Circle c : list9) {
                if (c.ellipse9.contains(xcor, ycor)) {
                    
                    Griding g = new Griding();
                     p = (double) k;
                    a = number_of_click + 8;
                    b = miss_click;
                    d = (click - miss_click);
                    number_of_click = (((j * 60) - i) / 10) * 8 ;
                    g.feedBack(a, right_click, d, p);

                    dispose();

                }
            }
            

            if (cli) {
                right_click++;
                getToolkit().beep();
            } else {
                miss_click++;

            }
        }

        @Override
        public void mousePressed(MouseEvent me) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent me) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    public void startTimer() {
        ActionListener listener;
        listener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                i--;

                if (i > 0) {
                    lbl_timer.setText("" + i);
                    k = (j*60)-((j * 60) - i);
                    if (i % 10 == 0) {
                        number_of_click = (((j * 60) - i) / 10) * 8 + 8;  //logic for the no of click generated
                    }

                    p = (double) k;

                    lbl_right_click.setText("Right click is" + right_click);
                    lbl_wrong_click.setText("Miss click is:" + miss_click);
                    lbl_score.setText(" Score is:" + click);

                } else if (i <= 0) {
                    t.stop();
                    dispose();
                    Griding g = new Griding();

                    a = number_of_click;
                    b = miss_click;
                    d = (click - miss_click);
                   number_of_click = (((j * 60) - i) / 10) * 8 + 8;
                    g.feedBack(a, right_click, d, p);

                }
            }

        };
        t = new Timer(1000, listener);
        t.start();
    }
}
