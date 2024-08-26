package com.rnsit.day3;

public class customer {
    private String customerName;
    private int customerId;
    private String customerCity;

    //default constructor
	 public customer()
 {
		 System.out.println("Iam a default constructor");
 }

    public customer(String customerName, int customerId, String customerCity){
         this.customerName = customerName;
         this.customerId = customerId;
         this.customerCity = customerCity;

    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }


    @Override
    public String toString()
    {
        return "customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
                + customerCity + "]";
    }
}
