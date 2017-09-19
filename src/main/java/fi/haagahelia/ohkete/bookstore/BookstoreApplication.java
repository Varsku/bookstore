package fi.haagahelia.ohkete.bookstore;

import fi.haagahelia.ohkete.bookstore.domain.Book;
import fi.haagahelia.ohkete.bookstore.domain.BookRepository;
import fi.haagahelia.ohkete.bookstore.domain.User;
import fi.haagahelia.ohkete.bookstore.domain.UserRepository;
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
	public CommandLineRunner book(BookRepository repository, UserRepository urepository) {
		return (args) -> {
			log.info("save a couple of books");
			repository.save(new Book("Voihan Java", "Ville Peltonen", "12345678-12", 2012));
			repository.save(new Book("Parasta koskaan", "Jokke Jokunen", "87654321-21", 2013));


			User user1 = new User("user", "$2a$10$6zqO3c/k/cp7G6bSg1lv0ebGLXUS3JqUgGI7nIsFvvFYyeenplvK.", "USER");
			User user2 = new User("admin", "$2a$10$OHRy4hu2WbDU6jR..LtXXuuFfnt1fW4jayHr2YmZepnR8qCy/JobC", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);



			log.info("fetch all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}
			log.info("");
		};


	}
}