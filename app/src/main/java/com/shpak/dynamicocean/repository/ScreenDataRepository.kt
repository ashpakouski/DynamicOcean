package com.shpak.dynamicocean.repository

import com.shpak.dynamicocean.model.DeviceScreen
import com.shpak.dynamicocean.model.DisplayCutout

interface ScreenDataRepository {
    var deviceScreen: DeviceScreen?
    var displayCutout: DisplayCutout?
}