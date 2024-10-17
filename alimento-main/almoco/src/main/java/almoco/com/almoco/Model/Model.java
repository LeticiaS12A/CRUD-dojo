package almoco.com.almoco.Model;

import java.util.UUID;

import almoco.com.almoco.DTO.DTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alimento")

public class Model {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID idalimento;
	private String proteina, carboidrato, fibra, gordura, bebida, sobremesa;

	
	public String getProteina() {
		return proteina;
	}

	public void setProteina(String proteina) {
		this.proteina = proteina;
	}

	public String getCarboidrato() {
		return carboidrato;
	}

	public void setCarboidrato(String carboidrato) {
		this.carboidrato = carboidrato;
	}

	public String getFibra() {
		return fibra;
	}

	public void setFibra(String fibra) {
		this.fibra = fibra;
	}

	public String getGordura() {
		return gordura;
	}

	public void setGordura(String gordura) {
		this.gordura = gordura;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String getSobremesa() {
		return sobremesa;
	}

	public void setSobremesa(String sobremesa) {
		this.sobremesa = sobremesa;
	}

	public Model() {
	}

	public Model(DTO user) {

		this.proteina = user.proteina();
		this.carboidrato = user.carboidrato();
		this.fibra = user.fibra();
		this.gordura = user.gordura();
		this.sobremesa = user.sobremesa();
		this.bebida = user.bebida();
	}

}
