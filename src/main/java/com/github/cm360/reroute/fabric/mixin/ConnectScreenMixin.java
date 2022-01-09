package com.github.cm360.reroute.fabric.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import com.github.cm360.reroute.fabric.config.ReRouteConfig;

import me.shedaniel.autoconfig.AutoConfig;

@Mixin(targets = "net.minecraft.client.gui.screen.ConnectScreen$1")
public class ConnectScreenMixin {

	@ModifyArg(
		method = "run",
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/network/packet/c2s/handshake/HandshakeC2SPacket;<init>(Ljava/lang/String;ILnet/minecraft/network/NetworkState;)V"
		)
	)
	private String modifyHostArg(String host) {
		return host + "\0ReRoute-Fabric\0" + AutoConfig.getConfigHolder(ReRouteConfig.class).getConfig().request;
	}

}
