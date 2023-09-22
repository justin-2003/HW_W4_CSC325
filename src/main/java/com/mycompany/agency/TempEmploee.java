package com.mycompany.agency;



    // TODO 1: Make TempEmploee a child of StaffEmploee

public class TempEmploee extends StaffEmployee
{
    private int hoursWorked;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this hourly employee using the specified
    //  information.
    //-----------------------------------------------------------------
    public TempEmploee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        hoursWorked = 0;
    }

    //-----------------------------------------------------------------
    // TODO2: Adds the specified number of hours to this employee's
    //  accumulated hours.
    //-----------------------------------------------------------------
    public void addHours(int moreHours)
    {
        this.hoursWorked += moreHours;
    }

    //-----------------------------------------------------------------
    // TODO3: Computes and returns the pay for this hourly employee.
    //-----------------------------------------------------------------
    public double pay()
    {
        double totalPay = this.hoursWorked * super.pay();
        return totalPay;
    }

    //-----------------------------------------------------------------
    // TODO4: Returns information about this hourly employee as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String str = String.format("Name: %s\nAddress: %s\nPhone: %s\nSocial Security Number: %s\nCurrent hours: %d",name, address, phone, socialSecurityNumber, hoursWorked);
        return str;
    }
}
