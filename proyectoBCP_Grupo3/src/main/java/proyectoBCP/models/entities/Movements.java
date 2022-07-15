package proyectoBCP.models.entities;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="Movements")
public class Movements 
{
	private Long id;
	private Date MovementDate;
	private String OperationType;
	private Double amount;
	private String accountNumber;
}
