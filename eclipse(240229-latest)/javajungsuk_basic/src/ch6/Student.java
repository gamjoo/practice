package ch6;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student() {
	
	}
	
	public String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","
				+(kor+eng+math)+","+(Math.round((kor+eng+math)/3.0*10))/10f; 
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public float getAverage() {
		return (Math.round((kor+eng+math)/3.0*10))/10f;
	}

}
