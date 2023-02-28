package net.mcreator.atmosphere.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FireburstOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if (!(new Object() {
						public int getScore(String score, Entity _ent) {
							Scoreboard _sc = _ent.getLevel().getScoreboard();
							Objective _so = _sc.getObjective(score);
							if (_so != null)
								return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
							return 0;
						}
					}.getScore("fire_burst_caller", entityiterator) == 1)) {
						if (entityiterator instanceof LivingEntity _entity)
							_entity.hurt(new DamageSource("fireburst").bypassArmor(), 10);
						entityiterator.setSecondsOnFire(10);
					}
				}
			}
		}
	}
}
