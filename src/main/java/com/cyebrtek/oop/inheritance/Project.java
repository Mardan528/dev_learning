package com.cyebrtek.oop.inheritance;

import com.cyebrtek.enums.Status;
import com.cyebrtek.oop.encapsulation.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Project extends BaseEntity{

    private String projectCode;
    private String projectName;
    private User asigneManager;
    private LocalDate startDate;
    private LocalDate endDate;
    private Status projectStatus;
    private String projectDetail;

    public Project(long id, LocalDateTime insertDateTime, long insertUserId, LocalDateTime lastUpdateTime,
                   long lastUpdateUserId, String projectCode, String projectName, User asigneManager, LocalDate startDate,
                   LocalDate endDate, Status projectStatus, String projectDetail) {
        super(id, insertDateTime, insertUserId, lastUpdateTime, lastUpdateUserId);
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.asigneManager = asigneManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectStatus = projectStatus;
        this.projectDetail = projectDetail;
    }
}
