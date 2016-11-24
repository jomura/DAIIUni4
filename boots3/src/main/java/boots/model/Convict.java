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
	private int idConvict;
	@Column(length=45)
	private String identityCardConvict;
	@Column(length=45)
	private String nameConvict;
	@Column(length=45)
	private String nationality;
	@Column(length=45)
	private String birthdate;
	@Column(length=45)
	private String placeOfBirth;
	
	
	
	public Convict(String identityCardConvict, String nameConvict, String nationality, String birthdate,
			String placeOfBirth) {
		super();
		this.identityCardConvict = identityCardConvict;
		this.nameConvict = nameConvict;
		this.nationality = nationality;
		this.birthdate = birthdate;
		this.placeOfBirth = placeOfBirth;
	}

	public Convict(){
		this("","","","","");
	}

	public int getIdConvict() {
		return idConvict;
	}

	public void setIdConvict(int idConvict) {
		this.idConvict = idConvict;
	}

	public String getIdentityCardConvict() {
		return identityCardConvict;
	}

	public void setIdentityCardConvict(String identityCardConvict) {
		this.identityCardConvict = identityCardConvict;
	}

	public String getNameConvict() {
		return nameConvict;
	}

	public void setNameConvict(String nameConvict) {
		this.nameConvict = nameConvict;
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

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	@Override
	public String toString() {
		return "Convict [idConvict=" + idConvict + ", identityCardConvict=" + identityCardConvict + ", nameConvict="
				+ nameConvict + ", nationality=" + nationality + ", birthdate=" + birthdate + ", placeOfBirth="
				+ placeOfBirth + "]";
	}

		
	
	
}
