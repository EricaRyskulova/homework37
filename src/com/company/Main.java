package com.company;

import sun.plugin.dom.DOMObject;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Dalmatian> dog = new HashSet<>();
        Dalmatian[] dalmatians = new Dalmatian[40];
        for (int i = 1; i <= 40; i++) {
            if (i <= 40) ;

            Dalmatian d20 = new Dalmatian("Noon", 3);
            Dalmatian d27 = new Dalmatian("Moree", 2);
            Dalmatian d32 = new Dalmatian("Bubbles", 7);
            Dalmatian d36 = new Dalmatian("Bubbles", 7);
            dog.add(d20);
            dog.add(d27);
            dog.add(d32);
            dog.add(d36);
            for (Dalmatian d : dog) {
                System.out.println(d);
//                if (d.getName().equals("Noon") && d.weight == 3) {
//                    System.out.println("+++" + d.getName());
//                }
            }
        }
    }
}
//            System.out.println(dog.contains(d20));
//            System.out.println(dog.contains(d27));
//            System.out.println(dog.contains(d32));
//            System.out.println(dog.contains(d36));
//
//        System.out.println(dalmatians);
//        int counter =0;
//        for(Dalmatian d: dalmatians){
//                    if(d instanceof Dalmatian){
//                    counter+=1;
//                    if(counter==5){
//                    dalmatians.remove(d);
//                    counter=0;
//                    }
//                    }
//                    }


abstract class Dog{
protected String name;
protected Integer weight;

    public Dog(String name, Integer weight) {
        setName(name);
        setWeight(weight);
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}


class Dalmatian extends Dog {
    String name;
    Integer weight;
    public Dalmatian(String name, Integer weight) {
        super(name, weight);
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Dalmatian dalmatian = (Dalmatian) obj;
        return Double.compare(dalmatian.weight, weight) == 0 &&
                name.equals(dalmatian.name);
//        if (obj == this) return true;
//        if(obj instanceof Dalmatian){
//            return ((Dalmatian)obj).name.equals(name) && ((Dalmatian)obj).weight == weight;

//        return false;
//        if (o == null || getClass() != o.getClass()) return false;
//        Dalmatian dalmatian = (Dalmatian) o;
//        return Double.compare(dalmatian.weight, weight) == 0 &&
//                name.equals(dalmatian.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return "Dalmatian{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}