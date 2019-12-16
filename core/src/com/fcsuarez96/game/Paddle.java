package com.fcsuarez96.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Paddle {

  int x;
  int y;
  int width;
  int height;
  int xSpeed;


  public Paddle(int x, int y, int width, int height, int xSpeed) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.xSpeed = xSpeed;
  }

  public void draw(ShapeRenderer shape) {
    shape.rect(x, y, width, height);
  }

  public void update() {

    if (Gdx.input.isKeyPressed(Keys.A)) {
      if (x > 0) {
        x += -xSpeed;
      }
    }
    if (Gdx.input.isKeyPressed(Keys.D)) {
      if (x + width < Gdx.graphics.getWidth()) {
        x += xSpeed;
      }

    }
  }



}
