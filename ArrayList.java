import java.io.*;
import java.util.ArrayList;
import java.util.List;

class MyClass implements Serializable {
    private static final long serialVersionUID = 1L; // For version control
    private String data;

    public MyClass(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

public class WriteCustomClassArrayListToFile {
    public static void main(String[] args) {
        // Create an ArrayList of custom class type
        List<MyClass> customArrayList = new ArrayList<>();
        customArrayList.add(new MyClass("Element 1"));
        customArrayList.add(new MyClass("Element 2"));
        customArrayList.add(new MyClass("Element 3"));

        // Specify the file path
        String filePath = "output_custom_serialized.txt";

        // Write ArrayList to the file using ObjectOutputStream
        writeCustomArrayListToFile(customArrayList, filePath);

        System.out.println("Custom ArrayList has been written to the file: " + filePath);
    }

    private static void writeCustomArrayListToFile(List<MyClass> customArrayList, String filePath) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            // Write the ArrayList to the file
            objectOutputStream.writeObject(customArrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}