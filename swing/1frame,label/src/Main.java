import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {

        Border border = BorderFactory.createLineBorder(Color.green,3);

        ImageIcon darthVader = new ImageIcon("darthVader.jpeg");

        // JLabel = a GUI display area for a string of text, an image, or both
        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(darthVader);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left,center,right of imgicon
        label.setVerticalTextPosition(JLabel.TOP); // top,center,bottom of imageicon
        label.setForeground(Color.green);
        label.setFont(new Font("MV Boli",Font.PLAIN,18));
        // label.setIconTextGap(-10); // set gap between icon and text
        label.setBackground(Color.black);
        label.setOpaque(true); // to display the bg color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position to the center
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100,100,250,250); // set x,y position in the frame


        MyFrame myFrame = new MyFrame();
        myFrame.add(label);
        myFrame.setIconImage(darthVader.getImage());
        myFrame.getContentPane().setBackground(Color.darkGray);
        //myFrame.setLayout(null);
        //myFrame.pack(); // changes the size of the frame, makes it contain all the components
    }
}