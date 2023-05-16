package kadai2;

import java.util.*;

public class StrongBox<E>{
    private E item;
    private KeyType keyType;
    private int count;

    public StrongBox(KeyType keyType){
        this.keyType = keyType;
        count=0;
    }

    public void put(E item){
        this.item = item;
    }

    public E get(){
        count++;
        switch(this.keyType){
            case PADLOCK:
                if(count<1024) return null;
                break;
            case BUTTON:
                if(count<10000) return null;
                break;
            case DIAL:
                if(count<30000) return null;
                break;
            case FINGER:
                if(count<10000) return null;
                break;   
        }
        this.count=0;
        return this.item;
    }
}

