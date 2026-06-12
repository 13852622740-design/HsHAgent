package com.hsh.mcpservercomputer;

import com.hsh.mcpservercomputer.service.ComputerService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class McpServerComputerApplication {

    public static void main(String[] args) {
        SpringApplication.run(McpServerComputerApplication.class, args);
    }

    @Bean
    public ToolCallbackProvider computerTools(ComputerService computerService){
        return MethodToolCallbackProvider.builder()
                .toolObjects(computerService)
                .build();
    }
}
