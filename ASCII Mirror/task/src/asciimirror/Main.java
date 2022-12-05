package asciimirror;

import asciimirror.controllers.FileController;
import asciimirror.controllers.FilePathController;
import asciimirror.models.FilePath;
import asciimirror.views.FilePathView;
import asciimirror.views.FileView;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input the file path:");
        Scanner scanner = new Scanner(System.in);
        FilePath filePathModel = new FilePath(scanner.nextLine());
        FilePathView filePathView = new FilePathView();
        FilePathController filePathController = new FilePathController(
                filePathModel,
                filePathView);
        FileController fileController = new FileController(
                filePathController.getFile(),
                new FileView()
        );
        try {
            fileController.updateViewDouble();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
        }
    }
}