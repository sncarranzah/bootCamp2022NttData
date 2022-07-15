package proyectoBCP.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Credit 
{
	private String accountNumber;
	private Integer creditMaxAmount;
	private Integer consumerCredir;
	private Client client;
}
