package person;

import java.util.Scanner;
public class TestPerson
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        String name = null;
        int age;
        char gender;
        
        System.out.print("Enter number of person: ");
        int num = sc.nextInt();
        PersonList people = new PersonList(num);
        
        for (int i = 0; i < num; i++)
        {
            System.out.print("\nEnter name = ");
            name = sc.next();
            System.out.print("\nEnter age = ");
            age = sc.nextInt();
            System.out.print("\nEnter gender = ");
            gender = sc.next().toCharArray()[0];
            people.addRecord(name, age, gender);
        }
        
        people.displayRecord();
        
        
        System.out.print("\nEnter the name you want to search: ");
        name = sc.next();
                
        people.searchRecord(name);
        
        System.out.print("\nEnter the name you want to delete: ");
        name = sc.next();
    }
}