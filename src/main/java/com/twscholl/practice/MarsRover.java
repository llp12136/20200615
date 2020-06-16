package com.twscholl.practice;

public class MarsRover {

    MarsRoverCoordinate marsRoverCoordinate = new MarsRoverCoordinate();

    public MarsRoverCoordinate move(MarsRoverCoordinate marsRoverCoordinate){
        int moveStep = 1;
        String currentDirection = marsRoverCoordinate.getDirection();
        switch (currentDirection){
            case "N":
                marsRoverCoordinate.setLocalY(marsRoverCoordinate.getLocalY()+moveStep);
                break;
            case "E":
                marsRoverCoordinate.setLocalX(marsRoverCoordinate.getLocalX()+moveStep);
                break;
            case "S":
                marsRoverCoordinate.setLocalY(marsRoverCoordinate.getLocalY()-moveStep);
                break;
            case "W":
                marsRoverCoordinate.setLocalX(marsRoverCoordinate.getLocalX()-moveStep);
                break;
        }
        return marsRoverCoordinate;
    }

}
