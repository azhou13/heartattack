import core.data.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        DataSource ds = DataSource.connect("heart.csv");
        ds.load();
        //ds.printUsageString();
        //ds.fetch()
        //System.out.println(ds);
        
        Patient[] list = ds.fetchArray("Patient", "age", "sex", "chol");
        System.out.println("We have " + list.length + " patients' info...");
        
        //average age stuff
        double averageAge = 0;
        for (int i = 0; i < list.length; i++) {
            averageAge += list[i].getAge();
        }
        averageAge = averageAge/list.length;
        System.out.println("The average age to have a heart attack is " + averageAge);

        //average gender stuff
        double averageSex = 0;
        for (int i = 0; i < list.length; i++) {
            averageSex += list[i].getSex();
        }
        averageSex = averageSex/list.length;
        System.out.println("The \"average\" sex to have a heart attack is " + averageSex);
        System.out.println("Since male = 1 and female = 0, this means 68% of patients were men");
        
        System.out.println("\n\nTherefore, I will believe that a 54 year old man is most likely to have a heart attack");
    }
}