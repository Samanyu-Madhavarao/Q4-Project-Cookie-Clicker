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
1. The Cookie
2. CPS
3. Buildings
4. Upgrades
5. Achievements
6. Milk
7. The Stats Page
8. Quotes
9. Ascending
10. Easter Egg
## The Cookie

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
