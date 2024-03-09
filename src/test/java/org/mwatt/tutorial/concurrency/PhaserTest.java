package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Phaser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhaserTest {
    @Test
    void demonstratePhaserArrivalAndAwait() {
        Phaser phaser = new Phaser(3);
        phaser.register();

        assertEquals(0, phaser.arriveAndAwaitAdvance());
    }

    @Test
    void demonstratePhaserArriveAndDeregister() {
        Phaser phaser = new Phaser(2);
        phaser.register();

        assertEquals(0, phaser.arriveAndDeregister());
    }

    @Test
    void demonstratePhaserBulkRegister() {
        Phaser phaser = new Phaser();
        phaser.bulkRegister(3);

        assertEquals(0, phaser.arriveAndAwaitAdvance());
    }

    @Test
    void demonstratePhaserAwaitAdvance() {
        Phaser phaser = new Phaser(2);

        assertEquals(0, phaser.awaitAdvance(0));
    }

    @Test
    void demonstratePhaserForceTermination() {
        Phaser phaser = new Phaser(1);

        phaser.forceTermination();

        assertTrue(phaser.isTerminated());
    }
}
