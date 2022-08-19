package projects.abstractions.realworldalexattempt2.models;

public class HouseRecord {

    private String neighborhood;
    private String sellerName;
    private float listPrice;

    public HouseRecord(String neighborhood, String sellerName, float listPrice) {
        this.neighborhood = neighborhood;
        this.sellerName = sellerName;
        this.listPrice = listPrice;
    }



    public String getNeighborhood() {
        return neighborhood;
    }

    public String getSellerName() {
        return sellerName;
    }

    public float getListPrice() {
        return listPrice;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public void setListPrice(float listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public String toString() {
        return "House{" +
                "neighborhood='" + neighborhood + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", listPrice=" + listPrice +
                '}';
    }
}
