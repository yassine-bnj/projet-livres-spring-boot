package com.yassine.livres.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yassine.livres.entities.Type;
import com.yassine.livres.service.TypeService;

@RestController
@RequestMapping("/api/types")
@CrossOrigin
public class TypeRESTController {
	
	@Autowired
    TypeService typeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Type> getAllTypes() {
	return typeService.getAllTypes();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Type getProduitById(@PathVariable("id") Long id) {
	return typeService.getType(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Type createProduit(@RequestBody Type livre) {
	return typeService.saveType(livre);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Type updateProduit(@RequestBody Type type) {
	return typeService.updateType(type);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("id") Long id)
	{
		typeService.deleteTypeById(id);
	}

}
