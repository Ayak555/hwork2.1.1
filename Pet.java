import java.util.Random;

public class Pet {
    private int age;
    private ColorType colorType;
    private Shelter shelter;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ColorType getColorType() {
        return colorType;
    }

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        Random randomAge = new Random();
        int randomInt = randomAge.nextInt(20);
        return randomInt;
    }

    public String getInfo() {
        return "Shelter's name: " + this.shelter.getName() + " Address: " + this.shelter.getAddress() +
                " Age: " + this.generateDefaultAge() + " Color: " + this.getColorType();
    }


}
