package com.scce.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scce.dao.PersonMapper;
import com.scce.entity.Person;
import com.scce.entity.PersonExample;
import com.scce.entity.PersonExample.Criteria;
/**
 * 
 * @author Joy
 *
 */
@Service()
public class PersonService {
@Autowired
private PersonMapper personMapper;
//添加用户信息
public int addperson(Person person){	
	return personMapper.insert(person);
}
//通过id机进行查询
public Person findPersonByid(Integer id){
	return  personMapper.selectByPrimaryKey(id);
}
//查询所有数据的结果集
public List<Person>findpersonlsit(){
	PersonExample example=new PersonExample();
	return personMapper.selectByExample(example);
}
//多条件的查询
public List<Person>findbyprorerty(Person person){
	PersonExample example=new PersonExample();
	Criteria p=example.createCriteria();
	if(!"".equals(person.getName()))
		p.andNameLike("%"+person.getName()+"%");
	return personMapper.selectByExample(example);
}
//修改用户信息
public int personupdatebyid(Person person){
	return personMapper.updateByPrimaryKey(person);
	
}

}
