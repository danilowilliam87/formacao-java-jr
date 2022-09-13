package io.wdsolutions.cursospring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.wdsolutions.cursospring.entities.Category;
import io.wdsolutions.cursospring.entities.Order;
import io.wdsolutions.cursospring.entities.User;
import io.wdsolutions.cursospring.entities.enums.OrderStatus;
import io.wdsolutions.cursospring.repository.CategoryRepository;
import io.wdsolutions.cursospring.repository.OrderRepository;
import io.wdsolutions.cursospring.repository.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{

	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Obama care", "obama@obama.com", "0202-2020", "obama");
		User u4 = new User(null, "Obamy obamy", "obamy@email", "000000", "obs");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1);
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		repository.saveAll(Arrays.asList(u1, u2, u3, u4));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}

}
