package com.twscholl.practice;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {
    @Test
    public void should_return_vocation_00N_when_order_M_given_01N(){
        //Given
        String direction = "N";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.move(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(1));
        assertThat(coordinate.getDirection(), is("N"));
    }
    @Test
    public void should_return_vocation_00W_when_order_M_given_10W(){
        //Given
        String direction = "W";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.move(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(-1));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("W"));
    }
    @Test
    public void should_return_vocation_00E_when_order_M_given__10E(){
        //Given
        String direction = "E";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.move(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(1));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("E"));
    }
    @Test
    public void should_return_vocation_00S_when_order_M_given_0_1S(){
        //Given
        String direction = "S";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.move(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(-1));
        assertThat(coordinate.getDirection(), is("S"));
    }
    @Test
    public void should_return_vocation_00N_when_order_L_given_00W(){
        //Given
        String direction = "N";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.TurnLeft(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("W"));
    }
    @Test
    public void should_return_vocation_00E_when_order_L_given_00N(){
        //Given
        String direction = "E";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.TurnLeft(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("N"));
    }
    @Test
    public void should_return_vocation_00S_when_order_L_given_00E(){
        //Given
        String direction = "S";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.TurnLeft(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("E"));
    }
    @Test
    public void should_return_vocation_00N_when_order_R_given_00E(){
        //Given
        String direction = "N";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.TurnRight(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("E"));
    }
    @Test
    public void should_return_vocation_00E_when_order_R_given_00S(){
        //Given
        String direction = "E";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.TurnRight(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("S"));
    }
    @Test
    public void should_return_vocation_00S_when_order_R_given_00W(){
        //Given
        String direction = "S";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.TurnRight(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("W"));
    }
    @Test
    public void should_return_vocation_00W_when_order_R_given_00N(){
        //Given
        String direction = "W";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.TurnRight(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("N"));
    }
}
