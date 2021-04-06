public class Laptops {
    private String maker;
    private String modelSeries;
    private int serialNumber;
    private Integer price;

    public Laptops(String maker, String modelSeries, int serialNumber, int price) {
        this.maker = maker;
        this.modelSeries = modelSeries;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModelSeries() {
        return modelSeries;
    }

    public void setModelSeries(String modelSeries) {
        this.modelSeries = modelSeries;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "maker='" + maker + '\'' +
                ", modelSeries='" + modelSeries + '\'' +
                ", serialNumber=" + serialNumber +
                ", price=" + price +
                '}';
    }
}
