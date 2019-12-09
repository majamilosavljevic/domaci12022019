package domaci_12022019;

public class Covek {
	/*
	 * Covek poseduje ime i prezime, i jedinstveni identifikacioni broj koji se
	 * dodeljuju prilikom kreiranja objekta. Svi podaci mogu da se dohvate, ali ne i
	 * postave.
	 * 
	 */

	private String name;
	private String lastName;
	private static int idGlobal = 1;
	private int id;

	public Covek(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		this.id = idGlobal;
		idGlobal++;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public int getId() {
		return id;
	}

	@Override

	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append(getName()).append("_").append(getLastName()).append("_ID [").append(getId()).append("]")
				.toString();
	}
}
