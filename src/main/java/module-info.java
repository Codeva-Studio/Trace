module org.codevastudio.trace {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.codevastudio.trace to javafx.fxml;
    exports org.codevastudio.trace;
}