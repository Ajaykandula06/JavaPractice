package OOP;


class Sales{
    private String product;
    private int price;
    private int sales;
    Sales(){
        this.product="PaperCups";
        this.price=2;
        this.sales=6327;
    }

    public int getPrice(){
        return this.price;
    }

    public int getSales(){
        return this.sales;
    }

    public String getProduct() {
        return product;
    }
}


public class Constructor2 {
    public static void main(String[] args) {
        Sales profitORloss = new Sales();
        System.out.println("Producrname: " + profitORloss.getProduct());
        System.out.println("Price: " + profitORloss.getPrice());
        System.out.println("Sales: " + profitORloss.getSales());

    }
}
