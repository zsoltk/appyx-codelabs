package com.bumble.appyx_codelabs.custom_animation.app

import android.os.Bundle
import androidx.activity.compose.setContent
import com.bumble.appyx.core.integration.NodeHost
import com.bumble.appyx.core.integrationpoint.NodeActivity
import com.bumble.appyx_codelabs.custom_animation.app.ui.theme.CustomAnimationTheme
import com.bumble.appyx_codelabs.custom_animation.app.root.RootNode


class MainActivity : NodeActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomAnimationTheme {
                NodeHost(integrationPoint = integrationPoint) {
                    RootNode(it)
                }
            }
        }
    }
}
