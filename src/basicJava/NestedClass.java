package basicJava;



public class NestedClass {
	
	
	public static void main(String[] args) {
		
		//LivingRoom Class:
		LivingRoom lr = new LivingRoom();
		System.out.println(lr.chair);
		System.out.println(LivingRoom.tvSize);
		
		LivingRoom.tvSize = 75.5;
		System.out.println(LivingRoom.tvSize);
		
		
//		Kitchen kt = new Kitchen();
//		kt.stove();
//		Kitchen.diningTable();
		
		LivingRoom.Kitchen ktn = new LivingRoom.Kitchen();
		ktn.stove();
		
		LivingRoom.Kitchen.diningTable();
		
		
	}
	
	
	
	
	public static class LivingRoom{
		
		char roomName = 'M';
		String roomSize = "400sqft";
		int chair = 4;
		
		static double tvSize = 65.5;
		
		
		
		public static class Kitchen{
			
			
			public void stove() {
				System.out.println("kitchen has a stove and an oven");
			}
			
			public static void diningTable() {
				System.out.println("Kitchen has a dinning table");
			}
			
			
		}
		
		
	}
	

}
