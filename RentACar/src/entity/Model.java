package entity;

import core.ComboItem;

public class Model {
    private int id;
    private int brand_id;
    private String name;
    private Type Type;
    private String year;
    private Fuel Fuel;
    private Gear gear;
    private Brand brand;

    public enum Fuel {
        GASOLINE,
        LPG,
        ELECTRIC,
        DIESEL
    }

    public enum Gear {
        MANUEL,
        AUTO
    }

    public enum Type {
        SEDAN,
        HACBACK
    }

    public Model() {
    }

    public Model(int id, int brand_id, String name, Model.Type type, String year, Model.Fuel fuel, Gear gear, Brand brand) {
        this.id = id;
        this.brand_id = brand_id;
        this.name = name;
        Type = type;
        this.year = year;
        Fuel = fuel;
        this.gear = gear;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model.Type getType() {
        return Type;
    }

    public void setType(Model.Type type) {
        Type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Model.Fuel getFuel() {
        return Fuel;
    }

    public void setFuel(Model.Fuel fuel) {
        Fuel = fuel;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public ComboItem getComboItem () {
        return new ComboItem(this.getId(),this.getBrand().getName() + "-" + this.getName() + "-" + this.getYear() + "-" + this.getGear());
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", brand_id=" + brand_id +
                ", name='" + name + '\'' +
                ", Type=" + Type +
                ", year='" + year + '\'' +
                ", Fuel=" + Fuel +
                ", gear=" + gear +
                ", brand=" + brand +
                '}';
    }
}
