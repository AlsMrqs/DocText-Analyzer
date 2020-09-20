import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    // Variáveis label para guardar o texto
    JLabel appName;
    JLabel version;
    JLabel platform;
    JLabel enviroment;
    JLabel developers;
    // Painel do texto
    JPanel textPanel;
    // Painel do botão OK 
    JPanel buttonPanel;


    public About() {
        super("DocText Analyzer");
        this.setFrameConfiguration();
        this.setTextPanel();
        this.setButtonPanel();

        // Adicionando os paineis ao frame
        this.getContentPane().add(textPanel, BorderLayout.CENTER);
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(new JLabel("      "), BorderLayout.WEST);
    }


    // Setters
    public void setFrameConfiguration() {
        setVisible(true);
        setResizable(false);
        setSize(300,200);
        setLocation(500,250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void setTextPanel() {
        // Definindo as variáveis label
        setAppName("DocText Analyzer");
        setVersion("Verssion: 1.0.0");
        setPlatform("Platform: Java 7 / Swing");
        setEnviroment("Enviroment: Visual Studio Code");
        setDevelopers("Developers: Koda, Kleber");

        // Adicionando os labels ao painel de texto
        textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(5,1));
        textPanel.add(appName); 
        textPanel.add(version);
        textPanel.add(platform);
        textPanel.add(enviroment);
        textPanel.add(developers);
    }

    public void setButtonPanel() {
        // Iniciando o botão OK e adicionando a função de escuta
        JButton button = new JButton("Ok");
        button.addActionListener(this);

        // Definindo o painel do botão OK
        buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(204,204,204));
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(button);
    }

    public void setAppName(String appName) {
        this.appName = new JLabel(appName);
    }

    public void setVersion(String version) {
        this.version = new JLabel(version);
    }

    public void setPlatform(String platform) {
        this.platform = new JLabel(platform);
    }

    public void setEnviroment(String enviroment) {
        this.enviroment = new JLabel(enviroment);
    }

    public void setDevelopers(String developers) {
        this.developers = new JLabel(developers);
    }


    // Getters
    public JPanel getTextPanel() {
        return textPanel;
    }

    public JPanel getButtonPanel() {
        return buttonPanel;
    }

    public JLabel getAppName() {
        return appName;
    }

    public JLabel getVersion() {
        return version;
    }

    public JLabel getPlatform() { 
        return platform;
    }

    public JLabel getEnviroment() {
        return enviroment;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }

}
