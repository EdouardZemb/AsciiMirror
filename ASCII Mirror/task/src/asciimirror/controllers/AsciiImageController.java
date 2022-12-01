package asciimirror.controllers;

import asciimirror.models.AsciiImage;
import asciimirror.views.AsciiImageView;

public class AsciiImageController extends Controller<AsciiImage> {

    public AsciiImageController(AsciiImage model, AsciiImageView view) {
        super(model, view);
    }
}
