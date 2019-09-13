package appservice;

public class HolidayGreetingHandler implements GreetingHandler {

    private static final String template = "Happy Holidays, %s!";

    public String getGreeting(String name) {
        return String.format(template, name);
    }
}
