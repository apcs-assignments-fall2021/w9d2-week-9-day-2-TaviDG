public class Person {
    private String firstName;
    private String lastName;
    public Person(String f, String l){
        this.firstName = f;
        this.lastName = l;
    }
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public void setFirstName(String f){this.firstName=f;}
    public void setLastName(String l){this.lastName=l;}
    public String toString(){return (this.firstName+" "+ this.lastName);}
    public void doSomething(){
        System.out.println("I am watching Netflix");
    }
}
