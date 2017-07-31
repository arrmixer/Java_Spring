package DependencyInjection.parts;

/**
 * Created by Angel on 6/12/17.
 */
public class SmallEngine implements Engine {
    private int horsePower;

    public SmallEngine(int horsePower) {
        this.horsePower = horsePower;
    }


    public void startingEngine() {
        System.out.println("started small " + horsePower + "hp engine");
    }
}
