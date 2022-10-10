package com.exercises.javase.exercise;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ExcAssignGroupList {

    public static void main(String[] args) {

        List<MovementGroup> listGroupBd = new ArrayList<>();
        listGroupBd.add(new MovementGroup("AUS5525","N",1));
        listGroupBd.add(new MovementGroup("RE52541","N",5));
        listGroupBd.add(new MovementGroup("POK2563","N",8));
        listGroupBd.add(new MovementGroup("POK2563","N",12));

        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(3);
        listInt.add(5);
        listInt.add(6);

        List<MovementGroup> listGroupConc = new ArrayList<>();
//        listGroupConc.add(new MovementGroup("AUS5344","N",null));
//        listGroupConc.add(new MovementGroup("AUS5344","N",null));
        listGroupConc.add(new MovementGroup("56FF333","N",null));
        listGroupConc.add(new MovementGroup("56FF333","N",null));
        listGroupConc.add(new MovementGroup("4422222","N",null));
        listGroupConc.add(new MovementGroup("4422222","N",null));

        System.out.println("Size: "+listGroupConc.size());
        MovementGroup movg1 = null;
        MovementGroup movg2 = null;
        Integer cont = 1;
        Integer valGroup;
        Boolean boolGroup = false;

        movg1 = new MovementGroup("AUS5344","N",cont);
        movg2 = new MovementGroup("AUS5344","S",cont);

        while (boolGroup==false){
            boolGroup = evaluateNumericGroup(listGroupBd,listGroupConc,cont);
            valGroup = cont;
            cont++;
        }



    }

    public static Boolean evaluateNumericGroup(List<MovementGroup> listGroupBd,List<MovementGroup> listGroupConc, Integer cont){
        Boolean returnVal = false;
        if (listGroupBd.stream().noneMatch(movGroup -> movGroup.getGroup().equals(cont)) &&
                listGroupConc.stream().noneMatch(movGroup -> movGroup.getGroup().equals(cont))) {
            returnVal = true;
        }
        return returnVal;
    }

}

class MovementGroup{

    private String reference;
    private String origin;
    private Integer group;

    public MovementGroup(String reference, String origin, Integer group) {
        this.reference = reference;
        this.origin = origin;
        this.group = group;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Movement.class.getSimpleName() + "[", "]")
                .add("reference='" + reference + "'")
                .add("origin='" + origin + "'")
                .add("group=" + group)
                .toString();
    }
}
