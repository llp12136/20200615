
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

  public class FizzBuzzTest {
    @Test
    public void should_return_1_when_fizzbuzz_given_1(){
      //Give
      int number = 1;
      FizzBuzz fizzBuzz = new FizzBuzz();

      //When
      String word = fizzBuzz.fizzBuzzGame(number);

      //Then
      assertThat(word, is("1"));
    }

    @Test
    public void should_return_fizz_when_fizzbuzz_given_3(){
      //Give
      int number = 3;
      FizzBuzz fizzBuss = new FizzBuzz();

      //When
      String word = fizzBuss.fizzBuzzGame(number);

      //Then
      assertThat(word, is("fizz"));
    }

    @Test
    public void should_return_fizz_when_fizzbuzz_given_5(){
      //Give
      int number = 5;
      FizzBuzz fizzBuss = new FizzBuzz();

      //When
      String word = fizzBuss.fizzBuzzGame(number);

      //Then
      assertThat(word, is("buzz"));
    }
    @Test
    public void should_return_whizz_when_fizzbuzz_given_7(){
      //Give
      int number = 7;
      FizzBuzz fizzBuss = new FizzBuzz();

      //When
      String word = fizzBuss.fizzBuzzGame(number);

      //Then
      assertThat(word, is("whizz"));
    }

    @Test
    public void should_return_fizzbuss_when_fizzbuss_given_15(){
      //Give
      int number = 15;
      FizzBuzz fizzBuss = new FizzBuzz();

      //When
      String word = fizzBuss.fizzBuzzGame(number);

      //Then
      assertThat(word, is("fizzbuzz"));
    }

    @Test
    public void should_return_fizzwhizz_when_fizzbuss_given_21(){
      //Give
      int number = 21;
      FizzBuzz fizzBuss = new FizzBuzz();

      //When
      String word = fizzBuss.fizzBuzzGame(number);

      //Then
      assertThat(word, is("fizzwhizz"));
    }

    @Test
    public void should_return_fizz_when_fizzbuss_given_35(){
      //Give
      int number = 35;
      FizzBuzz fizzBuss = new FizzBuzz();

      //When
      String word = fizzBuss.fizzBuzzGame(number);

      //Then
      assertThat(word, is("fizz"));
    }

    @Test
    public void should_return_fizzbusswhizz_when_fizzbuss_given_105(){
      //Give
      int number = 105;
      FizzBuzz fizzBuss = new FizzBuzz();

      //When
      String word = fizzBuss.fizzBuzzGame(number);

      //Then
      assertThat(word, is("fizzbuzzwhizz"));
    }

    @Test
    public void should_return_fizz_when_fizzbuss_given_30(){
      //Give
      int number = 30;
      FizzBuzz fizzBuss = new FizzBuzz();

      //When
      String word = fizzBuss.fizzBuzzGame(number);

      //Then
      assertThat(word, is("fizz"));
    }
}
