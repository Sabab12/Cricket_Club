module com.bgmea.cricket_club {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bgmea.cricket_club to javafx.fxml;
    exports com.bgmea.cricket_club;
}