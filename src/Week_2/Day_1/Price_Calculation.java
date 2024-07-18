package Week_2.Day_1;

public class Price_Calculation {
    public static void main(String[] args) {
        float eachApplesCost = 0.50F, eachOrangesCost = 0.75F;
        int applesBought = 6, orangesBought = 4;
        float totalCost = eachApplesCost * applesBought + eachOrangesCost * orangesBought;
        System.out.println(totalCost);

    }
}
