package singleton;

public class Database {

	private static Database dbobject;

	private Database() {

	}

	public static Database getInstance() {
		if (dbobject == null) {
			dbobject = new Database();
		}
		return dbobject;
	}

	void getConnection() {
		System.out.println("Connection established successfully");
	}

}
