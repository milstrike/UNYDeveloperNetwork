package setterGetter;

public class GeneralVariable {
	private String inputText = "";
	
	
	public void setText(String text) {
		inputText = text;
	}
	
	public String getText(){
		return inputText;
	}
}
