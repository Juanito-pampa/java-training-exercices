package io.robusta.java.classic;

/**
 * Created by nicorama on 22/06/2017.
 */
public class FoodApp {


    static final int TRAVEL_COST = 2;

    int money = 0;
    int foodStock = 1000;



    void reset(){
    	money = 0;
        foodStock = 1000;
    }

    int deliver(int food){
    	int gross = food*2;
    	foodStock -= food;
    	money = money+ gross - TRAVEL_COST;
        return gross;
    }

    int deliverAll(int count, int food){
    	int gross = food*2*count;
    	foodStock = foodStock -(food*count);
    	money = money+ gross - TRAVEL_COST*count;
        return gross;
    }


}
