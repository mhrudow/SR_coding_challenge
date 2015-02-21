# SR_coding_challenge
SevenRooms Coding Challenge
This is my solution to the coding challenge posted by SevenRooms.

Answers
1: Serena Williamson wins the most and Jean Claude Van Dime loses the most

2: By playing repeated series (each player goes against each other player an equal amount of times) I was able to find out the rankings by using an arbitrarily large number. By playing head-to-head, I was able to find the following numbers for 1,000,000 matches for each combination of players: 
match 1: Bruce Leeds won 479540 and Serena Williamson won 520460
match 1  : Bruce Leeds won 47.954% and Serena Williamson won 52.04600000000001%
match 2: Bruce Leeds won 759660 and Jean Claude Van Dime won 240340
match 2  : Bruce Leeds won 75.966% and Jean Claude Van Dime won 24.034%
match 3: Serena Williamson won 892371 and Jean Claude Van Dime won 107629
match 3  : Serena Williamson won 89.2371% and Jean Claude Van Dime won 10.7629% Clearly the closest match was match 1. Each match is independent of every other match. The chance of match 1 resulting in an accurate outcome on any given match is approximately 52.046%. The chance of match 2 resulting in an accurate outcome is approximately 75.966% and the chance of match 3 resulting in an accurate outcome is approximately 89.2371% Hence if we use head to head rankings to determine which player wins the most and which loses them most, if we run enough simulations for to make the probability that the overall winner in match 1 is SW close to 100%, then the probability that the appropriate winners of matches 2 and 3 will come about is even closer to 100%. 
The series of matches in match 1 can be thought of as a binomial distribution with the possibility in N matches of Serena winning k is (N¦K)*〖0.52046〗^K*〖0.47954〗^(N-K). Hence the expected number of wins for Serena is 0.52046*N, the variance is 0.52046*N*0.47954 = 0.2495813884*N and the standard deviation is .499581213*√n and 4 standard deviations is 1.998324852*√n If we run enough simulations such that the expected number of wins – 3 standard deviations is still greater than .5*N then the probability of the majority of games being won by Bruce Leeds is 0.003167% so the probability of accurate outcome is 99.996833%. hence we need N large enough s.t. 0.52046*N – 1.998324852*√N> .5*N or .02046*N-2 √N≥0 or 0.02046*N≥2*√N or .01023*√N≥1 or √N≥97.75171065 and thus N≥9555.396936. Thus if we run the simulation 9556 or more times, we have over a 99.99% chance of accuracy for match 1. Since in match 1 we have the smallest probability of success, the probability of success for matches 2 and 3 individually by similar arguments must be > 99.996833% hence since they are independent, the probability of matches 1, 2, and 3 all resulting in accurate outcomes for N >9556 is strictly greater than 100*.99996833^3 = 99.9904993%.

Problem 3: 
Player 4 - Rojey Federation
	Probability of hitting shot type:
	0% flat
	95% slice
	0% topspin
	5% unreturnable
	Probability of returning a shot of type:
	65% flat
	81% slice
	54% topspin
Running the simulation 1,000,000 times we get
match 1: Rojer Federation won 912776 and Bruce Leeds won 87224
match 1  : Rojer Federation won 91.2776% and Bruce Leeds won 8.7224%
match 2: Rojer Federation won 993045 and Serena Williamson won 6955
match 2  : Rojer Federation won 99.30449999999999% and Serena Williamson won 0.6955%
match 3: Rojer Federation won 968800 and Jean Claude Van Dime won 31200
match 3  : Rojer Federation won 96.88% and Jean Claude Van Dime won 3.1199999999999997% hence Rojer wins head to head against everyone. The smallest percentage wins he has is 91.2776% > 53%. To run the head to head simulation, there would now be 6 matches. The one match with the smallest likelihood of accurate income is still Serena vs. Bruce and if we take that probability of accuracy as the probability for accuracy for all matches (even though it is the strictly smallest probability of accuracy) then with .99996833^6*100 we still have over 99.980995% accuracy of outcome.
