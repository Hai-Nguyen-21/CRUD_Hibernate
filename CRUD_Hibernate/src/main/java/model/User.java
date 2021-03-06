package model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="USERS")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_U")
	private String idU;

	@Column(name="ADMIN_U")
	private String adminU;

	@Column(name="EMAIL_U")
	private String emailU;

	@Column(name="NAME_U")
	private String nameU;

	@Column(name="PASS_U")
	private String passU;

	public User() {
		
	}

	public User(String idU, String adminU, String emailU, String nameU, String passU) {
		super();
		this.idU = idU;
		this.adminU = adminU;
		this.emailU = emailU;
		this.nameU = nameU;
		this.passU = passU;
	}

	public String getIdU() {
		return this.idU;
	}

	public void setIdU(String idU) {
		this.idU = idU;
	}

	public String getAdminU() {
		return this.adminU;
	}

	public void setAdminU(String adminU) {
		this.adminU = adminU;
	}

	public String getEmailU() {
		return this.emailU;
	}

	public void setEmailU(String emailU) {
		this.emailU = emailU;
	}

	public Object getNameU() {
		return this.nameU;
	}

	public void setNameU(String nameU) {
		this.nameU = nameU;
	}

	public String getPassU() {
		return this.passU;
	}

	public void setPassU(String passU) {
		this.passU = passU;
	}

}