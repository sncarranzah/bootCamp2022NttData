package proyectoBCP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import proyectoBCP.models.dao.PersonDao;
import proyectoBCP.models.entities.Person;
import reactor.core.publisher.Mono;

@RestController
public class PersonController {
  @Autowired
  private PersonDao personDao;

  @PostMapping("/registerPerson")
  public Mono<Person> registerPerson(@RequestBody Person person) {
    return this.personDao.save(person);
  }

}
