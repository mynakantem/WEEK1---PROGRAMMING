public class CalculateProfit {
public static void main(String[] args) {

int costPrice = 129;
int sellingPrice = 191;

double Profit = sellingPrice - costPrice;
double ProfitPercentage = ((double)Profit / costPrice) * 100;

System.out.println("The costPrice is INR:" + costPrice + "and sellingPrice is INR:" + sellingPrice); 
System.out.println("the Profit is INR:" + Profit + "and the ProfitPercentage is:" + ProfitPercentage + "%");

}
} 