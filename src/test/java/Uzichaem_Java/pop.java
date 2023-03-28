package Uzichaem_Java;

public class pop {
    public class Main {
        public void main(String[] args) {
            IAuthor author = new FantasyAuthor();
            IPublisher publisher = new OldPublisher();
            Book book = new Book(author, publisher);
            book.printBookInfo();
        }
    }

    // интерфейс для издательств
    public interface IPublisher {
        int foundationYear();
    }

    public class OldPublisher implements IPublisher {
        @Override
        // метод, который возвращает год основания издательства
        public int foundationYear() {
            return 1950;
        }
    }

    // интерфейс для авторов
    public interface IAuthor {
        String getName();
    }

    // класс для автора фентези
    public class FantasyAuthor implements IAuthor {
        @Override
        public String getName() {
            return "Фрэнк Герберт";
        }
    }

    public class Book {
        // переменные author и publisher внутри класса
        private IAuthor author;
        private IPublisher publisher;

        public Book(IAuthor author, IPublisher publisher) {

        }

        // здесь допиши внедрение зависимости author и publisher через конструктор


        // методы из классов author и publisher
        public void printBookInfo() {

            System.out.println("Автор: " + author.getName());
            this.author = author;
            System.out.println("Год основания издательства: " + publisher.foundationYear());
            this.publisher = publisher;
        }
    }
}
