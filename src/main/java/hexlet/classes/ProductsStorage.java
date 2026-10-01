package hexlet.classes;

public class ProductsStorage {
    private int goodsQuantity;
    private int maxCapacity;

    public ProductsStorage(int goodsQuantity, int maxCapacity) {
        this.goodsQuantity = goodsQuantity;
        this.maxCapacity = maxCapacity;
    }

    public int getGoodsQuantity() {
        return goodsQuantity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void placeProducts(int products) {
        if (goodsQuantity + products > maxCapacity) {
            System.out.println("No place for new products");
            return;
        }
        goodsQuantity += products;
    }

    public void takeProducts(int products) {
        if (goodsQuantity - products < 0) {
            System.out.println("Not enough products in store");
            return;
        }
        goodsQuantity -= products;
    }
}
