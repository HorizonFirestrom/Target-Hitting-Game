/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentddoocp;

import java.awt.geom.Ellipse2D;

public class Circle {

    int x, y, h, w;
    int a, b, c, d;
    int a1, b1, c1, d1;
    int a2, b2, c2, d2;
    int a3, b3, c3, d3;
    int a4, b4, c4, d4;
    int a5, b5, c5, d5;
    int a6, b6, c6, d6;
    int a7, b7, c7, d7;
    int a8, b8, c8, d8;
    
   
    
    

    Ellipse2D ellipse, ellipse1, ellipse2, ellipse3, ellipse4,ellipse5,ellipse6,ellipse7,ellipse8,ellipse9;

    public void circle(int x1, int y1, int v1, int w1) {
        x = x1;
        y = y1;
        h = v1;
        w = w1;
        ellipse = new Ellipse2D.Double(x, y, w, h);
    }

    public void circle1(int x2, int y2, int v2, int w2) {
        a = x2;
        b = y2;
        c = v2;
        d = w2;
        ellipse1 = new Ellipse2D.Double(a, b, c, d);
    }

    public void circle2(int x3, int y3, int v3, int w3) {
        a1 = x3;
        b1 = y3;
        c1 = v3;
        d1 = w3;
        ellipse2 = new Ellipse2D.Double(a1, b1, c1, d1);
    }

    public void circle3(int x4, int y4, int v4, int w4) {
        a2 = x4;
        b2 = y4;
        c2 = v4;
        d2 = w4;
        ellipse3 = new Ellipse2D.Double(a2, b2, c2, d2);
    }

    public void circle4(int x5, int y5, int v5, int w5) {
        a3 = x5;
        b3 = y5;
        c3 = v5;
        d3 = w5;
        ellipse4 = new Ellipse2D.Double(a3, b3, c3, d3);
    }
     public void circle5(int x6, int y6, int v6, int w6) {
        a4 = x6;
        b4 = y6;
        c4 = v6;
        d4 = w6;
        ellipse5 = new Ellipse2D.Double(a4, b4, c4, d4);
    }
      public void circle6(int x7, int y7, int v7, int w7) {
        a5 = x7;
        b5 = y7;
        c5 = v7;
        d5 = w7;
        ellipse6 = new Ellipse2D.Double(a5, b5, c5, d5);
    }
       public void circle7(int x8, int y8, int v8, int w8) {
        a6 = x8;
        b6 = y8;
        c6 = v8;
        d6 = w8;
        ellipse7 = new Ellipse2D.Double(a6, b6, c6, d6);
    }
        public void circle8(int x9, int y9, int v9, int w9) {
        a7 = x9;
        b7 = y9;
        c7 = v9;
        d7 = w9;
        ellipse8 = new Ellipse2D.Double(a7, b7, c7, d7);
    }
         public void circle9(int x10, int y10, int v10, int w10) {
        a8 = x10;
        b8 = y10;
        c8 = v10;
        d8 = w10;
        ellipse9 = new Ellipse2D.Double(a8, b8, c8, d8);
    }
//function that control the movement of the graphics
    public void move() {

        x += 5;
        y += 5;
        
        a += 5;
        
        a1 += 5;
        
        a2 -= 5;
        
        b3 += 5;
        
        a4+=5;
       
        
        a5+=5;
        
        b6-=5;
        
        a7+=5;
        
        b8+=5;
        
        
        
        

    }
}
