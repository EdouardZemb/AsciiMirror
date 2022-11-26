package asciimirror;

import asciimirror.controllers.AsciiImageController;
import asciimirror.models.AsciiImage;
import asciimirror.views.AsciiImageView;

public class Main {

    public static void main(String[] args) {
        AsciiImage model = new AsciiImage(
                new StringBuilder("""
                                _______\s
                               < hello >
                                -------\s
                        ^__^   /       \s
                _______/(oo)  /        \s
            /\\/(       /(__)           \s
               | w----||               \s
               ||     ||               \s
            """));

        AsciiImageView view = new AsciiImageView();
        AsciiImageController controller = new AsciiImageController(model, view);
        controller.updateView();
    }


}