package com.example.napat.slide_view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.napat.slide_view.R.id.testx
import kotlinx.android.synthetic.main.fragment_blank.*
import kotlinx.android.synthetic.main.fragment_blank.view.*
import kotlinx.android.synthetic.main.silder_image.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.ArrayList

class fargmantone : Fragment() {
    var Movielist = ArrayList<Result>()
    fun getImagelist(list : List<Result>){
        Movielist.addAll(list)
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.silder_image, container, false)
        Retrofitadapter.getapi().getAPI()
                .enqueue(object : Callback<Movie> {

                    override fun onResponse(call: Call<Movie>?, response: Response<Movie>?) {
                        if (response?.isSuccessful == true){
                            Glide.with(context).load(response.body()?.results?.get(1)?.image_url).into(view.lll)

                        }else{
                            // TODO: handle message error
                        }
                    }
                    override fun onFailure(call: Call<Movie>?, t: Throwable?) {
                        t?.printStackTrace()
                    }
                })

        return view
    }
}