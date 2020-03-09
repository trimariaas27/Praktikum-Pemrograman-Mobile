package maria.astuti.jatpacknavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 */
class FragmentDua : Fragment() {

    lateinit var  nav: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_dua, container, false)

        nav = Navigation.findNavController(view)

        buttonSubmit.setOnClickListener {
            if ()
        }
    }


}
