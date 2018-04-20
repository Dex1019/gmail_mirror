package com.example.dex.gmailmirror.network;

import com.example.dex.gmailmirror.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dex on 20/4/18.
 */

public interface ApiInterface {

    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
