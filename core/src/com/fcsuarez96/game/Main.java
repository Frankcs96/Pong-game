package com.fcsuarez96.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class Main extends ApplicationAdapter {

  ShapeRenderer shape;
  Ball ball;
  Paddle paddle;


  @Override
  public void create() {
    shape = new ShapeRenderer();
    ball = new Ball(this,Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, 10, 3, 3);
    paddle = new Paddle(300,60,80,15,4);
  }

  @Override
  public void render() {
    Gdx.gl.glClearColor(0, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    ball.update();
    paddle.update();
    shape.begin(ShapeType.Filled);
    ball.draw(shape);
    paddle.draw(shape);
    shape.end();


  }

  @Override
  public void dispose() {

  }
}
