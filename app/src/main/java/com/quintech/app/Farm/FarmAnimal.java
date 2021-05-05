package com.quintech.app.Farm;

import java.math.BigDecimal;

public abstract class FarmAnimal {
    protected String name;
    protected BigDecimal weight;

    public abstract void details();

    public FarmAnimal(String name, BigDecimal weight) {
        this.setName(name);
        this.setWeight(weight);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getWeight() {
        return this.weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

}
