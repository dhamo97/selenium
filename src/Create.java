import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Create {
public static void main(String[] args) {
	System.out.println("vbfvebhve");
	System.out.println("bfveskkbnbhve");
	System.out.println("vbfvebhdlbmkve");
	//1.1
	Set<Integer> S = new HashSet<Integer>();
	S.add(10);
	S.add(20);
	S.add(30);
	S.add(40);
	S.add(50);
	S.add(60);
	S.add(70);
	S.add(80);
	S.add(90);
	S.add(10);
	S.add(20);
	System.out.println(S);
	
	Set<Integer> S1 = new LinkedHashSet<Integer>();
	//1.2
	S1.add(10);
	S1.add(20);
	S1.add(30);
	S1.add(40);
	S1.add(50);
	S1.add(60);
	S1.add(70);
	S1.add(80);
	S1.add(90);
	S1.add(10);
	S1.add(20);
	System.out.println();
	System.out.println(S1);
	//1.3
	Set<Integer> S2 = new TreeSet<Integer>();
	S2.add(10);
	S2.add(20);
	S2.add(30);
	S2.add(40);
	S2.add(50);
	S2.add(60);
	S2.add(70);
	S2.add(80);
	S2.add(90);
	S2.add(10);
	S2.add(20);
	System.out.println();
	System.out.println(S2);
	//2.1
	List<Integer> S3 = new ArrayList<Integer>();
	S3.add(10);
	S3.add(20);
	S3.add(30);
	S3.add(40);
	S3.add(50);
	S3.add(60);
	S3.add(70);
	S3.add(80);
	S3.add(90);
	S3.add(10);
	S3.add(20);
	System.out.println(S);
	Set<Integer> S4 = new TreeSet<Integer>();
	System.out.println(S4.addAll(S3));
	System.out.println(S4);
	//2.2
	List <Integer> a= new ArrayList<Integer>();
	a.add(105);
	a.add(205);
	a.add(305);
	a.add(405);
	a.add(505);
	a.add(605);
	a.add(705);
	a.add(805);
	a.add(505);
	a.add(605);
	Set<Integer> S5 = new TreeSet<Integer>();
	System.out.println(S5.addAll(a));
	System.out.println(S5);
	//3.1
	Set<Integer> a1 = new TreeSet<Integer>();
	a1.add(105);
	a1.add(205);
	a1.add(305);
	a1.add(405);
	a1.add(505);
	a1.add(605);
	a1.add(705);
	a1.add(805);
	a1.add(505);
	a1.add(605);
	for(int X :a1) {
		System.out.println(X);
	}
		//3.2
		Set<Integer> m = new TreeSet<Integer>();
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(40);
		m.add(50);
		m.add(60);
		m.add(70);
		m.add(80);
		m.add(90);
		m.add(10);
		m.add(20);
		for(int x:m) {
			System.out.println();
		System.out.println(x);
		}
		//4.1
		Set<Integer> w = new HashSet<Integer>();
		w.add(10);
		w.add(20);
		w.add(30);
		w.add(90);
		w.add(10);
		w.add(10);
		w.add(40);
		w.add(50);
		
		Set<Integer> w1= new HashSet<Integer>();
		w1.add(30);
		w1.add(40);
		w1.add(50);
		w1.add(60);
		w1.add(80);
		System.out.println();
		System.out.println(w.retainAll(w1));
		System.out.println(w);
		//4.2
		Set<Integer> f = new LinkedHashSet<Integer>();
		f.add(10);
		f.add(20);
		f.add(30);
		f.add(90);
		f.add(10);
		f.add(10);
		f.add(40);
		f.add(50);
		
		Set<Integer> f1= new LinkedHashSet<Integer>();
		f1.add(10);
		f1.add(20);
		f1.add(60);
		f1.add(50);
		f1.add(40);
		f1.add(70);
		f1.add(80);
		f1.add(90);
		System.out.println();
		System.out.println(f.retainAll(f1));
		System.out.println(f);
		
		//4.3
		Set<Integer> p = new TreeSet<Integer>();
		p.add(10);
		p.add(20);
		p.add(30);
		p.add(40);
		p.add(50);
		p.add(60);
		p.add(70);
		p.add(80);
		Set<Integer> p1 = new TreeSet<Integer>();
		p1.add(100);
	    p1.add(200);
	    p1.add(300);
	    p1.add(400);
	    p1.add(500);
	    p1.add(600);
	    p1.add(700);
	    p1.add(800);
	    System.out.println();
		System.out.println(p.retainAll(p1));
		System.out.println(p);
		
		Set<Integer> e = new HashSet<Integer>();
		e.add(10);
		e.add(20);
		e.add(30);
		e.add(90);
		e.add(10);
		e.add(10);
		e.add(40);
		e.add(50);
		
		Set<Integer> e1= new HashSet<Integer>();
		e1.add(30);
		e1.add(40);
		e1.add(50);
		e1.add(60);
		e1.add(80);
		System.out.println();
		System.out.println(e.removeAll(e1));
		System.out.println(e);  
		
		Set<Integer> p2 = new TreeSet<Integer>();
		p2.add(10);
		p2.add(20);
		p2.add(30);
		p2.add(40);
		p2.add(50);
		p2.add(60);
		p2.add(70);
		p2.add(80);
		Set<Integer> p3 = new TreeSet<Integer>();
		p3.add(100);
	    p3.add(200);
	    p3.add(300);
	    p3.add(400);
	    p3.add(500);
	    p3.add(600);
	    p3.add(700);
	    p3.add(800);
	    System.out.println();
		System.out.println(p2.removeAll(p3));
		System.out.println(p2);
	}
}

