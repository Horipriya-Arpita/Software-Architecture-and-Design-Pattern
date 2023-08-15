package All_Class_Task.Adapter_method;

public class Client {
    public static void main(String[] args) {
        JSON json = new JSON("json data");
        IAdapter iAdapter = new JSONtoXMLAdapter(json);
        XML JsonXml = iAdapter.convert(json);
        JsonXml.xmlconvert();

        Protobuf protobuf = new Protobuf("protobuf data");
        IAdapter iAdapter2 = new ProtobufToXmlAdapter(protobuf);
        XML protobufXml =iAdapter2.convert(protobuf);
        protobufXml.xmlconvert();
    }
}
