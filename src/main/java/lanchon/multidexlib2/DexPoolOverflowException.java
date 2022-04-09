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

public class DexPoolOverflowException extends RuntimeException {

	public DexPoolOverflowException(String file) {
		super(file);
	}

}
