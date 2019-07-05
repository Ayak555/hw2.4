public class Manufacturer extends Thread {

    private Stockroom goodsCounter;

    public Manufacturer(Stockroom goodsCounter) {
        this.setGoodsCounter(goodsCounter);
    }

    public Manufacturer() {

    }

    public Stockroom getGoodsCounter() {
        return goodsCounter;
    }

    public void setGoodsCounter(Stockroom goodsCounter) {
        this.goodsCounter = goodsCounter;
    }

    public void increaseStockroom() {
        setGoodsCounter(getGoodsCounter()+1);
    }

    public void run() {
        synchronized (getGoodsCounter()) {
            for (int i = 0; i < 5; i++) {
                getGoodsCounter().increaseStockroom();
            }
        }
    }



}
