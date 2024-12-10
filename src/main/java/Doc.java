// класс - документ
public class Doc {
    private String header;        // заголовок
    private String subheader;     // подзаголовок
    private String text1;     // первый текст
    private String text2;     //вВторой текст

    // сеттеры для каждого модуля в документе
    public void setHeader(String header) {
        this.header = header;
    }

    public void setSubheader(String subheader) {
        this.subheader = subheader;
    }

    public void setBodyText1(String text1) {
        this.text1 = text1;
    }

    public void setBodyText2(String text2) {
        this.text2 = text2;
    }

    // метод, выводящий документ в заданном формате
    public void print() {
        if (header != null) {
            System.out.println(header);  // вывод заголовка
        }
        if (text1 != null) {
            System.out.println(text1);  // вывод первого текста
        }
        if (subheader != null) {
            System.out.println(subheader);  // вывод подзаголовка
        }
        if (text2 != null) {
            System.out.println(text2);  // вывод второго текста
        }
    }

    // переопределение toString для вывода в заданном порядке
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (header != null) {
            sb.append(header).append("\n");
        }
        if (text1 != null) {
            sb.append(text1).append("\n");
        }
        if (subheader != null) {
            sb.append(subheader).append("\n");
        }
        if (text2 != null) {
            sb.append(text2).append("\n");
        }
        return sb.toString();
    }
}
