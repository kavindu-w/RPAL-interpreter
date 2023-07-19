package cse_machine;

import java.util.ArrayList;
import java.util.Collections;

import control_structures.CSNode;

public class RPALFunc {

    public static boolean checkInBuilt(String name) {
        ArrayList<String> functionNames = new ArrayList<String>();

        Collections.addAll(functionNames, "Print","Stem","Stern","Conc","aug","Order","Null",
                "Isinteger","Istruthvalue","Isstring","Istuple","Isfunction","Isdummy");

        return functionNames.contains(name);
    }

    public static void Print(CSNode node) {
        System.out.println(node.getName());
    }

    public static CSNode Stem(CSNode node) {
        node.setName(node.getName().substring(0,1));
        return node;
    }

    public static CSNode Stern(CSNode node) {
        node.setName(node.getName().substring(1));
        return node;
    }

    public static CSNode Conc(CSNode node1, CSNode node2) {
        String conc = node1.getName().concat(node2.getName());
        return new CSNode("STRING", conc);
    }


}
