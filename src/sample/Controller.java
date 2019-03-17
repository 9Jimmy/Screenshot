package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Controller {

    @FXML
    void takeScreenshot(ActionEvent event) throws IOException, AWTException{

        Robot robot = new Robot();
        Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage image = robot.createScreenCapture(rectangle);

        double index = Math.random()*100;
        ImageIO.write(image, "png", new File("src\\resources\\Screen-"+ index+".png"));

    }
}




