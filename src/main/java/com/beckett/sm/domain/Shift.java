package com.beckett.sm.domain;

import com.beckett.sm.domain.role.Worker;

import java.time.LocalDateTime;
import java.util.Set;


public class Shift {

    private long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Worker allocatedCarer;
    private ShiftStatus status;
    private ShiftContents shiftContents;

    private Set<Worker> workers;

    public void published() {
        this.status = ShiftStatus.AVAILABLE;
    }


}
