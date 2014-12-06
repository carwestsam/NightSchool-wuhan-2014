package org.nightschool.model;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CartTest {
    @Test
    public void should_be_empty_when_no_disk_added() throws Exception {
        Cart cart = new Cart();

        List<Disk> disks = cart.getDisks();

        assertThat(disks.size(), is(0));
    }

    @Test
    public void should_able_to_add_disk_to_cart() throws Exception {
        Cart cart = new Cart();
        Disk disk = new Disk();

        cart.addDisk(disk);

        assertThat(cart.getDisks().size(), is(1));
    }
}
