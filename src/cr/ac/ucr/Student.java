package cr.ac.ucr;

public class Student extends Person {
    private String ID;
    
    public Student(){
    }

    public Student(String name, String ID, int age){
        super(name,age);
        this.ID = ID;
    }
    
    public void setID(String id){
        this.ID = id;
    }
    
    public String getID(){
        return this.ID;
    }
    
    @Override
    public String toString(){
        return super.toString() + " \nID: " + this.ID;
    }
}
