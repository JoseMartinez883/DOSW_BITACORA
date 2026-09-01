package dosw.semana_4.decoratorCommandEjercicio10;

import java.awt.image.BufferedImage;

public class SepiaDecorator extends ImageDecorator{

    public SepiaDecorator(Image image) {
        super(image);
    }

    @Override
    public BufferedImage render() {
        BufferedImage image = super.render();
        return applySepia(image);
    }

    private BufferedImage applySepia(BufferedImage image){
        int ancho = image.getWidth();
        int alto = image.getHeight();

        BufferedImage sepiaImage = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {

                int rgb = image.getRGB(x, y);

                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;

                int nuevoR = (int)(0.393 * r + 0.769 * g + 0.189 * b);
                int nuevoG = (int)(0.349 * r + 0.686 * g + 0.168 * b);
                int nuevoB = (int)(0.272 * r + 0.534 * g + 0.131 * b);

                if (nuevoR > 255) nuevoR = 255;
                if (nuevoG > 255) nuevoG = 255;
                if (nuevoB > 255) nuevoB = 255;

                int rgbSepia = (nuevoR << 16) | (nuevoG << 8) | nuevoB;

                sepiaImage.setRGB(x, y, rgbSepia);
            }
        }
        return sepiaImage;
    }
}
