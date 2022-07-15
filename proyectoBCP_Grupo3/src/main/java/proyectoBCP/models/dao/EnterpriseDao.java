package proyectoBCP.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import proyectoBCP.models.entities.Enterprise;

public interface EnterpriseDao extends ReactiveMongoRepository<Enterprise, String>{

}
