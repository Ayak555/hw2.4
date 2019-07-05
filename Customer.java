public class Customer extends Thread{

    private Stockroom goodsCounter;

    public Customer(Stockroom goodsCounter) {
        this.setGoodsCounter(goodsCounter);
    }

    public Customer() {

    }


    public Stockroom getGoodsCounter() {
        return goodsCounter;
    }

    public void setGoodsCounter(Stockroom goodsCounter) {
        this.goodsCounter = goodsCounter;
    }

    public void decreaseStockroom{
        setGoodsCounter(getGoodsCounter()-1);
    }

    public void run() {
        synchronized (getGoodsCounter()) {
            for (int i = 0; i < 5; i++) {
                getGoodsCounter().decreaseStockroom();
            }
        }
    }


}
