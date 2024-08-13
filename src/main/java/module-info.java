module fdGuiCreator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;

    opens fdgc to javafx.fxml;
    exports fdgc;
}