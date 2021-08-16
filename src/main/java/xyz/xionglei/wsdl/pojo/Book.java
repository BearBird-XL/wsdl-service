package xyz.xionglei.wsdl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement// 标注xml根元素要以book开头
public class Book {

    private Long id;
    private String bookName;
    private double price;
}
