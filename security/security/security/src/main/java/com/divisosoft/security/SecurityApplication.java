package com.divisosoft.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.divisosoft.security.model.Role;
import com.divisosoft.security.model.User;
import com.divisosoft.security.repository.RoleRepository;
import com.divisosoft.security.repository.UserRepository;

@SpringBootApplication
public class SecurityApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@Autowired
	private RoleRepository roleRepository ;

	@Autowired
	private UserRepository userRepository ;

	public void run(String... args){
		List<Role> roles = roleRepository.findAll();

		if(roles.isEmpty()){
			Role guest = new Role();
			guest.setRoleName("guest");
			roleRepository.save(guest);

			Role intern = new Role();
			intern.setRoleName("Intern");
			roleRepository.save(intern);

			Role admin = new Role();
			admin.setRoleName("admin");
			roleRepository.save(admin);
		}

		List<User> users = userRepository.findAll();

		if(users.isEmpty()){
			User admin = new User();
			admin.setUserName("admin"); 
	 		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			admin.setPassword(passwordEncoder.encode("admin"));
			admin.setEmail("vipin123@gmail.com");
			Role adminRole = roleRepository.findByRoleName("admin");
			admin.setRole(adminRole);
			userRepository.save(admin);
		}
	}
}
