package com.example.lab_02_04;

public class MicroObject {
    private String name;
    private int health;
    private int damage;
    private String description;

    public MicroObject(String name, int health, int damage, String description) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.description = description;
        System.out.println("Створено новий мікрооб'єкт: " + name);
    }

    public MicroObject() {
        this("Мікрооб'єкт", 100, 10, "Опис");
        System.out.println("Створено новий мікрооб'єкт: " + name);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MicroObject)) return false;
        MicroObject that = (MicroObject) o;
        return health == that.health &&
                damage == that.damage &&
                name.equals(that.name) &&
                description.equals(that.description);
    }

    public String toString() {
        return "Мікрооб'єкт '" + name + "' (" + description + "): " +
                "здоров'я = " + health + ", " +
                "пошкодження = " + damage;
    }

    public void move() {
        System.out.println("Мікрооб'єкт '" + name + "' перемістився.");
    }

    public void attack() {
        System.out.println("Мікрооб'єкт '" + name + "' завдав пошкоджень.");
    }

    public void takeDamage(int amount) {
        health -= amount;
        System.out.println("Мікрооб'єкт '" + name + "' втратив " + amount + " здоров'я.");
    }

    // Геттери і сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}