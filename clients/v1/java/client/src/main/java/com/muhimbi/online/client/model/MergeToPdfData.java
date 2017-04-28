/*
 * Muhimbi PDF
 * Convert, Merge, Watermark, Secure and OCR files.
 *
 * OpenAPI spec version: 9.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.muhimbi.online.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.muhimbi.online.client.model.SharepointFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Parameters for MergeToPdf operation
 */
@ApiModel(description = "Parameters for MergeToPdf operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-17T11:28:12.598Z")
public class MergeToPdfData {
  @SerializedName("use_async_pattern")
  private Boolean useAsyncPattern = false;

  @SerializedName("source_file_name_1")
  private String sourceFileName1 = null;

  @SerializedName("source_file_content_1")
  private String sourceFileContent1 = null;

  @SerializedName("source_file_name_2")
  private String sourceFileName2 = null;

  @SerializedName("source_file_content_2")
  private String sourceFileContent2 = null;

  @SerializedName("source_file_name_3")
  private String sourceFileName3 = null;

  @SerializedName("source_file_content_3")
  private String sourceFileContent3 = null;

  @SerializedName("source_file_name_4")
  private String sourceFileName4 = null;

  @SerializedName("source_file_content_4")
  private String sourceFileContent4 = null;

  @SerializedName("source_file_name_5")
  private String sourceFileName5 = null;

  @SerializedName("source_file_content_5")
  private String sourceFileContent5 = null;

  @SerializedName("sharepoint_file")
  private SharepointFile sharepointFile = null;

  @SerializedName("sharepoint_field_name")
  private String sharepointFieldName = null;

  /**
   * Document start page
   */
  public enum DocumentStartPageEnum {
    @SerializedName("Starts on the default page")
    DEFAULT_PAGE("Starts on the default page"),
    
    @SerializedName("Starts on the next page")
    NEXT_PAGE("Starts on the next page"),
    
    @SerializedName("Starts on the next odd page")
    NEXT_ODD_PAGE("Starts on the next odd page"),
    
    @SerializedName("Starts on the next even page")
    NEXT_EVEN_PAGE("Starts on the next even page");

    private String value;

    DocumentStartPageEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("document_start_page")
  private DocumentStartPageEnum documentStartPage = DocumentStartPageEnum.NEXT_PAGE;

  @SerializedName("fail_on_error")
  private Boolean failOnError = true;

  public MergeToPdfData useAsyncPattern(Boolean useAsyncPattern) {
    this.useAsyncPattern = useAsyncPattern;
    return this;
  }

   /**
   * Use async behaviour for API request
   * @return useAsyncPattern
  **/
  @ApiModelProperty(example = "null", value = "Use async behaviour for API request")
  public Boolean getUseAsyncPattern() {
    return useAsyncPattern;
  }

  public void setUseAsyncPattern(Boolean useAsyncPattern) {
    this.useAsyncPattern = useAsyncPattern;
  }

  public MergeToPdfData sourceFileName1(String sourceFileName1) {
    this.sourceFileName1 = sourceFileName1;
    return this;
  }

   /**
   * Name of the source file including extension
   * @return sourceFileName1
  **/
  @ApiModelProperty(example = "null", required = true, value = "Name of the source file including extension")
  public String getSourceFileName1() {
    return sourceFileName1;
  }

  public void setSourceFileName1(String sourceFileName1) {
    this.sourceFileName1 = sourceFileName1;
  }

  public MergeToPdfData sourceFileContent1(String sourceFileContent1) {
    this.sourceFileContent1 = sourceFileContent1;
    return this;
  }

   /**
   * Content of the file to merge
   * @return sourceFileContent1
  **/
  @ApiModelProperty(example = "null", required = true, value = "Content of the file to merge")
  public String getSourceFileContent1() {
    return sourceFileContent1;
  }

  public void setSourceFileContent1(String sourceFileContent1) {
    this.sourceFileContent1 = sourceFileContent1;
  }

  public MergeToPdfData sourceFileName2(String sourceFileName2) {
    this.sourceFileName2 = sourceFileName2;
    return this;
  }

   /**
   * Name of the source file including extension
   * @return sourceFileName2
  **/
  @ApiModelProperty(example = "null", required = true, value = "Name of the source file including extension")
  public String getSourceFileName2() {
    return sourceFileName2;
  }

  public void setSourceFileName2(String sourceFileName2) {
    this.sourceFileName2 = sourceFileName2;
  }

