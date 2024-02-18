/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.hrm.UI;

import com.app.hrm.DAO.ChamCongDao;
import com.app.hrm.DAO.KyCongDao;
import com.app.hrm.Entity.ChamCong;
import com.app.hrm.Entity.KyCong;
import com.app.hrm.Utils.XDate;
import java.sql.Timestamp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class test {
    
    public static void main(String[] args) {
        LocalDate day = LocalDate.now();
        int nam = day.getYear()-1901;
        int thang = 3+11;
        int ngay =  day.getMonth().length(true);
         Date now = new Date(nam, thang,ngay);
       
     String x = XDate.toString(now);
        
        System.out.println(x+" "+ nam+" "+thang+" "+ngay);
        
        
      
        
        
    }
    
  
    
}
