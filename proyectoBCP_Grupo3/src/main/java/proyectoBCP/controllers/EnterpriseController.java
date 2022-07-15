package proyectoBCP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import proyectoBCP.models.dao.EnterpriseDao;
import proyectoBCP.models.entities.Enterprise;
import reactor.core.publisher.Mono;

@RestController
public class EnterpriseController {
	 @Autowired
	  private EnterpriseDao enterpriseDao;

	  @PostMapping("/registerEnterprise")
	  public Mono<Enterprise> registerEnterprise(@RequestBody Enterprise enterprise) {
	    return this.enterpriseDao.save(enterprise);
	  }

}
