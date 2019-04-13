package pl.mirek.tools;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class ShowInputValues {

    private Map<String, String[]> inputValues;

    public ShowInputValues(HttpServletRequest request) {
        this.inputValues = request.getParameterMap();
    }

    public void printInputValues (){
        for (Map.Entry<String, String[]> e : this.inputValues.entrySet()){

            System.out.println(e.getKey() + " -->");

            String[] arrayValues = e.getValue();
            int arrayLength = arrayValues.length;
            if (arrayLength > 0) {
                for (int i = 0; i < arrayLength; i++){
                    System.out.println(" --> " + arrayValues[i]);
                }
            }
        }
    }
}
