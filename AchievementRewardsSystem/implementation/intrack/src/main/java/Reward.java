import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
<<<<<<< HEAD
public class Reward {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String name;

    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }




    
}
=======
public class Reward{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long Id;

 private String name;

public long getId() {
    return Id;
}

public void setId(long id) {
    Id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

 
    

}
>>>>>>> 412cd7732da674e6b77c4e57f37ab7d18735f68b
