package task12;

import java.util.ArrayList;
import java.util.Collections;


public class TaskTwelve {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Статус", "Иван Дрёмин", 1000000, "102"));
        books.add(new Book("Статус", "Иван Дрёмин", 2000000, "110"));
        books.add(new Book("Статус", "Иван Дрёмин", 20, "112"));
        books.add(new Book("Факт", "Иван Дрёмин", 250, "113"));
        books.add(new Book("Бедному", "Иван Дрёмин", 250, "120"));
        books.add(new Book("Скрижаль", "Иван Дрёмин", 200, "101"));
        books.add(new Book("Случай", "Маратик Сквозьбаб", 300, "107"));
        books.add(new ProgrammerBook("ИТ переоценено. Почему всем нужно идти на завод: мнение эксперта",
                "Даниил Шевченкович", 1, "108", "Русский", 3));
        books.add(new ProgrammerBook("Java для маленьких и тупых ч.2 - переменные в Java на примере коробки",
                "Иван Макитянский", 40, "103", "Русский", 1));
        books.add(new ProgrammerBook("Блокчейн на примере лимона",
                "Иван Макитянский", 800, "116", "Русский", 5));
        books.add(new ProgrammerBook("От мойщика туалетов в Subway до сениор спринг разработчика - мой путь",
                "Владислав Костик", 228, "114", "English", 1));
        books.add(new ProgrammerBook("Программирование на японском",
                "Иван Грук1н", 1234, "115", "Корейский", 1));
        books.add(new Book("Статус", "Альберт Нурминский", 100, "105"));

        System.out.println("До сортировки\n");
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\n\n\nСортировка по ИСБН\n");
        Collections.sort(books);
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\n\n\nСортировка по названию\n");
        books.sort(Book.byName);
        for (Book book : books) {
            System.out.println(book.toString());
        }


        System.out.println("\n\n\nСортировка по названию а потом по автору\n");
        books.sort(Book.byNameAndAuthor);
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\n\n\nСортировка по автору а потом по названию\n");
        books.sort(Book.byAuthorAndName);
        for (Book book : books) {
            System.out.println(book.toString());
        }


        System.out.println("\n\n\nСортировка по автору \n");
        books.sort(Book.byAuthor);
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\n\n\nСортировка по цене \n");
        books.sort(Book.byPrice);
        for (Book book : books) {
            System.out.println(book.toString());
        }


        System.out.println("\n\n\nСортировка по автору, названию и цене \n");
        books.sort(Book.byAuthorAndNameAndPrice);
        for (Book book : books) {
            System.out.println(book.toString());
        }


    }


}


