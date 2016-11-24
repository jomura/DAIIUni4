package boots.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="pokemones")
public class Pokemon implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPokemon;
	@Column(length=45)
	private String atackPoints;
	@Column(length=45)
	private String defencePoints;
	@Column(length=45)
	private String abilityPowerPoints;
	@Column(length=45)
	private String name;
	@Column(length=45)
	private String type;
	

	
	public int getIdPokemon() {
		return idPokemon;
	}



	public void setIdPokemon(int idPokemon) {
		this.idPokemon = idPokemon;
	}



	public String getAtackPoints() {
		return atackPoints;
	}



	public void setAtackPoints(String atackPoints) {
		this.atackPoints = atackPoints;
	}



	public String getDefencePoints() {
		return defencePoints;
	}



	public void setDefencePoints(String defencePoints) {
		this.defencePoints = defencePoints;
	}



	public String getAbilityPowerPoints() {
		return abilityPowerPoints;
	}



	public void setAbilityPowerPoints(String abilityPowerPoints) {
		this.abilityPowerPoints = abilityPowerPoints;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}


	

	public Pokemon(String atackPoints, String defencePoints, String abilityPowerPoints, String name, String type) {
		super();
		this.atackPoints = atackPoints;
		this.defencePoints = defencePoints;
		this.abilityPowerPoints = abilityPowerPoints;
		this.name = name;
		this.type = type;
	}



	public Pokemon(){
		this("","","","","");
	}



	@Override
	public String toString() {
		return "Pokemon [idPokemon=" + idPokemon + ", atackPoints=" + atackPoints + ", defencePoints=" + defencePoints
				+ ", abilityPowerPoints=" + abilityPowerPoints + ", name=" + name + ", type=" + type + "]";
	}


	
}

