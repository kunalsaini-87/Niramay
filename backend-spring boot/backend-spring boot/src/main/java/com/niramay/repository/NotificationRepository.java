package com.niramay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niramay.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {



}
