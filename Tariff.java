package Lesson1;

public class Tariff {
	private String Country;
	private double Price;
	
	public double getSum(int Time){
		return this.Price * Time;
		
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Tariff [Country=" + Country + ", Price=" + Price + "]";
	}
	

}
