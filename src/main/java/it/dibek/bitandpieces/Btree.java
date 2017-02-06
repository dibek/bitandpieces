package it.dibek.bitandpieces;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by giuseppe.dibella on 05/01/2017.
 */
public class Btree {

    private Btree left;
    private Btree right;


    Queue<String> myQueue = new ConcurrentLinkedQueue<>();

    ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();

    Map<String,String> map = new HashMap<>();




}
