/*
 * X Craft Gunpowder - Adds an alternative, vanilla-friendly, balanced, and practical way to craft Gunpowder.
 * Copyright (C) 2026 xslrdv
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.xslrdv.xcraftgunpowder;

import com.xslrdv.xcraftgunpowder.registry.ModCreativeTabs;
import com.xslrdv.xcraftgunpowder.registry.ModItems;
import com.xslrdv.xcraftgunpowder.registry.ModRecipes;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(XCraftGunpowder.MODID)
public class XCraftGunpowder {
    public static final String MODID = "xcraftgunpowder";

    public XCraftGunpowder(IEventBus modEventBus) {
        ModItems.register(modEventBus);
        ModRecipes.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
    }
}
