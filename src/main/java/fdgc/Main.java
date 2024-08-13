package fdgc;

import fdgc.window.Window;

public class Main {

    public static void main(String[] args) {
        Window window = new Window();
        window.load(args);

        //jpackage --type exe --app-version "2.0" --input . --dest . --main-jar "G:\Zinha\coding\java\fdGuiCreator\target\fdGuiCreator-0.jar" --main-class "G:\Zinha\coding\java\fdGuiCreator\src\main\java\fdgc\Main.java" --module-path G:\Zinha\coding\java\fdGuiCreator\target\lib --add-modules javafx.controls,javafx.fxml --win-shortcut --win-menu --name "My App" --jlink-options --bind-services
    }
}
