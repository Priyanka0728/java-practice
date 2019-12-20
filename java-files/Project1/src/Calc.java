public class Calc {
       public Float calculateProfit(int dozenCount, int pricePerDozen, int sellPrice)
       {
    	   float cp = pricePerDozen/12f;
    	   float profit =sellPrice-cp;
    	   float percentage =(profit/cp)*100;
    	   return percentage;
    	   
    	   
    	   
       }
}
