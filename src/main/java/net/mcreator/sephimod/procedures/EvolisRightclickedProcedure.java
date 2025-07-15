package net.mcreator.sephimod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class EvolisRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double baseRate = 0;
		double rateWithAmplifier = 0;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 2));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 1));
		if (world instanceof ServerLevel _level) {
			LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
			entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
			entityToSpawn.setVisualOnly(true);
			_level.addFreshEntity(entityToSpawn);
		}
		world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 1, y, z + 1), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 1, y, z - 1), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y, z - 1), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 1, y, z - 1), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 2, y, z - 1), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 2, y, z), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 2, y, z + 1), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y, z + 3), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 2, y, z + 3), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y, z + 3), Blocks.ICE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 1, y, z + 3), Blocks.ICE.defaultBlockState(), 3);
	}
}