package com.company;

import java.util.List;

public class Room {

    Barbarian m_Barbarien;
    Sorcerer m_Sorcerer;
    Thief m_Thief;
//    Dragon m_Dragon;

    int m_iIndex;

    Room(int p_iIndex){
        m_iIndex = p_iIndex;
        switch (m_iIndex%3){
            case 0 :
                m_Barbarien = new Barbarian();
                break;
            case 1 :
                m_Thief = new Thief();
                break;
            case 2:
                m_Sorcerer = new Sorcerer();
                break;

        }
    }

    public void monsterAttaque(Hero p_Hero) {
        switch (m_iIndex%3){
            case 0 :
                m_Barbarien.attack(p_Hero);
                break;
            case 1 :
                m_Thief.attack(p_Hero);
                break;
            case 2:
                m_Sorcerer.attack(p_Hero);
                break;
        }
    }

    public Barbarian getBarbarian() {
        return m_Barbarien;
    }

    public Thief getThief() {
        return m_Thief;
    }

    public Sorcerer getSorcerer() {
        return m_Sorcerer;
    }
}
