package usr.mcgill.datavisualization.Bubblechart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class Bubblechart extends Application {

    @Override public void start(Stage stage) {
        stage.setTitle("Bubble Chart Sample");
        final NumberAxis xAxis = new NumberAxis(1, 53, 4);
        final NumberAxis yAxis = new NumberAxis(0, 80, 10);
        final BubbleChart<Number,Number> blc = new
                BubbleChart<Number,Number>(xAxis,yAxis);
        xAxis.setLabel("Week");
        yAxis.setLabel("Product Budget");
        blc.setTitle("Budget Monitoring");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Product 1");
        series1.getData().add(new XYChart.Data(3, 35, 2));
        series1.getData().add(new XYChart.Data(12, 60, 1.8));
        series1.getData().add(new XYChart.Data(15, 15, 7));
        series1.getData().add(new XYChart.Data(22, 30, 2.5));
        series1.getData().add(new XYChart.Data(28, 20, 1));
        series1.getData().add(new XYChart.Data(35, 41, 5.5));
        series1.getData().add(new XYChart.Data(42, 17, 9));
        series1.getData().add(new XYChart.Data(49, 30, 1.8));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Product 2");
        series2.getData().add(new XYChart.Data(8, 15, 2));
        series2.getData().add(new XYChart.Data(13, 23, 1));
        series2.getData().add(new XYChart.Data(15, 45, 3));
        series2.getData().add(new XYChart.Data(24, 30, 4.5));
        series2.getData().add(new XYChart.Data(38, 78, 1));
        series2.getData().add(new XYChart.Data(40, 41, 7.5));
        series2.getData().add(new XYChart.Data(45, 57, 2));
        series2.getData().add(new XYChart.Data(47, 23, 3.8));

        yAxis.setTickLabelFormatter(new NumberAxis.DefaultFormatter(yAxis,"$ ",null));

        Scene scene  = new Scene(blc);
        blc.getData().addAll(series1, series2);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
