package usr.mcgill.datavisualization.Piechart;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Piechart extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //Create scene and set title/dimensions
        Scene scene = new Scene(new Group());
        stage.setTitle("Imported Fruits");
        stage.setWidth(500);
        stage.setHeight(500);

        //populate a observable list with piechart data

        //This could be done using an external class for larger data sets or persistence
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Grapefruit", 13),
                        new PieChart.Data("Oranges", 25),
                        new PieChart.Data("Plums", 10),
                        new PieChart.Data("Pears", 22),
                        new PieChart.Data("Apples", 30));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Imported Fruits");

        //modify chart label length, and legend side
        chart.setLabelLineLength(10);
        chart.setLegendSide(Side.LEFT);

        //add listener

        //create label and color to display for event listener
        final Label caption = new Label("");
        caption.setTextFill(Color.DARKORANGE);
        caption.setStyle("-fx-font: 24 arial;");


        //for each piece of data, when clicked, display current data value in percent
        for (final PieChart.Data data : chart.getData()) {
            data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED,
                    e -> {
                        caption.setTranslateX(e.getSceneX());
                        caption.setTranslateY(e.getSceneY());
                        caption.setText(String.valueOf(data.getPieValue()) + "%");
                    });
        }

        //add chart to scene so it will be displayed
        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
