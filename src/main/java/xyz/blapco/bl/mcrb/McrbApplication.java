package xyz.blapco.bl.mcrb;

import org.hibernate.dialect.SybaseAnywhereDialect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class McrbApplication {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please, insert username, password and role using the following format:");
			System.out.println("--username=user --password=pass --role=USER");
			System.exit(1);
		} else {
			String logo = "           .     mcrb -- self-hosted microblog\n" +
					"._ _  _.._.|_    version: 0.0.1\n" +
					"[ | )(_.[  [_)   source: git.blapco.xyz/Personal/mcrb\n" +
					"                 author: Biel Polastrini\n";
			System.out.println(logo);
		}
		SpringApplication.run(McrbApplication.class, args);
	}

}
