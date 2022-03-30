package by.gbyzzz.task07webxmlparsing.entity.repository;

import by.gbyzzz.task07webxmlparsing.entity.Users;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class UserRepository implements Repository<Users> {
    private static final Logger LOGGER = LogManager.getLogger();

    private static final UserRepository REPOSITORY = new UserRepository();

    public static UserRepository getRepository() {
        return REPOSITORY;
    }

    private static HashMap<Long,Users> storage = new HashMap<>();
    private UserRepository() {
    }

    @Override
    public void createOrUpdate(final Users user) {

        Long foundId = findId(user);
        if (foundId == null) {
            storage.put(user.getUserId(), user);
            LOGGER.trace("Adding new user with name %s to repository", user.getName());
        } else {
            Iterator it = storage.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                if (pair.getKey().equals(foundId)) {
                    it.remove();
                }
            }
            storage.put(user.getUserId(), user);
        }
    }

    @Override
    public void remove(final Users user) {
        Long foundId = findId(user);
        LOGGER.trace("Removing user with name %s from repository", user.getName());
        storage.remove(foundId);
    }

    @Override
    public HashMap read() {
        LOGGER.trace("Reading repository");
        HashMap<Long, Users> res = storage;
        return res;
    }

    private Long findId(final Users user) {
        LOGGER.trace("Looking for Id of user with name %s", user.getName());
        Long foundId = null;
        for (Long id : storage.keySet()) {
                if (id.equals(user.getUserId())) {
                    foundId = id;
            }
        }
        return foundId;
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "storage= " + storage +
                '}';
    }
}