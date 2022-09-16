package webJPA0916;

import javax.persistence.*;

@Entity
@Table(name="scores")
@NamedQuery(name="Score.findAll", query="SELECT c FROM Score c")
public class Score{
	@Id
	String name;
	int math;
	int english;
	int chinese;
	public Score() {
	}
	public Score(String name, int math, int english, int chinese) {
		this.name = name;
		this.math = math;
		this.english = english;
		this.chinese = chinese;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", math=" + math + ", english=" + english + ", chinese=" + chinese + "]";
	}
	
}
