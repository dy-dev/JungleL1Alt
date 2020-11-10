package com.arcreane;

public class Ecosystem {
    private static final int MAX_ARRAY_ELEMENTS = 100;

    private static Ecosystem s_EcosystemInstance = null;

    private int m_iWidth;
    private int m_iHeight;

    private WaterSpot m_WaterSpot;
    private Predator[] m_PredatorArray;
    private Prey[] m_PreyArray;
    private Plant[] m_PlantArray;

    static public Ecosystem getInstance() {
        if (s_EcosystemInstance == null) {
            s_EcosystemInstance = new Ecosystem();
        }
        return s_EcosystemInstance;
    }

    /***
     * Constructeur de la classe
     * L'ecosystem est responsable de la création des éléments qu'il contient
     */
    private Ecosystem() {
        m_iHeight = 30;
        m_iWidth = 120;
        //On définit le water spot pour qu'il fasse une taille du quart du terrain
        //de l'ecosystème
        m_WaterSpot = new WaterSpot(2500,
                m_iWidth / 4,
                m_iHeight / 4);

        m_PredatorArray = new Predator[MAX_ARRAY_ELEMENTS];
        m_PreyArray = new Prey[MAX_ARRAY_ELEMENTS];
        m_PlantArray = new Plant[MAX_ARRAY_ELEMENTS];

        for (int i = 0; i < MAX_ARRAY_ELEMENTS; i++) {
            m_PredatorArray[i] = new Predator();
            m_PreyArray[i] = new Prey();
            m_PlantArray[i] = new Plant();
        }
    }


    //Game loop qui va permettre à chaque élément des tableaux et la variable m_WaterSpot
    // de se mettre à jour
    public void startLifeCycle() {
        //Il faudra définir les conditions d'arrets
        //Ca pourrait être,
        //  * Il n'y a plus d'eau => tous les animaux vont mourrir
        //  * Il n'y a plus de prédateurs => les proies vont se multiplier et bouffer toutes les plantes
        //  * Il n'y a plus de proies => les prédateurs vont mourrir de fin
        //....
        while (true) {

            //On commence par mettre à jour le plan d'eau
            m_WaterSpot.update();

            //On met à jour tous les prédateurs
            for (Predator pred : m_PredatorArray) {
                pred.update();
            }

            //On met à jour toutes les proies
            for (Prey prey : m_PreyArray) {
                prey.update();
            }

            //On met à jour toutes les plantes
            for (Plant plant : m_PlantArray) {
                plant.update();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public WaterSpot getWaterSpot() {
        return m_WaterSpot;
    }
}
