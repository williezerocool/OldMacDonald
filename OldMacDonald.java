class Cow {
	public void moo() {
		System.out.println("Cow says moo.");
	}
}

class Pig {
	public void oink() {
		System.out.println("Ping says oink.");
	}
}


public class OldMacDonald {
	public static void main(String[] args) {
	
		Cow maurine = new Cow();
		Cow pauline = new Cow();
		maurine.moo();
		pauline.moo();

		Pig snowball = new Pig();
		snowball.oink();
		snowball.oink();

		Duck ferdinand = new Duck();
		ferdinand.quack();
	
		Pig jammie = new Pig();
		jammie.oink();
	}

}
class Duck {
	public void quack() {
		System.out.println("Duck says quack.");
	}
}


