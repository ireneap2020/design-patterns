package com.alenasoft.behavioral.strategy;
//Esta táctica ofensiva consiste en pasar desde el propio campo del equipo atacante lanzando el balón en largo lanzando
//por encima de la cabeza de los defensores contrarios.
// Los delanteros deben correr en una zona donde puedan recibir el balón.
// La táctica funciona mejor con delanteros fuertes y rápidos que tienen buenas posibilidades de de tomar control
// del balón, superar a los defensas y, eventualmente, marcar.
public class LongBalls implements GameStrategy {

    @Override
    public void play(int numberOfPlayers) {
        System.out.printf("Lanzar el balón largo, cantidad de jugadores en el area rival  %d \n", numberOfPlayers);
    }
}

