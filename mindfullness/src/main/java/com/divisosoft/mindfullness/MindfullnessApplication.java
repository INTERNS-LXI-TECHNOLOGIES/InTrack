package com.divisosoft.mindfullness;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.divisosoft.mindfullness.model.Activities;
import com.divisosoft.mindfullness.repository.ActivitesRepository;

@SpringBootApplication
public class MindfullnessApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MindfullnessApplication.class, args);
	}

	@Autowired
	private ActivitesRepository activitesRepository;

	@Autowired
	private ResourceLoader resourceLoader;

	public void run(String... args)throws FileNotFoundException,IOException{
		System.out.println("welcome");

		/*Resource resource = resourceLoader.getResource("classpath:activities.csv");

		BufferedReader bufferedReader = new BufferedReader(new FileReader(resource.getFile()));

		String line ;
		bufferedReader.readLine();

		while ((line=bufferedReader.readLine())!=null) {
			String[] activity = line.split(",");

			Activities activities = new Activities();
			activities.setActivity(activity[1]);
			activities.setFrequency(activity[2]);
			activities.setDescription(activity[3]);
			activitesRepository.save(activities);
			
		} */

	}

}
