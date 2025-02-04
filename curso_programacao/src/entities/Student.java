package entities;

public class Student {
 public String name;
 public double[] nota = new double[3] ;
 
 public double media() {
	 return nota[0]+nota[1]+nota[2];
 }
public String result() {
	String res;
	if(media()>=60) {
	res =  "Pass";
	}else {
		res = "Failed";
	}
	return res;
}
public double missingPoints() {
	if(media() < 60) {
	return 60.00-media();
	}else {
		return 0.00;
	}
}
public String toString() {
	return name
			+"\nnota 1: "
			+String.format("%.2f", nota[0])
			+"\n"
			+"nota 2: "
			+String.format("%.2f", nota[1])
			+"\n"
			+"nota 3: "
			+String.format("%.2f", nota[2])
			+"\n"
			+"Final Grade "
			+String.format("%.2f", media())
			+"\n"
			+ result();
};
}
