package net.qbismx.simpitemmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.qbismx.simpitemmod.SimpItemMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SimpItemMod.MODID);

    public static final DeferredItem<Item> RAW_QBIMON = ITEMS.register("raw_qbimon",
            () -> new Item(new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
