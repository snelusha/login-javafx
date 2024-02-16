module org.snelusha.javafxlogin {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.snelusha.javafxlogin to javafx.fxml;
    exports org.snelusha.javafxlogin;
}