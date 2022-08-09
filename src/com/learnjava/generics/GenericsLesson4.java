package com.learnjava.generics;
public class GenericsLesson4<TypeParam> {
	TypeParam tpObj;
	GenericsLesson4(TypeParam tpObj) {
		this.tpObj = tpObj;
	}
	public void show() {
		System.out.println("Type of object is : " + this.tpObj.getClass().getName());
	}
	public TypeParam get() {
		return tpObj;
	}
	public static void main(String[] args) {
		GenericsLesson4<String> gStr = new GenericsLesson4<String>("Sandy");
		gStr.show();
		System.out.println(gStr.get());	
		GenericsLesson4<Integer> gInt = new GenericsLesson4<Integer>(10);
		gInt.show();
		System.out.println(gInt.get());
		GenericsLesson4<Double> gDbl = new GenericsLesson4<Double>(10.5);
		gDbl.show();
		System.out.println(gDbl.get());
	}
}
