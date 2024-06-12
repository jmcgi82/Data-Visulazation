package usr.mcgill.datavisualization.Linechart;

import javafx.application.Application;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class Linechart extends Application {

    @Override public void start(Stage stage) {
        stage.setTitle("Line Chart Sample");
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of Month");
        //creating the chart
        final LineChart<Number,Number> lineChart =
                new LineChart<Number,Number>(xAxis,yAxis);

        lineChart.setTitle("Stock Monitoring, 2010");
        //defining a series
        XYChart.Series series = new XYChart.Series();
        series.setName("My portfolio");
        //populating the series with data
        series.getData().add(new XYChart.Data(1, 23));
        series.getData().add(new XYChart.Data(2, 14));
        series.getData().add(new XYChart.Data(3, 15));
        series.getData().add(new XYChart.Data(4, 24));
        series.getData().add(new XYChart.Data(5, 34));
        series.getData().add(new XYChart.Data(6, 36));
        series.getData().add(new XYChart.Data(7, 22));
        series.getData().add(new XYChart.Data(8, 45));
        series.getData().add(new XYChart.Data(9, 43));
        series.getData().add(new XYChart.Data(10, 17));
        series.getData().add(new XYChart.Data(11, 29));
        series.getData().add(new XYChart.Data(12, 25));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Dad's Portfolio");

        series2.getData().add(new XYChart.Data(1, 30));
        series2.getData().add(new XYChart.Data(2, 23));
        series2.getData().add(new XYChart.Data(3, 35));
        series2.getData().add(new XYChart.Data(4, 24));
        series2.getData().add(new XYChart.Data(5, 34));
        series2.getData().add(new XYChart.Data(6, 36));
        series2.getData().add(new XYChart.Data(7, 42));
        series2.getData().add(new XYChart.Data(8, 45));
        series2.getData().add(new XYChart.Data(9, 43));
        series2.getData().add(new XYChart.Data(10, 55));
        series2.getData().add(new XYChart.Data(11, 49));
        series2.getData().add(new XYChart.Data(12, 48));

        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Dog's Portfolio");
        //populating the series with data
        series3.getData().add(new XYChart.Data(1, 15));
        series3.getData().add(new XYChart.Data(2, 14));
        series3.getData().add(new XYChart.Data(3, 15));
        series3.getData().add(new XYChart.Data(4, 10));
        series3.getData().add(new XYChart.Data(5, 6));
        series3.getData().add(new XYChart.Data(6, 20));
        series3.getData().add(new XYChart.Data(7, 22));
        series3.getData().add(new XYChart.Data(8, 60));
        series3.getData().add(new XYChart.Data(9, 11));
        series3.getData().add(new XYChart.Data(10, 17));
        series3.getData().add(new XYChart.Data(11, 15));
        series3.getData().add(new XYChart.Data(12, 12));

        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().addAll(series, series2, series3);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
