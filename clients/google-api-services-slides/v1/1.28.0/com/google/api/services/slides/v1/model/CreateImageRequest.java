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

package com.google.api.services.slides.v1.model;

/**
 * Creates an image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateImageRequest extends com.google.api.client.json.GenericJson {

  /**
   * The element properties for the image.
   *
   * When the aspect ratio of the provided size does not match the image aspect ratio, the image is
   * scaled and centered with respect to the size in order to maintain aspect ratio. The provided
   * transform is applied after this operation.
   *
   * The PageElementProperties.size property is optional. If you don't specify the size, the default
   * size of the image is used.
   *
   * The PageElementProperties.transform property is optional. If you don't specify a transform, the
   * image will be placed at the top left corner of the page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PageElementProperties elementProperties;

  /**
   * A user-supplied object ID.
   *
   * If you specify an ID, it must be unique among all pages and page elements in the presentation.
   * The ID must start with an alphanumeric character or an underscore (matches regex
   * `[a-zA-Z0-9_]`); remaining characters may include those as well as a hyphen or colon (matches
   * regex `[a-zA-Z0-9_-:]`). The length of the ID must not be less than 5 or greater than 50.
   *
   * If you don't specify an ID, a unique one is generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectId;

  /**
   * The image URL.
   *
   * The image is fetched once at insertion time and a copy is stored for display inside the
   * presentation. Images must be less than 50MB in size, cannot exceed 25 megapixels, and must be
   * in one of PNG, JPEG, or GIF format.
   *
   * The provided URL can be at most 2 kB in length. The URL itself is saved with the image, and
   * exposed via the Image.source_url field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The element properties for the image.
   *
   * When the aspect ratio of the provided size does not match the image aspect ratio, the image is
   * scaled and centered with respect to the size in order to maintain aspect ratio. The provided
   * transform is applied after this operation.
   *
   * The PageElementProperties.size property is optional. If you don't specify the size, the default
   * size of the image is used.
   *
   * The PageElementProperties.transform property is optional. If you don't specify a transform, the
   * image will be placed at the top left corner of the page.
   * @return value or {@code null} for none
   */
  public PageElementProperties getElementProperties() {
    return elementProperties;
  }

  /**
   * The element properties for the image.
   *
   * When the aspect ratio of the provided size does not match the image aspect ratio, the image is
   * scaled and centered with respect to the size in order to maintain aspect ratio. The provided
   * transform is applied after this operation.
   *
   * The PageElementProperties.size property is optional. If you don't specify the size, the default
   * size of the image is used.
   *
   * The PageElementProperties.transform property is optional. If you don't specify a transform, the
   * image will be placed at the top left corner of the page.
   * @param elementProperties elementProperties or {@code null} for none
   */
  public CreateImageRequest setElementProperties(PageElementProperties elementProperties) {
    this.elementProperties = elementProperties;
    return this;
  }

  /**
   * A user-supplied object ID.
   *
   * If you specify an ID, it must be unique among all pages and page elements in the presentation.
   * The ID must start with an alphanumeric character or an underscore (matches regex
   * `[a-zA-Z0-9_]`); remaining characters may include those as well as a hyphen or colon (matches
   * regex `[a-zA-Z0-9_-:]`). The length of the ID must not be less than 5 or greater than 50.
   *
   * If you don't specify an ID, a unique one is generated.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectId() {
    return objectId;
  }

  /**
   * A user-supplied object ID.
   *
   * If you specify an ID, it must be unique among all pages and page elements in the presentation.
   * The ID must start with an alphanumeric character or an underscore (matches regex
   * `[a-zA-Z0-9_]`); remaining characters may include those as well as a hyphen or colon (matches
   * regex `[a-zA-Z0-9_-:]`). The length of the ID must not be less than 5 or greater than 50.
   *
   * If you don't specify an ID, a unique one is generated.
   * @param objectId objectId or {@code null} for none
   */
  public CreateImageRequest setObjectId(java.lang.String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * The image URL.
   *
   * The image is fetched once at insertion time and a copy is stored for display inside the
   * presentation. Images must be less than 50MB in size, cannot exceed 25 megapixels, and must be
   * in one of PNG, JPEG, or GIF format.
   *
   * The provided URL can be at most 2 kB in length. The URL itself is saved with the image, and
   * exposed via the Image.source_url field.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The image URL.
   *
   * The image is fetched once at insertion time and a copy is stored for display inside the
   * presentation. Images must be less than 50MB in size, cannot exceed 25 megapixels, and must be
   * in one of PNG, JPEG, or GIF format.
   *
   * The provided URL can be at most 2 kB in length. The URL itself is saved with the image, and
   * exposed via the Image.source_url field.
   * @param url url or {@code null} for none
   */
  public CreateImageRequest setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public CreateImageRequest set(String fieldName, Object value) {
    return (CreateImageRequest) super.set(fieldName, value);
  }

  @Override
  public CreateImageRequest clone() {
    return (CreateImageRequest) super.clone();
  }

}