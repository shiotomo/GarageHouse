package work.tomosse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import work.tomosse.service.AccountService;

@SpringBootApplication
public class GarageHouseApplication {

    @Autowired
    AccountService accountService;

    public static void main(final String[] args) {
        final var ctx = SpringApplication.run(GarageHouseApplication.class, args);
        final var app = ctx.getBean(GarageHouseApplication.class);
        app.execStartUp(args);
    }

    /**
     * ユーザがいなければADMINユーザを追加する
     *
     * @param args
     */
    public void execStartUp(final String[] args) {
        accountService.createAdmin();
    }
}
