package org.example.exercise;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class GetAndShowImage {
    private static final String CMD_LINE = "qlmanage -p ";

    public static void main(String[] args) {
        try {
            String webpage = "https://static.wixstatic.com/media/b6fec6_5c838fe148f344a7aa3abfb185b40f8d~mv2.png/v1/fill/w_396,h_179,al_c,lg_1,q_85,enc_auto/Git%20ab.png";
            InputStream in = new URL(webpage).openConnection().getInputStream();
            BufferedImage image = ImageIO.read(in);

            File f = File.createTempFile("image", ".png");
            ImageIO.write(image, "png", f);
            executeCommand(CMD_LINE+f.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void executeCommand(String command) {
        try {
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
