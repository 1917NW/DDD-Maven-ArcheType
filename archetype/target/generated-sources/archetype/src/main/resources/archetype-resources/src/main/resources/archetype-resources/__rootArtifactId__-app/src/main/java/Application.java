#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
${symbol_pound}set( ${symbol_dollar}symbol_pound = '${symbol_pound}' )
${symbol_pound}set( ${symbol_dollar}symbol_dollar = '${symbol_dollar}' )
${symbol_pound}set( ${symbol_dollar}symbol_escape = '${symbol_escape}' )
package ${symbol_dollar}{package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
