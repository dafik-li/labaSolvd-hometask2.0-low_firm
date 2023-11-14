package com.labasolvd.Collections;

import com.labasolvd.Entity.Persons.SuspectedPerson;
import java.util.*;
import java.util.function.UnaryOperator;

public class SuspectedArrayList {
    List<SuspectedPerson> suspectedPersonArrayList = new ArrayList<>();

    public int size() {
        return suspectedPersonArrayList.size();
    }
    public boolean isEmpty() {
        return suspectedPersonArrayList.isEmpty();
    }
    public boolean contains(Object o) {
        return suspectedPersonArrayList.contains(o);
    }
    public Iterator<SuspectedPerson> iterator() {
        return suspectedPersonArrayList.iterator();
    }
    public Object[] toArray() {
        return suspectedPersonArrayList.toArray();
    }
    public boolean remove(Object o) {
        return suspectedPersonArrayList.remove(o);
    }
    public void replaceAll(UnaryOperator<SuspectedPerson> operator) {
        suspectedPersonArrayList.replaceAll(operator);
    }
    public void clear() {
        suspectedPersonArrayList.clear();
    }
    public SuspectedPerson get(int index) {
        return suspectedPersonArrayList.get(index);
    }
    public SuspectedPerson set(int index, SuspectedPerson element) {
        return suspectedPersonArrayList.set(index, element);
    }
    public void add(int index, SuspectedPerson element) {
        suspectedPersonArrayList.add(index, element);
    }
    public SuspectedPerson remove(int index) {
        return suspectedPersonArrayList.remove(index);
    }
    public int indexOf(Object o) {
        return suspectedPersonArrayList.indexOf(o);
    }
    public int lastIndexOf(Object o) {
        return suspectedPersonArrayList.lastIndexOf(o);
    }
}
