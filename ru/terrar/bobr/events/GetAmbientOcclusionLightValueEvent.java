//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-1.2.2\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.terrar.bobr.events;

import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.block.state.*;

public class GetAmbientOcclusionLightValueEvent extends Event
{
    private float lightValue;
    
    public GetAmbientOcclusionLightValueEvent(final IBlockState state) {
        this.lightValue = state.getBlock().getAmbientOcclusionLightValue(state);
    }
    
    public float getLightValue() {
        return this.lightValue;
    }
    
    public void setLightValue(final float lightValue) {
        this.lightValue = lightValue;
    }
}
