import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class WordSearchRecursive {
    static ArrayList<File> toReturn=new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter path:");
        String path=scanner.nextLine();
        System.out.println("Enter specified word: ");
        String wordToSearch=scanner.nextLine();

        searchWordInFiles(path,wordToSearch);

        for(File file:toReturn){
            System.out.println(file.getAbsolutePath()+" size="+file.length());
        }

        //String path="/Users/macbookair/Desktop/KeywordsAndExpressions/src/folder";
        //JavaEE is the best program

    }

    private static ArrayList<File> searchWordInFiles(String path, String word) {
        File directory = new File(path);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path:");
            return null;
        }
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            if (line.contains(word)) {
                                System.out.println("Found '" + word + "' in file: " + file.getAbsolutePath());
                                toReturn.add(file);
                            }
                        }
                    } catch (IOException e) {
                        System.out.println("Error reading file: " + file.getAbsolutePath());
                    }
                } else if (file.isDirectory()) {
                        searchWordInFiles(file.getPath(), word); // Recursive call for subdirectories
                }
            }
        }
        // sortirane spored razmera
        Comparator<File> comparator = new Comparator<File>() {
            @Override
            public int compare(File file1, File file2) {
                long size1 = file1.length();
                long size2 = file2.length();
                return Long.compare(size1, size2);
            }
        };
        toReturn.sort(comparator);
        return toReturn;
    }
}
