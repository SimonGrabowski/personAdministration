import gui.MainFrame;

public class Main {
    public static void main(String[] args) {

        MainFrame mainFrame = new MainFrame(800, 800);
        mainFrame.startGui();
        mainFrame.startDataEntryFrame();
        /*CreateJson createJson = new CreateJson();
        createJson.createJsonFile();*/
    }
}