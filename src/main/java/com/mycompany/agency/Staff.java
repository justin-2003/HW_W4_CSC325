package com.mycompany.agency;




public class Staff {
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        staffList[0]= new Executive("Alrajab","25 New Tree Line","516-908-7685","002-897-9810",21600.6);
        staffList[1]= new TempEmploee("Sam","453 Fifth Ave.","347-986-2716","675-986-8761",1546.15);
        staffList[2]= new StaffEmployee("William","789 Off Line", "516-980-8790","554-987-1719",1662.4);
        staffList[3]= new Intern("Maya", "687 Wood Blvd.","718-908-7686");
        staffList[4]= new StaffEmployee("Alex","452 Elm Lane", "516-652-8261","005-162-1881",1662.4);
        staffList[5]= new Intern("Mike","25 Off Rocker","516-908-2617");



        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
