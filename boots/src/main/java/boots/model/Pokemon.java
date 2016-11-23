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
	private int id_pokemon;
	@Column(length=45)
	private String atack_points;
	@Column(length=45)
	private String defence_points;
	@Column(length=45)
	private String ability_power_points;
	@Column(length=45)
	private String name;
	@Column(length=45)
	private String type;
	
	public Pokemon(String atack_points, String defence_points, String ability_power_points, String name,
			String type) {
		super();
		this.atack_points = atack_points;
		this.defence_points = defence_points;
		this.ability_power_points = ability_power_points;
		this.name = name;
		this.type = type;
	}

	public Pokemon(){
		this("","","","","");
	}

	public int getId_pokemon() {
		return id_pokemon;
	}

	public void setId_pokemon(int id_pokemon) {
		this.id_pokemon = id_pokemon;
	}

	public String getAtack_points() {
		return atack_points;
	}

	public void setAtack_points(String atack_points) {
		this.atack_points = atack_points;
	}

	public String getDefence_points() {
		return defence_points;
	}

	public void setDefence_points(String defence_points) {
		this.defence_points = defence_points;
	}

	public String getAbility_power_points() {
		return ability_power_points;
	}

	public void setAbility_power_points(String ability_power_points) {
		this.ability_power_points = ability_power_points;
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

	@Override
	public String toString() {
		return "Pokemon [id_pokemon=" + id_pokemon + ", atack_points=" + atack_points + ", defence_points="
				+ defence_points + ", ability_power_points=" + ability_power_points + ", name=" + name + ", type="
				+ type + "]";
	}

	
	
	
	
	
	
}
