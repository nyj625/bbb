package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.type;
import info.JsonInfo;
import service.Type_service;

@Controller
@RequestMapping("Type")
public class Type_controller {
	@Autowired
	Type_service service;
	
@RequestMapping("index")
public void select(ModelMap map) {
	map.put("list", service.select());
}

@RequestMapping("delete")
public @ResponseBody JsonInfo delete(int id) {
	service.delete(id);
	return new JsonInfo(1, "");
}

@RequestMapping("edit")
public String edit(int id,ModelMap map) {
	type list=service.selectbyId(id);
	System.out.println(list.getName());
	map.put("list", list);
	map.put("id", id);
	return "Type/edit";
}


@RequestMapping("update")
public @ResponseBody JsonInfo update(type t) {
	service.update(t);
	return new JsonInfo(1, "");
}
}
