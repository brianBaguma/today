package Project.elibrary.Controller;

//import ch.qos.logback.core.model.Model;
import org.springframework.ui.Model;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        //model.addAttribute("Hello World");
        //model.addAtrribute("title","brian's elibrary");
        return "home";
    }



}
