package com.labasolvd.collections;

import com.labasolvd.controller.Creator;
import com.labasolvd.entity.persons.SuspectedPerson;
import java.util.HashSet;

public class SuspectedHashSet {
    private Creator creator;

    public SuspectedHashSet() {
        this.creator = new Creator();
    }

    public HashSet<SuspectedPerson> createSuspectedPerson() {
        HashSet<SuspectedPerson> suspectedPersonHashSet = new HashSet<>();
        suspectedPersonHashSet.add(creator.createSuspectedPerson('f', "penelope", "cruz", 50, true));
        suspectedPersonHashSet.add(creator.createSuspectedPerson('m', "matthew", "mcconaughey", 55, false));
        suspectedPersonHashSet.add(creator.createSuspectedPerson('m', "jeremy", "clarkson", 65, true));
        return suspectedPersonHashSet;
    }
    public SuspectedPerson findSuspected (boolean level) throws Exception {
        HashSet<SuspectedPerson> suspectedList = createSuspectedPerson();
        for (SuspectedPerson suspected : suspectedList) {
            if (suspected.isWasArrestedBefore() == level) {
                return suspected;
            }
        }
        throw new Exception("Cannot find suspected");
    }
}
