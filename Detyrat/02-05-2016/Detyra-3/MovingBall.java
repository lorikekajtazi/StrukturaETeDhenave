/** MovingBall models a moving ball */
public class MovingBall
{ private int x_pos;  // ball's center x-position
  private int y_pos;  // ball's center y-position
  private int radius; // ball's radius

  private int x_velocity = +5; // horizonal speed; positive is to the right
  private int y_velocity = +2; // vertical speed; positive is downwards

  private Box container;  // the container in which the ball travels

  /** Constructor MovingBall constructs the ball.
    * @param x_initial - the center of the ball's starting horizontal position
    * @param y_initial - the center of the ball's starting vertical position
    * @param r - the ball's radius
    * @param box - the container in which the ball travels */
  public MovingBall(int x_initial, int y_initial, int r, Box box)
  { x_pos = x_initial;
    y_pos = y_initial;
    radius = r;
    container = box;
  }

  public int x_velocity()
  { return x_velocity; }
  
  public void set_x_velocity(int xvelocity)
  { this.x_velocity = xvelocity; }
  /** xPosition returns the ball's current horizontal position */
  public int y_velocity()
  { return y_velocity; }
  
  public void set_y_velocity(int yvelocity)
  { this.y_velocity = yvelocity; }

  /** yPosition returns the ball's current vertical position */
   public int xPosition()
  { return x_pos; }
  
  public int yPosition()
  { return y_pos; }

  /** radiusOf returns the ball's radius */
  public int radiusOf()
  { return radius; }

  /** move moves the ball 
    * @param time_units - the amount of time since the ball last moved */
  public void move(int time_units)
  { x_pos = x_pos + (x_velocity * time_units);

        if (x_pos - radiusOf() / 2 < 0) {
            x_pos = radiusOf() / 2;
            x_velocity= -x_velocity;
        } else if (x_pos + radiusOf() / 2 > 390) {
            x_velocity = -x_velocity;
        }
  
    if ( container.inHorizontalContact(x_pos))
       { x_velocity = -x_velocity; }   // reverse horizontal direction
    y_pos = y_pos + (y_velocity * time_units);
    if ( container.inVerticalContact(y_pos) )
       { y_velocity = -y_velocity; }  
       
            if (y_pos - radiusOf() / 2 < 0) {
            y_velocity = -y_velocity;
        } else if (y_pos + radiusOf() / 2 > 360) {
            y_pos = 360 - radiusOf() / 2;
            y_velocity = -y_velocity;
        } // reverse vertical direction
    
  }
  
}