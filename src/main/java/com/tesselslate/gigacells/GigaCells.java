package com.tesselslate.gigacells;

import com.mojang.logging.LogUtils;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

@Mod(GigaCells.MODID)
public class GigaCells {
    public static final String MODID = "gigacells";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public GigaCells() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ITEMS.register(modEventBus);

        modEventBus.addListener(GigaCells::initStorageCells);
    }

    private static void initStorageCells(FMLCommonSetupEvent event) {
        // TODO
    }
}
