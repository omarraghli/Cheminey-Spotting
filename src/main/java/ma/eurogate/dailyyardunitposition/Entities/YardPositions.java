/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.eurogate.dailyyardunitposition.Entities;

import java.time.LocalDateTime;

/**
 *
 * @author Omar
 * Email:omar.raghli@gmail.com
 */
public class YardPositions {
    private float log_id;
    private LocalDateTime ShiftDate;
    private float ShiftCode;
    private LocalDateTime event_datetime;
    private float hdhand;
    private String unit;
    private String Park;
    private String Bay;
    private String Row;
    private String tier;
    private float size;
    private String isFull;
    private String IsDangerous;
    private String IsOOG;
    private String isReefer;
    private String IsReeferActivated;

    public YardPositions(float log_id, LocalDateTime ShiftDate, float ShiftCode, LocalDateTime event_datetime, float hdhand, String unit, String Park, String Bay, String Row, String tier, float size, String isFull, String IsDangerous, String IsOOG, String isReefer, String IsReeferActivated) {
        this.log_id = log_id;
        this.ShiftDate = ShiftDate;
        this.ShiftCode = ShiftCode;
        this.event_datetime = event_datetime;
        this.hdhand = hdhand;
        this.unit = unit;
        this.Park = Park;
        this.Bay = Bay;
        this.Row = Row;
        this.tier = tier;
        this.size = size;
        this.isFull = isFull;
        this.IsDangerous = IsDangerous;
        this.IsOOG = IsOOG;
        this.isReefer = isReefer;
        this.IsReeferActivated = IsReeferActivated;
    }

    public float getLog_id() {
        return log_id;
    }

    public void setLog_id(float log_id) {
        this.log_id = log_id;
    }

    public LocalDateTime getShiftDate() {
        return ShiftDate;
    }

    public void setShiftDate(LocalDateTime ShiftDate) {
        this.ShiftDate = ShiftDate;
    }

    public float getShiftCode() {
        return ShiftCode;
    }

    public void setShiftCode(float ShiftCode) {
        this.ShiftCode = ShiftCode;
    }

    public LocalDateTime getEvent_datetime() {
        return event_datetime;
    }

    public void setEvent_datetime(LocalDateTime event_datetime) {
        this.event_datetime = event_datetime;
    }

    public float getHdhand() {
        return hdhand;
    }

    public void setHdhand(float hdhand) {
        this.hdhand = hdhand;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPark() {
        return Park;
    }

    public void setPark(String Park) {
        this.Park = Park;
    }

    public String getBay() {
        return Bay;
    }

    public void setBay(String Bay) {
        this.Bay = Bay;
    }

    public String getRow() {
        return Row;
    }

    public void setRow(String Row) {
        this.Row = Row;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getIsFull() {
        return isFull;
    }

    public void setIsFull(String isFull) {
        this.isFull = isFull;
    }

    public String getIsDangerous() {
        return IsDangerous;
    }

    public void setIsDangerous(String IsDangerous) {
        this.IsDangerous = IsDangerous;
    }

    public String getIsOOG() {
        return IsOOG;
    }

    public void setIsOOG(String IsOOG) {
        this.IsOOG = IsOOG;
    }

    public String getIsReefer() {
        return isReefer;
    }

    public void setIsReefer(String isReefer) {
        this.isReefer = isReefer;
    }

    public String getIsReeferActivated() {
        return IsReeferActivated;
    }

    public void setIsReeferActivated(String IsReeferActivated) {
        this.IsReeferActivated = IsReeferActivated;
    }

    @Override
    public String toString() {
        return "YardPositions{" + "log_id=" + log_id + ", ShiftDate=" + ShiftDate + ", ShiftCode=" + ShiftCode + ", event_datetime=" + event_datetime + ", hdhand=" + hdhand + ", unit=" + unit + ", Park=" + Park + ", Bay=" + Bay + ", Row=" + Row + ", tier=" + tier + ", size=" + size + ", isFull=" + isFull + ", IsDangerous=" + IsDangerous + ", IsOOG=" + IsOOG + ", isReefer=" + isReefer + ", IsReeferActivated=" + IsReeferActivated + '}'+"\n";
    }


    
    
}
