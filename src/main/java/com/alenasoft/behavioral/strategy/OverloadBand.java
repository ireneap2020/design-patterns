package com.alenasoft.behavioral.strategy;

public class OverloadBand implements GameStrategy{
    @Override
    public void play(int numberOfPlayers) {
        System.out.printf("Sobrecargar en ataque al rival con %d \n", numberOfPlayers);
    }
}
