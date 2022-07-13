package ru.netology.graphics.image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.net.URL;

public class GraphicsConverter implements TextGraphicsConverter {

    private int width;
    private int height;
    private TextColorSchema schema;
    private double maxRatio;

    @Override
    public String convert(String url) throws IOException, BadImageSizeException {
        setTextColorSchema(new ColorShema(new char[]{'#', '$', '%', '*', '+', '-', '\''}));
        BufferedImage img = ImageIO.read(new URL(url));
        double ratio = img.getWidth() / img.getHeight();
        System.out.println(img.getHeight());
        System.out.println(img.getWidth());
        System.out.println(ratio);
        System.out.println(maxRatio);
        System.out.println(width);
        System.out.println(height);

        if (ratio > maxRatio) {
            BadImageSizeException badImageSizeException = new BadImageSizeException(ratio, maxRatio);
            throw badImageSizeException;
        }
        int newWidth = 0;
        int newHeight = 0;
        if (img.getWidth() > width) {
            double scale = img.getWidth() / (double) width;
            double scale2 = img.getHeight() / (double) height;
            newHeight = (int) (img.getHeight() / Math.max(scale, scale2));
            newWidth = (int) (img.getWidth() / Math.max(scale, scale2));
        }

        Image scaledImage = img.getScaledInstance(newWidth, newHeight, BufferedImage.SCALE_SMOOTH);
        BufferedImage bwImg = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_BYTE_GRAY);
        Graphics2D graphics = bwImg.createGraphics();
        graphics.drawImage(scaledImage, 0, 0, null);
        WritableRaster bwRaster = bwImg.getRaster();


        System.out.println(newWidth);
        System.out.println(newHeight);
        String[][] colors = new String[bwImg.getWidth()][newHeight];

        for (
                int w = 0; w < newWidth; w++) {
            for (int h = 0; h < newHeight; h++) {
                int color = bwRaster.getPixel(w, h, new int[3])[0];
                char c = schema.convert(color);
                colors[w][h] = String.valueOf(c);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (
                int h = 0; h < newHeight; h++) {
            for (int w = 0; w < newWidth; w++) {
                String str = (colors[w][h] + colors[w][h]);
                stringBuilder.append(str);
            }
            stringBuilder.append("\n");
        }
        return String.valueOf(stringBuilder);
    }

    @Override
    public void setMaxWidth(int width) {
        this.width = width;
    }

    @Override
    public void setMaxHeight(int height) {
        this.height = height;
    }

    @Override
    public void setMaxRatio(double maxRatio) {
        this.maxRatio = maxRatio;
    }

    @Override
    public void setTextColorSchema(TextColorSchema schema) {
        this.schema = schema;
    }
}
