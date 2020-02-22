package com.mit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmpTable")
public class Emp {
	
		@Id
		@Column(name ="id")
		private int sid;
		@Column(name ="name")
		private String sname;
		@Column(name ="addrs")
		private String addrs;
		
		public Emp() {
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
