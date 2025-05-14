package github.jcsmecabricks.customtorches.block;

import github.jcsmecabricks.customtorches.CustomTorches;
import github.jcsmecabricks.customtorches.item.ModItems;
import github.jcsmecabricks.customtorches.particle.ModParticles;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CustomTorches.MOD_ID);

    public static final DeferredBlock<Block> RED_TORCH = registerBlock("red_torch",
            () -> new TorchBlock(ModParticles.RED_TORCH_PARTICLE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "red_torch")))));

    public static final DeferredBlock<Block> RED_WALL_TORCH = registerBlock("red_wall_torch",
            () -> new WallTorchBlock(ModParticles.RED_TORCH_PARTICLE.get(), wallVariant(RED_TORCH.get(), true)
                    .noCollission()
                    .instabreak()
                    .lightLevel((state) -> 14)
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "red_wall_torch")))));

    public static final DeferredBlock<Block> ORANGE_TORCH = registerBlock("orange_torch",
            () -> new TorchBlock(ModParticles.ORANGE_TORCH_PARTICLE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "orange_torch")))));

    public static final DeferredBlock<Block> ORANGE_WALL_TORCH = registerBlock("orange_wall_torch",
            () -> new WallTorchBlock(ModParticles.ORANGE_TORCH_PARTICLE.get(), wallVariant(ORANGE_TORCH.get(), true)
                    .noCollission()
                    .instabreak()
                    .lightLevel((state) -> 14)
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "orange_wall_torch")))));

    public static final DeferredBlock<Block> YELLOW_TORCH = registerBlock("yellow_torch",
            () -> new TorchBlock(ModParticles.YELLOW_TORCH_PARTICLE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "yellow_torch")))));

    public static final DeferredBlock<Block> YELLOW_WALL_TORCH = registerBlock("yellow_wall_torch",
            () -> new WallTorchBlock(ModParticles.YELLOW_TORCH_PARTICLE.get(), wallVariant(YELLOW_TORCH.get(), true)
                    .noCollission()
                    .instabreak()
                    .lightLevel((state) -> 14)
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "yellow_wall_torch")))));

    public static final DeferredBlock<Block> GREEN_TORCH = registerBlock("green_torch",
            () -> new TorchBlock(ModParticles.GREEN_TORCH_PARTICLE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "green_torch")))));

    public static final DeferredBlock<Block> GREEN_WALL_TORCH = registerBlock("green_wall_torch",
            () -> new WallTorchBlock(ModParticles.GREEN_TORCH_PARTICLE.get(), wallVariant(GREEN_TORCH.get(), true)
                    .noCollission()
                    .instabreak()
                    .lightLevel((state) -> 14)
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "green_wall_torch")))));

    public static final DeferredBlock<Block> BLUE_TORCH = registerBlock("blue_torch",
            () -> new TorchBlock(ModParticles.BLUE_TORCH_PARTICLE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "blue_torch")))));

    public static final DeferredBlock<Block> BLUE_WALL_TORCH = registerBlock("blue_wall_torch",
            () -> new WallTorchBlock(ModParticles.BLUE_TORCH_PARTICLE.get(), wallVariant(BLUE_TORCH.get(), true)
                    .noCollission()
                    .instabreak()
                    .lightLevel((state) -> 14)
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "blue_wall_torch")))));

    public static final DeferredBlock<Block> PURPLE_TORCH = registerBlock("purple_torch",
            () -> new TorchBlock(ModParticles.PURPLE_TORCH_PARTICLE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "purple_torch")))));

    public static final DeferredBlock<Block> PURPLE_WALL_TORCH = registerBlock("purple_wall_torch",
            () -> new WallTorchBlock(ModParticles.PURPLE_TORCH_PARTICLE.get(), wallVariant(PURPLE_TORCH.get(), true)
                    .noCollission()
                    .instabreak()
                    .lightLevel((state) -> 14)
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "purple_wall_torch")))));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static BlockBehaviour.Properties wallVariant(Block baseBlock, boolean overrideDescription) {
        BlockBehaviour.Properties blockbehaviour$properties = baseBlock.properties();
        BlockBehaviour.Properties blockbehaviour$properties1 = BlockBehaviour.Properties.of().overrideLootTable(baseBlock.getLootTable());
        if (overrideDescription) {
            blockbehaviour$properties1 = blockbehaviour$properties1.overrideDescription(baseBlock.getDescriptionId());
        }

        return blockbehaviour$properties1;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().useBlockDescriptionPrefix()
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CustomTorches.MOD_ID, name)))));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
