
import java.awt.*;
import javax.swing.*;
/** AnimationWriter2 displays a box with two balls in it.  */
public class AnimationWriter2 extends JPanel
{ private BoxWriter box_writer;    // the output-view of the box
  private BallWriter ball1_writer;  // the output-view of the ball in the box
  private BallWriter ball2_writer;  // the output-view of the ball in the box

   

  /** Constructor AnimationWriter construct the frame
    * @param b - the box's writer
    * @param l1 - the ball's writer
    * @param l2 - the ball's writer
    * @param size - the frame's size */
  public AnimationWriter2(BoxWriter b, BallWriter l1, BallWriter l2, int size)
  { box_writer = b;
    ball1_writer = l1;
    ball2_writer = l2;
    JFrame my_frame = new JFrame();
    my_frame.getContentPane().add(this);
    my_frame.setTitle("Bounce");
    my_frame.setSize(size, size);
    my_frame.setVisible(true);
  }

  /** paintComponent paints the box and ball
    * @param g - the graphics pen */
  public void paintComponent(Graphics g)
  { box_writer.paint(g);
    ball1_writer.paint(g);
    ball2_writer.paint(g);
  }
}

