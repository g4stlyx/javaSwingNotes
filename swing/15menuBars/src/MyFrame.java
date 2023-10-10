import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");;
    JMenu editMenu = new JMenu("Edit");
    JMenu helpMenu = new JMenu("Help");
    JMenuItem loadItem = new JMenuItem("Load");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");
    /*
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;    
    */

    MyFrame(String title){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // adding keyboard shortcuts to the menus and menu items
        fileMenu.setMnemonic(KeyEvent.VK_F); // ALT + F for file
        editMenu.setMnemonic(KeyEvent.VK_E); // ALT + E for edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // ALT + H for help

        loadItem.setMnemonic(KeyEvent.VK_L); // L for load
        saveItem.setMnemonic(KeyEvent.VK_S); // S for save
        exitItem.setMnemonic(KeyEvent.VK_E); // E for exit

        
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // loadItem.setIcon(loadIcon);

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);


        this.setJMenuBar(menuBar);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loadItem){
            System.out.println("Load");
        }
        else if(e.getSource()==saveItem){
            System.out.println("Save");
        }
        else if(e.getSource()==exitItem){
            System.exit(0);
        }
    }    
}
