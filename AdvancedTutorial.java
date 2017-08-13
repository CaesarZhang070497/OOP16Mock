import java.util.ArrayList;
import java.util.HashMap;

public class AdvancedTutorial extends Tutorial{
	private String topic;

	public AdvancedTutorial(String topic, String tutor,String time) {
		super(tutor, time);
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "Topic: " + topic + " "+super.toString();
	}
	
	public boolean couldCombineWith(AdvancedTutorial advancedtutorial){
		if(advancedtutorial.getTime().equals(this.getTime()) && advancedtutorial.topic.equals(this.topic)){
			return true;
		}
		return false;
	}
	
	public static HashMap<String, ArrayList<AdvancedTutorial>> construct(String[] strs){
		HashMap<String, ArrayList<AdvancedTutorial>> result = new HashMap<String, ArrayList<AdvancedTutorial>>();
		ArrayList<AdvancedTutorial> tutorials = new ArrayList<AdvancedTutorial>();
		
		for(int i = 0;i<strs.length/3;i ++){
			
			AdvancedTutorial a = new AdvancedTutorial(strs[i*3],strs[i*3+1],strs[i*3+2]);
			tutorials.add(a);
		}
	
		
		ArrayList<String> b = new ArrayList<String>();
		for(int i = 0;i<strs.length;i = i+3){
			b.add(strs[i]);
		}
		
		
		for(String str :b){
			
			ArrayList<AdvancedTutorial> d = new ArrayList<AdvancedTutorial>();
			for(AdvancedTutorial c : tutorials){
				
				if(str.equals(c.topic)){
					
					d.add(c);
				}
				
			}
			result.put(str, d);
			
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		if(args.length %3 != 0 || args.length<=0){
			System.out.println("Wrong number of arguments!");
		}
		else{
			System.out.println(construct(args));
			
		}
	}
}
