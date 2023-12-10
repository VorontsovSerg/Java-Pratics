import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Пример конвертации массива в список
        String[] stringArray = {"apple", "banana", "orange"};
        List<String> stringList = ArrayToListConverter.convertArrayToList(stringArray);
        System.out.println("Array to List: " + stringList);

        // Пример хранения массива любых типов данных
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArray<Integer> genericArray = new GenericArray<>(intArray);
        System.out.println("Element at index 2: " + genericArray.getElementAtIndex(2));

        // Пример получения содержимого каталога
        String directoryPath = "C:\\Users\\User\\Desktop\\123421";
        List<String> filesInDirectory = DirectoryListing.getFirstFiveElements(directoryPath);
        System.out.println("Files in directory: " + filesInDirectory);

        // Пример создания коллекций
        Solution<String, Integer, String> solution = new Solution<>();
        List<String> newList = solution.newArrayList("one", "two", "three");
        System.out.println("New List: " + newList);

        Set<String> newSet = solution.newHashSet("apple", "banana", "orange");
        System.out.println("New Set: " + newSet);

        Integer[] keys = {1, 2, 3};
        String[] values = {"one", "two", "three"};
        Map<Integer, String> newMap = solution.newHashMap(keys, values);
        System.out.println("New Map: " + newMap);
    }
}
