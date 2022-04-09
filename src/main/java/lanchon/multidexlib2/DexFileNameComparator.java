/*
 * multidexlib2 - Copyright 2015-2022 Rodrigo Balerdi
 * (GNU General Public License version 3 or later)
 *
 * multidexlib2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 */

package lanchon.multidexlib2;

import java.util.Comparator;

public class DexFileNameComparator implements Comparator<String> {

	private final DexFileNamer namer;

	public DexFileNameComparator(DexFileNamer namer) {
		this.namer = namer;
	}

	@Override
	public int compare(String l, String r) {
		int li = namer.getIndex(l);
		int ri = namer.getIndex(r);
		boolean lv = (li >= 0);
		boolean rv = (ri >= 0);
		if (lv != rv) return lv ? -1 : 1;
		if (!lv) return l.compareTo(r);
		return Integer.compare(li, ri);
	}

	public DexFileNamer getNamer() {
		return namer;
	}

}
