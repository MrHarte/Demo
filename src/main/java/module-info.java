module com.champlain.oop2.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.champlain.oop2.demo to javafx.fxml;
    exports com.champlain.oop2.demo;
}