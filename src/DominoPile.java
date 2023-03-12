import java.util.ArrayList;
import java.util.Random;

public class DominoPile {
    ArrayList<Domino> pile;

    public DominoPile() {
        pile = new ArrayList<>();
    }

    public void newStack6() {
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                pile.add(new Domino(i, j));
            }
        }
    }

    public void shuffle() {
        ArrayList<Domino> tempPile = new ArrayList<>();
        while (!pile.isEmpty()) {
            Random random = new Random();
            int randIndex = random.nextInt(pile.size());
            tempPile.add(pile.get(randIndex));
            pile.remove(randIndex);
        }
        pile = tempPile;
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void setPile(ArrayList<Domino> pile) {
        this.pile = pile;
    }
}
