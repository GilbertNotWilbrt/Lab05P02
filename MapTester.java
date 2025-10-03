import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 *
 * @Gilbert Aquino
 * @Oct 2 2025
 */
public class MapTester
{
    private HashMap<String, String> phoneBook;
    
    public MapTester() {
        phoneBook = new HashMap<>();
    }
   
    public void enterNumber(String name, String number) {
        phoneBook.put(name,number);
    }
    
    public String lookupNumber(String name) {
        return phoneBook.get(name);
    }
    
    public static void main (String[] args) {
        MapTester tester = new MapTester();
        tester.enterNumber ("Alice", "1234");
        tester.enterNumber("Bob", "5678");
        
        String number = tester.lookupNumber("Alice");
        System.out.println("Alice's number is: " + number);
    }
}