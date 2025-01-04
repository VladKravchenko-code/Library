package ru.vlad.springcourse.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
    private int id;

    @NotEmpty(message = "Колонка имя не должна быть пустой")
    @Size(min = 2, max = 30, message = "Имя должно содержать от 2 до 30 символов")
    private String name;

    @Min(value = 1900, message = "Год рождения должен быть больше 1900")
    @Max(value = 2025, message = "Неверный год рождения")
    private int age;

    public Person() {

    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
