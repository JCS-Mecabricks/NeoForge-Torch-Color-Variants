package github.jcsmecabricks.customtorches.particle;

import github.jcsmecabricks.customtorches.CustomTorches;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, CustomTorches.MOD_ID);

    public static final Supplier<SimpleParticleType> RED_TORCH_PARTICLE =
            PARTICLE_TYPES.register("red_torch_particle", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> ORANGE_TORCH_PARTICLE =
            PARTICLE_TYPES.register("orange_torch_particle", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> YELLOW_TORCH_PARTICLE =
            PARTICLE_TYPES.register("yellow_torch_particle", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> GREEN_TORCH_PARTICLE =
            PARTICLE_TYPES.register("green_torch_particle", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> BLUE_TORCH_PARTICLE =
            PARTICLE_TYPES.register("blue_torch_particle", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> PURPLE_TORCH_PARTICLE =
            PARTICLE_TYPES.register("purple_torch_particle", () -> new SimpleParticleType(true));

    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }
}
