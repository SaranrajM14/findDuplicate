package com.example.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.Student;
import com.example.springboot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List getDuplicateCount(String name) {
		List<Student> listduplicate=studentRepository.findByStudentName(name);
		int count=1;
		Student stu=null;
		//listduplicate.stream().filter((p1,p2)->p1.equals(p2)).collect(Collectors.toList());
		if(listduplicate.size()<2 ) {
			stu=listduplicate.get(0);
			
		}
		for(int i=0;i<listduplicate.size()-1;i++) {
			if((listduplicate.get(i)).equals(listduplicate.get(i+1))){
				count++;
				stu=listduplicate.get(i);
			}
		}
		
		List ret=new ArrayList();	
		ret.add(stu);
		ret.add(count);
		return ret;
	}

}
