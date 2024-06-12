module usr.mcgill.datavisulazation {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens usr.mcgill.datavisulazation to javafx.fxml;
    exports usr.mcgill.datavisulazation;
}