package cn.wwtianmei.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName qingyun_msg_push
 */
@TableName(value ="qingyun_msg_push")
@Data
public class MsgPush implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    @TableField("msg_type")
    private String msgType;

    /**
     * 
     */
    @TableField("msg_title")
    private String msgTitle;

    /**
     * 
     */
    @TableField("msg_content")
    private String msgContent;

    /**
     * 
     */
    @TableField("biz_key")
    private String bizKey;

    /**
     * 
     */
    @TableField("biz_type")
    private String bizType;

    /**
     * 
     */
    @TableField("receive_code")
    private String receiveCode;

    /**
     * 
     */
    @TableField("receive_user_code")
    private String receiveUserCode;

    /**
     * 
     */
    @TableField("receive_user_name")
    private String receiveUserName;

    /**
     * 
     */
    @TableField("send_user_code")
    private String sendUserCode;

    /**
     * 
     */
    @TableField("send_user_name")
    private String sendUserName;

    /**
     * 
     */
    @TableField("send_date")
    private Date sendDate;

    /**
     * 
     */
    @TableField("is_merge_push")
    private String isMergePush;

    /**
     * 
     */
    @TableField("plan_push_date")
    private Date planPushDate;

    /**
     * 
     */
    @TableField("push_number")
    private Integer pushNumber;

    /**
     * 
     */
    @TableField("push_return_code")
    private String pushReturnCode;

    /**
     * 
     */
    @TableField("push_return_msg_id")
    private String pushReturnMsgId;

    /**
     * 
     */
    @TableField("push_return_content")
    private String pushReturnContent;

    /**
     * 
     */
    @TableField("push_status")
    private String pushStatus;

    /**
     * 
     */
    @TableField("push_date")
    private Date pushDate;

    /**
     * 
     */
    @TableField("read_status")
    private String readStatus;

    /**
     * 
     */
    @TableField("read_date")
    private Date readDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MsgPush other = (MsgPush) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMsgType() == null ? other.getMsgType() == null : this.getMsgType().equals(other.getMsgType()))
            && (this.getMsgTitle() == null ? other.getMsgTitle() == null : this.getMsgTitle().equals(other.getMsgTitle()))
            && (this.getMsgContent() == null ? other.getMsgContent() == null : this.getMsgContent().equals(other.getMsgContent()))
            && (this.getBizKey() == null ? other.getBizKey() == null : this.getBizKey().equals(other.getBizKey()))
            && (this.getBizType() == null ? other.getBizType() == null : this.getBizType().equals(other.getBizType()))
            && (this.getReceiveCode() == null ? other.getReceiveCode() == null : this.getReceiveCode().equals(other.getReceiveCode()))
            && (this.getReceiveUserCode() == null ? other.getReceiveUserCode() == null : this.getReceiveUserCode().equals(other.getReceiveUserCode()))
            && (this.getReceiveUserName() == null ? other.getReceiveUserName() == null : this.getReceiveUserName().equals(other.getReceiveUserName()))
            && (this.getSendUserCode() == null ? other.getSendUserCode() == null : this.getSendUserCode().equals(other.getSendUserCode()))
            && (this.getSendUserName() == null ? other.getSendUserName() == null : this.getSendUserName().equals(other.getSendUserName()))
            && (this.getSendDate() == null ? other.getSendDate() == null : this.getSendDate().equals(other.getSendDate()))
            && (this.getIsMergePush() == null ? other.getIsMergePush() == null : this.getIsMergePush().equals(other.getIsMergePush()))
            && (this.getPlanPushDate() == null ? other.getPlanPushDate() == null : this.getPlanPushDate().equals(other.getPlanPushDate()))
            && (this.getPushNumber() == null ? other.getPushNumber() == null : this.getPushNumber().equals(other.getPushNumber()))
            && (this.getPushReturnCode() == null ? other.getPushReturnCode() == null : this.getPushReturnCode().equals(other.getPushReturnCode()))
            && (this.getPushReturnMsgId() == null ? other.getPushReturnMsgId() == null : this.getPushReturnMsgId().equals(other.getPushReturnMsgId()))
            && (this.getPushReturnContent() == null ? other.getPushReturnContent() == null : this.getPushReturnContent().equals(other.getPushReturnContent()))
            && (this.getPushStatus() == null ? other.getPushStatus() == null : this.getPushStatus().equals(other.getPushStatus()))
            && (this.getPushDate() == null ? other.getPushDate() == null : this.getPushDate().equals(other.getPushDate()))
            && (this.getReadStatus() == null ? other.getReadStatus() == null : this.getReadStatus().equals(other.getReadStatus()))
            && (this.getReadDate() == null ? other.getReadDate() == null : this.getReadDate().equals(other.getReadDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMsgType() == null) ? 0 : getMsgType().hashCode());
        result = prime * result + ((getMsgTitle() == null) ? 0 : getMsgTitle().hashCode());
        result = prime * result + ((getMsgContent() == null) ? 0 : getMsgContent().hashCode());
        result = prime * result + ((getBizKey() == null) ? 0 : getBizKey().hashCode());
        result = prime * result + ((getBizType() == null) ? 0 : getBizType().hashCode());
        result = prime * result + ((getReceiveCode() == null) ? 0 : getReceiveCode().hashCode());
        result = prime * result + ((getReceiveUserCode() == null) ? 0 : getReceiveUserCode().hashCode());
        result = prime * result + ((getReceiveUserName() == null) ? 0 : getReceiveUserName().hashCode());
        result = prime * result + ((getSendUserCode() == null) ? 0 : getSendUserCode().hashCode());
        result = prime * result + ((getSendUserName() == null) ? 0 : getSendUserName().hashCode());
        result = prime * result + ((getSendDate() == null) ? 0 : getSendDate().hashCode());
        result = prime * result + ((getIsMergePush() == null) ? 0 : getIsMergePush().hashCode());
        result = prime * result + ((getPlanPushDate() == null) ? 0 : getPlanPushDate().hashCode());
        result = prime * result + ((getPushNumber() == null) ? 0 : getPushNumber().hashCode());
        result = prime * result + ((getPushReturnCode() == null) ? 0 : getPushReturnCode().hashCode());
        result = prime * result + ((getPushReturnMsgId() == null) ? 0 : getPushReturnMsgId().hashCode());
        result = prime * result + ((getPushReturnContent() == null) ? 0 : getPushReturnContent().hashCode());
        result = prime * result + ((getPushStatus() == null) ? 0 : getPushStatus().hashCode());
        result = prime * result + ((getPushDate() == null) ? 0 : getPushDate().hashCode());
        result = prime * result + ((getReadStatus() == null) ? 0 : getReadStatus().hashCode());
        result = prime * result + ((getReadDate() == null) ? 0 : getReadDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", msgType=").append(msgType);
        sb.append(", msgTitle=").append(msgTitle);
        sb.append(", msgContent=").append(msgContent);
        sb.append(", bizKey=").append(bizKey);
        sb.append(", bizType=").append(bizType);
        sb.append(", receiveCode=").append(receiveCode);
        sb.append(", receiveUserCode=").append(receiveUserCode);
        sb.append(", receiveUserName=").append(receiveUserName);
        sb.append(", sendUserCode=").append(sendUserCode);
        sb.append(", sendUserName=").append(sendUserName);
        sb.append(", sendDate=").append(sendDate);
        sb.append(", isMergePush=").append(isMergePush);
        sb.append(", planPushDate=").append(planPushDate);
        sb.append(", pushNumber=").append(pushNumber);
        sb.append(", pushReturnCode=").append(pushReturnCode);
        sb.append(", pushReturnMsgId=").append(pushReturnMsgId);
        sb.append(", pushReturnContent=").append(pushReturnContent);
        sb.append(", pushStatus=").append(pushStatus);
        sb.append(", pushDate=").append(pushDate);
        sb.append(", readStatus=").append(readStatus);
        sb.append(", readDate=").append(readDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}