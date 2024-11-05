class Complex {
    double real;   // Real part of the complex number
    double image;  // Imaginary part of the complex number

    // Method to add another complex number to the current complex number
    public void add(Complex num) {
        this.real += num.real;
        this.image += num.image;
    }

    // Method to subtract another complex number from the current complex number
    public void subtract(Complex num) {
        this.real -= num.real;
        this.image -= num.image;
    }
}
