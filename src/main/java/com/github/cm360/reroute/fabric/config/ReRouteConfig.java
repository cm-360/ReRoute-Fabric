package com.github.cm360.reroute.fabric.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "reroute")
public class ReRouteConfig implements ConfigData {

	public String request = "example_data";

}
