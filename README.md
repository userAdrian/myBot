# Telegram Bot
This bot will send a phrase taken from a file 3 times a day.
# Usage
- Put your bot's token into the TOKEN variable located in `org.bot.App`.
- Run 'App' to start the bot.
# Features
- You can change the hours when the bot will send the phrases from `org.bot.HeadQuarter`.
- You can set a specific timezone from TIMEZONE valuable located in `org.bot.HeadQuarter`.
- A log file will be generated to check errors.
- Get a random phrase with '/randomPhrase' (cooldown of 12h)
- Objects with valuable information will the store locally every 10 minutes and loaded when the bot starts. Initially you will get an error because no file exits.
- You can add new phrases to the list and reaload it with '/realoadFilePhrases' (need to be admin -> add your chat_id in admins list located in `org.bot.HeadQuarter`).
# Warning
Each person has an internal tracker so they will receive only one time each phrase until the end of the list. If new phrases have been added, they will be available when the tracker is reset.