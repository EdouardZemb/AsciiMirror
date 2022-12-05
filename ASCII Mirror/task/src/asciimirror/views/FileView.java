package asciimirror.views;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileView extends View<File> {
    @Override
    public void print(File printable) throws FileNotFoundException {
        Scanner scanner = new Scanner(printable);
        while (scanner.hasNextLine())
            System.out.println(scanner.nextLine());
    }

    public void printTwice(File printable) throws FileNotFoundException {
        Scanner scanner = new Scanner(printable);
        List<String> fileLines = new ArrayList<>();
        int maxLength = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            fileLines.add(nextLine);
            maxLength = Math.max(maxLength, nextLine.length());
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String fileLine : fileLines) {
            String formattedLine = String.format("%-" + maxLength + "s", fileLine);
            stringBuilder.append(formattedLine + " | " + formattedLine + "\n");
        }
        System.out.println(stringBuilder);
    }
}
