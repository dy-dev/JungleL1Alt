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
        m_Coords = new Coords(0,0);
    }
}
