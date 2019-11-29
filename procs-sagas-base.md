# procs-gradle-cli.md
## start
```sh
$ ./gradlew -PmainClass=com.sagas.actors.bus.BlueSrvMain run

# receive entity events: com.sagas.actors.bus.RabbitEventReceiver
start events

## bots
# bot-server: workspace/rasa/dockerize/, run
# 如果修改了data/stories.md, 需要执行: train-core.sh
$ ./gradlew -PmainClass=com.sagas.actors.bots.BotTalkMain run
```

