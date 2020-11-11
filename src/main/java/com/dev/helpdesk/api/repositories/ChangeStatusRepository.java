package com.dev.helpdesk.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dev.helpdesk.api.entities.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String > {

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
}
