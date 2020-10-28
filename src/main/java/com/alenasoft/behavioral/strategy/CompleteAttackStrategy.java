package com.alenasoft.behavioral.strategy;

public class CompleteAttackStrategy implements GameStrategy {

  @Override
  public void play(int numberOfPlayers) {
    System.out.printf("Medio ataque con %d jugadores\n", numberOfPlayers);
  }
}
