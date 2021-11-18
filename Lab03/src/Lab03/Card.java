package Lab03;

public class Card {
private final Face face;
private final Suit suit;

public Card(Face face, Suit suit) {
this.face = face;
this.suit = suit;
}

public Suit getSuit() {
return suit;
}

public Face getFace() {
return face;
}

@Override
public String toString() {
return "(" + face + " of " + suit + ")";
}

}
