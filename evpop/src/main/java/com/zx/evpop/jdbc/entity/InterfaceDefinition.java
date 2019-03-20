package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class InterfaceDefinition implements Serializable {
    private String serialNo;

    private String txNo;

    private String version;

    private String channel;

    private String interfaceType;

    private String interfaceDirection;

    private String gatewayUrl;

    private Integer httpTimeoutSecond;

    private String serviceClassName;

    private String methodName;

    private String encryptAlgorithm;

    private String decryptAlgorithm;

    private String signAlgorithm;

    private String verifyAlgorithm;

    private Byte useTokenAsPassword;

    private String password;

    private Byte firstSignSecondEncrypt;

    private Byte firstVerifySecondDecrypt;

    private Byte validateToken;

    private Byte idempotentRedo;

    private Byte writeMessage;

    private String writeMode;

    private String keyVector;

    private Date createDate;

    private Date lastUpdateDate;

    private String interfaceDesc;

    private static final long serialVersionUID = 1L;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    public String getTxNo() {
        return txNo;
    }

    public void setTxNo(String txNo) {
        this.txNo = txNo == null ? null : txNo.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType == null ? null : interfaceType.trim();
    }

    public String getInterfaceDirection() {
        return interfaceDirection;
    }

    public void setInterfaceDirection(String interfaceDirection) {
        this.interfaceDirection = interfaceDirection == null ? null : interfaceDirection.trim();
    }

    public String getGatewayUrl() {
        return gatewayUrl;
    }

    public void setGatewayUrl(String gatewayUrl) {
        this.gatewayUrl = gatewayUrl == null ? null : gatewayUrl.trim();
    }

    public Integer getHttpTimeoutSecond() {
        return httpTimeoutSecond;
    }

    public void setHttpTimeoutSecond(Integer httpTimeoutSecond) {
        this.httpTimeoutSecond = httpTimeoutSecond;
    }

    public String getServiceClassName() {
        return serviceClassName;
    }

    public void setServiceClassName(String serviceClassName) {
        this.serviceClassName = serviceClassName == null ? null : serviceClassName.trim();
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    public String getEncryptAlgorithm() {
        return encryptAlgorithm;
    }

    public void setEncryptAlgorithm(String encryptAlgorithm) {
        this.encryptAlgorithm = encryptAlgorithm == null ? null : encryptAlgorithm.trim();
    }

    public String getDecryptAlgorithm() {
        return decryptAlgorithm;
    }

    public void setDecryptAlgorithm(String decryptAlgorithm) {
        this.decryptAlgorithm = decryptAlgorithm == null ? null : decryptAlgorithm.trim();
    }

    public String getSignAlgorithm() {
        return signAlgorithm;
    }

    public void setSignAlgorithm(String signAlgorithm) {
        this.signAlgorithm = signAlgorithm == null ? null : signAlgorithm.trim();
    }

    public String getVerifyAlgorithm() {
        return verifyAlgorithm;
    }

    public void setVerifyAlgorithm(String verifyAlgorithm) {
        this.verifyAlgorithm = verifyAlgorithm == null ? null : verifyAlgorithm.trim();
    }

    public Byte getUseTokenAsPassword() {
        return useTokenAsPassword;
    }

    public void setUseTokenAsPassword(Byte useTokenAsPassword) {
        this.useTokenAsPassword = useTokenAsPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getFirstSignSecondEncrypt() {
        return firstSignSecondEncrypt;
    }

    public void setFirstSignSecondEncrypt(Byte firstSignSecondEncrypt) {
        this.firstSignSecondEncrypt = firstSignSecondEncrypt;
    }

    public Byte getFirstVerifySecondDecrypt() {
        return firstVerifySecondDecrypt;
    }

    public void setFirstVerifySecondDecrypt(Byte firstVerifySecondDecrypt) {
        this.firstVerifySecondDecrypt = firstVerifySecondDecrypt;
    }

    public Byte getValidateToken() {
        return validateToken;
    }

    public void setValidateToken(Byte validateToken) {
        this.validateToken = validateToken;
    }

    public Byte getIdempotentRedo() {
        return idempotentRedo;
    }

    public void setIdempotentRedo(Byte idempotentRedo) {
        this.idempotentRedo = idempotentRedo;
    }

    public Byte getWriteMessage() {
        return writeMessage;
    }

    public void setWriteMessage(Byte writeMessage) {
        this.writeMessage = writeMessage;
    }

    public String getWriteMode() {
        return writeMode;
    }

    public void setWriteMode(String writeMode) {
        this.writeMode = writeMode == null ? null : writeMode.trim();
    }

    public String getKeyVector() {
        return keyVector;
    }

    public void setKeyVector(String keyVector) {
        this.keyVector = keyVector == null ? null : keyVector.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getInterfaceDesc() {
        return interfaceDesc;
    }

    public void setInterfaceDesc(String interfaceDesc) {
        this.interfaceDesc = interfaceDesc == null ? null : interfaceDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialNo=").append(serialNo);
        sb.append(", txNo=").append(txNo);
        sb.append(", version=").append(version);
        sb.append(", channel=").append(channel);
        sb.append(", interfaceType=").append(interfaceType);
        sb.append(", interfaceDirection=").append(interfaceDirection);
        sb.append(", gatewayUrl=").append(gatewayUrl);
        sb.append(", httpTimeoutSecond=").append(httpTimeoutSecond);
        sb.append(", serviceClassName=").append(serviceClassName);
        sb.append(", methodName=").append(methodName);
        sb.append(", encryptAlgorithm=").append(encryptAlgorithm);
        sb.append(", decryptAlgorithm=").append(decryptAlgorithm);
        sb.append(", signAlgorithm=").append(signAlgorithm);
        sb.append(", verifyAlgorithm=").append(verifyAlgorithm);
        sb.append(", useTokenAsPassword=").append(useTokenAsPassword);
        sb.append(", password=").append(password);
        sb.append(", firstSignSecondEncrypt=").append(firstSignSecondEncrypt);
        sb.append(", firstVerifySecondDecrypt=").append(firstVerifySecondDecrypt);
        sb.append(", validateToken=").append(validateToken);
        sb.append(", idempotentRedo=").append(idempotentRedo);
        sb.append(", writeMessage=").append(writeMessage);
        sb.append(", writeMode=").append(writeMode);
        sb.append(", keyVector=").append(keyVector);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", interfaceDesc=").append(interfaceDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}