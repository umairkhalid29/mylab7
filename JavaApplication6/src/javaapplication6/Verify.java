
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author umair
 */
@Entity
@Table(name="rounds")
public class Verify implements Serializable {
    
    @Id
    private String Userid;
    
    @Column
    private String Scheme;
    
    @Column
    private float timetakenInput;
    
    @Column
    private Boolean State0;
    
    @Column 
    private float TC1;
    
    @Column
    private Boolean State1;
    
    @Column 
    private float TC2;
    
    @Column
    private Boolean State2;
    
    @Column 
    private float TC3;
    
    @Column
    private Boolean State3;
    
    @Column 
    private float TC4;
    
    @Column 
    private Boolean State4;
    
    @Column 
    private float TC5;
    
    @Column
    private Boolean State5;
    
    @Column 
    private float TC6;
    
    @Column
    private Boolean State6;
    
    @Column 
    private float TC7;
    
    @Column
    private Boolean State7;
    
    public String getUserid() {
        return Userid;
    }

    public void setUserid(String Userid) {
        this.Userid = Userid;
    }

    public String getScheme() {
        return Scheme;
    }

    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    public float getTimetakenInput() {
        return timetakenInput;
    }

    public void setTimetakenInput(int timetakenInput) {
        this.timetakenInput = timetakenInput;
    }

    public Boolean getState0() {
        return State0;
    }

    public void setState0(Boolean State0) {
        this.State0 = State0;
    }

    public float getTC1() {
        return TC1;
    }

    public void setTC1(float TC1) {
        this.TC1 = TC1;
    }

    public Boolean getState1() {
        return State1;
    }

    public void setState1(Boolean State1) {
        this.State1 = State1;
    }

    public float getTC2() {
        return TC2;
    }

    public void setTC2(float TC2) {
        this.TC2 = TC2;
    }

    public Boolean getState2() {
        return State2;
    }

    public void setState2(Boolean State2) {
        this.State2 = State2;
    }

    public float getTC3() {
        return TC3;
    }

    public void setTC3(float TC3) {
        this.TC3 = TC3;
    }

    public Boolean getState3() {
        return State3;
    }

    public void setState3(Boolean State3) {
        this.State3 = State3;
    }

    public float getTC4() {
        return TC4;
    }

    public void setTC4(float TC4) {
        this.TC4 = TC4;
    }

    public Boolean getState4() {
        return State4;
    }

    public void setState4(Boolean State4) {
        this.State4 = State4;
    }

    public float getTC5() {
        return TC5;
    }

    public void setTC5(float TC5) {
        this.TC5 = TC5;
    }

    public Boolean getState5() {
        return State5;
    }

    public void setState5(Boolean State5) {
        this.State5 = State5;
    }

    public float getTC6() {
        return TC6;
    }

    public void setTC6(float TC6) {
        this.TC6 = TC6;
    }

    public Boolean getState6() {
        return State6;
    }

    public void setState6(Boolean State6) {
        this.State6 = State6;
    }

    public float getTC7() {
        return TC7;
    }

    public void setTC7(float TC7) {
        this.TC7 = TC7;
    }

    public Boolean getState7() {
        return State7;
    }

    public void setState7(Boolean State7) {
        this.State7 = State7;
    }
    
    
}
    
