package chapter15;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Files {
    public static void main(String[] args) {
        Path path = Paths.get("a/b/c/../../");
        System.out.println("filename:: "+path.getFileName());
        System.out.println("file System:: "+path.getFileName());
        System.out.println("normalized:: "+path.normalize());
        System.out.println("root:: "+path.getRoot());
        System.out.println("path ends with:: "+path.endsWith(".java"));
    }
}
