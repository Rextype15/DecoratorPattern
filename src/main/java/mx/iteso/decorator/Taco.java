package mx.iteso.decorator;

import mx.iteso.decorator.tacos.Size;

public abstract class Taco {
    public String description = "Any Taco";
    public double Cost = 0;
    public Size TacoSize = Size.Regular;

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
