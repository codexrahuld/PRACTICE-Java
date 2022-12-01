package com.masai.Eval2.Q5;


import java.io.Serializable;
	
	public class Address implements Serializable {
		
		String state;
		String city;
		String pincode;
		
		
		public Address() {
			
			super();
			//TODO Auto-generated constructor
		}
		
		public Address(String state, String city, String pincode) {
			super();
			this.state = state;
			this.city = city;
			this.pincode = pincode;
			
		}

		@Override
		public String toString() {
			return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
		}

	}
		