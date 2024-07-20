package zoo;

import java.io.*;
import java.util.List;

public interface FileOperations {
    void writeToFile(List<Speakable> objects, String filename) throws IOException;
    List<Speakable> readFromFile(String filename) throws IOException, ClassNotFoundException;
}