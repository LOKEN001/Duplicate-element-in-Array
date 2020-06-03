import java.util.HashSet;

public class DuplicatesInArray {

	public static void main(String[] args) {
		String arr[] = {"java","pyhon","c++","java","c++"};
        boolean flag = false;
        /*for(int i=0; i<arr.length;i++) {
        	for(int j=i+1; j<arr.length;j++) {
        		if(arr[i]==arr[i+1]) {
        			System.out.println("Duplicates found at:"+i);
        			flag = true;
        		}
        	}
        }
        if(flag == false) {
        	System.out.println("Duplicates not found" );
        	
        
        }*/
        HashSet <String> lang = new HashSet();
        for(String l : arr) {
        	if(lang.add(l)==false) {
        		System.out.println("Duplicates found at:"+l);
        		flag = true;
        	}
        }
        if(flag==false) {
        	System.out.println("Duplicates not found");
        	
        }
	}

}
