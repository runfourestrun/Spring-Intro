package projects.abstractions.goodexample;


public class DeliveryDetailPrinterGood {

    private Sorter sorter;


    public DeliveryDetailPrinterGood(Sorter sorter){
        this.sorter = sorter;
    }


    public void sortDetials(){
        sorter.sorterDetails();
    }


}
