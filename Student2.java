package com.company;

public class Student2 {
	private String S_Name;
	private String S_RollNo;
	private String S_Standard;
	private String S_Section;

	
	public Student2() {
		// TODO Auto-generated constructor stub
		this("DefaultNAme","123DEf", "X","A");
	}
	public Student2(String S_Name, String S_RollNo)
	{

		this(S_Name,S_RollNo,"5th","A");
	}
	public Student2(String sName, String sRollNo, String sStandard, String sSection)
	{
		this.S_Name = sName;
		this.S_RollNo = sRollNo;
		this.S_Standard = sStandard;
		this.S_Section = sSection;
		
	}
	
	public String getS_Name() {
		return S_Name; 
	}
	public String getS_RollNo() {
		return S_RollNo; 
	}
	public String getS_Standard() {
		return S_Standard; 
	}
	public String getS_Section() {
		return S_Section; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1 = new Student2();
		Student2 s2 = new Student2("Sanskriti", "12345");
		Student2 s3 = new Student2("Sanskar","1542","10Th","B");
		System.out.println(s1.getS_Name());
		System.out.println(s2.getS_Name());
		System.out.println(s3.getS_Name()+" "+s3.getS_RollNo()+" "+s3.getS_Standard()+" "+s3.getS_Section());
	}

}
