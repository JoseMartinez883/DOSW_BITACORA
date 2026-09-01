package dosw.semana_4.decoratorCommandEjercicio10;

import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;

public class GrayscaleDecorator extends ImageDecorator{

    public GrayscaleDecorator(Image image) {
        super(image);
    }

    @Override
    public BufferedImage render() {
        BufferedImage image = super.render();
        return convertGrayScale(image);
    }

    private BufferedImage convertGrayScale(BufferedImage image){
        BufferedImage gris = new BufferedImage(
                image.getWidth(),
                image.getHeight(),
                BufferedImage.TYPE_BYTE_GRAY
        );

        ColorConvertOp op = new ColorConvertOp(
                ColorSpace.getInstance(ColorSpace.CS_GRAY),
                null
        );
        op.filter(image, gris);

        return gris;
    }
}

