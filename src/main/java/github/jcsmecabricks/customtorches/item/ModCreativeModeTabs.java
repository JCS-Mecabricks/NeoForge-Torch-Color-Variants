package github.jcsmecabricks.customtorches.item;

import github.jcsmecabricks.customtorches.CustomTorches;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CustomTorches.MOD_ID);

    public static final Supplier<CreativeModeTab> TORCH_GROUP = CREATIVE_MODE_TAB.register("torch_group",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RED_TORCH_ITEM.get()))
                    .title(Component.translatable("itemGroup.customtorches.torch_group"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RED_TORCH_ITEM.get());
                        output.accept(ModItems.ORANGE_TORCH_ITEM.get());
                        output.accept(ModItems.YELLOW_TORCH_ITEM.get());
                        output.accept(ModItems.GREEN_TORCH_ITEM.get());
                        output.accept(ModItems.BLUE_TORCH_ITEM.get());
                        output.accept(ModItems.PURPLE_TORCH_ITEM.get());
                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}