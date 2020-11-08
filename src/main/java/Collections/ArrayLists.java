package Collections;

import java.util.ArrayList;
import java.util.*;
public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum = 0;
        for (Integer integer : list1) {
            sum += integer;
        }

        for (Integer integer : list2) {
            sum += integer;
        }

        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        for(int i = 0; i<original.size(); i++){
            if(original.get(i).equals(toRemove)){
                original.remove(i);
            }
        }
        return original;
    }

    public boolean happyList(ArrayList<String> original) {
        if(original.size()==1) return true;

        for(int i = 0; i<original.size(); i++) {
            String sentence = original.get(i);
            Set<Character> stringSet = new HashSet<Character>();
            for (int j = 0; j < sentence.length(); j++) {
                stringSet.add(sentence.charAt(j));
            }
            Set<Character> prevStringSet = new HashSet<Character>();
            if(i != 0) {
                String prevSentence;
                prevSentence = original.get(i - 1);
                for (int z = 0; z < prevSentence.length(); z++) {
                    prevStringSet.add(prevSentence.charAt(z));
                }
            }
            Set<Character> nextStringSet = new HashSet<Character>();
            if(i != original.size()-1){
                String nextSentence = original.get(i + 1);
                for (int x = 0; x < nextSentence.length(); x++) {
                    nextStringSet.add(nextSentence.charAt(x));
                }
            }

            if (i == 0) {
                if(!happyElement(stringSet, nextStringSet)) return false;
            }
            else if(i == original.size()-1){
                if(!happyElement(stringSet, prevStringSet)) return false;
            }
            else {
                if(!happyElement(prevStringSet, stringSet, nextStringSet)) return false;
            }
        }

        return true;
    }
    public boolean happyElement(Set<Character> set1, Set<Character>set2){
        return !Collections.disjoint(set1, set2);
    }
    public boolean happyElement(Set<Character> set1, Set<Character>set2,Set<Character>set3 ){
        return !Collections.disjoint(set1, set2) || !Collections.disjoint(set2, set3);
    }
}
