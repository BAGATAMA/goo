package gag.bagatama.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {

    private static final Logger log = Logger.getLogger(HomeController.class);

    @RequestMapping("/home")
    public String homePage(HttpServletRequest request, Model model){
        String nowtime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        log.info("a new comer! at " + nowtime);
        model.addAttribute("nowtime",nowtime);
        return "home";
    }
}
