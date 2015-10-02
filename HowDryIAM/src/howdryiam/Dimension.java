/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howdryiam;

/**
 *
 * @author Steven
 */
public class Dimensions {
   /**
 *
 * @author samuraipanzer
 */
public class Dimensions {
  private double width = 0;
  private double height = 0;
  private double depth = 0;
  private String units = "in";

  /**
   * Constructs a dimension of a 3d box
   * @param width
   * @param height
   * @param depth
   * @param units 
   */
  public Dimensions(double width, double height, double depth, String units) {
	this.depth = depth;
	this.height = height;
	this.units = units;
	this.width = width;
  }
  /**
   * Constructs dimension of a 3d box using default `in` units
   * @param width
   * @param height
   * @param depth 
   */
  public Dimensions(double width, double height, double depth) {
	this.depth = depth;
	this.height = height;
	this.width = width;
  }
  
  public String widthWithUnits(){
	return withUnits(this.width);
  }
  
  public String heightWithUnits(){
	return withUnits(this.height);
  }
  
  public String depthWithUnits(){
	return withUnits(this.depth);
  }
  
  private String withUnits(double measure){
	return measure + this.units;
  }
  
}
}
