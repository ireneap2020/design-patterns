package com.alenasoft.behavioral.strategy;

public class StrategyApp {

  public static void main(String[] args) {

    Team team = new Team();
    team.play(0);

    // Tenemos el balon
    team.setGameStrategy(new AttackStrategy());
    team.play(5);

      // Tenemos el balon
      team.setGameStrategy(new LongBalls());
      team.play(4);

      // Tenemos el balon
      team.setGameStrategy(new OverloadBand());
      team.play(6);

    // Sin balon
    team.setGameStrategy(new DefenseStrategy());
    team.play(8);

    // Medio Ataque
    team.setGameStrategy(new HalfAttackStrategy());
    team.play(1);

    //Tiro de estrategia
    team.setGameStrategy(new ShootingStrategy());
    team.play(2);

    team.setGameStrategy(
        new GameStrategy() {
          @Override
          public void play(int numberOfPlayers) {
            System.out.println("Simula faltas");
          }
        });
    team.play(0);
  }
}
