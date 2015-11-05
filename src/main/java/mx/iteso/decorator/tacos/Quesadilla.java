package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {

    public Quesadilla(){
        this(Size.Regular);
    }

    public Quesadilla(Size TacoSize) {
        if(TacoSize == Size.Mini){
            this.description = "Quesadilla mini";
            this.Cost = 8;
            this.TacoSize = Size.Mini;
        }
        else if(TacoSize == Size.Regular){
            this.description = "Quesadilla normal";
            this.Cost = 10;
            this.TacoSize = Size.Regular;
        }
        else if(TacoSize == Size.Mega){
            this.description = "Quesadilla mega";
            this.Cost = 12;
            this.TacoSize = Size.Mega;
        }
    }

    @Override
    public double cost() {
        return this.Cost;
    }
}
