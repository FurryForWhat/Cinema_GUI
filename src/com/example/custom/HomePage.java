package com.example.custom;

import com.example.view.BookingPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.print.Book;

public class HomePage {
    private JFrame homeFrame;
    private JMenuBar menuBar;
    private JMenu bookingsItem;
    private JMenu moviesItem;
    private JMenu cinemasItem;
    private JMenuItem ticketBookingItem;
    private JMenuItem cancelBookingItem;


    public HomePage() {
//        initializeComponents();
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setLocation(0, 0);
        homeFrame.setSize(700, 500);
        homeFrame.setVisible(true);

    }
    private void initializeComponents(){
        this.homeFrame = new JFrame();
        this.menuBar = new JMenuBar();
        this.bookingsItem = new JMenu();
        this.ticketBookingItem = new JMenuItem("TIcket Booking");
        this.cancelBookingItem = new JMenuItem("Cancle Booking");
        this.moviesItem = new JMenu("Movies");
        this.bookingsItem = new JMenu("Cinemas");
        this.bookingsItem.add(ticketBookingItem);
        this.bookingsItem.add(cancelBookingItem);
        this.menuBar.add(bookingsItem);
        this.menuBar.add(moviesItem);
        this.menuBar.add(cinemasItem);
        this.ticketBookingAction();
        this.homeFrame.setJMenuBar(this.menuBar);
    }
    private void ticketBookingAction(){
        this.ticketBookingItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BookingPage  bookingPage = new BookingPage();
            }
        });
    }
}
