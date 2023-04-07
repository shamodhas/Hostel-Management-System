package lk.ijse.hms.bo.custom.impl;

import lk.ijse.hms.bo.custom.StudentBO;
import lk.ijse.hms.bo.util.Convertor;
import lk.ijse.hms.dao.DaoFactory;
import lk.ijse.hms.dao.DaoTypes;
import lk.ijse.hms.dao.custom.StudentDAO;
import lk.ijse.hms.dto.StudentDTO;
import lk.ijse.hms.util.FactoryConfiguration;
import org.hibernate.Session;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :1:58 PM
 */

public class StudentBOImpl implements StudentBO {
    private final Convertor convertor = new Convertor();
    private final StudentDAO studentDAO = DaoFactory.getInstance().getDAO(DaoTypes.STUDENT);
    @Override
    public List<StudentDTO> getAllStudent() {
        Session session = FactoryConfiguration.getInstance().getSession();
        try {
            return studentDAO.findAll(session).stream().map(student -> convertor.fromStudent(student)).collect(Collectors.toList());
        }finally {
            session.close();
        }
    }

    @Override
    public List<StudentDTO> searchBookByText(String text) {
        Session session = FactoryConfiguration.getInstance().getSession();
        try {
            return studentDAO.search(text, session).stream().map(student -> convertor.fromStudent(student)).collect(Collectors.toList());
        }finally {
            session.close();
        }
    }

    @Override
    public StudentDTO getStudentById(String studentId) {
        Session session = FactoryConfiguration.getInstance().getSession();
        try {
            return convertor.fromStudent(studentDAO.findByPk(studentId, session).get());
        }finally {
            session.close();
        }
    }
}
