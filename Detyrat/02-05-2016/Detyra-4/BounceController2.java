
/** BounceController controls two moving balls.  */
public class BounceController2
{ private MovingBall ball1;  // model object
  private MovingBall ball2;  // model  object
  private AnimationWriter2 writer; // output-view object
   private double deltaX;
   private double deltaY;
   private double distance;
  /** Constructor BounceController initializes the controller
    * @param b1 - a ball
    * @param b2 - another ball
    * @param w - the output-view object  */
  public BounceController2(MovingBall b1, MovingBall b2, AnimationWriter2 w)
  { ball1 = b1;
    ball2 = b2;
    writer = w;
  }
  
  /** runAnimation  runs the animation by means of an internal clock */
  public void runAnimation()
  { while ( true )
          { delay(20);   // delay 20 milliseconds --- one clock ``tick''
            ball1.move(1);
            ball2.move(1);
            checkCollision();
            writer.repaint();  // redisplay box and ball
          }
    
  }
  
      public void checkCollision() {

        deltaX = Math.abs(ball1.xPosition() - ball2.xPosition());
        deltaY = Math.abs(ball1.yPosition() - ball2.yPosition());
        distance = deltaX * deltaX + deltaY * deltaY;
        
        if (distance < (ball1.radiusOf() / 2 + ball2.radiusOf() / 2) * (ball1.radiusOf() / 2 + ball2.radiusOf() / 2)) {

            int newxSpeed1 = (ball1.x_velocity() * (4 - 7) + (2 * 7 * ball2.x_velocity())) / 11;

            int newxSpeed2 = (ball2.x_velocity() * (7 - 4) + (2 * 4 * ball1.x_velocity())) / 11;

            int newySpeed1 = (ball1.y_velocity() * (4 - 7) + (2 * 7 * ball2.y_velocity())) / 11;

            int newySpeed2 = (ball2.y_velocity() * (7 - 4) + (2 * 4 * ball1.y_velocity())) / 11;

            ball2.set_x_velocity(newxSpeed2);
            ball2.set_y_velocity(newySpeed2);
            ball1.set_x_velocity(newxSpeed1);
            ball1.set_y_velocity(newySpeed1);

        }
     }
  /** delay pauses execution for  how_long  milliseconds */
  private void delay(int how_long)
  { try { Thread.sleep(how_long); }
    catch (InterruptedException e) { }
  }
}
