import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FileMenu extends JMenu implements ActionListener {
    // Frame principal
    private DocTextAnalyzer mainFrame;
    // Itens do menu ( File )
    private JMenuItem openItem;
    private JMenuItem exitItem;


    public FileMenu(DocTextAnalyzer mainFrame) {
        super("File");
        this.mainFrame = mainFrame;
        this.setMenuConfiguration();
    }


    // Setters
    public void setMenuConfiguration() {
        // Adicionando item [ Open ] ao menu
        setOpenItem();
        add(openItem);
        // Adicionando o item [ Exit ] ao menu
        setExitItem();
        add(exitItem);
    }

    // Módulos para iniciar itens do menu e adicionar função de escuta
    public void setOpenItem() {
        openItem = new JMenuItem("Open");
        openItem.addActionListener(this);
    }

    public void setExitItem() {
        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(this);
    }
    // Fim 


    // Getters
    public DocTextAnalyzer getMainFrame() {
        return mainFrame;
    }

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
            new Open(this);

            //if (Open.openedFile != null) {
            // Seta ( Enable ) nos botões caso um arquivo válido tenha sido 
            // aberto!
                //mainFrame.setEnableButtons(true);
            //}
        } else if (event.equals("Exit")) {
            dispatchEvent(new WindowEvent(mainFrame, WindowEvent.WINDOW_CLOSING));
        }
    }
}
