package springweb.a05_mvcexp.z01_vo;

public class Student {
	private int stuno;
	private String stuname;
	private int kor;
	private int eng;
	private int math;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int stuno, String stuname, int kor, int eng, int math) {
		this.stuno = stuno;
		this.stuname = stuname;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getStuno() {
		return stuno;
	}
	public void setStuno(int stuno) {
		this.stuno = stuno;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

}
