import java.awt.Dimension;
import java.awt.Font;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
    MyPanel(){
        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        // image
        // ImageIcon image = new ImageIcon("").getImage();
        // g2D.drawImage(image, 50, 50, null);

        // rectangle
        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(5)); // thickness of the line
        //g2D.drawLine(0,0,500,500);
        g2D.drawRect(0, 0, 100, 200);
        g2D.fillRect(0,0,100,200);

        // circle
        g2D.setPaint(Color.orange);
        g2D.fillOval(100,0,100,100);


        // pokeball
        g2D.setPaint(Color.red);
        g2D.fillArc(200, 10, 100, 100,0,180);
        g2D.setPaint(Color.white);
        g2D.fillArc(200, 10, 100, 100,0,-180);

        // triangle
        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        g2D.setPaint(Color.green);
        g2D.drawPolygon(xPoints, yPoints, 3);
        g2D.fillPolygon(xPoints, yPoints, 3);

        //string,text
        g2D.setPaint(Color.darkGray);
        g2D.setFont(new Font("Ink Free", Font.BOLD, 40));
        g2D.drawString("U CANT SEE ME", 50, 400);


    }
}
