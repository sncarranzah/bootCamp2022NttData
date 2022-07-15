package proyectoBCP.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import proyectoBCP.models.entities.Savings;

public interface DaoSavings extends ReactiveMongoRepository<Savings, String>{

}
