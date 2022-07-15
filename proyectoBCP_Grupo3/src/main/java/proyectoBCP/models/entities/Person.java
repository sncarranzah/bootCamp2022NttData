package proyectoBCP.models.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection="person")
public class Person extends Client
{
	@Id
	private String id;
	private String name;
	private Integer dni;
	private Date birthDate;
	private Long cellNumber;
}
