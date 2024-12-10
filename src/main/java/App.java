// основной класс
public class App {
    public static void main(String[] args) {
        // создание bulder
        DocBuilder builder = new DocBuilder();

        // расписываем документ
        Doc doc = builder
                .addHeader("Заголовок")        // добавление заголовка
                .addBodyText1("Текст 1")       // добавление первого текста
                .addSubheader("Подзаголовок")  // добавление подзаголовка
                .addBodyText2("Текст 2")       // добавление второго текста
                .build();                      // составляем документ

        // выводим документ
        System.out.println(doc);
    }
}
