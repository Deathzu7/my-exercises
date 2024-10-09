package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

import javax.xml.stream.FactoryConfigurationError;

public class Main {

    public static void main(String[] args) {

         Rectangle rectangle = new Rectangle(10, 10, 500, 500);
         rectangle.setColor(Color.GREEN);
         rectangle.fill();  
        Ellipse ellipse = new Ellipse(5,5,300,300);
        ellipse.setColor(Color.RED);
        ellipse.fill();
        Text text1 = new Text(140,140,"super");
        text1.setColor(Color.BLACK);
        text1.setText("Love Mekie <3");
        text1.grow(70, 70);

        text1.draw();

        Fan fan = new Fan();




    }
}
