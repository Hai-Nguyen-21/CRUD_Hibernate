package entity;

public class SinhVien {
	private String idSV, nameSV, idKN, CCCD, phoneNum, mail;

	public SinhVien() {
		super();
	}

	public SinhVien(String idSV, String nameSV, String idKN, String CCCD, String phoneNum, String mail) {
		super();
		this.idSV = idSV;
		this.nameSV = nameSV;
		this.idKN = idKN;
		this.CCCD = CCCD;
		this.phoneNum = phoneNum;
		this.mail = mail;
	}

	public String getIdSV() {
		return idSV;
	}

	public void setIdSV(String idSV) {
		this.idSV = idSV;
	}

	public String getNameSV() {
		return nameSV;
	}

	public void setNameSV(String nameSV) {
		this.nameSV = nameSV;
	}

	public String getIdKN() {
		return idKN;
	}

	public void setIdKN(String idKN) {
		this.idKN = idKN;
	}

	public String getCCCD() {
		return CCCD;
	}

	public void setCCCD(String cCCD) {
		CCCD = cCCD;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return idSV + " " + nameSV + " " + idKN + " " + CCCD + " " + phoneNum + " " + mail;
	}
	
	
}
