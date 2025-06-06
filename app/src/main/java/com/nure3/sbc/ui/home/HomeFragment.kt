import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.nure3.sbc.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val newsList = listOf(
            NewsItem("Новость 1", "Описание новости номер один"),
            NewsItem("Новость 2", "Описание новости номер два"),
            NewsItem("Новость 3", "Описание новости номер три")
        )

        val adapter = NewsAdapter(newsList)
        binding.newsRecyclerView.layoutManager = LinearLayoutManager(context)
        binding.newsRecyclerView.adapter = adapter

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
