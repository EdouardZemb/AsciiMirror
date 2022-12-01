package asciimirror.controllers;

import asciimirror.models.FilePath;
import asciimirror.views.FilePathView;

import java.io.File;

public class FilePathController extends Controller<FilePath> {
    public FilePathController(FilePath model, FilePathView view) {
        super(model, view);
    }

    public File getFile() {
        return new File(model.path());
    }
}
