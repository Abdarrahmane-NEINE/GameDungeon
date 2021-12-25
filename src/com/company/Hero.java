package com.company;

public class Hero {
    private String m_sName;
    private int m_iNbLifePoints;
    private Sword m_Sword;

    Hero(String p_sName, int p_iNbLifePoints) {
        m_sName = p_sName;
        m_iNbLifePoints = p_iNbLifePoints;
        m_Sword = new Sword();
    }

    public String getName() {
        return m_sName;
    }


    public void setName(String m_sName) {
        this.m_sName = m_sName;
    }

    public int getNbLifePoints() {
        return m_iNbLifePoints;
    }

    public void setNbLifePoints(int m_iNbLifePoints) {
        this.m_iNbLifePoints = m_iNbLifePoints;
    }

//    public void getM_iNbLifePoints() {
//    }

    public void enter(Room p_room) {
//        hero
        p_room.monsterAttaque(this);
        if(p_room.getBarbarian() != null)
            this.attaqueBarbarian(p_room.getBarbarian());
        else if (p_room.getThief() != null)
            this.attaqueThief(p_room.getThief());
        else if (p_room.getSorcerer() != null)
            this.attaqueSorcier(p_room.getSorcerer());
    }


    private void attaqueBarbarian(Barbarian p_Barbarian) {
        p_Barbarian.receiveDamages(m_Sword.getDamagePoints());
    }

    private void attaqueThief(Thief thief) {
        thief.receiveDamages(m_Sword.getDamagePoints());
    }

    private void attaqueSorcier(Sorcerer p_Sorcerer) {
        p_Sorcerer.receiveDamages(m_Sword.getDamagePoints());
    }


    public void loseLifePoints(int p_iDamagePoints) {
        System.out.println(m_sName + " has lost " + p_iDamagePoints);
        m_iNbLifePoints -= p_iDamagePoints;
        System.out.println(m_iNbLifePoints);
    }
}
