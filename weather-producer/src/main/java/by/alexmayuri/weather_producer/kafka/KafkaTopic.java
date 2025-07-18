package by.alexmayuri.weather_producer.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {

    @Value("${spring.kafka.topic}")
    private String topic;

    @Bean
    public NewTopic weatherTopic() {
        return TopicBuilder.name(
            topic
        ).partitions(3).build();
    }
}
