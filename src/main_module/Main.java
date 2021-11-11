package main_module;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Calculation check=new Calculation ();
  List<Store_record> record=new ArrayList<>();	
  List<Store_record> whole_record=new ArrayList<>();	

		Scanner scan=new Scanner(System.in);
		System.out.println("TNEB Bill Profit Tariff"
				+ "\n Enter The Number of Bill");
        int No_bills=scan.nextInt();
        double marginAmount=0;
        double marginTotal=0;
        double margin_oldAmount=0;
        double  marginUnits=0;
        int old_billling[]=new int[No_bills];
        for(int i=1;i<No_bills;i++)
        {
        	System.out.println("ENTER NO. "+i+" units");
        	double units=scan.nextDouble();
        	double old_bill_amount=check.getBill(units);
        	double new_bill_1st_month=check.getBill(units/2);
        	double new_bill_2nd_month=check.getBill(units/2);	
            double profit=old_bill_amount-(new_bill_1st_month+new_bill_2nd_month);
            double percent=old_bill_amount/profit *100;
            record.add(new Store_record("Bill NO. "+i,profit,percent,old_bill_amount) );
            marginTotal+=old_bill_amount;
            marginAmount+=profit;
            marginUnits+=units;
            margin_oldAmount+=old_bill_amount;
           
        }
        double margin_profit=margin_oldAmount-(marginAmount);
        double profit_percentage=margin_oldAmount/margin_profit*100;
        whole_record.add(new Store_record(margin_oldAmount,No_bills,profit_percentage, marginTotal,marginUnits));
	
	  System.out.println(record);
	  System.out.println("--------");
	  //System.out.println(whole_record);
	}
	
}