TechSupport - the DodgySoft Technical support system.

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

This project is discussed in chapter 6.

This project aims to implements a technical support system for customers of 
the DodgySoft software company. Users can describe their software problems and 
get advice instantly!

The idea is based on Eliza - a famous program described by Joseph Weizenbaum 
in 1966. (Do a web search for "Eliza" and "Weizenbaum" if you want to know 
more about this.)

In fact, it is much more primitive than Eliza. But that's enough to match the 
quality of many software companies' technical support advice...  ;-)

To start this program, create a SupportSystem object and execute the "start" 
method.

Then start describing your problem by typing in the terminal window.

The purpose of this project is to demonstrate and study library classes, such 
as ArrayList, HashMap, HashSet, and Random.

This project is only a first, rudimentary step towards the full solution.

24. What is a HashMap?

A HashMap is a class in Java that implements the Map interface. It stores key value-piars.
These keys are unique and they map to exactly oine value. It allows fast lookups, insertions,
and deletions.

25. 



26.

Use map.size()

27.

28. 

If the key already exists, the old value is replaced with the new one

29.

If keys are both different, both entries are stored.

30.

if (map.containsKey("Alice")) {
    System.out.ptingln("Alice exists in the map.");
}

31. 
map.get(key) returns null if the key does not exist.

32. 

for (String key : map.keySet()) {
    System.out.println(key);
}

TechSupport system with a map

Use HashMap<String, String> where keys are words and values are responses.

33.

34.

ArrayList is ordered and allows duplicated, as well as indexed access.
HashSet however is unordered and allows no duplicates but iallows fast lookup.

35. 

ArrayList: preserves insertion order and allows duplicates.

HashSet: no order guaranteed, duplicates removed.

36.If you split input with String.split(" "), extra spaces may create empty strings.
You could use splits("\\s+") which handles multiple spaces.

37. 

Adjust code so input is stored in a HashSet<String>:

if (input.contains("bye)) {
    // end program
}

In the Responder:

public String generateResponse(HashSet<string> words) {
    for (String word : words) {
        if (responses.containsKey(word)) {
            return responses.get(word);
        }
    }
    return pickDefaultResponse();
}

38. 

Add more entries to responses.put("word", "response").

39. 
Store the last default response, compare before picking new one.

40.

Map multiple keys to the same response like
responses.put("slow", "Try restarting.");
responses.put("lag", responses.get("slow));

41.

Instead of returning on the first match, collect all matches and respond accordingly.

42. Smarter default responses

If there is no match, check input words like "why", "how, "who",
and return a related default.





