package io.swagger.client.auth;

import io.swagger.client.Pair;
import sun.misc.BASE64Encoder;

import java.util.Map;
import java.util.List;

import java.io.UnsupportedEncodingException;
//import javax.xml.bind.DatatypeConverter;

// Comment:: @javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-12T08:17:22.778+02:00")
public class HttpBasicAuth implements Authentication {
  private String username;
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    String str = (username == null ? "" : username) + ":" + (password == null ? "" : password);
    try {

      headerParams.put("Authorization", "Basic " + new BASE64Encoder().encode(str.getBytes("UTF-8")));
    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
  }
}
