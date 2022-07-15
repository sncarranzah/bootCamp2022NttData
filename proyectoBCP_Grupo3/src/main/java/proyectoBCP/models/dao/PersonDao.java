package proyectoBCP.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import proyectoBCP.models.entities.Person;

public interface PersonDao extends ReactiveMongoRepository<Person, String>{

}
