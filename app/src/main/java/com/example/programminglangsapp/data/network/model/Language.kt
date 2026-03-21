package com.example.programminglangsapp.data.network.model

import com.google.gson.annotations.SerializedName

data class Language (

  @SerializedName("id"             ) var id            : Int?              = null,
  @SerializedName("name"           ) var name          : String?           = null,
  @SerializedName("description"    ) var description   : String?           = null,
  @SerializedName("year"           ) var year          : Int?              = null,
  @SerializedName("icon"           ) var icon          : String?           = null,
  @SerializedName("plain_icon"     ) var plainIcon     : String?           = null,
  @SerializedName("creator"        ) var creator       : String?           = null,
  @SerializedName("latest_version" ) var latestVersion : String?           = null,
  @SerializedName("color"          ) var color         : String?           = null,
  @SerializedName("habitual_uses"  ) var habitualUses  : ArrayList<String> = arrayListOf(),
  @SerializedName("website"        ) var website       : String?           = null

)
