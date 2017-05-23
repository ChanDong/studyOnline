package com.arcsoft.studyOnline.bean;

import java.util.Date;

public class PrivateMessage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column private_message.id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column private_message.user_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column private_message.friend_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    private Long friendId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column private_message.sender_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    private Long senderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column private_message.receiver_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    private Long receiverId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column private_message.message_type
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    private Byte messageType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column private_message.message_content
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    private String messageContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column private_message.send_time
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    private Date sendTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column private_message.status
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    private Byte status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column private_message.id
     *
     * @return the value of private_message.id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column private_message.id
     *
     * @param id the value for private_message.id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column private_message.user_id
     *
     * @return the value of private_message.user_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column private_message.user_id
     *
     * @param userId the value for private_message.user_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column private_message.friend_id
     *
     * @return the value of private_message.friend_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public Long getFriendId() {
        return friendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column private_message.friend_id
     *
     * @param friendId the value for private_message.friend_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public void setFriendId(Long friendId) {
        this.friendId = friendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column private_message.sender_id
     *
     * @return the value of private_message.sender_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public Long getSenderId() {
        return senderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column private_message.sender_id
     *
     * @param senderId the value for private_message.sender_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column private_message.receiver_id
     *
     * @return the value of private_message.receiver_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public Long getReceiverId() {
        return receiverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column private_message.receiver_id
     *
     * @param receiverId the value for private_message.receiver_id
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column private_message.message_type
     *
     * @return the value of private_message.message_type
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public Byte getMessageType() {
        return messageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column private_message.message_type
     *
     * @param messageType the value for private_message.message_type
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public void setMessageType(Byte messageType) {
        this.messageType = messageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column private_message.message_content
     *
     * @return the value of private_message.message_content
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column private_message.message_content
     *
     * @param messageContent the value for private_message.message_content
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column private_message.send_time
     *
     * @return the value of private_message.send_time
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column private_message.send_time
     *
     * @param sendTime the value for private_message.send_time
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column private_message.status
     *
     * @return the value of private_message.status
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column private_message.status
     *
     * @param status the value for private_message.status
     *
     * @mbg.generated Tue May 23 18:58:33 CST 2017
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}