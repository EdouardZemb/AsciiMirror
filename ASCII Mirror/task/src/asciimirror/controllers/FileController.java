package asciimirror.controllers;

import asciimirror.views.View;

import java.io.File;
import java.io.FileNotFoundException;

public class FileController extends Controller<File> {
    public FileController(File model, View view) {
        super(model, view);
    }

    public void updateViewDouble() throws FileNotFoundException {
        view.printTwice(model);
    }
}
