/*
 * Gotify REST-API.
 * This is the documentation of the Gotify REST-API.  # Authentication In Gotify there are two token types: __clientToken__: a client is something that receives message and manages stuff like creating new tokens or delete messages. (f.ex this token should be used for an android app) __appToken__: an application is something that sends messages (f.ex. this token should be used for a shell script)  The token can be either transmitted through a header named `X-Gotify-Key` or a query parameter named `token`. There is also the possibility to authenticate through basic auth, this should only be used for creating a clientToken.  \\---  Found a bug or have some questions? [Create an issue on GitHub](https://github.com/gotify/server/issues)
 *
 * OpenAPI spec version: 1.0.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.gotify.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * The Message holds information about a message which was sent by an Application.
 */
@ApiModel(description = "The Message holds information about a message which was sent by an Application.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-27T16:51:12.097+02:00")
public class Message {
  @SerializedName("appid")
  private Integer appid = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("priority")
  private Long priority = null;

  @SerializedName("title")
  private String title = null;

   /**
   * The application id that send this message.
   * @return appid
  **/
  @ApiModelProperty(example = "5", required = true, value = "The application id that send this message.")
  public Integer getAppid() {
    return appid;
  }

   /**
   * The date the message was created.
   * @return date
  **/
  @ApiModelProperty(example = "2018-02-27T19:36:10.5045044+01:00", required = true, value = "The date the message was created.")
  public OffsetDateTime getDate() {
    return date;
  }

   /**
   * The message id.
   * @return id
  **/
  @ApiModelProperty(example = "25", required = true, value = "The message id.")
  public Integer getId() {
    return id;
  }

  public Message message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The actual message.
   * @return message
  **/
  @ApiModelProperty(example = "Backup was successfully finished.", required = true, value = "The actual message.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Message priority(Long priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority of the message.
   * @return priority
  **/
  @ApiModelProperty(example = "2", value = "The priority of the message.")
  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public Message title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the message.
   * @return title
  **/
  @ApiModelProperty(example = "Backup", required = true, value = "The title of the message.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.appid, message.appid) &&
        Objects.equals(this.date, message.date) &&
        Objects.equals(this.id, message.id) &&
        Objects.equals(this.message, message.message) &&
        Objects.equals(this.priority, message.priority) &&
        Objects.equals(this.title, message.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appid, date, id, message, priority, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

