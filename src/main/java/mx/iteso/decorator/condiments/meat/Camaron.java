package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Size;

public class Camaron extends CondimentsDecorator {
    Taco taco;

    public Camaron (Taco taco){
        this.TacoSize = taco.TacoSize;
        this.taco = taco;
        if(TacoSize == Size.Mini){
        }
        else if(TacoSize == Size.Regular){
            this.Cost = 0;
        }
        else if(TacoSize == Size.Mega){
            this.Cost = 2;
        }
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de camaron";
    }

    @Override
    public double cost() {
        return this.Cost + taco.cost();
    }
}
