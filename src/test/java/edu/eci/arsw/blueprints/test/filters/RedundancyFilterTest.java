package edu.eci.arsw.blueprints.test.filters;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.persistence.impl.RedundancyFilter;

public class RedundancyFilterTest {

    @Test
    public void testRedundancyFilter() {
        edu.eci.arsw.blueprints.persistence.impl.RedundancyFilter filter = new RedundancyFilter();

        Point[] points = new Point[]{
            new Point(0, 0), new Point(0, 0), new Point(1, 1), new Point(1, 1), new Point(2, 2)
        };
        Blueprint blueprint = new Blueprint("author", "redundant", points);

        Blueprint filteredBlueprint = filter.filter(blueprint);

        Point[] expectedPoints = new Point[]{
            new Point(0, 0), new Point(1, 1), new Point(2, 2)
        };

        assertEquals("The redundancy filter did not remove consecutive duplicate points correctly.",
                     Arrays.asList(expectedPoints), filteredBlueprint.getPoints());
    }
}