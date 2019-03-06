package com.pipibing.handson.model;

/**
 * @ClassNameStudent
 * @Description TODO
 * @Author apple
 * @Date 2019/3/6 9:33 AM
 * @Version 1.0
 */
public class Student {

    private String id;
    private String name;
    private String sexy;
    private String address;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sexy='" + sexy + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexy() {
        return sexy;
    }

    public void setSexy(String sexy) {
        this.sexy = sexy;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