  public MergeToPdfData sourceFileContent2(String sourceFileContent2) {
    this.sourceFileContent2 = sourceFileContent2;
    return this;
  }

   /**
   * Content of the file to merge
   * @return sourceFileContent2
  **/
  @ApiModelProperty(example = "null", required = true, value = "Content of the file to merge")
  public String getSourceFileContent2() {
    return sourceFileContent2;
  }

  public void setSourceFileContent2(String sourceFileContent2) {
    this.sourceFileContent2 = sourceFileContent2;
  }

  public MergeToPdfData sourceFileName3(String sourceFileName3) {
    this.sourceFileName3 = sourceFileName3;
    return this;
  }

   /**
   * Name of the source file including extension
   * @return sourceFileName3
  **/
  @ApiModelProperty(example = "null", value = "Name of the source file including extension")
  public String getSourceFileName3() {
    return sourceFileName3;
  }

  public void setSourceFileName3(String sourceFileName3) {
    this.sourceFileName3 = sourceFileName3;
  }

  public MergeToPdfData sourceFileContent3(String sourceFileContent3) {
    this.sourceFileContent3 = sourceFileContent3;
    return this;
  }

   /**
   * Content of the file to merge
   * @return sourceFileContent3
  **/
  @ApiModelProperty(example = "null", value = "Content of the file to merge")
  public String getSourceFileContent3() {
    return sourceFileContent3;
  }

  public void setSourceFileContent3(String sourceFileContent3) {
    this.sourceFileContent3 = sourceFileContent3;
  }

  public MergeToPdfData sourceFileName4(String sourceFileName4) {
    this.sourceFileName4 = sourceFileName4;
    return this;
  }

   /**
   * Name of the source file including extension
   * @return sourceFileName4
  **/
  @ApiModelProperty(example = "null", value = "Name of the source file including extension")
  public String getSourceFileName4() {
    return sourceFileName4;
  }

  public void setSourceFileName4(String sourceFileName4) {
    this.sourceFileName4 = sourceFileName4;
  }

  public MergeToPdfData sourceFileContent4(String sourceFileContent4) {
    this.sourceFileContent4 = sourceFileContent4;
    return this;
  }

   /**
   * Content of the file to merge
   * @return sourceFileContent4
  **/
  @ApiModelProperty(example = "null", value = "Content of the file to merge")
  public String getSourceFileContent4() {
    return sourceFileContent4;
  }

  public void setSourceFileContent4(String sourceFileContent4) {
    this.sourceFileContent4 = sourceFileContent4;
  }

  public MergeToPdfData sourceFileName5(String sourceFileName5) {
    this.sourceFileName5 = sourceFileName5;
    return this;
  }

   /**
   * Name of the source file including extension
   * @return sourceFileName5
  **/
  @ApiModelProperty(example = "null", value = "Name of the source file including extension")
  public String getSourceFileName5() {
    return sourceFileName5;
  }

  public void setSourceFileName5(String sourceFileName5) {
    this.sourceFileName5 = sourceFileName5;
  }

  public MergeToPdfData sourceFileContent5(String sourceFileContent5) {
    this.sourceFileContent5 = sourceFileContent5;
    return this;
  }

   /**
   * Content of the file to merge
   * @return sourceFileContent5
  **/
  @ApiModelProperty(example = "null", value = "Content of the file to merge")
  public String getSourceFileContent5() {
    return sourceFileContent5;
  }

  public void setSourceFileContent5(String sourceFileContent5) {
    this.sourceFileContent5 = sourceFileContent5;
  }

  public MergeToPdfData sharepointFile(SharepointFile sharepointFile) {
    this.sharepointFile = sharepointFile;
    return this;
  }

   /**
   * Get sharepointFile
   * @return sharepointFile
  **/
  @ApiModelProperty(example = "null", value = "")
  public SharepointFile getSharepointFile() {
    return sharepointFile;
  }

  public void setSharepointFile(SharepointFile sharepointFile) {
    this.sharepointFile = sharepointFile;
  }

  public MergeToPdfData sharepointFieldName(String sharepointFieldName) {
    this.sharepointFieldName = sharepointFieldName;
    return this;
  }

   /**
   * Bookmark field name (For SharePoint only)
   * @return sharepointFieldName
  **/
  @ApiModelProperty(example = "null", value = "Bookmark field name (For SharePoint only)")
  public String getSharepointFieldName() {
    return sharepointFieldName;
  }

