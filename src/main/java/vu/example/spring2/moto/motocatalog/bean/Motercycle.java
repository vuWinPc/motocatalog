package vu.example.spring2.moto.motocatalog.bean;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
 * モーターサイクル
 */
@Data
@AllArgsConstructor //コンストラクタ（全ての項目をひき数にする）
@NoArgsConstructor //引数のないデフォルトコンストラクタも作る
public class Motercycle {
    private Integer motoNo;
    private String motoName;
    private Integer seatHeight;
    private Integer cylinder;
    private String cooling;
    private Integer price;
    private String comment;
    private Brand brand;
    private Integer version;
    private LocalDateTime isnDt;
    private LocalDateTime updDt;
   
    //こららのアクセサを描くのは面倒。lombok.Dataアノテーションをつければいい
    // public void setMotoNo(String motoNO){
    //     this.motoNo=motoNo;
    // }
    // public String getMotoNo(){
    //     return this.motoNo;
    // }

    //ここにコンストラクタを書いてもいいがlombocでかく
    // Motocycle(){

    // }
}
