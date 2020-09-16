import javax.swing.*;
import java.awt.*;

public class DocTextAnalyzer extends JFrame {
    private JPanel buttonsPanel;
    private JButton strCountButton;
    private JButton charCountButton;

    public DocTextAnalyzer() {
        super("DocText Analyzer");
        this.setFrameConfiguration();
        this.setButtonsPanel();
        this.getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
    }

    // Setter
    public void setFrameConfiguration() {
        setVisible(true);
        setResizable(false);
        setSize(600,400);
        setLocation(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(new JMenuBar());
        getJMenuBar().add(new FileMenu());
        getJMenuBar().add(new HelpMenu());
    }

    public void setButtonsPanel() {
        buttonsPanel = new JPanel();
        setStrCountButton(false);
        setCharCountButton(false);
        buttonsPanel.add(getStrCountButton());
        buttonsPanel.add(getCharCountButton());
    }

    public void setStrCountButton(boolean enable) {
        if (strCountButton == null)
            strCountButton = new JButton("String Count");
        strCountButton.setEnabled(enable);
    }

    public void setCharCountButton(boolean enable) {
        if (charCountButton == null) 
            charCountButton = new JButton("Character Count");
        charCountButton.setEnabled(enable);
    }

    public void setEnableButtons(boolean enable) {
        setCharCountButton(true);
        setStrCountButton(true);
    }

    // Getters
    public JPanel getButtonsPanel() {
        return buttonsPanel;
    }

    public JButton getStrCountButton() {
        return strCountButton;
    }

    public JButton getCharCountButton() {
        return charCountButton;
    }
}
