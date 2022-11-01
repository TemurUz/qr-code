package temur.uz.listener.pin.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Card {
    @JsonProperty("jsonrpc")
    private String jsonrpc;
    @JsonProperty("id")
    private String id;
    @JsonProperty("error")
    private String error;
    @JsonProperty("result")
    private Object result;
}
