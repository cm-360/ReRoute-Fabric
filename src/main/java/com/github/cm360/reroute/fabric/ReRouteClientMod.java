package com.github.cm360.reroute.fabric;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.cm360.reroute.fabric.config.ReRouteConfig;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;

public class ReRouteClientMod implements ClientModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("ReRoute");

	@Override
	public void onInitializeClient() {
		AutoConfig.register(ReRouteConfig.class, GsonConfigSerializer::new);
	}

}
