// Name: Nitesh Chaudhary
// Student no: 2226601
import java.util.*;

public class mergesort_np03cs4s220105 {
		 Scanner sc = new Scanner(System.in);

	 	 	ArrayList <Integer> getInput() {
			// TAKING INPUT AS ARRAYLIST FROM USER
			ArrayList<Integer>numbArr = new ArrayList<Integer>();
			System.out.print("Enter array size: ");
			int n = sc.nextInt();

			for(int i=0;i<n;i++){
				System.out.print("Enter number: ");
				int num = sc.nextInt();
				numbArr.add(num);
			}
			return numbArr;
		}
	
	void getOutput(ArrayList<Integer> al) {
		// OUTPUT THE SORTED ARRAY
		System.out.print("Sorted array= "+al);
	}
	
	void merge(ArrayList<Integer> al,int beg, int mid, int end){
		// MERGE THE SORTED ARRAYLIST

		ArrayList<Integer> merged = new ArrayList<Integer>();
		int p = beg;
	    int q = mid+1;
        int r = 0;

		while(p<=mid&&q<=end){
			if(al.get(p) <= al.get(q)){
				merged.add(r,al.get(p));
				p++;
				r++;
			}else{
				merged.add(r,al.get(q));
				q++;
				r++;
			}
		}
		while(p<=mid){
			merged.add(r,al.get(p));
			p++;
			r++;
		}
		while(q<=end){ 
			merged.add(r,al.get(q));
			q++; r++;
		}    
		for(int i = 0, j  = beg; i<merged.size(); i++,j++){
			    al.set(j, merged.get(i));
        }
	}

	void sort(ArrayList<Integer> al, int beg, int end) {
		// SORTING AND DIVIDING THE ARRAYLIST

		if(beg >= end){
            return;
        }
		int mid = beg+(end-beg)/2;
		sort(al,beg,mid);
		sort(al,mid+1,end);
		merge(al,beg,mid,end);
	}

	public static void main(String[] args) {
		mergesort_np03cs4s220105 m = new mergesort_np03cs4s220105();
		ArrayList<Integer> n = m.getInput(); //assigning the input arraylist to n arraylist
		int arraySize = n.size(); //assigning the length of n array to arraySize
		m.sort(n, 0, arraySize-1); //sorting the n array
		m.getOutput(n); // printing the sorted array

	}
}
  
