import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Heros {
    private double x;
    private double y;

    private ImageView imageView;

    public Heros(double x, double y) {
        this.x = x;
        this.y = y;
        this.imageView = new ImageView(new Image("file:./img/heros.png"));
        imageView.setViewport(new Rectangle2D(20,0,65,100));
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void updateImageViewInScene(Camera man, long time){
        imageView.setX(x-man.getX());
        imageView.setY(y-man.getY());

        int index= (int) (((time/1000000)/150)%6);
        imageView.setViewport(new Rectangle2D(15+(85*index),0,70,100));


    }
}
