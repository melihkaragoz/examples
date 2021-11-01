public class Student{
    private int ID;
    private String firstName;
    private String lastName;
    private int order;
    private static int count=0;
 
    public Student(int ID,String firstName,String lastName){
        setID(ID);
        setFirstName(firstName);
        setLastName(lastName);
        ++count;     
        this.order = getCount();
    }

    public static int getCount(){
        return count;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getID(){
        return this.ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public int getOrder(){
        return this.order;
    }
    
}