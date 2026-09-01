package dosw.semana_4.decoratorCommandEjercicio10;

import java.awt.image.BufferedImage;

public class ImageDecorator implements Image{

    private final Image image;

    public ImageDecorator(Image image) {
        this.image = image;
    }

    @Override
    public BufferedImage render() {
        return image.render();
    }


}
