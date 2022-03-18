package Exercise;

public class Chesspiece {

	public void displayInf() {
		System.out.println("What chesspiece would you like to see?");
	}

	public void pieceMovement(int x, int y) {
		System.out.println("Se movera hacia adelante");
		System.out.println(x);
		System.out.println("Se movera hacia los lados");
		System.out.println(y);
	}
}
