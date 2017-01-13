package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
    	System.out.println("requestParam: " +name);
        model.addAttribute("name", name);
        return "greeting";
    }
    
    @RequestMapping("/webAutoConfig")
    public String webAutoConfig(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
    	System.out.println("requestParam: " +name);
        model.addAttribute("name", name);
        return "webAutoConfig";
    }
        
    @RequestMapping("/resources")
    public String resources(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
    	System.out.println("requestParam: " +name);
        model.addAttribute("name", name);
        return "resources";
    }     
    
    @RequestMapping("/webInf")
    public String webInf(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
    	System.out.println("requestParam: " +name);
        model.addAttribute("name", name);
        return "web-inf";
    }        


}