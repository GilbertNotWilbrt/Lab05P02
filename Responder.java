import java.util.HashMap;

public class Responder
{
    private HashMap<String, String> responseMap;

    public Responder()
    {
        responseMap = new HashMap<>();
        fillResponseMap();
    }

    public String generateResponse(String word)
    {
        if (responseMap.containsKey(word)) {
            return responseMap.get(word);
        } else {
            return pickDefaultResponse();
        }
    }

    private String pickDefaultResponse()
    {
        return "That sounds interesting. Tell me more...";
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