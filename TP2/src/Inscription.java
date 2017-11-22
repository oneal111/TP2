

@Table(tableName="Inscription", primaryKey="inscriptionid")
public class Inscription {

	private final int inscriptionid;
	private final int etudiantId;
	private final int coursId;
	private final Cours cours;
	private final Etudiant etudiant;

	public Inscription(int inscriptionid, int etudiantId, int coursId, Cours cours, Etudiant etudiant) {
		this.inscriptionid = inscriptionid;
		this.etudiantId = etudiantId;
		this.coursId = coursId;
		this.cours = cours;
		this.etudiant = etudiant;
	}
}
