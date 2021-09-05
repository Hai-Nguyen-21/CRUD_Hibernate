package entity;

public class KhoaNganh {
	private String idKN, nameKN;

	public KhoaNganh() {
		super();
	}

	public KhoaNganh(String idKN, String nameKN) {
		super();
		this.idKN = idKN;
		this.nameKN = nameKN;
	}

	public String getIdKN() {
		return idKN;
	}

	public void setIdKN(String idKN) {
		this.idKN = idKN;
	}

	public String getNameKN() {
		return nameKN;
	}

	public void setNameKN(String nameKN) {
		this.nameKN = nameKN;
	}
	
	
}
