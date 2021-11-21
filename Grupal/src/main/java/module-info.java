module com.mycompany.grupal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.grupal to javafx.fxml;
    exports com.mycompany.grupal;
}
