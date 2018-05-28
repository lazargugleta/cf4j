package cf4j.algorithms.recipes;

import cf4j.algorithms.TestPredictions;
import cf4j.algorithms.knn.userToUser.neighbors.UserNeighbors;
import cf4j.algorithms.knn.userToUser.similarities.UserSimilarities;
import cf4j.process.Processor;

public class KNN {

	public static void userToUser (UserSimilarities similarities, UserNeighbors neighbors, TestPredictions aggregationApproach) {
		Processor.getInstance().testUsersProcess(similarities);
		Processor.getInstance().testUsersProcess(neighbors);
		Processor.getInstance().testUsersProcess(aggregationApproach);
	}
}
