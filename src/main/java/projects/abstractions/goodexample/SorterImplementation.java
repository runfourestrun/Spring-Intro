package projects.abstractions.goodexample;

import projects.abstractions.badexample.DeliveryDetailsPrinter;
import projects.abstractions.badexample.SorterByAddress;

public class SorterImplementation {

    public static void main(String[] args){
        DeliveryDetailsPrinter dprinter0 = new DeliveryDetailsPrinter(new SorterByAddress());
        DeliveryDetailsPrinter dprinter1 = new DeliveryDetailsPrinter(new SorterByAddress());
    }
}
