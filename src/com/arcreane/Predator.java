package com.arcreane;

public class Predator {
    private static final int s_iMaxPredatorAge = 40;
    private int m_iAgeMax;
    private int m_iAge;

    private static final int s_iMaxPredatorLifePoint = 120;
    private int m_iLifePointMax;
    private int m_iLifePoint;

    private Vision m_Vision;
    private Smelling m_Smelling;
    private Coords m_Coords;


    void hunt(Prey p_Prey)  {
    }

    Coords move(){
        Coords coords = new Coords();
        //Code pour déterminer les nouvelles coordonnées
        //par exemple le but à atteindre
        return coords;
    }

    void mate(Predator p_Predator){
    }

    void eat(Prey p_Prey) {
    }

    void drink(WaterSpot p_WaterSpot){
    }

}
