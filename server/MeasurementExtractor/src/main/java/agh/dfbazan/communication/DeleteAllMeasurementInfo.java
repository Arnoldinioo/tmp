package agh.dfbazan.communication;

import agh.dfbazan.crypto.SymetricCoder;



public class DeleteAllMeasurementInfo {
    
    private String userName;
    private String password;    
    private String deviceName;

    public DeleteAllMeasurementInfo(){}
    
    public DeleteAllMeasurementInfo(String userName, String password, String deviceName) {
        this.userName = userName;
        this.password = password;        
        this.deviceName = deviceName;
    }

    public DeleteAllMeasurementInfo encrypt()
    {
        SymetricCoder coder = new SymetricCoder();        
        
        DeleteAllMeasurementInfo info = new DeleteAllMeasurementInfo();
        
        info.setUserName(coder.encrypt(userName));
        info.setPassword(coder.encrypt(password));
        info.setDeviceName(coder.encrypt(deviceName));
        
        return info;
    }
    
    public DeleteAllMeasurementInfo decrypt()
    {
        SymetricCoder coder = new SymetricCoder();        
        
        DeleteAllMeasurementInfo info = new DeleteAllMeasurementInfo();
        
        info.setUserName(coder.decrypt(userName));
        info.setPassword(coder.decrypt(password));
        info.setDeviceName(coder.decrypt(deviceName));
        
        return info;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    
    
}



