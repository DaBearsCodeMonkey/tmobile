package vendingmachine;

public class FoodVendingMachine implements IVendingMachine{
    private Item[][] aisle;

    public Item[][] createVendingMachine(){
        Item[][] emptyVendingMachine = new Item[2][2];
        Item apple = new Item("apple", 0);
        Item orange = new Item("orange", 0);
        Item celery = new Item("celery", 0);
        Item broccoli = new Item("broccoli", 0);

        emptyVendingMachine[0][0] = apple;
        emptyVendingMachine[0][1] = orange;
        emptyVendingMachine[1][0] = celery;
        emptyVendingMachine[1][1] = broccoli;

        return emptyVendingMachine;
    }
}
