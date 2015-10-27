package pers.ash.shiro.model.draftaudit;

import java.io.Serializable;

public class AuditRecord implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4107002704056563252L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shiro_audit_record.id
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shiro_audit_record.draftId
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    private String draftId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shiro_audit_record.auditorId
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    private String auditorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shiro_audit_record.submitDate
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    private String submitDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shiro_audit_record.auditDate
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    private String auditDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shiro_audit_record.auditOpinion
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    private String auditOpinion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shiro_audit_record.auditState
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    private String auditState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shiro_audit_record.readTag
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    private Integer readTag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shiro_audit_record.id
     *
     * @return the value of shiro_audit_record.id
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shiro_audit_record.id
     *
     * @param id the value for shiro_audit_record.id
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shiro_audit_record.draftId
     *
     * @return the value of shiro_audit_record.draftId
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public String getDraftId() {
        return draftId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shiro_audit_record.draftId
     *
     * @param draftId the value for shiro_audit_record.draftId
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public void setDraftId(String draftId) {
        this.draftId = draftId == null ? null : draftId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shiro_audit_record.auditorId
     *
     * @return the value of shiro_audit_record.auditorId
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public String getAuditorId() {
        return auditorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shiro_audit_record.auditorId
     *
     * @param auditorId the value for shiro_audit_record.auditorId
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId == null ? null : auditorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shiro_audit_record.submitDate
     *
     * @return the value of shiro_audit_record.submitDate
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public String getSubmitDate() {
        return submitDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shiro_audit_record.submitDate
     *
     * @param submitDate the value for shiro_audit_record.submitDate
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public void setSubmitDate(String submitDate) {
        this.submitDate = submitDate == null ? null : submitDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shiro_audit_record.auditDate
     *
     * @return the value of shiro_audit_record.auditDate
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public String getAuditDate() {
        return auditDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shiro_audit_record.auditDate
     *
     * @param auditDate the value for shiro_audit_record.auditDate
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public void setAuditDate(String auditDate) {
        this.auditDate = auditDate == null ? null : auditDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shiro_audit_record.auditOpinion
     *
     * @return the value of shiro_audit_record.auditOpinion
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public String getAuditOpinion() {
        return auditOpinion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shiro_audit_record.auditOpinion
     *
     * @param auditOpinion the value for shiro_audit_record.auditOpinion
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion == null ? null : auditOpinion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shiro_audit_record.auditState
     *
     * @return the value of shiro_audit_record.auditState
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public String getAuditState() {
        return auditState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shiro_audit_record.auditState
     *
     * @param auditState the value for shiro_audit_record.auditState
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public void setAuditState(String auditState) {
        this.auditState = auditState == null ? null : auditState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shiro_audit_record.readTag
     *
     * @return the value of shiro_audit_record.readTag
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public Integer getReadTag() {
        return readTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shiro_audit_record.readTag
     *
     * @param readTag the value for shiro_audit_record.readTag
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    public void setReadTag(Integer readTag) {
        this.readTag = readTag;
    }
}