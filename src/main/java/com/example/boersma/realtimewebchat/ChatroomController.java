package com.example.boersma.realtimewebchat;
import com.example.boersma.realtimewebchat.message.Message;
import connected.ConnectedUser;
import connected.ConnectedUserList;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatroomController {
    ConnectedUserList userList = new ConnectedUserList();

    @MessageMapping("/chat")
    @SendTo("/chat")
    public Message index(Message message) {
        return message;
    }

    @MessageMapping("/chat/connected_users")
    @SendTo("/chat/connected_users")
    public ConnectedUserList connectedUsers(ConnectedUser user) {
        userList.handleUser(user);
        return userList;
    }
}
