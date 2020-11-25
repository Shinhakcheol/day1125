
public class Test01 {

	public static void main(String[] args) {
		
		//첫번째좌표는
		Point pos=new Point();
		
		//두번째좌표는
		Point des=new Point();
		des.x=2;
		des.y=2;
		
		System.out.println("좌표 [x,y] : ["+des.x+","+des.y+"]");
		
		int a=des.x - pos.x;
		System.out.println(a);
		int b=des.y - pos.y;
		System.out.println(b);
		
		//c=루트(a^2+b^2)
		double distance=Math.sqrt((double)Math.pow(a,2)+Math.pow(b,2));
		System.out.println("거리는 "+ distance);
		
		System.out.println(Math.PI);
		//파이널이 어디 부터있든 재정의 하지 마세요.
	}

}
