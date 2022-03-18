package Exercise;

class Bishop extends Chesspiece {
	// Method Overload
	public void pieceMovement(int d) {
		System.out.println("Se movera en diagonal: "+d);
		System.out.println(d);
	}
}
