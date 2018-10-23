package com.scce.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scce.Service.PersonService;
import com.scce.entity.Person;

@Controller
@RequestMapping(value="/")
public class PersonAction {
@Autowired
private PersonService service;
@RequestMapping(value="/adddate")
//添加用户的方法
public String addperson(@ModelAttribute("person") Person person){
	service.addperson(person);
	return "/index.jsp";
	/*return "forward:listall";*/
	/*return  "redirect:listall";*/
}
@RequestMapping(value="/serchPerson")
//通过id进行用户搜索
public String serch(@ModelAttribute("person")Person person,HttpServletRequest request){
	request.setAttribute("person",service.findPersonByid(person.getId()));
	return "/details.jsp";	
}
@RequestMapping(value="/listperson")
//查询所有用户信息
public String listall(HttpServletRequest request){
	request.setAttribute("perlist", service.findpersonlsit());
	return "/listall.jsp";
}
@RequestMapping(value="/linkfind")
//迷糊查询
public String sercherlike(@ModelAttribute("person")Person person,HttpServletRequest request){
	request.setAttribute("perlist", service.findbyprorerty(person));
	request.setAttribute("perlist", service.findpersonlsit());
	return "/listall.jsp";
}
@RequestMapping(value="/updatainfor")
//修改用户信息
public String updatperson(@ModelAttribute("person")Person person){
	service.personupdatebyid(person);
	return "/update.jsp";
}
}
