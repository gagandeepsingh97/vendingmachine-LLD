public class IdleState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    void selectProduct(Product product) {
        if (vendingMachine.Inventory.isAvailable(product)) {
            vendingMachine.setSelectedProduct(product);

        }
    }

    void insertCoin(Coin coin);

    void insertNote(Note note);

    void dispenseProduct();

    void returnChange();
}
