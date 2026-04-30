import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment

@Composable
fun postCard(post:PostDataClass){
    Card(modifier=Modifier.fillMaxWidth(),elevation=CardDefaults.CardElevation(defaultElevation=4.dp)){
        Column(modifier=Modifier.padding(12.dp).fillMaxWidth()){
            Text(text=post.id,fontWeight=FontWeight.Bold)
            Spacer(modifier=Modifier.heihjt(8.dp))

            Text(text=post.title,fontWeight=FontWeight.Bold)
            Spacer(modifier=Modifier.heihjt(8.dp))

            Text(text=post.body,fontWeight=FontWeight.Bold)
            Spacer(modifier=Modifier.heihjt(8.dp))

            Text(text=post.userId,fontWeight=FontWeight.Bold)
            Spacer(modifier=Modifier.heihjt(8.dp))
        }
    }
}