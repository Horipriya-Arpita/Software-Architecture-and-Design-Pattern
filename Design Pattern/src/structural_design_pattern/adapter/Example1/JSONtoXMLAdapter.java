package structural_design_pattern.adapter.Example1;

public class JSONtoXMLAdapter implements Adapter{
    
    @Override
    public void convertData(String jsonData) {
        // Perform JSON to XML conversion (Not implemented)
        System.out.println("Converted JSON to XML: " + jsonData);
    }
    
}
