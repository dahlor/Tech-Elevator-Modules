package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		
		System.out.println("There are " + remainingNumberOfBirds + " birds left.");

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		
		System.out.println("There are " + numberOfExtraBirds + " more birds than nests.");


        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		
		int playingRaccoons = 3;
		int hungryRaccoons = 2;
		int woodsyRaccoons = playingRaccoons - hungryRaccoons;
		
		System.out.println("There is " + woodsyRaccoons + " raccoon left in the woods.");


		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		
		int flowers = 5;
		int bees = 3;
		int beesThanFlowers = flowers - bees;
		
		System.out.println("There are " + beesThanFlowers + " less bees than flowers.");

        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		
		int lonelyPigeon = 1;
		int newPigeon = 1;
		int totalPidges = lonelyPigeon + newPigeon;
		
		System.out.println("There are " + totalPidges + " pigeons eating breadcrumbs.");

        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		
		int oldOwls = 3;
		int newOwls = 2;
		int totalOwlage = oldOwls + newOwls;
		
		System.out.println("There are " + totalOwlage + " owls on the fence.");

        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		
		int homeBeavers = 2;
		int swimBeavers = 1;
		int totalBeavers = homeBeavers - swimBeavers;
		
		System.out.println("There is " + totalBeavers + " beaver still working on their home.");

        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
        
		int treeCans = 2;
		int newCan = 1;
		int allCans = treeCans + newCan;
		
		System.out.println("There are " + allCans + " toucans sitting on a tree limb.");
       

        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		
		int squirrels = 4;
		int nuts = 2;
		int howManyMoreSquirrels = squirrels - nuts;
		
		System.out.println("There are " + howManyMoreSquirrels + " more squirrels than nuts.");

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int moneyFound = (quarter + dime + 2*nickel);
		
		System.out.println("Mrs. Hilt found " + moneyFound + " cents.");

        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		
		int mrsBrier = 18;
		int mrsMacAdams = 20;
		int mrsFlannery = 17;
		int totalMuffins = mrsBrier + mrsMacAdams + mrsFlannery;
		
		System.out.println("The first grade classes baked " + totalMuffins + " muffins in total.");

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		
		int yoyo = 24;
		int whistle = 14;
		int toyTotal = yoyo + whistle;
		
		System.out.println("Mrs. Hilt spent " + toyTotal + " cents in total for the two toys.");

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		
		int largeMarsh = 8;
		int miniMarsh = 10;
		int totalMarsh = largeMarsh + miniMarsh;
		
		System.out.println("Mrs. Hilt used " + totalMarsh + " marshmallows altogether.");

        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		
		int hiltSnow = 29;
		int brecknockSnow = 17;
		int snowDiff = hiltSnow - brecknockSnow;
		
		System.out.println("Mrs. Hilt's house got " + snowDiff + " more inches of snow than Brecknock Elementary School did.");

        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		
		int hiltCash = 10;
		int toyTruck = 3;
		int pencilCase = 2;
		int totalExpenditures = toyTruck + pencilCase;
		int moneyLeft = hiltCash - totalExpenditures;
		
		System.out.println("Mrs. Hilt had $" + moneyLeft + " left over.");

        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		
		int marbles = 16;
		int lostMarbles = 7;
		int marblesLeft = marbles - lostMarbles;
		
		System.out.println("Josh has " + marblesLeft + " marbles now.");

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		
		int megsShells = 19;
		int optimalShells = 25;
		int shellDiff = optimalShells - megsShells;
		
		System.out.println("Megan will need " + shellDiff + " more shells to have 25 in her collection.");

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		
		int bradsBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = bradsBalloons - redBalloons;
		
		System.out.println("Brad has " + greenBalloons + " green balloons.");

        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		
		int shelfBooks = 38;
		int martasBooks = 10;
		int totalBooks = shelfBooks + martasBooks;
		
		System.out.println("There are " + totalBooks + " books on the shelf now.");

        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int beeLegs = 6;
		int eightBeesLegs = beeLegs * 8;
		
		System.out.println("If a bee has 6 legs, then 8 bees would have " + eightBeesLegs + " legs.");
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		
		double conePrice = 0.99;
		double twoCones = conePrice * 2.0;
		
		System.out.println("If one ice cream cone is 99 cents, then two ice cream cones would cost $" + twoCones + ".");
				

        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		
		int totalNeededRocks = 125;
		int rocks = 64;
		int diffRocks = totalNeededRocks - rocks;
		
		System.out.println("Mrs. Hilt needs " + diffRocks + " more rocks to complete the border.");

        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		
		int hiltMarbles = 38;
		int hiltLostMarbles = 15;
		int hiltMarblesLeft = hiltMarbles - hiltLostMarbles;
		
		System.out.println("Mrs. Hilt has " + hiltMarblesLeft + " marbles left.");

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		
		int concertMiles = 78;
		int gasStop = 32;
		int leftToDrive = concertMiles - gasStop;
		
		System.out.println("They had " + leftToDrive + " miles left to drive.");

        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		
		int satMornShovel = 90;
		int satAftShovel = 45;
		int satShovelMins = satMornShovel + satAftShovel;
		
		System.out.println("Mrs. Hilt spent " + satShovelMins/60 + " hours and " + satShovelMins%60 + " minutes shoveling snow.");

        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		
		double dogCount = 6.0;
		double dogCost = .5;
		double dogPaid = dogCount * dogCost;
		
		System.out.println("Mrs. Hilt paid $" + dogPaid + "0 for all of the hot dogs."); // It's not a cheap trick if it works.
        
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		int hiltCoin = 50;
		int pencilPrice = 7;
		int affordablePencils = hiltCoin / pencilPrice;
		
		System.out.println("Mrs. Hilt can afford " + affordablePencils + " pencils.");
		
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		
		int butterflies = 33;
		int orangeOnes = 20;
		int redOnes = butterflies - orangeOnes;
		
		System.out.println(redOnes + " of the butterflies Mrs. Hilt saw were red.");

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		
		int kateCash = 100;
		int candyCost = 54;
		int kateChange = kateCash - candyCost;
		
		System.out.println("Kate should get $." + kateChange + " back in change.");

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		
		int markTrees = 13;
		int moreTrees = 12;
		int totalTrees = markTrees + moreTrees;
		
		System.out.println("Mark will have " + totalTrees + " trees in his backyard.");

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		
		int days = 2;
		int hoursInADay = 24;
		int timeTillMeeMaw = days * hoursInADay;
		
		System.out.println("Joy will see her grandma in " + timeTillMeeMaw + " hours.");

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		
		int cousins = 4;
		int gumPerCuz = 5;
		int gumNeed = cousins * gumPerCuz;
		
		System.out.println("Kim will need " + gumNeed + " pieces of gum.");

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		
		int danBux = 3;
		int candyBar = 1;
		int danSoPoor = danBux - candyBar;
		
		System.out.println("Dan has $" + danSoPoor + ".00 left."); // See: Line 304

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		
		int boats = 5;
		int pplPerBoat = 3;
		int totalPpl = boats * pplPerBoat;
		
		System.out.println("There are " + totalPpl + " people on boats in the lake.");

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		
		int lego = 380; // https://twitter.com/LEGO_Group/status/842115345280294912
		int lostLego = 57;
		int remainingLego = lego - lostLego;
		
		System.out.println("Ellen has " + remainingLego + " Lego now.");
		

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int bakedMuffins = 35;
		int desiredMuffins = 83;
		int muffinDifferential = desiredMuffins - bakedMuffins;
		
		System.out.println("Arthur needs to bake " + muffinDifferential + " more muffins to have a total of 83 muffins.");
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		
		int wilCrans = 1400;
		int lucyCrans = 290;
		int weirdFlexWil = wilCrans - lucyCrans;
		
		System.out.println("Willy has " + weirdFlexWil + " more crayons than Lucy.");

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		
		int stickersPerPage = 10;
		int totalPages = 22;
		int soManyStickers = stickersPerPage * totalPages;
		
		System.out.println("I have " + soManyStickers + " stickers in my book of stickers. The ladies love them.");

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		
		int totalCupcakes = 96;
		int obeseChildren = 8;
		int cupcakesPerObeseChild = totalCupcakes / obeseChildren;
		
		System.out.println("If they share the cupcakes equally, each child will get " + cupcakesPerObeseChild + " cupcakes.");

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		
		int gingerbreads = 47;
		int teenyJarCapacity = 6;
		int noRoomForYou = gingerbreads % teenyJarCapacity;
		
		System.out.println("There will be " + noRoomForYou + " gingerbread cookies not placed in a jar.");

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		
		int cwassants = 59;
		int nayburs = 8;
		int snacksToKeep = cwassants % nayburs;
		
		System.out.println("Marian will get to keep " + snacksToKeep + " croissants all to herself.");
	

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		
		int oatmealCookies = 276;
		int cookiesPerTray = 12;
		int howManyTrays = oatmealCookies / cookiesPerTray;
		
		System.out.println("Marian will need " + howManyTrays + " trays to prepare 276 cookies at a time.");

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		
		int pretzels = 480;
		int singleServing = 12;
		int totalServings = pretzels / singleServing;
		
		System.out.println("Marian was able to prepare " + totalServings + " servings.");

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		
		int lemonCupcakes = 53;
		int cupcakesForgotten = 2;
		int cupcakesPerBox = 3;
		int givenBoxes = ((lemonCupcakes - cupcakesForgotten) / cupcakesPerBox);
		
		System.out.println("Marian gave " + givenBoxes + " boxes of cupcakes to the orphans.");

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		
		int carrotSticks = 74;
		int peopleWhoWereStrangelyBothAtSusiesHouseAndEatingCarrotSticksForBreakfast = 12;
		int uneatenCarrotSticks = carrotSticks % peopleWhoWereStrangelyBothAtSusiesHouseAndEatingCarrotSticksForBreakfast;
		
		System.out.println(uneatenCarrotSticks + " carrot sticks were left uneaten.");
		

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		
		int hoardedBears = 98;
		int ikeaShelfCapacity = 7;
		int numberOfFullShelves = hoardedBears / ikeaShelfCapacity;
		
		System.out.println("Susie and her sister will have " + numberOfFullShelves + " full shelves of teddy bears.");

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		
		int pics = 480;
		int albumCapacity = 20;
		int neededAlbums = pics / albumCapacity;
		
		System.out.println("Susie's mother will need " + neededAlbums + " albums to fit all of her pictures.");
		

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		
		int joesCards = 94;
		int boxCapacity = 8;
		int boxedCards = joesCards / boxCapacity;
		int leftoverCards = joesCards % boxCapacity;
		
		System.out.println("After Joe organized everything, he had " + boxedCards + " boxes of cards and " + leftoverCards + " cards left over.");

			
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int books = 210;
		int shelves = 10;
		int shelfCapacity = books / shelves;
		
		System.out.println("Each shelf will contain " + shelfCapacity + " books.");
		
		
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		
		int kersants = 17;
		int guests =  7;
		int kersantsPerGuest = kersants / guests;
		int remainingKersants = kersants % guests;
		
		System.out.println("Each guest will have " + kersantsPerGuest + " croissants for themselves with " + remainingKersants + " croissants left over for Cristina to eat.");
		

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

		int roomLength = 12;
		int roomWidth = 14;
		int roomArea = roomLength * roomWidth;
		
		double billTimePerRoom = 2.15;
		double billRate = roomArea / billTimePerRoom;
		double jillTimePerRoom = 1.9;
		double jillRate = roomArea / jillTimePerRoom;
		double teamRate = billRate + jillRate;
		
		int largerRoomArea = roomArea * 5;
		double teamTime = largerRoomArea / teamRate;
		
		int megaRoomArea = roomArea * 623;
		double megaTeamTime = megaRoomArea / teamRate;
		int megaHoursPerDay = 8;
		double megaTeamDays = megaTeamTime / megaHoursPerDay;	// Yeah, it's unnecessarily verbose, but WE'RE SHOWING OUR WORK HERE
		
		System.out.println("Working together, it will take Bill and Jill " + teamTime + " hours to paint the five rooms. To paint the 623 rooms, it would take them " + megaTeamDays + " days.");
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		
		String firstName = "Eric";
		String middleInitial = "C";
		String lastName = "Dahl";
		
		String wholeAssName = (lastName + ", " + firstName + " " + middleInitial + ".");
				
	    System.out.println(wholeAssName);

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */

	    double nyChiDistance = 800;
	    double trainHasTravelled = 537;
	    double percentCompleted = (trainHasTravelled / nyChiDistance) * 100;
	    int integerPercentCompleted = (int)percentCompleted;
	    
	    System.out.println(integerPercentCompleted + "% of the trip has been completed.");
	    
	}

}
