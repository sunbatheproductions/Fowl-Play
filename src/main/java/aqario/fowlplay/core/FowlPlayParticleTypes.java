package aqario.fowlplay.core;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FowlPlayParticleTypes {
    public static final DefaultParticleType SMALL_BUBBLE = register("small_bubble", false);

    private static DefaultParticleType register(String name, boolean alwaysShow) {
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(FowlPlay.ID, name), FabricParticleTypes.simple(alwaysShow));
    }
}
