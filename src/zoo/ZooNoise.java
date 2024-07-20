package zoo;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class ZooNoise {
    private List<Speakable> noise;
    private FileOperations fileManager;

    public ZooNoise() {
        noise = new ArrayList<>();
        noise.add(new Dog("Бобик"));
        noise.add(new Cat("Мурзик"));
        noise.add(new Radio());
        fileManager = new FileManager();
    }

    public void speakAll() {
        for (Speakable speakable : noise) {
            speakable.speak();
        }
    }

    public void saveToFile(String filename) {
        try {
            fileManager.writeToFile(noise, filename);
            System.out.println("Данные успешно сохранены в файл: " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении данных: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        try {
            noise = fileManager.readFromFile(filename);
            System.out.println("Данные успешно загружены из файла: " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при загрузке данных: " + e.getMessage());
        }
    }
}
