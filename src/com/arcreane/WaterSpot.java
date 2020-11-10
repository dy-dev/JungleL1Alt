package com.arcreane;

public class WaterSpot {
    private int m_iWaterQuantity;
    private int m_iWidth;
    private int m_iHeight;
    private Coords m_Coords;

    public WaterSpot(int p_iWaterQuantity, int p_iWidth, int p_iHeight) {
        m_iWaterQuantity = p_iWaterQuantity;
        m_iWidth = p_iWidth;
        m_iHeight = p_iHeight;
        m_Coords = new Coords(0, 0);
    }

    public void update() {
        System.out.println("Water quantity left : " + m_iWaterQuantity);
    }

    public int getWaterForDrink(int p_WaterQuantityRequested) {
        //Quantité d'eau disponible pour l'animal
        int waterAvailable = m_iWaterQuantity;
        //Il reste plus d'eau que demander, on peut donc renvoyer à l'animal la quantité qu'il désire
        if (m_iWaterQuantity > p_WaterQuantityRequested) {
            m_iWaterQuantity -= p_WaterQuantityRequested; // <=>  m_iWaterQuantity = m_iWaterQuantity - p_WaterQuantityRequested;
            waterAvailable = p_WaterQuantityRequested;
        }
        //Il reste encore de l'eau mais moins que ce l'animal désire. On renvoie la quantité qu'il reste et on met
        //a 0 la quantité d'eau du WaterSpot
        else if (m_iWaterQuantity > 0) {
            m_iWaterQuantity = 0;
        }
        return waterAvailable;
    }
}
