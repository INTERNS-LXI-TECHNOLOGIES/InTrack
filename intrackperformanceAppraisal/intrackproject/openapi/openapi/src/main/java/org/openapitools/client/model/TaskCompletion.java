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
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.client.model.Intern;

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
 * TaskCompletion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-01T19:18:12.247642800+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class TaskCompletion {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_TASK_NAME = "taskName";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName;

  public static final String SERIALIZED_NAME_COMPLETED = "completed";
  @SerializedName(SERIALIZED_NAME_COMPLETED)
  private Boolean completed;

  public static final String SERIALIZED_NAME_COMPLETION_DATE = "completionDate";
  @SerializedName(SERIALIZED_NAME_COMPLETION_DATE)
  private LocalDate completionDate;

  public static final String SERIALIZED_NAME_INTERN = "intern";
  @SerializedName(SERIALIZED_NAME_INTERN)
  private Intern intern;

  public TaskCompletion() {
  }

  public TaskCompletion id(Long id) {
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


  public TaskCompletion taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

  /**
   * Get taskName
   * @return taskName
   */
  @javax.annotation.Nullable
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }


  public TaskCompletion completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Get completed
   * @return completed
   */
  @javax.annotation.Nullable
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }


  public TaskCompletion completionDate(LocalDate completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Get completionDate
   * @return completionDate
   */
  @javax.annotation.Nullable
  public LocalDate getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(LocalDate completionDate) {
    this.completionDate = completionDate;
  }


  public TaskCompletion intern(Intern intern) {
    this.intern = intern;
    return this;
  }

  /**
   * Get intern
   * @return intern
   */
  @javax.annotation.Nullable
  public Intern getIntern() {
    return intern;
  }

  public void setIntern(Intern intern) {
    this.intern = intern;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskCompletion taskCompletion = (TaskCompletion) o;
    return Objects.equals(this.id, taskCompletion.id) &&
        Objects.equals(this.taskName, taskCompletion.taskName) &&
        Objects.equals(this.completed, taskCompletion.completed) &&
        Objects.equals(this.completionDate, taskCompletion.completionDate) &&
        Objects.equals(this.intern, taskCompletion.intern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, taskName, completed, completionDate, intern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskCompletion {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    intern: ").append(toIndentedString(intern)).append("\n");
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
    openapiFields.add("taskName");
    openapiFields.add("completed");
    openapiFields.add("completionDate");
    openapiFields.add("intern");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TaskCompletion
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TaskCompletion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskCompletion is not found in the empty JSON string", TaskCompletion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TaskCompletion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TaskCompletion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("taskName") != null && !jsonObj.get("taskName").isJsonNull()) && !jsonObj.get("taskName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taskName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taskName").toString()));
      }
      // validate the optional field `intern`
      if (jsonObj.get("intern") != null && !jsonObj.get("intern").isJsonNull()) {
        Intern.validateJsonElement(jsonObj.get("intern"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskCompletion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskCompletion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskCompletion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskCompletion.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskCompletion>() {
           @Override
           public void write(JsonWriter out, TaskCompletion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaskCompletion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TaskCompletion given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TaskCompletion
   * @throws IOException if the JSON string is invalid with respect to TaskCompletion
   */
  public static TaskCompletion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskCompletion.class);
  }

  /**
   * Convert an instance of TaskCompletion to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

