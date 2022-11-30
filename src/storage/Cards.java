package storage;

import java.util.ArrayList;
import model.CardModel;

public class Cards {
  ArrayList<CardModel> cards = new ArrayList<>();

  public Cards() {
    cards.add(new CardModel(1234, 4440123456789000l, 200));
    cards.add(new CardModel(2264,2440123234789000l, 0));
    cards.add(new CardModel(1290,4430123456787654l, 1200));
    cards.add(new CardModel(9022,612056856789000l, 25000));
  }

  public ArrayList<CardModel> getCards() {
    return cards;
  }
}
