import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Car {
    Image carImage;
    int x;

    Car(){
        ImageIcon imageIcon = new ImageIcon("src/images/car.png");
        carImage = imageIcon.getImage();
        x = 300;
    }

    public void move(KeyEvent e){
        int key = e.getKeyCode();

       if(key == 39) x = x + 5;
       if(key == 37) x = x - 5;
 	if(key == 38) x = x + 5;
    }
}
