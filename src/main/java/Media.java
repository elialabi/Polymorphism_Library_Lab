import interfaces.ILoan;

import java.time.LocalDate;

public abstract class Media implements ILoan {


    protected String title;
    protected double cost;


    public Media(String title, double cost) {

        this.title = title;
        this.cost = cost;
    }

    public boolean titleBeginsWithA(){
        return title.startsWith("A");

    }

    public String loaned(String date){
        return this.title + "date " + ".";
    }


    public abstract void setCostToZero();

}





