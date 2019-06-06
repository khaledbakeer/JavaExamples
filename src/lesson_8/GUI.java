package lesson_8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class GUI {
    public static void main(String[] args) {
        /*
         * Create windows with all expected properties.
         */
        JFrame window = new JFrame("My Window"); // set the title shown on the top bar.
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // what to do when the user click 'x' on the top bar. // it will exit the program and close the window
        window.setSize(800, 600); // set the size of the windows

        /*
         * Create a Menu Bar:
         */
        JMenuBar mainMenu = new JMenuBar(); // bring my menubar

        // create MenuItems for File Menu
        JMenuItem newMenuItem = new JMenuItem("new");
        JMenuItem exitMenuItem = new JMenuItem("exit");

        // create MenuItems for ? Menu
        JMenuItem aboutMenuItem = new JMenuItem("About");
        JMenuItem helpMenuItem = new JMenuItem("Help");

        // Create File Menu and add the file menu items to it
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(newMenuItem);
        fileMenu.add(exitMenuItem);

        // Create ? Menu and add the ? menu items to it
        JMenu helpMenu = new JMenu("?");
        helpMenu.add(aboutMenuItem);
        helpMenu.add(helpMenuItem);

        // add created menus to the main menubar
        mainMenu.add(fileMenu);
        mainMenu.add(helpMenu);

        window.setJMenuBar(mainMenu); // and add it to my windows

        /*
         * Add Some Actions
         */
        // clicking 'new' menu item will create and show a new window.
        newMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // every time will be clicked on 'new' -> it will be generated a new window with the title new window
                JFrame newWindow = new JFrame("new Window");
                newWindow.setBounds(200, 200, 400, 400);
                newWindow.setVisible(true);
            }
        });

        // clicking 'exit' menu item will exit the program and close all opened windows of the program.
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Think about that -> exit: is more than one process and more than one line like this.
                System.exit(0); // Terminate all!
            }
        });

        /*
         * Create a JPanel
         */
        JPanel panel = new JPanel();

        /*
         * Add some components:
         */
        // add a list:
        DefaultListModel names = new DefaultListModel(); // my db list
        names.addAll(Arrays.asList("Max Muster,Miki Mouse,Sponge Bob,Spider Man".split(","))); // add some values
        JList<String> listNames = new JList<>(names); // create my visual list
        panel.add(listNames); // last step ist to add it to the frame


        // add a Label:
        JLabel label = new JLabel("show me the selected name");

        panel.add(label);

        // add a button:
        JButton button = new JButton("click me!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(listNames.getSelectedValue());
            }
        });
        panel.add(button);


        /*
         * Last step is always to set visibility to true, and add the panel to window
         */
        window.add(panel);
        window.setVisible(true); // show the window


    }
}
