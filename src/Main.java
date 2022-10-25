import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    Heros toto;
    Camera ction;

    AnimationTimer unAutreJour = new AnimationTimer() {
        @Override
        public void handle(long l) {
            toto.updateImageViewInScene(ction,l);
        }
    };

    @Override
    public void start(Stage primaryStage) throws Exception{
        toto=new Heros(1050,300);
        ction= new Camera(1000,0);

        primaryStage.setTitle("Hello world");
        Group root = new Group();
        Pane pane = new Pane(root);
        Scene theScene = new Scene(pane, 600, 400,true);
        primaryStage.setScene(theScene);

        root.getChildren().add(toto.getImageView());

        primaryStage.show();
        unAutreJour.start();

    }


    public static void main(String[] args) {
        launch(args);
    }
}