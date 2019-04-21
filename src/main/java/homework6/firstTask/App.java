package homework6.firstTask;

import homework6.firstTask.swing.MainWindow;
import javax.swing.*;

public class App {

    private static MainWindow mainWindow;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainWindow = new MainWindow();
            }
        });

    }
}
