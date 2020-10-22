package com.alenasoft.behavioral.iterator;

import java.util.Arrays;
import java.util.Map;

public class CREUserIterator implements Iterator{

    private int position;
    private final Map<Integer, CREUser> creUsers;
    private final int[] creUserIds;

    public CREUserIterator() {
        this.position = 0;
        this.creUsers = CREApi.getCREUsers();
        // Get the user ids from map.
        this.creUserIds = Arrays.stream(this.creUsers.keySet().toArray()).mapToInt(o -> (Integer)o).toArray();;
    }

    @Override
    public boolean isDone() {
        return this.position >= this.creUserIds.length;
    }

    @Override
    public String currentItem() {
        return this.creUsers.get(creUserIds[this.position++]).toString();
    }
}
