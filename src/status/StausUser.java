/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 *
 * @author srinivsi
 */
public class StausUser {

    public enum Number {
        ZERO, ONE, TWO, THREE
    };

    private Number statusNum;
    
    public StausUser(Number statusNum){
        this.statusNum = statusNum;
    }

    /**
     * @return the statusNum
     */
    public Number getStatusNum() {
        return statusNum;
    }

    /**
     * @param statusNum the statusNum to set
     */
    public void setStatusNum(Number statusNum) {
        this.statusNum = statusNum;
    }
    
}
