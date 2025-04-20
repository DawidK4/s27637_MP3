package dynamic;

import java.util.HashSet;
import java.util.Set;

public class Guest extends AccountUser{
    private int guestId;
    private static Set<Integer> ids = new HashSet<>();

    public Guest(AccountUser prevUser, int guestId) {
        super(prevUser.email);
        setGuestId(guestId);
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        if (ids.contains(Integer.valueOf(guestId))) {
            throw new IllegalArgumentException("Guest with provided id already exists!");
        }

        ids.add(Integer.valueOf(guestId));
        this.guestId = guestId;
    }
}
