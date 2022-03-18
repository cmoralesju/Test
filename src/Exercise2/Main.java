package Exercise2;

public class Main {

    public static void main (String []args) {

        Ball b = new Ball();
        SoccerBall sb = new SoccerBall();
        BasketBall bb = new BasketBall();
        TenisBall tb = new TenisBall();

        b.action();
        // Skipped setMaterial intentionally, null printed is expected
        System.out.println(b.getMaterial());

        sb.setMaterial();
        System.out.println(sb.getMaterial());
        sb.action();

        bb.setMaterial("Rubber","Orange");
        System.out.println(bb.getMaterial());
        bb.action();

        // Invoked action() before setting a material to get null printed inside action()
        
        tb.setMaterial("Synthetic");
        System.out.println(tb.getMaterial());
        tb.action();

    }

}
