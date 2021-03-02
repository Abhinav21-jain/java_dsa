//WAP to count the number of objects
class abhinav{
	int count = 0;
	abhinav(int c){
		count = c;
		count++;	
		System.out.println(count);
	}
}

public class  count_obj {
    public static void main(String[] args) {
	abhinav obj1 = new abhinav(0);
        	abhinav obj2 = new abhinav(obj1.count);
	abhinav obj3 = new abhinav(obj2.count);
	abhinav obj4 = new abhinav(obj3.count);
    }
}