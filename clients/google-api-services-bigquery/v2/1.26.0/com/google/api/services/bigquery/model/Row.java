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

package com.google.api.services.bigquery.model;

/**
 * A single row in the confusion matrix.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Row extends com.google.api.client.json.GenericJson {

  /**
   * The original label of this row.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String actualLabel;

  /**
   * Info describing predicted label distribution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BigqueryEntry> entries;

  static {
    // hack to force ProGuard to consider BigqueryEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BigqueryEntry.class);
  }

  /**
   * The original label of this row.
   * @return value or {@code null} for none
   */
  public java.lang.String getActualLabel() {
    return actualLabel;
  }

  /**
   * The original label of this row.
   * @param actualLabel actualLabel or {@code null} for none
   */
  public Row setActualLabel(java.lang.String actualLabel) {
    this.actualLabel = actualLabel;
    return this;
  }

  /**
   * Info describing predicted label distribution.
   * @return value or {@code null} for none
   */
  public java.util.List<BigqueryEntry> getEntries() {
    return entries;
  }

  /**
   * Info describing predicted label distribution.
   * @param entries entries or {@code null} for none
   */
  public Row setEntries(java.util.List<BigqueryEntry> entries) {
    this.entries = entries;
    return this;
  }

  @Override
  public Row set(String fieldName, Object value) {
    return (Row) super.set(fieldName, value);
  }

  @Override
  public Row clone() {
    return (Row) super.clone();
  }

}