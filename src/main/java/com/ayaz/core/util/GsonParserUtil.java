
package com.ayaz.core.util;

import com.ayaz.core.misc.JsonConstants;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonParserUtil {

    private static final JsonParser parser = new JsonParser();

    public static String parseTransitionToJson(int transitionId) {
        JsonObject parent = new JsonObject();
        JsonObject transitionObject = new JsonObject();
        transitionObject.addProperty(JsonConstants.PROP_ID, transitionId);
        parent.add(JsonConstants.ELEM_TRANSITION, transitionObject);
        return new Gson().toJson(parent);
    }
}
