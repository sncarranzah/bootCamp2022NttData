package proyectoBCP.models.entities;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="FixTermDeposit ")
public class FixTermDeposit extends BankAccount {
	private Date DateFreeOfCommissionForMovement;
}
