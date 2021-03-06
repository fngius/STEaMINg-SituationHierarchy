package org.example.lat;

import java.util.*;
import org.javatuples.Pair;

/**
 * 
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        
        /*
            SET OF SITUATIONS (S)
        */
        Set<String> situation_Set = new HashSet<String>(); 
        situation_Set.add("s_1"); 
        situation_Set.add("s_2"); 
        situation_Set.add("s_3"); 
        situation_Set.add("s_4"); 
        situation_Set.add("s_5");
        situation_Set.add("s_6");
        situation_Set.add("s_7");
        situation_Set.add("s_8");
        situation_Set.add("s_9");
        situation_Set.add("s_10");
        situation_Set.add("s_11");
        situation_Set.add("s_12");
        situation_Set.add("s_13");
        situation_Set.add("s_14"); 
        
        
        /*
            SET OF CONSTRAINTS (C)
        */
        Set<String> constraint_Set = new HashSet<String>(); 
        constraint_Set.add("c_1"); 
        constraint_Set.add("c_2"); 
        constraint_Set.add("c_3"); 
        constraint_Set.add("c_4"); 
        constraint_Set.add("c_5");
        constraint_Set.add("c_6");
        constraint_Set.add("c_7");
        constraint_Set.add("c_8");
        constraint_Set.add("c_9");
        constraint_Set.add("c_10");
        constraint_Set.add("c_11");
        constraint_Set.add("c_12");
        constraint_Set.add("c_13");
        constraint_Set.add("c_14");
        constraint_Set.add("c_15");
        constraint_Set.add("c_16");
        constraint_Set.add("c_17"); 
        constraint_Set.add("c_18");
        constraint_Set.add("c_19");
        constraint_Set.add("c_20");
        constraint_Set.add("c_21");
        constraint_Set.add("c_22");
        constraint_Set.add("c_23");
        
        /*
            RELATION AMONG SITUATIONS AND CONSTRAINTS (R)
        */
        Pair<String, String> pair1 = new Pair<String, String>("s_1", "c_1");
        Pair<String, String> pair2 = new Pair<String, String>("s_1", "c_3");
        Pair<String, String> pair3 = new Pair<String, String>("s_1", "c_4");
        Pair<String, String> pair4 = new Pair<String, String>("s_1", "c_5");
        Pair<String, String> pair5 = new Pair<String, String>("s_1", "c_6");


        Pair<String, String> pair6 = new Pair<String, String>("s_2", "c_2");
        Pair<String, String> pair7 = new Pair<String, String>("s_2", "c_3");
        Pair<String, String> pair8 = new Pair<String, String>("s_2", "c_4");
        Pair<String, String> pair9 = new Pair<String, String>("s_2", "c_5");
        Pair<String, String> pair10 = new Pair<String, String>("s_2", "c_6");
        
        
        Pair<String, String> pair11 = new Pair<String, String>("s_3", "c_8");
        Pair<String, String> pair12 = new Pair<String, String>("s_3", "c_10");
        Pair<String, String> pair13 = new Pair<String, String>("s_3", "c_11");
        Pair<String, String> pair14 = new Pair<String, String>("s_3", "c_6");

        Pair<String, String> pair15 = new Pair<String, String>("s_4", "c_9");
        Pair<String, String> pair16 = new Pair<String, String>("s_4", "c_10");
        Pair<String, String> pair17 = new Pair<String, String>("s_4", "c_11");
        Pair<String, String> pair18 = new Pair<String, String>("s_4", "c_6");

        Pair<String, String> pair19 = new Pair<String, String>("s_5", "c_7");
        Pair<String, String> pair20 = new Pair<String, String>("s_5", "c_9");
        Pair<String, String> pair21 = new Pair<String, String>("s_5", "c_10");
        Pair<String, String> pair22 = new Pair<String, String>("s_5", "c_11");


        Pair<String, String> pair23 = new Pair<String, String>("s_6", "c_15");
        Pair<String, String> pair24 = new Pair<String, String>("s_6", "c_17");
        Pair<String, String> pair25 = new Pair<String, String>("s_6", "c_18");

        Pair<String, String> pair26 = new Pair<String, String>("s_7", "c_16");
        Pair<String, String> pair27 = new Pair<String, String>("s_7", "c_17");
        Pair<String, String> pair28 = new Pair<String, String>("s_7", "c_18");

        Pair<String, String> pair29 = new Pair<String, String>("s_8", "c_17");
        Pair<String, String> pair30 = new Pair<String, String>("s_8", "c_19");
        Pair<String, String> pair31 = new Pair<String, String>("s_8", "c_6");

        Pair<String, String> pair32 = new Pair<String, String>("s_9", "c_17");
        Pair<String, String> pair33 = new Pair<String, String>("s_9", "c_20");
        Pair<String, String> pair34 = new Pair<String, String>("s_9", "c_6");

        Pair<String, String> pair35 = new Pair<String, String>("s_10", "c_16");
        Pair<String, String> pair36 = new Pair<String, String>("s_10", "c_17");
        Pair<String, String> pair37 = new Pair<String, String>("s_10", "c_18");
        Pair<String, String> pair38 = new Pair<String, String>("s_10", "c_19");

        Pair<String, String> pair39 = new Pair<String, String>("s_11", "c_12");
        Pair<String, String> pair40 = new Pair<String, String>("s_11", "c_21");
        Pair<String, String> pair41 = new Pair<String, String>("s_11", "c_23");

        Pair<String, String> pair42 = new Pair<String, String>("s_12", "c_12");
        Pair<String, String> pair43 = new Pair<String, String>("s_12", "c_22");
        Pair<String, String> pair44 = new Pair<String, String>("s_12", "c_23");

        Pair<String, String> pair45 = new Pair<String, String>("s_13", "c_13");
        Pair<String, String> pair46 = new Pair<String, String>("s_13", "c_21");
        Pair<String, String> pair47 = new Pair<String, String>("s_13", "c_23");

        Pair<String, String> pair48 = new Pair<String, String>("s_14", "c_14");
        Pair<String, String> pair49 = new Pair<String, String>("s_14", "c_21");
        Pair<String, String> pair50 = new Pair<String, String>("s_14", "c_23");

        Set<Pair<String, String>> rel_Sit_Cons = new HashSet<Pair<String, String>>();
        rel_Sit_Cons.add(pair1);
        rel_Sit_Cons.add(pair2);
        rel_Sit_Cons.add(pair3);
        rel_Sit_Cons.add(pair4);
        rel_Sit_Cons.add(pair5);
        rel_Sit_Cons.add(pair6);
        rel_Sit_Cons.add(pair7);
        rel_Sit_Cons.add(pair8);
        rel_Sit_Cons.add(pair9);
        rel_Sit_Cons.add(pair10);
        rel_Sit_Cons.add(pair11);
        rel_Sit_Cons.add(pair12);
        rel_Sit_Cons.add(pair13);
        rel_Sit_Cons.add(pair14);
        rel_Sit_Cons.add(pair15);
        rel_Sit_Cons.add(pair16);
        rel_Sit_Cons.add(pair17);
        rel_Sit_Cons.add(pair18);
        rel_Sit_Cons.add(pair19);
        rel_Sit_Cons.add(pair20);
        rel_Sit_Cons.add(pair21);
        rel_Sit_Cons.add(pair22);
        rel_Sit_Cons.add(pair23);
        rel_Sit_Cons.add(pair24);
        rel_Sit_Cons.add(pair25);
        rel_Sit_Cons.add(pair26);
        rel_Sit_Cons.add(pair27);
        rel_Sit_Cons.add(pair28);
        rel_Sit_Cons.add(pair29);
        rel_Sit_Cons.add(pair30);
        rel_Sit_Cons.add(pair31);
        rel_Sit_Cons.add(pair32);
        rel_Sit_Cons.add(pair33);
        rel_Sit_Cons.add(pair34);
        rel_Sit_Cons.add(pair35);
        rel_Sit_Cons.add(pair36);
        rel_Sit_Cons.add(pair37);
        rel_Sit_Cons.add(pair38);
        rel_Sit_Cons.add(pair39);
        rel_Sit_Cons.add(pair40);
        rel_Sit_Cons.add(pair41);
        rel_Sit_Cons.add(pair42);
        rel_Sit_Cons.add(pair43);
        rel_Sit_Cons.add(pair44);
        rel_Sit_Cons.add(pair45);
        rel_Sit_Cons.add(pair46);
        rel_Sit_Cons.add(pair47);
        rel_Sit_Cons.add(pair48);
        rel_Sit_Cons.add(pair49);
        rel_Sit_Cons.add(pair50);
        
        /*
            RELATION AMONG THE CONSTRAINTS (T)
        */
        Pair<String, String> pair1_cons = new Pair<String, String>("c_22", "c_21");
        Pair<String, String> pair2_cons = new Pair<String, String>("c_20", "c_19");
        Pair<String, String> pair3_cons = new Pair<String, String>("c_14", "c_13");
        Pair<String, String> pair4_cons = new Pair<String, String>("c_9", "c_8");
        Pair<String, String> pair5_cons = new Pair<String, String>("c_2", "c_1");
        Pair<String, String> pair6_cons = new Pair<String, String>("c_16", "c_15");
        Set<Pair<String, String>> rel_Cons_Cons = new HashSet<Pair<String, String>>();
        rel_Cons_Cons.add(pair1_cons);
        rel_Cons_Cons.add(pair2_cons);
        rel_Cons_Cons.add(pair3_cons);
        rel_Cons_Cons.add(pair4_cons);
        rel_Cons_Cons.add(pair5_cons);
        rel_Cons_Cons.add(pair6_cons);

        /*
            RELTAION AMONG SITUATIONS AND CONSTRAINTS CONSIDERING T
        */
        Set<Pair<String, String>> newR;
        newR = complete_R_relation(constraint_Set,rel_Sit_Cons,rel_Cons_Cons);
        newR.addAll(rel_Sit_Cons);

        /* 
            ALGORITHM TO BIULD THE LATTICE
        */
        // STEP 1
        Set<Pair<Set<String>, Set<String>>> set = new HashSet<Pair<Set<String>, Set<String>>>();
        situation_Set.forEach(s -> {
            Set<String> singleton = new HashSet<String>();
            singleton.add(s);
            set.add(operator1(singleton,constraint_Set,newR));
        });

        // STEP 2
        Set<Set<String>> setOf_allConstraintsSets_1;
        setOf_allConstraintsSets_1 = new HashSet<Set<String>>();
        set.forEach(p -> {
            setOf_allConstraintsSets_1.add(p.getValue1());
        });
        Set<Set<String>> setOf_allConstraintsSets;
        setOf_allConstraintsSets = complete_Cons_Set(setOf_allConstraintsSets_1);

        // STEP 3
        Set<Pair<Set<String>, Set<String>>> new_Set = new HashSet<Pair<Set<String>, Set<String>>>();
        setOf_allConstraintsSets.forEach(c -> {
            new_Set.add(operator2(c,situation_Set,newR));
        });
        Set<String> emtpSet;
        emtpSet = Collections.emptySet();
        new_Set.add(new Pair<Set<String>, Set<String>>(situation_Set,emtpSet));
        new_Set.add(new Pair<Set<String>, Set<String>>(emtpSet,constraint_Set));
        List<Pair<Set<String>, Set<String>>> sortedList = new ArrayList<>(new_Set);
        Collections.sort(sortedList, new OrderLattice());
        Collections.reverse(sortedList);

        /*
            PRINT SETS AND GRAPH
        */
        System.out.print("Situation set: "); 
        System.out.println(situation_Set); 
        System.out.print("Constraint set: "); 
        System.out.println(constraint_Set); 
        System.out.print("Relation R: "); 
        System.out.println(rel_Sit_Cons);
        System.out.print("Relation T: "); 
        System.out.println(rel_Cons_Cons);
        System.out.print("Relation R (considering T): ");
        System.out.println(newR);
        System.out.println("GRAPH: ");
        sortedList.forEach(n -> {
            System.out.println(n);
            for (Pair<Set<String>,Set<String>> pair : new_Set) {
                if (order(n, pair) && n != pair) {
                    System.out.println("   ->  "+pair);
                }
            }
        });
    }

    public static Set<Set<String>> complete_Cons_Set(Set<Set<String>> set) {
        Set<Set<String>> newSet = new HashSet<Set<String>>();
        set.forEach(e1 -> {
            for (Set<String> e2 : set) {
                Set<String> result = new HashSet<String>(e1);
                result.retainAll(e2);
                if (!result.isEmpty()) {
                    newSet.add(result);
                } 
            }
        });
        return newSet;
    }

    public static Set<Pair<String, String>> complete_R_relation(Set<String> all_cons, Set<Pair<String, String>> relR, Set<Pair<String, String>> relT) {
        Set<Pair<String, String>> newR = new HashSet<Pair<String, String>>();
        relR.forEach(p_R -> {
            all_cons.forEach(c -> {
                Pair<String, String> p = new Pair<String, String>(p_R.getValue1(),c);
                if (relT.contains(p)){
                    Pair<String, String> p1 = new Pair<String, String>(p_R.getValue0(),c);
                    newR.add(p1);
                }
            });
        });
        return newR;
    }
    
    public static Pair<Set<String>, Set<String>> operator1(Set<String> sit, Set<String> all_cons, Set<Pair<String, String>> rel) {
        Set<String> cons = new HashSet<String>();
        all_cons.forEach(c -> {
            boolean b = true;
            for (String string : sit) {
                Pair<String, String> p = new Pair<String, String>(string,c);
                if (!rel.contains(p)){
                    b = false;
                }  
            }
            if (b) {
                cons.add(c);
            }
        });
        Pair<Set<String>, Set<String>> output = new Pair<Set<String>, Set<String>>(sit,cons);
        return output;
    }

    public static Pair<Set<String>, Set<String>> operator2(Set<String> cons, Set<String> all_sit, Set<Pair<String, String>> rel) {
        Set<String> sit = new HashSet<String>();
        all_sit.forEach(s -> {
            boolean b = true;
            for (String string : cons) {
                Pair<String, String> p = new Pair<String, String>(s,string);
                if (!rel.contains(p)){
                    b = false;
                }  
            }
            if (b) {
                sit.add(s);
            }
        });
        Pair<Set<String>, Set<String>> output = new Pair<Set<String>, Set<String>>(sit,cons);
        return output;
    }

    public static boolean order(Pair<Set<String>, Set<String>> n1, Pair<Set<String>, Set<String>> n2) {
        return n1.getValue0().containsAll(n2.getValue0()) && n2.getValue1().containsAll(n1.getValue1());
    }

}
