package ch07;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

	private int n1;
	private int n2;
	private String op;
	private String[] myList = {"","",""};
	private Map<String,String> myMap;
	private HashMap<String,String> myHashMap = new HashMap<String,String>();
		
	public String[] getMyList() {
		return myList;
	}

	public void setMyList(String[] myList) {
		this.myList = myList;
	}

	public Map<String, String> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}

	public HashMap<String, String> getMyHashMap() {
		return myHashMap;
	}

	public void setMyHashMap(HashMap<String, String> myHashMap) {
		this.myHashMap = myHashMap;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public long calc() {

		myList[0] = "A";
		myList[1] = "B";
		myList[2] = "C";
		
		myMap.put("name", "A");
		myMap.put("age", "20");
		
		myHashMap.put("name", "A");
		myHashMap.put("age", "20");
		
		long result = 0;

		switch (this.op) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
			break;
		case "/":
			result = n1 / n2;
			break;
		}

		return result;
	}

}
