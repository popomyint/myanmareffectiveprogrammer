package com.mep.database.entity;

import java.io.Serializable;
import java.util.Date;

public class Administrator implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column administrator.admin_id
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    private Integer adminId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column administrator.admin_name
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    private String adminName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column administrator.admin_email
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    private String adminEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column administrator.admin_password
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    private String adminPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column administrator.created_date
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    private Date createdDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column administrator.updated_date
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    private Date updatedDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column administrator.admin_image_url
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    private String adminImageUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column administrator.about_admin
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    private String aboutAdmin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table administrator
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column administrator.admin_id
     *
     * @return the value of administrator.admin_id
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column administrator.admin_id
     *
     * @param adminId the value for administrator.admin_id
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column administrator.admin_name
     *
     * @return the value of administrator.admin_name
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column administrator.admin_name
     *
     * @param adminName the value for administrator.admin_name
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column administrator.admin_email
     *
     * @return the value of administrator.admin_email
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column administrator.admin_email
     *
     * @param adminEmail the value for administrator.admin_email
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column administrator.admin_password
     *
     * @return the value of administrator.admin_password
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column administrator.admin_password
     *
     * @param adminPassword the value for administrator.admin_password
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column administrator.created_date
     *
     * @return the value of administrator.created_date
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column administrator.created_date
     *
     * @param createdDate the value for administrator.created_date
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column administrator.updated_date
     *
     * @return the value of administrator.updated_date
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column administrator.updated_date
     *
     * @param updatedDate the value for administrator.updated_date
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column administrator.admin_image_url
     *
     * @return the value of administrator.admin_image_url
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public String getAdminImageUrl() {
        return adminImageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column administrator.admin_image_url
     *
     * @param adminImageUrl the value for administrator.admin_image_url
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public void setAdminImageUrl(String adminImageUrl) {
        this.adminImageUrl = adminImageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column administrator.about_admin
     *
     * @return the value of administrator.about_admin
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public String getAboutAdmin() {
        return aboutAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column administrator.about_admin
     *
     * @param aboutAdmin the value for administrator.about_admin
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    public void setAboutAdmin(String aboutAdmin) {
        this.aboutAdmin = aboutAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Thu Aug 03 16:03:31 MMT 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminId=").append(adminId);
        sb.append(", adminName=").append(adminName);
        sb.append(", adminEmail=").append(adminEmail);
        sb.append(", adminPassword=").append(adminPassword);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", updatedDate=").append(updatedDate);
        sb.append(", adminImageUrl=").append(adminImageUrl);
        sb.append(", aboutAdmin=").append(aboutAdmin);
        sb.append("]");
        return sb.toString();
    }
}