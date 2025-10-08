package com.example.changeskilltraining.enums

import android.content.Context

enum class DAYS {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
    companion object {
        fun getDaysEnumThroughInt(id: Int): DAYS {
            return DAYS.entries[id]
        }
    }
}