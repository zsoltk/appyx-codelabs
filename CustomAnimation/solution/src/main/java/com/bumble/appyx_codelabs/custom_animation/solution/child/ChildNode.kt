package com.bumble.appyx_codelabs.custom_animation.solution.child

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.node.Node
import com.bumble.appyx_codelabs.custom_animation.solution.ui.theme.*


class ChildNode(
    buildContext: BuildContext,
    private val startValue: Int
) : Node(buildContext) {

    @Composable
    override fun View(modifier: Modifier) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .size(200.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(color = colors[startValue % colors.size])
        ) {
            Text(text = startValue.toString())
        }
    }

    companion object {
        private val colors = listOf(
            manatee,
            sizzling_red,
            atomic_tangerine
        )
    }
}
