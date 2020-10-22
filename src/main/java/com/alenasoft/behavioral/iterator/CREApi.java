package com.alenasoft.behavioral.iterator;

import java.util.HashMap;
import java.util.Map;

public class CREApi {
    public static Map<Integer, CREUser> getCREUsers(){
        return new HashMap<Integer, CREUser>() {{
            put(34, new CREUser(34,"John Doe", "Av. Beni 342", 200d));
            put(25, new CREUser(25,"Kevin Barja", "B/ 13 de enero", 50d));
        }};
    }
}
