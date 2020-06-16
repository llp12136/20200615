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
    public void should_return_vocation_00N_when_order_L_given_00W(){
        //Give


        //When

        //Then
    }
    @Test
    public void should_return_vocation_00N_when_order_R_given_00S(){
        //Give

        //When

        //Then
    }
}
