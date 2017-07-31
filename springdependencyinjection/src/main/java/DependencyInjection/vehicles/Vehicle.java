package DependencyInjection.vehicles;

import DependencyInjection.parts.Engine;

/**
 * Created by Angel on 6/12/17.
 */
public class Vehicle {
//vehicle can now choose which engine to use...
    private Engine myEngine;

    // constructor expects an engine object thus an engine object is created
    // along side the vehicle

    public Vehicle(Engine anEngine) {
        myEngine = anEngine;
    }

    public void crankIgnition(){

        myEngine.startingEngine();
        System.out.println("Vehicle is running");
    }
}
