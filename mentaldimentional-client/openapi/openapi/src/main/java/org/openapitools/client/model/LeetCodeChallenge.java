/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * LeetCodeChallenge
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-23T20:17:01.450021+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class LeetCodeChallenge {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXPECTED_SOLUTION = "expectedSolution";
  @SerializedName(SERIALIZED_NAME_EXPECTED_SOLUTION)
  private String expectedSolution;

  public LeetCodeChallenge() {
  }

  public LeetCodeChallenge id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public LeetCodeChallenge title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public LeetCodeChallenge description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public LeetCodeChallenge expectedSolution(String expectedSolution) {
    this.expectedSolution = expectedSolution;
    return this;
  }

  /**
   * Get expectedSolution
   * @return expectedSolution
   */
  @javax.annotation.Nullable
  public String getExpectedSolution() {
    return expectedSolution;
  }

  public void setExpectedSolution(String expectedSolution) {
    this.expectedSolution = expectedSolution;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeetCodeChallenge leetCodeChallenge = (LeetCodeChallenge) o;
    return Objects.equals(this.id, leetCodeChallenge.id) &&
        Objects.equals(this.title, leetCodeChallenge.title) &&
        Objects.equals(this.description, leetCodeChallenge.description) &&
        Objects.equals(this.expectedSolution, leetCodeChallenge.expectedSolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, expectedSolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeetCodeChallenge {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedSolution: ").append(toIndentedString(expectedSolution)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("expectedSolution");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LeetCodeChallenge
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LeetCodeChallenge.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LeetCodeChallenge is not found in the empty JSON string", LeetCodeChallenge.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LeetCodeChallenge.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LeetCodeChallenge` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("expectedSolution") != null && !jsonObj.get("expectedSolution").isJsonNull()) && !jsonObj.get("expectedSolution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expectedSolution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expectedSolution").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LeetCodeChallenge.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LeetCodeChallenge' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LeetCodeChallenge> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LeetCodeChallenge.class));

       return (TypeAdapter<T>) new TypeAdapter<LeetCodeChallenge>() {
           @Override
           public void write(JsonWriter out, LeetCodeChallenge value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LeetCodeChallenge read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LeetCodeChallenge given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LeetCodeChallenge
   * @throws IOException if the JSON string is invalid with respect to LeetCodeChallenge
   */
  public static LeetCodeChallenge fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LeetCodeChallenge.class);
  }

  /**
   * Convert an instance of LeetCodeChallenge to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

