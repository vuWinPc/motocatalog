package vu.example.spring2.moto.motocatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;


@SpringBootApplication
@RestController
public class MotocatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotocatalogApplication.class, args);
	}
    @RequestMapping("/")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("moto_list");
        mav.addObject("title", "Groovy templates");
        mav.addObject("msg", "レイアウト機能を使ったサンプルです。");
        return mav;
    }
    

}
