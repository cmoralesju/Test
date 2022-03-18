package Figures;

class Polygon {
	protected String color; 
	// method to render a shape
	public void render() {
		System.out.println("Rendering Polygon...");
	}
	
	public void setColor() {
		color = "Blue";
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	public void renderColor() {
		System.out.println( 1+ 2);
		System.out.println("uno"+"dos");
		System.out.println(color);
	}
}