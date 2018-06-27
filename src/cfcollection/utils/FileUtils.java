package cfcollection.utils;

public class FileUtils {
    public static String sourceExtension(String language) {
        if (language.contains("C++")) {
            return ".cpp";
        }
        if (language.contains("JavaScript")) {
            return ".js";
        }
        if (language.contains("Java")) {
            return ".java";
        }
        if (language.contains("Py")) {
            return ".py";
        }
        return "";
    }
}
