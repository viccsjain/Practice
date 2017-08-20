package Amazon;

public class RemoveCharacters {
	
	// Driver Method
    public static void main(String[] args)
    {
        String str = "Hi Vikram Chhajer";
        String mask_str = "jain";
        System.out.println(removeDirtyChars(str, mask_str));
    }
    
    private static int[] getCharArrayCount(String mask){
    	int[] arr = new int[256];
    	int len = mask.length();
    	for(int i=0;i<len;i++){
    		arr[mask.charAt(i)]++;
    	}
    	return arr;
    }

	private static String removeDirtyChars(String str, String mask_str) {
		int[] count = getCharArrayCount(mask_str);
		char arr[]=new char[str.length()];
		int res=0;
		int temp;
		for(int i=0;i<str.length();i++){
			temp = str.charAt(i);
			if(count[temp] == 0){
				arr[res] = str.charAt(i);
				res++;
			}
		}
		String result = String.copyValueOf(arr);
		//System.out.println(result);
		return result;
	}

}
