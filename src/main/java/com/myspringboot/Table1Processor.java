package com.myspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myspringboot.table1.Table1;
import com.myspringboot.table1.Repository1;

@SpringBootApplication
public class Table1Processor implements CommandLineRunner {
	public Table1Processor() {
		super();
	}

	@Autowired
	Repository1 obrcRepository;

	public static void main(String[] args) throws Exception {
		try {
			SpringApplication.run(Table1Processor.class);
		} catch (Exception e) {
			
		}
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
		 
		for (Table1 deviceStatue : obrcRepository.findAll()) {
			
			System.out.println(deviceStatue);
		}
	}

}
