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

package com.google.api.services.appsactivity.model;

/**
 * An Activity resource is a combined view of multiple events. An activity has a list of individual
 * events and a combined view of the common fields among all events.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Activity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Activity extends com.google.api.client.json.GenericJson {

  /**
   * The fields common to all of the singleEvents that make up the Activity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Event combinedEvent;

  /**
   * A list of all the Events that make up the Activity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Event> singleEvents;

  /**
   * The fields common to all of the singleEvents that make up the Activity.
   * @return value or {@code null} for none
   */
  public Event getCombinedEvent() {
    return combinedEvent;
  }

  /**
   * The fields common to all of the singleEvents that make up the Activity.
   * @param combinedEvent combinedEvent or {@code null} for none
   */
  public Activity setCombinedEvent(Event combinedEvent) {
    this.combinedEvent = combinedEvent;
    return this;
  }

  /**
   * A list of all the Events that make up the Activity.
   * @return value or {@code null} for none
   */
  public java.util.List<Event> getSingleEvents() {
    return singleEvents;
  }

  /**
   * A list of all the Events that make up the Activity.
   * @param singleEvents singleEvents or {@code null} for none
   */
  public Activity setSingleEvents(java.util.List<Event> singleEvents) {
    this.singleEvents = singleEvents;
    return this;
  }

  @Override
  public Activity set(String fieldName, Object value) {
    return (Activity) super.set(fieldName, value);
  }

  @Override
  public Activity clone() {
    return (Activity) super.clone();
  }

}