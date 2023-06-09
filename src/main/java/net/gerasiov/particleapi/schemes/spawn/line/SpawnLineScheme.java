package net.gerasiov.particleapi.schemes.spawn.line;

import net.gerasiov.particleapi.particles.RegularParticle;
import net.gerasiov.particleapi.schemes.SpawnScheme;

public class SpawnLineScheme implements SpawnScheme<RegularParticle[]> {
    @Override
    public RegularParticle[] getNextParticles(int index, RegularParticle[] spawnParticles) {
        return new RegularParticle[] { spawnParticles[index] };
    }

    @Override
    public boolean isFinished(int index, RegularParticle[] spawnParticles) {
        return index == spawnParticles.length;
    }
}
