package kob.service.impl;

import kob.service.MatchingService;
import kob.service.impl.util.MatchingPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchingServiceImpl implements MatchingService {

    public final static MatchingPool matchingPool = new MatchingPool();

    @Override
    public String addPlayer(Integer userId, Integer rating) {
        System.out.println("add player" + userId + " " + rating);
        matchingPool.addPlayer(userId,rating);
        return "add successfully";
    }

    @Override
    public String removePlayer(Integer userId) {
        System.out.println("remove" + userId);
        matchingPool.removePlayer(userId);
        return "remove successfully";
    }
}
