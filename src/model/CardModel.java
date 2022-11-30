package model;

public class CardModel {
  int pin;
  long number;
  double money;

  public CardModel(int pin, long number, double money) {
    this.pin = pin;
    this.number = number;
    this.money = money;
  }

  public int getPin() {
    return pin;
  }

  public void setPin(int pin) {
    this.pin = pin;
  }

  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }
}