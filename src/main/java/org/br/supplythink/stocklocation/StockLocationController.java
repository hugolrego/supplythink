package org.br.supplythink.stocklocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class StockLocationController {

	    private StockLocationRepository stockLocationRepository;

	    @Autowired
	    public void setProductRepository(StockLocationRepository stockLocationRepository) {
	        this.stockLocationRepository = stockLocationRepository;
	    }

	    @RequestMapping(path = "/stockLocation/add", method = RequestMethod.GET)
	    public String createProduct(Model model) {
	        model.addAttribute("stockLocation", new StockLocation());
	        return "edit";
	    }

	    @RequestMapping(path = "products", method = RequestMethod.POST)
	    public String saveProduct(StockLocation product) {
	    	stockLocationRepository.save(product);
	        return "redirect:/";
	    }

	    @RequestMapping(path = "/stockLocation", method = RequestMethod.GET)
	    public String getAllProducts(Model model) {
	        model.addAttribute("products", stockLocationRepository.findAll());
	        return "products";
	    }
	    
	    @RequestMapping(path = "/stockLocation/edit/{id}", method = RequestMethod.GET)
	    public String editProduct(Model model, @PathVariable(value = "id") int id) {
	        model.addAttribute("product", stockLocationRepository.findById(id));
	        return "edit";
	    }

	    @RequestMapping(path = "/stockLocation/delete/{id}", method = RequestMethod.GET)
	    public String deleteProduct(@PathVariable(name = "id") int id) {
	    	stockLocationRepository.delete(id);
	        return "redirect:/stockLocation";
	    }

}
