import javax.swing.SwingUtilities;

import backend.WeatherApp;
import gui.WeatherAppGUI;
public class App {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                //deisplay our weather app gui
                new WeatherAppGUI().setVisible(true);
                //testing: location geographical data form the API
                //System.out.println(WeatherApp.getCurrentTime());


            }
        });
    }
}
