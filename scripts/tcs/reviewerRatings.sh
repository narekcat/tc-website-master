CP=/home/coder/web/resources:/home/coder/web/build/classes:/home/coder/web/lib/bin/classes.jar:/home/coder/web/lib/bin/shared.jar:/home/coder/web/lib/jars/log4j-1.2.7.jar:/home/coder/web/lib/jars/log4j-boot.jar:/home/coder/web/lib/jars/ifxjdbc.jar:/home/coder/web/lib/jars/tcs/email_engine.jar:/home/coder/web/lib/jars/jboss/mail.jar:/home/coder/web/lib/jars/tcs/configuration_manager/2.1.3/configuration_manager.jar:/home/coder/web/lib/jars/activation.jar

nohup java  -cp $CP com.topcoder.shared.util.sql.DBUtilityLauncher com.topcoder.utilities.tcs.ReviewerRatings -xmlfile /home/coder/web/scripts/tcs/reviewerRatings.xml $@ >> /home/coder/web/scripts/tcs/reviewerRatings.out 2>&1 &