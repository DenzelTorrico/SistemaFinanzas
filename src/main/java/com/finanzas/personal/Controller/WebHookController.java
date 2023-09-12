package com.finanzas.personal.Controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.finanzas.personal.Services.TelegramNotificationService;

@RestController
public class WebHookController {
	private final TelegramNotificationService telegramNotificationService;
    private static final Logger logger = LoggerFactory.getLogger(WebHookController.class);

    public WebHookController(TelegramNotificationService telegramNotificationService) {
        this.telegramNotificationService = telegramNotificationService;
    }

    @PostMapping(value = "/github-webhook")
    public void handleGitHubWebhook(@RequestBody String payload) {
        
        JSONObject jsonPayload = new JSONObject(payload);

        String pusher = jsonPayload.getJSONObject("pusher").getString("name");
        String namecommit = jsonPayload.getJSONObject("commits").getString("message");
        
        
        
            // ...

            logger.info(pusher + namecommit);
    }
    
}
