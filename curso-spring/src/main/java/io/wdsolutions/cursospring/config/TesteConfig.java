package io.wdsolutions.cursospring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.wdsolutions.cursospring.entities.User;
import io.wdsolutions.cursospring.repository.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{

	
	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Obama care", "obama@obama.com", "0202-2020", "obama");
		User u4 = new User(null, "Obamy obamy", "obamy@email", "000000", "obs");
		
		repository.saveAll(Arrays.asList(u1, u2, u3, u4));
	}

}
