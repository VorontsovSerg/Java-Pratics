import java.io.File;
import java.util.ArrayList;
import java.util.List;

class DirectoryListing {
    public static List<String> getFirstFiveElements(String directoryPath) {
        File dir = new File(directoryPath);
        File[] files = dir.listFiles();
        List<String> firstFiveElements = new ArrayList<>();

        if (files != null) {
            for (int i = 0; i < Math.min(5, files.length); i++) {
                firstFiveElements.add(files[i].getName());
            }
        }
        return firstFiveElements;
    }
}
