package vu.example.spring2.moto.motocatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vu.example.spring2.moto.motocatalog.bean.Brand;
import java.util.ArrayList;

import java.util.List;
import vu.example.spring2.moto.motocatalog.bean.Motercycle;


@Controller
public class MotosController {


    @RequestMapping("/hello")
    public String hello(@RequestParam String name,Model model){
        model.addAttribute("name", name);
        return "test";
    }
    @GetMapping("/motos")
    public String motos(Model model) {
        //ブランド
        List<Brand> brands = new ArrayList<>();
        brands.add(new Brand("01","HONDA"));
        brands.add(new Brand("02","KAWASAKI"));
        //new Brand("01","test");
        //biker
        List<Motercycle> motos = new ArrayList<>();
        motos.add(new Motercycle(1,"GB350",800,1,"空冷",500000,"いい音",new Brand("01","HONDA"),1,null,null));
        motos.add(new Motercycle(2,"GB350",800,2,"水冷",500000,"いい音",new Brand("01","HONDA"),1,null,null));
        
        model.addAttribute("brands",brands);
        model.addAttribute("motos",motos);
        
        //motos.add(new Brand("02","KAWASAKI"));
        
        return "moto_list";
    }
      

}
