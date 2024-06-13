module usr.mcgill.datavisulazation {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens usr.mcgill.datavisualization to javafx.fxml;
    exports usr.mcgill.datavisualization;
    exports usr.mcgill.datavisualization.Piechart;
    exports usr.mcgill.datavisualization.Linechart;
    exports usr.mcgill.datavisualization.Areachart;
    exports usr.mcgill.datavisualization.Bubblechart;
}