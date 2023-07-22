package structural_design_pattern.adapter.Example1;

public class Client {
    public static void main(String[] args) {
         // Using the adapters to convert JSON to XML and XML to JSON
         Adapter jsonToXMLAdapter = new JSONtoXMLAdapter();
         Adapter xmlToJSONAdapter = new XMLtoJSONAdapter();
 
         String jsonData = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
         String xmlData = "<person><name>John</name><age>30</age><city>New York</city></person>";
 
         jsonToXMLAdapter.convertData(jsonData);
         xmlToJSONAdapter.convertData(xmlData);

    }
}
