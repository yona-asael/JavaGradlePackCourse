package com.quintech.app.Farm;

import java.math.BigDecimal;

public class Horse extends FarmAnimal {

    public Horse() {
        super("Spirit",  BigDecimal.valueOf(500));
    }

    public Horse(String name, int value ) {
        super(name,  BigDecimal.valueOf(value));
    }


    @Override
    public void details() {
        System.out.println(
            String.format(
                "This name is %s and his weight is %s the type of animal is Horse", 
                this.name, this.weight.toPlainString()
            )
        );
    }
}
