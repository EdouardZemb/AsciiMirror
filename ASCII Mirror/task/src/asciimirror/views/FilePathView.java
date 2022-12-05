package asciimirror.views;

import asciimirror.models.FilePath;

import java.io.FileNotFoundException;

public class FilePathView extends View<FilePath> {
    @Override
    public void print(FilePath printable) {
        System.out.println(printable.path());
    }

    @Override
    public void printTwice(FilePath printable) throws FileNotFoundException {

    }
}
