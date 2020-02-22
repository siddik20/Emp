package com.mit;

public class Emp {

	
		
		private int sid;
		private String sname;
		private String addrs;
		
		public Employee() {
			super();
		}

		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public String getAddrs() {
			return addrs;
		}

		public void setAddrs(String addrs) {
			this.addrs = addrs;
		}

		@Override
		public String toString() {
			return "Employee [sid=" + sid + ", sname=" + sname + ", addrs=" + addrs + "]";
		}
		

	}

}
