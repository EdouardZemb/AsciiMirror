package asciimirror.views;

import asciimirror.models.AsciiImage;

public class AsciiImageView extends View<AsciiImage> {
    @Override
    public void print(AsciiImage printable) {
        System.out.print(printable.image());
    }
}
