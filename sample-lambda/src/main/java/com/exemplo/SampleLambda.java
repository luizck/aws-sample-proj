package com.exemplo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.IOUtils;

public class SampleLambda implements RequestStreamHandler  {
//public class SampleLambda implements RequestHandler<I, O> {

    private static final Gson gson = new GsonBuilder().create();
    private static final Logger LOG = LogManager.getLogger(SampleLambda.class.getName());

    @Override
    public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {

        Reader reader = new BufferedReader(new InputStreamReader(input));
        byte[] bytes = IOUtils.toByteArray(input);
        LOG.info(new String(bytes));

        Response response = new Response();
        response.body = "{\"resposta\": \"OK\"}";
        output.write(gson.toJson(response).getBytes());

    }
}
