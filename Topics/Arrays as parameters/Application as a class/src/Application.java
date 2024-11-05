import java.util.Arrays;

class Application {
    // The run method that takes an array of strings as an argument and prints them line by line
    void run(String[] args) {
        // Using a foreach loop to print each argument in the array
        for (String arg : args) {
           System.out.println(arg);
        }

        // Alternatively, using Streams to print each argument in the array
       // Arrays.stream(args).forEach(System.out::println);
    }
}

class Main { // Main class where the program starts
    public static void main(String[] args) {
        Application app = new Application();

        // Sample input arguments
        String[] arguments = { "arg1", "arg2", "arg3" };

        // Invoke the run method to print the arguments
        app.run(arguments);
    }
}
