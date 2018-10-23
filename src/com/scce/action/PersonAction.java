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
//����û��ķ���
public String addperson(@ModelAttribute("person") Person person){
	service.addperson(person);
	return "/index.jsp";
	/*return "forward:listall";*/
	/*return  "redirect:listall";*/
}
@RequestMapping(value="/serchPerson")
//ͨ��id�����û�����
public String serch(@ModelAttribute("person")Person person,HttpServletRequest request){
	request.setAttribute("person",service.findPersonByid(person.getId()));
	return "/details.jsp";	
}
@RequestMapping(value="/listperson")
//��ѯ�����û���Ϣ
public String listall(HttpServletRequest request){
	request.setAttribute("perlist", service.findpersonlsit());
	return "/listall.jsp";
}
@RequestMapping(value="/linkfind")
//�Ժ���ѯ
public String sercherlike(@ModelAttribute("person")Person person,HttpServletRequest request){
	request.setAttribute("perlist", service.findbyprorerty(person));
	request.setAttribute("perlist", service.findpersonlsit());
	return "/listall.jsp";
}
@RequestMapping(value="/updatainfor")
//�޸��û���Ϣ
public String updatperson(@ModelAttribute("person")Person person){
	service.personupdatebyid(person);
	return "/update.jsp";
}
}
