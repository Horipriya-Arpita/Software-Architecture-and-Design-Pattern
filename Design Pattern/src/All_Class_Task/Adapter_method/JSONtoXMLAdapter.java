package All_Class_Task.Adapter_method;

public class JSONtoXMLAdapter implements IAdapter{
    
    private JSON json;
    public JSONtoXMLAdapter(JSON json){
        this.json = json;
    }

    @Override
    public XML convert(Object data) {
        System.out.println("JSON to XML conversion....");
        return this.json.convertToXML();
    }
    
}
