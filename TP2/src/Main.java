 

public final class Main {

	private static final String DB = "postgres";
	private static final String USER = "postgres";
	private static final String PASSWD = "1234";
		
	private DataBase db = null;

	private Main() {
		db = new DataBase(DB, USER, PASSWD);
	}

	public void openDB() {
		db.connect();	
	}


	public static void main(String[] args) {
		Main m = new Main();
		m.openDB();
	}
}
