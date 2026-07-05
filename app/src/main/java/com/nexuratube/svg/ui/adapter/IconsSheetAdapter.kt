package com.nexuratube.svg.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nexuratube.svg.databinding.AppIconItemBinding
import com.nexuratube.svg.ui.more.settings.SettingHost
import com.nexuratube.svg.util.ThemeUtil

class IconsSheetAdapter(val host: SettingHost) : RecyclerView.Adapter<IconsSheetAdapter.IconsSheetViewHolder>() {

    class IconsSheetViewHolder(
        val binding: AppIconItemBinding
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IconsSheetViewHolder {
        val binding = AppIconItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return IconsSheetViewHolder(binding)
    }

    override fun getItemCount() = ThemeUtil.availableIcons.size

    override fun onBindViewHolder(holder: IconsSheetViewHolder, position: Int) {
        val appIcon = ThemeUtil.availableIcons[position]
        holder.binding.apply {
            iconIV.setImageResource(appIcon.iconResource)
            iconName.text = root.context.getString(appIcon.nameResource)
            root.setOnClickListener {
                val preferences = androidx.preference.PreferenceManager.getDefaultSharedPreferences(host.getHostContext())
                preferences.edit().putString("nexuratube_icon", appIcon.activityAlias).apply()
                val theme = preferences.getString("nexuratube_theme", "System")!!
                ThemeUtil.updateAppIcon(host.getHostContext(), theme,appIcon.activityAlias)
                host.refreshUI()
                host.getHostContext().recreate()
            }
        }
    }
}