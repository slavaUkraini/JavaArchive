package ua.com.vita.krainik.Pr5;

//import javax.swing.text.Segment;
/**
 * ���� ������������ �������������
 * ���� - �����������(������) � ������
 * @author Vita Krainik
 * @version 1.0 since 18.11.2012
 */	

public class Cuboid {
	public Cuboid(double a, double b, double height){
		this.basis = new Rectangle(a,b);
		this.height = new Segment(height);
	}
	public String toString(){
		return basis.toString() + "\nheight = " + height.toString();
	}	
	public double basisSquare(){
		//����� ������
		return this.basis.rectSguare();
	}
	public double heightLength(){
		//���������� ������
		return height.length();
	}
	public double capacity(){
		//��'��
		return basis.rectSguare()*height.length();
	}
	public Segment diagonal(){
		//������� ���������� ��������
		Segment diag = new Segment(Math.sqrt(basis.segA.multiply(basis.segA)
				+ basis.segB.multiply(basis.segB)
				+height.multiply(height)));
		return diag;
	}
	//���� - ������(�����������) � ������
	private Rectangle basis = new Rectangle(0,0);
	private Segment height = new Segment(0);
}

class Rectangle {
	/* ���� ������������*/	
	public String toString(){
		return "a = " + segA.toString() + "\nb = " + segB.toString();
	}
	public double rectSguare(){
		return segA.multiply(segB);
	}
	//constanta
	//private static final double Pi = 3.14159;
	Rectangle(double a, double b) {
		this.segA = new Segment(a);
		this.segB = new Segment(b);
	}
	//���� - ��� ������ � ���
	Segment segA;
	Segment segB;
	double angle = Math.PI/2;// ��� 90 �������
}

	class Segment{
		//���� ������
		public String toString(){ //��������� ������, ����� public
			return  " " + a;
		}
		public double multiply(Segment seg) {
			//��������� ������ �� �����
			return this.a*seg.a;
		}
		public double length(){
			//������� ������� ������
			return this.a;
		}
		Segment(double a) {
			this.a = a;
		}
		//���� - ������� ������
		private double a;
	}


