module kroryi.test {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens kroryi.test to javafx.fxml;
    exports kroryi.test;
}