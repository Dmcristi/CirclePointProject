package com.project.circlepoint.movableImpl;

import com.project.circlepoint.Movable;
import com.project.circlepoint.exceptions.ExceedingPlainException;
import com.project.circlepoint.exceptions.InvalidValuesException;
import com.project.circlepoint.exceptions.NotInPlainException;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public static final int MIN_RADIUS = 1;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) throws InvalidValuesException, NotInPlainException {
        if (x > PLAIN_X_MAX || x < PLAIN_X_MIN || y > PLAIN_Y_MAX || y < PLAIN_Y_MIN) {
            throw new InvalidValuesException("Couldn't create object. X or Y has invalid values, available values: "
                    + PLAIN_X_MIN + " to " + PLAIN_X_MAX);
        }
        if (xSpeed < MIN_SPEED || ySpeed < MIN_SPEED) {
            throw new InvalidValuesException("Couldn't create object. xSpeed or ySpeed must be positive");
        }
        if (radius < MIN_RADIUS) {
            throw new InvalidValuesException("Couldn't create object. Radius should be at least "
                    + MIN_RADIUS + ".");
        }

        if (y + radius > PLAIN_Y_MAX) {
            throw new NotInPlainException("y = " + y + ", radius = " + radius
                    + ", y + radius shouldn't be greater than 1000.");
        }
        if (y - radius < PLAIN_Y_MIN) {
            throw new NotInPlainException("y = " + y + ", radius = " + radius
                    + ", y - radius shouldn't be less than -1000.");
        }
        if (x - radius < PLAIN_X_MIN) {
            throw new NotInPlainException("x = " + x + ", radius = " + radius
                    + ", x - radius shouldn't be less than -1000.");
        }
        if (x + radius > PLAIN_X_MAX) {
            throw new NotInPlainException("x = " + x + ", radius = " + radius
                    + ", x + radius shouldn't be greater than 1000.");
        }

        this.radius = radius;
        try {
            this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        } catch (InvalidValuesException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void moveUp() throws ExceedingPlainException {
        if (center.getY() + this.radius > PLAIN_Y_MAX) {
            throw new ExceedingPlainException("y = " + center.getY() + ", radius = " + this.radius
                    + ", y + radius shouldn't be greater than 1000 or less than -1000.");
        }
        try {
            center.setY(center.getY() + center.getySpeed());
        } catch (InvalidValuesException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void moveDown() throws ExceedingPlainException {
        if (center.getY() + this.radius < PLAIN_Y_MIN) {
            throw new ExceedingPlainException("y = " + center.getY() + ", radius = " + this.radius
                    + ", y + radius shouldn't be greater than 1000 or less than -1000.");
        }
        try {
            center.setY(center.getY() - center.getySpeed());
        } catch (InvalidValuesException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void moveLeft() throws ExceedingPlainException {
        if (center.getX() + this.radius < PLAIN_X_MIN) {
            throw new ExceedingPlainException("x = " + center.getX() + ", radius = " + this.radius
                    + ", x + radius shouldn't be greater than 1000 or less than -1000.");
        }
        try {
            center.setX(center.getX() - center.getxSpeed());
        } catch (InvalidValuesException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void moveRight() throws ExceedingPlainException {
        if (center.getX() + this.radius > PLAIN_X_MAX) {
            throw new ExceedingPlainException("x = " + center.getX() + ", radius = " + this.radius
                    + ", x + radius shouldn't be greater than 1000 or less than -1000.");
        }
        try {
            center.setX(center.getX() + center.getxSpeed());
        } catch (InvalidValuesException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void moveUp(int howMuch) throws ExceedingPlainException {
        if (howMuch < 1) {
            throw new IllegalArgumentException("Invalid argument " + howMuch
                    + ", argument must be positive.");
        }
        if (center.getY() + howMuch + this.radius > PLAIN_Y_MAX) {
            throw new ExceedingPlainException("y = " + (center.getY() + howMuch) + ", radius = " + this.radius
                    + ", y + radius shouldn't be greater than 1000 or less than -1000.");
        }
        try {
            center.setY(center.getY() + howMuch);
        } catch (InvalidValuesException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void moveDown(int howMuch) throws ExceedingPlainException {
        if (howMuch < 1 || howMuch > PLAIN_Y_MAX) {
            throw new IllegalArgumentException("Invalid argument " + howMuch
                    + ", argument must be positive.");
        }
        if (center.getY() - howMuch - this.radius < PLAIN_Y_MIN) {
            throw new ExceedingPlainException("y = " + (center.getY() - howMuch) + ", radius = " + this.radius
                    + ", y - radius shouldn't be greater than 1000 or less than -1000.");
        }
        try {
            center.setY(center.getY() - howMuch);
        } catch (InvalidValuesException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void moveLeft(int howMuch) throws ExceedingPlainException {
        if (howMuch < 1) {
            throw new IllegalArgumentException("Invalid argument " + howMuch
                    + ", argument must be positive.");
        }
        if (center.getX() - howMuch - this.radius < PLAIN_X_MIN) {
            throw new ExceedingPlainException("x = " + (center.getX() - howMuch) + ", radius = " + this.radius
                    + ", x - radius shouldn't be greater than 1000 or less than -1000.");
        }
        try {
            center.setX(center.getX() - howMuch);
        } catch (InvalidValuesException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void moveRight(int howMuch) throws ExceedingPlainException {
        if (howMuch < 1) {
            throw new IllegalArgumentException("Invalid argument " + howMuch
                    + ", argument must be positive.");
        }
        if (center.getX() + howMuch + this.radius > PLAIN_X_MAX) {
            throw new ExceedingPlainException("x = " + (center.getX() + howMuch) + ", radius = " + this.radius
                    + ", x + radius shouldn't be greater than 1000 or less than -1000.");
        }
        try {
            center.setX(center.getX() + howMuch);
        } catch (InvalidValuesException e) {
            e.printStackTrace();
        }
    }

    public void setRadius(int radius) throws InvalidValuesException, ExceedingPlainException {
        if (radius < MIN_RADIUS) {
            throw new InvalidValuesException("Invalid radius, radius should be at least "
                    + MIN_RADIUS + ".");
        }

        if (center.getY() + radius > PLAIN_Y_MAX) {
            throw new ExceedingPlainException("y = " + center.getY() + ", radius = " + radius
                    + ", y + radius shouldn't be greater than 1000.");
        }
        if (center.getY() - radius < PLAIN_Y_MIN) {
            throw new ExceedingPlainException("y = " + center.getY() + ", radius = " + radius
                    + ", y - radius shouldn't be less than -1000.");
        }
        if (center.getX() - radius < PLAIN_X_MIN) {
            throw new ExceedingPlainException("x = " + center.getX() + ", radius = " + radius
                    + ", x - radius shouldn't be less than -1000.");
        }
        if (center.getX() + radius > PLAIN_X_MAX) {
            throw new ExceedingPlainException("x = " + center.getX() + ", radius = " + radius
                    + ", x + radius shouldn't be greater than 1000.");
        }

        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
