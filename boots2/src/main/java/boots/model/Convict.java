package boots.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="convicts")
public class Convict implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_convict;
	@Column(length=45)
	private String identity_card_convict;
	@Column(length=45)
	private String name_convict;
	@Column(length=45)
	private String nationality;
	@Column(length=45)
	private String birthdate;
	@Column(length=45)
	private String place_of_birth;
	
	public Convict(String identity_card_convict, String name_convict, String nationality,
			String birthdate, String place_of_birth) {
		super();
		this.identity_card_convict = identity_card_convict;
		this.name_convict = name_convict;
		this.nationality = nationality;
		this.birthdate = birthdate;
		this.place_of_birth = place_of_birth;
	}
	
	public Convict(){
		this("","","","","");
	}

	public int getId_convict() {
		return id_convict;
	}

	public void setId_convict(int id_convict) {
		this.id_convict = id_convict;
	}

	public String getIdentity_card_convict() {
		return identity_card_convict;
	}

	public void setIdentity_card_convict(String identity_card_convict) {
		this.identity_card_convict = identity_card_convict;
	}

	public String getName_convict() {
		return name_convict;
	}

	public void setName_convict(String name_convict) {
		this.name_convict = name_convict;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getPlace_of_birth() {
		return place_of_birth;
	}

	public void setPlace_of_birth(String place_of_birth) {
		this.place_of_birth = place_of_birth;
	}

	@Override
	public String toString() {
		return "Convict [id_convict=" + id_convict + ", identity_card_convict=" + identity_card_convict
				+ ", name_convict=" + name_convict + ", nationality=" + nationality + ", birthdate=" + birthdate
				+ ", place_of_birth=" + place_of_birth + "]";
	}

	
	
	
	
	
	
	
	
}
