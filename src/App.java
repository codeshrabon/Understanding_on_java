public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("Here i am again in JAVA");
        Person p1 = new Person();
        p1.name = "faysal ahmed";
        // using instance method here in main method we are printing it 
        p1.sayHello();

        System.out.println("Using Encapsulation class");
        Encapsulation encap = new Encapsulation();


        encap.setName("Sharbon");
        System.out.println("From encapsulation --> my Name is " + encap.getName());
        }
}