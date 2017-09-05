package fi.haagahelia.ohkete.bookstore.domain;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
