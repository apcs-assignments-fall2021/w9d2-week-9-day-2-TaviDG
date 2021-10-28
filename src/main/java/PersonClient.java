public class PersonClient {
    public static void main(String[] args) {
        // Write some very very basic testing code here
        // Create a Person and then call each of the
        // methods on the Person
        Person tavi = new Person("Boop","Blarp");
        System.out.println(tavi.getFirstName());//Boop
        System.out.println(tavi.getLastName());//Blarp
        System.out.println(tavi);//Boop Blarp
        tavi.setFirstName("Tavi");
        tavi.setLastName("Greenfield");
        System.out.println(tavi.getFirstName());//Tavi
        System.out.println(tavi.getLastName());//Greenfield
        System.out.println(tavi);//Tavi Greenfield
        tavi.doSomething();//I am watching Netflix

        NinthGrader jason = new NinthGrader("Jason", "Smith");
        System.out.println(jason);
        NinthGrader will = new NinthGrader();
        System.out.println(will);
    }
}