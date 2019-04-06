import java.io.FileNotFoundException;

public class MyException extends FileNotFoundException {

    private String fileName;

    MyException(String fileName) {
            this.fileName = fileName;
    }

    void printRussianMessage() {
            System.out.println("Файл загрузки локальных данных '" + fileName + "' не найден!");
    }
}
