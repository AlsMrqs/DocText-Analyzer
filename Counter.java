import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Counter extends JPanel {
    JPanel counterPanel;
    JTextArea counterTextArea;
    private HashMap<String,Integer> countStr;
    private Hashmap<Character,Integer> countChar;
    private FileReader fileToRead;

    public Counter(File file) {
        if (file.canRead()) 
            fileToRead = new FileReader(file);
        else

    }

    // Setters
    public void setCounterConfiguration() {
    }

    public void setCounterPanel() {
    }

    public void setCounterTextArea() {
    }

    public void  setCountStr() {
    }

    public void setCountChar() {
    }

    // Getters
    public JPanel getCounterPanel() {
        return counterPanel;
    }

    public JTextArea getCounterTextArea() {
        return counterTextArea;
    }

    public HashMap<String,Integer> getCountStr() {
        return countStr;
    }

    public HashMap<Character,Integer> getCountChar() {
        return countChar;
    }
}