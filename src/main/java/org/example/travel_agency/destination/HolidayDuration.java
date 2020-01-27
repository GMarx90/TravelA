package org.example.travel_agency.destination;

import java.time.LocalDate;
import java.time.Period;

public class HolidayDuration {
        LocalDate dateOfDeparture; /*= LocalDate.parse("2020-06-27");*/
        LocalDate dateOfReturn;/* = LocalDate.parse("2020-07-11");*/


        public Period holdayDuration(LocalDate dateOfDeparture, LocalDate dateOfReturn){
            Period holidayDuration=Period.between(dateOfDeparture, dateOfReturn);
            return holidayDuration;

        }

    public HolidayDuration(LocalDate dateOfDeparture, LocalDate dateOfReturn) {
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfReturn = dateOfReturn;
    }

    public LocalDate getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(LocalDate dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }
}

