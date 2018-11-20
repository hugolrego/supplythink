package org.br.supplythink.stocklocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class StockLocationController {

	    private StockLocationRepository stocklocationRepository;

	    @Autowired
	    public StockLocationController(StockLocationRepository stocklocationRepository) {
	        this.stocklocationRepository = stocklocationRepository;
	    }	    

	    @InitBinder
	    public void setAllowedFields(WebDataBinder dataBinder) {
	        dataBinder.setDisallowedFields("id");
	    }
	    
	    @RequestMapping(path = "/stocklocation", method = RequestMethod.GET)
	    public String getAllProducts(Model model) {
	        model.addAttribute("stocklocations", stocklocationRepository.findAll());
	        model.addAttribute("groupsStockLocation", GroupStockLocationEnum.values());
	        return "stocklocation";
	    }
	    
	    @RequestMapping(path = "/stocklocation/add", method = RequestMethod.GET)
	    public String createProduct(Model model) {
	        model.addAttribute("stocklocation", new StockLocation());
	        return "edit";
	    }

	    @RequestMapping(path = "products", method = RequestMethod.POST)
	    public String saveProduct(StockLocation product) {
	    	stocklocationRepository.save(product);
	        return "redirect:/";
	    }

	    
	    @RequestMapping(path = "/stocklocation/edit/{id}", method = RequestMethod.GET)
	    public String editProduct(Model model, @PathVariable(value = "id") int id) {
	        model.addAttribute("product", stocklocationRepository.findById(id));
	        return "edit";
	    }

	    @RequestMapping(path = "/stocklocation/delete/{id}", method = RequestMethod.GET)
	    public String deleteProduct(@PathVariable(name = "id") int id) {
	    	stocklocationRepository.delete(id);
	        return "redirect:/stocklocation";
	    }

}
