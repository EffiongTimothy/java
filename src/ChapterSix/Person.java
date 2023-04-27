package ChapterSix;

public class Person {
    private String name ;
    private int age;
    private Gender gender;

    public Person(String name, Gender gender,int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
}
public Gender getGender(){
    return gender;}
}