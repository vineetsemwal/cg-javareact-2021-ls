package com.cg.schoolms.dao;
import java.util.*;

import com.cg.schoolms.entities.Student;

public class StoreHolder {

	public static Map<Integer,Student>store=new HashMap<>();
	
	public static int generateId() {
	int size=	store.size()+1;
	 return size;
	}
	
}
