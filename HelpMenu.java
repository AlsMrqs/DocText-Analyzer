import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelpMenu extends JMenu implements ActionListener {
    private JMenuItem aboutItem;
    
    public HelpMenu() {
        super("Help");
        this.setMenuConfiguration();
        this.add(aboutItem);
    }

    // Setters
    public void setMenuConfiguration() {
        setAboutItem();
    }

    public void setAboutItem() {
        aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(this);
    }

    // Getters
    public JMenuItem getAboutItem() {
        return aboutItem;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String event = new String(e.getActionCommand());
        if (event.equals("About")) {
            new About();
        }
    }
}
