import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock extends JFrame {

    private final JLabel timeLabel;
    private final JLabel dateLabel;

    public DigitalClock() {
        // --- Window Setup ---
        setTitle("Digital Clock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // --- Background Panel ---
        JPanel panel = new JPanel();
        panel.setBackground(new Color(20, 20, 30));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 60, 40, 60));

        // --- Time Label (HH:mm:ss) ---
        timeLabel = new JLabel("00:00:00");
        timeLabel.setFont(new Font("Monospaced", Font.BOLD, 80));
        timeLabel.setForeground(new Color(255, 40, 40));
        timeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(timeLabel);

        // --- Small Spacer ---
        panel.add(Box.createRigidArea(new Dimension(0, 15)));

        // --- Date Label ---
        dateLabel = new JLabel("Date");
        dateLabel.setFont(new Font("Monospaced", Font.PLAIN, 24));
        dateLabel.setForeground(new Color(220, 80, 80));
        dateLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(dateLabel);

        // --- Add panel to frame ---
        add(panel);

        // --- Pack FIRST, then center ---
        pack();
        setLocationRelativeTo(null);

        // --- Show the window ---
        setVisible(true);

        // --- Update clock immediately before timer starts ---
        updateClock();

        // --- Timer: updates every 1 second ---
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateClock();
            }
        });
        timer.start();
    }

    private void updateClock() {
        LocalDateTime now = LocalDateTime.now();

        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        timeLabel.setText(time);

        String date = now.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy"));
        dateLabel.setText(date);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(DigitalClock::new);
    }
}
