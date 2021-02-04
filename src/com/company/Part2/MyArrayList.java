package com.company.Part2;

import java.util.ArrayList;

public class MyArrayList<E> extends ArrayList<E> {
    public MyArrayList() {
        // postcondition: crate an empty list
        super();
        assert this.isEmpty();
    }

    @Override
    public int size() {
        // postcondition: return number of items
        // code
        int count=0;
        for(E e: this){
            count++;
        }
        ArrayList<E> temp= new ArrayList<>();
        for(E e: this){
            temp.add(e);
        }
        assert count==temp.size();
        return count;
    }

    // Insert e as a new first element to mal
    public void insertFirst(E e) {
        // precondition: size>=0 and e!=null
        // code
        // postcondition: the fist element is the new element has been added and the size increases by 1
        assert this.size()>=0 && e!=null;
        if(this.size()==0) {
            this.add(e);
            return;
        }
        E a= e;
        int prev_size=this.size();
        ArrayList<E> t= new ArrayList<>();
        boolean check= false;

        for(E i: this){
            t.add(i);
        }
        for(int i=0; i<this.size(); i++){
            E temp=this.get(0);
            this.set(0, e);
            e=temp;
        }
        this.add(e);
        if(a.equals(this.get(0)) && this.size()==prev_size+1){
            int index=0;
            for(E i: t){
                E c=this.get(index+1);
                if(!i.equals(c)) {
                    check=false;
                    break;
                }
                index++;
            }
            check=true;
        }
        assert check==true;
    }

    // Insert e as a new last element
    public void insertLast(E e) {
        // precondition: e!=null
        // code
        // postcondition: new item in the last position and the size increases by one
        assert e!=null;
        int prev_size=this.size();
        this.add(e);
        assert e.equals(this.get(prev_size));
    }

    // Delete my first element
    public void deleteFirst() {
        // precondition: there is at least one item in the list
        // code
        // postcondition: Second items of prev list must be the first item of current list and size is deducted by 1
        assert this.size()>=1;
        int prev_size=this.size();
        E e= this.get(1);
        this.remove(0);
        assert (e.equals(this.get(0))) && this.size()==prev_size-1;
    }

    // Delete my last element
    public void deleteLast() {
        // precondition: there is at least one item in the list
        // code
        // postcondition: the last item of prev list must be null and the size is deducted by 1
        assert this.size()>=1;
        int prev_size=this.size();
        E e=this.get(this.size()-1);
        this.remove(this.size()-1);
        assert this.size()==prev_size-1;
    }

    public void show() {
        for (E e : this) {
            System.out.println(e);
        }
    }
}

