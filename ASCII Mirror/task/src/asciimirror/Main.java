package asciimirror;

import asciimirror.controllers.AsciiImageController;
import asciimirror.models.AsciiImage;
import asciimirror.views.AsciiImageView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input the file path:");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        System.out.println(filePath);

        AsciiImage model = new AsciiImage(
                new StringBuilder("""
                            ^__^
                    _______/(oo)
                /\\/(       /(__)
                   | w----||   \s
                   ||     ||   \s
                   """));

        AsciiImageView view = new AsciiImageView();
        AsciiImageController controller = new AsciiImageController(model, view);

        controller.updateView();
    }


}