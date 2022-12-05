package asciimirror.views;

import asciimirror.models.AsciiImage;

import java.io.FileNotFoundException;

public class AsciiImageView extends View<AsciiImage> {
    @Override
    public void print(AsciiImage printable) {
        System.out.print(printable.image());
    }

    @Override
    public void printTwice(AsciiImage printable) throws FileNotFoundException {

    }
}
