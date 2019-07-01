package com.tts.BlackInfiniti;


import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {


    @GetMapping("/hello-world")
    @ResponseBody
    public String sayHello() {
    	JSONArray jsonArray = new JSONArray();
    	JSONObject jsonObject1 = new JSONObject();
    	JSONObject jsonObject2 = new JSONObject();
    	
    	JSONObject clientObject1 = new JSONObject();
    	JSONObject clientObject2 = new JSONObject();
    	clientObject1.append("id", 1);
    	clientObject2.append("id", 2);
    	
    	jsonObject1.append("saleRequestID", 1);
    	jsonObject1.append("client", clientObject1);
    	
    	jsonObject2.append("saleRequestID", 2);
    	jsonObject2.append("client", clientObject2);
    	
    	jsonArray.put(jsonObject1);
    	jsonArray.put(jsonObject2);
    	
        return jsonArray.toString();
    }

}