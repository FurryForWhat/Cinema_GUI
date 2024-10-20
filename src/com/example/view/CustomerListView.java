package com.example.view;

import javax.swing.*;
import java.awt.*;

public class CustomerListView {
    private
    private JFrame customerListframe;
    private JTable
    private JscrollPane
    private JButton
    private String[] columns = "";
    public CustomerListView(){
        this.customerDao = new CustomerDao();
        initializeCompo();
    }

    private void initializeCompo(){
        this.customerListframe = new JFrame ("Customer List");
        this.customerListframe.setSize(700,500);
        this.customerListframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.customerListframe.setLayout(this.getCustomerData(),this.columns);
        TableColumn column = this.movieTable.getColumnModule().getColumn(1);
        column.setPreferredWidth(200);
        this.scrollPane = new JScrollPane(this.movieTable);
        this.bookingframe.add(this.scrollPane, BorderLayout.CENTER);
        this.createBtn = new JButton("Create");
        this.updateBtn = new JButton("Update");
        this.deleteBtn = new JButton("Delete");
    }

}
