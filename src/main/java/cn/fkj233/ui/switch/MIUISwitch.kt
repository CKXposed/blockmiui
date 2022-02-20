package cn.fkj233.ui.switch

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Switch
import cn.fkj233.ui.activity.dp2px
import java.lang.reflect.Field

class MIUISwitch (context: Context) : Switch(context) {

    @SuppressLint("DiscouragedPrivateApi", "DrawAllocation")
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val switchWidth: Field = Switch::class.java.getDeclaredField("mSwitchWidth")
        switchWidth.isAccessible = true
        switchWidth.setInt(this, dp2px(context, 48f))
    }
}
