module com.example.chessgamerobbev1 {
    requires javafx.controls;
    requires javafx.fxml;
        requires javafx.web;
            
        requires org.controlsfx.controls;
                            requires eu.hansolo.tilesfx;
            requires com.almasb.fxgl.all;
    
    opens com.example.chessgamerobbev1 to javafx.fxml;
    exports com.example.chessgamerobbev1;
}