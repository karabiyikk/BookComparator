import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPageNumber() - o1.getPageNumber();
            }
        });
        books.add(new Book("Vadideki Zambak ", 205, "Honore de Balzac", 1835));
        books.add(new Book("Sefiller", 400, "Victor Hugo", 1862));
        books.add(new Book("Suç ve Ceza", 432, " Fyodor Mihayloviç Dostoyevski", 1866));
        books.add(new Book("Şeker Portakalı", 200, "Jose Mauro De Vasconcelos", 1968));
        books.add(new Book("Ana", 451, "Maksim Gorki", 1906));

        Iterator<Book> itr = books.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().getName());
        }
        System.out.println();
        System.out.println();
        Iterator<Book> page = books.iterator();
        while (page.hasNext()) {
            System.out.println(page.next().getPageNumber());
        }
    }
}
