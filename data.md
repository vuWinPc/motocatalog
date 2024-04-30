#### モーターサイクルマスタ(m_motorcycle)

|No.|論理名|物理名|データ型(桁)|Not Null|Primary|
|--:|---|---|---|:-:|:-:|
|1|バイク番号|moto_no|INT|o|o|
|2|バイク名|moto_name|VARCHAR(100)|-|-|
|3|シート高|seat_height|INT|-|-|
|4|シリンダー|cylinder|INT|-|-|
|5|冷却|cooling|INT|-|-|
|6|価格|price|INT|-|-|
|7|コメント|comment|VARCHAR(200)|-|-|
|8|ブランドID|brand_id|VARCHAR(2)|-|-|
|9|バージョン|version|INT|-|-|
|10|登録日時|ins_dt|DATETIME|-|-|
|11|更新日時|upd_dt|DATETIME|-|-|

#### ブランドマスタ(m_brand)

|No.|論理名|物理名|データ型(桁)|Not Null|Primary|
|--:|---|---|---|:-:|:-:|
|1|ブランドID|brand_id|VARCHAR(2)|o|o|
|2|ブラン