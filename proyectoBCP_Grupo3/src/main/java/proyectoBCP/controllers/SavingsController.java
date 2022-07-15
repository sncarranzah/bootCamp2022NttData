package proyectoBCP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import proyectoBCP.models.dao.DaoSavings;
import proyectoBCP.models.entities.Savings;
import reactor.core.publisher.Mono;

public class SavingsController {
	 @Autowired
	 private DaoSavings daoSavings;
	 
	 @PostMapping("/grantSavingsBankAccountProduct")
	 public Mono<Savings> registerPerson(@RequestBody Savings savings)
	 {
		 return this.daoSavings.save(savings);
	 }
}
