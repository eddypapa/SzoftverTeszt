package hu.uni_miskolc.hu.shopingCart.controller;

import java.util.Collection;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import hu.uni_miskolc.hu.shopingCart.model.*;

@Controller
@RequestMapping("/items")
public class CartController {
	
	Cart cart;
	Item items;
	
	@RequestMapping(value = {"/"}, method = {RequestMethod.GET}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Collection<Item> getItems(){
        return cart.getItems();
    }
	
    //@RequestMapping(value={"/additem"}, method={RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    //@ResponseBody
    //public 
    
    /*@DeleteMapping("/items/{id}")
    public ResponseEntity deleteCustomer(@PathVariable int id) {
    		if (null == items.get ) {
    				return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}
    		return new ResponseEntity(id, HttpStatus.OK);
    }*/
    

}
