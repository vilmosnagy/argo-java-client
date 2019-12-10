package io.argoproj.workflow.v1alpha;

import java.io.Serializable;
import java.util.Objects;

/**
 * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
 */
public class ArtifactLocation  implements Serializable {
  private Boolean archiveLogs;

  private ArtifactoryArtifact artifactory = null;

  private GitArtifact git = null;

  private HDFSArtifact hdfs = null;

  private HTTPArtifact http = null;

  private RawArtifact raw = null;

  private S3Artifact s3 = null;

  public ArtifactLocation archiveLogs(Boolean archiveLogs) {
    this.archiveLogs = archiveLogs;
    return this;
  }

  /**
   * ArchiveLogs indicates if the container logs should be archived
   * @return archiveLogs
  */
  public Boolean getArchiveLogs() {
    return archiveLogs;
  }

  public void setArchiveLogs(Boolean archiveLogs) {
    this.archiveLogs = archiveLogs;
  }

  public ArtifactLocation artifactory(ArtifactoryArtifact artifactory) {
    this.artifactory = artifactory;
    return this;
  }

  /**
   * Get artifactory
   * @return artifactory
  */
  public ArtifactoryArtifact getArtifactory() {
    return artifactory;
  }

  public void setArtifactory(ArtifactoryArtifact artifactory) {
    this.artifactory = artifactory;
  }

  public ArtifactLocation git(GitArtifact git) {
    this.git = git;
    return this;
  }

  /**
   * Get git
   * @return git
  */
  public GitArtifact getGit() {
    return git;
  }

  public void setGit(GitArtifact git) {
    this.git = git;
  }

  public ArtifactLocation hdfs(HDFSArtifact hdfs) {
    this.hdfs = hdfs;
    return this;
  }

  /**
   * Get hdfs
   * @return hdfs
  */
  public HDFSArtifact getHdfs() {
    return hdfs;
  }

  public void setHdfs(HDFSArtifact hdfs) {
    this.hdfs = hdfs;
  }

  public ArtifactLocation http(HTTPArtifact http) {
    this.http = http;
    return this;
  }

  /**
   * Get http
   * @return http
  */
  public HTTPArtifact getHttp() {
    return http;
  }

  public void setHttp(HTTPArtifact http) {
    this.http = http;
  }

  public ArtifactLocation raw(RawArtifact raw) {
    this.raw = raw;
    return this;
  }

  /**
   * Get raw
   * @return raw
  */
  public RawArtifact getRaw() {
    return raw;
  }

  public void setRaw(RawArtifact raw) {
    this.raw = raw;
  }

  public ArtifactLocation s3(S3Artifact s3) {
    this.s3 = s3;
    return this;
  }

  /**
   * Get s3
   * @return s3
  */
  public S3Artifact getS3() {
    return s3;
  }

  public void setS3(S3Artifact s3) {
    this.s3 = s3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactLocation ioArgoprojWorkflowV1alpha1ArtifactLocation = (ArtifactLocation) o;
    return Objects.equals(this.archiveLogs, ioArgoprojWorkflowV1alpha1ArtifactLocation.archiveLogs) &&
        Objects.equals(this.artifactory, ioArgoprojWorkflowV1alpha1ArtifactLocation.artifactory) &&
        Objects.equals(this.git, ioArgoprojWorkflowV1alpha1ArtifactLocation.git) &&
        Objects.equals(this.hdfs, ioArgoprojWorkflowV1alpha1ArtifactLocation.hdfs) &&
        Objects.equals(this.http, ioArgoprojWorkflowV1alpha1ArtifactLocation.http) &&
        Objects.equals(this.raw, ioArgoprojWorkflowV1alpha1ArtifactLocation.raw) &&
        Objects.equals(this.s3, ioArgoprojWorkflowV1alpha1ArtifactLocation.s3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveLogs, artifactory, git, hdfs, http, raw, s3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ArtifactLocation {\n");

    sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
    sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
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

