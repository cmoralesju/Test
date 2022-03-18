package Exercise2;

public class Ball {

    private String material;

    public void action() {
        System.out.println("Ball standing...");
    }

    public void setMaterial(){
        this.material = "Plastic";
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public void setMaterial(String material, String color){
        this.material = color + " " + material;
    }

    public String getMaterial(){
        return material;
    }

}