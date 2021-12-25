package com.company;

public class Sorcerer {
    private Lightning m_lightning;
    private int m_iDamagePoints;

    public Sorcerer() {
        m_lightning = new Lightning();
    }

    public void attack(Hero p_hero) {
        System.out.println(p_hero.getName() + " is being attacked by a Sorcerer");
        p_hero.loseLifePoints(m_lightning.getDamagePoints());
    }

    public void receiveDamages(int p_iDamagePoints) {
        System.out.println("Sorcerer has lost "+ p_iDamagePoints + " life points");
        m_iDamagePoints -= p_iDamagePoints;
    }
}
