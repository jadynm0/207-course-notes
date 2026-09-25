/** Class representation of a rectangle. */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Initializes the rectangle.
   *
   * @param w the width
   * @param h the height
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /** Returns the area of this rectangle. */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor the scale factor
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether this rectangle has a larger area than the other rectangle.
   *
   * @param other the other rectangle
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
