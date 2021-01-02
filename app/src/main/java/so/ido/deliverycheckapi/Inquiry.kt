package so.ido.deliverycheckapi

import com.google.gson.annotations.SerializedName

data class Inquiry(

        @SerializedName("id")
        val id: String = "",

        @SerializedName("name")
        val name:String = "",

        @SerializedName("tel")
        val tel: String = ""
)

