package com.labasolvd.collections;

import com.labasolvd.controller.Creator;
import com.labasolvd.controller.Generator;
import com.labasolvd.entity.persons.SolicitorPerson;
import java.util.*;

public class SolicitorArrayList {
    private Creator creator;
    private Generator generator;

    public void createSolicitorPerson(SolicitorPerson solicitorPerson) {
        List<SolicitorPerson> solicitorPersonList = new ArrayList<>();
        solicitorPersonList.add(creator.setSolicitorPerson('m', "marlon", "brando", 50, generator.getSolicitorLevel()));
        solicitorPersonList.add(creator.setSolicitorPerson('m', "al", "pacino", 40, generator.getSolicitorLevel()));
        for (SolicitorPerson name : solicitorPersonList) {
            System.out.println(name);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SolicitorArrayList)) return false;
        SolicitorArrayList that = (SolicitorArrayList) o;
        return creator.equals(that.creator) &&
                generator.equals(that.generator);
    }
    @Override
    public int hashCode() {
        return Objects.hash(creator, generator);
    }
    @Override
    public String toString() {
        return "SolicitorArrayList{" +
                "creator=" + creator +
                ", generator=" + generator +
                '}';
    }
}
