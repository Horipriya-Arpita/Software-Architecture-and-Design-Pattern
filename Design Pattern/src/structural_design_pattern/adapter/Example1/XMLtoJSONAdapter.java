package structural_design_pattern.adapter.Example1;

public class XMLtoJSONAdapter implements Adapter{

    @Override
    public void convertData(String xmlData) {
        // Perform XML to JSON conversion (Not implemented)
        System.out.println("Converted XML to JSON: " + xmlData);
    }
    
}
