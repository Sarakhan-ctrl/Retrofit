import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment


@Composable
fun ListScreen(viewModel:MyViewModel)
val postList by viewModel.details.collectAsState()
LazyColumn(modifier=Modifier.fillMaxSize(),contentPadding=Padding.values(16.dp),verticalArrangement=Arrangement.SpacedBy(12.dp)){
    items(postList{
        post->postCard(post=post)
    })
}