package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Size;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso (Taco taco){
        this.taco = taco;
        this.TacoSize = taco.TacoSize;
        if(TacoSize == Size.Mini){
            this.Cost = 0;
        }
        else if(TacoSize == Size.Regular){
            this.Cost = 2;
        }
        else if(TacoSize == Size.Mega){
            this.Cost = 4;
        }
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() {
        return this.Cost + taco.cost();
    }
}
