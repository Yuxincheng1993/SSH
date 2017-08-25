package com.company.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.dao.pojo.Product;
import com.company.service.iservice.IProductService;

@Controller("productAction")
@Scope("prototype")
@RequestMapping("productmvc")
public class ProductAction {
	@Autowired
	@Qualifier("productService")
	private IProductService productService;

	@RequestMapping("saveinit")
	public String saveinit(){
		return "product_save";
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@ModelAttribute Product product) {
		String msg = productService.save(product);
		return "success".equals(msg) ? "redirect:findall" : "error";
	}
	
	//实现精确查询和数据更新功能
	@RequestMapping(value = "findbyid", method = RequestMethod.GET)
	public String findByIdGET(@RequestParam("pid") int id, Map<String, Object> model) {
		Product product = productService.findById(id);
		if (product != null) {
			model.put("productFromServer", product);
			return "product_update";
		} else {
			return "error";
		}
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(@ModelAttribute Product product) {
		String msg = productService.update(product);
		return "success".equals(msg) ? "redirect:findall" : "error";
	}

	@RequestMapping("delete")
	public String delete(@ModelAttribute Product product) {
		String msg = productService.delete(product);
		return "success".equals(msg) ? "redirect:findall" : "error";
	}

	@RequestMapping("findall")
	public String findAll(Map<String, Object> model) {
		List<Product> products = productService.findAll();
		System.out.println(products);
		model.put("productListFromServer", products);
		return (products != null && products.size() > 0) ? "product_findAll" : "error";
	}



	@RequestMapping(value = "findbyid", method = RequestMethod.POST)
	public String findByIdPOST(@RequestParam("pid") int id, Map<String, Object> model) {
		Product product = productService.findById(id);
		if (product != null) {
			List<Product> products = new ArrayList<Product>();
			products.add(product);
			model.put("productListFromServer", products);
			return "product_findAll";
		} else {
			return "error";
		}
	}

	@RequestMapping(value = "findbyname", method = RequestMethod.POST)
	public String findByName(@RequestParam("pname") String name, Map<String, Object> model) {
		List<Product> products = productService.findByName(name);
		System.out.println(products);
		model.put("productListFromServer", products);
		return (products != null && products.size() > 0) ? "product_findAll" : "error";
	}

}
