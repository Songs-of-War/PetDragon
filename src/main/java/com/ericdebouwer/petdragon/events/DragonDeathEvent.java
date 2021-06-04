package com.ericdebouwer.petdragon.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DragonDeathEvent extends Event {
	private static final HandlerList handlers = new HandlerList();

	private final Entity entity;

	public DragonDeathEvent(Entity entity) {
		super(!Bukkit.getServer().isPrimaryThread());
		this.entity = entity;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}


	public Entity getEntity() {
		return this.entity;
	}

	public EntityType getEntityType() {
		return this.entity.getType();
	}

}