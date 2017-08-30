/**
 * Purpose: Display I Love Java Java is Fun
 * @author Tanes Kanchanawanchai
 * License GNU License
 * Created on 8/29/2017.
 * Version 1.0
 */
public class JavaIsFun {

    /**
     * JavaIsFun constructor
     */
    public JavaIsFun() {
    }

    /**
     * This method represents f(x) = x+1. It will increase the value of x by 1.
     * For example: f(x) = x+1
     *              f(2) = 3
     * @param x is an intenger value that needed to be increased by 1.
     * @return x+1
     */
    public static int f(int x) {
        return x+1;
    }

    /**
     * Main method to display Hello Name
     * Example: args[0]=Tanes args[1]=Kanchanawanchai
     * @param args represents the Name
     */
    public static void main(String [] args) {
        System.out.println("Hello "+args[0]);
    }
}
