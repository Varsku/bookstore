package fi.haagahelia.ohkete.bookstore.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class BookController {

    @RequestMapping("/index")
    public String hello() {
        return "hello";
    }
}
