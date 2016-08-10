package com.sqq.nioclient.rxbus;

/**
 * Created by sqq on 2016/8/5.
 */
public class GetResponseEvent {

    String response;

    public GetResponseEvent(String response){
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
