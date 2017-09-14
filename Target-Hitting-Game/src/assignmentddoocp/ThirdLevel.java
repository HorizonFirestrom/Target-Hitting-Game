/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class ThirdLevel extends JFrame {

    Timer t, t1, t2;
    JPanel left_panel;
    MyPanel mp;
    JLabel lbl_name, lbl_level, lbl_right_click, lbl_wrong_click, lbl_score, lbl_time_for, lbl_timer;
    ArrayList<Circle2> list, list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, list16, list17, list18, list19;
    int click = 0, miss_click = 0, right_click = 0;
    int number_of_click;
    int k;
    double p;
    int i, j;
    int a, b, d;

   // for ramdom speed variable
     int speed1 =100; 
           int speed2 = 90;
            int speed3 =80; 
           int speed4 = 70;
           
    
    public void Counter(int s) {
        j = s;
        i = j * 60;
    }

    public void ThirdLevel(String name, String time, String level, String Col) {

        left_panel = new JPanel();
        left_panel.setBackground(Color.cyan);
        left_panel.setPreferredSize(new Dimension(200, 700));
        add(left_panel, BorderLayout.LINE_START);
        left_panel.setLayout(null);

        mp = new MyPanel();
        mp.setBackground(Color.GRAY);
        mp.setPreferredSize(new Dimension(600, 700));
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

        list = new ArrayList<Circle2>();
        list1 = new ArrayList<Circle2>();
        list2 = new ArrayList<Circle2>();
        list3 = new ArrayList<Circle2>();
        list4 = new ArrayList<Circle2>();
        list5 = new ArrayList<Circle2>();
        list6 = new ArrayList<Circle2>();
        list7 = new ArrayList<Circle2>();
        list8 = new ArrayList<Circle2>();
        list9 = new ArrayList<Circle2>();
        list10 = new ArrayList<Circle2>();
        list11 = new ArrayList<Circle2>();
        list12 = new ArrayList<Circle2>();
        list13 = new ArrayList<Circle2>();
        list14 = new ArrayList<Circle2>();
        list15 = new ArrayList<Circle2>();
        list16 = new ArrayList<Circle2>();
        list17 = new ArrayList<Circle2>();
        list18 = new ArrayList<Circle2>();
        list19 = new ArrayList<Circle2>();
        Random r = new Random();
        int lower = 20;
        int higher = 60;
        //random sizes
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

        Circle2 c = new Circle2();
        c.circle(r.nextInt(900), r.nextInt(950), i, j);
        list.add(c);

        Circle2 c1 = new Circle2();
        c1.circle1(m1, m2, i, j);
        list1.add(c1);

        Circle2 c2 = new Circle2();
        c2.circle2(m3, m4, i1, j1);
        list2.add(c2);

        Circle2 c3 = new Circle2();
        c3.circle3(m5, m6, i3, j1);
        list3.add(c3);

        Circle2 c4 = new Circle2();
        c4.circle4(m2, m, i2, j1);
        list4.add(c4);

        Circle2 c5 = new Circle2();
        c5.circle5(m3, m1, i3, j2);
        list5.add(c5);

        Circle2 c6 = new Circle2();
        c6.circle6(m4, m5, i1, j3);
        list6.add(c6);

        Circle2 c7 = new Circle2();
        c7.circle7(m6, m1, j, i);
        list7.add(c7);

        Circle2 c8 = new Circle2();
        c8.circle8(m1, m1, j1, i2);
        list8.add(c8);

        Circle2 c9 = new Circle2();
        c9.circle9(m3, m3, j3, i1);
        list9.add(c9);

        Circle2 c10 = new Circle2();
        c10.circle10(m4, m4, i3, j);
        list10.add(c10);

        Circle2 c11 = new Circle2();
        c11.circle11(m4, m2, i, j3);
        list11.add(c11);

        Circle2 c12 = new Circle2();
        c12.circle12(m4, m, j, i);
        list12.add(c12);

        Circle2 c13 = new Circle2();
        c13.circle13(m6, m4, j3, j2);
        list13.add(c13);

        Circle2 c14 = new Circle2();
        c14.circle14(m5, m4, j, j);
        list14.add(c14);

        //
        Circle2 c15 = new Circle2();
        c15.circle15(m1, m3, i, j);
        list15.add(c15);

        Circle2 c16 = new Circle2();
        c16.circle16(m2, m4, j2, j);
        list16.add(c16);

        Circle2 c17 = new Circle2();
        c17.circle17(m5, m5, j, j3);
        list17.add(c17);

        Circle2 c18 = new Circle2();
        c18.circle18(m1, m4, i, j3);
        list18.add(c18);

        Circle2 c19 = new Circle2();
        c19.circle19(m3, m6, j2, j1);
        list19.add(c19);

        t1 = new Timer(10000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                Random r = new Random();
                int lower = 20;
                int higher = 60;
                //random sizes
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

                Circle2 c = new Circle2();
                c.circle(r.nextInt(800), r.nextInt(650), i, j);
                list.add(c);

                Circle2 c1 = new Circle2();
                c1.circle1(m1, m2, i, j);
                list1.add(c1);

                Circle2 c2 = new Circle2();
                c2.circle2(m3, m4, i1, j1);
                list2.add(c2);

                Circle2 c3 = new Circle2();
                c3.circle3(m5, m6, i3, j1);
                list3.add(c3);

                Circle2 c4 = new Circle2();
                c4.circle4(m2, m, i2, j1);
                list4.add(c4);

                Circle2 c5 = new Circle2();
                c5.circle5(m3, m1, i3, j2);
                list5.add(c5);

                Circle2 c6 = new Circle2();
                c6.circle6(m4, m5, i1, j3);
                list6.add(c6);

                Circle2 c7 = new Circle2();
                c7.circle7(m6, m1, j, i);
                list7.add(c7);

                Circle2 c8 = new Circle2();
                c8.circle8(m1, m1, j1, i2);
                list8.add(c8);

                Circle2 c9 = new Circle2();
                c9.circle9(m3, m3, j3, i1);
                list9.add(c9);

                //
                Circle2 c10 = new Circle2();
                c10.circle10(m4, m4, i3, j);
                list10.add(c10);

                Circle2 c11 = new Circle2();
                c11.circle11(m4, m2, i, j3);
                list11.add(c11);

                Circle2 c12 = new Circle2();
                c12.circle12(m4, m, j, i);
                list12.add(c12);

                Circle2 c13 = new Circle2();
                c13.circle13(m6, m4, j3, j2);
                list13.add(c13);

                Circle2 c14 = new Circle2();
                c14.circle14(m5, m4, i, j2);
                list14.add(c14);
                //
                Circle2 c15 = new Circle2();
                c15.circle15(m5, m1, i, j);
                list15.add(c15);

                Circle2 c16 = new Circle2();
                c16.circle16(m2, m4, j2, j);
                list16.add(c16);

                Circle2 c17 = new Circle2();
                c17.circle17(m5, m3, j3, j);
                list17.add(c17);

                Circle2 c18 = new Circle2();
                c18.circle18(m2, m5, j3, j);
                list18.add(c18);

                Circle2 c19 = new Circle2();
                c19.circle14(m5, m4, j3, i);
                list14.add(c19);

            }
        });
        t1.start();
