package sample;

public class Animal extends Nature {
    private int id;
    private int size;
    private int speed;
    private char sex;
    private int age;

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
