package com.beckett.sm.domain.role;

import com.beckett.sm.domain.Shift;

import java.util.List;

public class Manager extends Worker {


    public List<Shift> viewShifts() {
        return null;
    }

    public boolean deleteShifts(List<Shift> shifts) {
        return true;
    }

    public boolean publishShifts(List<Shift> shifts) {
        shifts.forEach(Shift::published);
        return true;
    }

}
