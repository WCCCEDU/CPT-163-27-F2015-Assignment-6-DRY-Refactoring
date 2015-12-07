/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howdryiam;

/**
 *
 * @author samuraipanzer
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
	System.out.println("\nName: " + this.address.getAttn() +
					   "\nStreet: " + this.address.getStreet() +
					   "\nCity: " + this.address.getCity() +
					   "\nState: " + this.address.getState() +
					   "\nZip: " + this.address.getZip() +
					   "\nDimensions: " + depth + "x" + width + "x" + height);
  }
}
