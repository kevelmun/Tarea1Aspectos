module com.mycompany.observer {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.observer to javafx.fxml;
    exports com.mycompany.observer;
}