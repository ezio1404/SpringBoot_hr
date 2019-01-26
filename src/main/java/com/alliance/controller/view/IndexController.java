package com.alliance.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alliance.entity.Customer;

@Controller(value = "indexController")
@RequestMapping(value = "/")
public class IndexController {

	@RequestMapping(method = RequestMethod.GET)
	public String getCustomerList(ModelMap map, Customer searchFilter) {
		return "index";
	}
}
