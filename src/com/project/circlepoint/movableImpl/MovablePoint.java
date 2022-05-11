package com.project.circlepoint.movableImpl;

import com.project.circlepoint.Movable;
import com.project.circlepoint.exceptions.ExceedingPlainException;
import com.project.circlepoint.exceptions.InvalidValuesException;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) throws InvalidValuesException {
        if (x > PLAIN_X_MAX || x < PLAIN_X_MIN || y > PLAIN_Y_MAX || y < PLAIN_Y_MIN) {
            throw new InvalidValuesException("Couldn't create object. X or Y has invalid values, available values: "
                    + PLAIN_X_MIN + " to " + PLAIN_X_MAX);
        }
        if (xSpeed < MIN_SPEED || ySpeed < MIN_SPEED) {
            throw new InvalidValuesException("Couldn't create object. xSpeed or ySpeed must be positive");
        }
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() throws ExceedingPlainException {
        if (this.y > PLAIN_Y_MAX) {
            throw new ExceedingPlainException("y = " + this.y + ", y shouldn't be greater than 1000 or less than -1000.");
        }
        this.y += this.ySpeed;
    }

    @Override
    public void moveDown() throws ExceedingPlainException {
        if (this.y < PLAIN_Y_MIN) {
            throw new ExceedingPlainException("y = " + this.y + ", y shouldn't be greater than 1000 or less than -1000.");
        }
        this.y -= this.ySpeed;
    }

    @Override
    public void moveLeft() throws ExceedingPlainException {
        if (this.x < PLAIN_X_MIN) {
            throw new ExceedingPlainException("x = " + this.x + ", x shouldn't be greater than 1000 or less than -1000.");
        }
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight() throws ExceedingPlainException {
        if (this.x > PLAIN_X_MAX) {
            throw new ExceedingPlainException("x = " + this.x + ", x shouldn't be greater than 1000 or less than -1000.");
        }
        this.x += this.xSpeed;
    }

    @Override
    public void moveUp(int howMuch) throws ExceedingPlainException {
        if (howMuch < 1) {
            throw new IllegalArgumentException("Invalid argument " + howMuch
                    + ", argument must be positive.");
        }
        this.y += howMuch;
        if (this.y > PLAIN_Y_MAX) {
            throw new ExceedingPlainException("y = " + this.y + ", y shouldn't be greater than 1000 or less than -1000.");
        }
    }

    @Override
    public void moveDown(int howMuch) throws ExceedingPlainException {
        if (howMuch < 1) {
            throw new IllegalArgumentException("Invalid argument " + howMuch
                    + ", argument must be positive.");
        }
        this.y -= howMuch;
        if (this.y < PLAIN_Y_MIN) {
            throw new ExceedingPlainException("y = " + this.y + ", y shouldn't be greater than 1000 or less than -1000.");
        }
    }

    @Override
    public void moveLeft(int howMuch) throws ExceedingPlainException {
        if (howMuch < 1) {
            throw new IllegalArgumentException("Invalid argument " + howMuch
                    + ", argument must be positive.");
        }
        this.x -= howMuch;
        if (this.x < PLAIN_X_MIN) {
            throw new ExceedingPlainException("x = " + this.x + ", x shouldn't be greater than 1000 or less than -1000.");
        }
    }

    @Override
    public void moveRight(int howMuch) throws ExceedingPlainException {
        if (howMuch < 1) {
            throw new IllegalArgumentException("Invalid argument " + howMuch
                    + ", argument must be positive.");
        }
        this.x += howMuch;
        if (this.x > PLAIN_X_MAX) {
            throw new ExceedingPlainException("x = " + this.x + ", x shouldn't be greater than 1000 or less than -1000.");
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws InvalidValuesException {
        if (x < PLAIN_X_MIN || x > PLAIN_X_MAX) {
            throw new InvalidValuesException("X should have values between "
                    + PLAIN_X_MIN + " and " + PLAIN_X_MAX);
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws InvalidValuesException {
        if (y < PLAIN_Y_MIN || y > PLAIN_Y_MAX) {
            throw new InvalidValuesException("Y should have values between "
                    + PLAIN_Y_MIN + " and " + PLAIN_Y_MAX);
        }
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) throws InvalidValuesException {
        if (xSpeed < MIN_SPEED) {
            throw new InvalidValuesException("xSpeed should be positive.");
        }
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) throws InvalidValuesException {
        if (ySpeed < MIN_SPEED) {
            throw new InvalidValuesException("ySpeed should be positive.");
        }
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
