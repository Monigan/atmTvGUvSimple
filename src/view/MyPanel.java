package view;

import controller.BankomatController;
import controller.BankomatControllerImpl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyPanel extends JPanel {
  BankomatController bankomatController = new BankomatControllerImpl();
  private JTextField fieldPin;
  private JButton putPin;
  private JTextField getMoneyField;
  private JButton getMoney;
  private JPanel getMoneyPanel;
  private JPanel getPinPanel;
  private JTextArea resultText;
  private JPanel resultPanel;
  private JPanel mainPanel;

  public MyPanel() {
    add(mainPanel);
    putPin.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if(bankomatController.checkPin(Integer.parseInt(fieldPin.getText()))){
          getMoneyPanel.setVisible(true);
          getPinPanel.setVisible(false);
        }
        else {
          getPinPanel.setVisible(false);
          resultPanel.setVisible(true);
          resultText.setText("Пинкод не верен!");
        }
      }
    });
    getMoney.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (bankomatController.checkBalance(Double.parseDouble(getMoneyField.getText()))){
          getMoneyPanel.setVisible(false);
          resultPanel.setVisible(true);
          resultText.setText("Вы успешно сняли деньги!");
        }
        else {
          getMoneyPanel.setVisible(false);
          resultPanel.setVisible(true);
          resultText.setText("Вы не сняли деньги!");
        }
      }
    });
  }
}
