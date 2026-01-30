package com.model;

public class Student {
	    private int id;
	    private String name;
	    private String city;
	    private String branch;
	    private double perc;
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", city=" + city + ", branch=" + branch + ",perc="+ perc+"]";
		}
	    
		public double getPerc() {
			return perc;
		}

		public void setPerc(double d) {
			this.perc = d;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
	

}
