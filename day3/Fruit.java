
	package day3;

	public abstract class Fruit {
		}
		class Apple extends Fruit{
			public String toString(){
				return "apple";
			}
		}
		class Mango extends Fruit{
			public String toString(){
				return "Mango";
			}
		}
	class Juicer{
			public void juice(Fruit fruit){
				System.out.println("zh"+fruit+"zhi");
			}
	public static void mian(String[] args){
		Juicer j = new Juicer();
		Fruit fruit=new Apple();
		j.juice(fruit);
	}
	}


