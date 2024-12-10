// Builder класс
public class DocBuilder {
    private Doc doc;  // документ

    // конструктор, создает новый пустой документ
    public DocBuilder() {
        this.doc = new Doc();
    }

    // метод, добавляющий заголовок
    public DocBuilder addHeader(String header) {
        doc.setHeader(header);
        return this;  // возвращаем себя, чтобы можно было осуществить цепочку вызовов
    }

    // метод, добавляющий подзаголовок
    public DocBuilder addSubheader(String subheader) {
        doc.setSubheader(subheader);
        return this;  // возвращаем себя, чтобы можно было осуществить цепочку вызовов
    }

    // метод, добавляющий первый текст
    public DocBuilder addBodyText1(String bodyText1) {
        doc.setBodyText1(bodyText1);
        return this;  // возвращаем себя, чтобы можно было осуществить цепочку вызовов
    }

    // метод, добавляющий второй текст
    public DocBuilder addBodyText2(String bodyText2) {
        doc.setBodyText2(bodyText2);
        return this;  // возвращаем себя, чтобы можно было осуществить цепочку вызовов
    }

    // метод, собирающий документ
    public Doc build() {
        return doc;
    }
}
