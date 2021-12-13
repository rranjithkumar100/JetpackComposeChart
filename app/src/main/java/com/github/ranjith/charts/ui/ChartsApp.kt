package com.github.ranjith.charts.ui

import androidx.compose.animation.Crossfade
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.github.ranjith.charts.theme.ChartsTheme
import com.github.ranjith.charts.ui.bar.BarChartScreen
import com.github.ranjith.charts.ui.line.LineChartScreen
import com.github.ranjith.charts.ui.pie.PieChartScreen
import com.github.ranjith.charts.ui.selector.SelectChartScreen

@Composable
fun ChartsApp() {
  ChartsTheme {
    AppContent()
  }
}

@Composable
fun AppContent() {
  Crossfade(ChartScreenStatus.currentChart) { screen ->
    Surface(color = MaterialTheme.colors.background) {
      when (screen) {
        ChartScreen.SelectChart -> SelectChartScreen()
        ChartScreen.Pie -> PieChartScreen()
        ChartScreen.Bar -> BarChartScreen()
        ChartScreen.Line -> LineChartScreen()
      }
    }
  }
}
