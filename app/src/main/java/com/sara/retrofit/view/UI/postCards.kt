import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.sara.retrofit.PostDataClass

@Composable
fun postCard(post: PostDataClass) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(12.dp).fillMaxWidth()) {
//            Text(text=post.id,fontWeight=FontWeight.Bold)
//            Spacer(modifier=Modifier.height(8.dp))
            Text(text = post.title, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))

            Text(text = post.body, fontWeight = FontWeight.Bold)

//            Text(text=post.userId,fontWeight=FontWeight.Bold)
//            Spacer(modifier=Modifier.height(8.dp))
        }
    }
}
