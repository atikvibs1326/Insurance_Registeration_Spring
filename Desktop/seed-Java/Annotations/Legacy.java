//package com.code;
import java.util.*;
//@SuppressWarnings("unchecked")
class Legacy {
  Set s = new HashSet();
  public final void doLogic(int a, char c) {
    s.add(a);
    s.add(c); // Type-unsafe operation, ignored
  }
}   