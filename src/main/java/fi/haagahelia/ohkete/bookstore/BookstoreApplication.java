package fi.haagahelia.ohkete.bookstore;

import fi.haagahelia.ohkete.bookstore.domain.Book;
import fi.haagahelia.ohkete.bookstore.domain.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookstoreApplication {


	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}


	@Bean
	public CommandLineRunner book(BookRepository repository) {
		return (args) -> {
			log.info("save a couple of books");
			repository.save(new Book("Voihan Java", "Ville Peltonen", "12345678-12", 2012));
			repository.save(new Book("Parasta koskaan", "Jokke Jokunen", "87654321-21", 2013));

			log.info("fetch all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}
			log.info("");
		};
	}
}