class Practice{
	int rollno;
	String name;
	static String college="Venkateswaraconvent";
	Practice(int x,String r){
		rollno=x;
		name=r;
	}
	void display(){
		System.out.println(rollno+""+name+" "+""+college);
		}
		public static void main(String args[]){
			Practice s1=new Practice(101,"Shiva");
			Practice s2=new Practice(102,"Santosh");
			s1.display();
			s2.display();
		}
}