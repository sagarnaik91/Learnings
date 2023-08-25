package constructor;

public class _2NoArgsConstructor {
	int i;

//If constructor is private, we cannot create object of such class
	private _2NoArgsConstructor() {
		System.out.println("Constructor called");
		i = 5;
	}

	public static void main(String[] args) {

		_2NoArgsConstructor ex = new _2NoArgsConstructor();
		System.out.println(ex.i);
	}
}
