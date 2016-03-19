package ua.goit.java;

/**
 * Created by 7 on 19.03.2016.
 */
public class InstrumentsShop {
    int pianos;
    int guitars;
    int trumpets;

    public int getPianos() {
        return pianos;
    }

    public void setPianos(int pianos) {
        this.pianos = pianos;
    }

    public int getGuitars() {
        return guitars;
    }

    public void setGuitars(int guitars) {
        this.guitars = guitars;
    }

    public int getTrumpets() {
        return trumpets;
    }

    public void setTrumpets(int trumpets) {
        this.trumpets = trumpets;
    }

    public String leftInTheShop() {
        return "Only '"+pianos+"' pianos, '"
                +guitars+"' guitars and '"
                +trumpets+"' trumpets left in the shop";
    }

    public String toString() {
        return "There is: '"+ pianos +
                "' pianos, '" + guitars +
                "' guitars and '" + trumpets + "' trumpets in the shop";
    }
}
