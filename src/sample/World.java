package sample;

import java.util.ArrayList;

public class World{
    private int sizeX;
    private int sizeY;
    private int maxPredatorAmount = 3;
    private int maxHerbivoreAmount = 3;
    private int currentPredatorsAmount;
    private int currentHerbivoreAmount;
    private int currentPlantAmount;
    private ArrayList<Predator> predatorsList;
    private ArrayList<Herbivore> herbivoresList;


    public void createPlants() {
    }

    public void placePlants() {
    }

    public void makePredatorMove() {
    }

    public void makeHerbivoreMove() {
    }

    public void checkPredatorWin() {
    }

    public void checkHerbivoreWin() {
    }

    public void updatePlants() {
    }

    public void endGame() {
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public int getMaxHerbivoreAmount() {
        return maxHerbivoreAmount;
    }

    public int getCurrentHerbivoreAmount() {
        return currentHerbivoreAmount;
    }

    public int getCurrentPlantAmount() {
        return currentPlantAmount;
    }

    public int getMaxPredatorAmount() {
        return maxPredatorAmount;
    }

    public int getCurrentPredatorsAmount() {
        return currentPredatorsAmount;
    }

    public ArrayList<Herbivore> getHerbivoresList() {
        return herbivoresList;
    }

    public ArrayList<Predator> getPredatorsList() {
        return predatorsList;
    }

    public void setCurrentHerbivoreAmount(int currentHerbivoreAmount) {
        this.currentHerbivoreAmount = currentHerbivoreAmount;
    }

    public void setCurrentPlantAmount(int currentPlantAmount) {
        this.currentPlantAmount = currentPlantAmount;
    }

    public void setCurrentPredatorsAmount(int currentPredatorsAmount) {
        this.currentPredatorsAmount = currentPredatorsAmount;
    }

    public void setHerbivoresList(ArrayList<Herbivore> herbivoresList) {
        this.herbivoresList = herbivoresList;
    }

    public void setMaxHerbivoreAmount(int maxHerbivoreAmount) {
        this.maxHerbivoreAmount = maxHerbivoreAmount;
    }

    public void setMaxPredatorAmount(int maxPredatorAmount) {
        this.maxPredatorAmount = maxPredatorAmount;
    }

    public void setPredatorsList(ArrayList<Predator> predatorsList) {
        this.predatorsList = predatorsList;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }
}

