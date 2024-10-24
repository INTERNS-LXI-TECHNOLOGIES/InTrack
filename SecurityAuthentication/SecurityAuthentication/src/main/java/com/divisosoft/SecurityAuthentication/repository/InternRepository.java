    package com.divisosoft.SecurityAuthentication.repository;

    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    import com.divisosoft.SecurityAuthentication.model.Intern;

    
    @Repository
    public interface InternRepository extends JpaRepository<Intern,Long>{

        Intern  findByEmail(String email);
        
    }
