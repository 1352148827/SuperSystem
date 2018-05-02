package com.nlzh.core.vo;

import java.io.IOException;  

import com.fasterxml.jackson.core.JsonGenerator;  
import com.fasterxml.jackson.core.JsonProcessingException;  
import com.fasterxml.jackson.databind.JsonSerializer;  
import com.fasterxml.jackson.databind.ObjectMapper;  
import com.fasterxml.jackson.databind.SerializerProvider;  
/**
 * 转null对象为空字符串
 * @author 13521
 *
 */
public class JsonObjectMapper extends ObjectMapper{
	 private static final long serialVersionUID = 1L;  
	   
    public JsonObjectMapper() {  
        super();  
        // 空值处理为空串  
        this.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {  
            @Override 
            public void serialize(Object value, JsonGenerator jg, SerializerProvider sp) throws IOException, JsonProcessingException {  
                jg.writeString("");  
            }  
        });  
    }  
}