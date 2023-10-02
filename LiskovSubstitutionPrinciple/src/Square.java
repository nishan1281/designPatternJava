public class Square extends Rectangle {

    public Square() {
    }

    public Square(int size) {
        super(size, size); // Call the constructor of the parent class with
        // size for both width and height
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width); //changing the width of rectangle
        super.setHeight(width); //changing the height of rectangle
       }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }

  }
