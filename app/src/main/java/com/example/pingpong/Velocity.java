package com.example.pingpong;

public class Velocity {
    private int x_velocity, y_velocity;
    public Velocity(int x, int y) {
        this.x_velocity = x;
        this.y_velocity = y;
    }

    public int getX_velocity() {
        return x_velocity;
    }

    public void setX_velocity(int x_velocity) {
        this.x_velocity = x_velocity;
    }

    public int getY_velocity() {
        return y_velocity;
    }

    public void setY_velocity(int y_velocity) {
        this.y_velocity = y_velocity;
    }
}
