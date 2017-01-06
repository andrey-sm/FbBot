package com.hyurumi.fb_bot_boilerplate.api.rs;


import com.google.gson.annotations.SerializedName;

public class ApiBotResponse {
    @SerializedName("convo_id")
    public String conversationId;
    public String userSay;
    public String botSay;
}
