package asciimirror.controllers;

import asciimirror.views.View;

import java.io.File;

public class FileController extends Controller<File> {
    public FileController(File model, View view) {
        super(model, view);
    }
}
