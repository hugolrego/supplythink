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
    
    /**
     * telas 
     * @return
     */
    @RequestMapping(method=RequestMethod.GET, path= "/blank")
    public String blank() {
        return "blank";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/buttons")
    public String buttons() {
        return "buttons";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/entrar")
    public String entrar() {
        return "entrar";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/error")
    public String error() {
        return "error";
    }    
    
    @RequestMapping(method=RequestMethod.GET, path= "/flot")
    public String flot() {
        return "flot";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/forms")
    public String forms() {
        return "forms";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/grid")
    public String grid() {
        return "grid";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/icons")
    public String icons() {
        return "icons";
    }   
    
    @RequestMapping(method=RequestMethod.GET, path= "/morris")
    public String morris() {
        return "morris";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/Navigator")
    public String navigator() {
        return "navigator";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/notifications")
    public String notifications() {
        return "notifications";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/panels-wells")
    public String panelswells() {
        return "panels-wells";
    }  
    
    @RequestMapping(method=RequestMethod.GET, path= "/stocklocation")
    public String stocklocation() {
        return "stocklocation";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/typography")
    public String typography() {
        return "typography";
    }    
    
    
}
