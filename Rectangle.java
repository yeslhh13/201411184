public class Rectangle {
  private int width;
  private int height;
  public Rectangle(int w, int h) {
    setWidth(w);
    setHeight(h);
  }
  public void setWidth(int w) {
    this.width = w;
  }
  public void setHeight(int h) {
    this.height = h;
  }
  public int getWidth() {
    return width;
  }
  public int getHeight() {
    return height;
  }
  public int calcArea() {
    return width * height;
  }
}
