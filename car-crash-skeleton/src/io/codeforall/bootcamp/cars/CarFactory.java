package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

public class CarFactory {


    public static Car getNewCar() {
        int newCar = (int) (Math.random() * 2);
        if (newCar == 0) {
            return new Fiat();
        } else {
            return new Mustang();
        }


    }

}