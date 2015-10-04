
package assignment6dry;

/**
 *
 * @author Samantha Shurie
 */
public class LabelPrinter {
    private Address address = null;
    private Dimensions dimension = null;

    public LabelPrinter(Address address, Dimensions dimension) {
        this.address = address;
        this.dimension = dimension;
    }

    public void printLabel(){
        String depth = this.dimension.depthWithUnits();
        String width = this.dimension.widthWithUnits();
        String height = this.dimension.heightWithUnits();
        System.out.println("Name: " + this.address.getAttn() +
                                           "Street: " + this.address.getStreet() +
                                           "City: " + this.address.getCity() +
                                           "State: " + this.address.getState() +
                                           "Zip: " + this.address.getZip() +
                                           "Dimensions: " + depth + "x" + width + "x" + height);
    }
}
