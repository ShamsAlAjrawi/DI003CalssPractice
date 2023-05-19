package ClassModeling;
//Model a car as if the class were to be part of a video game
public class Car1 {
    private int health;
    private boolean isOn;
    private String nameOfPlayer;
    private String [] selectACar;
    private String [] selectTypeOfTrack;
    private boolean isGameOver;
    private boolean winner;
    private int numOfLives;

    public Car1 () {

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    public String[] getSelectACar() {
        return selectACar;
    }

    public void setSelectACar(String[] selectACar) {
        this.selectACar = selectACar;
    }

    public String[] getSelectTypeOfTrack() {
        return selectTypeOfTrack;
    }

    public void setSelectTypeOfTrack(String[] selectTypeOfTrack) {
        this.selectTypeOfTrack = selectTypeOfTrack;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public int getNumOfLives() {
        return numOfLives;
    }

    public void setNumOfLives(int numOfLives) {
        this.numOfLives = numOfLives;
    }
}
