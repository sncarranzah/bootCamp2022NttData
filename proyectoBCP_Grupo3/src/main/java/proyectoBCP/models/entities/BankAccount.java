package proyectoBCP.models.entities;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class  BankAccount
{
	@Id
	private String id;
	private String accountNumber;
	private Boolean isCommissionFree;
	private Integer maxLimOfMonthlyMovemFreeOfCommissions;
	private Integer costPerMovement;
	private Integer monthlyMaintenanceCost;
	private Integer limMaxMovLibreComision;
	private Integer limMaxOfMovFreeOfCommission;
	private Integer balance;
	private String headline;
	private String authorizedSignature;
	private String idCliente;	
}