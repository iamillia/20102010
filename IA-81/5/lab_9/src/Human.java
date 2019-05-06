public class Human {
    String name;
    String surname;
    Integer age;
    Integer phoneNumber;

    public Human(String name, String surname, Integer age, Integer phoneNumber) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public Integer getPhoneNumber() {
        return phoneNumber;
    }


}

