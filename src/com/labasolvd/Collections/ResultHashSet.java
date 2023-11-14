package com.labasolvd.Collections;

import com.labasolvd.Entity.Result.Result;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ResultHashSet {
        Set<Result> resultHashSet = new HashSet<>();

    public int size() {
        return resultHashSet.size();
    }
    public boolean isEmpty() {
        return resultHashSet.isEmpty();
    }
    public boolean contains(Object o) {
        return resultHashSet.contains(o);
    }
    public Iterator<Result> iterator() {
        return resultHashSet.iterator();
    }
    public boolean add(Result result) {
        return resultHashSet.add(result);
    }
    public boolean remove(Object o) {
        return resultHashSet.remove(o);
    }
    public boolean containsAll(Collection<?> c) {
        return resultHashSet.containsAll(c);
    }
    public boolean addAll(Collection<? extends Result> c) {
        return resultHashSet.addAll(c);
    }
    public boolean removeAll(Collection<?> c) {
        return resultHashSet.removeAll(c);
    }
    public void clear() {
        resultHashSet.clear();
    }
}
