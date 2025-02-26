package org.example;

import org.json.JSONObject;
import org.json.XML;

class JsonToXml {
    public static void main(String[] args) {
        String jsonData = "{\"name\":\"Tanya\",\"age\":24}";
        JSONObject jsonObject = new JSONObject(jsonData);
        String xml = XML.toString(jsonObject);
        System.out.println(xml);
    }
}
