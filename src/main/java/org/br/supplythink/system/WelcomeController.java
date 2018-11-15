package org.br.supplythink.system;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
class WelcomeController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping(method=RequestMethod.GET, path= "/flot")
    public String flot() {
        return "flot";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/error")
    public String error() {
        return "error";
    }    
    
    @RequestMapping(method=RequestMethod.GET, path= "/entrar")
    public String entrar() {
        return "entrar";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/pages")
    public String pages() {
        return "pages";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/data")
    public String data() {
        return "data";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/dist")
    public String dist() {
        return "dist";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/js")
    public String js() {
        return "js";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/less")
    public String less() {
        return "less";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/vendor")
    public String vendor() {
        return "vendor";
    }    
    
}
