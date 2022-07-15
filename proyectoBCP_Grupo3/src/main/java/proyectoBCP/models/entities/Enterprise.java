package proyectoBCP.models.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection="enterprise")
public class Enterprise extends Client{
	private String RUCnumber;
	private String businessName;	
}
