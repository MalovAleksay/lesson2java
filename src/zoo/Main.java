package zoo;

public class Main {
    public static void main(String[] args) {
        ZooNoise zoo = new ZooNoise();

        System.out.println("Изначальные звуки зоопарка:");
        zoo.speakAll();

        zoo.saveToFile("zoo_data.ser");

        // Создаем новый объект ZooNoise и загружаем данные из файла
        ZooNoise loadedZoo = new ZooNoise();
        loadedZoo.loadFromFile("zoo_data.ser");

        System.out.println("\nЗвуки зоопарка после загрузки из файла:");
        loadedZoo.speakAll();
    }
}