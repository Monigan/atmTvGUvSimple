package controller;

import model.CardModel;

public interface BankomatController {
  void setCard(int id);
  boolean checkPin(int pin);
  boolean checkBalance(double value);
}
