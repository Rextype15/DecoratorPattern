package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {

    public TacoNormal() {
        this(Size.Regular);
    }

    public TacoNormal(Size TacoSize) {
        if(TacoSize == Size.Mini){
            this.description = "Taco mini";
            this.Cost = 6;
            this.TacoSize = Size.Mini;
        }
        else if(TacoSize == Size.Regular){
            this.description = "Taco normal";
            this.Cost = 8;
            this.TacoSize = Size.Regular;
        }
        else if(TacoSize == Size.Mega){
            this.description = "Taco mega";
            this.Cost = 10;
            this.TacoSize = Size.Mega;
        }
    }

    @Override
    public double cost() {
        return this.Cost;
    }
}
