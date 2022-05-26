# Q4-Project-Confection-Clacker
![Confection Clacker](https://user-images.githubusercontent.com/46302766/169894890-4d501b4b-0b0e-4d44-9bb1-a15d7904ec6b.PNG)
Confection Clacker is a game where the player has to click a cookie and try managing an empire of cookie generators. The goal of the game is to reach the highest number of
cookies as possible, although there is not a maximum amount.
There are multiple methods given to the player to increase the amount of cookies, including:
- Clicking the cookie
- Buying buildings that passively generate cookies
- Buying upgrades that increase the efficiency of buildings and your cursor
- One "secret" that rewards lots of cookies
### Table of Contents
1. [The Cookie](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/README.md#the-cookie)
2. [CPS](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker#cps)
3. [Buildings](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker#buildings)
4. [Upgrades](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker#upgrades)
5. [Achievements](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker#achievements)
6. [Milk](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker#milk)
7. [The Stats Page](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker#the-stats-page)
8. [Quotes](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker#quotes)
9. [Ascending](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker#ascending)
10. [Easter Egg](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker#easter-eggs)
## The Cookie

![Cookie](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/MainCookie.png)

The large cookie on the left is the most important part of the game. The mechanic behind it is very simple. Clicking it will increase you cookie count
by 1. Purchasing the first two upgrades will increase the amount you get from one click to 5 and then 50. Like most buttons, this was done by checking 
if the mouse is held within the coordinates of the cookie sprite to shrink it, and its size is increased when the mouse is released.

## CPS

CPS stands for **Cookies Per Second**, and represents the sum of all passive upgrades that the player has unlocked. To increase CPS, the player must:
- Buy buildings
- Buy Upgrades
- Ascend

## Buildings
Buildings are the best way to earn cookies in the game. There are six archetypes of buildings, with each one being better than the last. Those buildings are:
1. Farm ![Farm](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/Farm.png)
2. Mine ![Mine](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/Mine.png)
3. Factory ![Factory](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/factory.png)
4. Country ![Country](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/Country.png)
5. Colony ![Colony](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/Colony.png)
6. Galaxy ![Galaxy](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/Galaxy.png)

To purchase a building, go to the shop, found on the right side, and click the button that corresponds to the building that you want to buy. Once you buy a building, the price of that building will increase, meaning that your next purchase will be more expensive. Once you own a building, it will generate a fixed amount of cookies every second, but it can be increased by purchasing upgrades.

![Building Shop](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/BuildingShop.PNG)

The buildings that you own will be displayed on the center of the game. Each building archetype has a random x and y value generated, and the x will increase by a random amount until it surpasses the background. Once that happens, you can still purchase more buildings, but they will not be displayed. To see all of the buidlings you own, open the stats page.

![Building Display](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/BuildingDisplay.PNG)

## Upgrades
Upgrades are another purchasable item that provide various different upgrades to either buildings, your cursor, or overall CPS. Each upgrade has a rarity (**common (green), rare (blue), epic (purple), and legendary (yellow)**) that determines the price of that upgrade. You can only purchase one of each upgrade, and buying it will increase the price of all other items of the same rarity. There are currently 20 upgrades:

![Row1](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/UpgradeRow1.PNG)
- Cursor Upgrade 1
- Cursor Upgrade 2
- Farm Upgrade 1
- Farm Upgrade 2
- Mine Upgrade 1

![Row 2](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/UpgradeRow2.PNG)
- Mine Upgrade 2
- Factory Upgrade 1
- Factory Upgrade 2
- Country Upgrade 1
- Country Upgrade 2

![Row 3](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/UpgradeRow3.PNG)
- Colony Upgrade 1
- Colony Upgrade 2
- Galaxy Upgrade 1
- Galaxy Upgrade 2
- CPS Upgrade 1

![Row 4](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/UpgradeRow4.PNG)
- CPS Upgrade 2
- CPS Upgrade 3
- CPS Upgrade 4
- Building Upgrade
- CPS Upgrade 5

You can find the prices on the stats page.

## Achievements
There are eleven achievements that can be unlocked in Wafer Whacker. The requirements to unlock these achievements are hidden, but they are all fairly simple.

![10 CPS](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/10CPS.png)
- **10 CPS** - Reach a CPS of 10

![10000 CPS](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/10000%2BCPS.png)
- **10000 CPS** - Reach a CPS of 10000

![Million Cookies](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/1MilCookies.png)
- **1 Million Cookies** - Reach 1 million cookies

![Secret Part 1](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/AmogusCookie.png)
- **Easter Egg: Part 1** - Find the first part of the secret hidden in the game

![Secret Part 2](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/TypeAmogus.png)
- **Easter Egg: Part 2** - Find the second part of the easter egg

![Child Labor](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/Factory_Blood.png)
- **Child Labor** - Own 10 factories and 5 countries

![World Countrol](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/WorldControl.png)
- **World Control** - Own 10 of all earth based buildings

![All Upgrades](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/AllUpgrades.png)
- **All Upgrades** - Unlock all avalible upgrades

![Cookie God](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/CookieGod.png)
- **Cookie God** - Own 10 of every building

![King](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/CursedKing.png)
- **King** - Obtain negative cookies (Trust me, its possible)

All of your achivements will be tracked through the stats page, and a golden background will be placed behind the achivements that you have unlocked so far.

## Milk
Milk is located below the main cookie that the player clicks, and will change color based on the amount of achivements the player has unlocked. 

![Regular Milk](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/Milk1.gif)
- **Regular Milk** - 0-2 Achivements unlocked

![Chocolate Milk](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/Milk2.gif)
- **Chocolate Milk** - 5-7 Achivements unlocked

![Blood Milk](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/Milk3.gif)
- **Blood Milk** - 8-10 Achivements unlocked

![Galaxy Milk](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/Milk4.gif)
- **Galaxy Milk** - All achivements unlocked

## The Stats Page
The stats page is opened via a button on the upper right hand side above buildings. Upon clicking, various information like the pricing of buildings, total buildings owned, max cookies and achivements are all shown. 

When opened looks like this:

![Stats Page](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/StatsPage.PNG)


## Quotes
Quotes are located right next to the stats button above buildings, and display one quote at a time. There are 15 quotes total, and the quote featured will change every 15 seconds. Some quotes featured are helpful to the player, and some are just for the purpose of the game.
- "Click the amogus"
- "Do not type amogus" 
- "Do not click the amogus"
- "Sometimes when I close my eyes, I can't see"
- "Did you sabotage O2? 'Cause you are taking my breath away."

## Ascending 
You are able to ascend in Biscuit Beater if you reach a specific amount of cookies, which is 20 billion cookies achieved. If you ever get to this point, you will be rewarded with a 50% decrease in cookies per second in total each time you reach this amount of cookies. You will be rewarded a golden wookie in the upper left hand corner each time you ascend, and this keeps track of the percentage decrease per ascension.

![Golden Cookie](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/GoldenCookie.png)
- **Golden Cookie** - Represents the amount of ascensions the player has achieved


## Easter Eggs
There are various easter eggs throughout this game, but the main one is probably the among us character which is visible around the country section of buildings. Upon clicking this among us, the player will receive 100,000 cookies per click. If the word "amogus" is typed at any time, this amount awarded will be upgraded to 1,000,000 cookies per click. However, there is another among us character near the galaxy section that will do nothing when clicked, which is just to trick the player. 

![The Imposter](https://github.com/Samanyu-Madhavarao/Q4-Project-Cookie-Clicker/blob/master/Cookie%20Clicker/src/imgs/amongus.png)
- **The Imposter** - The character that you can click for extra cookies

