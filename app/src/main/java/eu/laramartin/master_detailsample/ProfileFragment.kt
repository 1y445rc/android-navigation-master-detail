package eu.laramartin.master_detailsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private inline val navContext
        get() = childFragmentManager
            .findFragmentById(R.id.profile_nav_container)
            ?: this

    private val nav: NavController
        get() = navContext.findNavController()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        account_textview.setOnClickListener {
            nav.navigate(R.id.fragment_account)
        }

        notifications_textview.setOnClickListener {
            nav.navigate(R.id.fragment_notifications)
        }

        settings_textview.setOnClickListener {
            nav.navigate(R.id.fragment_settings)
        }
    }
}
