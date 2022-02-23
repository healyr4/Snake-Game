import javax.swing.JFrame;

/**
 * @author healy
 *
 */
public class GameFrame extends JFrame{
	GameFrame(){
		this.add(new GamePanel());
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		// Fit Jframe around components we add to frame
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
