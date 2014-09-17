import java.util.*;

pubic class DotCom {
    private ArrayList <Stromg> locationCells;
    private String name;

    public void setName(String n) {
	name=n;
    }

    public string CheckYourself(String userInput) {
	String result = "miss";
	int index = locationCells.indexof(userInput);
	if (index >= 0) {
	    locationCells.indexof(userInput);
	    if (locationCells.isEmpty()) {
		result = "kill";
		System.out.println("Ouch! You Sunk" + name + ":( ");
	    } else{
		result = "hit";
	    }
	}
	return result;
    }
}
