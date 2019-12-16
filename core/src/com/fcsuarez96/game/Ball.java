package com.fcsuarez96.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Ball {

  int x;
  int y;
  int size;
  int xSpeed;
  int ySpeed;
  Main main;

  public Ball(Main main,int x, int y, int size, int xSpeed, int ySpeed) {
    this.main = main;
    this.x = x;
    this.y = y;
    this.size = size;
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public void update() {

    x += xSpeed;
    y += ySpeed;
    collision();


  }

  public void draw(ShapeRenderer shape) {
    shape.circle(x, y, size);
  }

  public void collision() {
    if (x > Gdx.graphics.getWidth() - size || x < 0 + size) {
      xSpeed = -xSpeed;

    }

    if (y > Gdx.graphics.getHeight() - size || y < 0 + size) {
      ySpeed = -ySpeed;

    }

    if (y - size * 2 < main.paddle.y && x > main.paddle.x && x < main.paddle.x + main.paddle.width) {
      ySpeed = -ySpeed;
    }

  }
}
