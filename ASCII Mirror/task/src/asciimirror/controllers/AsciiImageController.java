package asciimirror.controllers;

import asciimirror.models.AsciiImage;
import asciimirror.views.AsciiImageView;

public class AsciiImageController {
    private final AsciiImage model;
    private final AsciiImageView view;

    public AsciiImageController(AsciiImage model, AsciiImageView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.printAsciiImage(model.image());
    }
}
