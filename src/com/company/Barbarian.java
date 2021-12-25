package com.company;

public class Barbarian {
    private Sword m_Sword;
    private int m_iNbLifePoints;


    Barbarian(){
        m_Sword = new Sword();
        m_iNbLifePoints = 10;
    }
    public void attack(Hero p_hero) {
        System.out.println(p_hero.getName() + " is being attacked by a barbarian");
        p_hero.loseLifePoints(m_Sword.getDamagePoints());
    }

    public void receiveDamages(int p_DamagePoints) {
        System.out.println("Barbarian has lost " + p_DamagePoints + "life points");
        m_iNbLifePoints -= p_DamagePoints;
    }
}
