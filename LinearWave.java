import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LinearWave {
    public static void main(String args[]) throws Exception {
        try {
            int width = 200, height = 200;

            // TYPE_INT_ARGB specifies the image format: 8-bit RGBA packed
            // into integer pixels
            BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D ig2 = bi.createGraphics();
            ig2.setPaint(Color.black);

            for(int y = 10; y <= 100; y += 10){
                ig2.drawLine(10, y, y+10, 100);
            }
            ig2.drawLine(10, 10, 10, 100);
            ig2.drawLine(10, 100, 100, 100);

            ImageIO.write(bi, "PNG", new File("waveLinear.PNG"));


        } catch (IOException ie) {
            ie.printStackTrace();
        }

    }
}
