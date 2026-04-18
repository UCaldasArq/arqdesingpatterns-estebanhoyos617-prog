package edu.ucaldas.estructurales.adapter;

public class XMLtoJSONAdapter implements JSONService {
    private XMLService xmlService;

    public XMLtoJSONAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public String getJSON() {
        String xml = xmlService.getXML();

        xml = xml.replaceAll("<usuario>", "{");
        xml = xml.replaceAll("</usuario>", "}");
        xml = xml.replaceAll("<nombre>(.*?)</nombre>", "\"nombre\": \"$1\",");
        xml = xml.replaceAll("<edad>(.*?)</edad>", "\"edad\": $1");

        return xml;
    }
}