//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Admin\Desktop\Minecraft-Deobfuscator3000-1.2.2\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.terrar.bobr.util;

import net.minecraft.client.*;
import net.minecraft.entity.player.*;

public class EventPreMotionUpdate extends EventCancellable
{
    private float yaw;
    private float pitch;
    private boolean ground;
    public double x;
    public double y;
    public double z;
    
    public EventPreMotionUpdate(final float yaw, final float pitch, final boolean ground, final double x, final double y, final double z) {
        this.yaw = yaw;
        this.pitch = pitch;
        this.ground = ground;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public float getYaw() {
        return this.yaw;
    }
    
    public void setYaw(final float yaw) {
        this.yaw = yaw;
        Minecraft.getMinecraft();
        Minecraft.getMinecraft().player.rotationYawHead = yaw;
        Minecraft.getMinecraft();
        Minecraft.getMinecraft().player.renderYawOffset = yaw;
    }
    
    public void setYaw1(final float yaw) {
        this.yaw = yaw;
        Minecraft.getMinecraft();
        Minecraft.getMinecraft().player.rotationYaw = yaw;
    }
    
    public double getX() {
        return this.x;
    }
    
    public void setX(final double x) {
        this.x = x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public void setY(final double y) {
        this.y = y;
    }
    
    public double getZ() {
        return this.z;
    }
    
    public void setZ(final double z) {
        this.z = z;
    }
    
    public boolean isGround() {
        return this.ground;
    }
    
    public void setGround(final boolean isGround) {
        this.ground = isGround;
    }
    
    public float getPitch() {
        return this.pitch;
    }
    
    public void setPitch(final float pitch) {
        this.pitch = pitch;
        Minecraft.getMinecraft();
    }
    
    public boolean onGround() {
        return this.ground;
    }
    
    public static class EventSpawnPlayer extends EventCancellable
    {
        private EntityPlayer player;
        
        public EventSpawnPlayer(final EntityPlayer player) {
            this.player = player;
        }
        
        public EntityPlayer getPlayer() {
            return this.player;
        }
        
        public void setPlayer(final EntityPlayer player) {
            this.player = player;
        }
    }
}
