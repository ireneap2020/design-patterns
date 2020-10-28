package com.alenasoft.behavioral.strategy;

public class ShootingStrategy implements GameStrategy {
    @Override
    public void play(int numberOfPlayers) {
        System.out.printf("Shooting con %d jugadores\n", numberOfPlayers);
    }
}