//to generate the circle with speed 100
        t2 = new Timer(speed1--, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                for (Circle2 c : list) {
                    c.move();
                }
                for (Circle2 c : list) {
                    c.ellipse.setFrame(c.x, c.y, c.w, c.h);

                }
                for (Circle2 c : list1) {
                    c.move();
                }
                for (Circle2 c : list1) {
                    c.ellipse1.setFrame(c.a, c.b, c.c, c.d);

                }

                for (Circle2 c : list2) {
                    c.move();
                }
                for (Circle2 c : list2) {
                    c.ellipse2.setFrame(c.a1, c.b1, c.c1, c.d1);

                }

                for (Circle2 c : list3) {
                    c.move();
                }
                for (Circle2 c : list3) {
                    c.ellipse3.setFrame(c.a2, c.b2, c.c2, c.d2);

                }

                for (Circle2 c : list4) {
                    c.move();
                }
                for (Circle2 c : list4) {
                    c.ellipse4.setFrame(c.a3, c.b3, c.c3, c.d3);

                }

                mp.repaint();
            }
        });
        t2.start();

        //to generate the circle with speed 90
        t2 = new Timer(speed2--, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                for (Circle2 c : list5) {
                    c.move();
                }
                for (Circle2 c : list5) {
                    c.ellipse5.setFrame(c.a4, c.b4, c.c4, c.d4);

                }

                for (Circle2 c : list6) {
                    c.move();
                }
                for (Circle2 c : list6) {
                    c.ellipse6.setFrame(c.a5, c.b5, c.c5, c.d5);

                }

                for (Circle2 c : list7) {
                    c.move();
                }
                for (Circle2 c : list7) {
                    c.ellipse7.setFrame(c.a6, c.b6, c.c6, c.d6);

                }

                for (Circle2 c : list8) {
                    c.move();
                }
                for (Circle2 c : list8) {
                    c.ellipse8.setFrame(c.a7, c.b7, c.c7, c.d7);

                }

                for (Circle2 c : list9) {
                    c.move();
                }
                for (Circle2 c : list9) {
                    c.ellipse9.setFrame(c.a8, c.b8, c.c8, c.d8);

                }

                mp.repaint();
            }
        });
        t2.start();
        // to generate the circle with speed of 80
        t2 = new Timer(speed3--, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                for (Circle2 c : list10) {
                    c.move();
                }
                for (Circle2 c : list10) {
                    c.ellipse10.setFrame(c.a9, c.b9, c.c9, c.d9);

                }
                for (Circle2 c : list11) {
                    c.move();
                }
                for (Circle2 c : list11) {
                    c.ellipse11.setFrame(c.a10, c.b10, c.c10, c.d10);

                }
                for (Circle2 c : list12) {
                    c.move();
                }
                for (Circle2 c : list12) {
                    c.ellipse12.setFrame(c.a11, c.b11, c.c11, c.d11);

                }
                for (Circle2 c : list13) {
                    c.move();
                }
                for (Circle2 c : list13) {
                    c.ellipse13.setFrame(c.a12, c.b12, c.c12, c.d12);

                }
                for (Circle2 c : list14) {
                    c.move();
                }
                for (Circle2 c : list14) {
                    c.ellipse14.setFrame(c.a13, c.b13, c.c13, c.d13);

                }

                mp.repaint();
            }
        });
        t2.start();

        //
        t2 = new Timer(speed4--, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                for (Circle2 c : list15) {
                    c.move();
                }
                for (Circle2 c : list15) {
                    c.ellipse15.setFrame(c.a14, c.b14, c.c14, c.d14);

                }
                for (Circle2 c : list16) {
                    c.move();
                }
                for (Circle2 c : list16) {
                    c.ellipse16.setFrame(c.a15, c.b15, c.c15, c.d15);

                }
                for (Circle2 c : list17) {
                    c.move();
                }
                for (Circle2 c : list17) {
                    c.ellipse17.setFrame(c.a16, c.b16, c.c16, c.d16);

                }
                for (Circle2 c : list18) {
                    c.move();
                }
                for (Circle2 c : list18) {
                    c.ellipse18.setFrame(c.a17, c.b17, c.c17, c.d17);

                }
                for (Circle2 c : list19) {
                    c.move();
                }
                for (Circle2 c : list19) {
                    c.ellipse19.setFrame(c.a18, c.b18, c.c18, c.d18);

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

    public class MyPanel extends JPanel implements MouseListener {

        public MyPanel() {
            addMouseListener(this);
        }

        public void paintComponent(Graphics g) {
            Graphics2D gd = (Graphics2D) g;
            super.paintComponent(g);
            for (Circle2 c : list) {
                gd.setColor(Color.RED);
                gd.fill(c.ellipse);
            }

            for (Circle2 c : list1) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse1);
            }

            for (Circle2 c : list2) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse2);
            }

            for (Circle2 c : list3) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse3);
            }

            for (Circle2 c : list4) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse4);
            }

            for (Circle2 c : list5) {
                gd.setColor(Color.RED);
                gd.fill(c.ellipse5);
            }

            for (Circle2 c : list6) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse6);
            }

            for (Circle2 c : list7) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse7);
            }

            for (Circle2 c : list8) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse8);
            }

            for (Circle2 c : list9) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse9);
            }

            for (Circle2 c : list10) {
                gd.setColor(Color.RED);
                gd.fill(c.ellipse10);
            }

            for (Circle2 c : list11) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse11);
            }

            for (Circle2 c : list12) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse12);
            }

            for (Circle2 c : list13) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse13);
            }

                   for (Circle2 c : list14) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse14);
            }
            
             for (Circle2 c : list15) {
                gd.setColor(Color.RED);
                gd.fill(c.ellipse15);
            }
             
              for (Circle2 c : list16) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse16);
            }
              
               for (Circle2 c : list17) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse17);
            }

                for (Circle2 c : list18) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse18);
            }
                
                 for (Circle2 c : list19) {
                gd.setColor(Color.GREEN);
                gd.fill(c.ellipse19);
            }
        }

        @Override
        public void mouseClicked(MouseEvent me) {
            int xcor = me.getX();
            int ycor = me.getY();
            boolean cli = false;
            for (Circle2 c : list) {
                if (c.ellipse.contains(xcor, ycor)) {
                    dispose();
                    Griding g = new Griding();
                     p = (double) k;
                    a = number_of_click +16;
                    b = miss_click;
                    d = (click - miss_click);
                    number_of_click = (((j * 60) - k) / 10) * 16 ;
                    g.feedBack(a, right_click, d, p);
                    dispose();
                    
                }
            }

            for (Circle2 c : list1) {
                if (c.ellipse1.contains(xcor, ycor)) {
                    click++;
                    cli = true;
                    list1.remove(c);
                    break;

                }
            }

            for (Circle2 c : list2) {
                if (c.ellipse2.contains(xcor, ycor)) {
                    click++;
                    cli = true;
                    list2.remove(c);
                    break;

                }
            }

            for (Circle2 c : list3) {
                if (c.ellipse3.contains(xcor, ycor)) {
                    click++;
                    cli = true;
                    list3.remove(c);
                    break;

                }
            }

            for (Circle2 c : list4) {
                if (c.ellipse4.contains(xcor, ycor)) {
                    click++;
                    cli = true;
                    list4.remove(c);
                    break;

                }
            }
            //
            for (Circle2 c : list5) {
                if (c.ellipse5.contains(xcor, ycor)) {
                    Griding g = new Griding();
                     p = (double) k;
                    a = number_of_click +16;
                    b = miss_click;
                    d = (click - miss_click);
                     number_of_click = (((j * 60) - k) / 10) * 16 ;
                    g.feedBack(a, right_click, d, p);

                    dispose();
                }
            }

            for (Circle2 c : list6) {
                if (c.ellipse6.contains(xcor, ycor)) {
                    click += 2;
                    cli = true;
                    list6.remove(c);
                    break;

                }
            }

            for (Circle2 c : list7) {
                if (c.ellipse7.contains(xcor, ycor)) {
                    click += 2;
                    cli = true;
                    list7.remove(c);
                    break;

                }
            }

            for (Circle2 c : list8) {
                if (c.ellipse8.contains(xcor, ycor)) {
                    click += 2;
                    cli = true;
                    list8.remove(c);
                    break;

                }
            }

            for (Circle2 c : list9) {
                if (c.ellipse9.contains(xcor, ycor)) {
                    click += 2;
                    cli = true;
                    list9.remove(c);
                    break;

                }
            }
                 //

            for (Circle2 c : list10) {
                if (c.ellipse10.contains(xcor, ycor)) {
                    Griding g = new Griding();
                     p = (double) k;
                    a = number_of_click +16;
                    b = miss_click;
                    d = (click - miss_click);
                    number_of_click = (((j * 60) - k) / 10) * 16;
                    g.feedBack(a, right_click, d, p);
                dispose();
                    
                }
            }
            for (Circle2 c : list11) {
                if (c.ellipse11.contains(xcor, ycor)) {
                    click += 3;
                    cli = true;
                    list11.remove(c);
                    break;

                }
            }
            for (Circle2 c : list12) {
                if (c.ellipse12.contains(xcor, ycor)) {
                    click += 3;
                    cli = true;
                    list12.remove(c);
                    break;

                }
            }
            for (Circle2 c : list13) {
                if (c.ellipse13.contains(xcor, ycor)) {
                    click += 3;
                    cli = true;
                    list13.remove(c);
                    break;

                }
            }
            for (Circle2 c : list14) {
                if (c.ellipse14.contains(xcor, ycor)) {
                    click += 3;
                    cli = true;
                    list14.remove(c);
                    break;

                }
            }
            //
            for (Circle2 c : list15) {
                if (c.ellipse15.contains(xcor, ycor)) {
                    Griding g = new Griding();
                     p = (double) k;
                    a = number_of_click +16;
                    b = miss_click;
                    d = (click - miss_click);
                    number_of_click = (((j * 60) - k) / 10) * 16;
                    g.feedBack(a, right_click, d, p);
                    dispose();

                }
            }

            for (Circle2 c : list16) {
                if (c.ellipse16.contains(xcor, ycor)) {
                    click += 4;
                    cli = true;
                    list16.remove(c);
                    break;

                }
            }

            for (Circle2 c : list17) {
                if (c.ellipse17.contains(xcor, ycor)) {
                    click += 4;
                    cli = true;
                    list17.remove(c);
                    break;

                }
            }

            for (Circle2 c : list18) {
                if (c.ellipse18.contains(xcor, ycor)) {
                    click += 4;
                    cli = true;
                    list18.remove(c);
                    break;

                }
            }
            for (Circle2 c : list19) {
                if (c.ellipse19.contains(xcor, ycor)) {
                    click += 4;
                    cli = true;
                    list19.remove(c);
                    break;

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
                        number_of_click = (((j * 60) - k) / 10) * 16 + 16;  //logic for the no of click generated
                    }

                     p = (double) k;

                    lbl_right_click.setText("Score is " + click);
                    lbl_wrong_click.setText("Miss click is:" + miss_click);
                    lbl_score.setText("Right Click is:" + right_click);

                } else if (i <= 0) {
                    t.stop();
                    dispose();
                    Griding g = new Griding();

                    a = number_of_click;
                    b = miss_click;
                    d = (click - miss_click);
                   number_of_click = (((j * 60) - k) / 10) * 16 + 16;
                    g.feedBack(a, right_click, d, p);

                }
            }

        };
        t = new Timer(1000, listener);
        t.start();
    }
}
