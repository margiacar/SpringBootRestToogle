package appservice;

public class StandardGreetingHandler implements GreetingHandler {

    private static final String template = "Hello, %s!";

    public String getGreeting(String name) {
        return String.format(template, name);
    }
}