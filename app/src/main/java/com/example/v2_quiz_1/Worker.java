package com.example.v2_quiz_1;

import androidx.annotation.NonNull;

public class Worker {
    /*
    Car Number : LRX-6920
Car Owner Name : Waqas
Car Owner Phone : 033444398837
Car Owner Address : Link road model town
Last Reading : 44320
Oil Changer : Razzaq
ID : 12345
Password : 12345
     */

    String carNumber;
    String OwnerName;
    String OwnerPhone;
    String OwnerAddress;
    int lastReading;
    String workerName;
    long id;
    long pin;

    public Worker() {
    }

    public Worker(String carNumber, String ownerName, String ownerPhone, String ownerAddress, int lastReading, String workerName, long id, long pin) {
        this.carNumber = carNumber;
        OwnerName = ownerName;
        OwnerPhone = ownerPhone;
        OwnerAddress = ownerAddress;
        this.lastReading = lastReading;
        this.workerName = workerName;
        this.id = id;
        this.pin = pin;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public String getOwnerPhone() {
        return OwnerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        OwnerPhone = ownerPhone;
    }

    public String getOwnerAddress() {
        return OwnerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        OwnerAddress = ownerAddress;
    }

    public int getLastReading() {
        return lastReading;
    }

    public void setLastReading(int lastReading) {
        this.lastReading = lastReading;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPin() {
        return pin;
    }

    public void setPin(long pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "carNumber='" + carNumber + '\'' +
                ", OwnerName='" + OwnerName + '\'' +
                ", OwnerPhone='" + OwnerPhone + '\'' +
                ", OwnerAddress='" + OwnerAddress + '\'' +
                ", lastReading=" + lastReading +
                ", workerName='" + workerName + '\'' +
                ", id=" + id +
                ", pin=" + pin +
                '}';
    }
}
