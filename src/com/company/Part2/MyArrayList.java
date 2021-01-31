package com.company.Part2;

import java.util.ArrayList;

public class MyArrayList<E> extends ArrayList<E> {
    private ArrayList<E> list= new ArrayList<>();
    public MyArrayList() {
        // assert postcondition
        super();
        assert list.isEmpty();
    }

    @Override
    public int size() {
        // assert postcondition
        // code
        int count=0;
        for(E e: list){
            count++;
        }
        assert count==list.size();
        return count;
    }

    // Insert e as a new first element to mal
    public void insertFirst(E e) {
        // precondition: size>=0
        // code
        // postcondition: the fist element is the new element has been added and the size increases by 1
        assert list.size()>=0;
        if(list.size()==0) {
            list.add(e);
            return;
        }
        E a= e;
        int prev_size=list.size();
        ArrayList<E> t= new ArrayList<>();
        boolean check= false;

        for(E i: list){
            t.add(i);
        }
        for(int i=0; i<this.size(); i++){
            E temp=list.get(0);
            list.set(0, e);
            e=temp;
        }
        list.add(e);
        if(a.equals(list.get(0)) && list.size()==prev_size+1){
            int index=0;
            for(E i: t){
                E c=list.get(index+1);
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
        // precondition: none
        // code
        // postcondition: new item in the last position and the size increases by one
        assert true;
        int prev_size=list.size();
        list.add(e);
        assert e.equals(list.get(prev_size));
    }

    // Delete my first element
    public void deleteFirst() {
        // precondition: none
        // code
        // postcondition: Second items of prev list must be the first item of current list and size is deducted by 1
        int prev_size=list.size();
        ArrayList<E> t= new ArrayList<>();
        E e=list.get(1);
        for(int i=1; i<list.size(); i++){
            t.add(list.get(i));
        }
        list=t;
        assert (e.equals(list.get(0))) && list.size()==prev_size-1;
    }

    // Delete my last element
    public void deleteLast() {
        // precondition: none
        // code
        // postcondition: the last item of prev list must be null and the size is deducted by 1
        assert true;
        int prev_size=list.size();
        E e=list.get(list.size()-1);
        list.remove(list.size()-1);
        assert list.size()==prev_size-1;
    }

    public void show() {
        for (E e : list) {
            System.out.println(e);
        }
    }
}

