package github.jcsmecabricks.customtorches;

import github.jcsmecabricks.customtorches.block.ModBlocks;
import github.jcsmecabricks.customtorches.item.ModCreativeModeTabs;
import github.jcsmecabricks.customtorches.item.ModItems;
import github.jcsmecabricks.customtorches.particle.ModParticles;
import github.jcsmecabricks.customtorches.particle.TorchParticles;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(CustomTorches.MOD_ID)
public class CustomTorches
{
    public static final String MOD_ID = "customtorches";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CustomTorches(IEventBus modEventBus, ModContainer modContainer)
    {
        ModParticles.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from server starting");
    }
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
        @SubscribeEvent
        public static void registerParticleFactories(RegisterParticleProvidersEvent providersEvent) {
            providersEvent.registerSpriteSet(ModParticles.RED_TORCH_PARTICLE.get(), TorchParticles.Provider::new);
            providersEvent.registerSpriteSet(ModParticles.ORANGE_TORCH_PARTICLE.get(), TorchParticles.Provider::new);            providersEvent.registerSpriteSet(ModParticles.RED_TORCH_PARTICLE.get(), TorchParticles.Provider::new);
            providersEvent.registerSpriteSet(ModParticles.YELLOW_TORCH_PARTICLE.get(), TorchParticles.Provider::new);
            providersEvent.registerSpriteSet(ModParticles.GREEN_TORCH_PARTICLE.get(), TorchParticles.Provider::new);
            providersEvent.registerSpriteSet(ModParticles.BLUE_TORCH_PARTICLE.get(), TorchParticles.Provider::new);
            providersEvent.registerSpriteSet(ModParticles.PURPLE_TORCH_PARTICLE.get(), TorchParticles.Provider::new);

        }

    }
}
