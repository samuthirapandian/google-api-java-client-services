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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * The set of metrics that are measured in numbers of impressions, representing how many impressions
 * with the specified dimension values were considered eligible at each stage of the bidding funnel.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImpressionMetricsRow extends com.google.api.client.json.GenericJson {

  /**
   * The number of impressions available to the buyer on Ad Exchange. In some cases this value may
   * be unavailable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricValue availableImpressions;

  /**
   * The number of impressions for which Ad Exchange sent the buyer a bid request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricValue bidRequests;

  /**
   * The number of impressions that match the buyer's inventory pretargeting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricValue inventoryMatches;

  /**
   * The number of impressions for which Ad Exchange received a response from the buyer that
   * contained at least one applicable bid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricValue responsesWithBids;

  /**
   * The values of all dimensions associated with metric values in this row.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RowDimensions rowDimensions;

  /**
   * The number of impressions for which the buyer successfully sent a response to Ad Exchange.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricValue successfulResponses;

  /**
   * The number of impressions available to the buyer on Ad Exchange. In some cases this value may
   * be unavailable.
   * @return value or {@code null} for none
   */
  public MetricValue getAvailableImpressions() {
    return availableImpressions;
  }

  /**
   * The number of impressions available to the buyer on Ad Exchange. In some cases this value may
   * be unavailable.
   * @param availableImpressions availableImpressions or {@code null} for none
   */
  public ImpressionMetricsRow setAvailableImpressions(MetricValue availableImpressions) {
    this.availableImpressions = availableImpressions;
    return this;
  }

  /**
   * The number of impressions for which Ad Exchange sent the buyer a bid request.
   * @return value or {@code null} for none
   */
  public MetricValue getBidRequests() {
    return bidRequests;
  }

  /**
   * The number of impressions for which Ad Exchange sent the buyer a bid request.
   * @param bidRequests bidRequests or {@code null} for none
   */
  public ImpressionMetricsRow setBidRequests(MetricValue bidRequests) {
    this.bidRequests = bidRequests;
    return this;
  }

  /**
   * The number of impressions that match the buyer's inventory pretargeting.
   * @return value or {@code null} for none
   */
  public MetricValue getInventoryMatches() {
    return inventoryMatches;
  }

  /**
   * The number of impressions that match the buyer's inventory pretargeting.
   * @param inventoryMatches inventoryMatches or {@code null} for none
   */
  public ImpressionMetricsRow setInventoryMatches(MetricValue inventoryMatches) {
    this.inventoryMatches = inventoryMatches;
    return this;
  }

  /**
   * The number of impressions for which Ad Exchange received a response from the buyer that
   * contained at least one applicable bid.
   * @return value or {@code null} for none
   */
  public MetricValue getResponsesWithBids() {
    return responsesWithBids;
  }

  /**
   * The number of impressions for which Ad Exchange received a response from the buyer that
   * contained at least one applicable bid.
   * @param responsesWithBids responsesWithBids or {@code null} for none
   */
  public ImpressionMetricsRow setResponsesWithBids(MetricValue responsesWithBids) {
    this.responsesWithBids = responsesWithBids;
    return this;
  }

  /**
   * The values of all dimensions associated with metric values in this row.
   * @return value or {@code null} for none
   */
  public RowDimensions getRowDimensions() {
    return rowDimensions;
  }

  /**
   * The values of all dimensions associated with metric values in this row.
   * @param rowDimensions rowDimensions or {@code null} for none
   */
  public ImpressionMetricsRow setRowDimensions(RowDimensions rowDimensions) {
    this.rowDimensions = rowDimensions;
    return this;
  }

  /**
   * The number of impressions for which the buyer successfully sent a response to Ad Exchange.
   * @return value or {@code null} for none
   */
  public MetricValue getSuccessfulResponses() {
    return successfulResponses;
  }

  /**
   * The number of impressions for which the buyer successfully sent a response to Ad Exchange.
   * @param successfulResponses successfulResponses or {@code null} for none
   */
  public ImpressionMetricsRow setSuccessfulResponses(MetricValue successfulResponses) {
    this.successfulResponses = successfulResponses;
    return this;
  }

  @Override
  public ImpressionMetricsRow set(String fieldName, Object value) {
    return (ImpressionMetricsRow) super.set(fieldName, value);
  }

  @Override
  public ImpressionMetricsRow clone() {
    return (ImpressionMetricsRow) super.clone();
  }

}
