import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Open extends JFileChooser {
    // Menu principal
    private FileMenu mainMenu;
    // Arquivo a ser aberto
    private File openedFile;


    public Open(FileMenu mainMenu) {
        this.mainMenu = mainMenu;
        //int result = showOpenDialog(this.mainMenu.getMainFrame());
        //setOpenedFile(result);
        setOpenedFile(showOpenDialog(this.mainMenu.getMainFrame()));
    }


    // Setters
    public void setOpenedFile(int result) {
        if (result == APPROVE_OPTION) {
            openedFile = getSelectedFile();
        } else {
            openedFile = null;
        }
        mainMenu.getMainFrame().setOpenedFile(openedFile);
    }

    // Getters
    public FileMenu getMainMenu() {
        return mainMenu;
    }

    public File getOpenedFile() {
        return openedFile;
    }

}
