/*
 * crt.sh REST API
 * crt.sh REST API documentation by litetex
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package net.litetex.crtsh.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Certificate
 */
@JsonPropertyOrder({
  Certificate.JSON_PROPERTY_ISSUER_CA_ID,
  Certificate.JSON_PROPERTY_ISSUER_NAME,
  Certificate.JSON_PROPERTY_COMMON_NAME,
  Certificate.JSON_PROPERTY_NAME_VALUE,
  Certificate.JSON_PROPERTY_ID,
  Certificate.JSON_PROPERTY_ENTRY_TIMESTAMP,
  Certificate.JSON_PROPERTY_NOT_BEFORE,
  Certificate.JSON_PROPERTY_NOT_AFTER,
  Certificate.JSON_PROPERTY_SERIAL_NUMBER,
  Certificate.JSON_PROPERTY_RESULT_COUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Certificate {
  public static final String JSON_PROPERTY_ISSUER_CA_ID = "issuer_ca_id";
  private Long issuerCaId;

  public static final String JSON_PROPERTY_ISSUER_NAME = "issuer_name";
  private String issuerName;

  public static final String JSON_PROPERTY_COMMON_NAME = "common_name";
  private String commonName;

  public static final String JSON_PROPERTY_NAME_VALUE = "name_value";
  private String nameValue;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_ENTRY_TIMESTAMP = "entry_timestamp";
  private String entryTimestamp;

  public static final String JSON_PROPERTY_NOT_BEFORE = "not_before";
  private String notBefore;

  public static final String JSON_PROPERTY_NOT_AFTER = "not_after";
  private String notAfter;

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "serial_number";
  private String serialNumber;

  public static final String JSON_PROPERTY_RESULT_COUNT = "result_count";
  private BigDecimal resultCount;

  public Certificate() {
  }

  public Certificate issuerCaId(Long issuerCaId) {
    
    this.issuerCaId = issuerCaId;
    return this;
  }

   /**
   * Get issuerCaId
   * @return issuerCaId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUER_CA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIssuerCaId() {
    return issuerCaId;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER_CA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuerCaId(Long issuerCaId) {
    this.issuerCaId = issuerCaId;
  }


  public Certificate issuerName(String issuerName) {
    
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Get issuerName
   * @return issuerName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuerName() {
    return issuerName;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }


  public Certificate commonName(String commonName) {
    
    this.commonName = commonName;
    return this;
  }

   /**
   * Get commonName
   * @return commonName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommonName() {
    return commonName;
  }


  @JsonProperty(JSON_PROPERTY_COMMON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }


  public Certificate nameValue(String nameValue) {
    
    this.nameValue = nameValue;
    return this;
  }

   /**
   * Get nameValue
   * @return nameValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNameValue() {
    return nameValue;
  }


  @JsonProperty(JSON_PROPERTY_NAME_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameValue(String nameValue) {
    this.nameValue = nameValue;
  }


  public Certificate id(BigDecimal id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public Certificate entryTimestamp(String entryTimestamp) {
    
    this.entryTimestamp = entryTimestamp;
    return this;
  }

   /**
   * This is a date however the offset at the end (Z) is missing (as specified in RFC3339)
   * @return entryTimestamp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTRY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntryTimestamp() {
    return entryTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_ENTRY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntryTimestamp(String entryTimestamp) {
    this.entryTimestamp = entryTimestamp;
  }


  public Certificate notBefore(String notBefore) {
    
    this.notBefore = notBefore;
    return this;
  }

   /**
   * This is a date however the offset at the end (Z) is missing (as specified in RFC3339)
   * @return notBefore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOT_BEFORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotBefore() {
    return notBefore;
  }


  @JsonProperty(JSON_PROPERTY_NOT_BEFORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotBefore(String notBefore) {
    this.notBefore = notBefore;
  }


  public Certificate notAfter(String notAfter) {
    
    this.notAfter = notAfter;
    return this;
  }

   /**
   * This is a date however the offset at the end (Z) is missing (as specified in RFC3339)
   * @return notAfter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOT_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotAfter() {
    return notAfter;
  }


  @JsonProperty(JSON_PROPERTY_NOT_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotAfter(String notAfter) {
    this.notAfter = notAfter;
  }


  public Certificate serialNumber(String serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSerialNumber() {
    return serialNumber;
  }


  @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public Certificate resultCount(BigDecimal resultCount) {
    
    this.resultCount = resultCount;
    return this;
  }

   /**
   * Get resultCount
   * @return resultCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getResultCount() {
    return resultCount;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultCount(BigDecimal resultCount) {
    this.resultCount = resultCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Certificate certificate = (Certificate) o;
    return Objects.equals(this.issuerCaId, certificate.issuerCaId) &&
        Objects.equals(this.issuerName, certificate.issuerName) &&
        Objects.equals(this.commonName, certificate.commonName) &&
        Objects.equals(this.nameValue, certificate.nameValue) &&
        Objects.equals(this.id, certificate.id) &&
        Objects.equals(this.entryTimestamp, certificate.entryTimestamp) &&
        Objects.equals(this.notBefore, certificate.notBefore) &&
        Objects.equals(this.notAfter, certificate.notAfter) &&
        Objects.equals(this.serialNumber, certificate.serialNumber) &&
        Objects.equals(this.resultCount, certificate.resultCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuerCaId, issuerName, commonName, nameValue, id, entryTimestamp, notBefore, notAfter, serialNumber, resultCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Certificate {\n");
    sb.append("    issuerCaId: ").append(toIndentedString(issuerCaId)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    nameValue: ").append(toIndentedString(nameValue)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entryTimestamp: ").append(toIndentedString(entryTimestamp)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `issuer_ca_id` to the URL query string
    if (getIssuerCaId() != null) {
      try {
        joiner.add(String.format("%sissuer_ca_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIssuerCaId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `issuer_name` to the URL query string
    if (getIssuerName() != null) {
      try {
        joiner.add(String.format("%sissuer_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIssuerName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `common_name` to the URL query string
    if (getCommonName() != null) {
      try {
        joiner.add(String.format("%scommon_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCommonName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name_value` to the URL query string
    if (getNameValue() != null) {
      try {
        joiner.add(String.format("%sname_value%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNameValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `entry_timestamp` to the URL query string
    if (getEntryTimestamp() != null) {
      try {
        joiner.add(String.format("%sentry_timestamp%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntryTimestamp()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `not_before` to the URL query string
    if (getNotBefore() != null) {
      try {
        joiner.add(String.format("%snot_before%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNotBefore()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `not_after` to the URL query string
    if (getNotAfter() != null) {
      try {
        joiner.add(String.format("%snot_after%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNotAfter()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `serial_number` to the URL query string
    if (getSerialNumber() != null) {
      try {
        joiner.add(String.format("%sserial_number%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSerialNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `result_count` to the URL query string
    if (getResultCount() != null) {
      try {
        joiner.add(String.format("%sresult_count%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResultCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}
