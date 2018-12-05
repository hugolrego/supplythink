package org.br.supplythink.system;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.br.supplythink.integration.Upload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
class WelcomeController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/changelanguage")
    public String language() {
        return "welcome";
    }
    
    
    /**
     * telas 
     * @return
     */
    @RequestMapping(method=RequestMethod.GET, path= "/blank")
    public String blank() {
        return "blank";
    }    

    @RequestMapping(method=RequestMethod.GET, path= "/interface")
    public String interfaceFlow(Model model) {
    	
    	List<Upload> interfaces = new ArrayList<Upload>();
		Calendar data = Calendar.getInstance();
		Random gerador = new Random();
		
//		data.add(Calendar.DATE, -50);
    	for(int i = 0; i < 50; i++){
    		Upload e = new Upload(data.getTime(), gerador.nextInt(2), gerador.nextInt(2), gerador.nextInt(2), gerador.nextInt(2));
    		data.add(Calendar.DATE, -1);
    		interfaces.add(e);
    	}
    	
        model.addAttribute("interfaces", interfaces);
    	
        return "interface";
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
    
    @RequestMapping(method=RequestMethod.GET, path= "/typography")
    public String typography() {
        return "typography";
    }    
    
    
}
