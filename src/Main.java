import view.MyFrame;
import view.MyPanel;

public class Main {
  public static void main(String[] args) {
    MyFrame myFrame = new MyFrame(new MyPanel());
    myFrame.pack();
    myFrame.setVisible(true);
  }
}