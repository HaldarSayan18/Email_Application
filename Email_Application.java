import java.util.*;
import java.lang.Math;
public class Email_Application
{
    Scanner sc = new Scanner(System.in);

    private String Fname, Lname, passwd, dept;
    public int mail_capacity, deptChoice;
    private String alt_email, Email;
    private int passwdLength = 10, num = 1;
    private String compSuffix = ".xyz.ac.in";

    //constructor to receive the first_name and last_name
    public Email_Application(String Fname, String Lname){
        this.Fname = Fname;
        this.Lname = Lname;
        //System.out.println("Email created: "+this.Fname+" "+this.Lname);
        this.dept = dept();
        //System.out.println("Department is: "+this.dept);
        this.passwd = passwd(passwdLength);
        //System.out.println("System generated random password is: "+this.passwd);
        //Combine elements to generate email
        Email = Fname.toLowerCase()+"."+Lname.toLowerCase()+"@"+dept+compSuffix;
        //System.out.println("Your email is: "+Email);
    }

    //Ask user for department
    public String dept(){
        System.out.println("Department Codes:\n 1 for Development \n 2 for Analysis \n 3 for Sales & Marketing \n Enter department code: ");
        int deptChoice = sc.nextInt();
        switch (deptChoice) {
            case 1:
                return "Development";
                
            case 2:
                return "Analysis";
                
            case 3:
                return "Sales_&_Marketing";
                
            default:
                System.out.println("Sorry! \n Provide the correct information.");
        }
        /*if(deptChoice == 1){
            return "Development";
        }
        else if(deptChoice == 2){
            return "Analysis";
        }
        else if(deptChoice == 3){
            return "Sales_&_Marketing";
        }
        else if(deptChoice < 1 || deptChoice > 3){
            System.out.println("Sorry! \n Provide the correct information.");
        }*/
        return "";
    }

    //Generation of a random pssword
    private String passwd(int length){
        String passwdSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@#%&_/$";
        char [] passwd = new char[length];
        for(int i = 0; i<length; i++){
            int rand = (int) (Math.random() * passwdSet.length());
            passwd[i] = passwdSet.charAt(rand);
            //System.out.println(rand);
            //System.out.println(passwdSet.CharAt(rand));
        }
        return new String (passwd);
    }

    //Set mailbox capacity
    public void setMailCapacity(int mail_capacity){
        this.mail_capacity = mail_capacity;
    }

    //Get mailbox capacity
    public int getMailCapacity(){
        return mail_capacity;
    }

    //Set the alternate Email
    public void setAltEmail(String alt_email){
        this.alt_email = alt_email;
    }
    //Get the alternate Email
    public String getAltEmail(){
        return alt_email;
    }

    //Set the password
    public void chngPasswd(String passwd){
        this.passwd = passwd;
    }
    //Get the password
    public String getPasswd(){
        return passwd;
    }

    //Showing Information or details
    public String showInfo(){
        num = (int) (deptChoice);
        //int num = sc.nextInt();
        if(num == deptChoice){
            if(num >= 1 || num <= 3){
                System.out.println("Email created successfully.");
                System.out.println("<================ YOUR DETAILS ================>");
                System.out.println("Display Name: "+Fname+" "+Lname+"\n"+"Company Email: "+Email+"\n"+"Mailbox Capacity: "+mail_capacity);
                System.out.println("<============ !!Welcome In Company!! ============>");
                System.out.println("Thank You");
            }
        }
        else{
            System.out.println("Thank You");
        }
        return "";
    }

    //main method
    public static void main (String args[]){
        Email_Application email = new Email_Application("Sayan", "Haldar");
        //int num = email.dept().charAt(1);
        //System.out.println ("Mailbox Capacity: "+email.getMailCapacity()+"\n");
        System.out.println(email.showInfo());
    }
}
