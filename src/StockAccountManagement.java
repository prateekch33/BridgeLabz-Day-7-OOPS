import java.util.ArrayList;
import java.util.Scanner;

class Stock {
    private String stockName;
    private int noOfShare,sharePrice;

    public void setStockName(String name){
        this.stockName=name;
    }
    public void setNoOfShare(int noOfShare) {
        this.noOfShare=noOfShare;
    }
    public void setSharePrice(int sharePrice) {
        this.sharePrice=sharePrice;
    }
    public String getStockName(){
        return stockName;
    }
    public int getNoOfShare(){
        return noOfShare;
    }
    public int getSharePrice(){
        return sharePrice;
    }

    public int calculateShareValue() {
        return noOfShare*sharePrice;
    }
}


public class StockAccountManagement {
    public static void main(String[] args) {
        ArrayList<Stock> stocks=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        int choice;
        do {
            System.out.println("Welcome to Stock Account Management System.");
            System.out.println("1. Add Stock");
            System.out.println("2. Calculate Value of each Stock");
            System.out.println("3. Calculate total share value");
            System.out.println("4. Exit Program.");
            System.out.print("Choose your option: ");
            choice=in.nextInt();
            switch(choice) {
                case 1: {
                    Stock ob=new Stock();
                    System.out.print("Enter the Stock Name: ");
                    String name=in.next();
                    ob.setStockName(name);
                    System.out.print("Enter the No. of share of the stock: ");
                    int noOfShare=in.nextInt();
                    ob.setNoOfShare(noOfShare);
                    System.out.print("Enter the Share Price of the stock: ");
                    int sharePrice=in.nextInt();
                    ob.setSharePrice(sharePrice);
                    stocks.add(ob);
                    System.out.println("Stocks Added!!");
                    break;
                }
                case 2: {
                    System.out.println("Share Value of each Stock: ");
                    for(Stock i:stocks) {
                        System.out.println(i.getStockName()+" - "+i.calculateShareValue());
                    }
                    break;
                }
                case 3: {
                    int totalShareValue=0;
                    for(Stock i:stocks) {
                        totalShareValue+=i.calculateShareValue();
                    }
                    System.out.printf("Total Share Value of all the stocks: %d\n",totalShareValue);
                    break;
                }
                default: {
                    System.out.println("Invalid Choice!!");
                    break;
                }
            }
        } while(choice!=4);
        System.out.println("Thank You!!");
        in.close();
    }
}
