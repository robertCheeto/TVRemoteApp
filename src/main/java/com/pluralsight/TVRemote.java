package com.pluralsight;

public class TVRemote {
    private String tvManufacturer;
    private int channelNumber, currentVolume;
    private boolean powerState;

    public TVRemote(String tvManufacturer) {
        this.tvManufacturer = tvManufacturer;
        this.channelNumber = 0;
        this.currentVolume = 10;
        this.powerState = false;
    }

    public String getStatus() {
        String powerStatus = "OFF";
        if (this.isPowerState()) {
            powerStatus = "ON";
        }
        return "Status: " + powerStatus +", Channel: " + getChannelNumber() + " ,(" + getChannelName()+ ") Volume: " + getCurrentVolume();
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public boolean isPowerState() {
        return powerState;
    }

    public String getTvManufacturer() {
        return tvManufacturer;
    }

    public void turnOn() {

    }

    public void turnOff() {

    }

    public void changeChannel(int channel) {
        this.channel = channel;
    }

    public void adjustVolume(int volume) {

    }

    public String getChannelName() {
        if (channelNumber == 3) {
            return "Cartoon Network";
        }
        else if (channelNumber == 5) {
            return "Discovery Channel";
        }
        else if (channelNumber == 8) {
            return "Food Channel";
        }
        else if (channelNumber == 13) {
            return "HGTV";
        }
        else if (channelNumber == 25) {
            return "Comedy Central";
        }
        else {
            return "Unknown Channel";
        }
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public void setTvManufacturer(String tvManufacturer) {
        this.tvManufacturer = tvManufacturer;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setPowerState(boolean powerState) {
        this.powerState = powerState;
    }
}
