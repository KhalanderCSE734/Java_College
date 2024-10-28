class GenericsClass<T>{
	T object;
	GenericsClass(T object){
		this.object = object;
	}
	T getObject(){
		return this.object;
	}
	void showType(){
		System.out.println("The type of "+this.object+" is "+this.object.getClass().getName());
	}

}
class GenericsTwoParameter<T1,T2>{
	T1 object1;
	T2 object2;
	GenericsTwoParameter(T1 object1,T2 object2){
		this.object1 = object1;
		this.object2 = object2;
	}
	T1 getObject1(){
		return this.object1;
	}
	T2 getObject2(){
		return this.object2;
	}
	void showType1(){
		System.out.println("The type of "+this.object1+" is "+this.object1.getClass().getName());
	}
	void showType2(){
		System.out.println("The type of "+this.object2+" is "+this.object2.getClass().getName());
	}
	

}

class Generics{
	public static void main(String args[]){
		GenericsClass<Integer> list = new GenericsClass<>(567);
		//System.out.println(list.showType());
		list.showType();
		System.out.println(list.getObject());
		GenericsTwoParameter<Integer,Character> map = new GenericsTwoParameter<>(8,'A');
		map.showType1();
		map.showType2();
		System.out.println(map.getObject1());
		System.out.println(map.getObject2());
		Integer num = Integer.valueOf(600);
		Character ch = Character.valueOf('M');
		int a = num;
		a = num.intValue();
		char c = ch;
		c = ch.charValue();
		System.out.println(a+" " +num+ " "+ch+" "+c);
	}
}
