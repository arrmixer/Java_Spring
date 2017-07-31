package DependencyInjection.parts;

/**
 * Created by Angel on 6/12/17.
 */
public class LargeEngine implements Engine{
    private int horsePower;

    public LargeEngine(int horsePower) {
        this.horsePower = horsePower;
    }



    public void startingEngine() {
        System.out.println("started large " + horsePower + "hp engine");
    }
}
