/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howdryiam;

/**
 *
 * @author WickedAwesome
 */
public class Box {
    private Address addr;
    private Dimensions dim;
    
    public Box(Address addr, Dimensions dim){
        this.addr = addr;
        this.dim = dim;
    }
    
    public Address getAddress(){return this.addr;}
    public Dimensions getDimensions(){return this.dim;}
}
