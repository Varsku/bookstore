package fi.haagahelia.ohkete.bookstore.web;


import fi.haagahelia.ohkete.bookstore.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class BookController {

    @Autowired
    private BookRepository repository;

    @RequestMapping("/index")
    public String hello() {
        return "hello";
    }
}
