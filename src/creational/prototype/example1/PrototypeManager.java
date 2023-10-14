package creational.prototype.example1;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
    private final Map<String, Prototype> prototypeMap = new HashMap<>();
    public void registerPrototype(String key, Prototype prototype){

        prototypeMap.put(key, prototype);
    }

    public Prototype getClone(String key){
        Prototype prototype = prototypeMap.get(key);
        if (prototype != null){
            return prototype.cloning();
        }
        return null;
    }
}
