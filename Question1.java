import java.util.ArrayList;
import java.util.Arrays;

public class Question1 {
	public static ArrayList<Integer> cayley(){
		ArrayList<Integer> results = new ArrayList<Integer>();
		for(int i = 0;i<10;i++){
			for(int j = 0;j<10;j++){
				if(10*i+j == i*j+(i+j)){
					if(10*i+j>10){
						results.add(10*i+j);
					}
				}
			}
		}
		
		return results;
	}
	
	public static int[] countVowels(String[] str){
		int[] result = new int[str.length];
		for(int i = 0;i<str.length;i++){
			char[] chars = str[i].toCharArray();
				for(int j = 0;j<chars.length;j++){
					if(chars[j] == 'a'||chars[j] == 'e'||chars[j] == 'i'||chars[j] == 'o'||chars[j] == 'u'||chars[j] =='A'||chars[j] == 'E'||chars[j] == 'I'||chars[j] == 'I'||chars[j] == 'O'||chars[j] == 'U'){
						result[i]++;
					}
				}
		}
		return result;
	}
	
	public static String mostVowels(String[] strs){
		int[] numbers = countVowels(strs);
		int max = numbers[0];
		int maxindex = 0;
		for(int i = 0;i<numbers.length;i++){
			if(numbers[i]>max){
				max=numbers[i];
				maxindex = i;
			}
		}
		return strs[maxindex];
	}
	public static void main(String[] args) {
		System.out.println(cayley());
		System.out.println(args);
		System.out.println(mostVowels(args));
	}
}
