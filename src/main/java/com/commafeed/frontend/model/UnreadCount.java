package com.commafeed.frontend.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

import com.wordnik.swagger.annotations.ApiModel;

@SuppressWarnings("serial")
@ApiModel("Unread count")
@Data
public class UnreadCount implements Serializable {

	private long feedId;
	private long unreadCount;
	private Date newestItemTime;

	public UnreadCount() {
	}

	public UnreadCount(long feedId, long unreadCount, Date newestItemTime) {
		this.feedId = feedId;
		this.unreadCount = unreadCount;
		this.newestItemTime = newestItemTime;
	}

}
