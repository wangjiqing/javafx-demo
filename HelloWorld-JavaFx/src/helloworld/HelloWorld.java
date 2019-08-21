package helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // 创建 Button 按钮
        Button btn = new Button();
        // 设置按钮文字
        btn.setText("Say 'Hello World!'");
        // 设置点击事件
        btn.setOnAction(event -> System.out.println("Hello World!"));
        // 构建一个 StackPane
        StackPane root = new StackPane();
        // 将 Button 添加到 StackPane
        root.getChildren().add(btn);
        // 构建一个 Scene，并设置其大小
        Scene scene = new Scene(root, 300, 250);

        // 设置 primaryStage 标题
        primaryStage.setTitle("我的第一个JavaFX程序");
        // 将 scene 放入 primaryStage
        primaryStage.setScene(scene);
        // 显示 primaryStage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
