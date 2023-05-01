package com.example.starter;

import io.vertx.core.Vertx;

public class Main {

	public static void main(String[] args) {
		
		// Create an instance of the Vertx class
        Vertx vertx = Vertx.vertx();

        // Create an instance of the MainVerticle class and deploy it as a verticle
        MainVerticle verticle = new MainVerticle();
        vertx.deployVerticle(verticle);
	}

}
