package edu.eci.arsw.blueprints.test.filters;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;

public class SubsamplingFilterTest {

    @Test
    public void testSubsamplingFilter() {
        edu.eci.arsw.blueprints.persistence.impl.SubsamplingFilter filter = new edu.eci.arsw.blueprints.persistence.impl.SubsamplingFilter();

        Point[] points = new Point[]{
            new Point(0, 0), new Point(1, 1), new Point(2, 2), new Point(3, 3), new Point(4, 4)
        };
        Blueprint blueprint = new Blueprint("author", "subsampled", points);

        Blueprint filteredBlueprint = filter.filter(blueprint);

        Point[] expectedPoints = new Point[]{
            new Point(0, 0), new Point(2, 2), new Point(4, 4)
        };

        assertEquals("The subsampling filter did not correctly remove every second point.",
                     Arrays.asList(expectedPoints), filteredBlueprint.getPoints());
    }
}