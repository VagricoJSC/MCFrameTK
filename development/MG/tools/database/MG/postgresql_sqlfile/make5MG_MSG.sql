\encoding UTF-8

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBAD0001',
	'W',
	'汎用シミュレーション用のシミュレーションＮＯとして登録されていません。\nシミュレーションＮＯ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBAD0002',
	'W',
	'品目マスタに有効な品目として登録されていません。\n品目：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBAD0003',
	'W',
	'品目マスタに資産管理可能な品目として登録されていません。取込対象になりません。\n品目：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBAD0004',
	'W',
	'場所マスタに有効な場所として登録されていません。\n場所ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBAD0005',
	'W',
	'取引先マスタに有効な取引先として登録されていません。\n発注先ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBAD0006',
	'W',
	'取引先マスタに有効な取引先として登録されていません。\n得意先ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0007' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBAD0007',
	'W',
	'取引先マスタに有効な取引先として登録されていません。\n納品先ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0008' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBAD0008',
	'W',
	'取引先マスタに有効な取引先として登録されていません。\n仕向先ＣＤ１：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0009' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBAD0009',
	'W',
	'取引先マスタに有効な取引先として登録されていません。\n仕向先ＣＤ２：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0010' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBAD0010',
	'W',
	'取引先マスタに有効な取引先として登録されていません。\n仕向先ＣＤ３：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBP0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBP0004',
	'W',
	'コピー元データとコピー先データが同じです。異なる計算グループまたは年月を指定してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBL0001',
	'W',
	'対象となる費目の合計金額がゼロのため登録できません。\n必ず合計金額がゼロ以外になるようにしてください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBL0002',
	'W',
	'資産管理対象外の品目を指定した場合のみ以下の項目を指定できます。\n項目：配賦場所ＣＤ、配賦工程ＣＤ、配賦品群ＣＤ\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBL0003',
	'W',
	'ＳＣＭモジュールがインストールされていないため、指図情報の更新ができませんでした。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBL0004',
	'W',
	'ＳＣＭモジュールがインストールされていないため、取込対象のデータを確認することができませんでした。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0022' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBL0022',
	'W',
	'コピー元データとコピー先データが同じです。異なる計算グループまたは年月を指定してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0023' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBL0023',
	'W',
	'製造実績グループを指定した場合は、以下の項目を指定できません。\n項目：部門ＣＤ、品群ＣＤ、場所ＣＤ、工程ＣＤ、ロットＮＯ、サブロットＮＯ、手配ＮＯ\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0024' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBL0024',
	'W',
	'取引先が指定された自社資産の在庫のみ、買戻義務を指定できます。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0025' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBL0025',
	'W',
	'対象となる費目の合計金額がゼロのため登録できません。\n必ず合計金額がゼロ以外になるようにしてください。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0026' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBL0026',
	'W',
	'当月の原価計算が確定しているため、処理できません。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n年月：{3}\n{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0001',
	'W',
	'複数の計算グループ・年月を指定しています。\n評価替処理では１つの計算グループ・年月にのみ処理できます。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0002',
	'W',
	'対象の計算グループの計算品目に指定されている計算カテゴリの標準単価が1件も確定されていません。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0003',
	'W',
	'標準単価が確定されていない品目が存在するため処理できません。\nログ参照画面を確認してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0004',
	'W',
	'対象となるデータで評価替処理が行われているため処理できません。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0005',
	'W',
	'在庫評価マスタに登録されていません。\n在庫評価ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0006',
	'W',
	'評価率で評価するデータに対しては処理できません。\n在庫評価ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0007' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0007',
	'W',
	'単価設定区分を指定していないため処理できません。\n在庫評価ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0008' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0008',
	'W',
	'原価部門マスタに登録されていません。\nテーブル：{1}\n部門ＣＤ：{2}\n期：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0009' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0009',
	'W',
	'取引先マスタに登録されていません。\nテーブル：{1}\n取引先ＣＤ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0010' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0010',
	'W',
	'場所マスタに登録されていません。\nテーブル：{1}\n場所ＣＤ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0011' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0011',
	'W',
	'品目マスタに登録されていません。\nテーブル：{1}\n品目：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0012' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0012',
	'W',
	'マスタチェックでエラーが発生しました。{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0013' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0013',
	'W',
	'標準単価マスタから単価が取得できなかったので、振替比率を設定しません。\nワーキンググループＣＤ：{1}\n品目：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0014' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0014',
	'W',
	'経費配賦振替マスタの設定により、購買実績を配賦費用実績へ振り替えようとしましたが、振替先のデータが既に処理済となっているため処理できません。\n対象：{1}\n計算カテゴリＣＤ：{2}\n振替先ワーキンググループＣＤ：{3}\nワーキンググループＣＤ：{4}\n年月：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0016' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0016',
	'W',
	'対応する投入実績が1件も存在しないため、投入への振替はできません。入出庫実績振替マスタに配賦科目が設定されているときは配賦振替の処理を行います。\n入出庫実績ＩＤ：{1}\n品目：{2}\n部門ＣＤ：{3}\n数量：{4}\n配賦科目ＣＤ：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0017' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0017',
	'W',
	'受払実績の取込処理で必須となる部門を設定しようとしましたが、対象となる部門が取得できませんでした。\n伝票ＮＯ：{1}\n伝票連番：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0018' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0018',
	'W',
	'受払実績の取込処理で必須となるワーキンググループを設定しようとしましたが、対象となるワーキンググループが取得できませんでした。\n伝票ＮＯ：{1}\n伝票連番：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0019' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0019',
	'W',
	'経費配賦振替マスタの設定により、購買実績を配賦費用実績へ振り替えようとしましたが、配賦費用実績に対する確定処理が行われているため処理できません。\n対象：{1}\n計算グループＣＤ：{2}\n計算カテゴリＣＤ：{3}\n振替先ワーキンググループＣＤ：{4}\nワーキンググループＣＤ：{5}\n年月：{6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0020' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0020',
	'I',
	'受払実績の取込処理でワーキンググループを設定しようとしましたが、対象となるワーキンググループが取得できませんでした。レコードを取り込みません。\n伝票ＮＯ：{1}\n伝票連番：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0022' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0022',
	'I',
	'受払実績取込件数 : {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0023' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0023',
	'I',
	'工数情報取込件数 : {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0024' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0024',
	'I',
	'仕掛情報取込件数 : {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0025' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0025',
	'I',
	'在庫情報取込件数 : {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0026' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0026',
	'I',
	'品目製造指図情報作成件数 : {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0027' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0027',
	'I',
	'指図工程情報作成件数 : {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0028' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0028',
	'I',
	'製造実績ＩＦ作成件数 : {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0029' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0029',
	'I',
	'購買実績ＩＦ作成件数 : {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0030' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0030',
	'I',
	'投入実績ＩＦ作成件数 : {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0031' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0031',
	'I',
	'入出庫実績ＩＦ作成件数 : {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0032' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0032',
	'I',
	'売上実績ＩＦ作成件数 : {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0033' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0033',
	'I',
	'指図工数実績ＩＦ作成件数 : {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0034' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0034',
	'I',
	'指図外工数実績ＩＦ作成件数 : {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0035' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0035',
	'I',
	'在庫実績ＩＦ作成件数 : {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0036' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0036',
	'I',
	'指図仕掛実績ＩＦ作成件数 : {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0037' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0037',
	'I',
	'受払実績取込開始');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0038' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0038',
	'I',
	'工数情報取込開始');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0039' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0039',
	'I',
	'仕掛情報取込開始');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0040' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0040',
	'I',
	'在庫情報取込開始');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0041' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0041',
	'W',
	'直近総平均単価が取得できないため、費目別原価を作成できません。\n計算グループＣＤ：{1}\n年月：{2}\nワーキンググループＣＤ：{3}\n管理部門ＣＤ：{4}\n品目：{5}\nロットＮＯ：{6}\nサブロットＮＯ：{7}\n手配ＮＯ：{8}\n資産区分：{9}\n実績ＩＤ：{10}\n実績ＩＤ枝番：{11}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0042' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0042',
	'I',
	'直近総平均単価が取得できないため、費目別原価を作成できません。\n標準単価評価とします。\n計算グループＣＤ：{1}\n年月：{2}\nワーキンググループＣＤ：{3}\n管理部門ＣＤ：{4}\n品目：{5}\nロットＮＯ：{6}\nサブロットＮＯ：{7}\n手配ＮＯ：{8}\n資産区分：{9}\n実績ＩＤ：{10}\n実績ＩＤ枝番：{11}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0043' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0043',
	'W',
	'登録対象のデータと計算カテゴリ・ワーキンググループ・年月のいずれかが異なるデータが存在します。\n対象の計算カテゴリ・ワーキンググループ・年月のデータを削除してください。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n年月：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0044' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0044',
	'I',
	'対象となる会計伝票区分に対して資産管理対象外の品目が登録されています。取込対象外とします。\n品目：{1}\n会計伝票区分：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0045' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0045',
	'I',
	'対象となる会計伝票区分に対して資産管理対象外の親／負担品目が登録されています。取込対象外とします。\n親／負担品目：{1}\n会計伝票区分：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0046' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0046',
	'W',
	'原価対象外品目マスタに親／負担品目が登録されています。取込対象外となるため子品目の払い出しも無効になります。\nテーブル：{1}\n親／負担品目：{2}\n品目：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0047' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0047',
	'W',
	'親／負担品目が品目マスタに登録されていません。取込対象外となるため子品目の払い出しも無効になります。\nテーブル：{1}\n親／負担品目：{2}\n品目：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0048' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0048',
	'W',
	'対応する原価ＢＯＭ情報が1件も存在しないため、投入への振替はできません。\n入出庫実績ＩＤ：{1}\n製造実績グループ：{2}\n在庫先ＣＤ：{3}\n品目：{4}\n数量：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0049' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0049',
	'W',
	'対応する原価品目工数情報が1件も存在しないため、指図工数への振替はできません。\n指図外工数実績ＩＤ：{1}\n製造実績グループ：{2}\n工数管理ＣＤ：{3}\n工数：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0050' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0050',
	'W',
	'対応する製造実績ＩＦが1件も存在しないため、投入への振替はできません。\n入出庫実績ＩＤ：{1}\n製造実績グループ：{2}\n在庫先ＣＤ：{3}\n品目：{4}\n数量：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0051' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0051',
	'W',
	'対応する製造実績ＩＦが1件も存在しないため、指図工数への振替はできません。\n指図外工数実績ＩＤ：{1}\n製造実績グループ：{2}\n工数管理ＣＤ：{3}\n工数：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0052' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBBD0052',
	'I',
	'直近確定総平均単価から求めた費目別の金額がすべて０のため、０評価とします。\n計算グループＣＤ：{1}\n年月：{2}\nワーキンググループＣＤ：{3}\n管理部門ＣＤ：{4}\n品目：{5}\nロットＮＯ：{6}\nサブロットＮＯ：{7}\n手配ＮＯ：{8}\n資産区分：{9}\n実績ＩＤ：{10}\n実績ＩＤ枝番：{11}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDP0001',
	'W',
	'コピー元計算カテゴリとコピー先計算カテゴリは異なる計算カテゴリを指定してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDP0002',
	'W',
	'コピー元期とコピー先期は異なる期を指定してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDP0004',
	'W',
	'コピー元計算カテゴリとコピー先計算カテゴリまたは\nコピー元年月とコピー先年月は異なる値を指定してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDP0005',
	'W',
	'未配賦金額の繰越では原価計算ＮＯを１つだけ指定してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDP0006',
	'W',
	'親品目と子品目は異なる品目を指定してください。\n品目：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0007' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDP0007',
	'W',
	'削除不可あるいは確定済みのレコードを削除しますが、よろしいですか？');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0001',
	'W',
	'原価計算エンジンが正しく実行されませんでした。\n計算グループＣＤ：{1}\n原価計算ＮＯ：{2}\n{3}\n{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0002',
	'W',
	'原価計算関連処理でエラーが発生しました。\n計算グループＣＤ：{1}\n原価計算ＮＯ：{2}\n{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0003',
	'I',
	'原価計算エンジン処理が正常終了しました。\n計算グループＣＤ：{1}\n原価計算ＮＯ：{2}\n{3}\n{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0004',
	'W',
	'計算元のレコードが変更されているため反映処理が実行できません。\n再計算を行ってください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0005',
	'W',
	'反映先のデータが既に処理済となっているため処理を中止します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0006',
	'W',
	'指定した条件では取消対象となるレコードは存在しません。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0007' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0007',
	'W',
	'反映先の標準配賦率が確定されているため反映できません。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0008' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0008',
	'W',
	'同じユーザが同じ計算グループで計算中のため登録できません。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0009' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0009',
	'W',
	'コピー先に標準配賦率が確定しているデータがあるのでコピーできません。\n対象：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0010' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0010',
	'W',
	'コピー先に標準単価が確定しているデータがあるのでコピーできません。\n対象：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0012' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0012',
	'W',
	'一次配賦計算で使用した配賦費用に処理済となっているデータが存在します。処理済のデータを反映取消してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0013' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0013',
	'W',
	'繰越先のデータが既に処理済となっているため処理を中止します。\nワーキンググループＣＤ：{1}\n年月：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0014' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0014',
	'W',
	'繰越先のデータに他の計算結果から繰越処理が行われたデータが存在します。繰越処理を行ったデータに対する取消処理を行ってください。\nワーキンググループＣＤ：{1}\n年月：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0015' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0015',
	'W',
	'場所に社内となる場所（場所マスタで発注先が設定されていない場所）を指定した場合のみ歩留製造数量に1以外を指定できます。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0016' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0016',
	'W',
	'場所に社内となる場所（場所マスタで発注先が設定されていない場所）を指定した場合のみ理論製造数量に1以外を指定できます。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0019' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0019',
	'W',
	'削除できない行です。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0020' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0020',
	'W',
	'場所を指定した場合、構成パタンは必須です。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0021' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0021',
	'W',
	'対象となるデータを使用する標準単価が確定されているため、登録・削除できません。\n期：{1}\n計算カテゴリＣＤ：{2}\nワーキンググループＣＤ：{3}\n品目：{4}\n{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0022' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0022',
	'W',
	'同一の計算グループ及び年月の原価計算情報の複数処理はできません。\n計算グループＣＤ：{1}\n年月：{2}\n{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0023' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0023',
	'W',
	'削除対象品目の標準単価が確定されているため削除できません。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0024' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0024',
	'I',
	'原価計算処理を開始します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0025' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0025',
	'I',
	'原価計算処理を終了しました。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0026' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0026',
	'W',
	'場所を指定した場合、配賦部門を指定できません。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0027' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0027',
	'W',
	'標準配賦率が確定されているため訂正できません。\n期：{1}\n計算カテゴリＣＤ：{2}\nワーキンググループＣＤ：{3}\n配賦科目ＣＤ：{4}\n部門ＣＤ：{5}\n場所ＣＤ：{6}\n工程ＣＤ：{7}\n取引先ＣＤ：{8}\n品群ＣＤ：{9}\n品目：{10}\n{11}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0028' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0028',
	'W',
	'為替レートが確定されているため訂正できません。\n期：{1}\n換算元通貨ＣＤ：{2}\n換算先通貨ＣＤ：{3}\n為替レートＣＤ：{4}\n{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0029' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0029',
	'W',
	'計算対象先頭月は、以下より選択してください。\n{1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0030' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0030',
	'W',
	'計算対象末尾月は、以下より選択してください。\n{1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0031' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0031',
	'W',
	'資産管理対象外の品目を指定した場合、支給区分に「3.自給」のみ指定できます。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0032' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0032',
	'W',
	'資産管理対象外の品目を指定した場合、場所を指定できません。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0033' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0033',
	'W',
	'場所を指定した場合のみ以下の項目を指定できます。\n項目：{1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0034' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0034',
	'W',
	'場所に社内となる場所（場所マスタで発注先が設定されていない場所）を指定した場合のみ以下の項目を指定できます。\n項目：{1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0035' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0035',
	'W',
	'コピー元計算カテゴリとコピー先計算カテゴリは異なる計算カテゴリを指定してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0036' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0036',
	'W',
	'コピー元期とコピー先期は異なる期を指定してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0037' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0037',
	'W',
	'コピー元計算カテゴリとコピー先計算カテゴリまたは\nコピー元年月とコピー先年月は異なる値を指定してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0038' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0038',
	'W',
	'取込対象となる品目詳細マスタの品目が品目マスタに登録されていない、もしくは品目マスタの計算パタンが設定されていないため、取込できません。\n品目：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0039' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0039',
	'W',
	'実行対象の計算実行パタン構成がありません。\n計算実行パタンＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0040' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0040',
	'I',
	'原価部門マスタに存在しない部門を保持するレコードがコピーされました。\n対象：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0041' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0041',
	'W',
	'工程パタンを指定した場合、工程は必須です。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0042' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0042',
	'W',
	'工程パタンを指定した場合、工程連番は必須です。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0043' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0043',
	'W',
	'標準単価が確定されているため登録できません。\n期：{1}\n品目：{2}\n{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0044' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0044',
	'W',
	'親品目と子品目に同じ値を指定できません。\n品目：{1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0045' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0045',
	'W',
	'指定した構成パタンは既に登録されています。操作種別を「訂正する」に変更してから検索してください。\n計算カテゴリ：{1}\nワーキンググループ：{2}\n期：{3}\n親品目：{4}\n構成パタン：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0046' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0046',
	'W',
	'ワーキンググループと場所に対するワーキンググループが異なるため登録できません。\nワーキンググループＣＤ：{1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0047' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0047',
	'W',
	'親品目と子品目は異なる品目を指定してください。\n品目：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0048' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0048',
	'W',
	'親品目と子品目が同じ値となるため登録できません。\n品目：{1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0049' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0049',
	'W',
	'次のデータは既に存在します。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0050' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0050',
	'I',
	'取込対象作成処理（品目詳細）を開始します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0051' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0051',
	'I',
	'取込対象作成処理（品目詳細）を終了します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0052' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0052',
	'I',
	'取込対象作成処理（品目工程）を開始します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0053' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0053',
	'I',
	'取込対象作成処理（品目工程）を終了します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0054' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0054',
	'I',
	'取込対象作成処理（ＢＯＭ）を開始します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0055' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0055',
	'I',
	'取込対象作成処理（ＢＯＭ）を終了します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0056' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0056',
	'I',
	'取込対象作成処理（品目工数）を開始します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0057' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0057',
	'I',
	'取込対象作成処理（品目工数）を終了します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0058' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0058',
	'I',
	'取込対象作成処理（購買単価）を開始します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0059' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0059',
	'I',
	'取込対象作成処理（購買単価）を終了します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0060' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0060',
	'I',
	'取込対象作成処理（加工単価）を開始します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0061' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0061',
	'I',
	'取込対象作成処理（加工単価）を終了します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0062' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0062',
	'I',
	'取込対象作成処理（支給単価）を開始します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0063' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0063',
	'I',
	'取込対象作成処理（支給単価）を終了します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0064' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0064',
	'I',
	'取込対象作成処理（販売単価）を開始します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0065' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0065',
	'I',
	'取込対象作成処理（販売単価）を終了します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0066' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0066',
	'I',
	'原価計算エンジン処理を開始します。\n計算グループＣＤ：{1}\n原価計算ＮＯ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0067' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0067',
	'I',
	'原価計算エンジン処理を終了しました。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0068' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0068',
	'W',
	'取込対象となるBOMマスタの子品目が品目マスタに登録されていない、もしくは品目マスタの計算パタンが設定されていないため、取込できません。\n品目：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0069' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0069',
	'W',
	'条件に一致する取込対象のデータはありませんでした。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0070' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0070',
	'W',
	'取込対象となる品目に対する品目マスタの計算パタンが設定されていないため、取込できません。\n品目：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0071' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDL0071',
	'W',
	'依頼先ワーキンググループにはワーキンググループと異なる値を指定してください。\nワーキンググループＣＤ：{1}\n依頼先ワーキンググループＣＤ：{2}\n{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0001',
	'W',
	'計算結果レコード数が一次配賦最大レコード数の設定値を超えるため処理を終了しました。\n計算結果レコード数：{1}\n一次配賦最大レコード数：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0002',
	'I',
	'一次配賦最大階層の設定値を超えるため処理を終了しました。\n一次配賦最大階層：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0003',
	'W',
	'一次配賦基準選択マスタが存在しないため配賦処理はできません。\nワーキンググループＣＤ：{1}\n部門ＣＤ：{2}\n配賦科目ＣＤ：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0004',
	'W',
	'一次配賦基準ＣＤに対して有効な配賦先が存在しないため配賦処理はできません。\n一次配賦期間比率の設定及び一次配賦先部門マスタの設定を確認してください。\n期：{1}\n一次配賦基準ＣＤ：{2}\nワーキンググループＣＤ：{3}\n配賦元部門ＣＤ：{4}\n配賦先部門パタン：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0005',
	'W',
	'配賦対象の合計値が0となるため配賦処理はできません。\n一次配賦期間比率の設定及び一次配賦先部門マスタの設定を確認してください。\n期：{1}\n一次配賦基準：{2}\nワーキンググループ：{3}\n配賦元部門：{4}\n配賦先部門パタン：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0006',
	'W',
	'一次配賦基準ＣＤに対して有効な配賦先が存在しないため配賦処理はできません。\n一次配賦月次比率の設定及び一次配賦先部門マスタの設定を確認してください。\n年月：{1}\n一次配賦基準ＣＤ：{2}\nワーキンググループＣＤ：{3}\n配賦元部門ＣＤ：{4}\n配賦先部門パタン：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0007' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0007',
	'W',
	'配賦対象の合計値が0となるため配賦処理はできません。\n一次配賦月次比率の設定及び一次配賦先部門マスタの設定を確認してください。\n年月：{1}\n一次配賦基準ＣＤ：{2}\nワーキンググループＣＤ：{3}\n配賦元部門ＣＤ：{4}\n配賦先部門パタン：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0008' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0008',
	'I',
	'対象件数\nテーブル：{1}\n件数：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0009' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0009',
	'W',
	'同じユーザが同じ計算グループに対して同時に複数の原価計算処理はできません。\n計算グループＣＤ：{1}\n担当者：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0010' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0010',
	'W',
	'一次配賦結果の反映処理もしくは未配賦金額の繰越処理を行ったレコードが存在します。削除処理できません。\n計算グループＣＤ：{1} \n原価計算ＮＯ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0011' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0011',
	'W',
	'標準配賦率の確定処理を行ったレコードが存在します。削除処理できません。\n計算グループＣＤ：{1} \n原価計算ＮＯ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0013' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0013',
	'W',
	'仕訳処理済みのレコードが存在するため取消処理できません。\n計算グループＣＤ：{1} \n年月：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0014' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0014',
	'W',
	'原価会計伝票区分仕訳マスタに有効となるレコードが1件も登録されていません。\n計算グループＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0015' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0015',
	'I',
	'送信件数：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0016' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0016',
	'W',
	'会計部門マスタに有効となるレコードが登録されていません。\n会計部門ＣＤ：{1}\n適用日：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0017' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0017',
	'W',
	'計算グループマスタで同一計算順序グループかつ計算順序が小さい計算グループで未計算の計算グループが存在します。\n計算グループＣＤ：{1}\n計算順序グループ：{2}\n計算順序：{3}\n優先計算グループＣＤ：{4}\n優先計算順序：{5}\n年月：{6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0018' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0018',
	'W',
	'計算結果の取得元に対する確定処理が行われていないため処理できません。計算順序が先となる計算結果から確定処理を行ってください。\n取得元計算グループＣＤ：{1}\n取得元原価計算ＮＯ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0019' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0019',
	'W',
	'計算結果の連携先に対する確定処理が行われているため処理できません。計算順序が後となる計算結果から確定取消処理を行ってください。\n連携先計算グループＣＤ：{1}\n連携先原価計算ＮＯ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0020' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0020',
	'W',
	'一次配賦計算でループが発生したため処理を終了しました。\n最上位連番：{1}\nループ連番１：{2}\nループ連番２：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0021' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0021',
	'W',
	'一次配賦最大階層の設定値を超えるため処理を終了しました。\n一次配賦最大階層：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0022' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0022',
	'I',
	'確定済みの標準単価に影響するデータが含まれています。該当データは取込対象となりません。取込対象データからも削除されます。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0023' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0023',
	'W',
	'品目マスタに有効な品目として登録されていません。\n品目：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0024' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0024',
	'W',
	'品目マスタに資産管理可能な品目として登録されていません。取込対象になりません。\n品目：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0025' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0025',
	'W',
	'場所マスタに有効な場所として登録されていません。\n場所ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0026' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0026',
	'W',
	'取引先マスタに有効な取引先として登録されていません。\n取引先ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0027' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0027',
	'W',
	'資産管理しない品目に対して場所を指定できません。\n品目：{1}\n場所ＣＤ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0028' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0028',
	'W',
	'場所と発注先と依頼先ワーキンググループのうち、いずれか1つのみを指定してください。\n品目：{1}\n場所ＣＤ：{2}\n発注先ＣＤ：{3}\n依頼先ワーキンググループＣＤ：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0029' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0029',
	'W',
	'工程管理単位を指定する場合、次の項目は必須です。\n工程管理単位、工程基準単位数量、工程換算単位数量、小数部有効桁数、換算端数処理区分\n品目：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n計算カテゴリＣＤ：{4}\n工程管理単位ＣＤ：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0030' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0030',
	'W',
	'工程基準単位数量には正の数字を指定してください。\n品目：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n計算カテゴリＣＤ：{4}\n工程管理単位ＣＤ：{5}\n工程基準単位数量：{6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0031' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0031',
	'W',
	'工程換算単位数量には0以上の数字を指定してください。\n品目：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n計算カテゴリＣＤ：{4}\n工程管理単位ＣＤ：{5}\n工程換算単位数量：{6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0032' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0032',
	'W',
	'小数部有効桁数には0～8の整数を指定してください。\n品目：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n計算カテゴリＣＤ：{4}\n工程管理単位ＣＤ：{5}\n小数部有効桁数：{6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0033' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0033',
	'W',
	'親品目と子品目は異なる品目を指定してください。\n品目：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0034' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0034',
	'W',
	'代替グループを指定する場合、代替品目比率を指定してください。\n親品目：{1}\n構成パタン：{2}\n期：{3}\n計算カテゴリＣＤ：{4}\n代替グループＣＤ：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0035' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0035',
	'W',
	'支給区分には「2.有償支給」または 「3.自給」を指定してください。\n品目：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n計算カテゴリＣＤ：{4}\n支給区分：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0037' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0037',
	'W',
	'基準数には正の数字を指定してください。\n品目：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n計算カテゴリＣＤ：{4}\n基準数：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0039' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0039',
	'W',
	'親必要数には正の数字を指定してください。\n親品目：{1}\n構成パタン：{2}\n期：{3}\n計算カテゴリＣＤ：{4}\n子品目：{5}\n親必要数：{6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0040' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0040',
	'W',
	'単価には0以外の数字を指定してください。\n品目：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n計算カテゴリＣＤ：{4}\n単価：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0044' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0044',
	'W',
	'品目マスタに資産管理可能な品目として登録されていません。親品目の対象にはなりません。\n親品目：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0045' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0045',
	'W',
	'品目マスタに有効な品目として登録されていません。\n親品目：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0046' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0046',
	'W',
	'品目マスタに有効な品目として登録されていません。\n子品目：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0048' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0048',
	'W',
	'取込対象のデータに場所と発注先と依頼先ワーキンググループがいずれも設定されていません。\n品目：{1}\nワーキンググループＣＤ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0051' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0051',
	'W',
	'掛率を指定していますが、標準販売単価マスタまたは通貨マスタが取得できないため、販売単価を設定できません。\n品目：{1}\n得意先ＣＤ：{2}\n納品先ＣＤ：{3}\n通貨ＣＤ：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0052' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0052',
	'W',
	'税込単価を指定していますが、税マスタまたは通貨マスタが取得できないため、税抜単価を換算できません。\n品目：{1}\n得意先ＣＤ：{2}\n納品先ＣＤ：{3}\n税ＣＤ：{4}\n通貨ＣＤ：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0053' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0053',
	'W',
	'税込単価を指定していますが、税マスタまたは通貨マスタが取得できないため、税抜単価を換算できません。\n品目：{1}\n発注先ＣＤ：{2}\n税ＣＤ：{3}\n通貨ＣＤ：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0055' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0055',
	'W',
	'基準数には正の数字を指定してください。\n品目：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n計算カテゴリＣＤ：{4}\n基準数：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0056' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0056',
	'W',
	'計算カテゴリが取得できませんでした。原価会社パラメータマスタのデフォルト計算カテゴリを設定してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0057' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0057',
	'W',
	'マスタ取込でエラーが発生しました。ログを確認してください。取込データは更新されています。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0058' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0058',
	'W',
	'取込対象作成でエラーが発生しました。ログを確認してください。データは作成されています。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0059' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0059',
	'W',
	'取引先マスタに有効な取引先として登録されていません。\n発注先ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0060' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0060',
	'W',
	'取引先マスタに有効な取引先として登録されていません。\n支給先ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0061' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0061',
	'W',
	'取引先マスタに有効な取引先として登録されていません。\n得意先ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0062' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0062',
	'W',
	'取引先マスタに有効な取引先として登録されていません。\n納品先ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0063' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0063',
	'W',
	'取引先マスタに有効な取引先として登録されていません。\n仕向先ＣＤ１：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0064' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0064',
	'W',
	'取引先マスタに有効な取引先として登録されていません。\n仕向先ＣＤ２：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0065' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0065',
	'W',
	'取引先マスタに有効な取引先として登録されていません。\n仕向先ＣＤ３：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0066' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0066',
	'W',
	'ワーキンググループマスタに有効なワーキンググループとして登録されていません。\n依頼先ワーキンググループＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0067' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBDD0067',
	'W',
	'依頼先ワーキンググループにワーキンググループと同じ値を指定できません。\n依頼先ワーキンググループＣＤ：{1}\nワーキンググループＣＤ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBED0001',
	'I',
	'確定品目数：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBED0002',
	'W',
	'確定対象の計算を行ったあとに異なる計算で標準単価の確定処理を行った品目が存在します。\n再計算後に確定処理を行ってください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBED0003',
	'W',
	'エラーが発生した原価計算結果に対しては処理できません。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBED0004',
	'W',
	'対象となる標準配賦率データを使用する計算で標準単価が確定されているため、\n標準配賦率の確定解除はできません。\n対象となる品目に対する標準単価の確定解除処理を行ってください。\n期：{1}\n計算カテゴリＣＤ：{2}\nワーキンググループＣＤ：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBED0005',
	'W',
	'計算対象となった標準配賦率データに対して確定処理が行われていないデータが存在します。\n標準配賦率の確定処理を行ってください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBED0006',
	'W',
	'確定対象の計算を行ったあとに異なる計算で標準配賦率の確定処理を行ったデータが存在します。\n再計算後に確定処理を行ってください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0007' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBED0007',
	'W',
	'確定対象となる品目が存在しません。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0008' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBED0008',
	'W',
	'確定解除対象となる品目が存在しません。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0009' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBED0009',
	'W',
	'未確定の子品目が存在します。\n品目：{1}\n計算カテゴリＣＤ：{2}\nワーキンググループＣＤ：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0010' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBED0010',
	'W',
	'標準単価の確定に失敗しました。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBFP0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBFP0002',
	'W',
	'原価内訳照会の参照対象となる原価計算結果ではありません。\n計算対象期間の末尾月に対して確定（もしくは最後に計算）を行った計算結果のみ参照できます。\n計算グループＣＤ：{1}\n原価計算ＮＯ：{2}\n年月：{3}\n対象原価計算ＮＯ：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBFL0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBFL0001',
	'W',
	'同一計算グループ・年月に対して別の原価計算結果で評価損の登録が行われています。\n複数の原価計算結果で評価損の計上を行うことはできません。\n評価損計上原価計算ＮＯ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBFD0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBFD0001',
	'W',
	'受払集計単位区分に「1.受払対象単位」以外を指定していますが、原価個別受払表項目マスタに対象となるレコードが1件も登録されていないため値を集計できません。\n受払表ＩＤ：{1}\n受払項目：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGP0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBGP0001',
	'W',
	'キーがない場合、複数行登録できません。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGP0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBGP0002',
	'W',
	'期の範囲は5期間以内になるように指定してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGP0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBGP0003',
	'W',
	'年月の範囲は60ヶ月以内になるように指定してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGL0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBGL0001',
	'W',
	'反映先のデータが既に処理済となっているため反映処理が実行できません。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGL0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBGL0002',
	'W',
	'次の項目が重複した受信レコードが複数存在しています。\n不要なレコードの取込対象をオフとしてください。\nデータ行ＮＯ：{1}\n項目：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGL0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBGL0003',
	'W',
	'キーがない場合、複数行登録できません。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGL0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBGL0004',
	'I',
	'データＮＯ：{1}\nデータ件数：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBGD0001',
	'W',
	'一次配賦基準マスタに登録されていない、もしくは比率設定区分が設定されていないため処理できません。\n一次配賦基準ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBGD0002',
	'W',
	'一次配賦基準マスタの計画月次比率が設定されていないため計画比率データを作成できません。\n一次配賦基準ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBGD0003',
	'W',
	'一次配賦基準マスタの実績月次比率が設定されていないため実績比率データを作成できません。\n一次配賦基準ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBGD0004',
	'W',
	'一次配賦基準カテゴリマスタが登録されていないため処理できません。\n期：{1}\nワーキンググループＣＤ：{2}\n計算カテゴリＣＤ：{3}\n一次配賦基準ＣＤ：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBGD0005',
	'W',
	'対象となる一次配賦基準工数マスタが1件も設定されていないため処理できません。\n期：{1}\nワーキンググループＣＤ：{2}\n計算カテゴリＣＤ：{3}\n一次配賦基準ＣＤ：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBGD0006',
	'W',
	'対象となる一次配賦月次比率からキー情報を1件も取得できませんでした。\n予実区分：{1}\n年月：{2}\nワーキンググループＣＤ：{3}\n計算カテゴリＣＤ：{4}\n一次配賦基準ＣＤ：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0007' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBGD0007',
	'W',
	'一次配賦月次比率からキー情報を取得しましたが、\n対象となる一次配賦パタンに対する一次配賦パタンマスタで対象外と\n設定されている項目に対して値が設定されている項目が存在します。\n一次配賦月次比率で対象となるデータを更新してください。\n予実区分：{1}\n年月：{2}\nワーキンググループＣＤ：{3}\n計算カテゴリＣＤ：{4}\n一次配賦基準ＣＤ：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBPP0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBPP0001',
	'D',
	'基準単位から工程単位への換算処理をスキップします。\n基準単位数量：{1}\n工程換算単位数：{2}\n工程基準単位数：{3}\n小数部有効桁数：{4}\n単位換算端数処理区分：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXL0031' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXL0031',
	'W',
	'無効な会計伝票区分を指定しています。\n会計伝票区分：{1}\n登録可能な会計伝票区分：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXL0049' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXL0049',
	'W',
	'一次配賦パタンマスタで「3.対象」が設定されていないため、次の項目を指定できません。\n項目：{1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0001',
	'I',
	'処理を開始しました。{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0002',
	'I',
	'処理が終了しました。{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0003',
	'I',
	'処理が終了しました。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0004',
	'W',
	'SQLエラーが発生しました。{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0005',
	'W',
	'当月の原価計算が確定しているため、処理できません。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0006',
	'W',
	'原価計算ＮＯの取得に失敗しました。\n計算グループＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0007' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0007',
	'W',
	'対象となる原価計算結果が存在しません。\n計算グループＣＤ：{1}\n原価計算ＮＯ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0008' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0008',
	'W',
	'原価為替レートに登録されていないデータです。\n通貨ＣＤ：{1}\n基準通貨ＣＤ：{2}\n為替レートＣＤ：{3}\n期：{4}\n対象テーブル：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0009' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0009',
	'W',
	'対象となるデータは処理中のため処理できません。\n計算グループＣＤ：{1}\n原価計算ＮＯ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0010' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0010',
	'W',
	'対象となるデータは処理中のため処理できません。\n計算グループＣＤ：{1}\n年月：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0011' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0011',
	'W',
	'対象となる確定情報が存在しません。\n計算グループＣＤ：{1}\n年月：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0012' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0012',
	'I',
	'原価レポート作成処理を開始します。\n計算グループＣＤ：{1}\n原価計算ＮＯ：{2}\nレポートパタンＣＤ：{3}\nレポートキーＣＤ：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0013' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0013',
	'I',
	'原価個別受払表作成処理を開始します。\n計算グループＣＤ：{1}\n原価計算ＮＯ：{2}\n受払表ＩＤ：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0014' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0014',
	'W',
	'対象データに対する原価計算結果の確定処理が行われているため処理できません。\n計算グループＣＤ：{1}\n年月：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0015' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0015',
	'W',
	'確定標準単価が存在しません。\n期：{1}\n品目：{2}\nワーキンググループＣＤ：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0016' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0016',
	'W',
	'対象データに対する原価計算結果の確定処理が行われているため処理できません。\n対象：{1}\n計算グループＣＤ：{2}\n計算カテゴリＣＤ：{3}\nワーキンググループＣＤ：{4}\n年月：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0017' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0017',
	'W',
	'対象となるデータが計算グループレポートマスタに登録されていません。\n計算グループＣＤ：{1}\nレポートパタンＣＤ：{2}\nレポートキーＣＤ：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0018' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0018',
	'I',
	'一次配賦比率作成処理を開始します。\n予実区分：{1} \n年月：{2} \nワーキンググループＣＤ：{3} \n計算カテゴリＣＤ：{4}\n一次配賦基準ＣＤ：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0019' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0019',
	'W',
	'指定年月以降に確定されている年月が存在しているため処理できません。\n計算グループＣＤ：{1}\n年月：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0020' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0020',
	'W',
	'最大計算月数に０が設定されてるデータについては確定処理できません。\n計算グループＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0021' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0021',
	'W',
	'対応する原価個別受払表マスタが登録されていません。\n受払表ＩＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0022' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0022',
	'W',
	'対応する原価個別受払表構成マスタが1件も登録されていません。\n受払表ＩＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0023' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0023',
	'W',
	'対象となるデータが計算グループ受払表マスタに登録されていません。\n計算グループＣＤ：{1} \n受払表ＩＤ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0024' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0024',
	'W',
	'集計行に対して原価レポート行集計マスタでループが発生しました。\nレポートパタンＣＤ：{1} \n集計レポート行ＣＤ：{2} \n対象レポート行ＣＤ：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0025' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0025',
	'W',
	'入出庫実績振替マスタに投入振替の設定が存在しますが、投入実績に対する確定処理が行われているため処理できません。\n対象：{1}\n計算グループＣＤ：{2}\n計算カテゴリＣＤ：{3}\nワーキンググループＣＤ：{4}\n年月：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0026' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0026',
	'W',
	'対象の費用データを使用する原価計算結果の確定処理が行われているため処理できません。\n計算グループＣＤ：{1}\n計算カテゴリＣＤ：{2}\nワーキンググループＣＤ：{3}\n年月：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0027' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0027',
	'W',
	'別の原価計算ＮＯで評価損の計上が行われています。評価損の計上を行ったデータで確定処理を行ってください。\n計算グループＣＤ：{1}\n年月：{2}\n対象原価計算ＮＯ：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0028' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0028',
	'I',
	'在庫評価単価データ作成処理を開始します。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n年月：{3}\n在庫評価ＣＤ：{4}\n計算グループＣＤ：{5}\n原価計算ＮＯ：{6}\n年月ＦＲＯＭ：{7}\n年月ＴＯ：{8}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0029' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0029',
	'W',
	'対象となるデータは処理中のため処理できません。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0030' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0030',
	'I',
	'処理を開始します。\n計算グループＣＤ：{1}\n年月：{2}\n原価計算ＮＯ：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0031' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0031',
	'W',
	'原価品目詳細情報に標準単価が確定しているデータがあるのでコピーできません。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0032' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0032',
	'W',
	'原価品目工程情報に標準単価が確定しているデータがあるのでコピーできません。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0033' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0033',
	'W',
	'原価ＢＯＭ情報に標準単価が確定しているデータがあるのでコピーできません。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0034' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0034',
	'W',
	'原価品目工数情報に標準単価が確定しているデータがあるのでコピーできません。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0035' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0035',
	'W',
	'原価品目購買単価情報に標準単価が確定しているデータがあるのでコピーできません。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0036' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0036',
	'W',
	'原価品目支給単価情報に標準単価が確定しているデータがあるのでコピーできません。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0037' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0037',
	'W',
	'エラーが発生しました。ログを確認してください。取込データは更新されています。{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0038' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0038',
	'W',
	'原価会社パラメータマスタが登録されていません。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0039' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0039',
	'W',
	'単位換算の結果、桁あふれ等が発生しました。\n数量：{1}\n換算基準数量：{2}\n換算数量：{3}\n小数部有効桁数：{4}\n端数処理区分：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0040' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0040',
	'W',
	'原価品目加工単価情報に標準単価が確定しているデータがあるのでコピーできません。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0041' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0041',
	'W',
	'原価部門マスタに登録されていません。\n部門ＣＤ：{1}\n期：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0042' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0042',
	'W',
	'計算グループマスタに登録されていません。\n計算グループＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0043' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0043',
	'W',
	'品目マスタに登録されていません。\n品目：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0044' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0044',
	'W',
	'通貨マスタに登録されていません。\n通貨ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0045' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0045',
	'W',
	'一次配賦基準マスタに登録されていません。\n一次配賦基準ＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0046' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0046',
	'W',
	'一次配賦パタンマスタに登録されていません。\n一次配賦パタンＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0047' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0047',
	'W',
	'計算グループＷＧマスタに更新権限がないワーキンググループが存在するため処理できません。\n計算グループＣＤ：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0048' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0048',
	'W',
	'入出庫実績ＩＦに製造実績グループが設定されているデータが存在しますが、投入実績に対する確定処理が行われているため処理できません。\n計算グループＣＤ：{1}\n計算カテゴリＣＤ：{2}\nワーキンググループＣＤ：{3}\n年月：{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0049' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGBXD0049',
	'I',
	'出庫金額を一次配賦費用に振り替える設定がされていますが出庫金額が０となっています。\n年月：{1}\nワーキンググループＣＤ：{2}\n管理部門ＣＤ：{3}\n品目：{4}\nロットＮＯ：{5}\nサブロットＮＯ：{6}\n手配ＮＯ：{7}\n資産区分：{8}\n配賦科目ＣＤ：{9}\n実績ＩＤ：{10}\n実績ＩＤ枝番：{11}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAB0001',
	'W',
	'ＩＦ処理区分のbi_opeの値が設定されていません。\nＩＦ処理区分：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAB0002',
	'W',
	'ＩＦ処理区分のbi_opeの値が不正です。\nＩＦ処理区分：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAB0003',
	'W',
	'指定されたＩＦ処理区分は存在しません。\nＩＦ処理区分：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAB0004',
	'W',
	'指定されたＩＦ処理区分は実行対象外です。\nＩＦ処理区分：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAB0005',
	'I',
	'ＢＩ Ｌｉｎｋバッチ処理を開始します。\nＩＦ処理区分：{1}\n外部システムＣＤ：{2}\n年月：{3}\n計算グループＣＤ：{4}\n原価計算ＮＯ：{5}\n確定のみ：{6}\n会社ＣＤ：{7}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAB0006',
	'I',
	'ＢＩ Ｌｉｎｋバッチ処理を終了しました。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAL0001',
	'W',
	'ＩＦ処理区分が不正です。\nＩＦ処理区分：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAL0002',
	'W',
	'確定のみフラグがオンの場合は、原価計算ＮＯを指定できません。\nＩＦ処理区分：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAL0003',
	'I',
	'原価計算結果送信ＩＦ処理を開始します。\n会社ＣＤ：{1}\nＩＦ処理区分：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAL0004',
	'I',
	'原価計算結果送信ＩＦ処理が終了しました。\n会社ＣＤ：{1}\n処理対象：{2}\n登録件数：{3}\nエラー件数：{4}\nスキップ件数：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAL0005',
	'W',
	'バッチログＮＯ、ログサブキー１、ログサブキー２の設定に失敗したデータがあります。\n送信確認画面でデータを確認してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAL0006',
	'I',
	'原価受払表送信ＩＦ処理を開始します。\n会社ＣＤ：{1}\nＩＦ処理区分：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0007' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAL0007',
	'I',
	'原価受払表送信ＩＦ処理が終了しました。\n会社ＣＤ：{1}\n処理対象：{2}\n登録件数：{3}\nエラー件数：{4}\nスキップ件数：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0008' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAL0008',
	'I',
	'工程原価計算結果送信ＩＦ処理を開始します。\n会社ＣＤ：{1}\nＩＦ処理区分：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0009' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAL0009',
	'I',
	'工程原価計算結果送信ＩＦ処理が終了しました。\n会社ＣＤ：{1}\n処理対象：{2}\n登録件数：{3}\nエラー件数：{4}\nスキップ件数：{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0010' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAL0010',
	'I',
	'原価計算結果送信ＩＦ処理を開始します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0011' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAL0011',
	'I',
	'原価計算結果送信ＩＦ処理が終了しました。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0012' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAL0012',
	'I',
	'原価受払表送信ＩＦ処理を開始します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0013' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAL0013',
	'I',
	'原価受払表送信ＩＦ処理が終了しました。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0014' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAL0014',
	'I',
	'工程原価計算結果送信ＩＦ処理を開始します。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0015' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGLAL0015',
	'I',
	'工程原価計算結果送信ＩＦ処理が終了しました。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUAL0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUAL0001',
	'W',
	'在庫評価マスタに登録されていません。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUAL0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUAL0002',
	'W',
	'一次配賦基準マスタで以下の条件に対する一次配賦基準として設定されていません。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUAL0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUAL0003',
	'W',
	'一次配賦基準マスタで以下の条件に対して、一次配賦期間比率に存在しない一次配賦基準として設定されていません。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUAL0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUAL0004',
	'W',
	'一次配賦基準マスタで以下の条件に対して、一次配賦月次比率に存在しない一次配賦基準として設定されていません。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n年月：{4}\n予実区分：{5}\n{6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUCL0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUCL0001',
	'W',
	'原価会社パラメータ情報を取得できませんでした。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUCL0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUCL0002',
	'W',
	'対象となる配賦パタンを使用する標準配賦率が確定されているため、登録・削除できません。\n期：{1}\n配賦パタン：{2}\n{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUCL0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUCL0003',
	'W',
	'対象となる原価計算結果が存在しません。\n計算グループＣＤ：{1}\n原価計算ＮＯ：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUCD0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUCD0001',
	'W',
	'対象の部門を原価部門に変換できませんでした。\n部門：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUCD0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUCD0002',
	'W',
	'対象の部門から計算カテゴリを取得できませんでした。\n部門：{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUDL0001',
	'W',
	'資産区分には「1.自社（販売）」または「2.自社（生産）」のみ指定できます。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUDL0002',
	'W',
	'対象データに対する原価計算結果の確定処理が行われているため処理できません。\n計算グループＣＤ：{1}\n年月：{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0003' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUDL0003',
	'W',
	'個別評価区分には「1.標準単価」または「2.０評価」のみ指定できます。\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0004' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUDL0004',
	'W',
	'登録対象に共通を指定した場合、以下の項目を指定する必要があります。\n項目：{1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0005' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUDL0005',
	'W',
	'工程実績ＮＯを指定した場合、以下の項目は必須です。\n項目：工程ＣＤ、工程連番\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0006' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUDL0006',
	'W',
	'工程実績ＮＯを指定した場合のみ以下の項目を指定できます。\n項目：工程ＣＤ、工程連番\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDP0001' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUDP0001',
	'W',
	'年月の範囲は{1}ヶ月以内になるように指定してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDP0002' AND LOC_CD IS NULL;

INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MGUDP0002',
	'W',
	'期の範囲は{1}期以内になるように指定してください。');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0001',
	'en_US',
	'W',
	'Not entered as the Simulation No. for general purpose simulation.\nSimulation No.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0002',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master.\nItem: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0003',
	'en_US',
	'W',
	'Since the item is not entered as an asset management item in the Item master, it is not imported.\nItem: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0004',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master.\nLocation cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0005',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nSupplier cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0006',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nCustomer cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0007',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDelivery destination cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0008',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDistribution channel cd. 1: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0009',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDistribution channel cd. 2: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBAD0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBAD0010',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDistribution channel cd. 3: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBP0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBP0004',
	'en_US',
	'W',
	'Copy source data and copy destination data are the same. Specify a different calculation group or the year and month.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0001',
	'en_US',
	'W',
	'Cannot enter since the total amount of the cost elements is 0.\nMake sure that the total amount is other than 0.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0002',
	'en_US',
	'W',
	'The following columns can be specified only if an item not subject to asset management is selected.\nColumn: Allocation location cd., Allocation operation cd., Allocation item category cd.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0003',
	'en_US',
	'W',
	'Cannot update the order information since no SCM module has been installed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0004',
	'en_US',
	'W',
	'Cannot check the data to be imported since no SCM module has been installed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0022' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0022',
	'en_US',
	'W',
	'Copy source data and copy destination data are the same. Specify a different calculation group or the year and month.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0023' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0023',
	'en_US',
	'W',
	'If a manufacturing result group is specified, the following columns cannot be specified.\nColumn: Dept. cd., Item category cd., Location cd., Operation cd., Lot No., Sublot No., SEIBAN No.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0024' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0024',
	'en_US',
	'W',
	'Repurchase obligation can be selected only for the own assets inventory for which BP is set.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0025' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0025',
	'en_US',
	'W',
	'Cannot enter since the total amount of the cost elements is 0.\nMake sure that the total amount is other than 0.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBL0026' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBL0026',
	'en_US',
	'W',
	'Cannot process since the cost calculation result for this month has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nYear month: {3}\n{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0001',
	'en_US',
	'W',
	'Several calculation groups and months are specified.\nEvaluation change process can process only one calculation group and month.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0002',
	'en_US',
	'W',
	'None of the standard unit costs in the calculation categories set for items in the group to be calculated are firmed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0003',
	'en_US',
	'W',
	'Cannot process since there are items for which the standard cost is not firmed.\nSee the log screen.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0004',
	'en_US',
	'W',
	'Cannot process since target data is under revaluation process.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0005',
	'en_US',
	'W',
	'Not entered in the Inventory Revaluation master.\nInventory revaluation cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0006',
	'en_US',
	'W',
	'Cannot perform the processing for the data to be evaluated by the evaluation rate.\nInventory revaluation cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0007',
	'en_US',
	'W',
	'Cannot process since the Unit price setting type is not specified.\nInventory revaluation cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0008',
	'en_US',
	'W',
	'Not entered in the Cost Dept. master.\nTable: {1}\nDept. cd.: {2}\nTerm: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0009',
	'en_US',
	'W',
	'Not entered in the BP master.\nTable: {1}\nBP master: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0010',
	'en_US',
	'W',
	'Not entered in the Location master.\nTable: {1}\nLocation cd.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0011' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0011',
	'en_US',
	'W',
	'Not entered in the Item master.\nTable: {1}\nItem: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0012' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0012',
	'en_US',
	'W',
	'An error has occurred while checking masters. {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0013' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0013',
	'en_US',
	'W',
	'Cannot set the transfer ratio since the unit price could not be acquired from the Standard Unit Cost master.\nWG cd.: {1}\nItem: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0014' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0014',
	'en_US',
	'W',
	'According to the setting of the Expenses Allocation Transfer master, the purchase result should be transferred to the allocation expense result. However, the data cannot be transferred since the transfer destination has already been processed.\nTarget: {1}\nCalculation category cd.: {2}\nTransfer destination WG cd.: {3}\nWG cd.: {4}\nYear month: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0016' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0016',
	'en_US',
	'W',
	'Cannot transfer to the input since none of the corresponding input result exists. If the allocation account is set in the GR/GI Result Transfer master, allocation transfer processing is performed.\nGR/GI result ID: {1}\nItem: {2}\nDept. cd.: {3}\nQty.: {4}\nAllocation account cd.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0017' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0017',
	'en_US',
	'W',
	'Failed to acquire the target dept. required by importing processing of GR/GI results.\nSlip No.: {1}\nSlip sequence: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0018' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0018',
	'en_US',
	'W',
	'Failed to acquire the target WG required by importing processing of GR/GI results.\nSlip No.: {1}\nSlip sequence number: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0019' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0019',
	'en_US',
	'W',
	'According to the setting of the Expenses Allocation Transfer master,\nthe purchase result should be transferred to the allocable expense result. However, the data cannot be transferred since the allocable expense result has already been firmed.\nTarget: {1}\nCalculation group cd.: {2}\nCalculation category cd.: {3}\nTransfer destination WG cd.: {4}\nWG cd.: {5}\nYear month: {6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0020' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0020',
	'en_US',
	'I',
	'Failed to acquire the target WG required by importing processing of GR/GI results. Cannot import the records.\nNot import the record.\nSlip No.: {1}\nSlip sequence number: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0022' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0022',
	'en_US',
	'I',
	'The number of GR/GI results imported: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0023' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0023',
	'en_US',
	'I',
	'The number of man-hour info. imported: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0024' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0024',
	'en_US',
	'I',
	'The number of WIP info. imported: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0025' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0025',
	'en_US',
	'I',
	'The number of inventory info. imported: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0026' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0026',
	'en_US',
	'I',
	'The number of item mfg. order info. created: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0027' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0027',
	'en_US',
	'I',
	'The number of order operation info. created: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0028' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0028',
	'en_US',
	'I',
	'The number of Mfg. Result IF created: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0029' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0029',
	'en_US',
	'I',
	'The number of Purchase Result IF created: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0030' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0030',
	'en_US',
	'I',
	'The number of Input Result IF created: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0031' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0031',
	'en_US',
	'I',
	'The number of GR/GI Result IF created: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0032' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0032',
	'en_US',
	'I',
	'The number of Sales Result IF created: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0033' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0033',
	'en_US',
	'I',
	'The number of Order Direct Man-Hour Result IF created: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0034' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0034',
	'en_US',
	'I',
	'The number of Indirect Man-Hour Result IF created: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0035' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0035',
	'en_US',
	'I',
	'The number of Inventory Result IF created: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0036' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0036',
	'en_US',
	'I',
	'The number of In Process Order Result IF created: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0037' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0037',
	'en_US',
	'I',
	'Starting the GR/GI result import processing.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0038' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0038',
	'en_US',
	'I',
	'Starting the man-hour information import processing.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0039' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0039',
	'en_US',
	'I',
	'Starting the WIP information import processing.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0040' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0040',
	'en_US',
	'I',
	'Starting the inventory information import processing.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0041' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0041',
	'en_US',
	'W',
	'Cannot create the cost by cost element since the latest weighted average unit price cannot be acquired.\nCalculation group cd.: {1}\nYear month: {2}\nWG cd.: {3}\nManagement dept. cd.: {4}\nItem: {5}\nLot No.: {6}\nSublot No.: {7}\nSEIBAN No.: {8}\nAsset type: {9}\nResult ID: {10}\nResult ID branch No.: {11}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0042' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0042',
	'en_US',
	'I',
	'Cannot create the cost by cost element since the latest weighted average unit price cannot be acquired.\nEvaluate on standard unit cost.\nCalculation group cd.: {1}\nYear month: {2}\nWG cd.: {3}\nManagement department cd.: {4}\nItem: {5}\nLot No.: {6}\nSublot No.: {7}\nSEIBAN No.: {8}\nAsset type: {9}\nResult ID: {10}\nResult ID branch No.: {11}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0043' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0043',
	'en_US',
	'W',
	'There is data whose calculation category, WG, or month is different from the one in the data to be entered.\nDelete the data of the calculation category, WG, or month.\nCalculation category cd.: {1}\nWG cd.: {2}\nYear month: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0044' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0044',
	'en_US',
	'I',
	'An item whose asset is not managed is entered for the target Accounting slip type. It will not be imported.\nItem: {1}\nAccounting slip type: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0045' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0045',
	'en_US',
	'I',
	'A parent/charged item whose asset is not managed is entered for the target Accounting slip type. It will not be imported.\nParent/charged item: {1}\nAccounting slip type: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0046' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0046',
	'en_US',
	'W',
	'A parent/charged item is entered in the Not Costing Item master. Since this item is will not be imported, a child item will not be issued.\nTable: {1}\nParent/charged item: {2}\nItem: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0047' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0047',
	'en_US',
	'W',
	'The parent/charged item is not entered in the Item master. Since this item is will not be imported, a child item will not be issued.\nTable: {1}\nParent/charged item: {2}\nItem: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0048' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0048',
	'en_US',
	'W',
	'Cannot transfer to input since none of the corresponding cost BOM info. exists.\nGR/GI result ID: {1}\nMfg. result group: {2}\nInventory company cd.: {3}\nItem: {4}\nQty.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0049' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0049',
	'en_US',
	'W',
	'Cannot transfer to order man-hour since none of the corresponding cost item man-hour info. exists.\nIndirect man-hour result ID: {1}\nMfg. result group: {2}\nWork element cd.: {3}\nMan-hour: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0050' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0050',
	'en_US',
	'W',
	'Cannot transfer to input since none of the corresponding Mfg. Result IF exists.\nGR/GI result ID: {1}\nMfg. result group: {2}\nInventory company cd.: {3}\nItem: {4}\nQty.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0051' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0051',
	'en_US',
	'W',
	'Cannot transfer to order man-hour since none of the corresponding Mfg. Result IF exists.\nIndirect man-hour result ID: {1}\nMfg. result group: {2}\nWork element cd.: {3}\nMan-hour: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBBD0052' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBBD0052',
	'en_US',
	'I',
	'Since all amounts by cost element calculated from the latest firmed weighted average unit price are 0, it is evaluated as 0.\nCalculation group cd.: {1}\nYear month: {2}\nWG cd.: {3}\nManagement dept. cd.: {4}\nItem: {5}\nLot No.: {6}\nSublot No.: {7}\nSEIBAN No.: {8}\nAsset type: {9}\nResult ID: {10}\nResult ID branch No.: {11}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDP0001',
	'en_US',
	'W',
	'Specify a different calculation category for the calculation category (Copy from) and (Copy to).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDP0002',
	'en_US',
	'W',
	'Specify a different term for the term (Copy from) and (Copy to).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDP0004',
	'en_US',
	'W',
	'Specify a different value for the calculation category (Copy from) and (Copy to), or the month (Copy from) and (Copy to).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDP0005',
	'en_US',
	'W',
	'Specify only one Calculation No. to carry over unallocated amount.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDP0006',
	'en_US',
	'W',
	'Specify different items for parent and child items.\nItem: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDP0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDP0007',
	'en_US',
	'W',
	'This will delete a record that cannot be deleted or that have been firmed. Continue?');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0001',
	'en_US',
	'W',
	'The cost calculation engine did not run properly.\nCalculation group cd.: {1}\nCalculation No.: {2}\n{3}\n{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0002',
	'en_US',
	'W',
	'An error has occurred during the cost calculation related process.\nCalculation group cd.: {1}\nCalculation No.: {2}\n{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0003',
	'en_US',
	'I',
	'The cost calculation engine completed successfully.\nCalculation group cd.: {1}\nCalculation No.: {2}\n{3}\n{4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0004',
	'en_US',
	'W',
	'Cannot apply since the calculation source record has been updated.\nRe-calculate it first.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0005',
	'en_US',
	'W',
	'The processing stopped since the data to be applied has already been processed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0006',
	'en_US',
	'W',
	'There is no record to be cancelled under specified condition.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0007',
	'en_US',
	'W',
	'Cannot apply since the standard allocation rate to be updated has already been firmed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0008',
	'en_US',
	'W',
	'Cannot enter since the same user is calculating using the same calculation group.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0009',
	'en_US',
	'W',
	'Cannot copy since there is data whose standard allocation rate has been firmed in the copy destination.\nTarget: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0010',
	'en_US',
	'W',
	'Cannot copy since there is data whose standard unit cost has been firmed in the copy destination.\nTarget: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0012' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0012',
	'en_US',
	'W',
	'There is data which has already been processed in the allocable expense data used for the departmental allocation calculation. Cancel the processed data.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0013' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0013',
	'en_US',
	'W',
	'The processing stopped since data of carry-over destination has already been processed.\nWG cd.: {1}\nYear month: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0014' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0014',
	'en_US',
	'W',
	'Carried-over data contains data having been carried over from other calculation result. Cancel data having been carried over.\nWG cd.: {1}\nYear month: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0015' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0015',
	'en_US',
	'W',
	'Only if a location in the company (a location where a supplier is not set for in the Location master)\nis specified as the location, a value other than 1 can be set to the yield mfg. qty.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0016' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0016',
	'en_US',
	'W',
	'Only if a location in the company (a location where a supplier is not set for in the Location master)\nis specified as the location, a value other than 1 can be specified to the ideal mfg. qty.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0019' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0019',
	'en_US',
	'W',
	'Cannot delete the row.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0020' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0020',
	'en_US',
	'W',
	'If the location is specified, the BOM pattern is required.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0021' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0021',
	'en_US',
	'W',
	'Cannot enter or delete since the standard unit cost which uses the target data has been firmed.\nTerm: {1}\nCalculation category cd.: {2}\nWG cd.: {3}\nItem: {4}\n{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0022' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0022',
	'en_US',
	'W',
	'Multiprocessing is not available for the cost calculation information which has the same calculation group and month.\nCalculation group cd.: {1}\nYear month: {2}\n{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0023' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0023',
	'en_US',
	'W',
	'Cannot delete since the standard unit cost of the item to be deleted has been firmed.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0024' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0024',
	'en_US',
	'I',
	'The cost calculation processing started.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0025' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0025',
	'en_US',
	'I',
	'The cost calculation processing completed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0026' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0026',
	'en_US',
	'W',
	'If a location is specified, no allocation dept. can be specified.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0027' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0027',
	'en_US',
	'W',
	'Cannot correct since the standard allocation rate has been firmed.\nTerm: {1}\nCalculation category cd.: {2}\nWG cd.: {3}\nAllocation account cd: {4}\nDept. cd.: {5}\nLocation cd.: {6}\nOperation cd.: {7}\nBP cd.: {8}\nItem category cd.: {9}\nItem: {10}\n{11}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0028' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0028',
	'en_US',
	'W',
	'Cannot correct since the exchange rate has been firmed.\nTerm: {1}\nExchange-from currency cd.: {2}\nExchange-to currency cd.: {3}\nExchange rate cd.: {4}\n{5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0029' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0029',
	'en_US',
	'W',
	'Select the first month for the calculation from the following:\n{1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0030' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0030',
	'en_US',
	'W',
	'Select the last month for the calculation from the following:\n{1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0031' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0031',
	'en_US',
	'W',
	'If an item not for asset management is specified, "3. Self supply" can only be specified as the Supply type.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0032' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0032',
	'en_US',
	'W',
	'If an item not for asset management is specified, no location can be specified.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0033' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0033',
	'en_US',
	'W',
	'The following can be specified only if a location is specified.\nColumn: {1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0034' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0034',
	'en_US',
	'W',
	'Only if a location in the company (a location where a supplier is not set in the Location master) is specified as a location, the following columns can be specified.\nColumn: {1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0035' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0035',
	'en_US',
	'W',
	'Specify a different calculation category for calculation category (Copy from) and (Copy to).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0036' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0036',
	'en_US',
	'W',
	'Specify a different term for term (Copy from) and (Copy to).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0037' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0037',
	'en_US',
	'W',
	'Specify a different value for calculation category (Copy from) and (Copy to), or month (Copy from) and (Copy to).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0038' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0038',
	'en_US',
	'W',
	'Cannot import since the item in the Item Details master to be imported is not entered in the Item master, or the Calculation pattern in the Item master is not set.\nItem: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0039' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0039',
	'en_US',
	'W',
	'There is no calculation run pattern configuration to be executed.\nCalculation run pattern cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0040' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0040',
	'en_US',
	'I',
	'A record containing a dept. which does not exist in the Cost Dept. master has been copied.\nTarget: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0041' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0041',
	'en_US',
	'W',
	'If the operation pattern is specified, the operation is required.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0042' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0042',
	'en_US',
	'W',
	'If the operation pattern is specified, the operation sequence number is required.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0043' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0043',
	'en_US',
	'W',
	'Cannot enter since the standard unit cost has been firmed.\nTerm: {1}\nItem: {2}\n{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0044' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0044',
	'en_US',
	'W',
	'The same value cannot be specified in the parent and child items.\nItem: {1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0045' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0045',
	'en_US',
	'W',
	'The specified BOM pattern has already been entered. Change the operation category to "Modify" before searching.\nCalculation category: {1}\nWG: {2}\nTerm: {3}\nParent Item: {4}\nBOM pattern: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0046' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0046',
	'en_US',
	'W',
	'Cannot be entered since the WG is different from the WG for the location.\nWG cd.: {1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0047' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0047',
	'en_US',
	'W',
	'Specify different items for parent and child items.\nItem: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0048' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0048',
	'en_US',
	'W',
	'Cannot be entered since the parent and child items have the same value.\nItem: {1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0049' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0049',
	'en_US',
	'W',
	'The following data already exists.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0050' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0050',
	'en_US',
	'I',
	'Starting the import target creation process (Item details).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0051' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0051',
	'en_US',
	'I',
	'Ending the import target creation process (Item details).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0052' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0052',
	'en_US',
	'I',
	'Starting the import target creation process (Item operation).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0053' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0053',
	'en_US',
	'I',
	'Ending the import target creation process (Item operation).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0054' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0054',
	'en_US',
	'I',
	'Starting the import target creation process (BOM).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0055' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0055',
	'en_US',
	'I',
	'Ending the import target creation process (BOM).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0056' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0056',
	'en_US',
	'I',
	'Starting the import target creation process (Item man-hour).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0057' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0057',
	'en_US',
	'I',
	'Ending the import target creation process (Item man-hour).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0058' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0058',
	'en_US',
	'I',
	'Starting the import target creation process (Purchase unit price).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0059' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0059',
	'en_US',
	'I',
	'Ending the import target creation process (Purchase unit price).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0060' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0060',
	'en_US',
	'I',
	'Starting the import target creation process (Processing unit price).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0061' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0061',
	'en_US',
	'I',
	'Ending the import target creation process (Processing unit price).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0062' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0062',
	'en_US',
	'I',
	'Starting the import target creation process (Supply unit price).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0063' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0063',
	'en_US',
	'I',
	'Ending the import target creation process (Supply unit price).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0064' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0064',
	'en_US',
	'I',
	'Starting the import target creation process (Sales unit price).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0065' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0065',
	'en_US',
	'I',
	'Ending the import target creation process (Sales unit price).');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0066' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0066',
	'en_US',
	'I',
	'Starting the cost calculation engine processing.\nCalculation group cd.: {1}\nCost calculation No.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0067' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0067',
	'en_US',
	'I',
	'The cost calculation engine processing completed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0068' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0068',
	'en_US',
	'W',
	'Cannot import since the child item in the BOM master to be imported is not entered in the Item master, or the calculation pattern is not set in the Item master.\nItem: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0069' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0069',
	'en_US',
	'W',
	'No import data meets the condition.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0070' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0070',
	'en_US',
	'W',
	'Cannot import since the calculation pattern of the item to be imported is not set in the Item master.\nItem: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDL0071' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDL0071',
	'en_US',
	'W',
	'Specify a value different from the WG in the requested WG.\nWG cd.: {1}\nRequested WG cd.: {2}\n{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0001',
	'en_US',
	'W',
	'The processing stopped since the number of calculation result records exceeds the maximum number of departmental allocation records. \nThe number of calculation result records: {1}\nThe max. number of departmental allocation records: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0002',
	'en_US',
	'I',
	'The processing stopped since the maximum hierarchy of departmental allocation is exceeded.\nThe max. hierarchy of departmental allocation: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0003',
	'en_US',
	'W',
	'Cannot allocate since there is no Departmental Alloc. Basis Selection master.\nWG cd.: {1}\nDepartment cd.: {2}\nAllocation account cd.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0004',
	'en_US',
	'W',
	'Cannot allocate since a valid allocation destination does not exist for the Departmental allocation basis cd.\nSee the setting of the departmental alloc. fixed ratio and the setting of the Departmental Alloc. Destination Dept. master.\nTerm: {1}\nDepartmental alloc. basis cd.: {2}\nWG cd.: {3}\nAllocation source dept. cd.: {4}\nAllocation destination department pattern: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0005',
	'en_US',
	'W',
	'Cannot allocate since the total value of data to be allocated is 0.\nSee the setting of the departmental alloc. fixed ratio and the setting of the Departmental Alloc. Destination Dept. master.\nTerm: {1}\nDepartmental alloc. basis: {2}\nWG: {3}\nAllocation source dept.: {4}\nAllocation destination department pattern: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0006',
	'en_US',
	'W',
	'Cannot allocate since a valid allocation destination does not exist for the Departmental alloc. basis cd.\nSee the setting of the departmental alloc. fixed ratio and the setting of the Departmental Alloc. Destination Dept. master.\nYear month: {1}\nDepartmental alloc. basis cd.: {2}\nWG cd.: {3}\nAllocation source dept.: {4}\nAllocated destination department pattern: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0007',
	'en_US',
	'W',
	'Cannot allocate since the total value of data to be allocated is 0.\nSee the setting of the departmental alloc. variable ratio and the setting of the Departmental Alloc. Destination Dept. master.\nYear month: {1}\nDepartmental alloc. basis cd.: {2}\nWG cd.: {3}\nAllocation source dept.: {4}\nAllocated destination department pattern: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0008',
	'en_US',
	'I',
	'Target number\nTable: {1}\nNumber of rows: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0009',
	'en_US',
	'W',
	'The same user cannot perform multiple cost calculation processes simultaneously for the same calculation group.\nCalculation group cd.: {1}\nPIC: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0010',
	'en_US',
	'W',
	'There are records in which the departmental alloc. calculation result is reflected or the unallocated amount is carried over. Cannot be deleted.\nCalculation group cd.: {1}\nCalculation No.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0011' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0011',
	'en_US',
	'W',
	'There are records in which the standard allocation rate has been firmed. Cannot be deleted.\nCalculation group cd.: {1}\nCalculation No.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0013' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0013',
	'en_US',
	'W',
	'Cannot delete since there are records which has been journalized.\nCalculation group cd.: {1}\nYear month {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0014' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0014',
	'en_US',
	'W',
	'No valid record is entered in the Cost Accounting Slip Type Journal master.\nCalculation group cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0015' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0015',
	'en_US',
	'I',
	'The number of data for sending: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0016' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0016',
	'en_US',
	'W',
	'No valid record is entered in the Accounting Dept. master.\nAccounting dept. cd.: {1}\nApplication date: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0017' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0017',
	'en_US',
	'W',
	'In the Calculation Group master, an uncalculated group which is in the same calculation sequence group and has the smaller calculation sequence number exists.\nCalculation group cd.: {1}\nComputation sequence group: {2}\nCalculation sequence: {3}\nPriority calculation group cd.: {4}\nPriority calculation sequence: {5}\nYear month: {6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0018' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0018',
	'en_US',
	'W',
	'Cannot process since the calculation result of the acquisition source data has not been firmed.\nFirm the calculation result whose calculation sequence number is smaller.\nAcquisition calculation group cd.: {1}\nAcquisition calculation No.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0019' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0019',
	'en_US',
	'W',
	'Cannot process since the calculation result of linkage destination has already been firmed.\nCancel the firmed calculation result whose calculation sequence number is larger.\nLink-to calculation group cd.: {1}\nLink-to calculation No.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0020' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0020',
	'en_US',
	'W',
	'The processing stopped since a loop occurred in the departmental alloc. calculation.\nTop sequence number: {1}\nLoop sequence number 1: {2}\nLoop sequence number 2: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0021' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0021',
	'en_US',
	'W',
	'The processing stopped since the maximum hierarchy of departmental allocation is exceeded.\nDepartmental alloc. max. hierarchy: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0022' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0022',
	'en_US',
	'I',
	'Data that affects the firmed standard unit cost is included. The data will not be imported, and deleted from import target.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0023' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0023',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master.\nItem: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0024' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0024',
	'en_US',
	'W',
	'Not entered as an item for asset management in the Item master. Not be imported.\nItem: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0025' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0025',
	'en_US',
	'W',
	'Not entered as a valid location in the Location master.\nLocation cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0026' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0026',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nBP cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0027' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0027',
	'en_US',
	'W',
	'Cannot set a location to an item not for asset management.\nItem: {1}\nLocation cd.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0028' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0028',
	'en_US',
	'W',
	'Specify only one of the following: a location, a supplier, or a requested WG.\nItem: {1}\nLocation cd.: {2}\nSupplier cd.: {3}\nRequested WG cd.: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0029' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0029',
	'en_US',
	'W',
	'The following columns will be required if the operation control unit is specified: Operation management unit, Operation base unit qty., Operation conversion unit qty., Significant digit in decimal places, and Rounding type (Conversion)\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nOperation management unit cd.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0030' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0030',
	'en_US',
	'W',
	'Specify a positive number in the operation base unit qty.\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nOperation management unit cd.: {5}\nOperation base unit quantity: {6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0031' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0031',
	'en_US',
	'W',
	'Specify a value of 0 or higher in the operation conversion unit qty.\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nOperation management unit cd.: {5}\nOperation conversion unit qty.: {6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0032' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0032',
	'en_US',
	'W',
	'Specify an integer between 0 and 8 as the significant digits in the decimal places.\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nOperation management unit cd.: {5}\nSignificant digits in decimal places: {6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0033' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0033',
	'en_US',
	'W',
	'Specify different items for the parent and child items.\nItem: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0034' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0034',
	'en_US',
	'W',
	'When specifying an alternative group, specify the alternative item ratio.\nParent item: {1}\nBOM pattern: {2}\nTerm: {3}\nCalculation category cd.: {4}\nAlternative group cd.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0035' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0035',
	'en_US',
	'W',
	'For the Supply type, specify "2. Chargeable supply" or "3. Self supply".\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nSupply type: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0037' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0037',
	'en_US',
	'W',
	'Specify a positive number in the base number.\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nBase qty.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0039' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0039',
	'en_US',
	'W',
	'Specify a positive number in the parent required number.\nParent item: {1}\nBOM pattern: {2}\nTerm: {3}\nCalculation category cd.: {4}\nChild item: {5}\nParent required number: {6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0040' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0040',
	'en_US',
	'W',
	'Specify a number other than 0 in the unit price.\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nUnit price: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0044' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0044',
	'en_US',
	'W',
	'Not entered as an item for asset management in the Item master. Not subject to the parent item.\nParent item: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0045' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0045',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master.\nParent item: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0046' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0046',
	'en_US',
	'W',
	'Not entered as a valid item in the Item master.\nChild item: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0048' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0048',
	'en_US',
	'W',
	'Neither location, supplier, nor requested WG is set in the data to be imported.\nItem: {1}\nWG cd.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0051' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0051',
	'en_US',
	'W',
	'Cannot set the sales unit prince since the data cannot be acquired from the Standard Sales Unit Price master or the Currency master even through the rate is specified.\nItem: {1}\nCustomer cd.: {2}\nDelivery destination cd.: {3}\nCurrency cd.: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0052' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0052',
	'en_US',
	'W',
	'Cannot convert the tax excluding unit price since the data cannot be acquired from the Tax master or the Currency master.\nItem: {1}\nCustomer cd.: {2}\nDelivery destination cd.: {3}\nTax cd.: {4}\nCurrency cd.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0053' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0053',
	'en_US',
	'W',
	'Cannot convert the tax excluding unit price since the data cannot be acquired from the Tax master or the Currency master.\nItem: {1}\nSupplier cd.: {2}\nTax cd.: {3}\nCurrency cd.: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0055' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0055',
	'en_US',
	'W',
	'Specify a positive number in the base number.\nItem: {1}\nWG cd.: {2}\nTerm: {3}\nCalculation category cd.: {4}\nBase qty.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0056' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0056',
	'en_US',
	'W',
	'Cannot acquire the calculation category. Set the default calculation category in the Cost Company Parameter master.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0057' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0057',
	'en_US',
	'W',
	'An error has occurred during importing the master. See the log file. Note that the imported data is updated.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0058' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0058',
	'en_US',
	'W',
	'An error has occurred during creating import data. See the log file. Note that the data is created.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0059' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0059',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nSupplier cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0060' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0060',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nSubcontractor cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0061' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0061',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nCustomer cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0062' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0062',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDelivery destination cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0063' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0063',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDistribution channel cd. 1: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0064' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0064',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDistribution channel cd. 2: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0065' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0065',
	'en_US',
	'W',
	'Not entered as a valid BP in the BP master.\nDistribution channel cd. 3: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0066' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0066',
	'en_US',
	'W',
	'Not entered as a valid WG in the WG master.\nRequested WG cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBDD0067' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBDD0067',
	'en_US',
	'W',
	'Cannot specify the same value as the WG in the requested WG.\nRequested WG cd.: {1}\nWG cd.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0001',
	'en_US',
	'I',
	'The number of firmed items: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0002',
	'en_US',
	'W',
	'There is an item whose standard unit price was firmed by different calculation.\nRecalculate it first, and execute the firm processing.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0003',
	'en_US',
	'W',
	'Cannot process cost calculation results where an error has occurred.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0004',
	'en_US',
	'W',
	'Since the standard unit cost has been firmed in the calculation for which the target standard allocation rate data is used, cannot cancel the firmed standard allocation rate.\nCancel the firmed standard unit price for the target item.\nTerm: {1}\nCalculation category cd.: {2}\nWG cd.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0005',
	'en_US',
	'W',
	'There is data which has not been firmed for standard alloc. rate data to be calculated.\nExecute the firming process for the standard alloc. rate.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0006',
	'en_US',
	'W',
	'There is an item whose standard alloc. rate was firmed by different calculation.\nRecalculate it first, and execute the firming processing.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0007',
	'en_US',
	'W',
	'No item to be firmed exists.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0008',
	'en_US',
	'W',
	'No item to be unfirmed exists.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0009',
	'en_US',
	'W',
	'An unfirm child item exists.\nItem: {1}\nCalculation category cd.: {2}\nWG cd.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBED0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBED0010',
	'en_US',
	'W',
	'Failed to firm the standard unit cost.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBFP0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBFP0002',
	'en_US',
	'W',
	'It is not the cost calculation result which can be seen in the Cost Breakdown List.\nA calculation result which can be seen is the one which has been firmed in the last month of the calculation period, or the one of the latest calculation.\nCalculation group cd.: {1}\nCalculation No.: {2}\nYear month: {3}\nTarget calculation No.: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBFL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBFL0001',
	'en_US',
	'W',
	'The revaluation loss is entered by using multiple cost calculation results for the same calculation group and the year and month.\nCannot record the revaluation loss using multiple cost calculation results.\nRevaluation loss on calculation No.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBFD0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBFD0001',
	'en_US',
	'W',
	'Cannot aggregate values since no record to be aggregated is entered in the Custom T Account Column master, even though the GR/GI aggregated unit type is set as other than "1. GR/GI unit".\nGR/GI list ID: {1}\nGR/GI column: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGP0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGP0001',
	'en_US',
	'W',
	'If there is no key, multiple rows cannot be entered.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGP0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGP0002',
	'en_US',
	'W',
	'Specify the range of periods up to 5.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGP0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGP0003',
	'en_US',
	'W',
	'Specify the range of months up to 60.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGL0001',
	'en_US',
	'W',
	'Cannot reflect the data since the reflection destination data has already been processed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGL0002',
	'en_US',
	'W',
	'There are multiple records which has the same value in the column below.\nUnselect the To import of unnecessary records.\nData row No.: {1}\nColumn: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGL0003',
	'en_US',
	'W',
	'If there is no key, multiple rows cannot be entered.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGL0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGL0004',
	'en_US',
	'I',
	'Data No.: {1}\nThe number of data: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGD0001',
	'en_US',
	'W',
	'Cannot process since it is not entered in the Departmental Alloc. Basis master, or no Ratio setting type has been set in the master.\nDepartmental alloc. basis cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGD0002',
	'en_US',
	'W',
	'Cannot create plan ratio data since the monthly ratio is not set in the Departmental Alloc. Basis master.\nDepartmental alloc. basis cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGD0003',
	'en_US',
	'W',
	'Cannot create result ratio data since the monthly ratio result is not set in the Departmental Alloc. Basis master.\nDepartmental alloc. basis cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGD0004',
	'en_US',
	'W',
	'Cannot process since it is not entered in the Departmental Alloc. Basis Category master.\nTerm: {1}\nWG cd.: {2}\nCalculation category cd.: {3}\nDepartmental alloc. basis cd.: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGD0005',
	'en_US',
	'W',
	'Cannot process since no records to be used are set in the Departmental Alloc. Basis Man-Hour master.\nTerm: {1}\nWG cd.: {2}\nCalculation category cd.: {3}\nDepartmental alloc. basis cd.: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGD0006',
	'en_US',
	'W',
	'None of key info. has been acquired for the target departmental alloc. variable ratio.\nPlan/Result type: {1}\nYear month: {2}\nWG cd.: {3}\nCalculation category cd.: {4}\nDepartmental alloc. basis cd.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBGD0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBGD0007',
	'en_US',
	'W',
	'Acquired the key info. Based on the departmental alloc. monthly rate. However, there is a value in a column which is set as exclude in the Departmental Alloc. Pattern master.\nUpdate the data.\nPlan/Result type: {1}\nYear month: {2}\nWG cd.: {3}\nCalculation category cd.: {4}\nDepartmental alloc. basis cd.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBPP0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBPP0001',
	'en_US',
	'D',
	'The conversion from the base unit to the operation unit skipped.\nBase unit qty.: {1}\nOperation conversion unit qty.: {2}\nOperation base unit qty. : {3}\nSignificant digit in decimal places: {4}\nUnit conversion rounding type: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXL0031' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXL0031',
	'en_US',
	'W',
	'The Accounting slip type is invalid.\nAccounting slip type: {1}\nAccounting slip type that can be entered: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXL0049' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXL0049',
	'en_US',
	'W',
	'To set the value for the column below, "3. Target" must be set for the column in the Departmental Alloc. Pattern master.\nColumn: {1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0001',
	'en_US',
	'I',
	'The processing started. {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0002',
	'en_US',
	'I',
	'The processing completed. {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0003',
	'en_US',
	'I',
	'The processing completed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0004',
	'en_US',
	'W',
	'An SQL error has occurred. {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0005',
	'en_US',
	'W',
	'Cannot process since the cost calculation result for this month has already been firmed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0006',
	'en_US',
	'W',
	'Fail to acquire the calculation No.\nCalculation group cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0007',
	'en_US',
	'W',
	'No actual cost calculation result to be processed exist.\nCalculation group cd.: {1}\nCalculation No.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0008',
	'en_US',
	'W',
	'The data is not entered are the cost exchange rate.\nCurrency cd.: {1}\nBase currency cd.: {2}\nExchange rate cd: {3}\nPeriod: {4}\nTarget table: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0009',
	'en_US',
	'W',
	'Cannot process the data since it is being processing.\nCalculation group cd.: {1}\nCalculation No.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0010',
	'en_US',
	'W',
	'Cannot process the data since it is being processing.\nCalculation group cd.: {1}\nYear month: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0011' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0011',
	'en_US',
	'W',
	'No firmed information to be processed exist.\nCalculation group cd.: {1}\nYear month: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0012' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0012',
	'en_US',
	'I',
	'Starting the cost report generation processing.\nCalculation group cd.: {1}\nCalculation No.: {2}\nReport Pattern cd.: {3}\nReport Key cd.: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0013' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0013',
	'en_US',
	'I',
	'Starting the custom T account generation processing.\nCalculation group cd.: {1}\nCalculation No.: {2}\nGR/GI list ID: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0014' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0014',
	'en_US',
	'W',
	'Cannot process since the actual cost calculation result for the target data has already been firmed.\nCalculation group cd.: {1}\nYear month: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0015' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0015',
	'en_US',
	'W',
	'The firm standard unit cost does not exist.\nTerm: {1}\nItem: {2}\nWG cd.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0016' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0016',
	'en_US',
	'W',
	'Cannot process since the actual cost calculation result for the target data has already been firmed .\nTarget: {1}\nCalculation group cd.: {2}\nCalculation category cd.: {3}\nWG cd.: {4}\nYear month: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0017' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0017',
	'en_US',
	'W',
	'There is no data for this processing in the Calculation Group Report master.\nCalculation group cd.: {1}\nReport pattern cd.: {2}\nReport key cd.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0018' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0018',
	'en_US',
	'I',
	'Starting the Departmental alloc. ratio creation processing.\nPlan/Result type: {1}\nYear month: {2}\nWG cd.: {3}\nCalculation category cd.: {4}\nDepartmental alloc. basis cd.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0019' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0019',
	'en_US',
	'W',
	'Cannot process since a month later than the specified month is firmed.\nCalculation group cd.: {1}\nYear month: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0020' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0020',
	'en_US',
	'W',
	'Cannot firm data whose maximum calculation moth is 0.\nCalculation group cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0021' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0021',
	'en_US',
	'W',
	'There is no corresponding record in the Custom T Account master.\nGR/GI list ID: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0022' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0022',
	'en_US',
	'W',
	'There is no corresponding record in the Custom T Account Configuration master.\nGR/GI list ID: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0023' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0023',
	'en_US',
	'W',
	'There is no target data in the Calculation Group GR/GI List master.\nCalculation group cd.: {1}\nGR/GI list ID: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0024' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0024',
	'en_US',
	'W',
	'A loop has occurred in the Cost Report Row Aggregated master.\nReport pattern cd.: {1}\nAggregated report row cd: {2}\nReport row cd: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0025' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0025',
	'en_US',
	'W',
	'Cannot process since the input result has already been firmed, even though input transfer is set in the GR/GI Result Transfer master.\nTarget: {1}\nCalculation group cd.: {2}\nCalculation category cd.: {3}\nWG cd.: {4}\nYear month: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0026' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0026',
	'en_US',
	'W',
	'Cannot process since the cost calculation result which uses the target cost data has already been firmed.\nCalculation group cd.: {1}\nCalculation category cd.: {2}\nWG cd.: {3}\nYear month: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0027' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0027',
	'en_US',
	'W',
	'Revaluation loss is recorded with another cost calculation No. Execute the firm processing for the data for which the revaluation loss is recorded.\nCalculation group cd.: {1}\nYear month: {2}\nTarget calculation No.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0028' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0028',
	'en_US',
	'I',
	'Stating the generation processing of inventory revaluation unit price data.\nCalculation category cd.: {1}\nWG cd.: {2}\nYear month: {3}\nInventory revaluation cd: {4}\nCalculation group cd.: {5}\nCalculation No.: {6}\nYear month FROM: {7}\nYear month TO: {8}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0029' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0029',
	'en_US',
	'W',
	'Cannot process the target data since it is being processing.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0030' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0030',
	'en_US',
	'I',
	'Starting the processing.\nCalculation group cd.: {1}\nYear month: {2}\nCalculation No.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0031' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0031',
	'en_US',
	'W',
	'Cannot copy the data since the cost item details info. contains data whose standard unit cost has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0032' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0032',
	'en_US',
	'W',
	'Cannot copy the data since the cost item operation info. contains data whose standard unit cost has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0033' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0033',
	'en_US',
	'W',
	'Cannot copy the data since the cost BOM info. contains data whose standard unit cost has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0034' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0034',
	'en_US',
	'W',
	'Cannot copy the data since the cost item man-hour info. contains data whose standard unit cost has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0035' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0035',
	'en_US',
	'W',
	'Cannot copy the data since the cost item purchase unit price info. contains data whose standard unit cost has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0036' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0036',
	'en_US',
	'W',
	'Cannot copy the data since the cost item purchase unit price info. contains data whose standard unit cost has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0037' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0037',
	'en_US',
	'W',
	'An error has occurred. See the log file. Note that the imported data has been updated. {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0038' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0038',
	'en_US',
	'W',
	'The Cost Company Parameter master is not entered.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0039' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0039',
	'en_US',
	'W',
	'A problem such as overflow of digits has occurred as a result of unit conversion.\nQty.: {1}\nConversion base qty.: {2}\nConverted qty.: {3}\nSignificant digit in decimal places: {4}\nRounding type: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0040' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0040',
	'en_US',
	'W',
	'Cannot copy the data since the cost item subcontracting unit price info. contains data whose standard unit cost has already been firmed.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0041' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0041',
	'en_US',
	'W',
	'Not entered in the Cost Dept. master.\nDept. cd.: {1}\nPeriod: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0042' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0042',
	'en_US',
	'W',
	'Not entered in the Calculation Group master.\nCalculation group cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0043' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0043',
	'en_US',
	'W',
	'Not entered in the Item master.\nItem: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0044' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0044',
	'en_US',
	'W',
	'Not entered in the Currency master.\nCurrency cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0045' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0045',
	'en_US',
	'W',
	'Not entered in the Departmental Alloc. Basis master.\nDepartmental alloc. basis cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0046' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0046',
	'en_US',
	'W',
	'Not entered in the Departmental Alloc. Pattern master.\nDepartmental alloc. pattern cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0047' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0047',
	'en_US',
	'W',
	'Cannot process since a WG which you do not have the update authority exists in the Calculation Group WG master.\nCalculation group cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0048' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0048',
	'en_US',
	'W',
	'Cannot process since the input result has already been firmed, even though data in which mfg. result group is set exists on the GR/GI Result IF.\nCalculation group cd.: {1}\nCalculation category cd.: {2}\nWG cd.: {3}\nYear month: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGBXD0049' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGBXD0049',
	'en_US',
	'I',
	'GI amounts are set to be transferred to departmental allocation expenses, but the GI amount is zero.\nYear month: {1}\nWG cd.: {2}\nManagement dept. cd.: {3}\nItem: {4}\nLot No.: {5}\nSublot No.: {6}\nSEIBAN No.: {7}\nAsset type: {8}\nAllocation account cd.: {9}\nResult ID: {10}\nResult ID branch No.: {11}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAB0001',
	'en_US',
	'W',
	'No value is set for the IF process type: bi_ope.\nIF process type: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAB0002',
	'en_US',
	'W',
	'Invalid value is set for the IF process type: bi_ope.\nIF process type: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAB0003',
	'en_US',
	'W',
	'"The specified IF process type does not exist.\nIF process type: {1}"');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAB0004',
	'en_US',
	'W',
	'The specified IF process type is not subject to the processing.\nIF process type: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAB0005',
	'en_US',
	'I',
	'Starting the BI Link batch processing.\nIF process type: {1}\nExternal system cd.: {2}\nYear and month: {3}\nCalculation group cd.: {4}\nCalculation No.: {5}\nFirm only: {6}\nCompany cd.: {7}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAB0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAB0006',
	'en_US',
	'I',
	'The BI Link batch processing completed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0001',
	'en_US',
	'W',
	'Invalid value is set for the IF process type. \nIF process type: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0002',
	'en_US',
	'W',
	'If the Firm only flg. is turned on, you cannot specify the Calculation No.\nIF process type: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0003',
	'en_US',
	'I',
	'Starting the Actual Cost Calculation Result Export IF processing.\nCompany cd.: {1}\nIF process type: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0004',
	'en_US',
	'I',
	'The Actual Cost Calculation Result Export IF processing completed.\nCompany cd.: {1}\nProcessed: {2}\nNumber of entries: {3}\nNumber of errors: {4}\nNumber of skipped records: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0005',
	'en_US',
	'W',
	'There is data that failed to set the Batch log No., the Log subkey 1, and the Log subkey 2.\nSee the IF Data Export Status screen for details.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0006',
	'en_US',
	'I',
	'Starting the T Account Export processing.\nCompany cd.: {1}\nIF process type: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0007',
	'en_US',
	'I',
	'The T Account Export processing completed.\nCompany cd.: {1}\nProcessed: {2}\nNumber of entries: {3}\nNumber of errors: {4}\nNumber of skipped records: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0008',
	'en_US',
	'I',
	'Starting the Operation Cost Calculation Result Export IF processing.\nCompany cd.: {1}\nIF process type: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0009',
	'en_US',
	'I',
	'The Operation Cost Calculation Result Export IF processing completed.\nCompany cd.: {1}\nProcessed: {2}\nNumber of entries: {3}\nNumber of errors: {4}\nNumber of skipped records: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0010',
	'en_US',
	'I',
	'Starting the Actual Cost Calculation Result Export IF processing.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0011' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0011',
	'en_US',
	'I',
	'The Actual Cost Calculation Result Export IF processing completed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0012' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0012',
	'en_US',
	'I',
	'Starting the T Account Export processing.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0013' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0013',
	'en_US',
	'I',
	'The T Account Export processing completed.\n');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0014' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0014',
	'en_US',
	'I',
	'Starting the Operation Cost Calculation Result Export IF processing.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGLAL0015' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGLAL0015',
	'en_US',
	'I',
	'The Operation Cost Calculation Result Export IF processing completed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUAL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUAL0001',
	'en_US',
	'W',
	'Not entered in the Inventory Revaluation master.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUAL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUAL0002',
	'en_US',
	'W',
	'The departmental alloc. basis for the following condition is not entered in the Departmental Alloc. Basis master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\n{4}\n');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUAL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUAL0003',
	'en_US',
	'W',
	'The departmental alloc. basis which does not exist in the departmental alloc. fixed ratio for\nthe following condition is not set in the Departmental Alloc. Basis master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\n{4}\n\n');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUAL0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUAL0004',
	'en_US',
	'W',
	'The departmental alloc. basis which does not exist in the departmental alloc. variable ratio for the following condition is not set in the Departmental Alloc. Basis master.\nCalculation category cd.: {1}\nWG cd.: {2}\nTerm: {3}\nYear month: {4}\nPlan/Result type: {5}\n{6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUCL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUCL0001',
	'en_US',
	'W',
	'Could not acquire the cost company parameter info.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUCL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUCL0002',
	'en_US',
	'W',
	'Cannot enter or delete since the standard allocation ratio which uses the target allocation pattern has already been firmed.\nTerm: {1}\nAllocation pattern: {2}\n{3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUCL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUCL0003',
	'en_US',
	'W',
	'No actual cost calculation result to be processed exist.\nCalculation group cd.: {1}\nCalculation No.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUCD0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUCD0001',
	'en_US',
	'W',
	'Could not convert the target dept. to the cost dept.\nDepartment: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUCD0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUCD0002',
	'en_US',
	'W',
	'Could not acquire the calculation category for the target dept.\nDept.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDL0001',
	'en_US',
	'W',
	'Only "1. Own company (sales)" or "2. Own company (production)" can be specified for the Asset type.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDL0002',
	'en_US',
	'W',
	'Cannot process since the actual cost calculation result for the target data has already been firmed.\nCalculation group cd.: {1}\nYear month: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDL0003',
	'en_US',
	'W',
	'Only "1. Standard unit cost" or "2. 0 evaluation" can be specified for the Individual evaluation type.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDL0004',
	'en_US',
	'W',
	'If "Common" is specified for the entry target, the columns below should be specified.\nColumn: {1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDL0005',
	'en_US',
	'W',
	'If the Operation result No. is specified, the columns below should be specified.\nColumn: Operation cd., Operation sequence number\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDL0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDL0006',
	'en_US',
	'W',
	'The columns below can be specified only if the Operation result No. is specified.\nColumn: Operation cd., Operation sequence number\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDP0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDP0001',
	'en_US',
	'W',
	'Specify the year and month to be within {1} months.');

DELETE FROM FCT_MSG WHERE MSGID = 'MGUDP0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MGUDP0002',
	'en_US',
	'W',
	'Specify the term to be within {1} terms.');

