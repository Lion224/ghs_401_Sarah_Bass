
public class HolidayCharacter
{
    private String character;
    private boolean holidaySpirit;
    private int age;
    
    
    public HolidayCharacter() {
        this.character = null;
        this.holidaySpirit = false;
        this.age = 0;
    }
    public HolidayCharacter(String character, boolean holidaySpirit, int age) {
        this.character = character;
        this.holidaySpirit = holidaySpirit;
        this.age = age;
    }
    public String toString() {
        String output = "Character: " + character + "\nHoliday Spirit? " + holidaySpirit + "\nAge: " + age;
        return output;
    }
}
