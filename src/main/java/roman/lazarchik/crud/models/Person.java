package roman.lazarchik.crud.models;

import javax.validation.constraints.*;

public class Person {
    private int id;
    @NotBlank(message = "Поле не должно быть пустым")
    @Size(min = 2, message = "Поле должно содержать минимум 2 символа")
    private String name;
    @Min(value = 1950, message = "Год рождения должен начинаться от 1950 года")
    private int age;


    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public Person() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
