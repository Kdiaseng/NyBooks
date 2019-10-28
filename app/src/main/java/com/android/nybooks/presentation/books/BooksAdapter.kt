package com.android.nybooks.presentation.books

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.nybooks.data.model.Book
import com.android.nybooks.databinding.ItemBookBinding


class BooksAdapter(
        val books: List<Book>,
        val onItemClickListener: ((book:Book) -> Unit) // calback
) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>(){

    //criacao de cada item do recyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        //view = item de layout
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBookBinding.inflate(inflater)

        return  BooksViewHolder(binding, onItemClickListener)
    }

    override fun getItemCount() = books.count()

    //popula os item com dados
    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
                holder.bindView(books[position])
    }

    class BooksViewHolder(val binding: ItemBookBinding,
                          private val onItemClickListener: ((book:Book) -> Unit))
        : RecyclerView.ViewHolder(binding.root){

            fun bindView(book: Book){
               binding.book = book
                itemView.setOnClickListener {
                    onItemClickListener.invoke(book)
                }
            }
    }
}