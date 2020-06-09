package 设计模式.抽象工厂.search;

import java.util.Date;

public class ExpertRepository implements SyncBeanBaseInterface {

    private Long id;
    private String userName;
    private String phoneNumber;
    private String nick;
    private String description;
    private String headImageUrl;
    private Long headImageId;
    private Date createTime;
    private Date lastUpdateTime;

    private String encryptPhoneNumber;

    public String getEncryptPhoneNumber() {
        return encryptPhoneNumber;
    }

    public void setEncryptPhoneNumber(String encryptPhoneNumber) {
        this.encryptPhoneNumber = encryptPhoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHeadImageUrl() {
        return headImageUrl;
    }

    public void setHeadImageUrl(String headImageUrl) {
        this.headImageUrl = headImageUrl;
    }

    public Long getHeadImageId() {
        return headImageId;
    }

    public void setHeadImageId(Long headImageId) {
        this.headImageId = headImageId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public Object getSyncBeanId() {
        return id;
    }
}
