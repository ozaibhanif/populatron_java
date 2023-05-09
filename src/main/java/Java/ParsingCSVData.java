import java.util.LinkedList;
import java.util.List;


public class ParsingCSVData {

	private List<String> popText;

	public ParsingCSVData(List<String> data) {
		popText = new LinkedList<>();
		for (int i = 1; i < data.size(); i++) {
			String line = data.get(i);
			String[] terms = line.split(",");
			popText.add(terms[4]);
		}

		

	}

	public List<String> getPopText(){
		return popText;
	}

}