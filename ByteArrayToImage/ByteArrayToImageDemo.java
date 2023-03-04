package ByteArrayToImage;
import java.io.*;
import java.awt.image.*;
import javax.imageio.ImageIO;

public class ByteArrayToImageDemo {
    public static void main (String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("/Users/varshinisankar/Desktop/Java-Training/ByteArrayToImage/Sample.jpg"));
        ByteArrayOutputStream outStreamObj = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", outStreamObj);
        byte [] byteArray = outStreamObj.toByteArray();
        ByteArrayInputStream inStreambj = new ByteArrayInputStream(byteArray);
        BufferedImage newImage = ImageIO.read(inStreambj);
        ImageIO.write(newImage, "jpg", new File("outputImage.jpg"));
        System.out.println("Image generated from the byte array.");
      }
}
