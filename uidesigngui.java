
import javax.swing.*;
import java.awt.*;

/* Imports Java Elements */

class uidesigngui extends PoemText {
	
    public static void main(String args[]) {

    	/* By Ryan Deleon, Created on June 17th 2022 */
    	
        /* Creates UI Design Frame */
        JFrame rduiframe = new JFrame(" RD UI Design Frame");
        rduiframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rduiframe.setSize(350, 350);

        /* Creates components, Menu Bar and other menu components. */
        
        JMenuBar MenuBar = new JMenuBar();
        JMenu menu1 = new JMenu("FILE");
        JMenu menu2 = new JMenu("Help");
        MenuBar.add(menu1);
        MenuBar.add(menu2);
        JMenuItem menuitem11 = new JMenuItem("Open File");
        JMenuItem menuitem22 = new JMenuItem("Save File As");
        menu1.add(menuitem11);
        menu1.add(menuitem22);

        /* Creates Menu panels at bottom which creates components */
        JPanel JMenuPanelGUI = new JPanel(); /* JMenuPanel not displayed during its output */
        JLabel GUILabel = new JLabel("Enter output");
        JTextField GUITextField = new JTextField(10); /* Creates a text field characters */
        JButton SendMenuButton = new JButton("Send Menu Button");
        JButton ResetMenuButton = new JButton("Reset Menu Button");
        
        /* Adds Panels for UI Flow Layout */
        JMenuPanelGUI.add(GUILabel);
        JMenuPanelGUI.add(GUITextField);
        JMenuPanelGUI.add(SendMenuButton);
        JMenuPanelGUI.add(ResetMenuButton);

        /* Aligns Text Area in the Center */
        JTextArea TextArea = new JTextArea();

        //Adding Components to the frame.
        rduiframe.getContentPane().add(BorderLayout.SOUTH, JMenuPanelGUI);
        rduiframe.getContentPane().add(BorderLayout.NORTH, MenuBar);
        rduiframe.getContentPane().add(BorderLayout.CENTER, TextArea);
        rduiframe.setVisible(true);
    }
}