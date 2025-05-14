package github.jcsmecabricks.customtorches.item;

import github.jcsmecabricks.customtorches.CustomTorches;
import github.jcsmecabricks.customtorches.block.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CustomTorches.MOD_ID);

    public static final DeferredItem<Item> RED_TORCH_ITEM = ITEMS.register("red_torch_item",
            () -> new StandingAndWallBlockItem(ModBlocks.RED_TORCH.get(), ModBlocks.RED_WALL_TORCH.get(),
                    Direction.DOWN, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CustomTorches.MOD_ID, "espresso")))
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "red_torch_item")))));

    public static final DeferredItem<Item> ORANGE_TORCH_ITEM = ITEMS.register("orange_torch_item",
            () -> new StandingAndWallBlockItem(ModBlocks.ORANGE_TORCH.get(), ModBlocks.ORANGE_WALL_TORCH.get(),
                    Direction.DOWN, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CustomTorches.MOD_ID, "espresso")))
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "orange_torch_item")))));

    public static final DeferredItem<Item> YELLOW_TORCH_ITEM = ITEMS.register("yellow_torch_item",
            () -> new StandingAndWallBlockItem(ModBlocks.YELLOW_TORCH.get(), ModBlocks.YELLOW_WALL_TORCH.get(),
                    Direction.DOWN, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CustomTorches.MOD_ID, "espresso")))
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "yellow_torch_item")))));

    public static final DeferredItem<Item> GREEN_TORCH_ITEM = ITEMS.register("green_torch_item",
            () -> new StandingAndWallBlockItem(ModBlocks.GREEN_TORCH.get(), ModBlocks.GREEN_WALL_TORCH.get(),
                    Direction.DOWN, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CustomTorches.MOD_ID, "espresso")))
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "green_torch_item")))));

    public static final DeferredItem<Item> BLUE_TORCH_ITEM = ITEMS.register("blue_torch_item",
            () -> new StandingAndWallBlockItem(ModBlocks.BLUE_TORCH.get(), ModBlocks.BLUE_WALL_TORCH.get(),
                    Direction.DOWN, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CustomTorches.MOD_ID, "espresso")))
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "blue_torch_item")))));

    public static final DeferredItem<Item> PURPLE_TORCH_ITEM = ITEMS.register("purple_torch_item",
            () -> new StandingAndWallBlockItem(ModBlocks.PURPLE_TORCH.get(), ModBlocks.PURPLE_WALL_TORCH.get(),
                    Direction.DOWN, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CustomTorches.MOD_ID, "espresso")))
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath
                            (CustomTorches.MOD_ID, "purple_torch_item")))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
