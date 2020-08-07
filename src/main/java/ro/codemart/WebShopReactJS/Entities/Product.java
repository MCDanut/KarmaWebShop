package ro.codemart.WebShopReactJS.Entities;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Map;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String name;
    Float price;
    Integer stock;
    String description;
    String specification;
    Category category;

    @Transient
    Map<String,String> specificationMap;

    public void serializeSpecification()  {
        Gson gson = new Gson();
        this.specification = gson.toJson(this.specificationMap);
    }

    public void deserializeSpecification() {
        Gson gson = new Gson();
        this.specificationMap = gson.fromJson(this.specification, Map.class);
    }


}
