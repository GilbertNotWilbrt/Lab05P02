import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder
{
    private HashMap<String, String> responseMap;
    
    
    public Responder()
    {
        responseMap = new HashMap<String, String>();
        fillResponseMap();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        if (responseMap.containsKey()) {
            return responseMap.get();
        }
        else {
            return "That sounds interesting. Tell me more...";
        }
    }
    
     private void fillResponseMap()
    {
        responseMap.put("slow", "Maybe your computer is running too many programs.");
        responseMap.put("crash", "That sounds serious. Have you tried restarting?");
        responseMap.put("bug", "Every program has some bugs. Can you describe it?");
        responseMap.put("windows", "That might be a Windows problem, not ours.");
        responseMap.put("mac", "That might be a Mac problem, not ours.");
    }
}


