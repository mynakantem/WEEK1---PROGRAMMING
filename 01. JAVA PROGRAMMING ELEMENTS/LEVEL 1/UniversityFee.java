public class UniversityFee {
public static void main(String[] args) {

double fee = 125000;
double discountpercentage = 10;

double discountamount = (fee * discountpercentage) / 100;
double finalamount = fee - discountamount;

System.out.println("The discountamount is INR:" + discountamount + "and final discounted fee is INR:" + finalamount);

}
}