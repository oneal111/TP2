

import java.util.ArrayList;

@Table(tableName= "Etudiant", primaryKey="etudiantid")
public class Etudiant {

	private final int id;
	private final String fname;
	private final String lname;
	private int age;
	
	@Join(relatedClass= Inscription.class, foreignKey="etudiantid", localKey="etudiantid")
	private ArrayList<Inscription> inscriptions;

	public Etudiant(int id, String fname, String lname, int age, ArrayList<Inscription> inscriptions) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.id = id;
		this.inscriptions = inscriptions;
	}
}
