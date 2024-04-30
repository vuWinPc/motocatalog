package vu.example.spring2.moto.motocatalog.bean;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * バイクメーカ（ブランド）
 * 
 */
@Data
@AllArgsConstructor //コンストラクタ（全ての項目をひき数にする）
@NoArgsConstructor //引数のないデフォルトコンストラクタも作る
public class Brand {
    private String brandId;
    private String brandName;
}
