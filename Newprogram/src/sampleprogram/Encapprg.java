package sampleprogram;

 class enacapdemo {
		private int serialNum;
		private String name;
		private int age;
		
		public int getSerialNum() {
		return serialNum;
		}
		public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
		}
		public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}
		public int getAge() {
		return age;
		}
		public void setAge(int age) {
		this.age = age;
		}
		// Object class method - to returns string representation of the object
		@Override
		public String toString() {
		return " [Serial Number=" + serialNum + ", name=" + name + ", age=" + age + "]";
		}
		}
		//Program to demonstrate class and object 
		public class Encapprg {
		public static void main(String[] args) {
		//object creation 
		enacapdemo	 obj = new enacapdemo();
		obj.setSerialNum(11);
		obj.setName("Muthu");
		obj.setAge(22);
		System.out.println(obj);
		}
		}

