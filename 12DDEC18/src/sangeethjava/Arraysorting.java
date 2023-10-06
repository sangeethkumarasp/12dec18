package sangeethjava;

public class Arraysorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {6,8,1,9};
		
		int temp=0;
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		
		for(int a :arr)
		{
			System.out.println(a);
		}
	}

}
