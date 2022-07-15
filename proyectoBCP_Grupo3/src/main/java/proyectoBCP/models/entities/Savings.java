package proyectoBCP.models.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Savings")
public class Savings extends BankAccount{

}
