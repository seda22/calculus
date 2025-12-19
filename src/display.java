//var operation stores operation number to be performed 
//currently only supports differentiation & integration others to be added subsequently
//1=integration
//2=diff

package io.yash.logic;
import java.util.*;
public class display
{
    int operation;
    void displayrules()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input an option for operation to be performed:use LOWER CASE only");
        System.out.println("integration/differentiation");
        String input=sc.nextLine();
        if(input.contains("integration"))
        operation=1;
        if(input.contains("differentiation"))
        operation=2;

    }
}