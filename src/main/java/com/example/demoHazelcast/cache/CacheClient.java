package com.example.demoHazelcast.cache;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CacheClient {

    @Bean
    public Config hazelcastConfig(){
        return new Config().setInstanceName("hazelcast-instance")
                .addMapConfig(new MapConfig().setName("itemCache")
                        .setTimeToLiveSeconds(2000));
    }


}
