class Pizza {
    protected int price;
    private boolean veg;
    private int basePizzaPrice;
    private int extraCheese = 100;
    private int extraToppings = 150;
    private int stuffedCrust = 200;
    private int takeawayCharge = 20;
    private int smallSizeDiscount = 50;
    private int largeSizeExtra = 100;
    private boolean isCheeseAdded = false;
    private boolean isToppingsAdded = false;
    private boolean isStuffedCrustAdded = false;
    private boolean isTakeaway = false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if(veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        this.basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        
            isCheeseAdded = true;
            price += extraCheese;
            System.out.println("Extra cheese added");
        
    }

    public void addExtraToppings() {
            isToppingsAdded = true;
            price += extraToppings;
            System.out.println("Extra toppings added");
        
    }

    public void addStuffedCrust() {
            isStuffedCrustAdded = true;
            price += stuffedCrust;
            System.out.println("Stuffed crust added");
        
    }

    public void takeAway() {
            isTakeaway = true;
            price += takeawayCharge;
            System.out.println("Take away opted");
        }
    

    public void selectSize(String size) {
        if (size.equals("small")) {
            price -= smallSizeDiscount;
            System.out.println("Small size selected");
        } else if (size.equals("large")) {
            price += largeSizeExtra;
            System.out.println("Large size selected");
        } else {
            System.out.println("Medium size selected ");
        }
    }

    public int getTotalPrice() {
        return price;
    }

    public void getBill() {
        System.out.println("------ BILL SUMMARY ------");
        System.out.println("Base Pizza Price: " + basePizzaPrice);
        if (isCheeseAdded) {
            System.out.println("Extra Cheese: " + extraCheese);
        }
        if (isToppingsAdded) {
            System.out.println("Extra Toppings: " + extraToppings);
        }
        if (isStuffedCrustAdded) {
            System.out.println("Stuffed Crust: " + stuffedCrust);
        }
        if (isTakeaway) {
            System.out.println("Takeaway Charge: " + takeawayCharge);
        }
        System.out.println("Total Bill: Rs." + price);
        System.out.println("---------------------------");
    }
}