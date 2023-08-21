package com.example.chatgpt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.myViewHolder>{

    List<Message> messageList;
    public MessageAdapter(List<Message> messageList){
        this.messageList = messageList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View chatView = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item, null);
        myViewHolder myH = new myViewHolder(chatView);
        return myH;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        Message message = messageList.get(position);
        if(message.getSent_By().equals(Message.sent_by_me)){
            holder.left_chat.setVisibility(View.GONE);
            holder.right_chat.setVisibility(View.VISIBLE);
            holder.right_chat_text.setText(message.getMessage());
        }
        else{
            holder.right_chat.setVisibility(View.GONE);
            holder.left_chat.setVisibility(View.VISIBLE);
            holder.left_chat_text.setText(message.getMessage());
        }
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        LinearLayout left_chat, right_chat;
        TextView left_chat_text, right_chat_text;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            left_chat = itemView.findViewById(R.id.left_chat_view);
            right_chat = itemView.findViewById(R.id.right_chat_view);
            left_chat_text = itemView.findViewById(R.id.left_chat_view_item);
            right_chat_text = itemView.findViewById(R.id.right_chat_view_item);

        }


    }
}
