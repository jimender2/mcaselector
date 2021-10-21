package net.querz.mcaselector.version.anvil112;

import net.querz.mcaselector.point.Point3i;
import net.querz.mcaselector.version.PoiRelocator;
import net.querz.nbt.tag.CompoundTag;

public class Anvil112PoiRelocator implements PoiRelocator {

	@Override
	public boolean relocatePoi(CompoundTag root, Point3i offset) {
		// poi was introduced in 1.14, so we do nothing here
		return true;
	}
}
