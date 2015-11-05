package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Volcan extends Taco{


    public Volcan() {
        description = "Volcan";
        this.TacoSize = Size.Regular;
        this.Cost = 15.00;
    }

    @Override
    public double cost() {
        return this.Cost;
    }
}

