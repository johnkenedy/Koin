package com.example.koin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.koin.ui.theme.KoinTheme
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.compose.getViewModel
import org.koin.androidx.scope.activityScope
import org.koin.core.qualifier.named
import org.koin.core.scope.Scope

class MainActivity : ComponentActivity(), AndroidScopeComponent {

//    private val viewModel by viewModel<MainViewModel>()

    override val scope: Scope by activityScope()
    private val hello by inject<String>(named("hello"))
    private val bye by inject<String>(named("bye"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println(hello)
        println(bye)
        setContent {
            KoinTheme {
                val viewModel = getViewModel<MainViewModel>()
                viewModel.doNetworkCall()
            }
        }
    }
}
