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
//����û���Ϣ
public int addperson(Person person){	
	return personMapper.insert(person);
}
//ͨ��id�����в�ѯ
public Person findPersonByid(Integer id){
	return  personMapper.selectByPrimaryKey(id);
}
//��ѯ�������ݵĽ����
public List<Person>findpersonlsit(){
	PersonExample example=new PersonExample();
	return personMapper.selectByExample(example);
}
//�������Ĳ�ѯ
public List<Person>findbyprorerty(Person person){
	PersonExample example=new PersonExample();
	Criteria p=example.createCriteria();
	if(!"".equals(person.getName()))
		p.andNameLike("%"+person.getName()+"%");
	return personMapper.selectByExample(example);
}
//�޸��û���Ϣ
public int personupdatebyid(Person person){
	return personMapper.updateByPrimaryKey(person);
	
}

}
