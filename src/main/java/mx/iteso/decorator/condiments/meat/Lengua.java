package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Size;

public class Lengua  extends CondimentsDecorator {
    Taco taco;

    public Lengua (Taco taco){
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
        return taco.getDescription() + " de lengua";
    }

    @Override
    public double cost() {
        return this.Cost + taco.cost();
    }
}
