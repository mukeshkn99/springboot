package com.springboot.beans.Exception;

import java.util.Date;
import java.util.List;



import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class errordetails {
private String message;
private Date  date;
private List<String> details;
}
