class TaxCalculator
{
         public static double taxableannualSalary(double monthlySalary)
         {
        double annualSalary=12*monthlySalary;
        double tax=0;
        if(annualSalary<=250000)
{
   tax=0;
}
else if(annualSalary>250000 && annualSalary<=500000)
{
   tax=0.1*annualSalary;
}
else if(annualSalary>500000 && annualSalary<=1000000)
{
   tax=0.2*annualSalary;
}
else if(annualSalary>1000000)
{
   tax=0.3*annualSalary;
}

return tax;
         }
         
         public static void main(String [] args)
         {
        	 System.out.println(taxableannualSalary(300000));   
         }
}