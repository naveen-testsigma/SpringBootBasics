package com.specification.studentsWithSpec.specification;
import com.specification.studentsWithSpec.entity.Section;
import com.specification.studentsWithSpec.entity.ShirtSize;
import com.specification.studentsWithSpec.entity.Student;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class StudentSpecification {
    public static Specification<Student> hasFirstName(String firstname)
    {
        return ((root, query, criteriaBuilder) -> {
            return  criteriaBuilder.equal(root.get("firstName"),firstname);
        });
    }
    public static Specification<Student> hasLastName(String lastname)
    {
        return ((root, query, criteriaBuilder) -> {
            return  criteriaBuilder.equal(root.get("lastName"),lastname);
        });
    }
    public static Specification<Student> hasShirtSize(ShirtSize shirtSize)
    {
        return ((root, query, criteriaBuilder) -> {
            return  criteriaBuilder.equal(root.get("shirtSize"),shirtSize);
        });
    }
    public static Specification<Student> hasSection(Section section)
    {
        return ((root, query, criteriaBuilder) -> {
            return  criteriaBuilder.equal(root.get("section"),section);
        });
    }

    public static Specification<Student> hasId(Long id)
    {
        return ((root, query, criteriaBuilder) -> {
            return  criteriaBuilder.equal(root.get("rollNo"),id);
        });
    }

}
