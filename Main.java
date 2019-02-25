public class Main{
	public static void main(String [] args){
		Math m = new Math();
		System.out.println("Add: "+m.add(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Sub: "+m.sub(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
		System.out.println("Mult: "+m.mult(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}
}