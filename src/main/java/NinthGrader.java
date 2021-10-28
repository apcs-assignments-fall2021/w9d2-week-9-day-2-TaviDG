public class NinthGrader extends Student{
    public NinthGrader(String firstName, String lastName){
        super(firstName,lastName);
    }
    public NinthGrader(){
        super("Will", "Smith");
    }
    @Override
    public String toString(){
        return getFirstName() + " " + getLastName() + ", " + getClassYear() + " (Ninth Grader)";
    }
    @Override
    public void doSomething(){
        System.out.println("I'm writing my World Lit essay!");
    }
}
