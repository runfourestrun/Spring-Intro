package dto;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Education {

    private int yearsAttended;
    private String major;
    private Optional<Institution> institution;

    public Education(int yearsAttended, String major){
        this.yearsAttended = yearsAttended;
        this.major = major;
    }

    public Education(){

    }

    public Education(int yearsAttended,String major, Optional<Institution> institution){
        this.yearsAttended = yearsAttended;
        this.major = major;
        this.institution = institution;
    }


    public Optional<Institution> getInstitution() {
        return institution;
    }

    public int getYearsAttended() {
        return yearsAttended;
    }

    public void setYearsAttended(int yearsAttended) {
        this.yearsAttended = yearsAttended;
    }

    public void setInstitution(Optional<Institution> institution) {
        this.institution = institution;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Education{" +
                "yearsAttended=" + yearsAttended +
                ", major='" + major + '\'' +
                '}';
    }
}
