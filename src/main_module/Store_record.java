package main_module;

public class Store_record {
	private String bill_name;
	private double profit_amount;
	private double profit_percentage;
	private double old_amount;
	public Store_record(String bill_name, double profit_amount, double profit_percentage, double old_amount) {
		this.bill_name = bill_name;
		this.profit_amount = profit_amount;
		this.profit_percentage = profit_percentage;
		this.old_amount = old_amount;
	}
	
	private int total_bills;
	private double margin_percent;
	private double margin_total;
	private double marginUnits;
	public Store_record(double old_amount, int total_bills, double margin_percent, double margin_total,double marginUnits) {
		this.old_amount = old_amount;
		this.total_bills = total_bills;
		this.margin_percent = margin_percent;
		this.margin_total = margin_total;
		this.marginUnits= marginUnits;
	}
	
  public String toString()
  {
	  return bill_name+" "+profit_amount+"$ "+profit_percentage+"% "+old_amount;
  }
}
