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

import javax.annotation.Nonnull;

import org.jf.dexlib2.iface.DexFile;
import org.jf.dexlib2.iface.MultiDexContainer;
import org.jf.dexlib2.iface.MultiDexContainer.DexEntry;

public class BasicDexEntry<C extends MultiDexContainer< /* ? extends */ D>, D extends DexFile>
		implements DexEntry<D> {

	private final C container;
	private final String entryName;
	private final D dexFile;

	public BasicDexEntry(C container, String entryName, D dexFile) {
		this.container = container;
		this.entryName = entryName;
		this.dexFile = dexFile;
	}

	@Nonnull
	@Override
	public String getEntryName() {
		return entryName;
	}

	@Nonnull
	@Override
	public C getContainer() {
		return container;
	}

	@Nonnull
	@Override
	public D getDexFile() {
		return dexFile;
	}

}
