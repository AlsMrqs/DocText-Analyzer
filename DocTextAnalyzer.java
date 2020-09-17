import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DocTextAnalyzer extends JFrame implements ActionListener {
    // Painel de botões
    private JPanel buttonsPanel;
    // Botões do painel
    private JButton strCountButton;
    private JButton charCountButton;

    // Construtor
    public DocTextAnalyzer() {
        super("DocText Analyzer");
        this.setFrameConfiguration();
        this.setButtonsPanel();
        this.getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
    }

    // Setter
    public void setFrameConfiguration() {
        // Configurações do frame
        setVisible(true);
        setResizable(false);
        setSize(600,400);
        setLocation(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Definindo o menu de opções do frame
        setJMenuBar(new JMenuBar());
        getJMenuBar().add(new FileMenu());
        getJMenuBar().add(new HelpMenu());
    }

    public void setButtonsPanel() {
        // Inicia o painel de botões e os botões
        buttonsPanel = new JPanel();
        setStrCountButton(false);
        setCharCountButton(false);

        // Adicionando os botões ao painel de botões
        buttonsPanel.add(strCountButton);
        buttonsPanel.add(charCountButton);
    }


    /*
        Módulos para iniciar os botões
        e definir função de escuta
    */
    public void setStrCountButton(boolean value) {
        if (strCountButton == null)
            strCountButton = new JButton("String Count");
        strCountButton.setEnabled(value);
        strCountButton.addActionListener(this);
    }

    public void setCharCountButton(boolean value) {
        if (charCountButton == null) 
            charCountButton = new JButton("Character Count");
        charCountButton.setEnabled(value);
        charCountButton.addActionListener(this);
    }

    // Módulo para ativar ou desativar os botões 
    public void setEnableButtons(boolean value) {
        charCountButton.setEnabled(value);
        strCountButton.setEnabled(value);
    }
    /* 
        Fim módulos dos botões  
    */


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

    // Ações
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO
    }
}
