/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.run.v1beta1.model;

/**
 * CustomResourceDefinition represents a resource that should be exposed on the API server.  Its
 * name MUST be in the format <.spec.name>.<.spec.group>.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomResourceDefinition extends com.google.api.client.json.GenericJson {

  /**
   * The API version for this call such as "k8s.apiextensions.io/v1beta1".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiVersion;

  /**
   * The kind of resource, in this case always "CustomResourceDefinition".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Metadata associated with this CustomResourceDefinition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ObjectMeta metadata;

  /**
   * Spec describes how the user wants the resources to appear
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomResourceDefinitionSpec spec;

  /**
   * The API version for this call such as "k8s.apiextensions.io/v1beta1".
   * @return value or {@code null} for none
   */
  public java.lang.String getApiVersion() {
    return apiVersion;
  }

  /**
   * The API version for this call such as "k8s.apiextensions.io/v1beta1".
   * @param apiVersion apiVersion or {@code null} for none
   */
  public CustomResourceDefinition setApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * The kind of resource, in this case always "CustomResourceDefinition".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of resource, in this case always "CustomResourceDefinition".
   * @param kind kind or {@code null} for none
   */
  public CustomResourceDefinition setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Metadata associated with this CustomResourceDefinition.
   * @return value or {@code null} for none
   */
  public ObjectMeta getMetadata() {
    return metadata;
  }

  /**
   * Metadata associated with this CustomResourceDefinition.
   * @param metadata metadata or {@code null} for none
   */
  public CustomResourceDefinition setMetadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Spec describes how the user wants the resources to appear
   * @return value or {@code null} for none
   */
  public CustomResourceDefinitionSpec getSpec() {
    return spec;
  }

  /**
   * Spec describes how the user wants the resources to appear
   * @param spec spec or {@code null} for none
   */
  public CustomResourceDefinition setSpec(CustomResourceDefinitionSpec spec) {
    this.spec = spec;
    return this;
  }

  @Override
  public CustomResourceDefinition set(String fieldName, Object value) {
    return (CustomResourceDefinition) super.set(fieldName, value);
  }

  @Override
  public CustomResourceDefinition clone() {
    return (CustomResourceDefinition) super.clone();
  }

}
