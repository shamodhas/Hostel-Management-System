package lk.ijse.hms.dao;

import lk.ijse.hms.entity.SuperEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :9:22 AM
 */

public interface CrudDAO<T extends SuperEntity,ID extends Serializable> extends SuperDAO{
    boolean save(T entity);

    boolean update(T entity);

    boolean deleteByPk(ID id);

    List<T> findAll();

    Optional<T> findByPk(ID id);

    Optional<String> getLastPk();

    long count();

}
