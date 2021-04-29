package bogdanbrl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "", "index", "index.html"})
    public String index(Model model){
        String indexPage = "This is a text received from controller as an attribute";
        model.addAttribute("indexPage", indexPage);
        return "index";
    }

    @RequestMapping("/oups")
    public String oups(){
        return "notimplemented";
    }
}
