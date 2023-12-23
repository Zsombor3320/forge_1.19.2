package net.yourname.survivalworld.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yourname.survivalworld.Survivalmod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Survivalmod.MODID);

    public static final RegistryObject <Item> bot = ITEMS.register("bot",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
