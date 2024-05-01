class Solution {
    public String reversePrefix(String word, char ch) {
	    char arr[] = new char[word.length()];
	    int c = 0;; 
	    for (int i=0;i<word.length();i++){
	        if ((word.charAt(i))==ch){
	            c=i;
	            break;
	        }
	        
	    }
	    for (int j=c;j>=0;j--){
	        arr[c-j]=word.charAt(j);
	    }
	    for (int k=c+1;k<word.length();k++){
	        arr[k]=word.charAt(k);
	    }
	    String str = new String(arr); 
	    return str;
        
    }
}