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
        List<String> formattedFileLines = new ArrayList<>();
        for (String fileLine : fileLines) {
            String formattedLine = String.format("%-" + maxLength + "s", fileLine);
            formattedFileLines.add(formattedLine);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String formattedFileLine : formattedFileLines) {
            char[] characterList = formattedFileLine.toCharArray();
            for (int i = 0; i < characterList.length; i++) {
                char c = characterList[i];
                switch (c) {
                    case '>' -> characterList[i] = '<';
                    case '<' -> characterList[i] = '>';
                    case '[' -> characterList[i] = ']';
                    case ']' -> characterList[i] = '[';
                    case '{' -> characterList[i] = '}';
                    case '}' -> characterList[i] = '{';
                    case '(' -> characterList[i] = ')';
                    case ')' -> characterList[i] = '(';
                    case '/' -> characterList[i] = '\\';
                    case '\\' -> characterList[i] = '/';
                }
            }
            StringBuilder lineBuilder = new StringBuilder(String.valueOf(characterList));
            stringBuilder
                    .append(formattedFileLine)
                    .append(" | ")
                    .append(lineBuilder.reverse())
                    .append("\n");
        }
        System.out.println(stringBuilder);
    }
}
