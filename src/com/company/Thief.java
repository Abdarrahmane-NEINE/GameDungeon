package com.company;

public class Thief {
    private Arrow m_Arrow;
    private int m_iLifePoints;

    public Thief() {
        m_Arrow = new Arrow();
    }

    public void attack(Hero p_hero) {
        System.out.println(p_hero.getName() + " is being attacked by a thief");
        p_hero.loseLifePoints(m_Arrow.getDamagePoints());
    }

    public void receiveDamages(int p_DamagePoints) {
        System.out.println("Thief has lost " + p_DamagePoints + " life points");
        m_iLifePoints -= p_DamagePoints;
    }
}
