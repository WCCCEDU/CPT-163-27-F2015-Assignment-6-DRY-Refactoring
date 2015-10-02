/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howdryiam;

/**
 *
 * @author samuraipanzer
 * @author Seth Frosch
 */
public class Dimensions {
  private double depth = 0;
  private double width = 0;
  private double height = 0;
  private String units = "in";

  /**
   * Constructs a dimension of a 3d box
   * @param width
   * @param height
   * @param depth
   * @param units 
   */
  public Dimensions(double depth, double width, double height, String units) {
	this.depth = depth;
	this.width = width;
	this.height = height;
	this.units = units;
  }
  /**
   * Constructs dimension of a 3d box using default `in` units
   * @param depth
   * @param width
   * @param height 
   */
  public Dimensions(double depth, double width, double height) {
	this.depth = depth;
	this.width = width;
	this.height = height;
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
