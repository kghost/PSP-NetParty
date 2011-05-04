/*
Copyright (C) 2011 monte

This file is part of PSP NetParty.

PSP NetParty is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pspnetparty.client.swt.message;

import java.util.List;

import org.eclipse.swt.custom.StyleRange;

import pspnetparty.client.swt.IniAppearance;

public class Chat extends AbstractMessage {

	private boolean isMine;

	public Chat(String name, String message, boolean isMine) {
		super(name, message);
		this.isMine = isMine;
	}

	public boolean isMine() {
		return isMine;
	}

	@Override
	public void configureStyle(List<StyleRange> styles, IniAppearance appearance) {
		StyleRange range = new StyleRange();
		range.start = 0;
		range.length = length();
		range.foreground = isMine ? appearance.getColorChatMine() : appearance.getColorChatOthers();
		styles.add(range);
	}
}
