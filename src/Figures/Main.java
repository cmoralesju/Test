package Figures;

class Main {
	public static void main(String[] args) {
		
		// crete an object of Polygon
		
		Polygon p1 = new Polygon();
		p1.render();
		p1.setColor();
		p1.renderColor();
		p1.setColor("Red");
		p1.renderColor();

		// create an object of Square
		Square s1 = new Square();
		s1.render();
		s1.renderSquare();

		// create an object of Circle
		Circle c1 = new Circle();
		c1.render();
		c1.renderCircle();
	}
}