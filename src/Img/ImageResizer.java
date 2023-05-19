package Img;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageResizer {

    public static void main(String[] args) throws Exception {
        File originalImageFile = new File("C:\\Users\\cedri\\OneDrive\\Pictures\\Camera Roll\\o.jpg");
        BufferedImage originalImage = ImageIO.read(originalImageFile);

        int originalWidth = originalImage.getWidth();
        int originalHeight = originalImage.getHeight();

        int desiredWidth = 800;
        int desiredHeight = 600;

        double widthRatio = (double)desiredWidth / (double)originalWidth;
        double heightRatio = (double)desiredHeight / (double)originalHeight;

        double scalingFactor = Math.min(widthRatio, heightRatio);

        int newWidth = (int)(originalWidth * scalingFactor);
        int newHeight = (int)(originalHeight * scalingFactor);

        BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, originalImage.getType());

        //TODO: resize the image

        File resizedImageFile = new File("resized_image.jpg");
        ImageIO.write(resizedImage, "jpg", resizedImageFile);
    }
}