  public void setSharepointFieldName(String sharepointFieldName) {
    this.sharepointFieldName = sharepointFieldName;
  }

  public MergeToPdfData documentStartPage(DocumentStartPageEnum documentStartPage) {
    this.documentStartPage = documentStartPage;
    return this;
  }

   /**
   * Document start page
   * @return documentStartPage
  **/
  @ApiModelProperty(example = "null", value = "Document start page")
  public DocumentStartPageEnum getDocumentStartPage() {
    return documentStartPage;
  }

  public void setDocumentStartPage(DocumentStartPageEnum documentStartPage) {
    this.documentStartPage = documentStartPage;
  }

  public MergeToPdfData failOnError(Boolean failOnError) {
    this.failOnError = failOnError;
    return this;
  }

   /**
   * Fail on error
   * @return failOnError
  **/
  @ApiModelProperty(example = "null", value = "Fail on error")
  public Boolean getFailOnError() {
    return failOnError;
  }

  public void setFailOnError(Boolean failOnError) {
    this.failOnError = failOnError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeToPdfData mergeToPdfData = (MergeToPdfData) o;
    return Objects.equals(this.useAsyncPattern, mergeToPdfData.useAsyncPattern) &&
        Objects.equals(this.sourceFileName1, mergeToPdfData.sourceFileName1) &&
        Objects.equals(this.sourceFileContent1, mergeToPdfData.sourceFileContent1) &&
        Objects.equals(this.sourceFileName2, mergeToPdfData.sourceFileName2) &&
        Objects.equals(this.sourceFileContent2, mergeToPdfData.sourceFileContent2) &&
        Objects.equals(this.sourceFileName3, mergeToPdfData.sourceFileName3) &&
        Objects.equals(this.sourceFileContent3, mergeToPdfData.sourceFileContent3) &&
        Objects.equals(this.sourceFileName4, mergeToPdfData.sourceFileName4) &&
        Objects.equals(this.sourceFileContent4, mergeToPdfData.sourceFileContent4) &&
        Objects.equals(this.sourceFileName5, mergeToPdfData.sourceFileName5) &&
        Objects.equals(this.sourceFileContent5, mergeToPdfData.sourceFileContent5) &&
        Objects.equals(this.sharepointFile, mergeToPdfData.sharepointFile) &&
        Objects.equals(this.sharepointFieldName, mergeToPdfData.sharepointFieldName) &&
        Objects.equals(this.documentStartPage, mergeToPdfData.documentStartPage) &&
        Objects.equals(this.failOnError, mergeToPdfData.failOnError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useAsyncPattern, sourceFileName1, sourceFileContent1, sourceFileName2, sourceFileContent2, sourceFileName3, sourceFileContent3, sourceFileName4, sourceFileContent4, sourceFileName5, sourceFileContent5, sharepointFile, sharepointFieldName, documentStartPage, failOnError);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeToPdfData {\n");
    
    sb.append("    useAsyncPattern: ").append(toIndentedString(useAsyncPattern)).append("\n");
    sb.append("    sourceFileName1: ").append(toIndentedString(sourceFileName1)).append("\n");
    sb.append("    sourceFileContent1: ").append(toIndentedString(sourceFileContent1)).append("\n");
    sb.append("    sourceFileName2: ").append(toIndentedString(sourceFileName2)).append("\n");
    sb.append("    sourceFileContent2: ").append(toIndentedString(sourceFileContent2)).append("\n");
    sb.append("    sourceFileName3: ").append(toIndentedString(sourceFileName3)).append("\n");
    sb.append("    sourceFileContent3: ").append(toIndentedString(sourceFileContent3)).append("\n");
    sb.append("    sourceFileName4: ").append(toIndentedString(sourceFileName4)).append("\n");
    sb.append("    sourceFileContent4: ").append(toIndentedString(sourceFileContent4)).append("\n");
    sb.append("    sourceFileName5: ").append(toIndentedString(sourceFileName5)).append("\n");
    sb.append("    sourceFileContent5: ").append(toIndentedString(sourceFileContent5)).append("\n");
    sb.append("    sharepointFile: ").append(toIndentedString(sharepointFile)).append("\n");
    sb.append("    sharepointFieldName: ").append(toIndentedString(sharepointFieldName)).append("\n");
    sb.append("    documentStartPage: ").append(toIndentedString(documentStartPage)).append("\n");
    sb.append("    failOnError: ").append(toIndentedString(failOnError)).append("\n");
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
