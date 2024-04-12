import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingStopwatch implements ActionListener {

  private long startTime;
  private boolean isRunning = false;
  private final JLabel timeLabel;

  public SwingStopwatch() {
    startTime = System.currentTimeMillis();
    timeLabel = new JLabel("00:00:00.000");
    timeLabel.setHorizontalAlignment(JLabel.CENTER);
  }

  public void createAndShowGUI() {
    JFrame frame = new JFrame("Stopwatch");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();

    JButton startButton = new JButton("Start");
    startButton.addActionListener(this);
    panel.add(startButton);

    JButton stopButton = new JButton("Stop");
    stopButton.addActionListener(this);
    stopButton.setEnabled(false);
    panel.add(stopButton);

    JButton resetButton = new JButton("Reset");
    resetButton.addActionListener(this);
    resetButton.setEnabled(false);
    panel.add(resetButton);

    panel.add(timeLabel);

    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton clickedButton = (JButton) e.getSource();
    String buttonText = clickedButton.getText();

    if (buttonText.equals("Start")) {
      isRunning = true;
      startTime = System.currentTimeMillis();
      startButton.setEnabled(false);
      stopButton.setEnabled(true);
      resetButton.setEnabled(true);
      // Update timer in a separate thread
      new Thread(() -> {
        while (isRunning) {
          try {
            Thread.sleep(1);
            updateTimer();
          } catch (InterruptedException ex) {
            break;
          }
        }
      }).start();
    } else if (buttonText.equals("Stop")) {
      isRunning = false;
      stopButton.setEnabled(false);
      startButton.setEnabled(true);
    } else if (buttonText.equals("Reset")) {
      isRunning = false;
      startTime = System.currentTimeMillis();
      timeLabel.setText("00:00:00.000");
      startButton.setEnabled(true);
      stopButton.setEnabled(false);
      resetButton.setEnabled(false);
    }
  }

  private void updateTimer() {
    long elapsedTime = System.currentTimeMillis() - startTime;
    long milliseconds = elapsedTime % 1000;
    long seconds = (elapsedTime / 1000) % 60;
    long minutes = (elapsedTime / (60 * 1000)) % 60;
    long hours = (elapsedTime / (60 * 60 * 1000));

    String formattedTime = String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, milliseconds);
    timeLabel.setText(formattedTime);
  }

  public static void main(String[] args) {
    SwingStopwatch stopwatch = new SwingStopwatch();
    stopwatch.createAndShowGUI();
  }
}
