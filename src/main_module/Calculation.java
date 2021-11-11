package main_module;

public class Calculation {
  public double getBill(Double units)
  {
	  //double amount=0.0;
	  if(units<=100)
		  return 0.00;
	 
	  else if(units<=200)
		  return ((units-100)*1.50)+20;
	  
	  else if(units<=500)
	  {
		  //220 (fixed amount)
	/*	  amount=100*2.00;
		  units-=200;
		  amount+=units*3.00;     */
		  return 220+((units-200)*3.00);
	  }
	  else 
	  {//above 500 units
		  //350 +1840 +50=2,240(fixed amount)
	/*	  amount=100*3.50+400*4.60;
		  units-=500;
		  amount+=units*6.60;   */
		  return 2240+((units-500)*6.60);
	  }
  }
}
