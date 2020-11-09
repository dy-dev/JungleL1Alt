package com.arcreane;

public class Ecosystem {
    private int m_iWidth;
    private int m_iHeight;

    private WaterSpot m_WaterSpot;

    /***
     * Constructeur de la classe
     * L'ecosystem est responsable de la création des éléments qu'il contient
     */
    public Ecosystem(){
        m_iHeight = 30;
        m_iWidth = 120;
        //On définit le water spot pour qu'il fasse une taille du quart du terrain
        //de l'ecosystème
        m_WaterSpot = new WaterSpot(500,
                m_iWidth/4,
                m_iHeight/4);
    }

}
