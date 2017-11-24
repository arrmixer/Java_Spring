package com.AE.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortune implements FortuneService{
	private Random random = new Random();
	
	private ArrayList<String> listFiles = new ArrayList<>();
	

	String line = null;
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return readFile();
	}
	@PostConstruct
	private String readFile(){
		System.out.println(">> FileFortune: inside of FileFortune");
		StringBuilder sb = new StringBuilder();
		listFiles.add("fortune.txt");
		listFiles.add("fortune2.txt");
		listFiles.add("fortune3.txt");
		int index = random.nextInt(listFiles.size());
		try{
			FileReader fileReader = new FileReader(listFiles.get(index));
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine()) != null){
			
				sb.append(line);
			}
			
			
			
			// Always close files.
			bufferedReader.close();
			
		}catch(FileNotFoundException ex){
			System.out.println(ex);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sb.toString();
	}

}
