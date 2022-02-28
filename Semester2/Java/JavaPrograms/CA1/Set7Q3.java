package CA1;

import CA1.Company.Finance;
import CA1.Company.Marketing;
import CA1.Company.Production;
import CA1.Company.Sales;

class Company{
    public int getMaxIndex(double amount[]){
        int N = 3;
        int index=0;
        double max = amount[0];
        for(int i = 0; i < N; i++){
            if(max < amount[i]){
                max = amount[i];
                index = i;
            }
        }
        return index;
    }
    class Production{
        String empName[] = {
            "Ram",
            "Shyam",
            "Mohan"
        };
        double salary[] = {53453, 43534, 45445};
        void getHighlyPaid(){
            int a = getMaxIndex(salary);
            System.out.println("Production Department: "+ empName[a]+" Rs."+salary[a]);
        }
    }

    class Marketing{
        String empName[] = {
            "Lakshman",
            "Bharat",
            "Shatrughn"
        };
        double salary[] = {23432, 24343, 45326};
        void getHighlyPaid(){
            int a = getMaxIndex(salary);
            System.out.println("Marketing Department: "+ empName[a]+" Rs."+salary[a]);
        }
    }

    class Finance{
        String empName[] = {
            "Sohan",
            "Hari",
            "Murali"
        };
        double salary[] = {43243, 54656, 75678};
        void getHighlyPaid(){
            int a = getMaxIndex(salary);
            System.out.println("Finance Department: "+ empName[a]+" Rs."+salary[a]);
        }
    }

    class Sales{
        String empName[] = {
            "Murari",
            "Govind",
            "Narayan"
        };
        double salary[] = {34534, 45454, 34534};
        void getHighlyPaid(){
            int a = getMaxIndex(salary);
            System.out.println("Sales Department: "+ empName[a]+" Rs."+salary[a]);
        }
    }
}

public class Set7Q3 {
    public static void main(String[] args) {
        Company c = new Company();
        Production cp = c.new Production();
        Marketing cm = c.new Marketing();
        Finance cf = c.new Finance();
        Sales cs = c.new Sales();

        System.out.println("Highly paid Employees of each department:");
        cp.getHighlyPaid();
        cm.getHighlyPaid();
        cf.getHighlyPaid();
        cs.getHighlyPaid();
    }
}
