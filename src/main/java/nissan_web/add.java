package nissan_web;

public class add {
	
	public float addition(float numa, float numb) {
	    
	    return numa + numb;
	}

	public float addition(int numa, float numb) {
	    
	    return (float) numa + numb;
	}

	public float addition(float numa, int numb) {
	    
	    return numa + (float) numb;
	}

	public int addition(int numa, int numb) {
	    
	    return numa + numb;
	}
	
	
	public String addn(String input1, String input2) {

	    
		String ans="Invalid Input";
	    if (input1.indexOf(".") != -1 && input2.indexOf(".") != -1) {
	        try{
		    	float numa = Float.parseFloat(input1);
		        float numb = Float.parseFloat(input2);
		        float ans1=addition(numa, numb);
		        ans = Float.toString(ans1);
	        }
	        catch(Exception e){
	        	ans="Invalid Input";
	        }
	      
	    }

	    
	    else if (input1.indexOf(".") == -1 && input2.indexOf(".") != -1) {
	        try{
	        	int numa = Integer.parseInt(input1);
	        	float numb = Float.parseFloat(input2);
	        	float ans1 = addition(numa, numb); 
	        	ans = Float.toString(ans1);
	        }
	        catch(Exception e){
	        	ans="Invalid Input";
	        }
	    }

	    
	    else if (input1.indexOf(".") != -1 && input2.indexOf(".") == -1) {
	        try{
	        	float numa = Float.parseFloat(input1);
	        	int numb = Integer.parseInt(input2);
	        	float ans1 = addition(numa, numb);
	        	ans = Float.toString(ans1);
	        }
	        catch(Exception e){
	        	ans="Invalid Input";
	        }
	    }

	   
	    else if (input1.indexOf(".") == -1 && input2.indexOf(".") == -1) {
	        try{
	        	int numa = Integer.parseInt(input1);
	        	int numb = Integer.parseInt(input2);
	        	ans = Integer.toString(addition(numa, numb));
	        }
	        catch(Exception e){
	        	ans="Invalid Input";
	        }
	    }
	    return ans;
	}
	
	
	
	
	
}
