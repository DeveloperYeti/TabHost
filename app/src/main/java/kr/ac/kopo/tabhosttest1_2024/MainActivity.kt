package kr.ac.kopo.tabhosttest1_2024

import android.app.TabActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TabHost

class MainActivity : TabActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabHost = this.tabHost

        var tabSpec1 = tabHost.newTabSpec("first").setIndicator("첫번째 탭")
        tabSpec1.setContent(R.id.flower1)
        tabHost.addTab(tabSpec1)

        var tabSpec2 = tabHost.newTabSpec("Second").setIndicator("두번째 탭")
        tabSpec2.setContent(R.id.flower2)
        tabHost.addTab(tabSpec2)

        var tabSpec3 = tabHost.newTabSpec("Third").setIndicator("세번째 탭")
        tabSpec3.setContent(R.id.flower3)
        tabHost.addTab(tabSpec3)
        var tabSpec4 = tabHost.newTabSpec("four").setIndicator("네번째 탭")
        tabSpec4.setContent(R.id.flower4)
        tabHost.addTab(tabSpec4)
        
        tabHost.currentTab = 1
    }
}