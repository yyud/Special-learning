package com.issc.dw.websokilet;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * @author yyud
 * @version V1.0
 * @Description:
 * @Date 15:42 2018/4/26
 */
public class FristWebSokiet  extends TextWebSocketHandler{
    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        String content = (String) message.getPayload();
        TextMessage ccc = new TextMessage("ccc" + content);
        session.sendMessage(ccc);

    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("connection ...");
    }
}
