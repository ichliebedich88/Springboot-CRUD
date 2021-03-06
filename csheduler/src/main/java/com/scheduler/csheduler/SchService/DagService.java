package com.scheduler.csheduler.SchService;

import com.scheduler.csheduler.dao.DagDao;
import com.scheduler.csheduler.bean.Dag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DagService implements DagDao {
    @Autowired
    private DagDao dagDao;

    @Override
    public Dag getDagById(Integer id) {
        return dagDao.getDagById(id);
    }

    @Override
    public List<Dag> getAllDags() {
        return dagDao.getAllDags();
    }

    @Override
    public int deleteDagById(Integer id) {
        return dagDao.deleteDagById(id);
    }

    @Override
    public int addDag(String describe,String owner){
        return dagDao.addDag(describe,owner);
    }

    @Override
    public Dag getNewDag(String describe,String owner){
        return dagDao.getNewDag(describe,owner);
    }

    @Override
    public List<Dag> getAllDagsNotBinding(){
        return dagDao.getAllDagsNotBinding();
    }

    @Override
    public int giveRoomForDag(Integer dagId,Integer roomId){
        return dagDao.giveRoomForDag(dagId,roomId);
    }

    @Override
    public List<Dag> getDagBound(){
        return  dagDao.getDagBound();
    }

    @Override
    public int unboundDag(Integer id)
    {
        return dagDao.unboundDag(id);
    }
}
