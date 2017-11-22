

import java.util.ArrayList;

@Table(tableName= "Cours", primaryKey="coursid")
public class Cours {

	private final int coursid;
	private final String name;
	private final String sigle;
	private final String description;
	
	@Join(relatedClass = Inscription.class, foreignKey="coursid", localKey="coursid")
	private final ArrayList<Inscription> inscriptions;

	public Cours(int coursid, String name, String sigle, String description, ArrayList<Inscription> inscriptions) {
		
		this.coursid = coursid;
		this.name = name;
		this.sigle = sigle;
		this.description = description;
		this.inscriptions = inscriptions;
	}
	
	
}
