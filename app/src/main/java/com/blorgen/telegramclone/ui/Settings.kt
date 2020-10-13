package com.blorgen.telegramclone.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.blorgen.telegramclone.R
import com.blorgen.telegramclone.databinding.FragmentChatBinding
import com.blorgen.telegramclone.databinding.FragmentSettingsBinding


class Settings : Fragment() {
    private lateinit var mBinding: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentSettingsBinding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun onResume() {
        super.onResume()
    }
}