public class FizzBuzz {
    public String fizzBuzzGame(int number) {

        String string = "";

        if (number % 3 == 0) {
            string += "fizz";
        }
        if (number % 5 == 0) {
            string += "buzz";
        }
        if (number % 7 == 0) {
            string += "whizz";
        }
        if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
            string = Integer.toString(number);
        }

        if (String.valueOf(number).contains("3")) {
            string = "fizz";
        }

        return string;
    }
}
