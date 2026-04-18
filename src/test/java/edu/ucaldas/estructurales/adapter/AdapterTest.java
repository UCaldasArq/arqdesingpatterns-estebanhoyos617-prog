package edu.ucaldas.estructurales.adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdapterTest {

    @Test
    void debeConvertirXMLaJSON() {
        XMLService xmlService = new XMLService();
        JSONService adapter = new XMLtoJSONAdapter(xmlService);

        String resultado = adapter.getJSON();

        assertNotNull(resultado);
        assertTrue(resultado.contains("\"nombre\""));
        assertTrue(resultado.contains("\"edad\""));
        assertTrue(resultado.contains("Juan"));
        assertTrue(resultado.contains("30"));
    }

    @Test
    void debeImplementarJSONService() {
        XMLService xmlService = new XMLService();
        JSONService adapter = new XMLtoJSONAdapter(xmlService);

        assertInstanceOf(JSONService.class, adapter);
    }
}
