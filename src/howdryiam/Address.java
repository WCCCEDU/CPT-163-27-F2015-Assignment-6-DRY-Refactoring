package howdryiam;

/**
 *
 * @author samuraipanzer
 */
public class Address {
  private String attn = "";
  private String street = "";
  private String city = "";
  private String state = "";
  private int zip = 0;

  public Address(String attn, String street, String city, String state, int zip) {
	this.attn = attn;
	this.city = city;
	this.state = state;
	this.street = street;
	this.zip = zip;
  }

  public String getAttn() {
	return attn;
  }

  public void setAttn(String attn) {
	this.attn = attn;
  }

  public String getStreet() {
	return street;
  }

  public void setStreet(String street) {
	this.street = street;
  }

  public String getCity() {
	return city;
  }

  public void setCity(String city) {
	this.city = city;
  }

  public String getState() {
	return state;
  }

  public void setState(String state) {
	this.state = state;
  }

  public int getZip() {
	return zip;
  }

  public void setZip(int zip) {
	this.zip = zip;
  }
}
