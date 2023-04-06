package lk.ijse.hms.dao.custom.impl;

import lk.ijse.hms.dao.custom.StudentDAO;
import lk.ijse.hms.entity.Student;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :9:23 AM
 */

public class StudentDAOImpl implements StudentDAO {
    public StudentDAOImpl(Session session) {

    }

    @Override
    public boolean save(Student entity) {
        return false;
    }

    @Override
    public boolean update(Student entity) {
        return false;
    }

    @Override
    public boolean deleteByPk(String pk) {
        return false;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Optional<Student> findByPk(String pk) {
        return Optional.empty();
    }

    @Override
    public Optional<String> getLastPk() {
        return Optional.empty();
    }

    @Override
    public long count() {
        return 0;
    }
}
