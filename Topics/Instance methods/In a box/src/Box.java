class Box {
    // Fields to store the dimensions of the box
    double length;  // Length of the box
    double width;   // Width of the box
    double height;  // Height of the box

    // Default constructor
    Box() {
        this.length = 1.0; // Default length
        this.width = 1.0;  // Default width
        this.height = 1.0; // Default height
    }

    // Constructor to initialize the dimensions of the box
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate and return the volume of the box
    double getVolume() {
        return length * width * height; // Volume formula: length * width * height
    }
}
