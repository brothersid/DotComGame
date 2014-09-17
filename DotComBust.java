import java.util.*;
public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0 ;

    private void setUpGame() {
	DotCom one = new DotCom();
	one.setName ("Pets.com");
	DotCom two = new DotCom();
	two.setName("etoys.com");
	DotCom three = new DotCom();
	three.setName("Go2.com");
	dotComsList.add(one);
	dotComsList.add(two);
	dotComsList.add(three);

	System.out.println("Your goal is the sink threee dot coms") ;
	System.out.println("Pets.com,eToys.com,Go2.com");
	System.out.println("Try to sink them all in the fewest number of guesses");

	for (DotCom dotComToSet : dotComsList) {
	    ArrayList<String> newLocation = helper.placeDotCom(3) ;
	    dotComToSet.setLocationCells(newLocation);
	}
    }
    public void startPlaying() {

	While (!dotComsList.isEmpty()) { 
	    String userGuess = helper.getUserInput("Enter a guess");
	    checkUserGuess(userGuess);
	}
	finishGame();
    }
    private void checkUserGuess(String userGuess) {
	numOfGuesses++;
	String result  = "miss";
	for(int x=0; x < dotComsList.size(); x++) {
	    result= dotComsList.get(x).checkYouself(userGuess);
	    if (result.equals("hit")){
		break;
	    }
	    if (result.equals("kill")) {
		dotComsList.remove(x);
		break;
	    }
	}
	sytstem.out.println(result);
    }
    private void finishGame() {
	system.out.println("All Dot Coms are dead! Your stock is now worthless!");
	if (numOfGuesses <= 18)
	    System.out.println("it only took you" + numOfGuesses = "guesses.");
	System.out.println("You got out before your options sank.");
    } else {
	System.out.println("Took you loung enough." + numOfGuesses + "guesses");
	System.out.println("Fish are dancing with your options");
    }


    public static void main(String[]args) {
	DotComBust game = new DotComBust();
	game.setUpGame();
	game.startPlaying();
    }
}
	







