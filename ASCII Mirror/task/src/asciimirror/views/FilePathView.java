package asciimirror.views;

import asciimirror.models.FilePath;

public class FilePathView extends View<FilePath> {
    @Override
    public void print(FilePath printable) {
        System.out.println(printable.path());
    }
}
