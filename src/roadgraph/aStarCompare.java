package roadgraph;

import java.util.Comparator;

public class aStarCompare implements Comparator<MapNode> {

	@Override
	public int compare(MapNode node1, MapNode node2) {
		// TODO Auto-generated method stub
		if ((node1.getCost() + node1.getPredictedDistance()) > (node2.getCost() + node2.getPredictedDistance()))
			return 1;
		else if ((node1.getCost() + node1.getPredictedDistance()) < (node2.getCost() + node2.getPredictedDistance()))
			return -1;
		else
			return 0;
	}

}
