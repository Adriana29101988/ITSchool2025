package session_18_Streams.Homework;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class publishedBooks {
        public static void main(String[] args) {
            List<Book> books = List.of(
                    new Book("1984", "George Orwell", 1949),
                    new Book("Animal Farm", "George Orwell", 1945),
                    new Book("The Hobbit", "J.R.R. Tolkien", 1937),
                    new Book("The Fellowship of the Ring", "J.R.R. Tolkien", 1954),
                    new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997),
                    new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling", 2000)
            );

            Map<String, List<String>> booksByAuthor = books.stream()
                    .filter(book -> book.getYear() < 2000)
                    .collect(Collectors.groupingBy(
                            Book::getAuthor,
                            Collectors.mapping(
                                    Book::getTitle,
                                    Collectors.toList()
                            )
                    ));
            System.out.println(booksByAuthor);
        }
    }
