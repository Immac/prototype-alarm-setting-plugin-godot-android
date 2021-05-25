package com.whitesilver.alarmsettinglibrary

import androidx.annotation.NonNull
import org.godotengine.godot.Godot
import org.godotengine.godot.plugin.GodotPlugin

class AlarmManager(godot: Godot) : GodotPlugin(godot) {

    override fun getPluginName(): String {
        return "AlarmManager"
    }

    fun get_hello_world(): String {
        return "Hello from Plugin."
    }

    @NonNull
    @Override
    override fun getPluginMethods(): List<String> {
        return listOf("${::get_hello_world.name}")
    }

}