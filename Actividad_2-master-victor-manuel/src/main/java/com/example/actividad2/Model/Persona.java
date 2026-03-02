package com.example.actividad2.Model;

public  abstract class Persona {
    protected String Id;
    protected  String name;
    protected  String gender;
    protected Integer age;
    protected String phone;

    public Persona(String Id,String name,String gender,Integer age, String phone){
        this.Id=Id;
        this.age=age;
        this.gender=gender;
        this.name=name;
        this.phone=phone;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void  setPhone(String phone) { this.phone=phone;}

    @Override
    public String toString() {
        return "name ="+name+" "+ "gender ="+gender+" "+ "age ="+age+" "+ " ID="+Id+" "+"phone="+phone+" ";
    }
}
