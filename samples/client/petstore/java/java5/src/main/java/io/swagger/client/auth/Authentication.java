package io.swagger.client.auth;

import io.swagger.client.Pair;

import java.util.Map;
import java.util.List;

// Generated by class io.swagger.codegen.languages.JavaClientCodegen on 2015-10-14T07:55:39.676+02:00
public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
