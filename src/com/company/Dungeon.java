package com.company;

public class Dungeon {

    Room m_Room1;
    Room m_Room2;
    Room m_Room3;
    Room m_Room4;
    Room m_Room5;
    DragonLair m_Lair;

    Dungeon(){
        m_Room1 = new Room(0);
        m_Room2 = new Room(1);
        m_Room3 = new Room(2);
    }

    public void admit(Hero p_Herro) {
        System.out.println(p_Herro.getName() + " has penetrated " +
                "in the dungeon and is " +
                "about to enter the first room");

        p_Herro.enter(m_Room1);
        System.out.println("That goes on until barbarian" +
                " dies and heros enter room number 2");

        p_Herro.enter(m_Room2);

        System.out.println("That goes on until thief" +
                " dies and heros enter room number 3");

        p_Herro.enter(m_Room3);
    }

}
