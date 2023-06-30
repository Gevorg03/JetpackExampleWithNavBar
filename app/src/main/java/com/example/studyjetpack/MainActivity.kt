package com.example.studyjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.studyjetpack.ui.theme.Beige1
import com.example.studyjetpack.ui.theme.Beige2
import com.example.studyjetpack.ui.theme.Beige3
import com.example.studyjetpack.ui.theme.BlueViolet1
import com.example.studyjetpack.ui.theme.BlueViolet2
import com.example.studyjetpack.ui.theme.BlueViolet3
import com.example.studyjetpack.ui.theme.BottomMenu
import com.example.studyjetpack.ui.theme.ChipSection
import com.example.studyjetpack.ui.theme.CreateMediation
import com.example.studyjetpack.ui.theme.DeepBlue
import com.example.studyjetpack.ui.theme.FeatureSection
import com.example.studyjetpack.ui.theme.GreetingSection
import com.example.studyjetpack.ui.theme.HomeScreen
import com.example.studyjetpack.ui.theme.LightGreen1
import com.example.studyjetpack.ui.theme.LightGreen2
import com.example.studyjetpack.ui.theme.LightGreen3
import com.example.studyjetpack.ui.theme.MeditationUIYouTubeTheme
import com.example.studyjetpack.ui.theme.OrangeYellow1
import com.example.studyjetpack.ui.theme.OrangeYellow2
import com.example.studyjetpack.ui.theme.OrangeYellow3
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

//            Box(
//                modifier = Modifier
//                    .background(DeepBlue)
//                    .fillMaxSize()
//            ) {
//                Column {
//                    TopAppBar(
//                        title = {
//                            Text(text = "Music Player")
//                        },
//                        navigationIcon = {
//                            IconButton(onClick = { }) {
//                                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu Btn")
//                            }
//                        },
//                        modifier = Modifier
//                            .background(DeepBlue)
//                            .fillMaxWidth()
//                    )
//                    GreetingSection()
//                    ChipSection(chips = listOf("Sweet sleep", "Insomnia", "Depression"))
//                    CreateMediation()
//                    FeatureSection(
//                        feautures = listOf(
//                            Feature(
//                                title = "Sleep meditation",
//                                R.drawable.ic_headphone,
//                                BlueViolet1,
//                                BlueViolet2,
//                                BlueViolet3
//                            ),
//                            Feature(
//                                title = "Tips for sleeping",
//                                R.drawable.ic_videocam,
//                                LightGreen1,
//                                LightGreen2,
//                                LightGreen3
//                            ),
//                            Feature(
//                                title = "Night island",
//                                R.drawable.ic_headphone,
//                                OrangeYellow1,
//                                OrangeYellow2,
//                                OrangeYellow3
//                            ),
//                            Feature(
//                                title = "Calming sounds",
//                                R.drawable.ic_headphone,
//                                Beige1,
//                                Beige2,
//                                Beige3
//                            )
//                        )
//                    )
//
//
//                }
//                BottomMenu(
//                    items = listOf(
//                        BottomMenuContent("Home", R.drawable.ic_home),
//                        BottomMenuContent("Meditate", R.drawable.ic_bubble),
//                        BottomMenuContent("Sleep", R.drawable.ic_moon),
//                        BottomMenuContent("Music", R.drawable.ic_music),
//                        BottomMenuContent("Profile", R.drawable.ic_profile)
//                    ),
//                    modifier = Modifier.align(Alignment.BottomCenter)
//                )
//            }


             HomeScreen()
            //Main
        // Screen()
        }
    }
}

