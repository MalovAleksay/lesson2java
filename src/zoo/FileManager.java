package zoo;

import java.io.*;
import java.util.List;

public class FileManager implements FileOperations {
    @Override
    public void writeToFile(List<Speakable> objects, String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(objects);
        }
    }

    @Override
    public List<Speakable> readFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<Speakable>) ois.readObject();
        }
    }
}