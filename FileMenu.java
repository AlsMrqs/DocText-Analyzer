import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FileMenu extends JMenu implements ActionListener {
    private JMenuItem openItem;
    private JMenuItem exitItem;

    public FileMenu() {
        super("File");
        this.setMenuConfiguration();
        this.add(openItem);
        this.add(exitItem);
    }

    // Setters
    public void setMenuConfiguration() {
        setOpenItem();
        setExitItem();
    }

    public void setOpenItem() {
        openItem = new JMenuItem("Open");
        openItem.addActionListener(this);
    }

    public void setExitItem() {
        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(this);
    }

    // Getters
    public JMenuItem getOpenItem() {
        return openItem;
    }

    public JMenuItem getExitItem() {
        return exitItem;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String event = new String(e.getActionCommand());
        if (event.equals("Open")) {
            System.out.println("Try to open file!" );
        } else if (event.equals("Exit")) {
            System.out.println("Try to quit!");
        }
    }
}
