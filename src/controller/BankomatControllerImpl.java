package controller;

import model.CardModel;
import storage.Cards;

public class BankomatControllerImpl implements BankomatController {
  Cards cards = new Cards();
  CardModel model;

  public BankomatControllerImpl() {
    model = cards.getCards().get(0);
  }

  @Override
  public void setCard(int id) {
    model = cards.getCards().get(id);
  }

  @Override
  public boolean checkPin(int pin) {
    return model.getPin() == pin;
  }

  @Override
  public boolean checkBalance(double value) {
    return model.getMoney() - value > 0;
  }
}
