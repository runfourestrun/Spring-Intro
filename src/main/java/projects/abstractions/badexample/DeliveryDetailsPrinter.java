package projects.abstractions.badexample;

public class DeliveryDetailsPrinter {
    // If you must change the sorting responsibility these are places you need to change your code.
    private SorterByAddress sortDetails;

    // If you must change the sorting responsibility these are places you need to change your code.
    public DeliveryDetailsPrinter(SorterByAddress sorter){
        this.sortDetails = sorter;
    }

    // If you must change the sorting responsibility these are places you need to change your code.
    public void printDetails(){
        sortDetails.sortDetails();
    }


}
