public class helloMessage {
    String helloMessage; // error -- should use static keyword
    public void main(String[] args)
    {
        helloMessage = "Hello, World!";
        System.out.println(helloMessage); // will not compile
    }
}
