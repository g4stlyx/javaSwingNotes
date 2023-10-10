import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener{
    
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JSlider slider;
    
    SliderDemo(String title){
        
        frame.setTitle(title);
        slider = new JSlider(0,100,50); // min,max,default value
        
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true); // show ticks
        slider.setMinorTickSpacing(10); // show minor ticks in every 10 degrees

        slider.setPaintTrack(true); // show track
        slider.setMajorTickSpacing(25); // show major ticks in every 25 degrees

        slider.setPaintLabels(true); // show numbers at major ticks - 0,25,50,75,100 -
        slider.setFont(new Font("Times New Roman",Font.PLAIN,15)); 

        slider.setOrientation(SwingConstants.VERTICAL); // set orientation to vertical

        label.setText("°C = " + slider.getValue());
        label.setFont(new Font("Times New Roman",Font.PLAIN,25));
        
        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);

        frame.add(panel);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = " + slider.getValue());
    }

    
}
