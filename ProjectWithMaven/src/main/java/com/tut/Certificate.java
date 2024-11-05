package com.tut;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
    private String course;
    private String duratin;
	@Override
	public String toString() {
		return "Certificate [course=" + course + ", duratin=" + duratin + "]";
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuratin() {
		return duratin;
	}
	public void setDuratin(String duratin) {
		this.duratin = duratin;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(String course, String duratin) {
		super();
		this.course = course;
		this.duratin = duratin;
	}
}
