package dosw.semana_4.decoratorCommandEjercicio10;

import java.awt.image.BufferedImage;

public class BaseImage implements Image{

    private BufferedImage image;

    public BaseImage(BufferedImage image) {
        this.image = image;
    }

    @Override
    public BufferedImage render() {
        return image;
    }
}
