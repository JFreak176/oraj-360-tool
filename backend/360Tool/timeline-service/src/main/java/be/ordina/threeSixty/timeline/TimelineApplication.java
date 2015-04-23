package be.ordina.threeSixty.timeline;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by stevedezitter on 15/04/15.
 */
@SpringCloudApplication
@ComponentScan({"be.ordina.threeSixty.timeline","be.ordina.threeSixty.common"})
public class TimelineApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimelineApplication.class, args);
    }
}
