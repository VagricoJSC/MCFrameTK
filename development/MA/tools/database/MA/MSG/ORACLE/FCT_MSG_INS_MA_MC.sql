DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0001',
	'W',
	'次のデータは既に存在します。\n仕訳パタンＣＤ：{1}\n連番：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0002',
	'W',
	'部門情報が登録されています。\n既存の期間に対して変更する場合は、操作種別に「訂正する」を指定してください。\n組織変更を行なう場合は、操作種別に「組織変更する」を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0003',
	'W',
	'対象の部門を上位部門とするレコードが登録されています。\n対象の部門を上位部門とするレコードを全て削除してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0004',
	'W',
	'対象の部門を上位部門とするレコードが登録されています。\n対象の部門を上位部門とするレコードを全て削除してください。\n（論理削除をオンにしてください）');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0005',
	'W',
	'上位部門が論理削除されています。上位部門に対して論理削除取消を行なってください。\n（論理削除をオフにしてください）');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0006',
	'I',
	'得意先に関する項目をクリアします。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0007',
	'I',
	'売掛先に関する項目をクリアします。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0008',
	'I',
	'請求先に関する項目をクリアします。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0009',
	'I',
	'入金先に関する項目をクリアします。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0010',
	'I',
	'納品先に関する項目をクリアします。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0011',
	'I',
	'発注先に関する項目をクリアします。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0012',
	'I',
	'買掛先に関する項目をクリアします。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0013',
	'I',
	'支払予定管理先に関する項目をクリアします。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0014',
	'I',
	'支払先に関する項目をクリアします。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0015',
	'W',
	'対象の販売品目体系を上位販売品目体系とするレコードが登録されています。\n対象の販売品目体系を上位販売品目体系とするレコードを全て削除してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0016',
	'W',
	'対象の販売品目体系を上位販売品目体系とするレコードが登録されています。\n対象の販売品目体系を上位販売品目体系とするレコードを全て削除してください。\n（論理削除をオンにしてください）');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0017',
	'W',
	'上位販売品目体系が論理削除されています。\n上位販売品目体系に対して論理削除取消を行なってください。\n（論理削除をオフにしてください）');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0018',
	'W',
	'品目単位マスタに登録してください。\n項目：{1}\n単位ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0019',
	'W',
	'品目単位マスタに梱包単位として登録してください。\n項目：{1}\n単位ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCP0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCP0020',
	'W',
	'指定されたファイルが見つからないか実行に失敗しました。\nパス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0001',
	'W',
	'削除対象が存在しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0002',
	'W',
	'すでにデフォルトがオンのデータが登録されています。有効な期間内において、同一の会計伝票区分・自動仕訳キー・自動仕訳グループの中で1件のみデフォルトをオンにできます。\n会計伝票区分：{1}\n自動仕訳キーＣＤ：{2}\n自動仕訳グループ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0003',
	'W',
	'対象の仕訳グループは、自動仕訳パタンマスタで使用されているため、削除できません。\n仕訳グループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0004',
	'W',
	'換算元通貨と換算先通貨に同じ値を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0005',
	'W',
	'補助勘定科目を使用する勘定科目を指定した場合は補助勘定科目は必須です。\n勘定科目ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0006',
	'W',
	'換算元単位と換算先単位は異なる単位を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0007',
	'W',
	'補助勘定科目を使用する勘定科目を指定した場合のみ補助勘定科目を指定できます。\n勘定科目ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0008',
	'W',
	'取引先を使用する勘定科目を指定した場合のみ取引先を使用する取引先区分を指定できます。\n勘定科目ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0009',
	'W',
	'取引先を使用する勘定科目に対して取引先区分に「X：使用しない」を指定できません。\n勘定科目ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0010',
	'W',
	'仕向先１が未指定の場合は、仕向先２を指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0011',
	'W',
	'仕向先２が未指定の場合は、仕向先３を指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0012',
	'W',
	'ロスをオンとした場合のみ固定ロスをオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0013',
	'W',
	'すでに固定ロスがオンのデータが登録されています。業務理由マスタに対して1件のみ固定ロスをオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0014',
	'W',
	'仕入をオンとした場合のみ仕入ソート順を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0015',
	'W',
	'仕入返品をオンとした場合のみ仕入返品ソート順を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0016',
	'W',
	'仕入または仕入返品をオンとした場合のみ経費購買をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0017',
	'W',
	'仕入調整をオンとした場合のみ仕入調整管轄区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0018',
	'W',
	'仕入調整をオンとした場合のみ仕入調整ソート順を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0019',
	'W',
	'売上をオンとした場合のみ売上ソート順を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0020',
	'W',
	'売上返品をオンとした場合のみ売上返品ソート順を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0021',
	'W',
	'売上または売上返品がオンの場合のみ販売他勘定をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0022',
	'W',
	'売上調整をオンとした場合のみ売上調整ソート順を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0023',
	'W',
	'経費購買をオンとした場合のみ受注紐付経費購買をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0024',
	'W',
	'廃棄をオンとした場合のみ廃棄ソート順を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0025',
	'W',
	'在庫振替をオンとした場合のみ在庫振替ソート順を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0026',
	'W',
	'移送をオンとした場合のみ移送ソート順を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0027',
	'W',
	'出来高をオンとした場合のみ出来高ソート順を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0028',
	'W',
	'他勘定入庫をオンとした場合のみ他勘定入庫ソート順を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0029',
	'W',
	'ロスをオンとした場合のみロットトレース対象外をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0030',
	'W',
	'検査不良をオンとした場合のみ検査不良ソート順を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0031',
	'W',
	'他勘定出庫をオンとした場合のみ他勘定出庫ソート順を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0032',
	'W',
	'在庫管理区分に「2.在庫管理しない」、資産管理区分に「1.資産管理する」を指定した場合、以下のいずれかの手配ＮＯ管理区分に「2.管理する（必須）」を指定する必要があります。\n手配ＮＯ１管理区分\n手配ＮＯ２管理区分\n手配ＮＯ３管理区分\n手配ＮＯ４管理区分\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0033',
	'W',
	'他勘定入庫または他勘定出庫をオンとした場合のみ投入他勘定ソート順を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0034',
	'W',
	'品目区分に「7.架空品」を指定した場合は、以下の項目をオンにできません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0035',
	'W',
	'品目区分に「7.架空品」を指定した場合は、以下の項目を指定できません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0036',
	'W',
	'債権のワーキンググループを指定した場合のみ債権部門をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0037',
	'W',
	'債務のワーキンググループを指定した場合のみ債務部門をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0038',
	'W',
	'販売のワーキンググループを指定した場合のみ営業部門をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0039',
	'W',
	'購買のワーキンググループを指定した場合のみ購買部門をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0040',
	'W',
	'物流もしくは製造のワーキンググループを指定した場合のみ以下の項目をオンにできます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0041',
	'W',
	'製造のワーキンググループを指定した場合のみ製造部門をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0042',
	'W',
	'需給のワーキンググループを指定した場合のみ需給部門をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0043',
	'W',
	'発注先を指定した場合のみメーカを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0044',
	'W',
	'発注先を指定した場合は、管轄区分には「2.生産」以外を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0045',
	'W',
	'引当余裕日数にマイナス値を指定した場合のみ移動・移送引当対象外をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0046',
	'W',
	'発注先を指定した場合は、物流標準場所をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0047',
	'W',
	'すでに口座科目設定マスタ取込１がオンのデータが登録されています。仕訳グループマスタに対して1件のみ口座科目設定マスタ取込１をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0048',
	'W',
	'在庫管理区分に「3.架空品」を指定した場合は、資産管理区分に「3.架空品」以外を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0049',
	'W',
	'資産管理区分に「3.架空品」を指定した場合は、在庫管理区分に「3.架空品」以外を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0050',
	'W',
	'在庫管理区分に「3.架空品」を指定した場合は、諸口品をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0051',
	'W',
	'在庫管理区分に「2.在庫管理しない」を指定、かつ資産管理区分に「2.資産管理しない」を指定した場合のみ、値引品目をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0052',
	'W',
	'単位マスタに設定されている小数部有効桁数以下の値のみ指定できます。\n単位ＣＤ：{1}\n小数部有効桁数：{2}\n小数部有効桁数（単位マスタ）：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0053',
	'W',
	'容積単位を指定した場合のみ容積を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0054',
	'W',
	'重量単位を指定した場合のみ重量を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0055',
	'W',
	'入り目単位を指定した場合のみ入り目数を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0056',
	'W',
	'ＪＡＮ区分に「1.ＪＡＮ」を指定した場合は、ＪＡＮに１３桁以下の文字列のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0057',
	'W',
	'ＪＡＮ区分に「2.短縮ＪＡＮ」を指定した場合は、ＪＡＮに８桁以下の文字列のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0058',
	'W',
	'在庫管理区分に「3.架空品」を指定した場合は、品目区分に「7.架空品」以外を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0059',
	'W',
	'在庫管理区分に「1.在庫管理する」以外を指定した場合は、以下の項目をオンにできません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0060',
	'W',
	'市場出荷判定対象がオフの場合は、以下の項目を指定できません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0061',
	'W',
	'ロット管理区分に「3.同一ロット不許可」以外、またはサブロット管理区分に「3.ロット内同一サブロット不許可」以外を指定した場合は、以下の項目をオンにできません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0062',
	'W',
	'期限管理対象がオフの場合は、期限管理種別を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0063',
	'W',
	'有効成分対象がオフの場合は、以下の項目を指定できません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0064',
	'W',
	'在庫管理区分に「3.架空品」を指定した場合は、「1.管理しない」のみ指定できます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0065',
	'W',
	'手配ＮＯ管理区分に「1.管理しない」を指定した場合は、以下の項目をオンにできません。\n項目：{1}\n制御項目：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0066',
	'W',
	'手配ＮＯ管理区分に「2.管理する（必須）」を指定した場合は、以下の項目をオフにできません。\n項目：{1}\n制御項目：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0067',
	'W',
	'手配ＮＯ管理区分に「1.管理しない」を指定した場合は、以下の項目を指定できません。\n項目：{1}\n制御項目：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0068',
	'W',
	'手配ＮＯ発番区分に「1.手動」を指定した場合は、以下の項目を指定できません。\n項目：{1}\n制御項目：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0069',
	'W',
	'在庫管理区分に「1.在庫管理する」以外を指定した場合は、ロット管理区分に「1.ロット管理しない」のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0070',
	'W',
	'ロット管理区分に「1.ロット管理しない」を指定した場合は、ロットＮＯ発番区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0071',
	'W',
	'ロットＮＯ発番区分に「1.手動」を指定した場合は、ロットＮＯ発番パタンＣＤを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0072',
	'W',
	'ロット管理区分に「1.ロット管理しない」を指定した場合は、サブロット管理区分に「1.サブロット管理しない」または「4.在庫のみサブロット管理する」のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0073',
	'W',
	'サブロット管理区分に「1.サブロット管理しない」を指定した場合は、サブロットＮＯ発番区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0074',
	'W',
	'サブロットＮＯ発番区分に「1.手動」を指定した場合は、サブロットＮＯ発番パタンＣＤを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0075',
	'W',
	'ロット管理区分に「3.同一ロット不許可」を指定、もしくはサブロット管理区分に「3.ロット内同一サブロット不許可」を指定した場合のみ、検査実施単位区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0076',
	'W',
	'在庫管理区分に「2.在庫管理しない」を指定した場合のみ、輸出入諸掛区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0077',
	'W',
	'所要手配ＮＯ必須がオンの場合は、「2.自動」または「3.手動_未指定:自動」を指定できます。\n項目：{1}\n制御項目：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0078',
	'W',
	'在庫管理区分に「3.架空品」を指定した場合は、以下の項目をオンにできません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0079',
	'W',
	'在庫管理区分に「3.架空品」を指定した場合は、以下の項目を指定できません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0080',
	'W',
	'以下の2つの期で不備があります。漏れ、重複のないように期を指定してください。\n期１：{1}～{2}\n期２：{3}～{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0081',
	'W',
	'課税対象の税を指定した場合のみ内税をオン、または税率に0以外を指定できます。\n税ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0082' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0082',
	'W',
	'新部門を指定した場合は、新部門対するデータを新組織一覧に指定してください。\n部門ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0083',
	'W',
	'新部門を指定した場合は、部門に対するデータを新組織一覧に指定できません。\n部門ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0084' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0084',
	'W',
	'新組織への切替日は過去日付を指定できません。\n運用日付より後の日付を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0085',
	'W',
	'ロット管理区分に「1.ロット管理しない」を指定した場合は、版管理対象を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0086',
	'W',
	'品目評価が使用可能な承認機能区分を指定した場合のみ品目を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0087',
	'W',
	'品目評価が使用可能な承認機能区分を指定した場合のみ品目分類区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0088',
	'W',
	'部門評価が使用可能な承認機能区分を指定した場合のみ部門を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0089' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0089',
	'W',
	'取引先評価が使用可能な承認機能区分を指定した場合のみ取引先を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0090' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0090',
	'W',
	'取引先評価が使用可能な承認機能区分を指定した場合のみ取引先分類区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0091' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0091',
	'W',
	'金額評価１が使用可能な承認機能区分を指定した場合のみ通貨１を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0092' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0092',
	'W',
	'承認対象金額２として評価される承認機能区分を指定した、かつ通貨１を指定した場合のみ結合条件区分１を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0093' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0093',
	'W',
	'承認対象金額３として評価される承認機能区分を指定した、かつ通貨１、通貨２を指定した場合のみ結合条件区分２を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0094' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0094',
	'W',
	'通貨１を指定した場合のみ金額１下限値、金額１上限値を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0095' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0095',
	'W',
	'通貨２を指定した場合のみ金額２下限値、金額２上限値を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0096',
	'W',
	'通貨３を指定した場合のみ金額３下限値、金額３上限値を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0097',
	'W',
	'主部門を指定した場合のみ兼務部門１を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0098',
	'W',
	'兼務部門１を指定した場合のみ兼務部門２を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0099',
	'W',
	'兼務部門２を指定した場合のみ兼務部門３を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0100',
	'W',
	'兼務部門３を指定した場合のみ兼務部門４を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0101',
	'W',
	'兼務部門４を指定した場合のみ兼務部門５を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0102',
	'W',
	'兼務部門５を指定した場合のみ兼務部門６を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0103',
	'W',
	'兼務部門６を指定した場合のみ兼務部門７を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0104',
	'W',
	'兼務部門７を指定した場合のみ兼務部門８を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0105',
	'W',
	'兼務部門８を指定した場合のみ兼務部門９を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0106',
	'W',
	'承認役割（主）を指定した場合のみ承認役割１（主）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0107',
	'W',
	'承認役割１（主）を指定した場合のみ承認役割２（主）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0108',
	'W',
	'承認役割２（主）を指定した場合のみ承認役割３（主）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0109',
	'W',
	'承認役割３（主）を指定した場合のみ承認役割４（主）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0110',
	'W',
	'承認役割４（主）を指定した場合のみ承認役割５（主）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0111',
	'W',
	'承認役割５（主）を指定した場合のみ承認役割６（主）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0112',
	'W',
	'承認役割６（主）を指定した場合のみ承認役割７（主）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0113',
	'W',
	'承認役割７（主）を指定した場合のみ承認役割８（主）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0114',
	'W',
	'承認役割８（主）を指定した場合のみ承認役割９（主）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0115',
	'W',
	'承認役割（副）を指定した場合のみ承認役割１（副）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0116',
	'W',
	'承認役割１（副）を指定した場合のみ承認役割２（副）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0117',
	'W',
	'承認役割２（副）を指定した場合のみ承認役割３（副）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0118',
	'W',
	'承認役割３（副）を指定した場合のみ承認役割４（副）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0119',
	'W',
	'承認役割４（副）を指定した場合のみ承認役割５（副）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0120',
	'W',
	'承認役割５（副）を指定した場合のみ承認役割６（副）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0121',
	'W',
	'承認役割６（副）を指定した場合のみ承認役割７（副）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0122',
	'W',
	'承認役割７（副）を指定した場合のみ承認役割８（副）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0123',
	'W',
	'承認役割８（副）を指定した場合のみ承認役割９（副）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0124',
	'W',
	'主部門、兼務部門１～９に同じ値を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0125',
	'W',
	'承認役割（主）、承認役割１～９（主）、承認役割（副）、承認役割１～９（副）に同じ値を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0126',
	'W',
	'取引先が国内の場合のみ下請対象をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0127',
	'W',
	'下請対象をオン、支給積送管理区分に「1.着荷登録不要（積送管理しない）」を指定した場合は、支給計上区分には「3.使用基準」以外を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0128' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0128',
	'W',
	'下請対象をオフ、支給積送管理区分に「1.着荷登録不要（積送管理しない）」を指定した場合は、支給計上区分には「1.出荷基準」または「3.使用基準」以外を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0129' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0129',
	'W',
	'支給積送管理区分に「1.着荷登録不要（積送管理しない）」以外を指定した場合は、支給計上区分には「2.着荷基準」または「3.使用基準」以外を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0130' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0130',
	'W',
	'請求部門区分に「3.請求部門」を指定した場合のみ請求先担当部門を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0131',
	'W',
	'請求締処理区分に「1.バッチ締日請求」を指定した場合のみ請求締遅延日数を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0132',
	'W',
	'請求締処理区分に「1.バッチ締日請求」、「2.マニュアル締日請求」または「3.マニュアル選択請求」を指定した場合のみ売上明細書出力区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0133',
	'W',
	'請求締処理区分に「4.売上都度請求」を指定した場合は、請求書前月残高表示をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0134' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0134',
	'W',
	'金額考慮をオンとした場合のみ手数料計算をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0135' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0135',
	'W',
	'債権部門区分に「2.債権部門」を指定した場合のみ債権部門を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0136' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0136',
	'W',
	'売上計上区分に「2.検収基準」を指定した場合は、請求起算区分には「1.売上基準」以外を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0137' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0137',
	'W',
	'売上計上区分を指定した場合のみ請求起算区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0138' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0138',
	'W',
	'品群構成区分に「3.品目仕訳」を指定した場合のみ品目仕訳を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0139' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0139',
	'W',
	'品群構成区分に「4.会計品目分類」を指定した場合のみ会計品目分類を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0140' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0140',
	'W',
	'品目分類が指定できる品群構成区分を指定した場合のみ品目分類区分または品目分類を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0141' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0141',
	'W',
	'在庫管理区分に「3.架空品」を指定した場合は、構成・仕様管理区分に「1.構成・仕様管理しない」以外を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0142' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0142',
	'W',
	'期限管理対象がオフの場合は、出荷ロット逆転禁止をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0143' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0143',
	'W',
	'在庫管理区分に「3.架空品」を指定、またはロット管理区分に「1.ロット管理しない」を指定した場合は、出荷有効期限グループを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0144' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0144',
	'W',
	'在庫管理区分に「1.在庫管理する」「3.架空品」を指定した場合は、入荷不要をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0145' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0145',
	'W',
	'値引品目がオンの場合は、以下の項目をオフにできません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0146' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0146',
	'W',
	'増加量には最小値と最大値との差より小さい値を指定してください。\n増加量：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0147' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0147',
	'W',
	'指定の発番情報は、既に登録されています。\n発番業務区分：{1}\n発番パタンＣＤ：{2}\nキー要素：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0148' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0148',
	'W',
	'シーケンスの最大値が発番パタンマスタに指定された連番の桁数を超えています。\n最大桁数：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0149' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0149',
	'W',
	'すでに物流標準場所がオンのデータが登録されています。同一物流グループの中で1件のみ物流標準場所をオンにできます。\n物流グループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0150' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0150',
	'W',
	'資源１と資源２に同じ値を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0151' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0151',
	'W',
	'送信処理のＩＦ処理区分を指定した場合のみ外部システムを指定できます。');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0152' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0152',
	'W',
	'親品群と品群に同じ値を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0153' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0153',
	'W',
	'配送先をオンとした場合のみ配送先経由区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0154' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0154',
	'W',
	'出来高をオンとした場合のみ出来高区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0155' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0155',
	'W',
	'出来高区分に「2.不良品」を指定した場合のみ非在庫をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0156' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0156',
	'W',
	'すでに受注紐付経費購買がオンのデータが登録されています。業務理由マスタに対して1件のみ受注紐付経費購買をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0157' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0157',
	'W',
	'債権決済方法をオンとした場合のみ債権決済区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0158' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0158',
	'W',
	'債権決済区分に「1.現金」または「2.振込」または「3.手形」を指定した場合のみ入金登録区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0159' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0159',
	'W',
	'債権決済区分に「7.振替」を指定した場合は、会計理由を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0160' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0160',
	'W',
	'債権決済区分に「4.相殺（借方）」もしくは債権決済区分に「6.相殺」を指定した場合のみ売上仕入税区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0161' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0161',
	'W',
	'債権決済区分に「1.現金」または「2.振込」または「3.手形」を指定した場合のみ手数料計算をオンにできます\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0162' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0162',
	'W',
	'債権決済区分に「1.現金」または「2.振込」または「3.手形」を指定した場合のみ相殺方法を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0163' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0163',
	'W',
	'債権決済区分に「4.相殺（借方）」または「5.相殺（貸方）」を指定した場合のみ債権債務先識別区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0164' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0164',
	'W',
	'債務決済方法をオンとした場合のみ債務決済区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0165' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0165',
	'W',
	'債務決済区分に「6.相殺」を指定した場合のみ債務相殺先区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0166' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0166',
	'W',
	'要素区分に「SEQ.連番」を指定した場合は、デフォルトシーケンス区分は必須です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0167' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0167',
	'W',
	'キー項目桁数は連番より前の要素に対する桁数の合計以下としてください。\nキー項目桁数：{1}\n連番より前の要素に対する桁数の合計：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0168' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0168',
	'W',
	'キー項目桁数は要素に対する桁数の合計以下としてください。\nキー項目桁数：{1}\n要素に対する桁数の合計：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0169' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0169',
	'W',
	'発番時の表示要素がありません。要素の桁数及び非表示のオン／オフを見直してください。\n全要素の桁数合計：{1}\n非表示となる要素の桁数の合計：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0170' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0170',
	'W',
	'表示桁数は、{1}桁以下としてください。\n表示桁数：{2}\n{3}\n\n表示桁数 = 要素に対する桁数の合計 - 非表示要素に対する桁数の合計');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0171' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0171',
	'W',
	'表示桁数は、{1}以下としてください。\n表示桁数の合計：{2}\n{3}\n\n表示桁数 = 要素に対する桁数の合計 - 非表示要素に対する桁数の合計');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0172' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0172',
	'W',
	'要素に対する桁数の合計は、{1}以下としてください。\n要素に対する桁数の合計：{2}\n{3}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0173' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0173',
	'W',
	'資産管理区分に「1.資産管理する」以外を指定した場合は、支給単価変更許可をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0174' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0174',
	'W',
	'在庫管理区分に「2.在庫管理しない」を指定した場合は、受注手配区分に「2.仕入直送」のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0175' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0175',
	'W',
	'在庫管理区分に「1.在庫管理する」を指定した場合は、出荷指図区分に「1.ピッキングあり」「3.対象外」のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0176' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0176',
	'W',
	'以下の項目は在庫管理区分に「1.在庫管理する」を指定、かつ諸口品がオンの場合、「4.管理する（任意：在庫対象外）」を指定できません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0177' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0177',
	'W',
	'在庫管理区分に「1.在庫管理する」を指定、かつ諸口品がオンの場合、以下のいずれかの手配ＮＯ管理区分に「2.管理する（必須）」を指定する必要があります。\n手配ＮＯ１管理区分\n手配ＮＯ２管理区分\n手配ＮＯ３管理区分\n手配ＮＯ４管理区分');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0178' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0178',
	'W',
	'構成・仕様管理区分に「2.構成・仕様管理する」を指定した場合のみ受注時構成改訂許可をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0179' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0179',
	'W',
	'受注手配区分に「2.仕入直送」を指定した場合は、出荷指図区分に「3.対象外」のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0180' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0180',
	'W',
	'発注先を指定した場合のみ以下の項目をオンにできます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0181' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0181',
	'W',
	'請求締処理区分に「4.売上都度請求」を指定した場合は、請求税計算をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0182' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0182',
	'W',
	'ロット管理区分に「1.ロット管理しない」を指定した場合は、版管理対象をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0183' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0183',
	'W',
	'値引品目がオンの場合は、以下の項目を指定できません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0184' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0184',
	'W',
	'ロット管理区分を指定した場合のみロットＮＯ発番区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0185' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0185',
	'W',
	'ロット管理区分に「1.ロット管理しない」を指定した場合は、ロットＮＯ発番区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0186' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0186',
	'W',
	'ロットＮＯ発番区分を指定した場合のみロットＮＯ発番パタンを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0187' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0187',
	'W',
	'ロットＮＯ発番区分に「1.手動」を指定した場合は、ロットＮＯ発番パタンを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0188' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0188',
	'W',
	'サブロット管理区分を指定した場合のみサブロットＮＯ発番区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0189' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0189',
	'W',
	'サブロット管理区分に「1.サブロット管理しない」を指定した場合は、サブロットＮＯ発番区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0190' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0190',
	'W',
	'サブロットＮＯ発番区分を指定した場合のみサブロットＮＯ発番パタンを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0191' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0191',
	'W',
	'サブロットＮＯ発番区分に「1.手動」を指定した場合は、サブロットＮＯ発番パタンを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0192' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0192',
	'W',
	'手配ＮＯ１管理区分に「1.管理しない」を指定した場合は、受注手配ＮＯ１必須をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0193' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0193',
	'W',
	'手配ＮＯ１管理区分に「1.管理しない」を指定した場合は、所要手配ＮＯ１必須をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0194' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0194',
	'W',
	'手配ＮＯ１管理区分に「2.管理する（必須）」を指定した場合は、受注手配ＮＯ１必須をオンにしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0195' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0195',
	'W',
	'手配ＮＯ１管理区分に「2.管理する（必須）」を指定した場合は、所要手配ＮＯ１必須をオンにしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0196' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0196',
	'W',
	'手配ＮＯ１管理区分に「1.管理しない」を指定した場合は、手配ＮＯ１発番区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0197' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0197',
	'W',
	'手配ＮＯ１管理区分を指定した場合のみ手配ＮＯ１発番区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0198' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0198',
	'W',
	'手配ＮＯ１発番区分に「1.手動」を指定した場合は、手配ＮＯ１発番パタンを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0199' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0199',
	'W',
	'手配ＮＯ１発番区分を指定した場合のみ手配ＮＯ１発番パタンを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0200' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0200',
	'W',
	'手配ＮＯ２管理区分に「1.管理しない」を指定した場合は、受注手配ＮＯ２必須をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0201' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0201',
	'W',
	'手配ＮＯ２管理区分に「1.管理しない」を指定した場合は、所要手配ＮＯ２必須をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0202' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0202',
	'W',
	'手配ＮＯ２管理区分に「2.管理する（必須）」を指定した場合は、受注手配ＮＯ２必須をオンにしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0203' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0203',
	'W',
	'手配ＮＯ２管理区分に「2.管理する（必須）」を指定した場合は、所要手配ＮＯ２必須をオンにしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0204' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0204',
	'W',
	'手配ＮＯ２管理区分に「1.管理しない」を指定した場合は、手配ＮＯ２発番区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0205' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0205',
	'W',
	'手配ＮＯ２管理区分を指定した場合のみ手配ＮＯ２発番区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0206' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0206',
	'W',
	'手配ＮＯ２発番区分に「1.手動」を指定した場合は、手配ＮＯ２発番パタンを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0207' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0207',
	'W',
	'手配ＮＯ２発番区分を指定した場合のみ手配ＮＯ２発番パタンを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0208' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0208',
	'W',
	'手配ＮＯ３管理区分に「1.管理しない」を指定した場合は、受注手配ＮＯ３必須をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0209' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0209',
	'W',
	'手配ＮＯ３管理区分に「1.管理しない」を指定した場合は、所要手配ＮＯ３必須をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0210' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0210',
	'W',
	'手配ＮＯ３管理区分に「2.管理する（必須）」を指定した場合は、受注手配ＮＯ３必須をオンにしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0211' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0211',
	'W',
	'手配ＮＯ３管理区分に「2.管理する（必須）」を指定した場合は、所要手配ＮＯ３必須をオンにしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0212' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0212',
	'W',
	'手配ＮＯ３管理区分に「1.管理しない」を指定した場合は、手配ＮＯ３発番区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0213' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0213',
	'W',
	'手配ＮＯ３管理区分を指定した場合のみ手配ＮＯ３発番区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0214' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0214',
	'W',
	'手配ＮＯ３発番区分に「1.手動」を指定した場合は、手配ＮＯ３発番パタンを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0215' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0215',
	'W',
	'手配ＮＯ３発番区分を指定した場合のみ手配ＮＯ３発番パタンを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0216' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0216',
	'W',
	'手配ＮＯ４管理区分に「1.管理しない」を指定した場合は、受注手配ＮＯ４必須をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0217' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0217',
	'W',
	'手配ＮＯ４管理区分に「1.管理しない」を指定した場合は、所要手配ＮＯ４必須をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0218' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0218',
	'W',
	'手配ＮＯ４管理区分に「2.管理する（必須）」を指定した場合は、受注手配ＮＯ４必須をオンにしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0219' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0219',
	'W',
	'手配ＮＯ４管理区分に「2.管理する（必須）」を指定した場合は、所要手配ＮＯ４必須をオンにしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0220' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0220',
	'W',
	'手配ＮＯ４管理区分に「1.管理しない」を指定した場合は、手配ＮＯ４発番区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0221' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0221',
	'W',
	'手配ＮＯ４管理区分を指定した場合のみ手配ＮＯ４発番区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0222' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0222',
	'W',
	'手配ＮＯ４発番区分に「1.手動」を指定した場合は、手配ＮＯ４発番パタンを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0223' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0223',
	'W',
	'手配ＮＯ４発番区分を指定した場合のみ手配ＮＯ４発番パタンを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0224' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0224',
	'W',
	'棚卸対象をオンにした場合のみ以下の項目をオンにできます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0225' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0225',
	'W',
	'工場出荷承認対象をオンとした場合のみ工場出荷承認役割を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0226' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0226',
	'W',
	'検査承認対象をオンとした場合のみ検査承認役割を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0227' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0227',
	'W',
	'製造承認対象をオンとした場合のみ製造承認役割を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0228' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0228',
	'W',
	'手配ＮＯ管理区分に「1.管理しない」を指定した場合は、手配ＮＯ区分に「2.展開しない」以外を指定できません。\n手配ＮＯ項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0229' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0229',
	'W',
	'手配ＮＯ管理区分に「2.管理する（必須）」を指定した場合は、手配ＮＯ区分に「1.展開」以外を指定できません。\n手配ＮＯ項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0230' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0230',
	'W',
	'手配ＮＯ管理区分に「4.管理する（任意：在庫対象外）」を指定した場合は、手配ＮＯ区分に「3.展開(無し可)」以外を指定できません。\n手配ＮＯ項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0231' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0231',
	'W',
	'手配ＮＯ管理区分を指定した場合のみ手配ＮＯ区分を指定できます。\n手配ＮＯ項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0232' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0232',
	'W',
	'ロット管理区分に「1.ロット管理しない」以外を指定、かつサブロット管理区分に「1：サブロット管理しない」以外を指定した場合に新規ロット入力不可をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0233' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0233',
	'W',
	'すでに口座科目設定マスタ取込２がオンのデータが登録されています。仕訳グループマスタに対して1件のみ口座科目設定マスタ取込２をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0244' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0244',
	'W',
	'ロット管理区分に「1.ロット管理しない」以外を指定した場合のみロット混在をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0245' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0245',
	'W',
	'サブロット管理区分に「1.サブロット管理しない」以外を指定した場合のみサブロット混在をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0246' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0246',
	'W',
	'副産品がオフの場合のみ引継対象子品目をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0247' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0247',
	'W',
	'請求締処理区分に「1.バッチ締日請求」もしくは「2.マニュアル締日請求」を指定した場合のみ、請求締日を指定できます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0248' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0248',
	'W',
	'費目数とそれに紐付く費目グループ数の合計が１００より多くなっています。有効な費目数と費目グループ数は１００以下としてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0249' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0249',
	'W',
	'登録対象が既に存在します。検索後に更新してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0250' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0250',
	'E',
	'データ更新区分には「3.削除」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0251' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0251',
	'W',
	'同一の品目・手配ＮＯには同一品名を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0252' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0252',
	'W',
	'指定した品目、手配ＮＯは既に諸口品マスタに登録されています。\n品目：{1}\n手配ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0253' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0253',
	'W',
	'品目マスタの手配ＮＯ１管理区分に「1.管理しない」が設定されているため、手配ＮＯ１を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0254' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0254',
	'W',
	'品目マスタの手配ＮＯ２管理区分に「1.管理しない」が設定されているため、手配ＮＯ２を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0255' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0255',
	'W',
	'品目マスタの手配ＮＯ３管理区分に「1.管理しない」が設定されているため、手配ＮＯ３を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0256' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0256',
	'W',
	'品目マスタの手配ＮＯ４管理区分に「1.管理しない」が設定されているため、手配ＮＯ４を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0257' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0257',
	'W',
	'住所設定をオンにした場合のみ以下の項目を指定できます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0258' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0258',
	'W',
	'製造をオンにした場合のみ以下の項目を指定できます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0259' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0259',
	'W',
	'物流もしくは製造をオンにした場合のみ以下の項目を指定できます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0260' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0260',
	'W',
	'期限管理対象がオフの場合は、出荷有効期限グループを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0261' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0261',
	'W',
	'場所設定をオフにした場合は、以下の項目を指定できません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0262' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0262',
	'W',
	'有償支給先をオンとした場合のみ、以下の項目を指定できます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0263' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0263',
	'W',
	'コピー元データが対象マスタに存在しません。\n対象マスタ：{1}\nコピー元品目：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0264' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0264',
	'W',
	'共通（全社）の品目情報としてすでに登録されています。\nコピー先品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0265' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0265',
	'W',
	'コピー元とコピー先に同じ品目を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0266' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0266',
	'W',
	'コピー先品目とコピー元品目の属性が一致していません。\nコピー先品目：{1}\nコピー元品目：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0267' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0267',
	'W',
	'以下の項目には「1～31, 99」の数値を指定してください。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0268' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0268',
	'W',
	'部門構成区分に「3.物流Ｇ」を指定した場合のみ物流グループを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0269' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0269',
	'W',
	'部門構成区分に「4.製造場所Ｇ」を指定した場合のみ製造場所グループを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0270' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0270',
	'W',
	'部門構成区分に「5.ＷＧ」を指定した場合のみワーキンググループを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0271' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0271',
	'W',
	'部門構成区分に「6.工場・物流倉庫」を指定した場合のみ工場・物流倉庫を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0272' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0272',
	'W',
	'外部システム区分に「1.ＥＤＩ」「6.ＥＤＩ（ＭＣＦ）」を指定した場合は、ＥＤＩ用のＩＦ処理区分のみ指定できます。\n外部システムＣＤ：{1}\n外部システム区分：{2}\nＩＦ処理区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0273' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0273',
	'W',
	'外部システム区分に「3.ＰＬＭ」を指定した場合は、ＰＬＭ用のＩＦ処理区分のみ指定できます。\n外部システムＣＤ：{1}\n外部システム区分：{2}\nＩＦ処理区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0274' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0274',
	'W',
	'対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタにＥＤＩ用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。\n外部システムＣＤ：{1}\n外部システム区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0275' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0275',
	'W',
	'対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタにＰＬＭ用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。\n外部システムＣＤ：{1}\n外部システム区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0276' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0276',
	'W',
	'本バージョンでは在庫管理区分が「2.在庫管理しない」、かつ資産管理区分が「1.資産管理する」の指定を行うことはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0278' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0278',
	'W',
	'在庫管理区分に「2.在庫管理しない」を指定した場合は、サブロット管理区分に「1.サブロット管理しない」のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0279' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0279',
	'W',
	'債権決済区分が「6：源泉税」の決済方法がすでに登録されています。債権決済区分が「6：源泉税」の決済方法は１件のみ登録できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0280' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0280',
	'W',
	'債権決済区分が「7：振替」の決済方法がすでに登録されています。債権決済区分が「7：振替」の決済方法は１件のみ登録できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0281' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0281',
	'W',
	'週次内示は当日から最大で１５週（３ヶ月）の登録が可能です。週次開始位置＋週次内示期間≦１６となるように指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0282' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0282',
	'W',
	'旬次内示は当日から最大で９旬（３ヶ月）の登録が可能です。旬次開始位置＋旬次内示期間≦１０となるように指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0283' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0283',
	'W',
	'月次内示は当日から最大で１２ヶ月（１年）の登録が可能です。月次開始位置＋月次内示期間≦１３となるように指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0284' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0284',
	'W',
	'週次内示期間、旬次内示期間、月次内示期間のいづれか１つには１以上の値を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0285' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0285',
	'W',
	'場所設定をオフにした場合は、以下の項目をオンにできません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0286' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0286',
	'W',
	'以下の項目が設定できない取引パタン区分が指定されています。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0287' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0287',
	'W',
	'すでに自動時採用がオンのデータが登録されています。同一取引パタン区分の中で1件のみ自動時採用をオンにできます。\n取引パタン区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0288' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0288',
	'W',
	'指定したプッシュ通知区分に対しては通知先ワーキンググループを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0289' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0289',
	'W',
	'指定したプッシュ通知区分に対しては通知先部門を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0290' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0290',
	'W',
	'指定したプッシュ通知区分に対しては通知先承認役割を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0291' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0291',
	'W',
	'支払締日１～５に同じ値を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0292' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0292',
	'W',
	'請求締日１～５に同じ値を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0293' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0293',
	'W',
	'指定した品目の品目マスタ（共通）が登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0294' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0294',
	'W',
	'購買単価マスタに承認中のレコードが存在するため削除できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0295' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0295',
	'W',
	'加工単価マスタに承認中のレコードが存在するため削除できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0296' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0296',
	'W',
	'支給単価マスタに承認中のレコードが存在するため削除できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0297' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0297',
	'W',
	'標準販売単価マスタに承認中のレコードが存在するため削除できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0298' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0298',
	'W',
	'品目販売単価マスタに承認中のレコードが存在するため削除できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0299' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0299',
	'W',
	'得意先販売単価マスタに承認中のレコードが存在するため削除できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0300' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0300',
	'W',
	'リリース済みの品目のため更新できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0301' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0301',
	'W',
	'請求締遅延日数に0を指定した場合のみ請求締前後区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0302' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0302',
	'W',
	'請求先カレンダを指定した場合のみ入金予定前後区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0303' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0303',
	'W',
	'品目と参照品目に同じ品目を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0304' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0304',
	'W',
	'品目マスタで以下の単位に登録されているため、論理削除／削除できません。\n単位項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0305' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0305',
	'W',
	'以下の項目に設定されている単位が品目単位マスタに登録されていません。品目マスタ及び品目単位マスタを確認してください。\n単位項目：{1}\n単位：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0306' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0306',
	'W',
	'登録不可の値が設定されています。\n項目：{1}\n値：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0307' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0307',
	'W',
	'補助勘定科目を使用しない勘定科目に対して補助勘定科目が指定されています。\n勘定科目ＣＤ：{1} \n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0308' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0308',
	'W',
	'納税通貨に基準通貨を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0309' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0309',
	'W',
	'基準単位と異なる単位を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0310' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0310',
	'W',
	'基準単位へ換算する際に小数部が桁落ちする可能性があるため、登録できません。\n品目：{1}\n単位ＣＤ：{2}\n最小値：{3}\n最小値（基準単位）：{4}\n小数部有効桁数（基準単位）：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0311' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0311',
	'W',
	'請求税計算をオフとした場合は、請求税額端数処理区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0312' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0312',
	'W',
	'指定した対象日に対する期が対象期間マスタに登録されていません。\n対象日：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0313' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0313',
	'W',
	'モジュールＩＤを指定した場合のみロジックＩＤを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0314' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0314',
	'W',
	'投入をオンとした場合のみ投入ソート順を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0315' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0315',
	'W',
	'場所マスタに登録されていません。\n場所ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0316' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0316',
	'W',
	'棚・ラインマスタに登録されていません。\n場所ＣＤ：{1}\n棚・ラインＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0317' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0317',
	'W',
	'すでに外部システム区分が「6.ＥＤＩ（ＭＣＦ）」のデータが登録されています。外部システムマスタで1件のみ外部システム区分が「6.ＥＤＩ（ＭＣＦ）」のデータを登録できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0318' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0318',
	'W',
	'旧部門と新部門に同じ部門は指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0319' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0319',
	'W',
	'場所マスタで棚・ライン対象がオンの場所のみ指定できます。\n場所ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0320' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0320',
	'W',
	'以下の制御項目がオフの場合はチェック項目を指定できません。\n制御項目：{1}\nチェック項目：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0321' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0321',
	'W',
	'以下の項目はシステムパラメータで利用できないように制御されています。\nパラメータ：{1}\n項目：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0322' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0322',
	'W',
	'品目ＣＤが指定されていますが、対応する枝番１～３が指定されていません。\n枝番を使用しない場合は枝番項目にＮＵＬＬ文字を指定してください。\nもしくは枝番のみ指定されています。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0323' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0323',
	'W',
	'在庫管理区分に「3.架空品」以外を指定した場合は、品目区分に「7.架空品」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0501' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0501',
	'W',
	'ＩＦ項目区分に「ITM.品目」以外を指定した場合のみ自社用ＣＤを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0502' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0502',
	'W',
	'ＩＦ項目区分に「ITM.品目」を指定した場合のみ品目を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0503' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0503',
	'W',
	'ＩＦ項目区分に「ITM.品目」を指定した場合のみ相手先枝番１を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0504' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0504',
	'W',
	'指定した自社用ＣＤもしくは相手先ＣＤはすでに登録済みです（もしくは自社用ＣＤもしくは相手先ＣＤが同じデータが登録対象にあります）。同一外部システム・ＩＦ項目区分・取引先で自社用ＣＤもしくは相手先ＣＤが同じ値のデータは登録できません。\n※送信変換や受信変換で変換先を一意に決定するため\n外部システムＣＤ：{1}\nＩＦ項目区分：{2}\n取引先ＣＤ：{3}\n自社用ＣＤ：{4}\n相手先ＣＤ：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0505' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0505',
	'W',
	'相手先枝番１を指定した場合のみ相手先枝番２を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0506' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0506',
	'W',
	'相手先枝番２を指定した場合のみ相手先枝番３を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0507' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0507',
	'W',
	'指定した品目もしくは相手先ＣＤ・相手先枝番１～３はすでに登録済みです（もしくは品目もしくは相手先ＣＤ・相手先枝番１～３が同じデータが登録対象にあります）。同一外部システム・ＩＦ項目区分・取引先で品目もしくは相手先ＣＤ・相手先枝番１～３が同じ値のデータは登録できません。\n※送信変換や受信変換で変換先を一意に決定するため\n外部システムＣＤ：{1}\nＩＦ項目区分：{2}\n取引先ＣＤ：{3}\n品目：{4}\n相手先ＣＤ：{5}\n相手先枝番１：{6}\n相手先枝番２：{7}\n相手先枝番３：{8}\n{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0508' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0508',
	'W',
	'仕訳キー設定項目区分に取引先分類を指定した場合のみ取引先仕訳キー設定項目区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0509' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0509',
	'W',
	'原価用の会計伝票区分が指定されています。原価をオンで登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0510' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0510',
	'W',
	'原価で使用しない会計伝票区分が指定されています。原価をオフで登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0511' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0511',
	'W',
	'原価にオンを指定した場合は、会計原価情報の項目を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0512' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0512',
	'W',
	'受払情報の会計伝票区分を指定した場合は、会計受払情報の項目を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0513' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0513',
	'W',
	'在庫情報の会計伝票区分を指定した場合は、会計在庫情報の項目を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0514' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0514',
	'W',
	'入金情報の会計伝票区分を指定した場合は、会計入金情報の項目を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0515' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0515',
	'W',
	'外部システム区分に「2.ＳＣＭ」もしくは「7.ＳＣＭ（ＭＤ）」を指定した場合のみ、以下の項目をオンにできます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0516' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0516',
	'W',
	'外部システム区分に「2.ＳＣＭ」もしくは「7.ＳＣＭ（ＭＤ）」を指定した場合のみ、以下の項目を指定できます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0517' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0517',
	'W',
	'外部システム区分に「1.ＥＤＩ」「2.ＳＣＭ」「6.ＥＤＩ（ＭＣＦ）」「7.ＳＣＭ（ＭＤ）」を指定した場合のみ、以下の項目をオンにできます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0518' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0518',
	'W',
	'業務担当者通知をオンとした場合のみ受信メッセージレベルを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0519' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0519',
	'W',
	'すでに外部システム区分が「7.ＳＣＭ（ＭＤ）」のデータが登録されています。外部システムマスタで1件のみ外部システム区分が「7.ＳＣＭ（ＭＤ）」のデータを登録できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0520' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0520',
	'W',
	'外部システム区分に「7.ＳＣＭ（ＭＤ）」を指定した場合は、以下の項目をオフにできません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0521' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0521',
	'W',
	'支払情報の会計伝票区分を指定した場合は、会計支払情報の項目を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0522' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0522',
	'W',
	'パラメータ「DEF_LOC_GRP_CD」のパラメータ値を登録するためには、パラメータ「DEF_WG_CD」のパラメータ値を登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0523' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0523',
	'W',
	'パラメータ「DEF_LOC_GRP_CD」のパラメータ値が登録されているため、パラメータ「DEF_WG_CD」のパラメータ値をクリアできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0524' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0524',
	'W',
	'パラメータ「DEF_LOC_GRP_CD」のパラメータ値が登録されているため、パラメータ「DEF_WG_CD」を削除できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0525' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0525',
	'W',
	'パラメータ「SNO_TYP」が無効のときは、パラメータ「WRK_ENABLE_FLG」も無効にしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0526' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0526',
	'W',
	'Ｗｅｂ　ＡＰＩまたはコマンド実行がオンの場合は、ファイル入出力オペレーションを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0527' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0527',
	'W',
	'Ｗｅｂ　ＡＰＩがオフの場合は、Ｗｅｂ　ＡＰＩオペレーションを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0528' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0528',
	'W',
	'外部システム区分に「5.会計」を指定した場合は、会計用のＩＦ処理区分のみ指定できます。\n外部システムＣＤ：{1}\n外部システム区分：{2}\nＩＦ処理区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0529' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0529',
	'W',
	'外部システム区分に「2.ＳＣＭ」「7.ＳＣＭ（ＭＤ）」を指定した場合は、ＳＣＭ用のＩＦ処理区分のみ指定できます。\n外部システムＣＤ：{1}\n外部システム区分：{2}\nＩＦ処理区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0530' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0530',
	'W',
	'外部システム区分に「8.ＦＢ」を指定した場合は、ＦＢ用のＩＦ処理区分のみ指定できます。\n外部システムＣＤ：{1}\n外部システム区分：{2}\nＩＦ処理区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0531' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0531',
	'W',
	'外部システム区分に「1.ＥＤＩ」「6.ＥＤＩ（ＭＣＦ）」を指定した場合のみ、以下の項目をオンにできます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0532' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0532',
	'W',
	'債務決済区分に「B.照合済残高振替受入」を指定した場合は、会計理由を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0533' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0533',
	'W',
	'債務決済区分に「D.未照合残高振替受入」を指定した場合は、会計理由を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0534' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0534',
	'W',
	'債務決済区分が「B.照合済残高振替受入」の決済方法がすでに登録されています。\n債務決済区分が「B.照合済残高振替受入」の決済方法は１件のみ登録できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0535' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0535',
	'W',
	'債務決済区分が「D.未照合残高振替受入」の決済方法がすでに登録されています。\n債務決済区分が「D.未照合残高振替受入」の決済方法は１件のみ登録できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0536' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0536',
	'I',
	'マスタ送信ＩＦ処理を開始します。\n外部システムＣＤ：{1}\nＩＦ処理区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0537' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0537',
	'I',
	'マスタ送信ＩＦ処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0538' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0538',
	'W',
	'外部システムマスタに外部システム区分が「4.ＢＩ」として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0539' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0539',
	'W',
	'ＩＦ処理区分がマスタ送信ＩＦ処理の区分ではありません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0540' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0540',
	'W',
	'外部システム区分に「4.ＢＩ」を指定した場合は、ＢＩ用のＩＦ処理区分のみ指定できます。\n外部システムＣＤ：{1}\n外部システム区分：{2}\nＩＦ処理区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0541' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0541',
	'W',
	'Ｗｅｂ　ＡＰＩとコマンド実行は、いずれかのみオンとして登録できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0542' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0542',
	'W',
	'コマンド実行がオフの場合は、コマンド実行オペレーションを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0543' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0543',
	'W',
	'下請対象をオンとした場合は、仕入計上区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0601' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0601',
	'W',
	'指定した取引先の取引先マスタ（共通）が登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0602' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0602',
	'W',
	'売上計上区分に「3.着荷基準」を指定した場合は、請求起算区分に「2.納品基準」を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0603' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0603',
	'W',
	'発注先フラグがオンかつ配送先フラグがオンの場合は登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0604' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0604',
	'W',
	'配送先フラグがオンかつ配送先必須フラグがオンの場合は登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0605' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0605',
	'W',
	'対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタに会計用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。\n外部システムＣＤ：{1}\n外部システム区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0606' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0606',
	'W',
	'対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタにＳＣＭ用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。\n外部システムＣＤ：{1}\n外部システム区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0607' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0607',
	'W',
	'対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタにＦＢ用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。\n外部システムＣＤ：{1}\n外部システム区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0608' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0608',
	'W',
	'対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタにＢＩ用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。\n外部システムＣＤ：{1}\n外部システム区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0651' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0651',
	'W',
	'発注先納品書ＣＤが設定されている場合のみ、「発注時納品書」「納入指示時納品書」「納期回答受領時納品書」をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0652' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0652',
	'W',
	'入荷不要品がオンの場合のみ、購買納品書対象をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0654' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0654',
	'W',
	'指定した帳票ＩＤは存在しません。\n帳票ＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCD0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCD0001',
	'W',
	'リリース済みの品目は削除できません。\n品目：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCD0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCD0002',
	'W',
	'指定した日付に対して部門マスタに登録されていません。部門マスタを確認してください。\n部門ＣＤ：{1}\n日付：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCD0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCD0003',
	'W',
	'対象期間マスタが登録されていません。\n基準日：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0655' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0655',
	'W',
	'請求書発行区分に「4.発行対象外」を指定した場合はチェック項目を指定できません。\nチェック項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0656' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0656',
	'W',
	'支払通知書発行対象がオフの場合はチェック項目を指定できません。\nチェック項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0701' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0701',
	'W',
	'対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタに会計（ＳＡＰ）用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。\n外部システムＣＤ：{1}\n外部システム区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0702' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0702',
	'W',
	'外部システム区分に「A.会計（ＳＡＰ）」を指定した場合は、会計（ＳＡＰ）用のＩＦ処理区分のみ指定できます。\n外部システムＣＤ：{1}\n外部システム区分：{2}\nＩＦ処理区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0703' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0703',
	'W',
	'ロット管理区分に「1.ロット管理しない」以外を指定した場合のみ期限管理対象をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0704' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0704',
	'W',
	'対応するＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタにＳＣＭ（ＰＣＭ）用のＩＦ処理区分が設定されているため、外部システム区分を変更できません。\n外部システムＣＤ：{1}\n外部システム区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABCL0705' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABCL0705',
	'W',
	'外部システム区分に「B.ＳＣＭ（ＰＣＭ）」を指定した場合は、ＳＣＭ（ＰＣＭ）用のＩＦ処理区分のみ指定できます。\n外部システムＣＤ：{1}\n外部システム区分：{2}\nＩＦ処理区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSP0001',
	'I',
	'単価取得処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSP0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSP0002',
	'W',
	'単価が取得できませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSP0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSP0003',
	'W',
	'旧品目と新品目に同じ値を指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSP0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSP0004',
	'W',
	'旧代替グループと新代替グループに同じ値を指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0001',
	'W',
	'出荷元物流グループと出荷先物流グループに同じ値を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0002',
	'W',
	'定性定量区分に「1.定性検査」を指定した場合は、単位を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0003',
	'W',
	'定性定量区分に「1.定性検査」を指定した場合は、自動合否判定をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0004',
	'W',
	'検査方法区分に「2.全数検査」を指定した場合は、抜取数／回に0以外を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0005',
	'W',
	'規格検査必須をオンとした場合のみ規格検査確認必須をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0006',
	'W',
	'定性定量区分に「2.定量検査」を指定した場合は、定性規格値を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0007',
	'W',
	'定性定量区分に「1.定性検査」を指定した場合は、以下の項目を指定できません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0008',
	'W',
	'検査方法区分に「4.抜取規格検査」を指定した場合のみ、規格検査必須をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0009',
	'W',
	'定性定量区分に「2.定量検査」を指定した場合は、下記項目のいずれか1つは指定が必要です。\n外規格下限値\n外規格上限値\n内規格下限値\n内規格上限値\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0010',
	'W',
	'下記項目が同じレコードには、代替品目選択区分に同じ値を設定してください。\n親品目：{1}\nワーキンググループＣＤ：{2}\n構成パタン：{3}\n工程ＣＤ：{4}\n工程連番：{5}\n適用開始日：{6}\n適用終了日：{7}\n代替グループＣＤ：{8}\n{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0011',
	'W',
	'有効成分管理が異なる品目を同じ代替グループにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0012',
	'W',
	'申請内容に既存データに対する更新データが含まれていますが、更新先のデータが存在していません。承認を却下とし、申請データを再登録してください。\n承認ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0013',
	'W',
	'外規格上限値符号区分に「EQ.＝」または「NE.≠」を指定した場合は、外規格下限値を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0014',
	'W',
	'外規格下限値符号区分に「EQ.＝」または「NE.≠」を指定した場合は、外規格上限値符号区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0015',
	'W',
	'内規格上限値符号区分に「EQ.＝」または「NE.≠」を指定した場合は、内規格下限値を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0016',
	'W',
	'内規格下限値符号区分に「EQ.＝」または「NE.≠」を指定した場合は、内規格上限値符号区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0017',
	'W',
	'発注先を指定した場合のみメーカを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0018',
	'W',
	'製造場所もしくは発注先を指定している場合は、工場・物流倉庫を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0019',
	'W',
	'検査対象外をオンとした場合は、検査パタンを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0020',
	'W',
	'品目マスタの期限管理対象がオフに設定されている場合は、期限起算日区分に以下の値を指定できます。\n「1.製造着手日」\n「2.製造完了日」\n「6.入荷実績日」\n「7.子品目起算日引継ぎ」\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0021',
	'W',
	'品目マスタの期限管理対象が設定されていない場合は、有効期間に0のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0022',
	'W',
	'品目マスタの期限管理対象が設定されていない場合は、使用期間に0のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0023',
	'W',
	'品目マスタの期限管理対象が設定されていない場合は、以下の項目を指定できません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0024',
	'W',
	'マスタ変更の承認申請中のため、更新できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0025',
	'W',
	'品目マスタの期限管理対象が設定されている場合は、期限起算日区分（延長時）に以下の値を指定できます。\n「3.検査判定日」\n「8.現有効期限」\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0026',
	'W',
	'期限起算日区分に「8.現有効期限」は指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0027',
	'W',
	'検査対象外をオンとした場合は、先行検査有効をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0028',
	'W',
	'マスタ変更の承認申請中のため、削除できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0029',
	'W',
	'工程管理単位に品目の基準単位と同じ値を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0030',
	'W',
	'工程管理単位を指定した場合のみ工程基準単位数を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0031',
	'W',
	'工程管理単位を指定した場合のみ工程換算単位数を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0032',
	'W',
	'工程管理単位を指定した場合のみ小数部有効桁数を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0033',
	'W',
	'出来高計上工程をオンとした場合のみ出来高工程比率を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0034',
	'W',
	'工程場所には場所に対するワーキンググループと同じワーキンググループを持つ場所のみ指定できます。\n場所ワーキンググループＣＤ：{1}\n工程場所ワーキンググループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0035',
	'W',
	'支払予定日を使用しないサイト区分を指定した場合は、支払予定日１を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0036',
	'W',
	'支払予定日１を指定した場合のみ支払予定日２を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0037',
	'W',
	'支払予定日２を指定した場合のみ支払予定日３を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0038',
	'W',
	'支払予定日３を指定した場合のみ支払予定日４を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0039',
	'W',
	'支払予定日４を指定した場合のみ支払予定日５を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0040',
	'W',
	'支払サイト１を指定した場合のみ支払サイト２を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0041',
	'W',
	'支払サイト２を指定した場合のみ支払サイト３を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0042',
	'W',
	'支払サイト３を指定した場合のみ支払サイト４を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0043',
	'W',
	'支払サイト４を指定した場合のみ支払サイト５を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0044',
	'W',
	'サイト区分に「2.日」を指定した場合は、以下の項目を指定できません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0045',
	'W',
	'入金予定日１を指定した場合のみ入金予定日２を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0046',
	'W',
	'入金予定日２を指定した場合のみ入金予定日３を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0047',
	'W',
	'入金予定日３を指定した場合のみ入金予定日４を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0048',
	'W',
	'入金予定日４を指定した場合のみ入金予定日５を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0049',
	'W',
	'入金サイト１を指定した場合のみ入金サイト２を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0050',
	'W',
	'入金サイト２を指定した場合のみ入金サイト３を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0051',
	'W',
	'入金サイト３を指定した場合のみ入金サイト４を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0052',
	'W',
	'入金サイト４を指定した場合のみ入金サイト５を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0053',
	'W',
	'すでに通常構成がオンのデータが登録されています。同一品目・品目構成グループにおいて１件のみ通常構成をオンにできます。\n品目：{1}\n品目構成グループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0054',
	'W',
	'場所マスタの管轄区分に「2.生産」が設定されている場所のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0055',
	'W',
	'外規格下限値を指定した場合のみ外規格下限値符号区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0056',
	'W',
	'外規格上限値符号区分を指定した場合のみ外規格上限値を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0057',
	'W',
	'内規格下限値を指定した場合のみ内規格下限値符号区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0058',
	'W',
	'内規格上限値符号区分を指定した場合のみ内規格上限値を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0059',
	'W',
	'資産管理対象外の品目を指定した場合は、製造場所を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0060',
	'W',
	'発注先を指定した場合のみメーカを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0061',
	'W',
	'製造場所を指定した場合のみ以下の項目を指定できます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0062',
	'W',
	'資産管理対象外の品目を指定した場合は、購買識別区分に「4.ＶＭＩ」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0063',
	'W',
	'代替グループマスタに登録されていません。\nワーキンググループＣＤ：{1}\n代替グループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0064',
	'W',
	'発注先を指定した場合のみ以下の項目を指定できます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0065',
	'W',
	'発注先を指定した場合、または製造場所に外注先となる場所（場所マスタで発注先が設定されている場所）を指定した場合のみ以下の項目を指定できます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0066',
	'W',
	'品目マスタの手配ＮＯ管理区分に「1.管理しない」が設定されている品目を指定した場合は、手配ＮＯを指定できません。\n手配ＮＯ項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0068',
	'W',
	'購買識別区分に「2.無償受給」または「4.ＶＭＩ」を指定した場合は、検収ＬＴを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0069',
	'W',
	'製造場所に外注先となる場所（場所マスタで発注先が設定されている場所）を指定した場合は、購買識別区分に「2.無償受給」または「4.ＶＭＩ」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0070',
	'W',
	'曜日まとめ区分を指定した場合のみ曜日まとめ期間（週）を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0072',
	'W',
	'製造場所に社内となる場所（場所マスタで発注先が設定されていない場所）を指定した場合のみ出来高予定数量に1以外を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0073',
	'W',
	'製造場所に社内となる場所（場所マスタで発注先が設定されていない場所）を指定した場合のみ製造指図数量に1以外を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0074',
	'W',
	'製造場所に社内となる場所（場所マスタで発注先が設定されていない場所）を指定した場合のみ固定必要数量に0以外を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0075',
	'W',
	'製造場所を指定した場合のみロット発番タイミング区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0076',
	'W',
	'構成パタンを指定した場合のみバックフラッシュ許可をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0077',
	'W',
	'子固定必要数量に０（ゼロ）以外が指定された代替品が存在するため、代替品目選択区分に「1.混在可」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0078',
	'W',
	'製造場所に社内となる場所（場所マスタで発注先が設定されていない場所）を指定した場合のみ以下の項目を指定できます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0079',
	'W',
	'製造指図承認機能が有効な場合のみ以下の項目を指定できます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0080',
	'W',
	'製造場所に社内となる場所（場所マスタで発注先が設定されていない場所）を指定した場合のみ以下の項目をオンにできます。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0085',
	'W',
	'発注先を指定し、かつ在庫管理対象外の品目を指定した場合は、購買識別区分に「1.通常購買」以外を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0086',
	'W',
	'製造場所を指定した場合は構成パタンは必須です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0087',
	'W',
	'副産品を指定した場合は子投入数量と子必要数量に異なる値を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0088',
	'W',
	'品目マスタの資産管理区分に「3.架空品」が設定されている品目を子品目に指定した場合は架空をオフにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0096',
	'W',
	'移動先場所に対する物流グループと移動元場所に対する物流グループが同じ場合は、移送ロット単位数量を入力できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0097',
	'W',
	'移動元場所と移動先場所に同じ場所を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0098',
	'W',
	'移動元場所には移動先場所に対するワーキンググループと同じワーキンググループを持つ場所を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0099',
	'W',
	'移動先場所に対する物流グループと移動元場所に対する物流グループが異なる場合は、投入場所指定をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0100',
	'W',
	'出荷元工場・物流倉庫と工場・物流倉庫に同じ値を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0101',
	'W',
	'発注先となる取引先、かつ諸口品ではない品目を指定した場合のみ購買内示グループを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0102',
	'W',
	'購買内示グループを指定した場合のみ購買内示確定及び引取責任をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0110',
	'W',
	'製造場所に対して場所マスタで資源１が設定されている場合のみ資源標準値１を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0111',
	'W',
	'製造場所に対して場所マスタで資源１が設定されている場合のみ資源単位数量１を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0112',
	'W',
	'製造場所に対して場所マスタで資源２が設定されている場合のみ資源標準値２を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0113',
	'W',
	'製造場所に対して場所マスタで資源２が設定されている場合のみ資源単位数量２を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0114',
	'W',
	'外規格下限値に定量値整数部桁数より大きい数値を指定できません。\n数値：{1}\n整数部桁数：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0115',
	'W',
	'外規格下限値＜外規格上限値の関係で指定してください。\n {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0116',
	'W',
	'外規格上限値に定量値整数部桁数より大きい数値を指定できません。\n数値：{1}\n整数部桁数：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0117',
	'W',
	'内規格下限値＜内規格上限値の関係で指定してください。\n {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0118',
	'W',
	'内規格下限値に定量値整数部桁数より大きい数値を指定できません。\n数値：{1}\n整数部桁数：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0120',
	'W',
	'内規格上限値に定量値整数部桁数より大きい数値を指定できません。\n数値：{1}\n整数部桁数：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0121',
	'W',
	'代替グループを指定した場合は、投入制御区分に「3.ＭＲＰ対象外（指図書のみ）」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0122',
	'W',
	'業務理由マスタの固定ロスがオンに設定されているロス理由を指定した場合は、初期表示をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0123',
	'W',
	'すでに初期表示がオンのデータが登録されています。同一の品目区分・品目区分詳細の中で１件のみ初期表示をオンにできます。\n品目区分：{1}\n品目区分詳細ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0124',
	'W',
	'副産品を指定した場合は子固定必要数量に０（ゼロ）のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0125',
	'W',
	'下限手配ＮＯと上限手配ＮＯの大小関係が不正です。上限手配ＮＯに下限手配ＮＯより小さい値（文字列で比較した場合の値）を指定できません。\n{1}：{2}\n{3}：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0126',
	'W',
	'代替品目選択区分が「1.混在可」となる代替品の場合は子固定必要数量に０（ゼロ）のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0127',
	'W',
	'場所と同じ値を指定できません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0128' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0128',
	'W',
	'品目マスタのロット管理区分に「3.同一ロット不許可」が設定されていない、もしくは品目マスタのサブロット管理区分に「3.ロット内同一サブロット不許可」が設定されていないためオンにできません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0129' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0129',
	'W',
	'品目マスタのロット管理区分に「1.ロット管理しない」が設定されているため、以下の項目をオンにできません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0130' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0130',
	'W',
	'副産品が指定されている場合は、以下の項目をオンにできません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0131',
	'E',
	'承認提供サービスの下り電文を取得できません。\n申請ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0132',
	'W',
	'申請ＮＯと承認ＮＯが一意に対応していません。\n申請ＮＯ：{1}\n承認ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0133',
	'W',
	'承認情報が存在しません。\n申請ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0134' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0134',
	'W',
	'承認情報の承認作成元ＮＯが申請ＮＯと一致しません。\n申請ＮＯ：{1}\n承認ＮＯ：{2}\n承認作成元ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0135' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0135',
	'W',
	'承認対象ではありません。承認側のマスタや申請部門について確認してください。\n部門ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0136' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0136',
	'E',
	'ＤＢコンテナを作成できません。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0137' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0137',
	'W',
	'検査対象外をオンとした場合は期限起算日区分に「3.検査判定日」、「9.手入力」は指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0138' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0138',
	'W',
	'指定した親品目・ワーキンググループ・構成パタンについて登録済みのレコードが存在しています。操作種別を「訂正する」に変更してから検索してください。\n親品目：{1}\nワーキンググループ：{2}\n構成パタン：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0139' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0139',
	'W',
	'単価ロット数量は単価単位を指定した場合のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0140' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0140',
	'W',
	'複数の計画品目を割り当てないように期間を見直してください。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0141' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0141',
	'W',
	'出荷元物流グループと出荷先物流グループが同じ組み合わせのレコードは、インボイス取引の設定を同じにしてください。\n出荷条件違いでインボイス取引の設定を変更できません。\n出荷元物流グループＣＤ：{1}\n出荷先物流グループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0142' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0142',
	'W',
	'指定のＭＲＰ発番用接頭語は既に使用されています。別の値を指定してください。\nＭＲＰ発番用接頭語：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0143' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0143',
	'W',
	'出荷先物流グループに納品先に対する物流グループ（物流グループマスタで場所設定が設定されていない物流グループ）を指定した場合はインボイス取引をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0144' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0144',
	'W',
	'代替品目をオンとした場合は、子品目を指定できません。または、代替品目をオフとした場合は、子品目を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0145' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0145',
	'W',
	'架空をオン、または子品目を指定した場合は、代替品目をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0146' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0146',
	'W',
	'以下の条件に１つでも該当する場合は、版ＮＯを指定できません。\n・代替グループが指定されており、かつ代替品目がオン\n・架空がオン\n・副産品がオン\n・子品目に版管理対象外品目を指定\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0147' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0147',
	'W',
	'子品目の手配ＮＯ管理区分が「1.管理しない」の場合は、手配ＮＯ区分に「2.展開しない」のみ指定できます。\n手配ＮＯ項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0148' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0148',
	'W',
	'子品目の手配ＮＯ管理区分が「2.管理する（必須）」の場合は、手配ＮＯ区分に「1.展開」のみ指定できます。\n手配ＮＯ項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0149' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0149',
	'W',
	'子品目の手配ＮＯ管理区分が「4.管理する（任意：在庫対象外）」の場合は、手配ＮＯ区分に「3.展開（無し可）」のみ指定できます。\n手配ＮＯ項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0150' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0150',
	'W',
	'副産品がオン、または架空がオンの場合は、バックフラッシュ区分に「6.対象外」のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0151' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0151',
	'W',
	'副産品がオン、または架空がオンの場合は、代替グループを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0152' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0152',
	'W',
	'副産品がオン、または架空がオンの場合は、投入制御区分に「1.ＭＲＰ・投入対象」のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0153' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0153',
	'W',
	'子品目のロット管理区分が「1.ロット管理しない」かつサブロット管理区分が「1.サブロット管理しない」、または架空をオンの場合は、指図時ロット指定をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0154' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0154',
	'W',
	'子品目のロット管理区分が「1.ロット管理しない」、または架空をオンの場合は、ロット混在をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0155' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0155',
	'W',
	'子品目のサブロット管理区分が「1.サブロット管理しない」、または架空がオンの場合は、サブロット混在をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0156' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0156',
	'W',
	'以下の条件に１つでも該当する場合は、引当制御区分に「1.引当対象外」のみ指定できます。\n・子品目の在庫管理区分が「2.在庫管理しない」\n・投入制御区分に「3.ＭＲＰ対象外（指図書のみ）」を指定\n・架空がオン\n・副産品がオン\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0157' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0157',
	'W',
	'副産品がオン、または架空がオンの場合は、引継対象子品目をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0158' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0158',
	'W',
	'副産品がオン、または架空がオンの場合は、収率計算用をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0159' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0159',
	'W',
	'指定したワーキンググループと格納場所に対するワーキンググループが異なるため登録できません。\nワーキンググループＣＤ：{1}\n格納場所ワーキンググループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0160' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0160',
	'W',
	'引当物流グループを指定した場合は、引当物流グループに属する場所のみ出荷場所に指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0161' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0161',
	'W',
	'総量引当場所グループを指定した場合は、総量引当場所グループに属する場所のみ出荷場所に指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0162' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0162',
	'W',
	'引当場所を指定した場合は、引当場所と同じ場所のみ出荷場所に指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0163' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0163',
	'W',
	'格納場所に対するワーキンググループと依頼先場所に対するワーキンググループが同じため登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0164' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0164',
	'W',
	'ワーキンググループと製造場所に対するワーキンググループが異なるため登録できません。\n製造場所ワーキンググループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0165' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0165',
	'W',
	'ワーキンググループと依頼先場所に対するワーキンググループが同じため登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0166' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0166',
	'W',
	'支給区分に無償支給は指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0167' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0167',
	'W',
	'有償支給先でない取引先、あるいは資産管理しない品目を指定した場合は、支給区分には「3.自給」のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0168' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0168',
	'W',
	'依頼元ワーキンググループと依頼先ワーキンググループに同じ値を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0169' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0169',
	'W',
	'すでにデフォルトがオンのデータが登録されています。同一物流グループ・品目出荷グループ・ワーキンググループの中で1件のみデフォルトをオンにできます。\n物流グループＣＤ：{1}\n品目出荷グループＣＤ：{2}\nワーキンググループＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0170' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0170',
	'W',
	'引当場所を指定した場合は、引当物流グループもしくは総量引当場所グループを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0171' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0171',
	'W',
	'引当範囲区分に「1.場所引当」を指定した場合は、引当場所もしくは引当物流グループのどちらか一方のみ指定が可能です。また、総量引当場所グループは指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0172' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0172',
	'W',
	'正式な単価マスタに同一キーのレコードが存在します。適用開始日を変更してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0173' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0173',
	'W',
	'正式な単価マスタに期間が重複するレコードが存在します。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0174' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0174',
	'W',
	'申請中のレコードと期間が重複するレコードが存在します。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0175' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0175',
	'W',
	'申請中のレコードと同一キーのレコードが存在します。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0176' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0176',
	'W',
	'サイト区分に「1：月」を指定し、取引先に対して締日が設定されていない場合は、サイトと予定日を指定できません。\n締日項目：{1}\nサイト項目：{2}\n予定日項目：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0177' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0177',
	'W',
	'サイト区分に「1.月」を指定し、取引先に対して締日が設定されている場合は、サイトと予定日は必須です。\n締日項目：{1}\nサイト項目：{2}\n予定日項目：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0178' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0178',
	'W',
	'サイト区分に「2.日」を指定し、取引先に対して締日が設定されている場合は、サイトは必須です。\n締日項目：{1}\nサイト項目：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0179' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0179',
	'W',
	'品目マスタの手配ＮＯ管理区分に「2.管理する（必須）」が設定されている品目は、手配ＮＯを管理しない（手配ＮＯ管理区分に「2.管理する（必須）」が設定されていない）親品目の子品目に指定できません。\n手配ＮＯ項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0180' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0180',
	'W',
	'ワーキンググループ間依頼種類区分に「1.移送依頼」を指定した場合は、得意先を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0181' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0181',
	'W',
	'ワーキンググループ間依頼種類区分に「1.移送依頼」もしくは「3.出荷依頼」を指定した場合は、依頼先ワーキンググループに物流機能もしくは製造機能を持つワーキンググループが指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0182' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0182',
	'W',
	'ワーキンググループ間依頼種類区分に「2.購買依頼」を指定した場合は、依頼先ワーキンググループに購買機能を持つワーキンググループが指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0183' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0183',
	'W',
	'親品目と子品目に同じ品目を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0184' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0184',
	'W',
	'以下のいずれかの項目に0以外の数値を入力する必要があります。\n子品目投入比率\n子固定必要数量\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0185' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0185',
	'W',
	'以下のいずれかの項目に0以外の数値を入力する必要があります。\n子投入数量\n子固定必要数量\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0186' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0186',
	'W',
	'インボイス取引をオンにした場合、または出荷先物流グループに納品先に対する物流グループ（物流グループマスタで場所設定が設定されていない物流グループ）を指定した場合のみ標準配送先を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0187' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0187',
	'W',
	'ロット管理区分に「1.ロット管理しない」以外が設定されている子品目が代替品となる場合に、代替品目選択区分が「1.混在可」かつロット混在不可の組み合わせは指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0188' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0188',
	'W',
	'ロット管理区分に「1.ロット管理しない」以外が設定されている子品目が代替品となる場合に、代替品目選択区分が「1.混在可」かつロット混在不可の組み合わせは指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0189' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0189',
	'W',
	'サブロット管理区分に「1.サブロット管理しない」以外が設定されている子品目が代替品となる場合に、代替品目選択区分が「1.混在可」かつサブロット混在不可の組み合わせは指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0190' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0190',
	'W',
	'発注点在庫数量が指定されていない場合は、以下の項目を指定できません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0191' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0191',
	'W',
	'指定した物流グループと総量引当場所グループに対する物流グループが異なるため登録できません。\n物流グループＣＤ：{1}\n総量引当場所グループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0192' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0192',
	'W',
	'指定した場所と総量引当場所グループに対する場所が異なるため登録できません。\n場所ＣＤ：{1}\n総量引当場所グループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0193' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0193',
	'W',
	'指定した場所と物流グループに対する場所が異なるため登録できません。\n場所ＣＤ：{1}\n物流グループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0194' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0194',
	'W',
	'総量引当場所グループ及び物流グループを指定した場合は、引当範囲区分に「2.総量引当」のみ指定できます。\n引当範囲区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0195' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0195',
	'W',
	'総量引当場所グループ及び場所を指定した場合は、引当範囲区分に「1.場所引当」のみ指定できます。\n引当範囲区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0196' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0196',
	'W',
	'物流グループ及び場所を指定した場合は、引当範囲区分に「1.場所引当」のみ指定できます。\n引当範囲区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0197' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0197',
	'W',
	'部門は計画品目を指定した場合のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0198' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0198',
	'W',
	'同じ親品目、構成パタン、工程、工程連番、子品目のレコードでロット混在もしくはサブロット混在を異なる設定にできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0199' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0199',
	'W',
	'以下のいずれかの項目に0以外の数値を入力する必要があります。\n子品目必要比率\n子固定必要数量\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0501' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0501',
	'W',
	'継承項目区分に「ACT_CONT_FCTR.実際有効成分係数」を指定した場合は、子品目に有効成分対象がオンの品目のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0502' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0502',
	'W',
	'継承項目区分に「ACT_CONT_FCTR.実際有効成分係数」を指定した場合は、親品目に有効成分対象がオンの品目のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0503' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0503',
	'W',
	'有効成分機能が無効な場合は継承項目区分に「ACT_CONT_FCTR.実際有効成分係数」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0504' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0504',
	'W',
	'継承項目区分に「LOT_SUB_CHAR1～5.ロット予備（文字列）１～５」を指定した場合のみ、継承方法区分に「1.文字列結合」を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0505' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0505',
	'W',
	'継承項目区分と追加結合項目区分に同じ値は指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0506' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0506',
	'W',
	'継承方法区分に「1.文字列結合」を指定した場合のみ、追加結合項目区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0507' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0507',
	'W',
	'追加結合項目区分は「LOT_SUB_CHAR1～5.ロット予備（文字列）１～５」もしくは「LOT_RMRKS.ロット備考」のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0508' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0508',
	'W',
	'継承方法区分に「1.文字列結合」を指定した場合のみ、桁数超過時エラーをオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0509' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0509',
	'W',
	'指定したＩＦ処理区分では使用できない項目が設定されています。\nＩＦ処理区分：{1}\n項目：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0510' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0510',
	'W',
	'ＩＦ処理区分が「F1070.工数実績受信」または「F1080.工数予定送信」であり、かつ、工程または工数管理を指定する場合は、場所も指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0511' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0511',
	'W',
	'送信処理対象のＩＦ処理区分を指定した場合のみ、外部システムを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0512' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0512',
	'W',
	'指定した入庫場所が不正です。以下の入庫場所は指定できません。\n・場所を指定した場合、指定した場所の物流グループと入庫場所の物流グループが一致する。\n・物流グループを指定した場合、指定した物流グループと入庫場所の物流グループが一致する。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0513' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0513',
	'W',
	'ＩＦ処理区分に「F1070.工数実績受信」または「F1080.工数予定送信」を指定した場合は、品目を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0520' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0520',
	'W',
	'決済方法マスタで債務決済区分に「2.預金（手数料）」もしくは「4.現金（手数料）」が指定されている決済方法を指定した場合は比率に０のみ登録可能です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0521' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0521',
	'W',
	'決済方法マスタで債務決済区分に「2.預金（手数料）」もしくは「4.現金（手数料）」以外が指定されている決済方法を指定した場合は比率に０は登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0522' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0522',
	'W',
	'ＦＢ ＩＦ制御マスタの債権決済区分に「1.現金」「2.振込」「3.手形」以外を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0523' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0523',
	'W',
	'債権決済区分に「2.振込」以外が指定されている場合は、銀行を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0524' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0524',
	'W',
	'債権決済区分に「2.振込」以外が指定されている場合は、口座を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0525' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0525',
	'W',
	'取引先が指定されている場合は、取引先無しをオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0526' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0526',
	'W',
	'発注点在庫数量が設定されていない、または発注点依頼数量が設定されている場合はロットサイジングをオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0527' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0527',
	'W',
	'投入品出庫場所の製造場所グループと場所の製造場所グループが異なっています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0528' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0528',
	'W',
	'出荷品出庫場所の総量引当場所グループと場所の総量引当場所グループが異なっています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0529' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0529',
	'W',
	'仕入計上区分に「1.入荷基準」を指定した場合は、検収ＬＴを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0530' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0530',
	'W',
	'以下の条件をすべて満たす場合は、検収ＬＴを指定できません。\n・品目詳細マスタの仕入計上区分が設定されていない\n・取引先マスタで仕入計上区分に「1.入荷基準」が指定されている\n取引先ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0531' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0531',
	'W',
	'取引先マスタで下請対象をオンとした場合は、検収ＬＴを指定できません。\n取引先ＣＤ：{1}\n{2}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0532' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0532',
	'W',
	'取引先マスタで下請対象をオンとした場合は、仕入計上区分を指定できません。\n取引先ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSL0533' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSL0533',
	'W',
	'版マスタに登録されていません。\n品目：{1}\n版ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSD0001',
	'W',
	'掛率を使用しますが、標準販売単価マスタが登録されていないため単価を取得できません。\n品目：{1}\n単位ＣＤ：{2}\n通貨ＣＤ：{3}\nワーキンググループＣＤ：{4}\n適用日：{5}\n数量：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSD0002',
	'W',
	'場所から取得された部門が指定した日付に対して部門マスタに登録されていません。部門マスタを確認してください。\n場所ＣＤ：{1}\n部門ＣＤ：{2}\n日付：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSD0003',
	'W',
	'場所・日付に対する資産管理部門を取得できません。場所マスタ及び場所補助マスタを確認してください。\n場所ＣＤ：{1}\n日付：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSD0004',
	'W',
	'場所・日付に対する売上部門を取得できません。場所マスタ及び場所補助マスタを確認してください。\n場所ＣＤ：{1}\n日付：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSD0005',
	'W',
	'取引先から取得された部門が指定した日付に対して部門マスタに登録されていません。部門マスタを確認してください。\n取引先ＣＤ：{1}\n部門ＣＤ：{2}\n日付：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSD0006',
	'W',
	'得意先・日付に対する債権部門を取得できません。取引先マスタ及び取引先補助マスタを確認してください。\n得意先ＣＤ：{1}\n日付：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSD0007',
	'W',
	'請求先・日付に対する請求先担当部門を取得できません。取引先マスタ及び取引先補助マスタを確認してください。\n請求先ＣＤ：{1}\n日付：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSD0008',
	'W',
	'発注先・日付に対するＶＭＩ購買部門を取得できません。取引先マスタ及び取引先補助マスタを確認してください。\n発注先ＣＤ：{1}\n日付：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSD0009',
	'W',
	'買掛先・日付に対する債務部門を取得できません。取引先マスタ及び取引先補助マスタを確認してください。\n買掛先ＣＤ：{1}\n日付：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSD0010',
	'W',
	'支払予定管理先・日付に対する支払予定管理先担当部門を取得できません。取引先マスタ及び取引先補助マスタを確認してください。\n支払予定管理先ＣＤ：{1}\n日付：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSD0011',
	'W',
	'売上部門に対する場所を取得できません。場所マスタ及び場所補助マスタを確認してください。\n売上部門ＣＤ：{1}\n日付：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABSD0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABSD0050',
	'W',
	'支払先・日付に対する支払部門を取得できません。取引先マスタ及び取引先補助マスタを確認してください。\n支払先ＣＤ：{1}\n日付：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGP0001',
	'I',
	'原価ログイン情報のキャッシュをクリアし、再設定しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0001',
	'W',
	'計画月次比率をオフ、または実績月次比率をオンとした場合は、計画基準を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0002',
	'W',
	'計画月次比率をオフ、かつ実績月次比率をオフとした場合は、比率指定区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0003',
	'W',
	'集計レポート行と対象レポート行に同じレポート行を指定できません。\nレポート行：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0005',
	'W',
	'部門引継をオンとした場合は、配賦先部門を指定できません。\n配賦先部門ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0006',
	'W',
	'取引先引継をオンとした場合は、配賦先取引先を指定できません。\n配賦先取引先ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0007',
	'W',
	'ロットＮＯ引継をオンとした場合は、配賦先ロットＮＯを指定できません。\n配賦先ロットＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0008',
	'W',
	'サブロットＮＯ引継をオンとした場合は、配賦先サブロットＮＯを指定できません。\n配賦先サブロットＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0009',
	'W',
	'手配ＮＯ１引継をオンとした場合は、配賦先手配ＮＯ１を指定できません。\n配賦先手配ＮＯ１：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0010',
	'W',
	'手配ＮＯ２引継をオンとした場合は、配賦先手配ＮＯ２を指定できません。\n配賦先手配ＮＯ２：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0011',
	'W',
	'手配ＮＯ３引継をオンとした場合は、配賦先手配ＮＯ３を指定できません。\n配賦先手配ＮＯ３：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0012',
	'W',
	'一次配賦基準マスタの計画月次比率がオンとされている一次配賦基準を指定した場合は、計画データ予実区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0013',
	'W',
	'一次配賦基準マスタの計画月次比率がオンとされている一次配賦基準を指定した場合は、計画キー予実区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0014',
	'W',
	'一次配賦基準マスタの計画月次比率がオンとされている一次配賦基準を指定した場合は、計画キー対象年月を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0015',
	'W',
	'一次配賦基準マスタの実績月次比率がオンとされている一次配賦基準を指定した場合は、実績データ予実区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0016',
	'W',
	'一次配賦基準マスタの実績月次比率がオンとされている一次配賦基準を指定した場合は、実績キー予実区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0017',
	'W',
	'一次配賦基準マスタの実績月次比率がオンとされている一次配賦基準を指定した場合は、実績キー対象年月を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0018',
	'W',
	'金額設定区分に「3.直近確定総平均単価」または「4.直近確定総平均単価（標準）」を指定した場合のみ計算グループを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0019',
	'W',
	'登録対象が既に存在します。検索後に更新してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0020',
	'W',
	'配賦対象区分に「4.売上」以外を指定した場合は、費目区分が「1.製造・売上原価費目」となる費目のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0021',
	'W',
	'配賦対象区分に「4.売上」を指定した場合は、費目区分が「2.販売・一般管理費目」となる費目のみ指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0022',
	'W',
	'配賦対象区分に「1.製造」を指定した場合は、配賦方法区分に「5.利益」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0023',
	'W',
	'配賦対象区分に「2.購買」を指定した場合は、配賦方法区分に「1.工数」、「5.利益」または「6.投入数量」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0024',
	'W',
	'配賦対象区分に「3.製造・購買」を指定した場合は、配賦方法区分に「5.利益」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0025',
	'W',
	'配賦対象区分に「4.売上」を指定した場合は、配賦方法区分に「1.工数」または「6.投入数量」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0026',
	'W',
	'配賦対象区分に「5.汎用配賦」を指定した場合は、配賦方法区分に「1.工数」、「4.費目別原価」、「5.利益」または「6.投入数量」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0027',
	'W',
	'配賦対象区分が「4.売上」となる配賦パタンを指定した場合は、自工程対象をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0028',
	'W',
	'配賦対象区分が「4.売上」となる配賦パタンを指定した場合は、投入対象区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0029',
	'W',
	'投入対象区分に「4.全投入品目」を指定した場合のみ品群または品目を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0030',
	'W',
	'レポート対象区分に「5.入出庫」または「R.入出庫金額」を指定した場合のみ原価入出庫区分を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0031',
	'W',
	'帳票ＩＤに原価管理の帳票ではないＩＤが指定されています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0032',
	'W',
	'新規追加行は、既に登録されています。\n計算グループＣＤ：{1}\n優先順位：{2}\n計算カテゴリ区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0057',
	'W',
	'レポート対象区分に「Z.配賦」を指定した場合のみ配賦科目グループ１～３および配賦科目を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0058',
	'W',
	'入出庫振替区分に「1.費用振替」または「2.投入振替」を指定した場合のみ配賦科目を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0059',
	'W',
	'配賦科目を指定した場合のみ配賦振替をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0061',
	'W',
	'配賦科目を指定した場合のみ部門引継をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0062',
	'W',
	'配賦科目を指定した場合のみ配賦先部門を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0063',
	'W',
	'部門引継をオンとした場合は、配賦先部門を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0064',
	'W',
	'配賦科目を指定した場合のみ場所引継をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0065',
	'W',
	'配賦科目を指定した場合のみ配賦先場所を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0066',
	'W',
	'場所引継をオンとした場合は、配賦先場所を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0067',
	'W',
	'配賦科目を指定した場合のみ工程引継をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0068',
	'W',
	'配賦科目を指定した場合のみ配賦先工程を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0069',
	'W',
	'工程引継をオンとした場合は、配賦先工程を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0070',
	'W',
	'配賦科目を指定した場合のみ取引先引継をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0071',
	'W',
	'配賦科目を指定した場合のみ配賦先取引先を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0072',
	'W',
	'取引先引継をオンとした場合は、配賦先取引先を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0073',
	'W',
	'配賦科目を指定した場合のみ品群引継をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0074',
	'W',
	'配賦科目を指定した場合のみ配賦先品群を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0075',
	'W',
	'品群引継をオンとした場合は、配賦先品群を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0076',
	'W',
	'配賦科目を指定した場合のみ品目引継をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0077',
	'W',
	'配賦科目を指定した場合のみ配賦品目を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0078',
	'W',
	'品目引継をオンとした場合は、配賦品目を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0079',
	'W',
	'配賦科目を指定した場合のみロットＮＯ引継をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0080',
	'W',
	'配賦科目を指定した場合のみ配賦先ロットＮＯを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0081',
	'W',
	'ロットＮＯ引継をオンとした場合は、配賦先ロットＮＯを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0082' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0082',
	'W',
	'配賦科目を指定した場合のみサブロットＮＯ引継をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0083',
	'W',
	'配賦科目を指定した場合のみ配賦先サブロットＮＯを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0084' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0084',
	'W',
	'サブロットＮＯ引継をオンとした場合は、配賦先サブロットＮＯを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0085',
	'W',
	'配賦科目を指定した場合のみ手配ＮＯ１引継をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0086',
	'W',
	'配賦科目を指定した場合のみ配賦先手配ＮＯ１を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0087',
	'W',
	'手配ＮＯ１引継をオンとした場合は、配賦先手配ＮＯ１を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0088',
	'W',
	'配賦科目を指定した場合のみ手配ＮＯ２引継をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0089' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0089',
	'W',
	'配賦科目を指定した場合のみ配賦先手配ＮＯ２を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0090' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0090',
	'W',
	'手配ＮＯ２引継をオンとした場合は、配賦先手配ＮＯ２を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0091' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0091',
	'W',
	'配賦科目を指定した場合のみ手配ＮＯ３引継をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0092' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0092',
	'W',
	'配賦科目を指定した場合のみ配賦先手配ＮＯ３を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0093' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0093',
	'W',
	'手配ＮＯ３引継をオンとした場合は、配賦先手配ＮＯ３を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0094' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0094',
	'W',
	'配賦科目を指定した場合のみ品目指図ＮＯ引継をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0095' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0095',
	'W',
	'入出庫振替区分に「2.投入振替」を指定した場合のみ投入場所区分１を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0096',
	'W',
	'投入場所区分１を指定した場合のみ投入場所区分２を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0097',
	'W',
	'投入場所区分２を指定した場合のみ投入場所区分３を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0098',
	'W',
	'数量を管理していないレポート対象区分を指定した場合は、数量単位区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0100',
	'W',
	'計算区分に「3.原価計算（在庫計算）」以外を指定した場合は、金額評価区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0101',
	'W',
	'計算順序グループを指定した場合のみ計算順序を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0102',
	'W',
	'配賦係数構成区分に「1.配賦係数構成マスタ」を指定した場合は、数量単位区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0103',
	'W',
	'手配ＮＯ４引継をオンとした場合は、配賦先手配ＮＯ４を指定できません。\n配賦先手配ＮＯ４：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0104',
	'W',
	'配賦科目を指定した場合のみ手配ＮＯ４引継をオンにできます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0105',
	'W',
	'配賦科目を指定した場合のみ配賦先手配ＮＯ４を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0106',
	'W',
	'手配ＮＯ４引継をオンとした場合は、配賦先手配ＮＯ４を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0107',
	'W',
	'集計行をオンとした場合は、以下の項目を指定できません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0108',
	'W',
	'集計列をオンとした場合は、以下の項目を指定できません。\n項目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0109',
	'W',
	'配賦科目配賦区分には「2.対象外（引き継がない）」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0110',
	'W',
	'ワーキンググループ配賦区分には「2.対象外（引き継がない）」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0111',
	'W',
	'配賦振替を指定した場合のみ配賦ワーキンググループを指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0112',
	'W',
	'指定された会計伝票区分は本画面で指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0113',
	'W',
	'原価テーブル区分で「ACT_SLS_IF.売上実績ＩＦ」を指定した場合は、対象項目区分に「PO_NO.発注ＮＯ」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0114',
	'W',
	'切捨をオフにした場合は、費目を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0115',
	'W',
	'一括指定をオフにした場合は、評価率（％）を指定できません。\n{1}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0116',
	'W',
	'一括指定をオンにした場合は、単価設定区分を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0117',
	'W',
	'配賦係数に対する配賦係数構成区分と品目分類区分の組み合わせが正しくありません。\n配賦構成区分：{1}\n品目分類区分：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0118',
	'W',
	'配賦係数構成区分に「2.品目仕訳」を指定した配賦係数の場合のみ品目仕訳を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0119',
	'W',
	'配賦係数構成区分に「A.品目分類１」～「J.品目分類１０」を指定した配賦係数の場合のみ品目分類を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0120',
	'W',
	'単位数量区分が設定されている配賦係数の場合のみ単位を指定できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0121',
	'W',
	'レポートキー区分に対する品目分類区分と品目分類に対する品目分類区分が一致していません。\n品目分類ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0122',
	'W',
	'展開計算区分に「1.計算対象外」が指定されている、または計算区分に「3.原価計算（在庫計算）」以外が指定されている場合は、移動計算をオンにできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0123',
	'W',
	'受払集計単位区分に「3.受払対象・会計伝票・会計理由単位」以外を指定した場合は、会計理由ＣＤを指定できません。\n受払表ＩＤ：{1}\n受払項目ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0124',
	'W',
	'指定の受払対象区分の場合は、受払集計単位区分に「1.受払対象単位」のみ指定できます。\n受払表ＩＤ：{1}\n受払項目ＣＤ：{2}\n受払対象区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MABGL0125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MABGL0125',
	'W',
	'受払対象区分 に「T.総平均単価」を指定した場合は、差額計算区分に「1.対象外」のみ指定できます。\n受払表ＩＤ：{1}\n受払項目ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0001',
	'W',
	'銀行マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0002',
	'W',
	'銀行支店マスタで銀行に対する支店として指定されていません。\n銀行ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0003',
	'W',
	'汎用分類マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0004',
	'W',
	'担当者マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0005',
	'W',
	'会計部門マスタで適用日に対する会計部門として指定されていません。\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0006',
	'W',
	'予備科目区分マスタで予備科目区分に対する科目区分として指定されていません。\n予備科目区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0007',
	'W',
	'会計税マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0008',
	'W',
	'勘定科目マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0009',
	'W',
	'補助勘定科目マスタで勘定科目に対する補助勘定科目として指定されていません。\n勘定科目ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0010',
	'W',
	'自動仕訳キーマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0011',
	'W',
	'手形理由マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0012',
	'W',
	'仕訳実行マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0013',
	'W',
	'仕訳グループマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0014',
	'W',
	'自動仕訳パタン基本マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0015',
	'W',
	'会計理由マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0016',
	'W',
	'口座マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0017',
	'W',
	'品目仕訳マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0018',
	'W',
	'通貨マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0019',
	'W',
	'総量引当場所グループマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0020',
	'W',
	'カレンダ基本マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0021',
	'W',
	'業務理由マスタに他勘定出庫理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0022',
	'W',
	'国マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0023',
	'W',
	'物流グループマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0024',
	'W',
	'製造場所グループマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0025',
	'W',
	'伝票帳票マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0026',
	'W',
	'輸送方法マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0027',
	'W',
	'単位マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0028',
	'W',
	'地域マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0029',
	'W',
	'為替レート基本マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0030',
	'W',
	'ＨＳ分類マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0031',
	'W',
	'ＨＳマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0032',
	'W',
	'品目分類マスタで品目分類区分に対する品目分類として指定されていません。\n品目分類区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0033',
	'W',
	'会計品目分類マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0034',
	'W',
	'業務理由マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0035',
	'W',
	'工数理由マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0036',
	'W',
	'工数管理マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0037',
	'W',
	'工程マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0038',
	'W',
	'取引先分類マスタで取引先分類区分に対する取引先分類として指定されていません。\n取引先分類区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0039',
	'W',
	'取引条件マスタで取引条件区分に対する取引条件として指定されていません。\n取引条件区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0040',
	'W',
	'相殺グループマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0041',
	'W',
	'出荷条件マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0042',
	'W',
	'品群グループマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0043',
	'W',
	'港マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0044',
	'W',
	'輸出梱包容器マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0045',
	'W',
	'格付マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0046',
	'W',
	'取引マスタで以下の条件に対する取引として指定されていません。\n取引パタン区分：{1}\n機能ＩＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0047',
	'W',
	'販売単価分類マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0048',
	'W',
	'販売単価ランクマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0049',
	'W',
	'品目出荷グループマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0050',
	'W',
	'出荷有効期限グループマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0051',
	'W',
	'版マスタで以下の条件に対する版ＮＯとして指定されていません。\n品目：{1}\n工場・物流倉庫ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0052',
	'W',
	'原価費目グループマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0053',
	'W',
	'原価費目マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0054',
	'W',
	'原価メニューマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0055',
	'W',
	'工場・物流倉庫マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0056',
	'W',
	'ワーキンググループマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0057',
	'W',
	'場所マスタに有効な場所として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0058',
	'W',
	'棚・ラインマスタで場所に対する棚・ラインとして指定されていません。\n場所ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0059',
	'W',
	'品目区分詳細マスタで品目区分に対する品目区分詳細として指定されていません。\n品目区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0060',
	'W',
	'仕様マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0061',
	'W',
	'仕様項目マスタで仕様に対する仕様項目として指定されていません。\n仕様ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0062',
	'W',
	'品目仕様分類マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0063',
	'W',
	'品目構成グループマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0064',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・担当者が所属する部門として担当者権限マスタに設定されていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0065',
	'W',
	'部門階層マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0066',
	'W',
	'データアクセス基本マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0067',
	'W',
	'承認役割マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0068',
	'W',
	'発番パタンマスタで発番業務区分に対する発番パタンとして指定されていません。\n発番業務区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0069',
	'W',
	'対象期間マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0070',
	'W',
	'予備科目区分マスタに予備科目区分１として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0071',
	'W',
	'予備科目区分マスタに予備科目区分２として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0072',
	'W',
	'予備科目区分マスタに予備科目区分３として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0073',
	'W',
	'予備科目区分マスタに予備科目区分４として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0074',
	'W',
	'予備科目区分マスタに予備科目区分５として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0075',
	'W',
	'予備科目区分マスタにＡＰ科目区分として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0076',
	'W',
	'予備科目区分マスタにＡＲ科目区分として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0077',
	'W',
	'税マスタに売上税として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0078',
	'W',
	'税マスタに仕入税として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0079',
	'W',
	'税マスタに支給税として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0080',
	'W',
	'注文書表示マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0081',
	'W',
	'計算パタンマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0082' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0082',
	'W',
	'計算グループマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0083',
	'W',
	'品目分類マスタに品目分類１として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0084' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0084',
	'W',
	'品目分類マスタに品目分類２として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0085',
	'W',
	'品目分類マスタに品目分類３として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0086',
	'W',
	'品目分類マスタに品目分類４として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0087',
	'W',
	'品目分類マスタに品目分類５として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0088',
	'W',
	'品目分類マスタに品目分類６として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0089' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0089',
	'W',
	'品目分類マスタに品目分類７として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0090' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0090',
	'W',
	'品目分類マスタに品目分類８として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0091' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0091',
	'W',
	'品目分類マスタに品目分類９として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0092' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0092',
	'W',
	'品目分類マスタに品目分類１０として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0093' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0093',
	'W',
	'取引先分類マスタに取引先分類１として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0094' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0094',
	'W',
	'取引先分類マスタに取引先分類２として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0095' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0095',
	'W',
	'取引先分類マスタに取引先分類３として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0096',
	'W',
	'取引先分類マスタに取引先分類４として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0097',
	'W',
	'取引先分類マスタに取引先分類５として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0098',
	'W',
	'取引先分類マスタに取引先分類６として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0099',
	'W',
	'取引先分類マスタに取引先分類７として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0100',
	'W',
	'取引先分類マスタに取引先分類８として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0101',
	'W',
	'取引先分類マスタに取引先分類９として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0102',
	'W',
	'取引先分類マスタに取引先分類１０として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0103',
	'W',
	'取引先マスタで得意先がオンに設定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0104',
	'W',
	'取引先マスタで売掛先がオンに設定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0105',
	'W',
	'取引先マスタで請求先がオンに設定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0106',
	'W',
	'取引先マスタで入金先がオンに設定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0107',
	'W',
	'取引先マスタで発注先がオンに設定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0108',
	'W',
	'取引先マスタで買掛先がオンに設定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0109',
	'W',
	'取引先マスタで支払予定管理先がオンに設定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0110',
	'W',
	'取引先マスタで支払先がオンに設定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0111',
	'W',
	'取引先マスタで与信管理先がオンに設定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0112',
	'W',
	'取引先マスタで納品先がオンに設定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0113',
	'W',
	'取引先マスタでメーカがオンに設定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0114',
	'W',
	'取引先マスタで仕向先がオンに設定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0115',
	'W',
	'購買内示マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0116',
	'W',
	'会社マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0117',
	'W',
	'取引先マスタに有効な取引先として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0118',
	'W',
	'原価個別受払表マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0119',
	'W',
	'原価個別受払表構成マスタで以下の条件に対する受払項目として指定されていません。\n受払表ＩＤ：{1}\n受払集計単位区分：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0120',
	'W',
	'自動仕訳パタンマスタで仕訳パタンに対する連番として指定されていません。\n仕訳パタンＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0121',
	'W',
	'税マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0122',
	'W',
	'業務理由マスタに仕入理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0123',
	'W',
	'業務理由マスタに仕入返品理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0124',
	'W',
	'業務理由マスタに仕入調整理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0125',
	'W',
	'業務理由マスタに売上理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0126',
	'W',
	'業務理由マスタに売上返品理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0127',
	'W',
	'業務理由マスタに売上調整理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0128' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0128',
	'W',
	'業務理由マスタに他勘定入庫理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0129' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0129',
	'W',
	'業務理由マスタに廃棄理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0130' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0130',
	'W',
	'業務理由マスタに在庫振替理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0131',
	'W',
	'業務理由マスタに移送理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0132',
	'W',
	'業務理由マスタに出来高理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0133',
	'W',
	'業務理由マスタにロス理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0134' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0134',
	'W',
	'業務理由マスタに検査不良理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0135' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0135',
	'W',
	'業務理由マスタに工程外注理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0136' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0136',
	'W',
	'業務理由マスタに投入他勘定入庫理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0137' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0137',
	'W',
	'配賦パタンマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0138' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0138',
	'W',
	'配賦科目グループマスタで配賦科目グループ区分に対する配賦科目グループとして指定されていません。\n配賦科目グループ区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0139' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0139',
	'W',
	'配賦科目マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0140' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0140',
	'W',
	'個別受払表構成マスタに未登録のものが、受払表マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0141' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0141',
	'W',
	'計算カテゴリマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0142' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0142',
	'W',
	'配賦科目グループマスタに配賦科目グループ区分１として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0143' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0143',
	'W',
	'配賦科目グループマスタに配賦科目グループ区分２として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0144' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0144',
	'W',
	'配賦科目グループマスタに配賦科目グループ区分３として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0145' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0145',
	'W',
	'取引条件マスタに取引条件区分１として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0146' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0146',
	'W',
	'取引条件マスタに取引条件区分２として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0147' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0147',
	'W',
	'取引条件マスタに取引条件区分３として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0148' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0148',
	'W',
	'販売分析マスタに販売分析区分１として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0149' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0149',
	'W',
	'販売分析マスタに販売分析区分２として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0150' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0150',
	'W',
	'販売分析マスタに販売分析区分３として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0151' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0151',
	'W',
	'販売分析マスタで販売分析区分に対する販売分析として指定されていません。\n販売分析区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0152' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0152',
	'W',
	'売上分類マスタで売上分類区分に対する売上分類として指定されていません。\n売上分類区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0153' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0153',
	'W',
	'原価売上分類マスタに売上分類区分１として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0154' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0154',
	'W',
	'原価売上分類マスタに売上分類区分２として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0155' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0155',
	'W',
	'原価売上分類マスタに売上分類区分３として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0156' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0156',
	'W',
	'原価売上分類マスタに売上分類区分４として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0157' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0157',
	'W',
	'原価売上分類マスタに売上分類区分５として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0158' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0158',
	'W',
	'汎用配賦分類マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0159' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0159',
	'W',
	'格付マスタに出荷可能な格付として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0160' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0160',
	'W',
	'格付マスタに投入引当可能な格付として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0161' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0161',
	'W',
	'輸送方法マスタに、出荷に対して使用可能な輸送方法として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0162' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0162',
	'W',
	'輸送方法マスタに、輸出に対して使用可能な輸送方法として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0163' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0163',
	'W',
	'輸送方法マスタに、輸入に対して使用可能な輸送方法として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0164' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0164',
	'W',
	'ワーキンググループマスタに販売機能を持つワーキンググループとして登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0165' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0165',
	'W',
	'ワーキンググループマスタに物流機能を持つワーキンググループとして登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0166' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0166',
	'W',
	'ワーキンググループマスタに製造機能を持つワーキンググループとして登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0167' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0167',
	'W',
	'ワーキンググループマスタに購買機能を持つワーキンググループとして登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0168' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0168',
	'W',
	'ワーキンググループマスタに債権機能を持つワーキンググループとして登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0169' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0169',
	'W',
	'ワーキンググループマスタに債務機能を持つワーキンググループとして登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0170' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0170',
	'W',
	'ワーキンググループマスタに需給機能を持つワーキンググループとして登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0171' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0171',
	'W',
	'口座マスタに社内口座として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0172' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0172',
	'W',
	'口座マスタに社外口座として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0173' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0173',
	'W',
	'決済方法マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0174' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0174',
	'W',
	'決済方法マスタに債権決済区分が「4.相殺（借方）」として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0175' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0175',
	'W',
	'一次配賦パタンマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0176' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0176',
	'W',
	'配賦係数マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0177' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0177',
	'W',
	'原価部門マスタで適用年月に対する原価部門として指定されていません。\n適用年月：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0178' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0178',
	'W',
	'一次配賦先部門マスタで期に対する配賦先部門パタンとして指定されていません。\n期：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0179' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0179',
	'W',
	'ワーキンググループマスタに物流機能もしくは製造機能を持つワーキンググループとして登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0180' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0180',
	'W',
	'物流グループマスタに有効な物流グループとして登録されていない、もしくは物流グループマスタで場所設定にオフが指定されています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0181' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0181',
	'W',
	'配賦方法マスタで期に対する費目別原価または利益として指定されていません。\n期：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0182' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0182',
	'W',
	'一次配賦基準マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0183' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0183',
	'W',
	'一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで比率設定区分に対する一次配賦基準として指定されていません。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n比率設定区分：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0184' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0184',
	'W',
	'原価品群マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0185' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0185',
	'W',
	'部門基本マスタに登録されていない、もしくは過去に同じ部門ＣＤを使用しています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0186' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0186',
	'W',
	'組織変更履歴マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0187' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0187',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの資産管理部門がオンになっていること\n・担当者が所属する部門として担当者権限マスタに設定されていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0188' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0188',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの営業部門がオンになっていること\n・担当者が所属する部門として担当者権限マスタに設定されていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0189' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0189',
	'W',
	'品目マスタに有効な品目として登録されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0190' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0190',
	'W',
	'原価レポート比較マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0191' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0191',
	'W',
	'原価レポート比較構成マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0192' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0192',
	'W',
	'計算グループレポートマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0193' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0193',
	'W',
	'原価レポートパタンマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0194' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0194',
	'W',
	'原価レポートキーマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0195' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0195',
	'W',
	'原価レポート構成マスタで以下の条件に対するレポート行として指定されていません。\nレポートパタンＣＤ：{1}\n集計：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0196' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0196',
	'W',
	'計算グループマスタに「2.原価計算（在庫対象外）」または「3.原価計算（在庫計算）」として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0197' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0197',
	'W',
	'品目マスタに資産管理可能な品目として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0198' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0198',
	'W',
	'販売品目体系マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0199' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0199',
	'W',
	'決済方法マスタに債権決済方法として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0200' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0200',
	'W',
	'品目マスタに在庫管理可能な品目として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0201' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0201',
	'W',
	'場所マスタに有効な場所として登録されていない、もしくは場所マスタで製造のワーキンググループが指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0202' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0202',
	'W',
	'検査項目マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0203' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0203',
	'W',
	'指定した品目ＣＤの枝番１として品目マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0204' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0204',
	'W',
	'指定した品目ＣＤの枝番２として品目マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0205' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0205',
	'W',
	'指定した品目ＣＤの枝番３として品目マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0206' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0206',
	'W',
	'物流グループマスタに有効な物流グループとして登録されていない、もしくは物流グループマスタで場所設定にオンが指定されています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0207' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0207',
	'W',
	'原価レポートキー構成マスタが登録済みのレポートキーは指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0208' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0208',
	'W',
	'原価レポート構成マスタが登録済みのレポートパタンは指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0209' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0209',
	'W',
	'検査パタンマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0210' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0210',
	'W',
	'原価費目マスタに費目区分「1.製造・売上原価費目」または「2.販売・一般管理費目」として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0211' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0211',
	'W',
	'配賦方法マスタで期に対する配賦パタンとして指定されていない、もしくは配賦方法マスタで配賦方法区分に「1.工数」が指定されていません。\n期：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0212' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0212',
	'W',
	'外部システムマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0213' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0213',
	'W',
	'承認ルートマスタで指定した承認機能区分の承認ルートパタンとして指定されていません。\n承認機能区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0214' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0214',
	'W',
	'ワーキンググループマスタに物流または製造または販売機能を持つワーキンググループとして登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0215' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0215',
	'W',
	'品目検査パタンマスタで以下の条件に対する検査パタンとして指定されていません。\n品目：{1}\n適用日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0216' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0216',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの債権部門がオンになっていること\n・担当者が所属する部門として担当者権限マスタに設定されていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0217' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0217',
	'W',
	'場所マスタに取引先未登録として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0218' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0218',
	'W',
	'取引先マスタで得意先と発注先がいずれも指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0219' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0219',
	'W',
	'計算グループマスタに計算区分「3.原価計算（在庫計算）」として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0220' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0220',
	'W',
	'品目検査パタンマスタで以下の条件に対する検査パタンとして指定されていない、もしくは品目検査パタンマスタで検査方法区分に「4.抜取規格検査」が指定されていません。\n品目：{1}\n適用日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0221' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0221',
	'W',
	'ワーキンググループマスタに検索可能かつ販売機能を持つワーキンググループとして登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0222' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0222',
	'W',
	'ワーキンググループマスタに更新可能かつ販売機能を持つワーキンググループとして登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0223' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0223',
	'W',
	'品目品管マスタで品目に対する検査パタンとして指定されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0224' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0224',
	'W',
	'レポートパタン集計マスタを使用するレポート行として原価レポート構成マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0225' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0225',
	'W',
	'ＭＰＳグループマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0226' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0226',
	'W',
	'販売計画品目マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0227' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0227',
	'W',
	'指定した場所が不正です。以下を確認してください。\n・場所マスタに有効な場所として登録されていること\n・場所マスタに移動先場所と異なる場所として登録されていること\n・場所マスタに移動先場所のワーキンググループと同一のワーキンググループが指定されていること\n移動先場所ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0228' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0228',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの債務部門がオンになっていること\n・担当者が所属する部門として担当者権限マスタに設定されていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0229' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0229',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの購買部門がオンになっていること\n・担当者が所属する部門として担当者権限マスタに設定されていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0230' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0230',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの負担部門がオンになっていること\n・担当者が所属する部門として担当者権限マスタに設定されていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0231' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0231',
	'W',
	'品目マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0232' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0232',
	'W',
	'勤務種類マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0233' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0233',
	'W',
	'資源マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0234' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0234',
	'W',
	'品揃グループマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0235' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0235',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの検査部門がオンになっていること\n・担当者が所属する部門として担当者権限マスタに設定されていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0236' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0236',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの製造部門がオンになっていること\n・担当者が所属する部門として担当者権限マスタに設定されていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0237' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0237',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの出荷部門がオンになっていること\n・担当者が所属する部門として担当者権限マスタに設定されていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0238' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0238',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの入荷部門がオンになっていること\n・担当者が所属する部門として担当者権限マスタに設定されていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0239' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0239',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの需給部門がオンになっていること\n・担当者が所属する部門として担当者権限マスタに設定されていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0240' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0240',
	'W',
	'ワーキンググループマスタにＰＬＭ機能を持つワーキンググループとして登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0241' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0241',
	'W',
	'業務理由マスタに棚卸理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0242' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0242',
	'W',
	'品目単位マスタで品目に対する単位として指定されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0243' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0243',
	'W',
	'検索可能なワーキンググループではありません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0244' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0244',
	'W',
	'更新可能なワーキンググループではありません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0245' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0245',
	'W',
	'検索可能な物流グループではありません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0246' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0246',
	'W',
	'更新可能な物流グループではありません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0247' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0247',
	'W',
	'検索可能な部門ではありません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0248' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0248',
	'W',
	'更新可能な部門ではありません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0249' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0249',
	'W',
	'検索可能な場所ではありません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0250' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0250',
	'W',
	'更新可能な場所ではありません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0251' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0251',
	'W',
	'代替グループマスタでワーキンググループに対する代替グループとして指定されていません。\nワーキンググループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0252' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0252',
	'W',
	'品目仕様マスタで以下の条件に対する仕様として指定されていません。\n品目：{1}\n品目仕様分類ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0253' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0253',
	'W',
	'取引先品目マスタで以下の条件に対する取引先品目として指定されていません。\n取引先ＣＤ：{1}\n品目：{2}\n適用日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0254' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0254',
	'W',
	'品目マスタ（ロケール別情報）に登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0255' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0255',
	'W',
	'品目工程マスタで以下の条件に対する工程パタンとして指定されていません。\n品目：{1}\n場所ＣＤ：{2}\n適用日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0256' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0256',
	'W',
	'品目詳細マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0257' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0257',
	'W',
	'ロス理由マスタで以下の条件に対するロス理由として指定されていません。\n品目区分：{1}\n品目区分詳細ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0258' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0258',
	'W',
	'出荷作業マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0259' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0259',
	'W',
	'出荷作業グループマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0260' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0260',
	'W',
	'取引先マスタで得意先が指定されていない、もしくは得意先諸口が設定されています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0261' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0261',
	'W',
	'取引先マスタで配送先が指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0262' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0262',
	'W',
	'取引先マスタで有償支給先が指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0263' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0263',
	'W',
	'以下の条件に対する得意先として得意先納品先マスタに登録されていません。\n納品先ＣＤ：{1}\n適用日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0264' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0264',
	'W',
	'以下の条件に対する納品先として得意先納品先マスタに登録されていません。\n得意先ＣＤ：{1}\n適用日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0265' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0265',
	'W',
	'取引先マスタで請求先がオンに設定されていない、もしくは取引先マスタで入金先に対する請求先として指定されていません。\n入金先ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0266' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0266',
	'W',
	'取引先マスタで納品先がオンに設定されていない、もしくは納品先以外も指定されています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0267' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0267',
	'W',
	'取引先マスタでメーカがオンに設定されていない、もしくはメーカ以外も指定されています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0268' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0268',
	'W',
	'取引先マスタで仕向先がオンに設定されていない、もしくは仕向先以外も指定されています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0269' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0269',
	'W',
	'取引先マスタで納品先と発注先がいずれもオンに設定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0270' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0270',
	'W',
	'取引先品目マスタで購買内示グループが指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0271' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0271',
	'W',
	'取引先マスタで請求先と入金先がいずれもオンに設定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0272' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0272',
	'W',
	'販売品目体系マスタに有効な販売品目体系が登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0273' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0273',
	'W',
	'システムパラメータ概要テーブルに有効なシステムパラメータ概要が登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0274' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0274',
	'W',
	'システムパラメータ概要テーブルに有効な業務分類が登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0275' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0275',
	'W',
	'以下の条件に対する部門として部門マスタに登録されていません。\n適用開始日：{1}\n適用終了日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0276' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0276',
	'W',
	'品目マスタに有効な品目として登録されていない、もしくは資産管理区分に「3.架空品」が指定されています。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0277' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0277',
	'W',
	'品目マスタに有効な品目として登録されていない、もしくは在庫管理区分に「1.在庫管理する」が指定されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0278' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0278',
	'W',
	'品目マスタに有効な品目として登録されていない、もしくは在庫管理区分に「2.在庫管理しない」が指定されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0279' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0279',
	'W',
	'品目マスタに有効な品目として登録されていない、もしくは在庫管理区分に「3.架空品」が指定されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0280' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0280',
	'W',
	'品目マスタに有効な品目として登録されていない、もしくは資産管理区分に「1.資産管理する」が指定されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0281' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0281',
	'W',
	'品目マスタに有効な品目として登録されていない、もしくは資産管理区分に「2.資産管理対しない」が指定されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0282' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0282',
	'W',
	'品目マスタに有効な品目として登録されていない、もしくは資産管理区分に「3.架空品」が指定されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0283' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0283',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・品目マスタの在庫管理区分に「1.在庫管理する」が指定されていること\n・品目マスタの資産管理区分に「1.資産管理する」が指定されていること\n品目：{1} \n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0284' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0284',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・品目マスタの在庫管理区分に「1.在庫管理する」が指定されていること\n・品目マスタの資産管理区分に「2.資産管理しない」が指定されていること\n品目：{1} \n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0285' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0285',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・品目マスタの在庫管理区分に「2.在庫管理しない」が指定されていること\n・品目マスタの資産管理区分に「1.資産管理する」が指定されていること\n品目：{1} \n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0286' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0286',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・品目マスタの在庫管理区分に「2.在庫管理しない」が指定されていること\n・品目マスタの資産管理区分に「2.資産管理しない」が指定されていること\n品目：{1} \n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0287' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0287',
	'W',
	'品目マスタに有効な品目として登録されていない、もしくは品目マスタで諸口品がオンに設定されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0288' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0288',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・品目マスタで在庫管理区分が「1.在庫管理する」が指定されていること\n・品目マスタで諸口品がオフであること\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0289' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0289',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・品目マスタの資産管理区分に「1.資産管理する」が指定されていること\n・品目マスタの諸口品にオフが指定されていること\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0290' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0290',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・品目マスタの在庫管理区分に「1.在庫管理する」が指定されていること\n・品目マスタの資産管理区分に「1.資産管理する」が指定されていること\n・品目マスタの諸口品にオフが指定されていること\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0291' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0291',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・品目マスタの在庫管理区分に「1.在庫管理する」が指定されていること\n・品目マスタの資産管理区分に「2.資産管理しない」が指定されていること\n・品目マスタの諸口品にオフが指定されていること\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0292' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0292',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・品目マスタの在庫管理区分に「2.在庫管理しない」が指定されていること\n・品目マスタの資産管理区分に「1.資産管理する」が指定されていること\n・品目マスタの諸口品にオフが指定されていること\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0293' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0293',
	'W',
	'品目マスタに有効な品目として登録されていない、もしくは品目マスタで版管理対象がオンに設定されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0294' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0294',
	'W',
	'品目マスタに有効な品目として登録されていない、もしくは品目検査パタンマスタに品目が登録されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0295' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0295',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・販売計画品目構成マスタに品目が登録されていること\n・販売計画品目構成マスタの計画品目にＮＵＬＬ文字が指定されていること\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0296' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0296',
	'W',
	'品目マスタに有効な品目として登録されていない、もしくは品目マスタで資産管理区分に「1.資産管理する」、または「3.架空品」が指定されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0297' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0297',
	'W',
	'品目マスタに有効な品目として登録されていない、もしくは品目マスタで構成主品目にオンが指定されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0298' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0298',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・品目マスタの資産管理区分に「3.架空品」以外が指定されていること\n・品目マスタの構成・仕様管理区分に「2.構成・仕様管理する」以外が指定されていること\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0299' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0299',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・品目マスタの在庫管理区分に「1.在庫管理する」が指定されていること\n・品目マスタの構成・仕様管理区分に「2.構成・仕様管理する」以外が指定されていること\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0300' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0300',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・取引先品目マスタに品目が登録されていること\n・取引先品目マスタの購買内示グループが指定されていること\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0301' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0301',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・品目検査パタンマスタに品目が登録されていること\n・品目検査パタンマスタで検査方法区分に「4.抜取規格検査」が指定されていること\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0302' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0302',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・品目マスタのロット管理区分に「2.同一ロット許可」、または「3.同一ロット不許可」が指定されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0303' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0303',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・補充マスタに品目が登録されていること\n・補充マスタの発注点在庫数量に0以上が指定されていること\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0304' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0304',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの債権部門、または債務部門がオンになっていること\n・担当者が所属する部門として担当者権限マスタに設定されていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0305' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0305',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの債権部門がオンになっていること\n・担当者が所属する部門として担当者権限マスタに設定されていること\n・取引先マスタで請求先に対する請求先部門として指定されていません。\n適用日：{1}\n請求先ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0306' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0306',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの営業部門、購買部門、出荷部門、入荷部門、製造部門、検査部門のいずれかがオンになっていること\n・担当者が所属する部門として担当者権限マスタに設定されていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0307' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0307',
	'W',
	'場所マスタに有効な場所として登録されていない、もしくは場所マスタで物流ワーキンググループが指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0308' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0308',
	'W',
	'指定した場所が不正です。以下を確認してください。\n・場所マスタに有効な場所として登録されていること\n・指定したワーキンググループが場所マスタで設定されていること\n・ワーキンググループマスタで指定したワーキンググループの製造がオンであること\nワーキンググループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0309' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0309',
	'W',
	'場所マスタに有効な場所として登録されていない、もしくは管轄区分に「1.販売」が指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0310' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0310',
	'W',
	'場所マスタに有効な場所として登録されていない、もしくは管轄区分に「2.生産」が指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0311' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0311',
	'W',
	'場所マスタに有効な場所として登録されていない、もしくは場所マスタの発注先が指定されています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0312' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0312',
	'W',
	'場所マスタに有効な場所として登録されていない、もしくは場所マスタで発注先が指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0313' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0313',
	'W',
	'指定した場所が不正です。以下を確認してください。\n・場所マスタに有効な場所として登録されていること\n・場所マスタの管轄区分に「2.生産」が指定されていること\n・場所マスタの発注先が指定されていること\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0314' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0314',
	'W',
	'指定した場所が不正です。以下を確認してください。\n・場所マスタに有効な場所として登録されていること\n・指定したワーキンググループが場所マスタで設定されていること\n・ワーキンググループマスタで指定したワーキンググループの発注先が指定されていないこと\nワーキンググループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0315' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0315',
	'W',
	'場所マスタに有効な場所として登録されていない、もしくは場所マスタの棚卸対象にオンが指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0316' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0316',
	'W',
	'場所マスタに有効な場所として登録されていない、もしくは場所マスタにワーキンググループに対する場所として登録されていません。\nワーキンググループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0317' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0317',
	'W',
	'場所マスタに有効な場所として登録されていない、もしくは場所マスタに物流グループに対する場所として登録されていません。\n物流グループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0318' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0318',
	'W',
	'場所マスタに有効な場所として登録されていない、もしくは場所マスタに工場・物流倉庫に対する場所として登録されていません。\n工場・物流倉庫ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0319' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0319',
	'W',
	'場所マスタに有効な場所として登録されていない、もしくは場所マスタに製造場所グループに対する場所として登録されていません。\n製造場所グループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0320' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0320',
	'W',
	'指定した場所が不正です。以下を確認してください。\n・場所マスタに有効な場所として登録されていること\n・場所マスタの発注先が指定されていないこと\n・場所マスタの製造ワーキンググループが指定されていること\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0321' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0321',
	'W',
	'業務理由マスタで以下の条件に対する仕入理由として指定されていません。\n経費購買：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0322' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0322',
	'W',
	'業務理由マスタで以下の条件に対する仕入返品理由として指定されていません。\n経費購買：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0323' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0323',
	'W',
	'税マスタで以下の条件に対する税として指定されていません。\n内税：{1}\n売上：{2}\n仕入：{3}\n支給：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0324' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0324',
	'W',
	'物流グループマスタでワーキンググループに対する物流グループとして指定されていない、もしくは物流グループマスタで場所設定にオフが指定されています。\nワーキンググループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0325' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0325',
	'W',
	'業務理由マスタで仕入調整管轄区分に対する仕入調整理由として指定されていません。\n仕入調整管轄区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0326' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0326',
	'W',
	'業務理由マスタで出来高区分に対する出来高理由として指定されていません。\n出来高区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0327' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0327',
	'W',
	'物流グループマスタでワーキンググループに対する物流グループとして指定されていません。\nワーキンググループＣＤ：{1}\n場所設定：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0328' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0328',
	'W',
	'製造場所グループマスタでワーキンググループに対する製造場所グループとして指定されていません。\nワーキンググループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0329' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0329',
	'W',
	'原価費目マスタで以下の条件に対する原価費目として指定されていません。\n費目区分：{1}\n直間区分：{2}\n固変区分：{3}\n費目グループＣＤ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0330' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0330',
	'W',
	'決済方法マスタで債権決済区分に対する決済方法として指定されていません。\n債権決済区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0331' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0331',
	'W',
	'原価品群マスタで品群構成区分に対する品群として指定されていません。\n品群構成区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0332' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0332',
	'W',
	'一次配賦基準マスタで一次配賦パタンに対する一次配賦基準として指定されていません。\n一次配賦パタンＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0333' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0333',
	'W',
	'販売品目体系マスタで販売品目体系階層に対する品目体系として指定されていません。\n販売品目体系階層：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0334' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0334',
	'W',
	'物流グループマスタでワーキンググループに対する物流グループとして指定されていない、もしくは物流グループマスタで場所設定にオンが指定されています。\nワーキンググループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0335' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0335',
	'W',
	'計算グループレポートマスタでレポートパタンとレポートキーに対する計算グループとして指定されていません。\n比較パタンＣＤ：{1}\nレポートパタンＣＤ：{2}\nレポートキーＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0336' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0336',
	'W',
	'場所マスタで場所に対する資源１と資源２として指定されていません。\n場所ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0337' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0337',
	'W',
	'業務理由マスタで以下の条件に対する業務理由として指定されていません。\n他勘定入庫：{1}\n他勘定出庫：{2}\n廃棄：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0338' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0338',
	'W',
	'業務理由マスタで以下の条件に対する業務理由として指定されていません。\n仕入：{1}\n経費購買：{2}\n売上返品：{3}\n移送：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0339' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0339',
	'W',
	'業務理由マスタで以下の条件に対する業務理由として指定されていません。\n売上：{1}\n移送：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0340' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0340',
	'W',
	'業務理由マスタで以下の条件に対する業務理由として指定されていません。\n売上：{1}\n売上返品：{2}\n売上調整：{3}\n販売他勘定：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0341' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0341',
	'W',
	'原価レポート比較構成マスタで以下の条件に対する項目として指定されていません。\n比較パタンＣＤ：{1}\n集計列：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0342' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0342',
	'W',
	'一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで比率設定区分に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで計画月次比率にオフが指定されています。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n比率設定区分：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0343' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0343',
	'W',
	'一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで比率設定区分に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで実績月次比率にオフが指定されています。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n比率設定区分：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0344' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0344',
	'W',
	'一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで比率設定区分に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで計画月次比率と実績月次比率のいずれかにオフが指定されています。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n比率設定区分：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0345' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0345',
	'W',
	'一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで比率設定区分に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで計画月次比率と実績月次比率の両方にオフが指定されています。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n比率設定区分：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0346' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0346',
	'W',
	'出荷条件マスタで有効な出荷条件として指定されていない、もしくは物流制御マスタで以下の条件に対する出荷条件として指定されていません。\n出荷元物流グループＣＤ：{1}\n出荷先物流グループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0347' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0347',
	'W',
	'出荷作業マスタで有効な出荷作業として指定されていない、もしくは出荷作業判定マスタで以下の条件に対する出荷作業として指定されていません。\n出荷作業グループＣＤ：{1}\n出荷予定時刻：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0348' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0348',
	'W',
	'取引先マスタで得意先と納品先、発注先がいずれも指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0349' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0349',
	'W',
	'取引先マスタで発注先が指定されていない、もしくは発注先インボイス取引にオンが指定されています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0350' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0350',
	'W',
	'外部システムマスタに外部システム区分が「1.ＥＤＩ」または「6.ＥＤＩ（ＭＣＦ）」として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0351' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0351',
	'W',
	'決済方法マスタに債務決済方法として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0352' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0352',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0353' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0353',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの資産管理部門がオンになっていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0354' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0354',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの債権部門がオンになっていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0355' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0355',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの債務部門がオンになっていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0356' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0356',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの営業部門がオンになっていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0357' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0357',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの購買部門がオンになっていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0358' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0358',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの出荷部門がオンになっていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0359' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0359',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの入荷部門がオンになっていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0360' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0360',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの製造部門がオンになっていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0361' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0361',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの需給部門がオンになっていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0362' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0362',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの検査部門がオンになっていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0363' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0363',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの負担部門がオンになっていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0364' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0364',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの債権部門、または債務部門がオンになっていること\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0365' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0365',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの債権部門がオンになっていること\n・取引先マスタで請求先に対する請求先部門として指定されていません。\n適用日：{1}\n請求先ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0366' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0366',
	'W',
	'指定した部門は不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの営業部門、購買部門、出荷部門、入荷部門、製造部門、検査部門のいずれかがオンになっていること\n・取引先マスタで請求先に対する請求先部門として指定されていません。\n適用日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0367' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0367',
	'W',
	'決済方法マスタに、債権決済区分が相殺（借方）もしくは源泉税の決済方法として指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0368' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0368',
	'W',
	'業務理由マスタで以下の条件に対する売上理由として指定されていません。\n販売他勘定：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0369' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0369',
	'W',
	'業務理由マスタで以下の条件に対する売上返品理由として指定されていません。\n販売他勘定：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0370' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0370',
	'W',
	'総量引当場所グループ及び物流グループがある場所に対する総量引当場所グループ、物流グループとして登録されていません。場所マスタの総量引当場所グループ、物流グループを確認してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0371' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0371',
	'W',
	'ワーキンググループマスタに販売、物流、製造、購買、いずれかの機能を持つワーキンググループとして登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0372' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0372',
	'W',
	'原価部門マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0373' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0373',
	'W',
	'原価部門マスタで期に対する部門配賦グループとして登録されていません。\n期：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0374' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0374',
	'W',
	'計算グループマスタで計算区分に対する計算グループとして指定されていません。\n計算区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0375' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0375',
	'W',
	'場所マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0376' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0376',
	'W',
	'取引先マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0377' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0377',
	'W',
	'原価レポート構成マスタに登録されていません。\nレポートパタンＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0378' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0378',
	'W',
	'ワーキンググループマスタに条件に対するワーキンググループとして指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0379' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0379',
	'W',
	'計算実行パタンに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0380' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0380',
	'W',
	'配賦方法マスタで期に対する投入数量として指定されていません。\n期：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0381' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0381',
	'W',
	'配賦方法マスタで期に対する任意配賦基準値として指定されていません。\n期：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0382' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0382',
	'W',
	'配賦方法マスタで期に対する汎用配賦として指定されていません。\n期：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0383' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0383',
	'W',
	'一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていません。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0384' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0384',
	'W',
	'一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで計画月次比率にオフが指定されています。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0385' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0385',
	'W',
	'一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで実績月次比率にオフが指定されています。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0386' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0386',
	'W',
	'一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで計画月次比率と実績月次比率のいずれかにオフが指定されています。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0387' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0387',
	'W',
	'一次配賦基準カテゴリマスタで計算カテゴリとワーキンググループ、期に対する一次配賦基準として指定されていない、もしくは一次配賦基準マスタで計画月次比率と実績月次比率の両方にオフが指定されています。\n計算カテゴリＣＤ：{1}\nワーキンググループＣＤ：{2}\n期：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0388' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0388',
	'W',
	'原価メニュー構成マスタに未登録のものが、原価メニューマスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0389' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0389',
	'W',
	'原価会計伝票区分仕訳マスタで計算グループに対する会計伝票区分として指定されていません。\n計算グループ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0390' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0390',
	'W',
	'在庫評価マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0391' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0391',
	'W',
	'配賦係数マスタに有効な配賦係数として登録されていない、もしくは配賦係数構成区分に「1.配賦係数構成マスタ」として指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0392' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0392',
	'W',
	'配賦係数マスタに有効な配賦係数として登録されていない、もしくは配賦係数構成区分に「1.配賦係数構成マスタ」以外として指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0393' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0393',
	'W',
	'会計部門マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0394' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0394',
	'W',
	'ワーキンググループマスタに機能を持たないワーキンググループとして指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0395' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0395',
	'W',
	'指定した場所が不正です。以下を確認してください。\n・場所マスタに有効な場所として登録されていること\n・指定したワーキンググループが場所マスタで設定されていること\n・場所マスタの発注先が指定されていること\nワーキンググループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0396' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0396',
	'W',
	'業務理由マスタに投入理由として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0397' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0397',
	'W',
	'取引先マスタで得意先、発注先、請求先、支払予定管理先がいずれも指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0502' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0502',
	'W',
	'指定した計算グループが不正です。計算グループマスタで以下のどちらかの条件に一致しているか確認してください。\n・計算区分に「2.原価計算（在庫対象外）」または「3.原価計算（在庫計算）」が指定されていること\n・計算区分に「4.その他」が指定されている、かつ一次配賦計算区分に「2.計算」が指定されていること\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0501' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0501',
	'W',
	'指定した品目が不正です。以下を確認してください。\n・品目マスタに有効な品目として登録されていること\n・品目マスタの在庫管理区分に「1.在庫管理する」が指定されていること\n・品目マスタの資産管理区分に「1.資産管理する」が指定されていること\n・品目マスタのロット管理区分に「3.同一ロット不許可」、もしくはサブロット管理区分に「3.ロット内同一サブロット不許可」が指定されていること\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0503' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0503',
	'W',
	'倉庫事業者マスタに登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0504' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0504',
	'W',
	'外部システムマスタに外部システム区分が「2.ＳＣＭ」または「7.ＳＣＭ（ＭＤ）」として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0505' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0505',
	'W',
	'物流制御マスタに登録されていません。\n出荷元物流グループＣＤ：{1}\n出荷先物流グループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0506' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0506',
	'W',
	'決済方法が不正です。決済方法マスタで債務決済がオフもしくは債務決済区分に以下が指定されている決済方法は指定できません。\n・「7.源泉税」\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0507' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0507',
	'W',
	'場所マスタに有効な場所として登録されていない、もしくは場所マスタの棚・ライン対象がオンではありません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0508' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0508',
	'W',
	'指定した場所が不正です。以下を確認してください。\n・場所マスタに有効な場所として登録されていること\n・場所マスタで製造もしくは物流のワーキンググループが指定されていること\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0601' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0601',
	'W',
	'買戻義務をオンとした場合は、課税対象の税を支給税に指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUAL0701' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUAL0701',
	'W',
	'外部システムマスタに外部システム区分が「5：会計」または「A：会計（ＳＡＰ）」として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCC0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCC0001',
	'E',
	'予期せぬデータ型がセットされました。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCC0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCC0007',
	'I',
	'{1}：{2}：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0001',
	'W',
	'要求数の合計と割当可能総数の符号が異なっています。\n要求数合計：{1}\n割当可能総数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0002',
	'W',
	'割当比率の合計は0以外の数である必要があります。\n割当比率合計：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0003',
	'T',
	'振り分け処理で残数が発生しました。残数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0004',
	'W',
	'自社情報を取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0005',
	'W',
	'基準通貨情報が取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0006',
	'W',
	'ユーザ情報が取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0007',
	'E',
	'使用するデータベースのServerConfigリソースにネットサービス名が指定されていません。\n本システムではネットサービス名を使用します。\nキー：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0008',
	'W',
	'以下の項目に小数部有効桁数を超えた数値が指定されています。\n項目：{1}\n数値：{2}\n小数部有効桁数：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0009',
	'W',
	'納税通貨情報が取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0010',
	'W',
	'データが見つかりませんでした。\nモジュール：{1}\nテーブル：{2}\nキー：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0011',
	'W',
	'以下の項目に不整合な値が指定されました。\n項目：{1}\n上り電文データ：{2}\nDB上の値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0012',
	'W',
	'品目に使用できない文字が含まれています。\n品目：{1}\n使用できない文字：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0013',
	'W',
	'枝番１に使用できない文字が含まれています。\n枝番１：{1}\n使用できない文字：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0014',
	'W',
	'枝番２に使用できない文字が含まれています。\n枝番２：{1}\n使用できない文字：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0015',
	'W',
	'品目ＣＤのＮ番目のデリミタが未設定にも関わらず、枝番Ｎ以降に値が設定されています。\n枝番１：{1}\n枝番２：{2}\n枝番３：{3}\nＮ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0016',
	'D',
	'基準単位への換算処理をスキップします。\n数量：{1}\n単位換算数：{2}\n小数部有効桁数：{3}\n単位換算端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0017',
	'D',
	'単位換算処理をスキップします。\n基準単位数量：{1}\n単位換算数：{2}\n小数部有効桁数：{3}\n単位換算端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0018',
	'D',
	'単位換算処理をスキップします。\n数量：{1}\n変換元単位の単位換算数：{2}\n変換先単位の単位換算数：{2}\n小数部有効桁数：{3}\n単位換算端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0019',
	'D',
	'有効成分単位への換算処理をスキップします。\n基準単位数量：{1}\n有効成分係数：{2}\n有効成分小数部有効桁数：{3}\n有効成分単位換算端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0020',
	'D',
	'有効成分単位から基準単位への換算処理をスキップします。\n有効成分：{1}\n有効成分係数：{2}\n基準単位小数部有効桁数：{3}\n基準単位換算端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0021',
	'D',
	'有効成分係数の計算処理をスキップします。\n基準単位数量：{1}\n有効成分：{2}\n有効成分小数部有効桁数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0022',
	'D',
	'キャッシュの上限値を超えたのでキャッシュを破棄します。\nキャッシュ上限値：{1}\n破棄したキー：{2}\n破棄後のサイズ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0023',
	'T',
	'キャッシュがありません。\nキー値：{1}\nキャッシュクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0024',
	'T',
	'キャッシュを使いました。\nキー値：{1}\nキャッシュクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0025',
	'W',
	'原価会社パラメータ情報を取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0026',
	'E',
	'案分対象のリストが存在しないか0件です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0027',
	'E',
	'案分対象のリストの、割当比率が格納されている列のデータがありません。\n割当比率が格納されている列名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0028',
	'W',
	'経営会社パラメータ情報を取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0029',
	'W',
	'登録対象の行は、開始年月終了年月が重複するレコードが既に存在します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0030',
	'W',
	'登録済データ間で期間重複があります。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0031',
	'W',
	'登録対象データ間で期間重複があります。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0032',
	'W',
	'登録対象データと登録済データ間で期間重複があります。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0033',
	'D',
	'金額計算処理をスキップします。\n単価：{1}\n数量：{2}\n小数部有効桁数：{3}\n金額端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0034',
	'D',
	'単価計算処理をスキップします。\n金額：{1}\n数量：{2}\n単価小数部有効桁数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0035',
	'D',
	'税金額計算処理をスキップします。\n金額：{1}\n税率：{2}\n金額小数部有効桁数：{3}\n税額端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0036',
	'W',
	'新規追加行は、既に登録されています。\nモジュール：{1}\nテーブル：{2}\nキー：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0037',
	'W',
	'原価会社パラメータ情報を取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0039',
	'W',
	'品目ＣＤが不正です。\n品目ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0040',
	'W',
	'品番を {1} にすることはできません。\n品目ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0041',
	'W',
	'枝番１を {1} にすることはできません。\n品目ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0042',
	'W',
	'枝番２を {1} にすることはできません。\n品目ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0043',
	'W',
	'枝番３を {1} にすることはできません。\n品目ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0044',
	'W',
	'品番が設定可能な文字数を超えています。\n品目ＣＤ：{1}\n品番：{2}\n品番の文字数：{3}\n設定可能な最大の文字数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0045',
	'W',
	'枝番１が設定可能な文字数を超えています。\n品目ＣＤ：{1}\n枝番１：{2}\n枝番１の文字数：{3}\n設定可能な最大の文字数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0046',
	'W',
	'枝番２が設定可能な文字数を超えています。\n品目ＣＤ：{1}\n枝番２：{2}\n枝番２の文字数：{3}\n設定可能な最大の文字数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0047',
	'W',
	'枝番３が設定可能な文字数を超えています。\n品目ＣＤ：{1}\n枝番３：{2}\n枝番３の文字数：{3}\n設定可能な最大の文字数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0048',
	'W',
	'品目ＣＤが設定可能な文字数を超えています。\n品目ＣＤ：{1}\n品目ＣＤの文字数：{2}\n設定可能な最大の文字数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0049',
	'W',
	'品目ＣＤに品番の終端を示す文字が含まれていません。\n品目ＣＤ：{1}\n品番の終端を示す文字：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0050',
	'W',
	'品目ＣＤに枝番１の終端を示す文字が含まれていません。\n品目ＣＤ：{1}\n枝番１の終端を示す文字：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0051',
	'W',
	'品目ＣＤに枝番２の終端を示す文字が含まれていません。\n品目ＣＤ：{1}\n枝番２の終端を示す文字：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0053',
	'W',
	'品番が未設定です。\n品目ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0054',
	'W',
	'枝番２が設定されている場合は枝番１の設定は必須です。\n品目ＣＤ：{1}\n枝番２：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0055',
	'W',
	'枝番３が設定されている場合は枝番２の設定は必須です。\n品目ＣＤ：{1}\n枝番３：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0056',
	'W',
	'実行中の処理があるためデータアクセス制御情報を更新できません。\n処理が終了するまで待つか、ログアウトしてから再度ログインしてください。\nログインシーケンス：{1}\nサーバリクエストＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0057',
	'W',
	'振り分け処理で残数が発生しました。残数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0058',
	'W',
	'担当者権限マスタから担当者の主部門が取得できませんでした。\n担当者ＣＤ：{1}\nマスタ適用日：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0059',
	'W',
	'更新権限がありません。\n部門ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0060',
	'W',
	'更新権限がありません。\n物流グループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0061',
	'W',
	'更新権限がありません。\n場所ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0062',
	'W',
	'更新権限がありません。\nワーキンググループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0063',
	'W',
	'更新権限がありません。\n総量引当場所グループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0106',
	'W',
	'システムパラメータ情報を取得できませんでした。システムパラメータマスタを確認してください。\nパラメータキー：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0107',
	'E',
	'チェック対象の部門が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0108',
	'E',
	'チェック対象の物流グループが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0109',
	'E',
	'チェック対象の場所が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0110',
	'E',
	'チェック対象のワーキンググループが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0111',
	'D',
	'通貨換算処理をスキップします。\n単価または金額：{1}\n為替レート：{2}\n小数部有効桁数：{3}\n為替端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0112',
	'W',
	'指定されたロケール・コードはロケールエントリに存在しません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0113',
	'E',
	'チェック対象の総量引当場所グループが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0114',
	'I',
	'バッチ処理が開始しました。\n処理グループ名：{1}\nログＮＯ：{2}\nロジック名：{3}\nオペレーション名：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0115',
	'I',
	'バッチ処理が終了しました。\n処理グループ名：{1}\nログＮＯ：{2}\nロジック名：{3}\nオペレーション名：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0116',
	'W',
	'バッチ処理でエラーが発生しました。\n処理グループ名：{1}\nログＮＯ：{2}\nロジック名：{3}\nオペレーション名：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0117',
	'W',
	'原価管理がインストールされていないため、配賦情報の更新ができませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0118',
	'W',
	'指定された日付において有効な部門として登録されていません。\n部門：{1}\n日付：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0119',
	'W',
	'ＩＦ処理区分もしくは実行会社ＣＤが設定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0120',
	'W',
	'実行会社ＣＤが一致しないため、更新ができません。\nＩＦ処理区分：{1}\n会社ＣＤ：{2}\n実行会社ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCL0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCL0121',
	'W',
	'BI Linkバッチ制御の更新に失敗しました。\nＩＦ処理区分：{1}\n会社ＣＤ：{2}\n実行会社ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0001',
	'W',
	'指定された期の情報がみつかりません。\n指定された期：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0022',
	'W',
	'値の設定に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0023',
	'W',
	'入力値チェックの上限を上回りました。\n入力値（{1}）：{2}\n上限（{3}*{4}）：{5}\n{6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0024',
	'W',
	'入力値チェックの下限を下回りました。\n入力値（{1}）：{2}\n下限（{3}*{4}）：{5}\n{6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0025',
	'I',
	'{1}：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0031',
	'W',
	'品目に使用できない文字が含まれています。\n品目：{1}\n使用できない文字：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0032',
	'W',
	'枝番１に使用できない文字が含まれています。\n枝番１：{1}\n使用できない文字：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0033',
	'W',
	'枝番２に使用できない文字が含まれています。\n枝番２：{1}\n使用できない文字：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0034',
	'W',
	'品目ＣＤのＮ番目のデリミタが未設定にも関わらず、枝番Ｎ以降に値が設定されています。\n枝番１：{1}\n枝番２：{2}\n枝番３：{3}\nＮ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0035',
	'D',
	'基準単位への換算処理をスキップします。\n数量：{1}\n単位換算数：{2}\n小数部有効桁数：{3}\n単位換算端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0036',
	'D',
	'単位換算処理をスキップします。\n基準単位数量：{1}\n単位換算数：{2}\n小数部有効桁数：{3}\n単位換算端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0037',
	'D',
	'単位換算処理をスキップします。\n数量：{1}\n変換元単位の単位換算数：{2}\n変換先単位の単位換算数：{2}\n小数部有効桁数：{3}\n単位換算端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0038',
	'D',
	'有効成分単位への換算処理をスキップします。\n基準単位数量：{1}\n有効成分係数：{2}\n有効成分小数部有効桁数：{3}\n有効成分単位換算端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0039',
	'D',
	'有効成分単位から基準単位への換算処理をスキップします。\n有効成分：{1}\n有効成分係数：{2}\n基準単位小数部有効桁数：{3}\n基準単位換算端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0040',
	'D',
	'有効成分係数の計算処理をスキップします。\n基準単位数量：{1}\n有効成分：{2}\n有効成分小数部有効桁数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0041',
	'D',
	'通貨換算処理をスキップします。\n単価または金額：{1}\n為替レート：{2}\n小数部有効桁数：{3}\n為替端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0047',
	'D',
	'金額計算処理をスキップします。\n単価：{1}\n数量：{2}\n小数部有効桁数：{3}\n金額端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0048',
	'D',
	'単価計算処理をスキップします。\n金額：{1}\n数量：{2}\n単価小数部有効桁数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0049',
	'D',
	'税金額計算処理をスキップします。\n金額：{1}\n税率：{2}\n金額小数部有効桁数：{3}\n税額端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0050',
	'D',
	'基準通貨金額計算処理をスキップします。\n金額：{1}\n為替レート：{2}\n小数部有効桁数：{3}\n端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0051',
	'D',
	'基準通貨単価計算処理をスキップします。\n単価：{1}\n為替レート：{2}\n小数部有効桁数：{3}\n端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0052',
	'D',
	'基準通貨税金額計算処理をスキップします。\n税金額：{1}\n為替レート：{2}\n小数部有効桁数：{3}\n端数処理区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0053',
	'W',
	'指定された開始年月の期情報がみつかりません。\n指定された期開始年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0056',
	'E',
	'案分対象のリストが存在しないか0件です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0057',
	'E',
	'案分対象のリストの、割当比率が格納されている列のデータがありません。\n割当比率が格納されている列名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0062',
	'W',
	'開始年月終了年月に重複期間があります。\n行：{1}\n行：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0063',
	'W',
	'開始年月終了年月に重複期間があったため、自動調整しました。\n行：{1}\n行：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0064',
	'W',
	'開始年月終了年月に重複期間があります。開始年月が同じため自動調整できませんでした。\n行：{1}\n行：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0067',
	'W',
	'振り分け処理で残数が発生しました。残数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0068',
	'W',
	'担当者権限マスタからログインユーザの主部門が取得できませんでした。\nマスタ適用日：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0069',
	'W',
	'合計値が入力値チェックの上限を上回りました。\n入力値（{1}）：{2}\n登録済実績値（{3}）：{4}\n合計値（入力値＋登録済実績値）：{5}\n上限（{6}*{7}）：{8}\n{9}\n{10}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0070',
	'W',
	'合計値が入力値チェックの下限を下回りました。\n入力値（{1}）：{2}\n登録済実績値（{3}）：{4}\n合計値（入力値＋登録済実績値）：{5}\n下限（{6}*{7}）：{8}\n{9}\n{10}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0307' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0307',
	'W',
	'年は{1}から{2}の範囲で指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0331' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0331',
	'W',
	'開始日終了日に重複期間があります。\n行：{1}\n行：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0332' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0332',
	'W',
	'開始日終了日に重複期間があったため、自動調整しました。\n行：{1}\n行：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCP0333' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCP0333',
	'W',
	'開始日終了日に重複期間があります。開始日が同じため自動調整できませんでした。\n行：{1}\n行：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0001',
	'W',
	'定数が数値に変換できません。\n定数名：{1}\n設定値：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0002',
	'W',
	'既に使用されているオブジェクト名です。\n設定値：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0003',
	'W',
	'定数にしている文字列が指定された数値の精度を超えています。定数名：{1}  設定値：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0004',
	'T',
	'引数のシーケンス区分を変更します。\n旧：{1}\n新：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0005',
	'W',
	'発番情報テーブルのロックに失敗しました。(エラーコード：{1})\n発番業務区分：{2}\n発番パタンＣＤ：{3}\n要素区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0006',
	'W',
	'発番ロジックでシーケンスの発番に失敗しました。(エラーコード：{1})\n発番業務区分：{2}\n発番パタン：{3}\n要素区分：{4}\nシーケンス名：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0007',
	'W',
	'発番情報テーブルで自動セット不許可のカウンタが最大値を超えました。\n発番業務区分：{1}\n発番パタン：{2}\n要素区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0008',
	'W',
	'場所マスタが登録されていません。\n場所：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0009',
	'W',
	'発番情報テーブルの排他処理エラーが発生しました。\n発番業務区分：{1}\n発番パタンＣＤ：{2}\n要素区分：{3}\nシーケンス区分(前)：{4}\nシーケンス区分(今)：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0010',
	'W',
	'要素区分に予期せぬ値がセットされました。\n発番業務区分：{1}\n発番パタン：{2}\n要素区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0011',
	'W',
	'発番パタンマスタが見つかりません。\n発番業務区分：{1}\n発番パタン：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0012',
	'W',
	'シーケンス区分に予期せぬ値がセットされました。\n発番業務区分：{1}\n発番パタン：{2}\n要素区分：{3}\nシーケンス区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0013',
	'W',
	'発番結果が非表示項目用文字列の桁数を超えました。\n発番業務区分：{1}\n発番パタンＣＤ：{2}\nカラム名：{3}\n結合文字列１：{4}\n結合文字列２：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0014',
	'W',
	'発番情報テーブルの設定値が不正です（最小値が最大値より大きい）。\n発番業務区分：{1}\n発番パタンＣＤ：{2}\n要素区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0015',
	'W',
	'シーケンス発番処理に失敗しました(エラーコード：{1})。\nシーケンス名： {2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0016',
	'W',
	'会社マスタが登録されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0017',
	'W',
	'シーケンスの作成に失敗しました。\n発番処理用定数のデフォルトの最小値は最大値より小さい必要があります。\n最小値のデフォルト：{1}\n最大値のデフォルト：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0018',
	'W',
	'端数処理区分が不正なため、端数処理に失敗しました。\n端数処理区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0019',
	'W',
	'格付マスタから有効な格付が1件も取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0020',
	'W',
	'取引パタン区分に対して取引マスタから自動時採用が設定されている取引が取得できませんでした。\n取引パタン区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0021',
	'W',
	'業務理由マスタから固定ロスが設定されている業務理由を取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0022',
	'W',
	'発番結果が表示用文字列の桁数を超えました。\n発番業務区分：{1}\n発番パタンＣＤ：{2}\nカラム名：{3}\n結合文字列１：{4}\n結合文字列２：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0023',
	'W',
	'通貨マスタが取得できませんでした。\n通貨ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0024',
	'W',
	'為替レートマスタが取得できませんでした。\n換算元通貨ＣＤ：{1}\n換算先通貨ＣＤ：{2}\n為替レートＣＤ：{3}\n基準日：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0025',
	'W',
	'為替レート換算の結果、桁あふれが発生しました。入力値やマスタの設定を確認してください。\n金額：{1}\n為替レート：{2}\n換算結果：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0026',
	'W',
	'ロットＮＯが未指定のため、発番できません。\n発番業務区分：{1}\n発番パタンＣＤ：{2}\n要素区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0027',
	'W',
	'手配ＮＯ１が未指定のため、発番できません。\n発番業務区分：{1}\n発番パタンＣＤ：{2}\n要素区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0028',
	'W',
	'手配ＮＯ２が未指定のため、発番できません。\n発番業務区分：{1}\n発番パタンＣＤ：{2}\n要素区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0029',
	'W',
	'手配ＮＯ３が未指定のため、発番できません。\n発番業務区分：{1}\n発番パタンＣＤ：{2}\n要素区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0030',
	'W',
	'手配ＮＯ４が未指定のため、発番できません。\n発番業務区分：{1}\n発番パタンＣＤ：{2}\n要素区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0031',
	'W',
	'発番パタンが未指定のため、発番できません。\n発番業務区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0032',
	'W',
	'発番要素となる項目に値が指定されていないため、発番できません。\n項目：{1}\n発番業務区分：{2}\n発番パタンＣＤ：{3}\n要素区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0033',
	'W',
	'品目マスタ（工場・物流倉庫）に対象レコードが存在しないため、発番できません。\n発番業務区分：{1}\n発番パタンＣＤ：{2}\n要素区分：{3}\n品目：{4}\n工場・物流倉庫ＣＤ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0034',
	'W',
	'品目マスタに対象レコードが存在しないため、発番できません。\n発番業務区分：{1}\n発番パタンＣＤ：{2}\n要素区分：{3}\n品目：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUCD0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUCD0035',
	'W',
	'取引先マスタに対象レコードが存在しないため、発番できません。\n発番業務区分：{1}\n発番パタンＣＤ：{2}\n要素区分：{3}\n取引先ＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDD0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDD0001',
	'E',
	'MAM_ITM_UNITは使用できません。MAVM_ITM_UNITを使用してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDD0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDD0002',
	'E',
	'MAM_ITM_WGは使用できません。MAVM_ITM_WGを使用してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDD0311' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDD0311',
	'W',
	'発番パタンマスタが見つかりません。\n発番業務区分：{1}\n発番パタン：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0001',
	'I',
	'{1}：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0002',
	'I',
	'行番号：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0003',
	'W',
	'次のデータは既に存在します。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0004',
	'W',
	'更新できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0005',
	'W',
	'取り消しできませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0006',
	'W',
	'削除できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0007',
	'W',
	'ヘッダに紐づく明細が1行も存在しません。\nヘッダに紐づく明細を1行以上登録対象にしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0008',
	'I',
	'今回のバッチ処理で対象となるデータが1件も存在しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0009',
	'W',
	'エラーが発生しています。バッチログ確認で内容を確認してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0010',
	'W',
	'処理中にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0011',
	'W',
	'発行できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0012',
	'W',
	'明細に紐づく詳細が1行も存在しません。\n明細に紐づく詳細を1行以上登録対象にしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0013',
	'W',
	'関連する行でエラーになりました。\nエラー行：{1}\n関連する行：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0021',
	'E',
	'発番の引数が不正です。\n発番業務区分：{1}\n引数の情報：\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0029',
	'W',
	'印刷対象のデータがありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0324' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0324',
	'W',
	'登録対象の行は、開始日終了日が重複するレコードが既に存在します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0379' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0379',
	'W',
	'登録済データ間で期間重複があります。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0380' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0380',
	'W',
	'登録対象データ間で期間重複があります。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0381' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0381',
	'W',
	'登録対象データと登録済データ間で期間重複があります。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0382' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0382',
	'W',
	'登録対象データと登録済データ間で期間重複（同一期間）があります。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0401' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0401',
	'E',
	'ファイル出力対象のMCListが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0402' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0402',
	'W',
	'ダウンロードする権限がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0403' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0403',
	'E',
	'非対応のファイル形式で出力先が指定されています。\n出力先：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0404' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0404',
	'W',
	'ファイルの列数の上限を超えたデータが出力対象となっています。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0405' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0405',
	'W',
	'上限より多いデータが検索されました。一部を取得します。\n上限件数：{1}\n検索件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0406' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0406',
	'I',
	'処理を開始しました。\nロジックＩＤ：{1}\nオペレーションＩＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0407' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0407',
	'I',
	'処理が終了しました。\nロジックＩＤ：{1}\nオペレーションＩＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0408' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0408',
	'W',
	'エラー件数が上限を超えたので、チェック処理を中断しました。\n上限件数：{1}\nエラー件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0409' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0409',
	'I',
	'{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0410' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0410',
	'W',
	'エラーが多数発生しました。バッチログ確認画面でエラー内容を確認してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0411' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0411',
	'W',
	'指定した会社ＣＤに対する権限がありません。\n会社ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0412' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0412',
	'W',
	'指定した外部システムＣＤは存在しません。\n外部システムＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0413' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0413',
	'W',
	'指定した外部システムＣＤの外部システム区分が不正です。\n外部システムＣＤ：{1}\n外部システム区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0414' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0414',
	'W',
	'バッチは現在実行中のため、実行することができません。\nＩＦ処理区分：{1}\n会社ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDL0415' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDL0415',
	'W',
	'ＤＢコンテナを作成できません。\nクラス：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0001',
	'I',
	'処理（{1}）を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0002',
	'I',
	'処理（{1}）が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0003',
	'W',
	'処理（{1}）に失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0004',
	'W',
	'ファイルにアクセスできませんでした。\nファイルが存在しません。\nファイル名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0005',
	'I',
	'更新前のチェック処理が終了しました。更新処理を実行してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0006',
	'W',
	'更新前のチェックができませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0007',
	'W',
	'過去リビジョンのデータを変更することはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0008',
	'E',
	'入力補助画面を起動できない検索区分が指定されました。\n検索区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0009',
	'W',
	'取消データを変更することはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0010',
	'W',
	'登録対象が共通の場合は、以下の項目を指定できません。\n項目：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0012',
	'W',
	'登録できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0013',
	'W',
	'次のデータは既に存在します。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0014',
	'W',
	'次のデータは「{1}」で使用されています。\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0038',
	'W',
	'対象のデータを選択してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0039',
	'E',
	'型変換エラー。\n引数は、getCheckedRowListBlock()で指定したリストのRowクラス\nの代入互換できるクラスを指定する必要があります。\ngetCheckedRowListBlock()で指定したリストのRowクラス：{1}\n引数で指定されたクラス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0068',
	'D',
	'checkInvisibleRowInUpParamを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0069',
	'D',
	'checkInvisibleRowInUpParamを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0087',
	'W',
	'会社が取得できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0092' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0092',
	'W',
	'次のデータが「{1}」に存在しません。マスタが変更、または削除されています。\n値：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0093' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0093',
	'I',
	'以下のメッセージがあります。処理を続行しますか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0094' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0094',
	'W',
	'更新権限がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0095' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0095',
	'W',
	'更新権限がありません。\n行：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0098',
	'I',
	'取消処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0099',
	'I',
	'取り消しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0100',
	'W',
	'取消できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0106',
	'D',
	'clearを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0107',
	'D',
	'clearを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0108',
	'D',
	'beforeCallPartsを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0109',
	'D',
	'beforeCallPartsを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0110',
	'D',
	'setupParamを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0111',
	'D',
	'setupParamを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0112',
	'D',
	'beforeCallを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0113',
	'D',
	'beforeCallを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0114',
	'D',
	'setLimitParamSizeを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0115',
	'D',
	'setLimitParamSizeを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0118',
	'D',
	'callを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0119',
	'D',
	'callを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0120',
	'D',
	'handleMCExを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0121',
	'D',
	'setModeNoDownを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0122',
	'D',
	'setModeNoDownを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0123',
	'D',
	'moveFocusNoDownを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0124',
	'D',
	'moveFocusNoDownを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0125',
	'D',
	'afterCapErrorを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0126',
	'D',
	'afterCapErrorを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0127',
	'D',
	'afterCallを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0128' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0128',
	'D',
	'afterCallを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0129' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0129',
	'D',
	'showを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0130' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0130',
	'D',
	'showを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0131',
	'D',
	'adjustListを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0132',
	'D',
	'adjustListを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0133',
	'D',
	'setModeを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0134' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0134',
	'D',
	'setModeを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0135' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0135',
	'D',
	'moveFocusを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0136' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0136',
	'D',
	'moveFocusを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0137' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0137',
	'D',
	'showMsgを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0138' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0138',
	'D',
	'showMsgを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0139' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0139',
	'D',
	'printを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0140' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0140',
	'D',
	'printを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0141' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0141',
	'D',
	'resultSuccessを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0142' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0142',
	'D',
	'resultSuccessを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0143' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0143',
	'D',
	'setModeNoDownを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0144' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0144',
	'D',
	'setModeNoDownを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0145' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0145',
	'D',
	'moveFocusNoDownを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0146' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0146',
	'D',
	'moveFocusNoDownを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0147' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0147',
	'D',
	'showNoDownDataMsgを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0148' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0148',
	'D',
	'showNoDownDataMsgを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0149' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0149',
	'D',
	'resultNoDataFoundを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0150' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0150',
	'D',
	'resultNoDataFoundを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0155' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0155',
	'D',
	'afterCallPartsを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0156' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0156',
	'D',
	'afterCallPartsを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0157' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0157',
	'D',
	'sortを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0158' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0158',
	'D',
	'sortを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0159' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0159',
	'D',
	'showMergeを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0160' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0160',
	'D',
	'showMergeを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0161' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0161',
	'W',
	'0以外の数字を指定してください。\n項目：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0162' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0162',
	'W',
	'0以外の数字を指定してください。\n列：{1}\n行：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0164' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0164',
	'D',
	'showCanceledMsgを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0165' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0165',
	'D',
	'showCanceledMsgを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0166' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0166',
	'D',
	'checkLimitULSizeを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0167' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0167',
	'D',
	'checkLimitULSizeを終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0168' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0168',
	'I',
	'承認処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0169' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0169',
	'I',
	'承認処理を実行しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0170' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0170',
	'I',
	'承認取消処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0171' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0171',
	'I',
	'承認取消処理を実行しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0172' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0172',
	'I',
	'判定処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0173' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0173',
	'I',
	'判定処理を実行しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0174' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0174',
	'I',
	'判定取消処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0175' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0175',
	'I',
	'判定取消処理を実行しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0176' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0176',
	'I',
	'却下取消処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0177' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0177',
	'I',
	'却下取消処理を実行しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0311' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0311',
	'W',
	'終了年度には開始年度より小さな年度を指定することはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0321' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0321',
	'W',
	'年は{1}から{2}の範囲で指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0372' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0372',
	'W',
	'同一期間のレコードが登録済みのため補正できませんでした。\n検索して確認してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0373' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0373',
	'W',
	'この登録対象行と適用期間が重複するため、登録済みの行の適用期間を補正しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0374' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0374',
	'W',
	'登録済みの行どうしで期間が重複するレコードがありました。\n適用期間を補正してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0375' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0375',
	'I',
	'重複期間を補正する対象のデータはありませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0376' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0376',
	'I',
	'重複期間を補正しますか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0377' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0377',
	'I',
	'重複期間の補正を実行しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0401' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0401',
	'I',
	'ダウンロードを実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0402' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0402',
	'I',
	'バックグラウンドでダウンロードを実行しています。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0403' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0403',
	'I',
	'待機中のダウンロードをキャンセルして処理を継続しますか？\n対象：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0404' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0404',
	'I',
	'ダウンロードが終了しました。\n対象：{1}\n出力先：{2}\nファイル名：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0405' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0405',
	'W',
	'指定された出力先ディレクトリは不正なパスです。\nディレクトリ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0406' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0406',
	'I',
	'上限より多いデータが検索されました。画面には一部を表示します。\n全データをファイルで取得しますか？\n上限件数：{1}\n検索件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0407' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0407',
	'I',
	'上限より多いデータが検索されました。画面には一部を表示します。\n上限件数：{1}\n検索件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0408' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0408',
	'W',
	'ダウンロードに失敗しました。\n指定したファイルが開かれている場合はファイルを閉じてからダウンロードしてください。\n指定ファイル：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0409' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0409',
	'I',
	'行番号：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0410' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0410',
	'W',
	'日付の範囲は{1}日以内になるように指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MAUDP0411' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MAUDP0411',
	'W',
	'年月の範囲は{1}ヶ月以内になるように指定してください。');
