package Uzichaem_Java;

public class BooksTestDrive {
    public static void main(String[] args) {
        Books [] myBooks = new Books [3];
        int x = 0;

        myBooks[0] = new Books(); // Создаем объекты Book!
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "Плоды Java";
        myBooks[1].title = "Java Гэтсби";
        myBooks[2].title = "Сборник рецептов по Java";

        myBooks[0].author = "Думэн";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";

        while (x < 3){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;

        }
    }
}
