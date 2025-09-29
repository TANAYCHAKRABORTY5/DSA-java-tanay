package Hashmaps;


import com.sun.source.doctree.EntityTree;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

class MapusingHash{
    private Entity[] entities;

    public MapusingHash(){
        entities = new Entity[100];
    }


    public void put(String key,String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash]= new Entity(key,value);

    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            entities[hash] = null;
        }
    }



    private class Entity{
        String key;
        String value;

        public Entity(String key,String value){
            this.key=key;
            this.value=value;
        }
    }
}
public class Main {

    public static void main(String[] args) {
        MapusingHash map = new MapusingHash();
        map.put("Mango" , "king");
        map.put("Apple" , "sweet");
        map.put("Guava" , "kadu");
        map.put("Litchi" , "juicy");

        System.out.println(map.get("Apple"));
    }



}
