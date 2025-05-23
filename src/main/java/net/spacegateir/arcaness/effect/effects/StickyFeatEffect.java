package net.spacegateir.arcaness.effect.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.Vec3d;

public class StickyFeatEffect extends StatusEffect {
    public StickyFeatEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity.horizontalCollision) {
            Vec3d intialVec = entity.getVelocity();
            Vec3d climbVec = new Vec3d(intialVec.x,0.2D, intialVec.z);
            entity.setVelocity(climbVec.x * 0.92D,climbVec.y * 0.98D, climbVec.z * 0.92D);
        }

        super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }


}