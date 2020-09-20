import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelpMenu extends JMenu implements ActionListener {
    // Frame principal
    public DocTextAnalyzer mainFrame;
    // Itens do menu ( Help )
    private JMenuItem aboutItem;
    

    public HelpMenu(DocTextAnalyzer mainFrame) {
        super("Help");
        this.mainFrame = mainFrame;
        this.setMenuConfiguration();

        // Adicionando itens ao menu
        this.add(aboutItem);
    }


    // Setters
    public void setMenuConfiguration() {
        setAboutItem();
    }

    // Módulos para iniciar itens do menu e adicionar função de escuta
    public void setAboutItem() {
        aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(this);
    }
    // Fim


    // Getters
    public DocTextAnalyzer getMainFrame() {
        return mainFrame;
    }

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
