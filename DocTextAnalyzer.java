import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class DocTextAnalyzer extends JFrame implements ActionListener {
    private File openedFile;
    // Painel de botões
    private JPanel buttonsPanel;
    // Botões do painel
    private JButton strCountButton;
    private JButton charCountButton;
    private JPanel countPanel;
    private int eventCount;


    public DocTextAnalyzer() {
        super("DocText Analyzer");
        this.eventCount = 0;
        this.setOpenedFile(null);
        this.setFrameConfiguration();
    }


    // Setter
    public void setFrameConfiguration() {
        // Configurações do frame
        setVisible(true);
        setResizable(false);
        setSize(600,400);
        setLocation(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adicionando botões
        setButtonsPanel();
        getContentPane().add(buttonsPanel, BorderLayout.SOUTH);

        // Definindo o menu bar do frame
        setJMenuBar(new JMenuBar());
        getJMenuBar().add(new FileMenu(this));
        getJMenuBar().add(new HelpMenu(this));

    }

    public void setOpenedFile(File openedFile) {
        this.openedFile = openedFile;
        if (openedFile != null) {
            setEnableButtons(true);
            System.out.println("Event[" + getEventCount() + "]: A file was opened!");

            // Incluindo painel de contagem
            countPanel = new JPanel();
            countPanel.setLayout(new GridLayout(1,2));
            countPanel.add(new JLabel("A File was opened!"));
            getContentPane().add(countPanel, BorderLayout.CENTER);
            this.invalidate();
            this.validate();
        } 
    }

    public void setEventCount() {
        eventCount++;
    }

    public void setCountPanel(JPanel countPanel) {
        this.countPanel = countPanel;
    }

    // Módulos para adicionar atributos ao frame

            public void setButtonsPanel() {
            // Inicia o painel de botões e os botões
            buttonsPanel = new JPanel();
            setStrCountButton();
            setCharCountButton();
            setEnableButtons(false);

            // Adicionando os botões ao painel de botões
            buttonsPanel.add(strCountButton);
            buttonsPanel.add(charCountButton);
        }

        // Módulos para iniciar os botões e definir função de escuta

            public void setStrCountButton() {
                    if (strCountButton == null)
                    strCountButton = new JButton("String Count");
                strCountButton.addActionListener(this);
            }

            public void setCharCountButton() {
                if (charCountButton == null) 
                    charCountButton = new JButton("Character Count");
                charCountButton.addActionListener(this);
            }

            public void setEnableButtons(boolean value) {
                charCountButton.setEnabled(value);
                strCountButton.setEnabled(value);
            }

        // Fim dos módulos dos botões  

    // Fim dos módulos de atributos do frame


    // Getters
    public File getOpenedFile() {
        return openedFile;
    }
    
    public int getEventCount() {
        return eventCount;
    }

    public JPanel getCountPanel() {
        return countPanel;
    }

    public JPanel getButtonsPanel() {
        return buttonsPanel;
    }

    public JButton getStrCountButton() {
        return strCountButton;
    }

    public JButton getCharCountButton() {
        return charCountButton;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String event = new String(e.getActionCommand());

        if (event.equals("String Count")) {
            System.out.println("Start string count!");
        } else if (event.equals("Character Count")) {
            System.out.println("Start character count!");
        }
    }
}
