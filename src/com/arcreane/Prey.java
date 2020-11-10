package com.arcreane;

public class Prey {
    private static final int s_iDrinkingQuantity = 3;


    private static int s_iMaxPreyAge = 30;
    private int m_iAgeMax;
    private int m_iAge;

    private static int s_iMaxPreyLifePoint = 70;
    private int m_iLifePointMax;
    private int m_iLifePoint;

    private Vision m_Vision;
    private Hearing m_Hearing;
    private Coords m_Coords;

    void moveToFeed(Plant p_Plant) {

    }

    void eat(Plant p_Plant) {

    }

    void drink(WaterSpot p_WaterSpot) {
        int waterAvailable = p_WaterSpot.getWaterForDrink(s_iDrinkingQuantity);
    }

    void flee(Predator p_Predator) {

    }

    void mate(Prey p_Prey) {

    }

    public void update() {
        drink(Ecosystem.getInstance().getWaterSpot());
    }
}
