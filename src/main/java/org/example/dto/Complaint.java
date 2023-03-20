package org.example.dto;

import org.example.enums.ComplaintStatus;
import org.example.enums.Who;

import javax.persistence.criteria.CriteriaBuilder;

public class Complaint {
    private Integer id;
    private Who who;
    private Integer complainant_id;
    private String complaintText;
    private ComplaintStatus status;
}
