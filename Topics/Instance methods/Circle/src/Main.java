class Circle {
    // Field to store the radius of the circle
    double radius; // Radius of the circle

    // Method to set the radius
    void setRadius(double radius) {
        this.radius = radius; // Use 'this' to refer to the instance variable
    }

    // Method to calculate and return the length of the circumference
    double getLength() {
        return 2 * Math.PI * this.radius; // Circumference formula: 2 * π * r
    }

    // Method to calculate and return the area of the circle
    double getArea() {
        return Math.PI * this.radius * this.radius; // Area formula: π * r^2
    }
}
