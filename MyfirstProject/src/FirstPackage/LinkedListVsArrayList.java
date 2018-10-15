package FirstPackage;

/*1.LinkedList element insertion is faster compared to ArrayList 
 * 
 * 2.ArrayList search operation is pretty fast compared to linkedList search
 * operation. 
 * LinkeList doesn't provide random or index based access and you need to 
 * iterate over linked list to retrieve any element.
 * 
 * 3. LinkedList element deletion is faster compared to ArrayList.
 * 
 * 4. linkedList has more memory overhead than ArrayList because in ArrayList each
 * index only holds actual object but in case on linkedList each node holds both
 * data and address of next and previous node.
 */

import java.util.ArrayList;
import java.util.LinkedList;
public class LinkedListVsArrayList {

	
	public static void main(String[] args)
	{
	long n=(long) 1E7;
	
	ArrayList arrayList =new ArrayList();
	long milis = System.currentTimeMillis();
	for(int i=0;i<n;i++){
	    arrayList.add(i);
	}
    System.out.println("Insert ArrayList Takes "+(System.currentTimeMillis()-milis)+" ms");
    
    LinkedList linkedList=new LinkedList();
    milis=System.currentTimeMillis();
    for(int i=0;i<n;i++){
        linkedList.add(i);
    }
    System.out.println("Insert LinkedList Takes "+(System.currentTimeMillis()-milis)+" ms");
    
    milis=System.currentTimeMillis();
    arrayList.remove(0);
    System.out.println("del front ArrayList takes "+(System.currentTimeMillis()-milis)+" ms");
    
    milis=System.currentTimeMillis();
    linkedList.remove(0);
    System.out.println("del front LinkedList takes "+(System.currentTimeMillis()-milis)+" ms");
    
    milis=System.currentTimeMillis();
    arrayList.get((int)n/2);
    System.out.println("get front ArrayList takes "+(System.currentTimeMillis()-milis)+" ms");
    
    milis=System.currentTimeMillis();
    linkedList.get((int)n/2);
    System.out.println("get front LinkedList takes "+(System.currentTimeMillis()-milis)+" ms");
 }
	
	
	
	
	
}











