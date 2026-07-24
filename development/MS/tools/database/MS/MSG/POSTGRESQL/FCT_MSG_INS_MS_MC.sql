DELETE FROM FCT_MSG WHERE MSGID = 'MSBAP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAP0001',
	'I',
	'画面に存在しない行は取込みません。\nファイル行：{1}\n品目：{2}\n場所：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0001',
	'W',
	'同一ワーキンググループの依頼は登録できません。\n依頼元ワーキンググループＣＤ：{1}\n依頼先ワーキンググループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0002',
	'W',
	'発注先が指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0003',
	'W',
	'依頼先場所が指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0004',
	'I',
	'需要情報作成バッチを開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0005',
	'I',
	'需要情報作成バッチが終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0006',
	'W',
	'需要情報分割マスタもしくは受注引当マスタに登録されていません。\n品目：{1}\n品目出荷グループＣＤ：{2}\n物流グループＣＤ：{3}\nワーキンググループＣＤ：{4}\n部門ＣＤ：{5}\n適用日：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0007',
	'I',
	'ＷＧ間依頼が登録されました。\n依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0008',
	'I',
	'ＷＧ間依頼が訂正されました。\n依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0009',
	'I',
	'ＷＧ間依頼が削除されました。\n依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0010',
	'I',
	'ＷＧ間依頼に対する回答が登録されました。\n依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0011',
	'I',
	'ＷＧ間依頼に対する回答が削除されました。\n依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0012',
	'I',
	'ＷＧ間依頼に対する予定が指図登録されました。\n依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0013',
	'I',
	'ＷＧ間依頼に対する予定が実績登録されました。\n依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0014',
	'I',
	'ＷＧ間依頼に対する予定の指図が取り消されました。\n依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0015',
	'I',
	'ＷＧ間依頼に対する予定の実績が取り消されました。\n依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0016',
	'I',
	'ＷＧ間依頼に対する回答数量が不足しています。\n依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0017',
	'I',
	'ＷＧ間依頼に対する回答納期が遅れています。\n依頼元ＷＧ：{1}　{2}、依頼先ＷＧ：{3}　{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0018',
	'W',
	'品目詳細マスタに登録されていません。\n品目：{1}\n構成パタン：{2}\n製造場所ＣＤ：{3}\n発注先ＣＤ：{4}\n依頼先場所ＣＤ：{5}\nマスタ適用日：{6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0019',
	'W',
	'受注登録にて作成されたＷＧ間依頼は更新できません。\nＷＧ間依頼ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0020',
	'W',
	'取り消し済のＷＧ間依頼は更新できません。\nＷＧ間依頼ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0021',
	'W',
	'需要情報一覧登録にて登録したその他需要以外、更新できません。\n需要ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0022',
	'W',
	'仕入直送に対する購買依頼の場合、1件で依頼数量分のみ確定可能です。\nＷＧ間依頼ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0023',
	'W',
	'品目詳細マスタがないため、発注先または依頼先場所を特定できません。\n品目：{1}\nワーキンググループＣＤ：{2}\nマスタ適用日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0024',
	'W',
	'出荷依頼のＷＧ間依頼はＷＧ間依頼登録では登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0025',
	'W',
	'取引が経費購買の場合、資産管理する品目を登録できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0026',
	'W',
	'資産管理する品目は経費購買の理由を設定できません。\n品目：{1}\n理由ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0027',
	'W',
	'資産管理しない品目は経費購買の理由を設定してください。\n品目：{1}\n理由ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0028',
	'W',
	'負担発注ＮＯに対応する発注情報が見つかりません。\n負担発注ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0029',
	'W',
	'負担受注ＮＯに対応する受注情報が見つかりません。\n負担受注ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0030',
	'W',
	'負担インボイスＮＯに対応するインボイス情報あるいは受領インボイス情報が見つかりません。\n負担インボイスＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0031',
	'W',
	'依頼先ワーキンググループが依頼時と異なる回答は登録できません。\n依頼先ワーキンググループＣＤ(依頼)：{1}\n依頼先ワーキンググループＣＤ(回答)：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0032',
	'I',
	'後続業務が進行しています。必要に応じ依頼先と調整してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0033',
	'W',
	'購買依頼に対する回答は、製造場所を指定なしから指定あり、指定ありから指定なしに変更できません。\n変更する場合は登録済の行を削除し、新規行を追加してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0034',
	'I',
	'対象日で需要元部門が無効です。\n需要情報の作成対象外です。\n対象日：{1}\n需要元部門ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0035',
	'W',
	'入庫ワーキンググループと依頼先ワーキンググループが同一となる移送依頼は登録できません。\n入庫ワーキンググループＣＤ：{1}\n依頼先ワーキンググループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0036',
	'W',
	'供給計画に紐づく品目オーダが確定されている場合、供給計画は更新できません。\n日次供給ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0100',
	'I',
	'発注予定日が運用日付よりも過去日となっています。\n品目：{1}\n発注先ＣＤ：{2}\nメーカＣＤ：{3}\n発注予定日：{4}\n運用日付：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0101',
	'W',
	'入庫依頼日時から計算した発注予定日を適用期間にもつ品目詳細マスタが登録されていません。\n品目：{1}\n入庫ワーキンググループＣＤ：{2}\n発注先ＣＤ：{3}\nメーカＣＤ：{4}\n製造場所ＣＤ：{5}\n構成パタン：{6}\n入庫依頼日時：{7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0102',
	'W',
	'回答入庫日時から計算した発注予定日を適用期間にもつ品目詳細マスタが登録されていません。\n品目：{1}\n入庫ワーキンググループＣＤ：{2}\n発注先ＣＤ：{3}\nメーカＣＤ：{4}\n製造場所ＣＤ：{5}\n構成パタン：{6}\n回答入庫日時：{7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBAL0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBAL0103',
	'W',
	'入庫依頼日時から計算した出庫依頼日を適用期間にもつ品目詳細マスタが登録されていません。\n品目：{1}\n入庫ワーキンググループＣＤ：{2}\n依頼先場所ＣＤ：{3}\n入庫依頼日時：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0001',
	'I',
	'仕様を選択していませんが、登録処理を実行してよろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0002',
	'W',
	'期間は24ヵ月以内になるように指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0003',
	'I',
	'数量金額計算処理を実行します。よろしいですか？\n入力対象の数量（金額）から金額（数量）が計算されます。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0004',
	'I',
	'集計処理を実行します。よろしいですか？\n入力担当者の数量（金額）を集計して計画数量（計画金額）が計算されます。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0005',
	'I',
	'内訳再展開処理を実行します。よろしいですか？\n合計数量（合計金額）から入力対象の数量（金額）が計算されます。\n入力対象外の金額（数量）は数量金額計算処理で計算されます。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0006',
	'I',
	'有効期限を過ぎていますがよろしいですか？\n有効期限：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0007',
	'W',
	'見積経由の実績は参照登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0008',
	'W',
	'受注経由の実績は参照登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0009',
	'W',
	'納品書経由の実績は参照登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0010',
	'W',
	'単価再取得対象がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0011',
	'I',
	'単価再取得処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0012',
	'I',
	'単価が変更されました。\n変更前単価：{1} \n変更後単価：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0013',
	'W',
	'売上表示期間は1ヶ月以上、{1}ヶ月以内で指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0014',
	'W',
	'指定した案件は取消済のため、訂正できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0015',
	'W',
	'画面に存在しない行は取込みできません。\nファイル行：{1}\n部門ＣＤ：{2}\n得意先ＣＤ：{3}\n案件ＮＯ：{4}\n計画品目ＣＤ：{5}\n品目：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0016',
	'W',
	'指定した販売年月の計画数量・計画金額は入力できません。\nファイル行：{1}\n項目：{2}\n販売年月：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0017',
	'W',
	'小数部有効桁数を超えた数値が指定されています。\nファイル行：{1}\n項目：{2}\n数値：{3}\n小数部有効桁数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0018',
	'I',
	'参考情報取得処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0019',
	'I',
	'単価取得処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0020',
	'I',
	'単価取得処理を実行しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0021',
	'I',
	'為替レート取得処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0022',
	'I',
	'為替レート取得処理を実行しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0023',
	'W',
	'基準通貨以外の行が選択されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0024',
	'I',
	'税取得処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0025',
	'I',
	'税取得処理を実行しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0026',
	'W',
	'入荷済の明細があるため、取り消せません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0027',
	'W',
	'取消データは取り消せません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0028',
	'W',
	'確定がオフの明細が存在します。確定がオフの明細は採用の対象となりませんがよろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0101',
	'W',
	'インボイス経由の実績は参照登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0102',
	'W',
	'船積港、船卸港、経由地には異なる値を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0103',
	'W',
	'検索モードに「ヘッダ」を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0104',
	'W',
	'操作種別に「実績を参照する」、検索モードに「ヘッダ」を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0105',
	'W',
	'操作種別に「参照する」、検索モードに「ヘッダ」を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBP0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBP0106',
	'W',
	'インボイス取引対象の売上実績を訂正・取消する場合は、インボイスＮＯで検索してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0001',
	'W',
	'指定した手配ＮＯは別の案件ＮＯに紐付いています。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0002',
	'W',
	'自動発番しない場合は、手配ＮＯ１を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0003',
	'W',
	'諸口の得意先では、得意先名を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0004',
	'W',
	'この品目は既に登録済みです。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0005',
	'W',
	'この品目はリリース済みのため新規や変更、改訂での登録はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0006',
	'W',
	'この品目は見積または、受注で使用されているため、変更、改訂での登録はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0007',
	'W',
	'仕様が存在するため、更新できません。\n構成を変更する場合は、構成改訂してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0008',
	'W',
	'指定した得意先は見積が禁止されています。\n得意先ＣＤ：{1}\n見積日：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0009',
	'W',
	'見積書が発行済のため、見積区分を作成中に戻せません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0010',
	'W',
	'この品目、手配ＮＯと同一の仕様が既に登録済みです。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0011',
	'W',
	'この品目は見積または、受注で使用されているため、変更、改訂での登録はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0012',
	'W',
	'この品目はリリース済みのため新規や変更、改訂での登録はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0013',
	'W',
	'この品目は品目未定義のため変更、改訂での登録はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0014',
	'W',
	'指定した品目は見積が禁止されています。\n品目：{1}\n見積日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0015',
	'W',
	'指定した品目は輸出が禁止されています。\n品目：{1}\n国ＣＤ：{2}\n基準日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0016',
	'W',
	'案件管理をする場合は手配ＮＯ１は必須です。手配ＮＯ発番をオンにするか、手配ＮＯ１を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0017',
	'W',
	'指定した手配ＮＯ１は別の案件ＮＯに紐付いています。手配ＮＯ１を別の値に変更するか、案件登録画面で案件ＮＯと手配ＮＯの紐付きを削除してください。\n手配ＮＯ１：{1}\n別の案件ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0018',
	'W',
	'見積が受注もしくは実績に引き継がれているため、承認対象となるような更新はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0019',
	'W',
	'案件管理が登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0020',
	'W',
	'見積受注理由が登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0021',
	'W',
	'次の販売期間に対応する入力担当者別の販売計画が既に登録されているため、訂正または取消できません。\n部門ＣＤ：{1} \n得意先ＣＤ：{2}\n案件ＮＯ：{3}\n計画品目：{4}\n品目：{5}\n販売年月：{6}～{7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0022',
	'W',
	'次の販売期間に対応する集計担当者別の販売計画が既に登録されているため、訂正または取消できません。\n部門ＣＤ：{1} \n得意先ＣＤ：{2}\n案件ＮＯ：{3}\n計画品目：{4}\n品目：{5}\n販売年月：{6}～{7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0023',
	'W',
	'この品目の構成は既に登録済みのため新規で登録できません。\n品目：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0024',
	'W',
	'この構成は他の見積や受注で使用されているため変更できません。\n品目：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0025',
	'W',
	'この品目は他の受注で使用されているため改訂できません。\n品目：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0026',
	'W',
	'この品目はリリース済のため新規や変更、改訂での登録はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0027',
	'W',
	'この仕様は既に登録済みです。\n品目：{1},{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0028',
	'W',
	'この仕様は他の見積や受注で使用されているため仕様を変更できません。\n品目：{1},{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0029',
	'W',
	'この品目の構成に対する仕様が他に存在するため更新できません。\n品目：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0030',
	'W',
	'品目体系を指定しない場合は、品目集計対象外はオンにできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0031',
	'W',
	'次の部門は指定した販売年月で営業部門として設定されていないため、登録できません。\n部門ＣＤ：{1}\n販売年月：{2}～{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0032',
	'W',
	'販売計画を登録する構成と異なるデータのため、登録できません。販売計画の構成情報をご確認ください。\n部門ＣＤ：{1}\n得意先ＣＤ：{2}\n案件ＮＯ：{3}\n計画品目ＣＤ：{4}\n品目：{5}\n通貨ＣＤ：{6}\n販売年月：{7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0033',
	'W',
	'次の計画品目は指定した販売年月で販売計画の立案対象として設定されていません。販売計画品目構成マスタをご確認ください。\n計画品目：{1}\n販売年月：{2}～{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0034',
	'W',
	'次の品目は指定した販売年月で販売計画の立案対象として設定されていません。販売計画品目構成マスタをご確認ください。\n品目：{1}\n販売年月：{2}～{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0035',
	'W',
	'販売年月が重複するレコードが存在するため、登録できません。重複期間を補正してください。\n計画品目：{1}\n品目：{2}\n重複期間：{3}～{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0036',
	'W',
	'同一品目に対して異なる設定区分を指定できません。いずれか１つとなるように指定してください。\n部門ＣＤ：{1}\n品目：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0037',
	'W',
	'予算分類が登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0038',
	'W',
	'案件管理に案件状況として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0039',
	'W',
	'案件管理に受注確度として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0040',
	'W',
	'案件管理に活動状況として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0041',
	'W',
	'見積受注理由に受注取消として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0042',
	'W',
	'見積受注理由に見積結果として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0043',
	'W',
	'見積受注理由に見積条件として登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0044',
	'W',
	'作成中の見積は、見積書を発行できません。\n見積ＮＯ：{1}-{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0045',
	'W',
	'承認対象の見積は、承認されるまで見積書を発行できません。\n見積ＮＯ：{1}-{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0046',
	'W',
	'見積が取り消されているため、見積書を発行できません。\n見積ＮＯ：{1}-{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0047',
	'W',
	'発行対象の見積が存在しません。\n見積ＮＯ：{1}-{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0048',
	'W',
	'案件ＮＯが登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0049',
	'W',
	'伝票状況区分が新規の参照売上情報が存在しません。\n参照売上実績ＮＯ：{1}\n参照売上実績連番：{2}\n参照売上実績明細ＮＯ：{3}\n参照売上実績明細連番：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0050',
	'W',
	'得意先と仕向先が、国内または国外に統一されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0051',
	'W',
	'販売計画が既に訂正不可として設定されているため、登録できません。\n部門ＣＤ：{1}\n得意先ＣＤ：{2}\n案件ＮＯ：{3}\n計画年月：{4}\nバージョン：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0052',
	'W',
	'同じ計画年月で既に採用されたバージョンが存在するため、採用をオンに更新できません。\n計画年月：{1}\nバージョン：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0053',
	'W',
	'発注に対応する受注が承認されていないため、発注できません。\n受注ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0054',
	'W',
	'指定したコピー先バージョンの販売計画が既に存在しているため、登録できません。\n部門ＣＤ：{1}\n得意先ＣＤ：{2}\n案件ＮＯ：{3}\n計画年月：{4}\nバージョン：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0055',
	'W',
	'指定した売上実績ＮＯの明細を取得できません。\n売上実績ＮＯ：{1}\n売上実績改訂番号：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0056',
	'W',
	'指定した期間において、計画品目の内訳に設定されていない品目が指定されているため、登録できません。\n計画品目ＣＤ：{1}\n品目：{2}\n販売年月：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0057',
	'W',
	'更新対象である集計販売計画の明細データが存在しないため、更新できません。\n計画品目ＣＤ：{1} \n通貨ＣＤ：{2}\n販売年月：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0059',
	'W',
	'計画品目に対する全ての品目を上り電文に指定してください。\n計画品目ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0060',
	'W',
	'指定した受注ＮＯのデータが存在しません。\n受注ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0061',
	'W',
	'指定した受注ＮＯ、受注明細ＮＯのデータが存在しません。\n受注ＮＯ：{1}\n受注明細ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0062',
	'W',
	'受注明細ＮＯを指定した場合は、受注ＮＯも指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0063',
	'I',
	'複数の伝票が作成されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0064',
	'I',
	'売上実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0065',
	'W',
	'伝票帳票を取得できません。\n得意先ＣＤ：{1}\n取引ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0066',
	'W',
	'承認対象に対し、伝票分割が発生したため登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0067',
	'W',
	'受注引当マスタに登録されている場所ではありません。\n納品先ＣＤ：{1}\n配送先ＣＤ：{2}\n売上部門ＣＤ：{3}\n基準日：{4}\n品目：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0068',
	'W',
	'受注引当マスタに登録されている総量引当場所グループではありません。\n納品先ＣＤ：{1}\n配送先ＣＤ：{2}\n売上部門ＣＤ：{3}\n基準日：{4}\n品目：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0069',
	'W',
	'受注引当マスタに登録されている物流グループではありません。\n納品先ＣＤ：{1}\n配送先ＣＤ：{2}\n売上部門ＣＤ：{3}\n基準日：{4}\n品目：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0070',
	'W',
	'打切となった明細・詳細がある場合、取消できません。\n打切を解除した後に取り消してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0071',
	'W',
	'既に登録済のインボイスＮＯのため登録できません。まだ登録されていないインボイスＮＯを指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0072',
	'W',
	'インボイスＮＯを自動発番する場合、インボイスＮＯは指定しないでください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0073',
	'W',
	'出荷返品となる場合、同時計上はオン（入荷同時計上）としてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0074',
	'W',
	'仕向先１が未指定の場合、仕向先２を指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0075',
	'W',
	'仕向先２が未指定の場合、仕向先３を指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0076',
	'W',
	'同一受注内に預り売上と出荷指図対象外売上が混在しています。\n売上実績一覧登録画面から売上計上登録を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0077',
	'W',
	'出荷返品の場合、数量の上限は出荷実績登録されている数量までです。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0078',
	'W',
	'物流グループが異なる場所を混在させることはできません。\n同一の物流グループとなる場所を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0079',
	'W',
	'明細の数量と詳細の合計数量が異なっています。\n各数量を手動で調整するか、明細反映を行って明細と詳細の合計数量を合わせてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0080',
	'W',
	'明細の手配ＮＯと詳細の手配ＮＯが異なっています。\n明細と詳細の手配ＮＯを合わせるか、詳細が複数の手配ＮＯとなる場合は明細の手配ＮＯをクリアしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0081',
	'W',
	'明細のロットＮＯと詳細のロットＮＯが異なっています。\n明細と詳細のロットＮＯを合わせるか、詳細が複数のロットＮＯとなる場合は明細のロットＮＯをクリアしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0082' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0082',
	'W',
	'明細のサブロットＮＯと詳細のサブロットＮＯが異なっています。\n明細と詳細のサブロットＮＯを合わせるか、詳細が複数のサブロットＮＯとなる場合は明細のサブロットＮＯをクリアしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0083',
	'W',
	'明細の場所と詳細の場所が異なっています。\n明細と詳細の場所を合わせるか、詳細が複数の場所となる場合は明細の場所をクリアしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0084' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0084',
	'W',
	'明細の棚・ラインと詳細の棚・ラインが異なっています。\n明細と詳細の棚・ラインを合わせるか、詳細が複数の棚・ラインとなる場合は明細の棚・ラインをクリアしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0085',
	'W',
	'明細の格付と詳細の格付が異なっています。\n明細と詳細の格付を合わせるか、詳細が複数の格付となる場合は明細の格付をクリアしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0086',
	'W',
	'受注引当格付マスタに登録されていない格付、または受注可能として格付マスタに登録されていない格付です。\n得意先ＣＤ：{1}\n納品先ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0087',
	'W',
	'該当の売上実績はインボイス取引対象のため当画面では処理できません。\n売上実績一覧登録で処理を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0088',
	'W',
	'該当の売上実績は仕入直送売上のため当画面では処理できません。\n売上実績一覧登録または仕入直送売上登録画面で処理を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0089' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0089',
	'W',
	'指定した得意先は売上・出荷が禁止されています。\n得意先ＣＤ：{1}\n売上日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0090' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0090',
	'W',
	'指定した品目は売上・出荷が禁止されています。\n品目：{1}\n売上日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0091' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0091',
	'W',
	'引継可能な明細が存在しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0092' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0092',
	'W',
	'指定した見積の明細を取得できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0093' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0093',
	'W',
	'構成管理品を見積から引き継ぐことはできません。受注から引き継いでください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0094' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0094',
	'W',
	'受注ＮＯを指定していますが、受注を引継いだ明細がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0095' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0095',
	'W',
	'見積ＮＯを指定していますが、見積を引継いだ明細がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0096',
	'W',
	'納品書ＮＯを指定していますが、納品伝票を引継いだ明細がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0097',
	'W',
	'計上済の実績が存在するため、打切のまま行削除できません。\n訂正種別で打切解除をした後に、行削除を行ってください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0098',
	'W',
	'計上済の実績が存在しているため、数量を0にしての打切はできません。\n残数を全て打切る場合は、登録されている売上実績に対して打切の登録を行ってください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0099',
	'W',
	'見積から引継可能な数量を超えています。\n見積明細ＮＯ：{1}\n引継可能数量：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0100',
	'W',
	'売上数量が売上予定の数量を超えているため、登録できません。\n売上予定数量：{1}\n売上済数量：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0101',
	'W',
	'同一納品先に対して価格印字のオン・オフが混在しています。\n同一納品先に対する価格印字はいずれかに統一してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0102',
	'W',
	'納入指示受領が可能な数量を超えるため登録できません。\n受注明細ＮＯ：{1}\n納入指示受領数量：{2}\n納入指示受領可能数量：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0103',
	'W',
	'出荷指図（実績）済のため納入指示を更新、取消できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0104',
	'W',
	'受注明細を打切した場合、あるいは受注明細に対応する出荷予定を全数打切した場合、納入指示受領は登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0105',
	'W',
	'指定した納入指示数量が、打切されていない数量を超えるため登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0106',
	'W',
	'仕入直送の受注が既に売上計上済のため、納入指示受領登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0107',
	'W',
	'指定した納入指示数量が出荷指図（実績）済数量を下回るため更新できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0108',
	'W',
	'打切のまま取消できません。\n訂正種別で打切解除をした後に、取り消してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0109',
	'W',
	'手配ＮＯ１発番パタンが品目マスタに登録されていないため、手配ＮＯを発番できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0110',
	'W',
	'手配ＮＯ２発番パタンが品目マスタに登録されていないため、手配ＮＯを発番できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0111',
	'W',
	'手配ＮＯ３発番パタンが品目マスタに登録されていないため、手配ＮＯを発番できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0112',
	'W',
	'手配ＮＯ４発番パタンが品目マスタに登録されていないため、手配ＮＯを発番できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0113',
	'W',
	'異なる案件ＮＯに紐付く手配ＮＯ１を混在させることはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0114',
	'W',
	'売上返品理由が他勘定のため、単価はゼロ、値引額は未指定にしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0115',
	'W',
	'打切となる数量はありません。打切をオフにしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0117',
	'W',
	'後続業務が行われているため、出荷予定は削除できません。\n出荷予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0118',
	'W',
	'打切された出荷予定は削除できません。打切取消してから削除してください。\n出荷予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0119',
	'W',
	'後続業務の数量を下回る変更はできません。\n出荷予定ＮＯ：{1}\n後続業務の数量：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0120',
	'W',
	'再出荷予定は打切で登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0121',
	'W',
	'出荷予定数量の合計は、受注明細の数量と同じにしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0124',
	'W',
	'与信使用額が与信限度額に超えています。\n与信管理先ＣＤ：{1}\n通貨ＣＤ：{2}\n与信使用額：{3}\n与信限度額：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0125',
	'W',
	'コピー元バージョンの販売計画が存在しないため、または、確定済データが存在しないため、登録できません。\n部門ＣＤ：{1}\n得意先ＣＤ：{2}\n案件ＮＯ：{3}\n計画年月：{4}\nバージョン：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0126',
	'W',
	'指定した売上値引・売上値増のデータは、承認対象外または最終承認済ではないため訂正できません。\n売上実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0127',
	'W',
	'受注を引き継いだ明細がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0128' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0128',
	'W',
	'指定した品目は受注が禁止されています。\n品目：{1}\n基準日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0129' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0129',
	'W',
	'明細のロット作成がオンの場合、詳細のロット作成をオフにできません。\n明細のロット作成をオフにするか、詳細のロット作成を全てオンにしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0130' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0130',
	'W',
	'明細の出荷元期限と詳細の出荷元期限が異なっています。\n明細と詳細の出荷元期限を合わせるか、詳細が複数の出荷元期限となる場合は明細の出荷元期限をクリアしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0131',
	'W',
	'明細の版ＮＯと詳細の版ＮＯが異なっています。\n明細と詳細の版ＮＯを合わせるか、詳細が複数の版ＮＯとなる場合は明細の版ＮＯをクリアしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0132',
	'W',
	'仕入後計上では仕入済数以下の数量を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0133',
	'W',
	'対象受注が承認されていないため、登録できません。\n受注ＮＯ：{1}\n承認状況区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0135' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0135',
	'W',
	'同時計上の場合、同一の売上実績に含まれる全ての入荷実績の入荷日、計上日を揃えて登録してください。\n売上実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0136' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0136',
	'W',
	'同時計上の場合、同一の売上実績に含まれる入荷実績の計上日を揃えて取り消してください。\n売上実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0137' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0137',
	'W',
	'対象の売上実績明細が存在しないため、更新できません。\n売上実績明細ＮＯ：{1}\n売上実績明細連番：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0138' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0138',
	'W',
	'ロット管理情報に登録されていません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0139' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0139',
	'W',
	'承認状況区分が承認中のため更新できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0140' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0140',
	'W',
	'構成管理品の場合は構成・仕様登録画面で構成を登録してください。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0141' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0141',
	'W',
	'単価が設定されていない構成品が存在します。構成・仕様登録画面で構成品の単価を指定してください。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0142' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0142',
	'W',
	'手配ＮＯを指定した場合は仕様を指定してください。\n手配ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0143' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0143',
	'W',
	'見積から引継可能な数量を満たしてないため、構成改訂できません。\n見積行ＮＯ：{1}\n引継可能数量：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0144' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0144',
	'W',
	'出荷予定が分割されている明細がある場合は、品揃する設定はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0145' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0145',
	'W',
	'出荷予定が分割されている明細に品揃ＧＮＯを指定できません。\n受注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0146' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0146',
	'W',
	'貸出出荷の場合、インボイス取引対象の得意先を指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0147' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0147',
	'W',
	'貸出出荷の場合、国外の納品先を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0148' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0148',
	'W',
	'得意先、納品先に国内・国外の組み合わせを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0149' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0149',
	'W',
	'諸口納品先の場合、納品先名は必須です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0150' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0150',
	'W',
	'国内の諸口納品先の場合、郵便番号は必須です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0151' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0151',
	'W',
	'諸口納品先の場合、住所１は必須です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0152' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0152',
	'W',
	'諸口配送先の場合、配送先名は必須です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0153' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0153',
	'W',
	'国内の諸口配送先の場合、配送先郵便番号は必須です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0154' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0154',
	'W',
	'諸口配送先の場合、配送先住所１は必須です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0155' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0155',
	'W',
	'貸出出荷では非在庫品は登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0156' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0156',
	'W',
	'諸口品の場合、品名は必須です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0157' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0157',
	'W',
	'承認されているため受注を更新できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0158' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0158',
	'W',
	'打切された出荷予定を含む明細の品目を変更できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0159' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0159',
	'W',
	'打切された出荷予定を含む明細の単位を変更できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0160' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0160',
	'W',
	'後続業務が行われているため、削除できません。\n受注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0161' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0161',
	'W',
	'承認状況が一次承認済または最終承認済のため取消できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0162' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0162',
	'W',
	'承認状況が一次承認済または最終承認済のため追加のデータを取り込むことができません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0163' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0163',
	'W',
	'仕入直送の受注明細は売上計上に進んだ状態では打切ることができません。\n受注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0164' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0164',
	'W',
	'指図区分が出荷指図対象の受注明細は出荷指図に進んだ状態では打切ることができません。\n受注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0165' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0165',
	'W',
	'指図区分が出荷指図対象外の受注明細は出荷実績に進んだ状態では打切ることができません。\n受注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0166' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0166',
	'W',
	'受注引当マスタに、デフォルトがオンのレコードが登録されていません。\n物流グループＣＤ：{1}\n品目出荷グループＣＤ：{2}\nワーキンググループＣＤ：{3}\n引当場所ＣＤ：{4}\n引当物流グループＣＤ：{5}\n総量引当場所グループＣＤ：{6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0167' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0167',
	'W',
	'品目詳細マスタから、仕入直送時の発注先を取得できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0168' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0168',
	'W',
	'受注に対して、指図もしくは出荷が登録されているため、承認対象となるような更新はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0169' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0169',
	'W',
	'承認処理対象となる売上値引・売上値増の売上実績が存在しないため、更新できません。\n売上実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0171' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0171',
	'W',
	'指定した受注情報は取り消されています。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0172' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0172',
	'W',
	'受注引当マスタに登録されていません。\n物流グループＣＤ：{1}\n品目出荷グループＣＤ：{2}\nワーキンググループＣＤ：{3}\n引当場所ＣＤ：{4}\n引当物流グループＣＤ：{5}\n総量引当場所グループＣＤ：{6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0173' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0173',
	'W',
	'受注明細に対応する見積明細が取得できません。\n受注明細ＮＯ：{1}\n見積明細ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0174' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0174',
	'W',
	'受注引当マスタに登録されている場所ではありません。\n納品先ＣＤ：{1}\n配送先ＣＤ：{2}\n売上部門ＣＤ：{3}\n基準日：{4}\n品目：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0175' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0175',
	'W',
	'市場出荷判定対象の場合は、事前に購買納期調整登録画面でロットＮＯを指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0176' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0176',
	'W',
	'受注時の取引通貨と異なる通貨では前受金を登録できません。\n受注ＮＯ：{1}\n受注時の取引通貨ＣＤ：{2}\n前受金の取引通貨ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0177' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0177',
	'I',
	'販売単価が設定されていない、または販売単価が0です。\n品目：{1}\n得意先ＣＤ：{2}\n通貨ＣＤ：{3}\n単位ＣＤ：{4}\n販売年月：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0178' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0178',
	'W',
	'指定した案件ＮＯは既に見積登録されているため、取消できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0179' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0179',
	'W',
	'指定した案件ＮＯは既に受注登録されているため、取消できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0181' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0181',
	'W',
	'開始年月終了年月に重複期間があります。開始年月、終了年月が同じため自動調整できませんでした。\n{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0182' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0182',
	'W',
	'インボイス登録済みのため、仕入予定の変更、取消はできません。\n仕入予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0183' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0183',
	'W',
	'品目詳細マスタに登録されていません。\n品目：{1}\nワーキンググループＣＤ：{2}\n発注先ＣＤ：{3}\nメーカＣＤ：{4}\nマスタ適用日：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0184' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0184',
	'W',
	'指定した手配ＮＯ１は、他の案件ＮＯと紐づいています。新しく手配ＮＯ１を発番するか、案件登録画面で紐付きを削除してください。\n手配ＮＯ１：{1}\n既に紐づいている案件ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0185' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0185',
	'W',
	'内示開始期間と内示終了期間は異なる値を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0186' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0186',
	'W',
	'入荷済みのため、打切以外の訂正はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0187' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0187',
	'W',
	'打切や打切解除する場合は、同時に他の項目の新規登録、訂正、取消はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0188' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0188',
	'W',
	'未入荷の返品予定は打切できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0191' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0191',
	'I',
	'受注集計処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0192' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0192',
	'I',
	'受注集計処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0193' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0193',
	'W',
	'依頼先場所は品目詳細マスタに登録されていません。\n品目：{1}\n依頼先場所ＣＤ：{2}\nワーキンググループＣＤ:{3}\nマスタ適用日：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0194' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0194',
	'W',
	'指定した得意先は受注禁止です。\n得意先ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0195' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0195',
	'W',
	'指図区分が「2：ピッキングなし」の明細のみで登録できません。「3：指図対象外」とするか、「１：ピッキングあり」の明細を含めて登録してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0196' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0196',
	'W',
	'指定した品目は受注禁止です。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0197' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0197',
	'W',
	'貸出出荷の場合、インボイス取引対象の得意先を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0198' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0198',
	'W',
	'出荷指図、出荷実績、インボイス、売上のいずれかが登録されているため、更新できません。\n受注明細ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0199' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0199',
	'W',
	'出荷指図、出荷実績、インボイス、売上のいずれかが登録されているため、削除できません。\n受注明細ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0200' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0200',
	'W',
	'出荷指図、出荷実績、インボイス、売上のいずれかが登録されているため、打切できません。\n受注明細ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0201' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0201',
	'W',
	'インボイス登録済のため、受注明細を追加できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0202' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0202',
	'W',
	'出荷指図、出荷実績、インボイス、売上のいずれかが登録されているため、取消できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0203' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0203',
	'W',
	'打切された受注明細を含むため、取消できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0204' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0204',
	'W',
	'インボイスの全明細が更新対象となっていません。\nインボイス取引対象の場合、インボイスの全明細を表示した状態で更新してください。\nインボイスＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0206' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0206',
	'W',
	'インボイス登録済みのため、納入指示受領登録はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0207' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0207',
	'W',
	'顧客内示情報ファイルのヘッダ項目値は一致しません。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0208' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0208',
	'W',
	'承認状況区分が一次承認済または最終承認済の場合、見積区分を作成中に変更できません。\n承認を取り消してから作成中に変更してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0209' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0209',
	'W',
	'見積区分を作成中に変更する場合、失注をオンにできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0215' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0215',
	'W',
	'受注明細に対して一部数量を打切した場合は、打切できません。\n受注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0216' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0216',
	'W',
	'納入指示に対応する出荷予定が確定済みのため、取消できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0217' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0217',
	'W',
	'納入指示に対応する出荷予定が確定済みのため、数量の訂正はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0218' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0218',
	'W',
	'納入指示に対応する出荷予定が確定済みのため、納入希望日時の訂正はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0219' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0219',
	'W',
	'同一受付日のレコードが既に存在するため、登録できません。\n得意先：{1}\n納品先：{2}\n担当部門：{3}\n担当者：{4}\n案件ＮＯ：{5}\n受付日：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0220' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0220',
	'W',
	'確定されている出荷予定が存在するため、納入指示を出荷予定に反映できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0221' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0221',
	'W',
	'インボイス対象取引でない得意先の場合、配送先経由区分は「2：経由しない」を入力してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0222' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0222',
	'W',
	'インボイスＮＯを指定した場合、仕入直送の受注明細が登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0223' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0223',
	'W',
	'インボイスＮＯを指定した場合、出荷予定分割区分を「分割しない」に指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0224' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0224',
	'W',
	'インボイスＮＯを指定した場合、出荷物流Gの指定が必須です。指定できない場合、受注引当マスタを確認してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0225' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0225',
	'W',
	'インボイスＮＯを指定した場合、出荷指図済のため、受注明細を追加できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0226' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0226',
	'W',
	'インボイスＮＯを指定した場合、受注明細の納品先は複数混在しているため、登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0227' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0227',
	'W',
	'インボイスＮＯを指定した場合、受注明細の配送先は複数混在しているため、登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0228' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0228',
	'W',
	'受注時にインボイスＮＯを指定した場合は、納入指示を受領できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0229' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0229',
	'W',
	'納入指示受領済の出荷予定の合計数量と納入指示受領の数量が一致しません。\n納入指示受領ＮＯ：{1}\n出荷予定数量合計：{2}\n納入指示受領数量：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0230' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0230',
	'W',
	'回答数量と対応する出荷予定の合計数量が一致しません。\n回答数量：{1}\n出荷予定数量合計：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0231' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0231',
	'W',
	'出荷予定が分割されているため、売上実績の訂正・取消はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0232' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0232',
	'W',
	'インボイスＮＯを指定した場合、受注明細の出荷物流Ｇは複数混在しているため、登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0233' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0233',
	'W',
	'預り売上した数量の範囲内で、出荷予定を調整してください。\n売上実績明細ＮＯ：{1}\n調整前の数量：{2}\n調整後の数量：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0234' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0234',
	'W',
	'預り売上が既に登録されているため、受注明細の訂正・取消・打切はできません。\n受注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0235' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0235',
	'W',
	'出荷予定の基準単位数量が、預り売上した在庫の荷姿単位数量に換算できないため、登録できません。\n出荷予定ＮＯ：{1}\n基準単位数量：{2}\n荷姿単位：{3}\n換算基準数量：{4}\n単位換算数：{5}\n小数部有効桁数：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0236' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0236',
	'W',
	'貸出出荷と預り売上を同時に指定することはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0237' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0237',
	'W',
	'預り売上の場合、インボイス取引対象の得意先を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0238' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0238',
	'W',
	'品揃区分が「2：品揃する」で指定されて、且つ明細の品揃GNOが設定された場合、同一の品揃GNOの明細は、出荷物流G、納品先、配送先の項目も同じ値を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0239' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0239',
	'W',
	'明細の貸出格付と詳細の貸出格付が異なっています。\n明細と詳細の貸出格付を合わせるか、詳細が複数の貸出格付となる場合は明細の貸出格付をクリアしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0240' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0240',
	'W',
	'同時計上する・しないを混在させることはできません。全数仕入計上してから売上計上してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0241' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0241',
	'W',
	'受注数に対して、一部仕入された状態で、仕入直送売上を全数登録することができません。全数仕入してもらうか、仕入を取り消してから売上計上してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0242' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0242',
	'W',
	'数量は、引継数量以下にはできません。\n見積明細ＮＯ：{1}\n数量：{2}\n引継数量：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0243' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0243',
	'W',
	'引継済の明細があるため、取消できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0244' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0244',
	'W',
	'入力担当者別の販売計画が変更されているため、再検索した後、再集計してください。\n計画品目：{1}\n品目：{2}\n販売年月：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0245' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0245',
	'W',
	'金額の合計をマイナスにはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0246' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0246',
	'W',
	'未出荷の受注に対して、再出荷を登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0247' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0247',
	'W',
	'インボイスが登録されているため出荷返品は登録できません。インボイスを取消してください。\nＩ／Ｖ ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0248' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0248',
	'W',
	'インボイス単位出荷に対する出荷返品は、一部明細および一部数量の登録はできません。\nＩ／Ｖ ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0249' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0249',
	'W',
	'インボイス単位出荷に対する出荷返品予定は打切できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0250' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0250',
	'W',
	'同一の納品書明細に対する返品予定が既に登録されているため、登録できません。\n既に登録されている売上返品予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0251' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0251',
	'W',
	'在庫管理する諸口品ですが、諸口品マスタに登録されていません。\n品目：{1}\n手配ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0252' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0252',
	'W',
	'指定した受注ＮＯのデータが存在しないか、貸出出荷の受注ではありません。\n受注ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0253' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0253',
	'W',
	'指定した受注ＮＯ、受注明細ＮＯのデータが存在しないか、貸出出荷の受注明細ではありません。\n受注ＮＯ：{1}\n受注明細ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0254' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0254',
	'W',
	'インボイスが登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0255' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0255',
	'W',
	'売上済みのため、仕入実績の数量変更、取消はできません。\n仕入実績明細ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0256' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0256',
	'W',
	'インボイス登録済みのため、仕入実績の数量変更、取消はできません。\n仕入実績明細ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0257' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0257',
	'W',
	'明細のロット作成がオンの場合は詳細の業者ロットＮＯに同じ値を指定して下さい。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0258' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0258',
	'W',
	'明細行の仕入有効成分が詳細行の仕入有効成分の合計と異なります。\n明細行の数量：{1}\n詳細行の合計数量：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0259' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0259',
	'W',
	'伝票分割が発生し、計画外の明細のみが別の伝票になるため、登録できません。\n売上実績登録画面で計画外の売上を登録してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0260' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0260',
	'W',
	'指定した売上実績受払数量が、仕入実績受払残数を超えるため登録できません。\n売上実績受払の合計数量：{1}\n仕入実績受払の残数：{2}\n仕入実績受払ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0261' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0261',
	'W',
	'出荷実績と同時に計上された売上実績は訂正できません。\n売上実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0262' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0262',
	'W',
	'出荷実績と同時に計上された売上実績は取消できません。\n売上実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0263' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0263',
	'W',
	'輸出実績と同時に計上された売上実績は訂正できません。\n売上実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0264' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0264',
	'W',
	'輸出実績と同時に計上された売上実績は取消できません。\n売上実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0265' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0265',
	'W',
	'明細の貸出場所と詳細の貸出場所が異なっています。\n明細と詳細の貸出場所を合わせるか、詳細が複数の貸出場所となる場合は明細の貸出場所をクリアしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0266' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0266',
	'W',
	'明細の貸出棚・ラインと詳細の貸出棚・ラインが異なっています。\n明細と詳細の貸出棚・ラインを合わせるか、詳細が複数の貸出棚・ラインとなる場合は明細の貸出棚・ラインをクリアしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0267' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0267',
	'W',
	'明細の返品先情報が複数混在しているため登録できません。\n同一の返品先情報とするか、異なる返品先の明細を行削除して別の売上返品として登録してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0268' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0268',
	'W',
	'購買依頼が作られる場合はロット指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0269' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0269',
	'W',
	'売上返品予定引継でインボイス取引対象の場合、一部明細および一部数量の返品計上はできません。\n売上返品予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0270' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0270',
	'W',
	'明細の版ＮＯと詳細の版ＮＯが異なっています。\n明細と詳細の版ＮＯを合わせるか、詳細が複数の版ＮＯとなる場合は明細の版ＮＯをクリアしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0271' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0271',
	'W',
	'ロット管理情報に登録されていません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n版ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0272' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0272',
	'W',
	'出荷予定の削除または打切と、出荷依頼の再調整依頼は同時に行えません。\n出荷予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0273' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0273',
	'W',
	'計画品目の数量・金額を案分する対象の品目が存在しないため、登録できません。\n部門ＣＤ：{1}\n計画品目ＣＤ：{2}\n販売年月：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0274' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0274',
	'W',
	'場所が未決定のため登録できません。\n売上実績登録画面で登録するか、出荷予定変更登録画面で場所を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0275' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0275',
	'W',
	'納入指示に対応する出荷予定が打切されたため、取消できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0276' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0276',
	'W',
	'納入指示に対応する出荷予定が打切されたため、数量の訂正はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0277' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0277',
	'W',
	'納入指示に対応する出荷予定が打切されたため、納入希望日時の訂正はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0278' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0278',
	'W',
	'納入指示受領の合計数量が受注明細の数量を超えているため、登録できません。\n納入指示受領の合計数量：{1}\n受注明細の数量：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0279' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0279',
	'I',
	'出荷予定が変更されたため、受注納期回答が削除されました。必要に応じて回答を再度登録してください。\n受注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0280' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0280',
	'W',
	'一部でも売上登録された複数詳細の売上予定は、売上実績一覧登録画面では登録できません。\n売上実績登録画面または仕入直送売上登録画面で登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0281' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0281',
	'W',
	'仕入直送の発注が登録されているため、受注区分を仮受注に変更できません。\n受注ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0282' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0282',
	'W',
	'引当範囲区分が「2.総量引当」の場合はロットＮＯおよびサブロットＮＯを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0283' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0283',
	'W',
	'貸出の変更はできません。\n受注ＮＯ：{1}\n受注明細ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0284' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0284',
	'W',
	'データ更新中に、データの競合が発生しました。\n処理を再実行してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0290' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0290',
	'W',
	'指定したインボイスＮＯはすでに存在します。\nインボイスＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0291' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0291',
	'W',
	'仕入直送売上の売上返品に対して伝票分割の発生する訂正は、売上返品登録画面で行ってください。\n売上実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0292' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0292',
	'W',
	'預り売上がオンの場合、指図区分「2：ピッキングなし」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0293' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0293',
	'W',
	'単価が0の場合、売上理由は必須です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0294' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0294',
	'W',
	'同一仕入実績に対して返品先情報が複数混在しているため登録できません。\n同一の返品先情報とするか、異なる返品先の明細を行削除して別の売上返品として登録してください。\n仕入実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0295' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0295',
	'W',
	'指定された単位から出荷時の単位に換算できないため、登録できません。\n単位：{1}\n数量：{2}\n基準単位：{3}\n基準単位数量：{4}\n出荷時の単位：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0401' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0401',
	'W',
	'出荷予定に指定された出荷物流グループから変更後の配送先物流グループへのは出荷できません。受注引当マスタを確認してください。\nワーキンググループＣＤ：{1}\n品目出荷グループＣＤ：{2}\n出荷物流グループＣＤ：{3}\n配送先物流グループＣＤ：{4}\n配送先ＣＤ：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0402' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0402',
	'W',
	'出荷予定に指定された出荷物流グループから変更後の納品先物流グループへのは出荷できません。受注引当マスタを確認してください。\nワーキンググループＣＤ：{1}\n品目出荷グループＣＤ：{2}\n出荷物流グループＣＤ：{3}\n納品先物流グループＣＤ：{4}\n納品先ＣＤ：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0403' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0403',
	'W',
	'指定された納品先が受注引当格付マスタに存在しないため、更新できません。\n得意先ＣＤ：{1}\n納品先ＣＤ：{2}\n格付ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0404' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0404',
	'I',
	'指図区分が「2:ピッキングなし」の明細が出荷できない状態です。\n指図区分が「2:ピッキングなし」の明細を出荷する場合は、指図区分が「1:ピッキングあり」の受注明細あるいは出荷予定に、以下の配送先を指定してください。\n受注ＮＯ：{1}\n受注明細ＮＯ：{2}\n配送先ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0405' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0405',
	'I',
	'指図区分が「2:ピッキングなし」の明細が出荷できない状態です。\n指図区分が「2:ピッキングなし」の明細を出荷する場合は、指図区分が「1:ピッキングあり」の受注明細あるいは出荷予定に、以下の納品先を指定してください。\n受注ＮＯ：{1}\n受注明細ＮＯ：{2}\n納品先ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0406' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0406',
	'W',
	'出荷予定日時から計算した依頼先出庫予定日を適用期間にもつ品目詳細マスタが登録されていません。\n品目：{1}\n依頼先場所ＣＤ：{2}\nワーキンググループＣＤ:{3}\n出荷予定日時：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0407' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0407',
	'W',
	'出荷予定日から計算した発注予定日を適用期間にもつ品目詳細マスタが登録されていません。\n品目：{1}\nワーキンググループＣＤ：{2}\n構成パタン：{3}\n製造場所ＣＤ：{4}\n発注先ＣＤ：{5}\nメーカＣＤ：{6}\n出荷予定日：{7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0408' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0408',
	'W',
	'納入希望日から計算した発注予定日を適用期間にもつ品目詳細マスタが登録されていません。\n品目：{1}\nワーキンググループＣＤ：{2}\n構成パタン：{3}\n製造場所ＣＤ：{4}\n発注先ＣＤ：{5}\nメーカＣＤ：{6}\n納入希望日：{7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0296' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0296',
	'W',
	'受注引当マスタの引当場所が取得できませんでした。場所マスタの設定を確認してください。\n場所ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0297' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0297',
	'W',
	'受注引当マスタの出荷場所が取得できませんでした。場所マスタの設定を確認してください。\n場所ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0298' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0298',
	'W',
	'受注引当マスタの引当物流Ｇが取得できませんでした。物流グループマスタの設定を確認してください。\n物流グループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0299' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0299',
	'W',
	'受注引当マスタの総量引当場所Ｇが取得できませんでした。総量引当場所グループマスタの設定を確認してください。\n総量引当場所グループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0301' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0301',
	'W',
	'同一売上実績ヘッダに紐づく他の売上実績明細の品目が、有効な品目として品目マスタに登録されていません。\n売上実績明細NO：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0302' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0302',
	'W',
	'インボイス登録済みの出荷返品の場合、数量の上限は出荷実績登録されている数量とインボイス登録されている数量の差数までです。\n数量の上限：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0303' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0303',
	'W',
	'対象のロットは存在しません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0304' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0304',
	'W',
	'売上締が解除されているため、計上日、売上担当者、売上部門は変更できません。\n訂正前の計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0305' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0305',
	'W',
	'後続業務が行われているため、前受金請求額を下回る入金額に訂正できません。\n前受金請求額：{1}\n前受金入金額合計：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0306' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0306',
	'W',
	'前受金が存在するため、前受金出荷制御区分を出荷可能に変更できません。\n先に前受金入金を取消してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0307' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0307',
	'W',
	'前受金が存在するため、取消できません。\n先に前受金入金を取消してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0308' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0308',
	'W',
	'受注時の得意先に対応した請求先と異なる請求先は前受金を登録できません。\n受注ＮＯ：{1}\n受注時の得意先に対応した請求先ＣＤ：{2}\n前受金の請求先ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0309' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0309',
	'W',
	'指定した計上日は不正です。\n指定した計上日で、売上担当者、売上部門に対する担当者権限マスタが設定されていることを確認してください。\n計上日：{1}\n売上担当者ＣＤ：{2}\n売上部門ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0310' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0310',
	'W',
	'品揃区分に「2：品揃する」を指定した場合、受注明細に出荷物流Ｇ、納品先、配送先のいずれかが複数混在していると登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0311' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0311',
	'W',
	'品揃ＧＮＯを指定した場合、同一の品揃ＧＮＯを指定した明細の、出荷物流Ｇ、納品先、配送先には同じ値を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0501' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0501',
	'W',
	'前回登録したデータがＧＡに未反映です。\n売上伝票ＩＦ一覧照会画面から未反映の売上伝票を再送信してください。\nデータＮＯ：{1}\n売上伝票ＮＯ：{2}\nインボイスＮＯ：{3}\n売上実績ＮＯ：{4}\n支給実績ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0502' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0502',
	'W',
	'有償支給の売上伝票を送信する際に使用する決済方法ＣＤが取得できませんでした。\nシステムパラメータマスタの設定を確認してください。\nパラメータキー：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0503' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0503',
	'I',
	'売上実績計上処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0504' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0504',
	'I',
	'売上実績計上処理が終了しました。\n処理対象：{1}						\n登録件数：{2}				\nエラー件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0505' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0505',
	'W',
	'売上・出荷が禁止されているため、売上実績を計上できません。\n取引先禁止マスタをご確認ください。\n得意先ＣＤ：{1}\n売上日：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0506' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0506',
	'W',
	'入金予定日が指定されていないため、売上実績を計上できません。\n受注ＮＯ：{1}\nインボイスＮＯ：{2}\n明細件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0507' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0507',
	'W',
	'該当の売上実績はＧＡに登録されていません。\nＧＡに登録されていないデータは訂正・取消できません。\n売上実績ＮＯ：{1}\nインボイスＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0508' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0508',
	'W',
	'該当の支給実績はＧＡに登録されていません。\nＧＡに登録されていないデータは訂正・取消できません。\n支給実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0509' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0509',
	'W',
	'売上・出荷が禁止されているため、売上実績を計上できません。\n品目禁止マスタをご確認ください。\n品目：{1}\n売上日：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0510' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0510',
	'W',
	'入金予定制御マスタの設定が不正です。ＧＡに連携する入金予定日を計算できませんでした。\n計上日時点のワーキンググループに対応するサイト区分と、請求締年月日時点のワーキンググループに対応するサイト区分に同じ値を設定してください。\n\n計上日時点のワーキンググループ：{1}\n請求締年月日時点のワーキンググループ：{2}\n請求先：{3}\n通貨：{4}\n金額：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0511' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0511',
	'W',
	'入金予定制御マスタの設定が不正です。ＧＡに連携する入金予定日を計算できませんでした。\n請求先の請求締処理区分がマニュアル選択請求、または売上都度請求かつインボイス取引対象外の場合は、サイト区分に「日」を指定してください。\nワーキンググループ：{1}\n請求先：{2}\n通貨：{3}\n金額：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0512' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0512',
	'W',
	'出荷予定と納期回答の関係が不正です。納品予定反映ボタンを押下してから再度登録してください。\n受注明細ＮＯ：{1}\n受注納期回答ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0513' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0513',
	'W',
	'ロットＮＯ発番区分が手動でロットＮＯもしくは、サブロットＮＯを指定していない発注明細が含まれています。\n売上実績計上バッチを実行する前に購買納期調整登録または仕入実績登録でロットＮＯもしくは、サブロットＮＯを指定してください。\n受注ＮＯ：{1}\n受注明細ＮＯ：{2}\n発注ＮＯ：{3}\n発注明細ＮＯ：{4}\n得意先ＣＤ：{5}\n品目ＣＤ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0514' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0514',
	'W',
	'出荷返品の場合、数量の上限は未売上数量までです。\n数量（基準単位）：{1}\n未売上数量（基準単位）：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0515' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0515',
	'W',
	'打切または打切解除と同時に以下の項目を変更することはできません。\n・得意先\n・売上担当者\n・売上部門');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0518' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0518',
	'W',
	'受領インボイスを登録済の場合、以下の項目は更新できません。\nヘッダ項目：{1}\n受注ＮＯ：{2}\n受注明細ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0519' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0519',
	'W',
	'受領インボイスを登録済の場合、以下の項目は更新できません。\n明細項目：{1}\n受注ＮＯ：{2}\n受注明細ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0601' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0601',
	'W',
	'納入指示受領に対応する受注明細を特定する為に、受注明細ＮＯまたは以下の項目を指定してください。\n得意先ＣＤ、得意先注文ＮＯ、得意先注文明細ＮＯ\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0602' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0602',
	'W',
	'納入指示受領に対応する受注明細を特定できません。\n受注明細ＮＯ：{1}\n得意先ＣＤ：{2}\n得意先注文ＮＯ：{3}\n得意先注文明細ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0603' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0603',
	'W',
	'場所が未決定のため登録できません。\n売上実績登録画面で登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0604' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0604',
	'W',
	'売上実績登録画面でインボイスを新規登録する場合は、明細間で異なる納品先を指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0605' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0605',
	'W',
	'売上部門を取得できませんでした。売上部門ＣＤを指定して取込むか、得意先担当マスタを登録してください。\n得意先：{1}\n適用日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0606' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0606',
	'W',
	'売上担当者を元に、売上部門を取得できませんでした。担当者権限マスタに営業部門を指定してください。\n売上担当者：{1}\n適用日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0607' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0607',
	'W',
	'諸口品の場合、品名は必須です。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0608' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0608',
	'W',
	'デフォルト格付が取得できませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0609' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0609',
	'W',
	'数量の小数部桁数が正しくありません。\n数量：{1}\n小数部有効桁数：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0610' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0610',
	'W',
	'単価の小数部桁数が正しくありません。\n単価：{1}\n小数部有効桁数：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0611' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0611',
	'W',
	'指定された単価と、マスタの単価が異なります。マスタと異なる値を登録するには単価取得対象外をオンにしてください。\n指定された単価：{1}\nマスタの単価：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0612' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0612',
	'W',
	'諸口納品先の場合、納品先名は必須です。\n納品先：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0613' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0613',
	'W',
	'諸口配送先の場合、配送先名は必須です。\n配送先：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0614' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0614',
	'W',
	'値引額を設定した場合は、値引理由が必須です。業務理由マスタに売上調整の理由を登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0615' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0615',
	'W',
	'資産管理する品目、かつ単価が0の場合は、販売他勘定の売上理由が必須です。\n業務理由マスタに販売他勘定の売上理由を登録してください。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0616' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0616',
	'W',
	'資産管理しない品目、かつ単価が0の場合は、販売他勘定ではない売上理由が必須です。\n業務理由マスタに販売他勘定ではない売上理由を登録してください。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0617' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0617',
	'W',
	'資産管理する品目、かつ単価が0の場合は、負担部門が必須です。\n売上部門を負担部門として設定する為、部門マスタの負担部門をオンにしてください。\n品目：{1}\n売上部門：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0618' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0618',
	'W',
	'配送先が必須です。配送先を指定して取込むか、物流制御マスタに標準配送先を登録してください。\n納品先：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0619' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0619',
	'W',
	'指定された仮単価と、マスタの仮単価が異なります。マスタと異なる値を登録するには単価取得対象外をオンにしてください。\n指定された仮単価：{1}\nマスタの仮単価：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0620' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0620',
	'W',
	'インボイス単価の初期値とする販売単価が取得できないため、取り込みできませんでした。\nインボイス取引、かつ単価が0の場合は、インボイス単価が必須です。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0621' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0621',
	'W',
	'承認状況区分が一次承認済または最終承認済のため、削除できません。\n受注ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0622' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0622',
	'W',
	'依頼先場所と発注先の両方に値を設定できません。\n依頼先場所と発注先のいずれかを設定してください。\n依頼先場所ＣＤ：{1}\n発注先ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0623' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0623',
	'W',
	'品目マスタの販売単価変更許可がオフ、かつ取引先マスタの販売単価変更許可がオフのため、単価取得対象外をオンにできません。\n品目：{1}\n得意先：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0624' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0624',
	'W',
	'手配ＮＯ１管理区分が「管理しない」品目に対して手配ＮＯ１が指定されています。\n品目：{1}\n手配ＮＯ１：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0625' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0625',
	'W',
	'手配ＮＯ２管理区分が「管理しない」品目に対して手配ＮＯ２が指定されています。\n品目：{1}\n手配ＮＯ２：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0626' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0626',
	'W',
	'手配ＮＯ３管理区分が「管理しない」品目に対して手配ＮＯ３が指定されています。\n品目：{1}\n手配ＮＯ３：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0627' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0627',
	'W',
	'手配ＮＯ４管理区分が「管理しない」品目に対して手配ＮＯ４が指定されています。\n品目:{1}\n手配ＮＯ４:{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0628' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0628',
	'W',
	'手配ＮＯ１管理区分が「管理しない」「管理する（必須）」品目に対して手配ＮＯ１無し可が指定されています。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0629' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0629',
	'W',
	'手配ＮＯ２管理区分が「管理しない」「管理する（必須）」品目に対して手配ＮＯ２無し可が指定されています。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0630' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0630',
	'W',
	'手配ＮＯ３管理区分が「管理しない」「管理する（必須）」品目に対して手配ＮＯ３無し可が指定されています。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0631' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0631',
	'W',
	'手配ＮＯ４管理区分が「管理しない」「管理する（必須）」品目に対して手配ＮＯ４無し可が指定されています。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0632' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0632',
	'W',
	'得意先品目のみを指定していますが品目を特定できませんでした。取引先品目マスタを設定するか、品目を指定してください。\nマスタ適用日：{1}\n得意先：{2}\n得意先品目：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0633' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0633',
	'W',
	'見積ＮＯを指定していますが、引継可能な明細が存在しません。\n見積ＮＯ：{1}-{2}\n見積明細ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0634' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0634',
	'W',
	'得意先インボイス対象外の得意先から、得意先インボイス対象の得意先への変更はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0635' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0635',
	'W',
	'在庫品の場合、指図区分に「ピッキングなし」を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0636' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0636',
	'W',
	'該当の売上実績は仕入直送売上のため当画面では処理できません。\n売上実績一覧登録画面で処理を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0637' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0637',
	'W',
	'インボイス取引対象の売上実績を訂正・取消する場合は、インボイスＮＯで検索してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0638' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0638',
	'W',
	'同一売上実績ＮＯに紐づく売上実績明細において、明細間で異なる売上担当者ＣＤ、売上部門ＣＤ、債権部門ＣＤは指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0639' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0639',
	'W',
	'インボイス対象の明細を行追加する場合、登録済みの明細と異なる売上担当者ＣＤ、売上部門ＣＤ、債権部門ＣＤは指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0640' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0640',
	'W',
	'インボイス登録済みのため、納入指示受領の取消はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0641' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0641',
	'W',
	'インボイスが既に登録されているため、受注明細の訂正・取消・打切はできません。\n受注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0642' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0642',
	'I',
	'仮単価のまま売上を計上します。\n仮単価を本単価に訂正するには、インボイスを訂正してください。\nインボイスＮＯ：{1}\nインボイス明細ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0643' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0643',
	'W',
	'出荷予定と納期回答の関係が不正です。受注明細単位で更新してください。\n受注明細ＮＯ：{1}\n受注納期回答ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0644' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0644',
	'W',
	'納期回答に紐づく出荷予定がありません。納期回答を削除してください。\n受注明細ＮＯ：{1}\n受注納期回答ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0645' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0645',
	'W',
	'税を取得できませんでした。\n会社マスタ、取引先マスタ、品目マスタの設定を確認してください。\n適用日：{1}\n得意先：{2}\n計画品目：{3}\n品目：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0646' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0646',
	'W',
	'納入指示受領に対して、確定がオンとオフの出荷予定が混在しています。\n出荷予定の確定はいずれかに統一してください。\n納入指示受領ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0701' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0701',
	'W',
	'ロットＮＯの混在が不可の明細でロットが混在しているため、処理できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0702' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0702',
	'W',
	'サブロットＮＯの混在が不可の明細でサブロットが混在しているため、処理できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBBL0703' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBBL0703',
	'W',
	'単価が0ではない場合、販売他勘定の売上理由は指定できません。\n単価：{1}\n売上理由：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP0001',
	'I',
	'手配ＮＯ発番処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP0002',
	'W',
	'期間は93日以内になるように指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP0003',
	'W',
	'期間は60ヶ月以内になるように指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1001',
	'W',
	'以下の項目の何れかが変更された後に、製造指図の再展開が行われていないため、登録できません。\n・製造場所\n・指図数量\n・出来高予定数量\n・着手予定日\n・終了予定日\n・手配ＮＯ\n・構成パタン\n・工程パタン');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1002',
	'W',
	'工程の以下の項目の何れかが変更された後に、予定再展開が行われていないため、登録できません。\n・基準単位数量\n・着手予定日\n・終了予定日');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1004',
	'W',
	'再計算を行うためには、同一工程指図ＮＯの工程を同時に処理対象とする必要があります。\n同一工程指図ＮＯの工程を全て選択してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1005',
	'W',
	'ＢＯＭマスタに存在する投入品は削除できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1006',
	'W',
	'ロットまたはサブロットのチェックをオンにしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1007',
	'I',
	'日付計算処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1008',
	'I',
	'ロット発番処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1009',
	'I',
	'再展開処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1010',
	'I',
	'ロット提案処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1011',
	'I',
	'再計算処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1012',
	'W',
	'再展開する工程の再展開対象チェックをオンにしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1013',
	'W',
	'投入・工数・副産品チェックの何れか一つをオンにしてください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1014',
	'W',
	'品目工程マスタが変更されているため、予定再展開を実行できません。\n再展開を実行してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1015',
	'I',
	'工程オーダ展開処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1016',
	'I',
	'品目実際収率が品目下限収率を下回っています。\n品目実際収率：{1}\n品目下限収率：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1017',
	'I',
	'品目実際収率が品目上限収率を上回っています。\n品目実際収率：{1}\n品目上限収率：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1018',
	'I',
	'工程実際収率が工程下限収率を下回っています。\n工程実際収率：{1}\n工程下限収率：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1019',
	'I',
	'工程実際収率が工程上限収率を上回っています。\n工程実際収率：{1}\n工程上限収率：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1020',
	'W',
	'同じ工程、代替グループ、代替グループ連番に代替品目指定がオンの品目が存在する場合、\n代替品目指定がオフの品目に対してロット提案を実行できません。\n代替品目指定のチェックをオンにするか、ロット提案対象のチェックをオフにしてください。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1021',
	'W',
	'同一投入予定に打切チェックがオンとオフの投入実績が混在するため、登録できません。\n打切を行う場合は、選択チェックをオンにしたすべての投入実績の打切チェックをオンにしてください。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1022',
	'W',
	'同一工数予定に打切チェックがオンとオフの工数実績が混在するため、登録できません。\n打切を行う場合は、選択チェックをオンにしたすべての工数実績の打切チェックをオンにしてください。\n工数：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCP1023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCP1023',
	'I',
	'標準有効成分と実際有効成分が異なっています。\n反映しますか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0001',
	'W',
	'確定されているため、備考と予備項目しか訂正できません。\n所要ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0002',
	'W',
	'確定されているため、取消できません。\n所要ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0003',
	'W',
	'手配ＮＯ管理対象外の品目のため指定できません。\n品目：{1}\n{2}:{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0004',
	'W',
	'対応する品目詳細マスタが存在しません。\n品目：{1}\nワーキンググループＣＤ：{2}\n{3}\n{4}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0005',
	'W',
	'品目禁止マスタで所要の登録が禁止されています。\n品目：{1}\n納期：{2}\n禁止日：{3}\n{4}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0006',
	'W',
	'対応する品目詳細マスタが存在しません。\n品目：{1}\nワーキンググループＣＤ：{2}\n{3}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0023',
	'W',
	'ＭＲＰ発番用接頭語が取得できませんでした。ＷＧマスタの接頭語項目の設定を確認してください。\nワーキンググループ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0024',
	'W',
	'所要量計算が正しく実行されないＷＧが存在します。\nＷＧＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0025',
	'W',
	'ＭＲＰ用発番に対して、登録しようとした接頭語は他のＷＧ用にすでに登録されています。\nＷＧマスタの接頭語項目の設定を確認してください。\nＷＧＣＤ：{1}\n接頭語：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0026',
	'W',
	'ＷＧＣＤ：{1}がスケジューリング中のため所要量計算を実行しませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0027',
	'W',
	'ＷＧＣＤ：{1}の所要量計算が正しく実行されませんでした。\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0028',
	'I',
	'ＷＧＣＤ：{1}の所要量計算が正常終了しました。\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0029',
	'W',
	'新しい変更ＮＯが追加されています。再検索して確認してください。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0030',
	'W',
	'品目詳細マスタに登録されていません。\n品目：{1}\n構成パタン：{2}\n製造場所ＣＤ：{3}\n発注先ＣＤ：{4}\nメーカＣＤ：{5}\n依頼先場所ＣＤ：{6}\nＷＧＣＤ：{7}\nマスタ適用日：{8}\n{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0031',
	'W',
	'オーダに指定したＷＧはＷＧマスタに製造または物流機能を持つＷＧとして登録されていません。\nＷＧＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0032',
	'W',
	'オーダに指定したＷＧと異なるＷＧの格納場所は指定できません。\nオーダＷＧＣＤ：{1}\n格納場所ＣＤ：{2}\n格納場所ＷＧＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0033',
	'W',
	'格納場所と製造場所が異なるＷＧの場所を指定できません。\n格納場所ＣＤ：{1}\n格納場所ＷＧＣＤ：{2}\n製造場所ＣＤ：{3}\n製造場所ＷＧＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0034',
	'W',
	'格納場所と依頼先場所が異なるＷＧの場所を指定できません。\n格納場所ＣＤ：{1}\n格納場所ＷＧＣＤ：{2}\n依頼先場所ＣＤ：{3}\n依頼先場所ＷＧＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0035',
	'W',
	'格納場所と依頼先場所が同じ物流Ｇの場所を指定できません。\n格納場所ＣＤ：{1}\n格納場所物流グループＣＤ：{2}\n依頼先場所ＣＤ：{3}\n依頼先場所物流グループＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0036',
	'W',
	'格納場所と依頼先場所が同じＷＧの場所を指定できません。\n格納場所ＣＤ：{1}\n依頼先場所ＣＤ：{2}\nＷＧＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0037',
	'W',
	'オーダ区分が「1.製造」の品目オーダには製造着手予定日、製造終了予定日、格納完了予定日、使用可能予定日が必須です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0038',
	'W',
	'オーダ区分が「2.購買」の品目オーダには発注予定日、格納完了予定日、検収予定日、使用可能予定日が必須です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0039',
	'W',
	'オーダ区分が「3.外注」の品目オーダには製造着手予定日、製造終了予定日、発注予定日、格納完了予定日、検収予定日、使用可能予定日が必須です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0040',
	'W',
	'オーダ区分が「4.移送」の品目オーダには出庫予定日、格納完了予定日、使用可能予定日が必須です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0041',
	'W',
	'オーダ区分が「5.ＷＧ間移送」の品目オーダには出庫予定日、格納完了予定日、使用可能予定日が必須です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0042',
	'W',
	'検査対象の品目オーダには検査着手予定日、検査終了予定日が必須です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0043',
	'W',
	'製造着手予定日、製造終了予定日、格納完了予定日、使用可能予定日の日付前後関係が不正です。\n製造着手予定日：{1}\n製造終了予定日：{2}\n格納完了予定日：{3}\n使用可能予定日：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0044',
	'W',
	'発注予定日、格納完了予定日、検収予定日、使用可能予定日の日付の前後関係が不正です。\n発注予定日：{1}\n格納完了予定日：{2}\n検収予定日：{3}\n使用可能予定日：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0045',
	'W',
	'発注予定日、製造着手予定日、製造終了予定日、検収予定日、格納完了予定日、使用可能予定日の日付前後関係が不正です。\n発注予定日：{1}\n製造着手予定日：{2}\n製造終了予定日：{3}\n検収予定日：{4}\n格納完了予定日：{5}\n使用可能予定日：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0046',
	'W',
	'出庫予定日、格納完了予定日、使用可能予定日の日付前後関係が不正です。\n出庫予定日：{1}\n格納完了予定日：{2}\n使用可能予定日：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0047',
	'W',
	'検査着手予定日、検査終了予定日、使用可能予定日の日付前後関係が不正です。\n検査着手予定日：{1}\n検査終了予定日：{2}\n使用可能予定日：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0048',
	'W',
	'格納完了予定日≦検査着手予定日の日付前後関係を満たしていません。\n格納完了予定日：{1}\n検査着手予定日：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0049',
	'W',
	'版管理品のため版ＮＯが必須です。\n品目：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0050',
	'W',
	'有効な版ＮＯではありません。\n品目：{1}\n工場・物流倉庫ＣＤ：{2}\n版ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0051',
	'W',
	'ＷＧを変更する訂正はできません。\n品目オーダＮＯ：{1}\n変更前ＷＧＣＤ：{2}\n変更後ＷＧＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0052',
	'W',
	'品目オーダが確定されているため、訂正・取消はできません。\n品目オーダＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0053',
	'W',
	'手配不可の品目のため、確定に更新できません。\n品目：{1}\n手配ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0054',
	'W',
	'品目禁止マスタでオーダ禁止品目となっているため登録・訂正ができません。\n品目：{1}\nオーダ禁止日：{2}\nマスタ適用日：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0055',
	'W',
	'品目マスタの手配ＮＯ１管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ１が必須です。\n品目：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0056',
	'W',
	'品目マスタの手配ＮＯ２管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ２が必須です。\n品目：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0057',
	'W',
	'品目マスタの手配ＮＯ３管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ３が必須です。\n品目：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0058',
	'W',
	'品目マスタの手配ＮＯ４管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ４が必須です。\n品目：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0059',
	'W',
	'品目マスタの手配ＮＯ１管理区分に「1.管理しない」が指定されているため、手配ＮＯ１は指定できません。\n品目：{1}\n手配ＮＯ１：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0060',
	'W',
	'品目マスタの手配ＮＯ２管理区分に「1.管理しない」が指定されているため、手配ＮＯ２は指定できません。\n品目：{1}\n手配ＮＯ２：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0061',
	'W',
	'品目マスタの手配ＮＯ３管理区分に「1.管理しない」が指定されているため、手配ＮＯ３は指定できません。\n品目：{1}\n手配ＮＯ３：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0062',
	'W',
	'品目マスタの手配ＮＯ４管理区分に「1.管理しない」が指定されているため、手配ＮＯ４は指定できません。\n品目：{1}\n手配ＮＯ４：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0063',
	'W',
	'デフォルト工程が必要な品目オーダに対応するデフォルト工程が存在しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0064',
	'W',
	'スケジューラ実行中のオーダのため更新できません。\n品目オーダＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0065',
	'W',
	'下記日付のいずれか1つは指定する必要があります。\n製造着手予定日、製造終了予定日、格納完了予定日、使用可能予定日');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0066',
	'W',
	'下記日付のいずれか1つは指定する必要があります。\n発注予定日、格納完了予定日、検収予定日、使用可能予定日');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0067',
	'W',
	'下記日付のいずれか1つは指定する必要があります。\n発注予定日、製造着手予定日、製造終了予定日、検収予定日、格納完了予定日、使用可能予定日');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0068',
	'W',
	'下記日付のいずれか1つは指定する必要があります。\n出庫予定日、格納完了予定日、使用可能予定日');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0069',
	'W',
	'マスタ適用日が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0070',
	'W',
	'製造・外注オーダに対して製造場所、構成パタンが指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0071',
	'W',
	'購買オーダに対して発注先が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0072',
	'W',
	'移送・ＷＧ間移送オーダに対して依頼先場所が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0073',
	'W',
	'格納場所が指定されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0074',
	'W',
	'工程着手予定日時、工程終了予定日時の日付前後関係が不正です。\n工程着手予定日時：{1}\n工程終了予定日時：{2}\n品目オーダＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0075',
	'W',
	'工程オーダ状況が未確定・保存ではありません。\n品目オーダＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0076',
	'W',
	'工程場所が不正です。品目オーダの製造場所もしくは品目工程マスタの工程場所と一致する必要があります。\n工程ＣＤ：{1}\n工程連番：{2}\n工程場所ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0077',
	'W',
	'対象の工程オーダの中で、品目工程マスタに存在しない工程ＣＤ、工程連番が含まれています。\n工程ＣＤ：{1}\n工程連番：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0078',
	'W',
	'必要な工程管理ＮＯの工程オーダが不足しています。工程オーダと品目工程マスタを確認してください。\n工程ＣＤ：{1}\n工程連番：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0079',
	'W',
	'下記のいずれか1つは指定する必要があります。\n指図予定数量、出来高予定数量');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0080',
	'W',
	'オーダ区分が「1.製造」以外で、指図予定数量と出来高予定数量が異なっている場合、指図予定数を出来高予定数に設定します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0081',
	'W',
	'確定以降のオーダを訂正・取消できません。\n品目オーダＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0082' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0082',
	'W',
	'引当可能な在庫、受払予定が存在しません。\n品目：{1}\n投入場所：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0083',
	'W',
	'対象の品目オーダは確定されているため、反映解除できません。\n品目オーダＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0084' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0084',
	'W',
	'ＭＰＳ品目マスタに登録されていません。\n品目：{1}\nワーキンググループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0085',
	'W',
	'依頼数が生産可能数を超過したため、以下の数量分の日次生産依頼が作成できませんでした。 \n品目：{1}\nＭＰＳグループ：{2}\n生産年月：{3}\n依頼残数:：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0086',
	'W',
	'割付可能な稼動日がありません。\n期間開始：{1}\n期間終了：{2}\nカレンダＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0087',
	'I',
	'格納先場所と依頼先場所のワークグループが同一のため、オーダ区分をＷＧ間移送から移送へ変更しました。\n場所：{1}\n場所ＷＧ：{2}\n依頼先場所：{3}\n依頼先ＷＧ：{4}\n品目：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0088',
	'I',
	'格納先場所と依頼先場所のワークグループが異なるため、オーダ区分を移送からＷＧ間移送へ変更しました。\n場所：{1}\n場所ＷＧ：{2}\n依頼先場所：{3}\n依頼先ＷＧ：{4}\n品目：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0089' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0089',
	'I',
	'品目オーダＮＯに対応する保存の工程オーダが存在するため、品目オーダの品目オーダ状況を未確定から保存へ変更しました。\n品目オーダＮＯ：{1}\n品目：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0090' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0090',
	'W',
	'工程オーダの工程指図数が品目オーダの指図予定数と一致ではありません。\n品目オーダＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0091' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0091',
	'W',
	'工程指図数の合計が指図予定数と一致していません。\n工程ＣＤ：{1}\n工程連番：{2}\n工程指図数合計：{3}\n指図予定数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0092' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0092',
	'W',
	'工程指図数には0以下の値を指定できません。\n工程ＣＤ：{1}\n工程連番：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0093' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0093',
	'W',
	'工程着手予定日時≦工程終了予定日時の関係で指定してください。\n工程着手予定日時：{1}\n工程終了予定日時：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0094' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0094',
	'W',
	'シミュレーションＮＯのＷＧと異なるＷＧの格納場所は登録できません。ＷＧ：{1} 格納場所：{2} {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0095' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0095',
	'W',
	'ＷＧを訂正することはできません。ＷＧ：{1} 訂正前ＷＧ：{2} {3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0096',
	'W',
	'指定したシミュレーションＮＯに紐づかない所要ＮＯが指定されています。\n指定シミュレーションＮＯ：{1}\n所要ＮＯ：{2}\nシミュレーションＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0097',
	'W',
	'想定しないステータスのデータが含まれてます。\n変更前品目オーダ負荷状況区分：{1}\n変更後品目オーダ負荷状況区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0098',
	'I',
	'オーダ自動確定処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0099',
	'I',
	'オーダ自動確定処理が終了しました。\n処理対象：{1}\n確定件数：{2}\nエラー件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0100',
	'W',
	'所要量計算排他情報をロックできませんでした。処理を中止します。\nワーキンググループ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0101',
	'W',
	'所要量計算排他情報を登録できませんでした。処理を中止します。\nワーキンググループ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0102',
	'W',
	'取引先禁止マスタで所要の登録が禁止されています。\n取引先：{1}\n納期：{2}\n禁止日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0103',
	'W',
	'取引先禁止マスタでオーダ禁止取引先となっているため登録・訂正ができません。\n取引先：{1}\nオーダ禁止日：{2}\nマスタ適用日：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0104',
	'I',
	'所要量計算処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0105',
	'I',
	'所要量計算処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0106',
	'I',
	'先行手配用所要量計算処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0107',
	'I',
	'先行手配用所要量計算処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0108',
	'W',
	'生産計画立案区分が「2.月次生産依頼機能を使用」ではないため、登録・訂正できません。\n品目：{1}\nワーキンググループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL0109',
	'I',
	'生産計画立案区分が「2.月次生産依頼機能を使用」ではないため、日ばらし処理の対象外にします。\n品目：{1}\nワーキンググループＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1001',
	'W',
	'製造指図ＮＯ、分割連番、工程に対する工程実績が登録されていません。\n製造指図ＮＯ、分割連番、工程を指定した場合、対応する工程実績を事前に登録しておく必要があります。\n製造指図ＮＯ：{1}\n分割連番：{2}\n工程ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1002',
	'W',
	'工数予定に対応する工程実績が登録されていません。\n工数実績を登録するためには、事前に工程実績を登録する必要があります。\n工程指図ＮＯ：{1}\n分割連番：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1003',
	'W',
	'投入実績に対して不正な在庫識別区分が指定されているため、登録できません。\n在庫識別区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1004',
	'W',
	'投入品に不良品のロットが指定されています。\n投入品：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1005',
	'W',
	'指図時にロット指定が必要な投入品ですが、サブロットＮＯが指定されていません。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1006',
	'I',
	'指図時にロット指定が必要な投入品ですが、サブロットＮＯが指定されていないため、\n製造状況を指図保存として登録しました。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1007',
	'W',
	'外注製造指図が、発注訂正・取消不可となっているため、処理できません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1008',
	'W',
	'外注製造指図が承認済みのため、処理できません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1009',
	'W',
	'外注製造実績が登録済みのため、処理できません。\n発注明細ＮＯ：{1}\n製造指図ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1010',
	'W',
	'外注製造指図に未指図数量が残っているため、処理できません。\n発注明細ＮＯ：{1}\n製造指図ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1011',
	'W',
	'外注製造指図が分割されているため、処理できません。\n発注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1012',
	'W',
	'既に製造指図済の発注予定は、他の発注予定と同一の発注明細にまとめられません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1013',
	'W',
	'再入荷予定に対応する外注製造指図が、発注訂正・取消不可となっているため、処理できません。\n仕入実績明細ＮＯ:{1}\n製造指図ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1014',
	'W',
	'再入荷予定に対応する外注製造指図が承認済みのため、処理できません。\n仕入実績明細ＮＯ:{1}\n製造指図ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1015',
	'W',
	'再入荷予定に対応する外注製造実績が登録済みのため、処理できません。\n仕入実績明細ＮＯ:{1}\n製造指図ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1016',
	'W',
	'外注製造指図が承認済みのため、打切できません。\n入荷予定ＮＯ：{1}\n製造指図ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1017',
	'W',
	'外注製造実績が登録済みのため、打切できません。\n入荷予定ＮＯ：{1}\n製造指図ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1018',
	'W',
	'同一製造指図の入荷予定の打切数量と製造指図数量が異なるため、入荷予定の打切はできません。\n同一製造指図の入荷予定は同時に打切してください。\n入荷予定ＮＯ：{1}\n製造指図ＮＯ：{2}\n打切対象の入荷予定の基準単位数量：{3}\n打切対象の入荷予定の基準単位合計数量：{4}\n製造指図数量：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1019',
	'W',
	'指定した製造指図ＮＯの製造指図が存在しません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1020',
	'W',
	'製造指図ＮＯが指定されていないため、打切できません。\n入荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1021',
	'W',
	'既に製造着手されているため、製造指図承認の取消はできません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1022',
	'W',
	'製造承認対象の製造指図ではないため、処理できません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1023',
	'W',
	'入荷・仕入実績の登録前に外注製造実績の登録が必要な外注製造場所ですが、\n外注製造実績が登録されていないため、処理できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1024',
	'W',
	'外注製造指図が承認されていないため、処理できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1025',
	'W',
	'外注製造実績が既に承認されているため、処理できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1026',
	'W',
	'指図時にロット指定が必要な投入品ですが、ロットＮＯが指定されていません。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1027',
	'I',
	'指図時にロット指定が必要な投入品ですが、ロットＮＯが指定されていないため、\n製造状況を指図保存として登録しました。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1028',
	'W',
	'引当可能な在庫・入庫予定が存在しないため、処理できません。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1029',
	'I',
	'引当可能な在庫・入庫予定が存在しないため、製造状況を指図保存として登録しました。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1030',
	'W',
	'ロットＮＯの混在が不可の投入品でロットが混在しているため、処理できません。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1031',
	'W',
	'サブロットＮＯの混在が不可の投入品でサブロットが混在しているため、処理できません。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1032',
	'W',
	'混在不可の代替グループ内で投入品が混在しているため、処理できません。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1033',
	'W',
	'ＢＯＭマスタに存在しない投入品は追加できません。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1034',
	'W',
	'指図対象の工程が１件もありません。対象の工程を選択してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1035',
	'W',
	'品目禁止マスタにおいて、製造指図が禁止されている品目です。\n品目：{1}\n製造指図日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1036',
	'W',
	'取引先禁止マスタにおいて、製造指図が禁止されている外注先です。\n外注先ＣＤ：{1}\n製造指図日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1037',
	'W',
	'製造指図時にロットを発番する品目としてマスタ設定されていますが、ロットＮＯ、サブロットＮＯが発番できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1038',
	'W',
	'製造指図承認日よりも過去の着手実績日が指定されています。\n製造指図承認日：{1}\n着手実績日:{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1039',
	'W',
	'外注品の入荷・仕入に先行して製造実績登録することが、許可されていない製造場所です。\n外注製造実績を先行して登録することを許可する場合は、場所マスタにて、外注製造場所の「外注実績先行」をオンにしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1040',
	'W',
	'既に発注済のため、発注明細に紐付く外注製造指図は取り消しできません。\n発注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1041',
	'W',
	'既に入荷実績または仕入実績が登録されているため、外注製造実績の取り消しはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1042',
	'W',
	'製造指図が承認されていないため、製造実績の登録はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1043',
	'W',
	'既に製造実績が承認されているため、製造実績の訂正・取り消しはできません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1044',
	'W',
	'指定したロットの有効期限が投入予定日より古いため、処理できません。\n有効期限：{1}\n投入予定日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1045',
	'W',
	'指定したロットの有効期限が投入実績日より古いため、処理できません。\n有効期限：{1}\n投入実績日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1046',
	'I',
	'製造指図の登録後に品目工程マスタが変更されていますが、既に実績が登録されている工程のため、\n再展開しませんでした。\n工程ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1047',
	'I',
	'製造指図の登録後にＢＯＭマスタが変更されていますが、既に実績が登録されている投入品のため、\nＢＯＭマスタの変更を反映しませんでした。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1048',
	'I',
	'製造指図の登録後にＢＯＭマスタが変更されていますが、既に実績が登録されている副産品のため、\nＢＯＭマスタの変更を反映しませんでした。\n副産品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1049',
	'I',
	'製造指図の登録後に工程工数マスタが変更されていますが、既に実績が登録されている工数予定のため、\n工程工数マスタの変更を反映しませんでした。\n工数管理ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1050',
	'W',
	'指図時に引当が必須の投入品のため、引当をオンにしてください。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1051',
	'W',
	'外注品に対する発注が登録されていないため、製造実績は登録できません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1052',
	'I',
	'ロット管理しない品目のため、ロットＮＯを発番しませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1053',
	'I',
	'サブロット管理しない品目のため、サブロットＮＯを発番しませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1054',
	'W',
	'製造実績を登録する場合、１件以上の工程実績を登録する必要があります。\n製造指図ＮＯ：{1}\n製造実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1055',
	'W',
	'前回改訂番号の製造指図から変更がないため、工程・ＢＯＭマスタ変更リスト発行はできません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1056',
	'I',
	'既にロットＮＯが指定されているため、ロットＮＯを発番しませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1057',
	'I',
	'既にサブロットＮＯが指定されているため、サブロットＮＯを発番しませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1058',
	'W',
	'外注品に対する発注が承認されていないため、製造実績は登録できません。\n発注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1059',
	'I',
	'製造指図の承認依頼が登録されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1060',
	'I',
	'製造指図の承認依頼が取り消されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1061',
	'I',
	'製造指図が承認されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1062',
	'I',
	'製造指図の承認が取り消されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1063',
	'I',
	'製造実績の承認依頼が登録されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1064',
	'I',
	'製造実績の承認依頼が取り消されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1065',
	'I',
	'製造実績が承認されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1066',
	'I',
	'製造実績の承認が取り消されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1067',
	'W',
	'既に在庫締が行われているため、登録できません。\n着手計上日：{1}\n製造指図ＮＯ：{2}\n製造実績ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1068',
	'W',
	'既に在庫締が行われているため、登録できません。\n終了計上日：{1}\n製造指図ＮＯ：{2}\n製造実績ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1069',
	'W',
	'既に在庫締が行われているため、登録できません。\n更新前の着手計上日：{1}\n製造指図ＮＯ：{2}\n製造実績ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1070',
	'W',
	'既に在庫締が行われているため、登録できません。\n更新前の終了計上日：{1}\n製造指図ＮＯ：{2}\n製造実績ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1071',
	'W',
	'投入実績に対応する支給実績が登録されているため、投入場所・在庫着荷先・在庫識別区分は変更できません。\n変更する場合は、投入実績を削除後に再度投入実績を登録してください。\n更新前の投入場所ＣＤ：{1}\n更新前の在庫着荷先ＣＤ：{2}\n更新前の在庫識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1072',
	'W',
	'既に外注品に対する発注が登録されているため、発注数量以上の指図数量は指定できません。\n発注数量：{1}\n指定した指図数量：{2}\n同一発注明細の他の製造指図数量：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1073',
	'W',
	'指図日よりも過去の承認日が指定されています。\n指図日：{1}\n承認日:{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1074',
	'W',
	'完了実績日よりも過去の承認日が指定されています。\n完了実績日：{1}\n承認日:{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1075',
	'W',
	'既に在庫締が行われているため、登録できません。\n更新前の計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1076',
	'W',
	'実績に対応する工程実績が更新対象となっていないため、処理できません。\n対応する工程実績も更新対象としてください\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1077',
	'W',
	'使用可能な在庫・入庫予定が不足しているため、処理できません。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1078',
	'I',
	'投入引当処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1079',
	'I',
	'投入引当処理が終了しました。\n処理対象の製造指図件数：{1}\n全投入品の引当が成功した製造指図件数：{2}\n一部でも引当が失敗した製造指図件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1080',
	'I',
	'バックフラッシュ処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1081',
	'I',
	'バックフラッシュ処理が終了しました。\n処理対象の工程実績件数：{1}\n全投入品の登録が成功した工程実績件数：{2}\n一部でも登録が失敗した工程実績件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1082' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1082',
	'W',
	'ワーキンググループＣＤが指定されていないため処理を行いませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1083',
	'I',
	'引当できなかった投入品が存在します。\n引当対象の投入品の件数：{1}\n引当が成功した件数：{2}\n引当が失敗した件数：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1084' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1084',
	'W',
	'出来高計上の有無が変わるような出来高区分・出来高理由の変更はできません。\n変更する場合は、出来高実績を削除後に再度出来高実績を登録してください。\n出来高実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1085',
	'I',
	'実績登録できなかった投入品が存在します。\n実績登録対象の投入品の件数：{1}\n実績登録が成功した投入品の件数：{2}\n実績登録が失敗した投入品の件数：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1086',
	'W',
	'製造指図の状況が指図保存のため、実績の登録ができません。\n先に製造指図を指図済にしてください。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1087',
	'W',
	'既に製造指図が打切済のため、処理できません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1088',
	'W',
	'出来高実績が登録されていないため、工程実績の終了実績日は指定できません。\n製造指図ＮＯ：{1}\n工程指図ＮＯ：{2}\n出来高予定ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1089' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1089',
	'W',
	'副産品実績が登録されていないため、工程実績の終了実績日は指定できません。\n製造指図ＮＯ：{1}\n工程指図ＮＯ：{2}\n出来高予定ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1090' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1090',
	'W',
	'発注数量と再入荷予定数量の合計以上の指図数量は指定できません。\n発注数量：{1}\n再入荷予定数量：{2}\n指定した指図数量：{3}\n同一発注明細の他の製造指図数量：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1091' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1091',
	'W',
	'再入荷予定に紐付く製造指図は取り消しできません。\n製造指図ＮＯ：{1}\n入荷予定ＮＯ：{2}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1092' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1092',
	'W',
	'再入荷予定に対応する外注製造指図が分割済みのため、処理できません。\n仕入実績明細ＮＯ:{1}\n製造指図ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1093' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1093',
	'W',
	'製造指図ＮＯが指定されていないため、処理できません。\n仕入実績明細ＮＯ:{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1094' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1094',
	'W',
	'製造実績を完了する場合、全ての工程実績に対して終了実績日を指定し、未完了フラグをオフにしてください。\n製造指図ＮＯ:{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1095' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1095',
	'W',
	'製造指図の状況が指図保存のため、製造指図書発行はできません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1096',
	'W',
	'製造実績が完了していないため、製造記録書発行はできません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1097',
	'W',
	'工程実績が完了しているため、出来高実績を削除できません。\n出来高実績を削除する場合は、工程実績の終了実績日をクリアするか、未完了フラグをオンにしてください。\n製造指図ＮＯ：{1}\n工程実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1098',
	'W',
	'工程実績が完了しているため、副産品実績を削除できません。\n副産品実績を削除する場合は、工程実績の終了実績日をクリアするか、未完了フラグをオンにしてください。\n製造指図ＮＯ：{1}\n工程実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1099',
	'I',
	'使用可能な在庫が不足しているため、投入実績を登録しませんでした。\n投入品：{1}\n製造指図ＮＯ：{2}\n製造実績ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1100',
	'I',
	'使用可能な在庫または投入場所への入庫予定が不足しているため、投入実績を登録しませんでした。\nマイナス在庫を許可する投入品であっても、投入実績を登録するためには使用可能な入庫予定が存在する必要があります。\n投入品：{1}\n製造指図ＮＯ：{2}\n製造実績ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1101',
	'W',
	'計画外製造指図の場合、未指図打切はできません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1102',
	'W',
	'製造指図が打切済のため、製造指図書発行はできません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1103',
	'W',
	'取消済の製造指図の訂正はできません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1104',
	'W',
	'指定された工数予定ＮＯ、分割連番に対応する工数予定が存在しません。\n工数予定ＮＯ：{1}\n分割連番：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1105',
	'W',
	'ロット情報と異なる版ＮＯは指定できません。\n品目：{1}\n指定した版ＮＯ：{2}\nロット情報の版ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1106',
	'W',
	'受注紐付きの外注製造指図の場合、手配ＮＯは変更できません。\n受注明細ＮＯ：{1}\n変更前の値\n{2}：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1107',
	'I',
	'バックフラッシュでロット提案を実施しましたが、他の投入実績とロットが混在してしまうため、\n投入実績を登録しませんでした。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1108',
	'I',
	'バックフラッシュでロット提案を実施しましたが、他の投入実績とサブロットが混在してしまうため、\n投入実績を登録しませんでした。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1109',
	'W',
	'工程単位製造指図の場合、最初に登録した製造指図を取り消すためには、\n後で登録した製造指図がすべて取り消されている必要があります。\n同じ品目製造指図ＮＯに紐付く他の製造指図を先に取り消してください。\n製造指図ＮＯ：{1}\n品目製造指図ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1110',
	'I',
	'バックフラッシュで使用する出来高実績が登録されていないため、投入実績を登録しませんでした。\n出来高を元にバックフラッシュする場合は、数量が0より大きい出来高実績を事前に登録する必要があります。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1111',
	'I',
	'バックフラッシュで使用する工程実績が登録されていないため、投入実績を登録しませんでした。\n工程実績を元にバックフラッシュする場合は、数量が0より大きく、終了日が指定された工程実績を\n事前に登録する必要があります。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1112',
	'W',
	'投入制御区分が「3:ＭＲＰ対象外（指図書のみ）」の投入品は引当できません。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1113',
	'W',
	'仕入直送の外注製造指図の場合、製造指図数量は変更できません。\n製造指図ＮＯ：{1}\n変更前数量：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1114',
	'W',
	'仕入直送の外注製造指図の場合、格納先場所は変更できません。\n製造指図ＮＯ：{1}\n変更前格納先場所：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1115',
	'W',
	'同じ工程、代替グループ、代替グループ連番に代替品目指定がオンの品目が存在する場合、\n代替品目指定がオフの品目の引当フラグをオンにすることはできません。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1116',
	'W',
	'同じ工程、代替グループ、代替グループ連番に代替品目指定がオンの品目が存在する場合、\n代替品目指定がオフの品目の投入数量、必要数量、固定必要数量はすべて0にしてください。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1117',
	'W',
	'必要数量と固定必要数量の何れか一方に、0より大きい数値を入力してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1118',
	'W',
	'工数（数量依存）と工数（固定）の何れか一方に、0より大きい数値を入力してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1119',
	'W',
	'自給品は引当できません。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1120',
	'I',
	'ロットＮＯが自動発番できなかったため、製造状況を指図保存に変更しました。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1121',
	'I',
	'サブロットＮＯが自動発番できなかったため、製造状況を指図保存に変更しました。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1122',
	'W',
	'未指図打切済のため、製造指図の取り消しはできません。\n先に未指図打切をオフに訂正してください。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1123',
	'W',
	'残数打切済のため、製造実績の取り消しはできません。\n先に残数打切をオフに訂正してください。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1124',
	'W',
	'既に製造指図が承認されているため、製造指図の訂正・取り消しはできません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1125',
	'W',
	'既に製造実績が登録されているため、製造指図の取り消しはできません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1126',
	'W',
	'製造実績が完了しているため、工程実績は削除できません。\n製造指図ＮＯ：{1}\n工程実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1127',
	'W',
	'既に実績登録済みのため、削除できません。\n{1}：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1128' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1128',
	'W',
	'出来高予定が１件も存在しないため、処理できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1129' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1129',
	'W',
	'工程単位製造指図の場合、最初に登録した製造指図以外は未指図打切をオンにできません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1130' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1130',
	'W',
	'指定した製造指図ＮＯのデータが存在しません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1131',
	'W',
	'ロットＮＯを自動発番できませんでした。\n品目ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1132',
	'W',
	'サブロットＮＯを自動発番できませんでした。\n品目ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1133',
	'W',
	'使用可能な在庫または投入場所への入庫予定が不足しているため、処理できません。\nマイナス在庫を許可する投入品であっても、投入実績を登録するためには使用可能な入庫予定が存在する必要があります。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1134' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1134',
	'W',
	'打切がオフの場合、投入数量、ロス数量、固定ロス数量の何れか一つに0より大きい数値を入力してください。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1135' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1135',
	'W',
	'打切がオフの場合、工数には0より大きい数値を入力してください。\n工数：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1136' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1136',
	'W',
	'工数実績一覧登録画面で工数実績が追加されているため、取消できません。\n追加した工数実績を先に取り消してください。\n製造実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1137' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1137',
	'W',
	'在庫識別区分が「9.自給」の投入品は追加できません。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1138' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1138',
	'W',
	'終了時刻は{1}から{2}までの時刻でなければなりません。\n日付をまたいだ工数実績を登録する場合は、日付ごとに行を分けて登録する必要があります。\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1139' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1139',
	'I',
	'子品目に有償支給品を含む外注に対して内税の税ＣＤが指定されているため、単価を計算できませんでした。\n品目：{1}\n発注先：{2}\n税：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1201' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1201',
	'W',
	'ＩＦ送信済のため更新できません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1202' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1202',
	'I',
	'工程実績完了処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1203' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1203',
	'I',
	'工程実績完了処理が終了しました。 \n処理対象の工程実績件数：{1} \n処理が成功した工程実績件数：{2} \n処理が失敗した工程実績件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1204' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1204',
	'W',
	'着手数量には製造残数量以下の値を入力してください。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1205' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1205',
	'W',
	'投入品の締チェックで以下のエラーが発生しました。\n製造実績ＮＯ：{1}\n投入品目：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1206' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1206',
	'W',
	'オーダ区分が「1.製造」の品目オーダに対する格納場所には、外注場所を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1207' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1207',
	'W',
	'同一製造指図の入荷予定の打切解除数量と製造指図数量が異なるため、入荷予定の打切解除はできません。\n同一製造指図の入荷予定は同時に打切解除してください。\n入荷予定ＮＯ：{1}\n製造指図ＮＯ：{2}\n打切解除対象の入荷予定の基準単位数量：{3}\n打切解除対象の入荷予定の基準単位合計数量：{4}\n製造指図数量：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1208' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1208',
	'W',
	'オーダ区分が「1.製造」の品目オーダに対する製造場所には、社外場所を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1209' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1209',
	'W',
	'オーダ区分が「3.外注」の品目オーダに対する製造場所には、社内場所を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1210' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1210',
	'W',
	'オーダ区分が「4.移送」の品目オーダには、製造場所または発注先は指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1211' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1211',
	'W',
	'同じ工程、工程連番の同一子品目のレコードでロット混在もしくはサブロット混在を異なる設定にできません。\n投入品：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1212' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1212',
	'W',
	'製造指図承認日よりも過去の実績日が指定されています。\n製造指図承認日：{1}\n実績日:{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1213' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1213',
	'I',
	'同一製造指図に紐づく工程のうち、一部工程のみ製造指図することはできないため、\n製造状況を指図保存として登録しました。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1214' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1214',
	'W',
	'実績が登録済みの工程指図に対して、出来高計上工程フラグが変更されるような訂正はできません。\n先に工程実績を取り消してください。\n工程指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1215' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1215',
	'W',
	'削除対象の工程に紐づく出来高予定があります。\n再検索後、工程を手動で削除してください。\n工程指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1301' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1301',
	'W',
	'製造状況区分には、着手中あるいは完了を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1302' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1302',
	'W',
	'計画外実績として製造承認対象の品目は登録できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1303' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1303',
	'W',
	'計画外実績として製造品以外は指定できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1304' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1304',
	'W',
	'計画外実績としてロットＮＯ発番パタンが子品目ロット引継ぎの品目は登録できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1305' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1305',
	'W',
	'計画外実績として外注品は指定できません。\n品目：{1}\n製造場所：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1306' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1306',
	'W',
	'製造場所と格納場所のワーキンググループが異なるため登録できません。\n製造場所：{1}\n製造場所ワーキンググループＣＤ：{2}\n格納場所：{3}\n格納場所ワーキンググループＣＤ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1308' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1308',
	'W',
	'工程が削除されています。品目工程マスタに登録されているすべての工程を登録する必要があります。\n品目：{1}\n工程パタン：{2}\n場所：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1309' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1309',
	'W',
	'工程ＣＤが品目工程マスタに登録されていません。\n品目：{1}\n工程パタン：{2}\n場所：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1310' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1310',
	'I',
	'発注予定日が運用日付よりも過去日であるオーダが確定されました。\n品目オーダＮＯ：{1}\n発注予定日：{2}\n運用日付：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1311' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1311',
	'W',
	'ロットＮＯまたはサブロットＮＯを自動発番できませんでした。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1312' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1312',
	'W',
	'既に納入指示または納期回答受領が登録されているため、発注明細に紐付く外注製造指図は取り消しできません。\n発注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1313' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1313',
	'W',
	'納入指示の合計数量よりも少ない指図数量は指定できません。\n納入指示数量合計（基準単位）：{1}\n指定した指図数量：{2}\n発注明細ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1314' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1314',
	'W',
	'納期回答受領の合計数量よりも少ない指図数量は指定できません。\n回答数量合計（基準単位）：{1}\n指定した指図数量：{2}\n発注明細ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1315' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1315',
	'W',
	'オーダ受信されたオーダのため、オーダ確認画面では更新できません。\n更新する場合は、オーダ登録画面で行ってください。\n品目オーダＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1316' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1316',
	'W',
	'場所マスタに有効な場所として登録されていません。\n指図時の投入場所ＣＤ：{1}\n投入予定ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1317' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1317',
	'W',
	'場所マスタに有効な場所として登録されていません。\n指図時の格納場所ＣＤ：{1}\n出来高予定ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1318' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1318',
	'W',
	'ロットＮＯの混在が不可の投入品でロットが混在しているため、処理できません。\n製造実績ＮＯ：{1}\n投入予定ＮＯ：{2}\n投入品：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1319' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1319',
	'W',
	'サブロットＮＯの混在が不可の投入品でサブロットが混在しているため、処理できません。\n製造実績ＮＯ：{1}\n投入予定ＮＯ：{2}\n投入品：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1320' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1320',
	'W',
	'混在不可の代替グループ内で投入品が混在しているため、処理できません。\n製造実績ＮＯ：{1}\n投入予定ＮＯ：{2}\n投入品：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1321' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1321',
	'W',
	'エラーにより、すべてのデータの更新処理が失敗しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1401' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1401',
	'W',
	'スケジューラ凍結対象のオーダのため、更新できません。\n品目オーダＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1402' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1402',
	'W',
	'スケジューラ凍結対象のオーダのため、ファイル取込できません。\n品目オーダＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1403' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1403',
	'W',
	'指定した品目オーダＮＯの品目オーダ情報が存在しません。\n品目オーダＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBCL1404' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBCL1404',
	'W',
	'ファイルを保存することができませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0001',
	'W',
	'下請法対象取引先の発注先に対する納入希望日は、仕入予定日と同日である必要があります。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0003',
	'W',
	'基準単位数量から数量を換算できない単位です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0004',
	'W',
	'発注ヘッダ情報が異なる明細が選択されているため、遷移できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0005',
	'I',
	'単価が変更されました。\n項目名：{1}\n変更前単価：{2}\n最新単価：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0006',
	'I',
	'納入場所の場所グループ（ワーキンググループ）が変更されました。\n処理を続行しますか？\n変更前ワーキンググループ：{1}\n変更後ワーキンググループ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0007',
	'W',
	'以下の項目が他行と異なるため、まとめることができません。\n{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0008',
	'W',
	'単価取得対象が存在しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0009',
	'W',
	'製造指図済の明細をまとめることはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0010',
	'I',
	'繰越処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0011',
	'W',
	'検査不合格の在庫を検収しようとしています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0012',
	'W',
	'外注品の明細が含まれているため、参照登録はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0013',
	'I',
	'単価再取得対象がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0014',
	'W',
	'単価再取得処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0015',
	'I',
	'依頼元の情報を反映します（納入場所、棚・ライン、納品先情報、配送先情報）。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0016',
	'I',
	'予定日・マスタ取得処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0017',
	'I',
	'対象の明細をまとめます。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0018',
	'I',
	'納入場所の場所グループ（物流グループ）が変更されました。\n処理を続行しますか？\n変更前物流グループ：{1}\n変更後物流グループ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0019',
	'I',
	'納入場所の場所グループ（製造場所グループ）が変更されました。\n処理を続行しますか？\n変更前製造場所グループ：{1}\n変更後製造場所グループ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0020',
	'W',
	'まとめ対象がありません。2件以上の明細を選択してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0021',
	'W',
	'入荷実績あるいは仕入実績が登録済みの明細をまとめることはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0022',
	'W',
	'購買識別区分が無償受給、ＶＭＩ以外の入荷実績のため引継できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0023',
	'I',
	'単価取得処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0024',
	'I',
	'単価取得処理を実行しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0025',
	'I',
	'為替レート取得処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0026',
	'I',
	'為替レート取得処理を実行しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0027',
	'W',
	'基準通貨以外の行が選択されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0028',
	'I',
	'税取得処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0029',
	'I',
	'税取得処理を実行しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0030',
	'W',
	'計画外の登録では下請対象の発注先は指定できません。\n発注先：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0031',
	'W',
	'仕入実績登録画面ではインボイス取引対象の発注先は指定できません。\n発注先：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0032',
	'W',
	'明細に対応する詳細行の納入場所のＷＧ、または物流倉庫ＣＤが全行で一致していません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0033',
	'W',
	'売上返品登録により登録されている仕入返品実績の為、訂正または取消できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0034',
	'W',
	'手配依頼の明細が含まれているため、参照登録はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0035',
	'W',
	'値引品目の明細をまとめることはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0036',
	'I',
	'単価が変更されました。金額が負の値になったため、値引額と値引理由をクリアしました。\n値引額と値引理由を再入力してください。\n変更前値引額：{1}\n変更前値引理由：{2}\n変更前値引理由名：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0037',
	'I',
	'検査が完了されていませんが、仕入実績を登録しますか？\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0100',
	'W',
	'検索モードに「ヘッダ」を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDP0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDP0101',
	'W',
	'操作種別に「帳票発行」を指定する、または、操作種別に「返品実績を参照する」を指定し、検索モードに「ヘッダ」を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0001',
	'W',
	'打切り可能な予定が存在しません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0002',
	'W',
	'仕入対象外の仕入予定に対して仕入実績を計上できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0003',
	'W',
	'発注訂正理由に登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0004',
	'W',
	'対応する発注情報明細が見つかりません。\n発注ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0005',
	'W',
	'在庫識別区分には「自社在庫」、「ＶＭＩ」、「検収不良」、「無償受給」、「有償支給」のいずれかを指定してください。\n在庫識別区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0006',
	'W',
	'在庫識別区分に「有償支給」を指定する場合は、返品元場所には外注場所を指定してください。\n返品元場所ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0007',
	'W',
	'返品対象に自社資産在庫が含まれる場合、通貨を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0008',
	'W',
	'ＶＭＩ品の買掛計上処理で、税ＣＤが取得できませんでした。マスタ設定を確認してください。\n品目：{1}\n適用日：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0009',
	'W',
	'ＶＭＩ品の買掛計上処理で、為替レートが取得できませんでした。マスタ設定を確認してください。\n換算元通貨：{1}\n換算先通貨：{2}\n適用日：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0010',
	'W',
	'ＶＭＩ品の買掛計上処理で、単価が取得できませんでした。マスタ設定を確認してください。\n品目：{1}\n発注先：{2}\nメーカ：{3}\n単位：{4}\n通貨：{5}\nＷＧ：{6}\n適用日：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0011',
	'W',
	'分割されていないため、登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0012',
	'W',
	'仕入直送は分割できません。\n発注予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0013',
	'W',
	'値引品目は分割できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0014',
	'I',
	'発注が承認されていないため、注文書は発行できません。\n発注ＮＯ：{1}\n承認ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0015',
	'W',
	'発注が承認されていないため、納入指示書は発行できません。\n発注ＮＯ：{1}\n納入指示ＮＯ：{2}\n承認ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0016',
	'I',
	'発注が承認されていないため、納品書は発行できません。\n発注ＮＯ：{1}\n承認ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0017',
	'W',
	'既に仕入返品実績が登録されているため、仕入返品予定は取消できません。\n仕入返品予定ＮＯ：{1}\n仕入返品実績ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0018',
	'W',
	'未引当の在庫が存在しません。引当済みの在庫は使用できません。\n品目：{1}\n場所：{2}\n棚・ライン：{3}\nロットＮＯ：{4}\nサブロットＮＯ：{5}\n手配ＮＯ：{6}\n荷姿単位：{7}\n格付：{8}\n良品区分：{9}\n在庫識別区分：{10}\n在庫取引先：{11}\n在庫着荷先：{12}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0019',
	'W',
	'詳細の値が明細の値と異なります。明細に値が設定されている場合は、詳細にも同じ値を指定して下さい。\n項目名：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0020',
	'I',
	'購買内示情報登録処理が開始しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0021',
	'I',
	'購買内示情報登録処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0022',
	'W',
	'購買内示情報登録処理にエラーが発生したため、購買内示情報は登録できませんでした。\n内示日：{1}\n発注先ＣＤ：{2}\nワーキンググループ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0023',
	'W',
	'帳票発行済のため削除できません。取消帳票を発行後に削除してください。\n内示日：{1}\n発注先ＣＤ：{2}\nワーキンググループ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0024',
	'I',
	'購買内示情報削除処理が開始しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0025',
	'I',
	'購買内示情報削除処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0026',
	'W',
	'購買内示情報削除処理にエラーが発生したため、購買内示情報は削除できませんでした。\n内示日：{1}\n発注先ＣＤ：{2}\nワーキンググループ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0027',
	'W',
	'分割先の明細が既に分割されているため、取消できません。\n発注予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0028',
	'W',
	'仕入・入荷禁止の発注先のため、仕入実績は登録できません。\n発注先：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0029',
	'W',
	'仕入・入荷禁止の品目のため、仕入実績は登録できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0030',
	'W',
	'受領インボイス登録されている仕入予定に対する仕入実績は、受領インボイス単位で登録・訂正してください。\n受領インボイス管理ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0031',
	'W',
	'受領インボイス登録されている仕入予定に対する仕入実績は、受領インボイス単位で削除してください。\n受領インボイス管理ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0032',
	'W',
	'未入荷で仕入のみを登録、または訂正する場合、仕入予定を打切ることはできません。\n仕入予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0033',
	'W',
	'予定に対して既に入荷実績が存在する為、仕入実績のみを登録することはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0034',
	'W',
	'既に入荷実績が登録されているため、入荷実績を新規登録することはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0035',
	'W',
	'入荷後に仕入を行う場合、入荷数量より多くの仕入数量を登録することはできません。\n入荷実績ＮＯ：{1}\n入荷数量（基準単位）：{2}\n仕入数量（基準単位）：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0036',
	'W',
	'対応する入荷実績の登録件数と仕入実績受払の登録件数が異なるため、入荷実績を同時に訂正できません。\n入荷実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0037',
	'W',
	'対応する入荷実績の入荷数と仕入実績受払の仕入数が異なるため、入荷実績を同時に訂正することはできません。\n入荷実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0038',
	'W',
	'対応する入荷実績の登録件数と仕入実績受払の登録件数が異なるため、入荷実績を同時に取り消すことはできません。\n入荷実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0039',
	'W',
	'対応する入荷実績の入荷数と仕入実績受払の仕入数が異なるため、入荷実績を同時に取り消すことはできません。\n入荷実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0040',
	'W',
	'未入荷で仕入のみを登録する場合、仕入予定数より少ない仕入数で登録することはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0041',
	'W',
	'既に入荷実績が登録されているため、仕入実績の数量・場所などの訂正はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0042',
	'W',
	'仕入数量が仕入直送売上の売上数量よりも少なくなるため、訂正することはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0043',
	'W',
	'仕入数量が仕入直送売上の売上数量よりも少なくなるため、削除することはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0044',
	'W',
	'既に入荷実績が登録されているため、仕入実績受払の数量・場所などの変更はできません。\n入荷実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0045',
	'W',
	'既に入荷実績が登録されているため、仕入実績受払のみを削除することはできません。\n入荷実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0046',
	'W',
	'発注が打切されているため、仕入実績を登録することはできません。\n発注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0047',
	'W',
	'数量0で打切ることはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0048',
	'W',
	'仕入予定が打切られているため、仕入実績を登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0049',
	'W',
	'1つの仕入予定に対して、複数の仕入実績明細を登録する場合、打切チェックは全てオン、または全てオフにしてください。\n仕入予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0050',
	'W',
	'予定数以上の数量で打切りすることはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0051',
	'W',
	'予定が打切られている仕入実績明細を取消できません。\n先に仕入予定の打切を解除して下さい。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0052',
	'W',
	'下請法対象取引先の発注先に対して、計画外の仕入実績を登録することはできません。\n発注先：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0053',
	'W',
	'下請法対象取引先の発注先に対して、仕入実績のみを登録することはできません。\n発注先：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0054',
	'W',
	'再入荷予定に対して既に納入指示または納期回答受領が登録されているため、再入荷をオフにすることはできません。\n納入指示ＮＯ：{1}\n納期回答受領ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0055',
	'W',
	'再入荷予定に対して既に納入指示または納期回答受領が登録されているため、仕入実績明細を削除することはできません。\n納入指示ＮＯ：{1}\n納期回答受領ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0056',
	'W',
	'再入荷予定に対して既に入荷実績が登録されているため、仕入実績明細を取消できません。\n入荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0057',
	'W',
	'再入荷予定数量は検収不良数量よりも多い数量で登録することはできません。\n再入荷予定数量：{1}\n検収不良数量：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0058',
	'W',
	'諸口品マスタに登録されていません。\n品目：{1}\n手配ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0059',
	'W',
	'予定時のワーキンググループと異なるワーキンググループの納入場所は登録できません。\n入荷予定の場所：{1}\n入荷予定のワーキンググループ：{2}\n納入場所：{3}\nワーキンググループ:{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0060',
	'W',
	'予定時の納入場所に設定されている発注先ＣＤと異なる発注先ＣＤが設定されている納入場所は登録できません。\n入荷予定の場所：{1}\n入荷予定の場所の発注先：{2}\n納入場所：{3}\n納入場所の発注先：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0061',
	'W',
	'指定されるワーキンググループは購買機能を持つワーキンググループとして設定されていません。\nワーキンググループ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0062',
	'W',
	'確定期間は連続する期間を指定してください。\n内示日：{1}\n発注先ＣＤ：{2}\nワーキンググループＣＤ：{3}\n品目：{4}\n内示期間開始日：{5}\n内示期間終了日：{6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0063',
	'W',
	'最小パケット以外の期間は確定期間に指定できません。\n内示日：{1}\n発注先ＣＤ：{2}\nワーキンググループＣＤ：{3}\n品目：{4}\n内示期間開始日：{5}\n内示期間終了日：{6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0064',
	'W',
	'購買内示ＮＯが同一データ内でエラーが発生しているため、処理を中止しました。\n購買内示ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0065',
	'W',
	'再入荷がオンの場合、検収不良をオフに変更することはできません。先に再入荷をオフに更新してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0066',
	'W',
	'予定時の物流グループと異なる物流グループの納入場所は指定できません。\n入荷予定の場所：{1}\n入荷予定の物流Ｇ：{2}\n納入場所：{3}\n物流Ｇ:{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0067',
	'W',
	'予定時の製造場所グループと異なる製造場所グループの納入場所は登録できません。\n入荷予定の場所：{1}\n入荷予定の製造場所Ｇ：{2}\n納入場所：{3}\n製造場所Ｇ:{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0068',
	'W',
	'対応する取引マスタが存在しません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0069',
	'W',
	'発注済のため発注予定を更新できません。\n発注予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0070',
	'W',
	'製造指図済のため発注予定を更新できません。\n発注予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0071',
	'W',
	'依頼元更新不可となっているため発注予定を更新できません。\n発注予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0072',
	'W',
	'打切済のため発注予定を更新できません。\n発注予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0073',
	'W',
	'分割済のため発注予定を更新できません。\n発注予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0074',
	'W',
	'下請法対象取引先の発注先に対する納入希望日は仕入予定日と同日である必要があります。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0075',
	'W',
	'確定されている明細が存在しないため、内示書を発行できません。\n内示日：{1}\n発注先：{2}\nワーキンググループ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0076',
	'W',
	'外注品の購買識別区分には、有償受給あるいは通常購買を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0077',
	'W',
	'支給直送の場合、購買識別区分にＶＭＩを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0078',
	'W',
	'取消の内示書を印刷していないため、取消の戻しができません。\n内示書ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0079',
	'W',
	'経費購買の場合、仕入理由には経費理由から選択してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0080',
	'W',
	'外注品を経費購買することはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0081',
	'W',
	'まとめ処理と打切を同時に行えません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0082' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0082',
	'W',
	'製造指図済の明細をまとめることはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0083',
	'W',
	'経費購買の理由を選択することはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0084' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0084',
	'W',
	'発注ＮＯに対応する発注情報が見つかりません。\n発注ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0085',
	'W',
	'既に仕入返品実績明細が登録されているため、更新できません。\n仕入返品予定明細ＮＯ：{1}\n仕入返品実績明細ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0086',
	'W',
	'返品が完了しているため、打切できません。\n仕入返品予定明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0087',
	'W',
	'次の明細項目は、詳細の同一項目に複数の値が含まれている場合は指定できません。\n項目名：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0088',
	'W',
	'対応する受注情報の納品先または配送先が変更されています。納品先取得ボタンを押下してから再度登録を行ってください。\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0089' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0089',
	'W',
	'品目禁止マスタにおいて、発注が禁止されています。\n品目：{1}\n発注日：{2}\n禁止日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0090' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0090',
	'W',
	'取引先禁止マスタにおいて、発注が禁止されています。\n発注先ＣＤ：{1}\n発注日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0091' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0091',
	'W',
	'取引先禁止マスタにおいて、発注が禁止されています。\n発注先ＣＤ：{1}\n発注日：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0092' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0092',
	'W',
	'値引品目のみの登録はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0093' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0093',
	'W',
	'次処理（入荷、仕入、受領インボイス登録）が行われているため、打切できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0094' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0094',
	'W',
	'次処理（入荷、仕入、受領インボイス登録）が行われている明細をまとめることはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0095' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0095',
	'W',
	'承認状況区分が承認中のため更新できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0096',
	'W',
	'案件の異なる手配ＮＯに変更できません。\n発注時案件：{1}\n発注明細ＮＯ：{2}\n手配ＮＯ1：{3}\n案件：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0097',
	'W',
	'複数の案件を1つの発注伝票にまとめることはできません。\n手配ＮＯ1：{1}\n案件：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0098',
	'W',
	'次処理（入荷、仕入、受領インボイス登録）が行われているため、取消できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0099',
	'W',
	'ヘッダの案件と、明細の手配ＮＯ１に対応する案件が異なるため、登録できません。\nヘッダ案件：{1}\n明細案件：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0100',
	'W',
	'打切済の発注予定は分割および分割取消できません。\n発注予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0101',
	'W',
	'発注に対して次処理（納入指示、納期回答受領、受領インボイス登録、入荷、仕入）が行われているため、承認対象となるような更新はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0102',
	'W',
	'指定された伝票には、値引対象の明細が含まれていません。\n参照仕入実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0103',
	'W',
	'上り電文が不正です。\n内示日：{1}\n発注先：{2}\nワーキンググループ：{3}\n品目：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0104',
	'W',
	'検収不良、または、全数打切の仕入情報を参照情報として仕入値引登録をすることはできません。\n仕入実績ＮＯ：{1}\n仕入実績明細ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0105',
	'W',
	'指定した製造指図ＮＯは存在しません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0106',
	'W',
	'指定した品目、手配ＮＯ、製造指図ＮＯに対応する情報が見つかりません。\n品目：{1}\n手配ＮＯ：{2}\n製造指図ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0107',
	'W',
	'指定した発注先、製造指図ＮＯに対応する情報が見つかりません。\n発注先：{1}\n製造指図ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0108',
	'W',
	'指定した製造指図の製造場所に対応する資産管理部門が負担部門と一致しません。\n負担部門：{1}\n資産管理部門：{2}\n製造指図ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0109',
	'W',
	'下請対象発注先の発注を取消・訂正する場合は訂正理由が必須です。発注ヘッダ単位で取消する場合は検索モードに「ヘッダ」を指定し、訂正理由を指定して取消してください。一部の明細を行削除する場合は、発注登録画面で訂正してください。\n発注ＮＯ：{1}\n発注明細ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0110',
	'W',
	'無償受給品、または有償受給品に対しての納入指示はできません。\n発注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0111',
	'W',
	'納期回答受領が入荷予定反映済の為、納入指示を登録できません。\n先に入荷予定反映を解除してください。\n発注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0112',
	'W',
	'納入指示に対する納期回答受領が入荷予定反映済の為、訂正できません。\n納期回答受領ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0113',
	'W',
	'納入指示に対する納期回答受領が入荷予定反映済の為、取消できません。\n納期回答受領ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0114',
	'W',
	'未入荷数量より多くの納入指示は登録できません。\n発注明細ＮＯ：{1}\n超過数量：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0115',
	'W',
	'納入指示で作成した入荷予定、または仕入予定に対して実績が計上されているため、取消できません。\n納入指示明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0116',
	'W',
	'製造指図数量よりも大きい数量での納入指示は登録できません。\n製造指図ＮＯ：{1}\n製造指図数量（基準単位）：{2}\n納入指示数量合計（基準単位）：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0117',
	'W',
	'納期回答受領日は納入指示日よりも早い日付で登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0118',
	'W',
	'入荷予定、または仕入予定に対して実績が登録されている為、解除できません。\n納期回答受領ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0119',
	'W',
	'入荷予定、または仕入予定が打切されている為、解除できません。\n納期回答受領ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0120',
	'W',
	'対象の発注情報が既に取消されているため、更新できません。\n発注ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0121',
	'W',
	'実績数量未満には更新できません。\n納入指示明細ＮＯ：{1}\n実績数量：{2}\n納入指示数量：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0122',
	'W',
	'納入指示数量よりも大きい数量での納期回答受領は登録できません。\n納入指示明細ＮＯ：{1}\n納入指示数量（基準単位）：{2}\n回答数量合計（基準単位）：{3}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0123',
	'W',
	'納入指示ヘッダに紐づく明細が1行も存在しません。\nヘッダに紐づく明細を1行以上登録対象にしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0124',
	'W',
	'納期回答受領ヘッダに紐づく明細が1行も存在しません。\nヘッダに紐づく明細を1行以上登録対象にしてください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0125',
	'W',
	'入荷予定、仕入予定に対して全数打切する場合は同時に打切してください。\n入荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0126',
	'W',
	'仕入検収済です。入荷予定を全数打切できません。\n入荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0127',
	'W',
	'入荷予定、仕入予定の残数量が同数でないため、同時に打切できません。\n入荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0128' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0128',
	'W',
	'入荷予定、仕入予定がそれぞれ実績登録済のため、同時に打切してください。\n入荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0129' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0129',
	'W',
	'検索した発注情報の発注先はインボイス取引対象のため、仕入実績登録画面では表示できません。受領インボイス登録画面で検索または更新してください。\n発注先：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0130' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0130',
	'W',
	'再入荷数量は実績数量未満には更新できません。\n仕入実績明細ＮＯ：{1}\n再入荷予定の入荷予定ＮＯ：{2}\n再入荷予定の入荷実績数量：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0131',
	'W',
	'再入荷予定に対して既に入荷実績が登録されているため、再入荷チェックをオフにできません。\n入荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0132',
	'W',
	'業務理由マスタに経費購買がオンのレコードが存在しません。\n品目:{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0133',
	'W',
	'有効なＶＭＩ購買部門が取得できません。\n在庫取引先：{1}\nＶＭＩ購買部門：{2}\nマスタ適用日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0134' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0134',
	'W',
	'同一のヘッダにまとめられる他の明細でエラーが発生しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0135' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0135',
	'W',
	'明細行の数量と詳細行の合計数量が異なります。\n明細行の数量（基準単位）：{1}\n詳細行の合計数量（基準単位）：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0136' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0136',
	'W',
	'入荷数より多く仕入れることはできません。\n入荷実績ＮＯ：{1}\n入荷済数量（基準単位）：{2}\n合計の仕入数量（基準単位）：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0137' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0137',
	'W',
	'未入荷数量より多くの納期回答受領は登録できません。\n発注明細ＮＯ：{1}\n超過数量：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0138' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0138',
	'W',
	'製造指図数量よりも大きい数量での納期回答受領は登録できません。\n製造指図ＮＯ：{1}\n製造指図数量（基準単位）：{2}\n回答数量合計（基準単位）：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0139' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0139',
	'W',
	'実績数量未満には更新できません。\n納期回答受領明細ＮＯ：{1}\n実績数量：{2}\n納期回答受領数量：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0140' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0140',
	'I',
	'複数の伝票が作成されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0141' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0141',
	'I',
	'仕入実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0142' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0142',
	'W',
	'取引マスタに自動時採用がオンのレコードが存在しません。\n取引パタン区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0143' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0143',
	'W',
	'明細を全行削除する場合は、ヘッダも削除してください。\n納入指示ヘッダＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0144' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0144',
	'W',
	'明細を全行削除する場合は、ヘッダも削除してください。\n納期回答受領ヘッダＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0145' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0145',
	'W',
	'入荷実績あるいは仕入実績が登録されているため、製造指図ＮＯは変更できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0146' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0146',
	'W',
	'仕入実績の計上日に複数の日付が設定されたため、変更できません。\n入荷実績一覧登録で仕入実績を同時に訂正する場合、入荷実績の計上日には全て同じ日付にしてください。\n仕入実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0147' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0147',
	'W',
	'仕入実績の仕入日に複数の日付が設定されたため、変更できません。\n入荷実績一覧登録で仕入実績を同時に訂正する場合、入荷実績の入荷日には全て同じ日付にしてください。\n仕入実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0148' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0148',
	'W',
	'資産管理しない品目は、購買識別区分にＶＭＩを指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0149' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0149',
	'W',
	'取引が経費購買の場合、資産管理する品目を登録できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0150' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0150',
	'W',
	'資産管理する品目は経費購買の理由を設定できません。\n品目：{1}\n理由ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0151' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0151',
	'W',
	'資産管理しない品目は経費購買の理由を設定してください。\n品目：{1}\n理由ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0152' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0152',
	'W',
	'未入荷の場合、検収不良の仕入実績を登録できません。\n発注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0153' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0153',
	'W',
	'金額の合計をマイナスにはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0154' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0154',
	'W',
	'発注ＮＯを指定していますが、発注を引継いだ明細がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0155' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0155',
	'W',
	'仕入直送の場合は購買識別区分に通常購買を指定してください。\n購買識別区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0156' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0156',
	'W',
	'内示書の発行処理でエラーが発生したため、内示書を発行できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0157' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0157',
	'W',
	'負担部門には、ワーキンググループが設定されていない部門は指定できません。\n負担部門：{1}\nワーキンググループ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0158' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0158',
	'W',
	'支給直送の場合、検収不良を訂正できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0159' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0159',
	'W',
	'入荷実績に対応する仕入実績を登録する場合は、入荷実績と同じ次の値を指定してください。\n項目：{1}\n入荷実績ＮＯ：{3}\n入荷実績項目：{2}\n入荷実績の値：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0160' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0160',
	'W',
	'明細行の仕入有効成分が詳細行の仕入有効成分の合計と異なります。\n明細行の数量：{1}\n詳細行の合計数量：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0161' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0161',
	'W',
	'仕入直送受注の数量と発注数量に差があります。\n受注数量（基準単位）：{1}\n発注数量（基準単位）：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0162' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0162',
	'W',
	'入荷後の仕入では、入荷数量と仕入数量が同じ数量でないと打切りできません。\n入荷数量（基準単位）：{1}\n仕入数量（基準単位）：{2}\n入荷予定ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0163' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0163',
	'W',
	'入荷実績登録済みのため、訂正できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0164' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0164',
	'W',
	'入荷実績登録済みのため、取り消しできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0165' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0165',
	'W',
	'社内場所から社外場所に変更できません。\n変更前場所ＣＤ：{1}\n変更後場所ＣＤ：{2}\n変更後場所の発注先ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0166' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0166',
	'W',
	'社外場所から他の場所に変更できません。\n変更前場所ＣＤ：{1}\n変更前場所の発注先ＣＤ：{2}\n変更後場所ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0167' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0167',
	'I',
	'発注に対応するすべての発注明細が、取消あるいは入荷完了（入荷不要を含む）の状態であるため、納品書の発行対象が存在しません。\n発注ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0168' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0168',
	'I',
	'納入指示に対応するすべての発注明細が、取消あるいは入荷完了（入荷不要を含む）の状態であるため、納品書の発行対象が存在しません。\n納入指示ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0169' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0169',
	'W',
	'納入指示が取消されているため、納品書の発行対象が存在しません。\n納入指示ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0170' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0170',
	'W',
	'検索した仕入実績は既に取り消されているため、訂正または取消できません。\n仕入実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0171' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0171',
	'W',
	'検索した仕入返品実績は売上返品登録により登録されているため、訂正または取消できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0172' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0172',
	'W',
	'納入指示可能な入荷予定が存在しません。\n発注明細ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0173' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0173',
	'W',
	'入荷、仕入、受領インボイス登録のいずれかが行われているため、削除できません。\n納期回答受領明細ＮＯ:{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0174' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0174',
	'W',
	'インボイス取引対象の発注先ですが受領インボイスが登録されていない仕入予定があります。受領インボイスを登録してください。\n発注先：{1}\n仕入予定ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0175' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0175',
	'W',
	'負担発注ＮＯに対応する発注情報が見つかりません。\n負担発注ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0176' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0176',
	'W',
	'受注ＮＯに対応する受注情報が見つかりません。\n受注ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0177' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0177',
	'W',
	'負担受注ＮＯに対応する受注情報が見つかりません。\n負担受注ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0178' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0178',
	'W',
	'負担品目、負担ロットＮＯ、負担サブロットＮＯの組合せに対応するロット情報が見つかりません。\n負担品目：{1}\n負担ロットＮＯ：{2}\n負担サブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0179' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0179',
	'W',
	'負担インボイスＮＯに対応するインボイス情報あるいは受領インボイス情報が見つかりません。\n負担インボイスＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0180' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0180',
	'W',
	'納入指示明細ＮＯと仕入実績明細ＮＯの組み合わせが不正です。\n納入指示明細ＮＯ：{1}\n仕入実績明細ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0181' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0181',
	'W',
	'未入荷数量より多くの納入指示は登録できません。\n発注明細ＮＯ：{1}\n仕入実績明細ＮＯ：{2}\n超過数量：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0182' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0182',
	'W',
	'未入荷数量より多くの納期回答受領は登録できません。\n発注明細ＮＯ：{1}\n仕入実績明細ＮＯ：{2}\n超過数量：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0183' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0183',
	'W',
	'受領インボイス登録済のため訂正できません。\n納期回答受領明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0184' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0184',
	'W',
	'受領インボイス登録済のため訂正できません。\n納入指示明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0185' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0185',
	'W',
	'受領インボイス登録済のため訂正できません。\n納期回答受領ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0186' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0186',
	'W',
	'受領インボイス登録済のため取消できません。\n納入指示明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0187' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0187',
	'W',
	'仕入予定数量以上の数量で打切りすることはできません。\n仕入予定数量（基準単位）：{1}\n仕入数量（基準単位）：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0188' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0188',
	'W',
	'入荷が完了していないため、仕入の打切りはできません。\n入荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0189' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0189',
	'W',
	'入荷不要の品目は、購買識別区分に無償受給を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0190' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0190',
	'W',
	'値引品目は購買識別区分に通常購買を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0191' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0191',
	'W',
	'単価が「0」の場合は値引額を指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0192' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0192',
	'W',
	'明細の手配ＮＯ１に対応する案件が異なる他の明細が存在するため、登録できません。\n明細案件：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0193' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0193',
	'W',
	'金額をマイナスで登録することはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0194' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0194',
	'W',
	'取引が経費購買返品の場合、資産管理する品目を登録できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0195' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0195',
	'W',
	'取引が経費値引、または経費値増の場合、資産管理する品目を登録できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0196' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0196',
	'I',
	'仕入返品実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0197' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0197',
	'W',
	'検査実績登録で抜取実績の荷姿振替が実施されています。抜取実績で荷姿振替された分を基準単位に振り替えて登録してください。\n入荷実績ＮＯ：{1}\n抜取実績の引落数量：{2}\n抜取実績の荷姿振替数量：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0198' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0198',
	'W',
	'税マスタに登録されていません。\n税ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0199' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0199',
	'W',
	'納期回答可能な入荷予定が存在しません。\n発注明細ＮＯ：{1}\n仕入実績明細ＮＯ：{2}\n製造指図ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0200' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0200',
	'W',
	'仕入実績の取消計上日に複数の日付が設定されたため、変更できません。\n入荷実績一覧登録で仕入実績を同時に訂正する場合、入荷実績の取消計上日には全て同じ日付にしてください。\n仕入実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0201' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0201',
	'W',
	'下請法対象取引先の発注先に対する再入荷希望日は再入荷仕入予定日と同日である必要があります。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0202' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0202',
	'W',
	'指定した発注先・メーカと製造場所の場所マスタの発注先・メーカが異なります。\n指定した発注先：{1}\n指定したメーカ：{2}\n場所マスタの発注先：{3}\n場所マスタのメーカ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0203' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0203',
	'W',
	'再入荷予定に対して後続業務が行われています。再入荷予定が変更される項目の訂正と、仕入実績の取消はできません。\n・後続業務は以下のいずれかです。\n　　納入指示、納期回答受領、入荷、仕入\n・訂正ができない項目は以下の通りです。\n　　再入荷、再入荷数量、再入荷場所、再入荷棚・ライン、再入荷希望日時、再入荷仕入予定日、再入荷同時計上\n仕入実績明細ＮＯ：{1}\n{2}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0204' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0204',
	'W',
	'仮受注のため発注を登録できません。\n受注ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0205' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0205',
	'W',
	'受領インボイス登録対象のときは、仕入予定数と同じ実績数で登録してください。\n受領インボイス管理ＮＯ：{1}\n仕入予定ＮＯ：{2}\n仕入予定数：{3}\n仕入予定に対応する実績数の合計：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0301' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0301',
	'W',
	'入荷予定がIF送信対象のため、明細行もしくは明細に対応する詳細行は分割できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0302' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0302',
	'W',
	'前受金入金額が請求額に達していないため発注を登録できません。\n受注ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0303' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0303',
	'W',
	'品目仕訳マスタに登録されていません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0304' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0304',
	'W',
	'場所マスタに有効な場所として登録されていません。\n訂正前の納入場所：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0305' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0305',
	'W',
	'場所マスタに有効な場所として登録されていません。\n発注予定の納入場所：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0306' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0306',
	'W',
	'場所マスタに有効な場所として登録されていません。\n納入場所：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0307' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0307',
	'W',
	'品目仕訳マスタに登録されていません。\n品目仕訳CD：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0308' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0308',
	'W',
	'仕入締が解除されているため、計上日は変更できません。\n訂正前の計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0309' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0309',
	'W',
	'未入荷で仕入のみを登録、または訂正する場合、仕入実績ヘッダを分割できません。\n仕入実績ヘッダが1件になるように、日付、税などを変更してください。\n仕入予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0401' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0401',
	'I',
	'発注一括登録処理を開始しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0402' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0402',
	'I',
	'発注一括登録処理が終了しました。\n処理対象の発注予定件数：{1}\n処理が成功した発注予定件数：{2}\n処理が失敗した発注予定件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0403' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0403',
	'W',
	'指定された購買部門は無効です。\n購買部門：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0404' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0404',
	'W',
	'指定された購買部門と購買担当者の組み合わせは無効です。\n購買担当者：{1}\n購買部門：{2}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0405' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0405',
	'W',
	'他の処理によって更新されました。対象から除外します。\n発注予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0406' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0406',
	'W',
	'他の明細のチェック処理でエラーが発生しました。処理を停止します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0407' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0407',
	'W',
	'指定された納品先が受注引当格付マスタに存在しないため、更新できません。\n得意先ＣＤ：{1}\n納品先ＣＤ：{2}\n格付ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0408' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0408',
	'W',
	'納入指示に対して受領インボイスが登録されています。納入指示明細の数量に受領インボイスと同じ値を指定ください。\n納入指示明細ＮＯ：{1}\n受領インボイス数量：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0409' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0409',
	'W',
	'納期回答受領に対して受領インボイスが登録されています。納期回答受領明細の数量に受領インボイスと同じ値を指定ください。\n納期回答受領明細ＮＯ：{1}\n受領インボイス数量：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0410' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0410',
	'W',
	'仕入計上区分が「１：入荷基準」の場合は、納入希望日と仕入予定日は同日である必要があります。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0411' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0411',
	'W',
	'仕入計上区分が「１：入荷基準」の場合は、同時計上フラグはオンである必要があります。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0412' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0412',
	'W',
	'仕入計上区分が「２：検収基準」の場合は、同時計上フラグはオフである必要があります。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0413' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0413',
	'W',
	'仕入計上区分が「１：入荷基準」の場合は、再入荷希望日と再入荷仕入予定日は同日である必要があります。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0414' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0414',
	'W',
	'仕入計上区分が「１：入荷基準」の場合は、再入荷同時計上フラグはオンである必要があります。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0415' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0415',
	'W',
	'仕入計上区分が「２：検収基準」の場合は、再入荷同時計上フラグはオフである必要があります。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0501' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0501',
	'W',
	'加工単価と有償支給単価の合計が、単価と異なります。\n加工単価と有償支給単価の合計：{1}\n単価：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0502' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0502',
	'W',
	'前回登録したデータがＧＡに未反映です。\n仕入伝票ＩＦ一覧照会画面から未反映の仕入伝票を再送信してください。\nデータＮＯ：{1}\n仕入伝票ＮＯ：{2}\n受領インボイスＮＯ：{3}\n受領インボイス管理ＮＯ：{4}\n仕入実績ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0503' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0503',
	'W',
	'該当の仕入実績はＧＡに登録されていません。\nＧＡに登録されていないデータは訂正・取消できません。\n仕入実績ＮＯ：{1}\n受領インボイスＮＯ：{2}\n受領インボイス管理ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0504' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0504',
	'W',
	'支払予定制御マスタの設定が不正です。ＧＡに連携する支払予定日を計算できませんでした。\n計上日時点のワーキンググループに対応するサイト区分と、支払予定管理先締年月日時点のワーキンググループに対応するサイト区分に同じ値を設定してください。\n\n計上日時点のワーキンググループ：{1}\n支払予定管理先締年月日時点のワーキンググループ：{2}\n支払予定管理先：{3}\n通貨：{4}\n金額：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0505' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0505',
	'W',
	'支払予定制御マスタの設定が不正です。ＧＡに連携する支払予定日を計算できませんでした。\n支払予定管理先が都度支払かつインボイス取引対象外の場合は、サイト区分に「日」を指定してください。\nワーキンググループ：{1}\n支払予定管理先：{2}\n通貨：{3}\n金額：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0506' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0506',
	'W',
	'品目単位マスタが存在しません\n品目：{1}\n単位：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0507' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0507',
	'I',
	'購買内示情報登録処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0508' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0508',
	'W',
	'計画外の場合は購買品以外は登録できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0509' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0509',
	'W',
	'購買部門が不正です。\n計上日、購買担当者、購買部門に対する担当者権限マスタが設定されていることを確認してください。\n計上日：{1}\n購買担当者ＣＤ：{2}\n購買部門ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0510' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0510',
	'W',
	'購買部門が不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの購買部門がオンになっていること\n適用日：{1}\n購買部門ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0601' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0601',
	'W',
	'納入指示明細ＮＯを指定しない場合は、納入指示されていない数量を超える数量の納期回答受領を登録できません。\n数量を修正するか、納入指示明細ＮＯを指定してください。\n発注明細ＮＯ：{1}\n納入指示未登録数量（基準単位）：{2}\n回答数量合計（基準単位）：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0602' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0602',
	'W',
	'納期回答受領済のため、納入指示を登録・訂正・取消できません。\n発注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0603' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0603',
	'W',
	'会社間取引の場合、発注時の取引単位ＣＤと異なる取引単位ＣＤは登録できません。\n発注明細ＮＯ：{1}\n発注時の取引単位ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0604' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0604',
	'W',
	'会社間取引であり、かつ納入指示で作成した入荷予定または仕入予定に対して実績が計上されている場合、訂正できません。\n納入指示明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0605' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0605',
	'W',
	'会社間取引の場合、再入荷予定に対する納入指示は登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0606' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0606',
	'W',
	'受領インボイス未登録の数量より多くの納入指示は登録できません。\n発注明細ＮＯ：{1}\n超過数量：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0607' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0607',
	'W',
	'受領インボイス未登録の数量より多くの納期回答受領は登録できません。\n発注明細ＮＯ：{1}\n超過数量：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0608' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0608',
	'W',
	'同時計上の場合、同一の受領インボイス明細に含まれる全ての入荷実績の入荷日、計上日を揃えて登録してください。\n受領インボイス明細ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0609' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0609',
	'W',
	'発注明細が打切されているため訂正、取消できません。\n訂正、取消する場合は、発注明細を打切解除してください。\n発注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0610' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0610',
	'W',
	'発注明細の取引単位が品目単位マスタに存在しません。\n品目：{1}\n単位：{2}\n発注明細ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0611' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0611',
	'W',
	'入荷予定の取引単位が品目単位マスタに存在しません。\n品目：{1}\n単位：{2}\n入荷予定ＮＯ ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0612' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0612',
	'W',
	'納期回答受領明細の取引単位が品目単位マスタに存在しません。\n品目：{1}\n単位：{2}\n納期回答受領明細ＮＯ ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0613' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0613',
	'W',
	'指定された取引が不正です。以下の取引パタン区分に対応した取引を指定してください。\n取引ＣＤ：{1}\n取引パタン区分：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0614' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0614',
	'W',
	'売上・仕入の同時計上が混在するような訂正はできません。\n仕入実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0615' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0615',
	'W',
	'売上と同時に登録された仕入実績に、売上と紐づかない仕入実績明細が含まれるため、訂正・取消できません。\n売上と紐づかない仕入実績明細を削除してから、売上実績を訂正・取消してください。\n売上実績明細ＮＯ：{1}\n仕入実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBDL0616' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBDL0616',
	'W',
	'同一のヘッダにまとめられる他の明細でエラーが発生しました。\nエラー内容は他に出力されたエラーメッセージを確認してください。\n選択されていない明細にエラーが発生した場合、当該のエラーメッセージには行番号が表示されません。\n仕入実績明細ＮＯ：{1}\nエラーが発生した仕入実績明細ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0001',
	'W',
	'入力値チェックの下限を下回りました。\n入力値（基準単位数量）：{1}\n下限（移動指図数量*{2}）：{3}\n移動指図明細ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0002',
	'W',
	'選択行の内、遷移元の画面と値が異なるカラム値は画面遷移時に引き継がれません。\n値が引き継がれないカラム名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0003',
	'W',
	'入力値チェックの下限を下回りました。\n入力値（基準単位数量）：{1}\n下限（移動予定数量*{2}）：{3}\n移動引当状況ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0004',
	'W',
	'受領インボイスに対して仕入実績が登録されているため、訂正、取消できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0005',
	'W',
	'指定の制御対象日あるいは棚卸年月ではまだ棚卸を実施できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0006',
	'I',
	'選択行内で異なる値が指定されている項目について、画面遷移時に引き継ぎません。\n値を引き継がない項目：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0007',
	'I',
	'純重量と容積を再取得しますか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0008',
	'W',
	'指定されたインボイスは既に輸出実績が登録済のため、更新できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0009',
	'W',
	'選択行内で異なる値が指定されていますが、以下の項目は選択行内の値を引き継ぎます。\n値を引き継ぐ項目：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0011',
	'W',
	'入力値チェックの上限を上回りました。\n入力値（基準単位数量）：{1}\n上限（移動指図数量*{2}）：{3}\n移動指図明細ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0013',
	'W',
	'入力値チェックの上限を上回りました。\n入力値（基準単位数量）：{1}\n上限（移動予定数量*{2}）：{3}\n移動引当状況ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0014',
	'W',
	'船積港、船卸港、経由地には異なる値を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0015',
	'W',
	'明細なし、または行追加した明細だけの登録はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0016',
	'W',
	'仕入を先に計上する予定ですが、入荷を先に計上します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0017',
	'W',
	'画面の表示に失敗しました。\n親画面が指定されていません。\nモジュールＩＤ：{1}\nスクリーンＩＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0018',
	'W',
	'画面の表示に失敗しました。\n親画面はmcframe.clientMSUD.MSUDP0020.IfStkInspBaseインタフェースを実装している必要があります。\nモジュールＩＤ：{1}\nスクリーンＩＤ：{2}\n親画面クラス：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0019',
	'W',
	'入力不可の検索項目に値が設定されていません。遷移元の画面より値を設定してください。\n検索項目：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0020',
	'I',
	'単価取得処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0021',
	'I',
	'単価取得処理を実行しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0022',
	'I',
	'為替レート取得処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0023',
	'I',
	'為替レート取得処理を実行しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0024',
	'W',
	'基準通貨以外の行が選択されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0025',
	'W',
	'品揃え対象の明細が揃っていません。\n受注ＮＯ：{1}\n品揃区分：{2}\n品揃グループＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0026',
	'W',
	'ロット提案処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0027',
	'I',
	'税取得処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0028',
	'I',
	'税取得処理を実行しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0029',
	'W',
	'インボイス明細の数量が出荷予定数を超えています。\nインボイス登録可能数量：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0030',
	'W',
	'入荷と仕入を同時計上する予定ですが、別々で計上します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0031',
	'W',
	'入荷と仕入を別々に計上する予定ですが、同時計上します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0032',
	'W',
	'既に出荷されていますが、インボイスを取消ししてもよろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0033',
	'W',
	'入荷を先に計上する予定ですが、仕入を先に計上します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0034',
	'W',
	'予定経由の実績は参照登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0035',
	'W',
	'指図経由の実績は参照登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0036',
	'I',
	'現品票確認枚数を超えている行がありますが、このまま印刷しますか？\n現品票確認枚数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0037',
	'W',
	'ロット・場所提案処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0038',
	'W',
	'納品伝票を作成していない行が選択されています。選択行に対して納品伝票を作成しますがよろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0039',
	'W',
	'選択した在庫情報を反映できません。次の項目が同じ値である在庫情報を選択してください。\n項目：{1}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0040',
	'W',
	'仕入計上区分が「入荷基準」の場合は仕入予定日を変更できないため、仕入予定日が異なる明細をまとめられません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0041',
	'I',
	'仕入予定日が異なる明細が選択されています。\n仕入計上区分が「入荷基準」の場合は仕入予定日を変更できないため、仕入計上区分が「入荷基準」の明細の仕入予定日を引き継ぎます。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0101',
	'W',
	'インボイス明細の数量が出荷指図数を超えています。\nインボイス登録可能数量：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0102',
	'W',
	'インボイス明細の数量が出荷数を超えています。\nインボイス登録可能数量：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0103',
	'W',
	'受領インボイス登録画面ではインボイス取引対象外の発注先は指定できません。\n発注先：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0104',
	'W',
	'検索モードに「ヘッダ」を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0105',
	'W',
	'納品先識別区分が「納品先」のインボイスを指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0106',
	'W',
	'仕入直送の明細が含まれているため、参照登録はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEP0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEP0107',
	'W',
	'仕入対象外の明細が含まれているため、参照登録はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0001',
	'W',
	'ロットＮＯが指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0002',
	'W',
	'サブロットＮＯが指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0003',
	'W',
	'業者ロットＮＯが指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0004',
	'W',
	'指定された他勘定振替予定ＮＯの他勘定振替予定はありません。\n他勘定振替予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0005',
	'W',
	'指定された他勘定振替指図ＮＯの明細を取得することができません。\n他勘定振替指図ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0006',
	'W',
	'指定された他勘定振替実績ＮＯの明細を取得することができません。\n他勘定振替実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0007',
	'W',
	'物流グループの異なる場所へは入荷、または仕入できません。\n変更前場所ＣＤ：{1}\n変更前物流グループＣＤ：{2}\n変更後場所ＣＤ：{3}\n変更後物流グループＣＤ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0008',
	'W',
	'外注先の異なる場所へは入荷できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0009',
	'W',
	'ロット管理情報が取得できません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0010',
	'W',
	'ロットに有効期限が指定されていないため、有効期限のチェックができません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0011',
	'W',
	'ロットに有効期限が指定されていないため、ロット逆転のチェックができません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0012',
	'W',
	'指定した納品内容では有効期限を満たしていません。\n得意先ＣＤ：{1}\n納品先ＣＤ：{2}\n出荷有効期限グループＣＤ：{3}\n納品（予定）日：{4}\n品目：{5}\nロットＮＯ：{6}\nサブロットＮＯ：{7}\n有効期限：{8}\n許可する有効期限：{9}～');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0013',
	'W',
	'ロット逆転が発生しました。\n得意先ＣＤ：{1}\n納品先ＣＤ：{2}\n納品（予定）日：{3}\n品目：{4}\nロットＮＯ：{5}\nサブロットＮＯ：{6}\n有効期限：{7}\n許可する有効期限：{8}～{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0014',
	'W',
	'出荷ロット排他情報を登録できませんでした。処理の対象から除外します。\n得意先ＣＤ：{1}\n納品先ＣＤ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0015',
	'W',
	'出荷ロット排他情報をロックできませんでした。処理の対象から除外します。\n得意先ＣＤ：{1}\n納品先ＣＤ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0016',
	'W',
	'指定の品目は出荷禁止です。\n品目：{1}\n出荷日：{2}\n売上・出荷禁止日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0017',
	'W',
	'指定の品目は移送禁止です。\n品目：{1}\n出荷日：{2}\n移送・移動禁止日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0018',
	'W',
	'指定の品目は輸出禁止です。\n品目：{1}\n納品先国：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0019',
	'W',
	'指定のロットは引当禁止です。\n品目：{1}\nロット：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0020',
	'W',
	'出荷作業を伴わない品目が出荷の対象に含まれていません。\n出荷対象に含めて出荷を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0021',
	'W',
	'出荷予定をまとめているインボイスＮＯと、受注のインボイスＮＯが異なります。\nインボイスＮＯ（出荷）：{1}\nインボイスＮＯ（受注）：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0022',
	'W',
	'インボイス取引対象と対象外の出荷予定が混在しているため、出荷できません。\nインボイス取引対象の出荷予定は、インボイスＮＯを指定して出荷してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0023',
	'W',
	'インボイスＮＯ指定の場合は、対象インボイスの出荷予定を全て指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0024',
	'W',
	'品揃区分が「2：品揃する」、もしくは品揃グループＮＯが指定されている場合、出荷予定を分割して出荷できません。\n受注ＮＯ：{1}\n品揃区分：{2}\n品揃グループＮＯ：{3}\n出荷予定ＮＯ：{4}\n予定数量(基準単位)：{5}\n出荷数量(基準単位)：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0025',
	'W',
	'打切済みのため、行削除できません。\n削除する場合は、先に打切を解除してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0026',
	'W',
	'売上計上済みのため、更新または取り消しできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0027',
	'W',
	'入荷済みのため、更新または取り消しできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0028',
	'W',
	'インボイス出荷済みのため、更新または取り消しできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0029',
	'W',
	'出荷返品対象のため、更新または取り消しできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0030',
	'W',
	'打切済みのため、取り消しできません。\n取り消しする場合は、先に打切を解除してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0031',
	'W',
	'出荷予定ＮＯが指定されていません。\n指図まとめされた出荷以外では、出荷予定ＮＯを指定する必要があります。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0032',
	'W',
	'出荷実績のヘッダ項目が異なる出荷予定が指定されています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0033',
	'W',
	'データ更新中に、データの競合が発生しました。\n処理を再実行してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0034',
	'W',
	'在庫の数量がマイナスとなるため更新できません。\n品目：{1}\n場所ＣＤ：{2}\n棚・ラインＣＤ：{3}\n在庫着荷先ＣＤ：{4}\nロットＮＯ：{5}\nサブロットＮＯ：{6}\n手配ＮＯ：{7}\n確定ＮＯ区分：{8}\n確定ＮＯ：{9}\n荷姿単位ＣＤ：{10}\n格付ＣＤ：{11}\n積送品区分：{12}\n良品区分：{13}\n資産区分：{14}\n在庫検査区分：{15}\n在庫識別区分：{16}\n在庫取引先ＣＤ：{17}\n荷姿単位数量：{18}\n基準単位数量：{19}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0035',
	'W',
	'月次受払在庫で月末在庫の数量がマイナスとなるため更新できません。\n年月：{1}\n受払区分：{2}\n品目：{3}\n場所ＣＤ：{4}\n棚・ラインＣＤ：{5}\n在庫着荷先ＣＤ：{6}\nロットＮＯ：{7}\nサブロットＮＯ：{8}\n手配ＮＯ：{9}\n確定ＮＯ区分：{10}\n確定ＮＯ：{11}\n荷姿単位ＣＤ：{12}\n格付ＣＤ：{13}\n積送品区分：{14}\n良品区分：{15}\n資産区分：{16}\n在庫検査区分：{17}\n在庫識別区分：{18}\n在庫取引先ＣＤ：{19}\n荷姿単位数量：{20}\n基準単位数量：{21}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0036',
	'W',
	'在庫の数量が有効桁数を超えています。\n品目：{1}\n場所ＣＤ：{2}\n棚・ラインＣＤ：{3}\n在庫着荷先ＣＤ：{4}\nロットＮＯ：{5}\nサブロットＮＯ：{6}\n手配ＮＯ：{7}\n確定ＮＯ区分：{8}\n確定ＮＯ：{9}\n荷姿単位ＣＤ：{10}\n格付ＣＤ：{11}\n積送品区分：{12}\n良品区分：{13}\n資産区分：{14}\n在庫検査区分：{15}\n在庫識別区分：{16}\n在庫取引先ＣＤ：{17}\n荷姿単位数量：{18}\n基準単位数量：{19}\n整数の有効桁数：{20}\n小数点以下の有効桁数：{21}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0037',
	'W',
	'取引の数量が有効桁数を超えています。\n年月：{1}\n受払区分：{2}\n品目：{3}\n場所ＣＤ：{4}\n棚・ラインＣＤ：{5}\n在庫着荷先ＣＤ：{6}\nロットＮＯ：{7}\nサブロットＮＯ：{8}\n手配ＮＯ：{9}\n確定ＮＯ区分：{10}\n確定ＮＯ：{11}\n荷姿単位ＣＤ：{12}\n格付ＣＤ：{13}\n積送品区分：{14}\n良品区分：{15}\n資産区分：{16}\n在庫検査区分：{17}\n在庫識別区分：{18}\n在庫取引先ＣＤ：{19}\n荷姿単位数量：{20}\n基準単位数量：{21}\n整数の有効桁数：{22}\n小数点以下の有効桁数：{23}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0038',
	'W',
	'出荷留めが指定されているため、出荷できません。\n出荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0039',
	'W',
	'引当可能な在庫、受払予定が存在しないため、引当できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0040',
	'W',
	'自社から自社へ移動・移送する場合、在庫識別区分には「自社在庫」「VMI」「検収不良」「無償受給」のいずれかを指定してください。\n出庫場所ＣＤ：{1}\n入庫場所ＣＤ：{2}\n在庫識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0041',
	'W',
	'外注先から自社へ移動・移送する場合、在庫識別区分には「自社在庫」「検収不良」「無償受給」「有償支給」のいずれかを指定してください。\n出庫場所ＣＤ：{1}\n入庫場所ＣＤ：{2}\n在庫識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0042',
	'W',
	'自社から外注先へ移動・移送する場合、在庫識別区分には「自社在庫」「VMI」「無償受給」のいずれかを指定してください。\n出庫場所ＣＤ：{1}\n入庫場所ＣＤ：{2}\n在庫識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0043',
	'W',
	'外注先から外注先へ移動・移送する場合、在庫識別区分には「自社在庫」「無償受給」「有償支給」のいずれかを指定してください。\n出庫場所ＣＤ：{1}\n入庫場所ＣＤ：{2}\n在庫識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0044',
	'W',
	'自社から自社へ移動・移送するインボイス取引の場合、在庫識別区分には「自社在庫」「VMI」「検収不良」「無償受給」のいずれかを指定してください。\n出庫場所ＣＤ：{1}\n入庫場所ＣＤ：{2}\n在庫識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0045',
	'W',
	'入荷済です。入荷予定は訂正、取り消しできません。\n入荷予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0046',
	'W',
	'仕入検収済です。入荷予定は訂正、取り消しできません。\n入荷予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0047',
	'W',
	'売上計上済です。入荷予定は訂正、取り消しできません。\n入荷予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0048',
	'W',
	'入荷予定は打切済みです。打切解除後に訂正してください。\n入荷予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0049',
	'W',
	'製造指図ＮＯが設定されていないため、入荷予定は打切できません。\n入荷予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0050',
	'W',
	'配送先を経由して出荷する場合、送付先に配送先を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0051',
	'W',
	'指定された取引は利用できません。\n下記の取引パタン区分が指定された取引を指定してください。\n取引パタン区分：「売上」「出荷」「移動・移送」「移動・移送返品」「支給」「支給返品」\n取引ＣＤ：{1}\n取引パタン区分：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0052',
	'W',
	'取引と送付先の関係が不正です。\n下記の取引パタン区分が指定された取引を使用する場合は、送付先に「納品先」を指定してください。\n取引パタン区分：「売上」「出荷」\n取引ＣＤ：{1}\n取引パタン区分：{2}\n送付先識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0053',
	'W',
	'取引と送付先の関係が不正です。\n下記の取引パタン区分が設定された取引を使用する場合は、送付先に「場所」を指定してください。\n取引パタン区分：「移動・移送」「移動・移送返品」「支給」「支給返品」\n取引ＣＤ：{1}\n取引パタン区分：{2}\n送付先識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0054',
	'W',
	'取引と納品先の関係が不正です。\n下記の取引パタン区分が指定された取引を使用する場合は、納品先に「納品先」を指定してください。\n取引パタン区分：「売上」「出荷」\n取引ＣＤ：{1}\n取引パタン区分：{2}\n納品先識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0055',
	'W',
	'取引と送付先の関係が不正です。\n下記の取引パタン区分が設定された取引を使用する場合は、納品先に「場所」を指定してください。\n取引パタン区分：「移動・移送」「移動・移送返品」「支給」「支給返品」\n取引ＣＤ：{1}\n取引パタン区分：{2}\n納品先識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0056',
	'W',
	'入庫場所もしくは出庫場所が外注先の場合、指定した在庫検査区分は使用できません。\n入庫場所ＣＤ：{1}\n出庫場所ＣＤ：{2}\n在庫検査区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0057',
	'W',
	'物流グループ内の移送は指定できません。\n出荷先物流グループＣＤ：{1}\n出荷元物流グループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0058',
	'W',
	'指定された他勘定振替予定は未承認のため、指図できません。\n他勘定振替予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0059',
	'W',
	'指定された他勘定振替予定は未承認のため、実績計上できません。\n他勘定振替予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0060',
	'W',
	'出庫場所と入庫場所において、異なる物流Ｇの設定はできません。\n出庫場所と入庫場所の物流Ｇを一致させてください。\n出庫場所ＣＤ：{1}\n入庫場所ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0061',
	'W',
	'指定された実績の出庫情報を取得することができません。\n在庫振替実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0062',
	'W',
	'指定された実績の入庫情報を取得することができません。\n在庫振替実績ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0063',
	'W',
	'手配ＮＯ１管理区分が「管理しない」「管理する（任意：在庫対象外）」品目に対して手配ＮＯ１が指定されています。\n品目:{1}\n手配ＮＯ１管理区分:{2}\n手配ＮＯ１:{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0064',
	'W',
	'手配ＮＯ２管理区分が「管理しない」「管理する（任意：在庫対象外）」品目に対して手配ＮＯ２が指定されています。\n品目:{1}\n手配ＮＯ２管理区分:{2}\n手配ＮＯ２:{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0065',
	'W',
	'手配ＮＯ３管理区分が「管理しない」「管理する（任意：在庫対象外）」品目に対して手配ＮＯ３が指定されています。\n品目:{1}\n手配ＮＯ３管理区分:{2}\n手配ＮＯ３:{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0066',
	'W',
	'手配ＮＯ４管理区分が「管理しない」「管理する（任意：在庫対象外）」品目に対して手配ＮＯ４が指定されています。\n品目:{1}\n手配ＮＯ４管理区分:{2}\n手配ＮＯ４:{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0067',
	'W',
	'ロット管理区分が「ロット管理しない」品目に対してロットＮＯが指定されています。\n品目:{1}\nロット管理区分:{2}\nロットＮＯ:{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0068',
	'W',
	'サブロット管理区分が「ロット管理しない」品目に対してサブロットＮＯが指定されています。\n品目:{1}\nサブロット管理区分:{2}\nサブロットＮＯ:{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0069',
	'W',
	'在庫識別区分が「自社在庫」品目に対して在庫取引先が指定されています。\n品目:{1}\n在庫識別区分:{2}\n在庫取引先ＣＤ:{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0070',
	'W',
	'出庫明細複数、入庫明細複数の振替はできません。\n出庫明細数:{1}\n入庫明細数:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0071',
	'W',
	'資産管理対象品目と非管理対象品目が混在する品目振替はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0072',
	'W',
	'振替内容が一致した在庫振替はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0073',
	'W',
	'入出庫対象の品目が一致する品目振替はできません。\n品目:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0074',
	'W',
	'出庫情報の「基準単位数量」の合計と入庫情報の「基準単位数量」の合計が異なっています。\n出庫数量:{1}\n入庫数量:{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0075',
	'W',
	'次の項目の値が1種類となるように指定してください。\n項目名:{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0076',
	'W',
	'受領インボイスに対して仕入実績が登録されているため、訂正、取消できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0077',
	'W',
	'船積港、船卸港、経由地には異なる値を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0078',
	'W',
	'取引通貨と基準通貨に対する為替レートが取得できませんでした。為替レートマスタを設定してください。\n取引通貨：{1}\n基準通貨：{2}\n適用日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0079',
	'W',
	'指定された他勘定振替予定ＮＯは、未承認ではありません。まずは承認状況を取り消してください。\n他勘定振替予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0080',
	'W',
	'送付先として登録されていません。\n送付先識別区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0081',
	'W',
	'納品先として登録されていません。\n納品先識別区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0082' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0082',
	'W',
	'指定された在庫識別区分は、「他勘定振替出庫」では使用できません。正しい在庫識別区分を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0083',
	'W',
	'指定された在庫識別区分は、「他勘定振替入庫」では使用できません。正しい在庫識別区分を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0084' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0084',
	'W',
	'指定された在庫識別区分は、「廃棄」では使用できません。正しい在庫識別区分を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0085',
	'W',
	'未引当の在庫が存在しません。引当済みの在庫は使用できません。\n品目：{1}\n場所：{2}\n棚・ライン：{3}\nロットＮＯ：{4}\nサブロットＮＯ：{5}\n手配ＮＯ：{6}\n荷姿単位：{7}\n格付：{8}\n良品区分：{9}\n在庫識別区分：{10}\n在庫取引先：{11}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0086',
	'W',
	'既にインボイス登録されているため受領インボイスは訂正、取消できません。\nインボイスＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0087',
	'W',
	'指図済みです。出荷予定は訂正、取消できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0088',
	'W',
	'出荷済です。出荷予定は訂正、取消できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0089' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0089',
	'W',
	'インボイスでまとめられているため、出荷予定は訂正、取消できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0090' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0090',
	'W',
	'出荷予定は打切済みです。打切解除後に取消してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0091' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0091',
	'W',
	'指図まとめが行われているため、出荷予定は訂正できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0092' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0092',
	'I',
	'品揃えが指定されているため、物流グループごとに出荷予定を分割できません。\n物流グループの異なる出荷予定は、出荷元物流グループの出荷予定にまとめて作成します。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0093' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0093',
	'W',
	'確定した出荷予定があるため、品目、単位、格付、ロットなど引当処理に影響のある項目は変更できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0094' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0094',
	'W',
	'確定した出荷予定数量を下回る数量に訂正できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0095' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0095',
	'W',
	'確定した出荷予定があるため、削除できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0096',
	'W',
	'指定の棚卸基準日、場所、品目では実棚情報を登録できません。\n棚卸基準日：{1}\n場所ＣＤ：{2}\n品目：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0097',
	'W',
	'棚卸中ではないため実棚情報を登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0098',
	'W',
	'ＶＭＩ品は棚卸対象外です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0099',
	'W',
	'返品検収前の在庫は棚卸対象外です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0100',
	'W',
	'仕入検収前の在庫は棚卸対象外です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0101',
	'W',
	'積送中の在庫は棚卸対象外です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0102',
	'W',
	'既に存在する在庫のため追加できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0103',
	'W',
	'指定の日付以降で棚卸を実施しているため、理論在庫は作成できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0104',
	'W',
	'以前に開始した棚卸がまだ終了していないため、理論在庫は作成できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0105',
	'W',
	'実棚入力が完了していないため、在庫確定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0106',
	'W',
	'理論在庫作成後に在庫が更新されました。理論在庫を再作成するか、理論在庫チェック不要をオンにして実行してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0107',
	'W',
	'棚卸を開始していないため、出力できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0108',
	'W',
	'理論在庫の数量がマイナスとなるため更新できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0109',
	'W',
	'出荷依頼先として登録されていません。\n出荷依頼先識別区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0110',
	'W',
	'打切済のため、移動実績を登録できません。\n移動引当状況ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0111',
	'W',
	'指定された取引は計画外入荷できません。\n下記の取引パタン区分が指定された取引を指定してください。\n取引パタン区分：「入荷」「出荷返品」\n取引ＣＤ：{1}\n取引パタン区分：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0112',
	'W',
	'入荷できません。\n計画外入荷（「無償受給」「ＶＭＩ」「預り在庫」、および「貸出返品」）で扱える入荷の良品区分は「良品」のみです。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0113',
	'W',
	'インボイス取引対象の発注先は計画外入荷できません。\n発注先：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0114',
	'W',
	'指定の取引パタン区分では未着管理はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0115',
	'W',
	'ロットが未確定のため、入荷できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0116',
	'W',
	'未着管理の入荷は打ち切りできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0117',
	'W',
	'入荷場所が社外の場合、ＶＭＩ品の入荷はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0118',
	'W',
	'出荷元期限が指定されていないため、登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0119',
	'W',
	'下請対象の発注先から計画外の入荷はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0120',
	'W',
	'同時計上でないため、登録できません。\n下請対象の発注先は入荷と仕入を同時に登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0121',
	'W',
	'仕入検収済みのため、更新できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0122',
	'W',
	'未着管理の場合、入荷数には仕入数以下の数量を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0123',
	'W',
	'同時計上をオンからオフ、またはオフからオンに変更できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0124',
	'W',
	'購買適用開始日が納入希望日以前の版マスタが登録されていません。\n品目：{1}\n工場・物流倉庫ＣＤ：{2}\n納入希望日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0125',
	'W',
	'仕入直送で未着管理はできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0126',
	'W',
	'製造指図ＮＯが設定されていないため、入荷できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0127',
	'W',
	'売上計上済みのため、更新できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0128' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0128',
	'W',
	'指定したインボイスに含まれる品目は、売上・出荷が禁止されています。\nインボイスＮＯ：{1}\n品目：{2}\n完了日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0129' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0129',
	'W',
	'返品元場所と入荷場所の物流グループが異なるため入荷できません。\n返品元場所ＣＤ：{1}\n返品元物流グループＣＤ：{2}\n入荷場所ＣＤ：{3}\n入荷物流グループＣＤ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0130' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0130',
	'W',
	'移送、移送返品、支給、および支給返品の入荷は打切できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0131',
	'W',
	'打切済みのため、取り消しできません。\n取り消しする場合は、先に打切を解除してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0132',
	'W',
	'仕入検収済みのため、取り消しできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0133',
	'W',
	'売上計上済みのため、取り消しできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0134' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0134',
	'W',
	'指定されたインボイスが存在しません。\nインボイスＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0135' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0135',
	'W',
	'指定されたインボイスは既に輸出実績が登録済のため、更新できません。\nインボイスＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0136' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0136',
	'W',
	'指定されたインボイスはパッキングリストの登録対象外です。\nインボイスＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0137' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0137',
	'W',
	'品目、品名、手配ＮＯ、原産地、単位、得意先注文ＮＯ、得意先注文明細ＮＯ、得意先品目、得意先品名単位で合計した数量がインボイス明細の合計数量と一致しません。\n品目：{1}\n品名：{2}\n手配ＮＯ：{3}\n原産地：{4}\n単位：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\n得意先品目：{8}\n得意先品名：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0138' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0138',
	'W',
	'指定された出荷予定は在庫品ではないため、対象外です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0139' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0139',
	'W',
	'指定された出荷予定は保留ではないため、対象外です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0140' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0140',
	'W',
	'同じ納品書ＮＯに紐づく納品書明細において、計上日、税率、為替レート、納税為替レート、源泉税率、基準通貨ＣＤ、納税通貨ＣＤが異なる明細があるため更新できません。\n納品書ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0141' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0141',
	'W',
	'指定された出荷予定引当区分が、即引当または後引当ではないため、対象外です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0142' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0142',
	'W',
	'変更可能な出荷予定、引当可能な在庫・入庫予定がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0143' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0143',
	'W',
	'指定したインボイスの出荷依頼先は、売上・出荷が禁止されています。\n出荷依頼先：{1}\n完了日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0144' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0144',
	'W',
	'出荷時の荷姿単位に換算できないため、輸出実績が登録できません。\nインボイスＮＯ：{1}\nインボイス明細ＮＯ：{2}\n基準単位数量：{3}\n出荷時の荷姿単位：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0145' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0145',
	'W',
	'インボイス単位出荷はできません。インボイスまとめ対象の出荷予定が、すでに出荷指図または出荷実績登録されています。\n出荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0146' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0146',
	'W',
	'インボイスＮＯに「{1}」は指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0147' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0147',
	'W',
	'発番しようとしたインボイスＮＯは既に存在します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0148' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0148',
	'W',
	'既にパッキングリストが登録されているため、インボイスを取消できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0149' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0149',
	'W',
	'インボイス単位出荷とする場合は、インボイスの数量を、出荷予定の数量から変更できません。\nインボイスの数量：{1}\n出荷予定の数量：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0150' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0150',
	'W',
	'振替元の引当数量を超える数量を振り替えることはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0151' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0151',
	'W',
	'引当振替数量の合計が、振替先の保留数量を超えているため登録できません。\n保留数量：{1}\n引当振替数量の合計：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0152' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0152',
	'E',
	'受払区分が判定できません。\n取引パタン区分：{1}\nトランザクション区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0153' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0153',
	'W',
	'合計が出荷予定数量と異なる数量は指定できません。\n出荷予定ＮＯ：{1}\n出荷予定数量：{2}\n入力合計：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0154' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0154',
	'W',
	'出荷予定に対して、全数を打ち切ることはできません。全数打ち切る場合は依頼元の受注または移動・移送予定を取り消してください。\n出荷予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0155' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0155',
	'W',
	'物流制御マスタが登録されていません。\n出荷先物流グループＣＤ：{1}\n出荷元物流グループＣＤ：{2}\n出荷条件ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0156' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0156',
	'W',
	'出荷元のカレンダＣＤが設定されていません。\n物流グループマスタ、または会社マスタの設定を確認してください。\n出荷元物流グループＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0157' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0157',
	'W',
	'出荷先のカレンダＣＤが設定されていません。\n場所マスタ、または会社マスタの設定を確認してください。\n送付先識別区分：{1}\n送付先識別区分ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0158' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0158',
	'W',
	'出荷先のカレンダＣＤが設定されていません。\n取引先マスタ、または会社マスタの設定を確認してください。\n送付先識別区分：{1}\n送付先識別区分ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0159' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0159',
	'W',
	'出荷可能な日が取得できませんでした。\n出荷先物流グループＣＤ：{1}\n出荷元物流グループＣＤ：{2}\n出荷条件ＣＤ：{3}\n着曜日：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0160' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0160',
	'W',
	'出荷可能な日が取得できませんでした。\n出荷先物流グループＣＤ：{1}\n出荷元物流グループＣＤ：{2}\n出荷条件ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0161' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0161',
	'W',
	'納品可能な日が取得できませんでした。\n出荷先物流グループＣＤ：{1}\n出荷元物流グループＣＤ：{2}\n出荷条件ＣＤ：{3}\n着曜日：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0162' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0162',
	'I',
	'納品予定日時が納入希望日時よりも後の出荷予定があります。\n納品予定日時：{1}\n納入希望日時：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0163' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0163',
	'I',
	'出荷予定日時が出荷希望日時よりも後の出荷予定があります。\n出荷予定日時：{1}\n出荷希望日時：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0164' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0164',
	'W',
	'振替先に引当できない振替元明細です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0165' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0165',
	'W',
	'自社から外注先へ移動・移送するインボイス取引の場合、在庫識別区分には「自社在庫」「VMI」「無償受給」のいずれかを指定してください。\n出庫場所ＣＤ：{1}\n入庫場所ＣＤ：{2}\n在庫識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0166' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0166',
	'W',
	'取引通貨と納税通貨に対する為替レートが取得できませんでした。為替レートマスタを設定してください。\n取引通貨：{1}\n納税通貨：{2}\n適用日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0167' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0167',
	'W',
	'指定された取引は利用できません。\n下記の取引パタン区分が指定された取引を指定してください。\n取引パタン区分：「仕入」「経費購買」「売上返品」「出荷返品」「移動・移送」「移動・移送返品」「支給」「支給返品」「入荷」\n取引ＣＤ：{1}\n取引パタン区分：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0168' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0168',
	'W',
	'入荷の取引で資産管理しない品目は、経費購買以外の理由は設定できません。\n取引ＣＤ：{1}\n品目：{2}\n理由ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0169' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0169',
	'W',
	'出庫数を満たす貸出在庫が存在しません。\n品目：{1}\n在庫着荷先：{2}\nロットＮＯ：{3}\nサブロットＮＯ：{4}\n手配ＮＯ：{5}\n確定ＮＯ区分：{6}\n確定ＮＯ：{7}\n荷姿単位：{8}\n格付：{9}\n積送品区分：{10}\n良品区分：{11}\n在庫検査区分：{12}\n在庫識別区分：{13}\n在庫取引先：{14}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0170' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0170',
	'W',
	'出庫数を満たす在庫が存在しません。\n品目：{1}\n場所：{2}\n棚・ライン：{3}\n在庫着荷先：{4}\nロットＮＯ：{5}\nサブロットＮＯ：{6}\n手配ＮＯ：{7}\n荷姿単位：{8}\n格付：{9}\n積送品区分：{10}\n良品区分：{11}\n在庫検査区分：{12}\n在庫識別区分：{13}\n在庫取引先：{14}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0171' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0171',
	'W',
	'検査済でない在庫が存在しません。\n品目：{1}\n場所：{2}\n棚・ライン：{3}\n在庫着荷先：{4}\nロットＮＯ：{5}\nサブロットＮＯ：{6}\n手配ＮＯ：{7}\n荷姿単位：{8}\n格付：{9}\n積送品区分：{10}\n良品区分：{11}\n在庫検査区分：{12}\n在庫識別区分：{13}\n在庫取引先：{14}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0172' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0172',
	'W',
	'出荷実績が登録されているため、取消できません。\n出荷指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0173' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0173',
	'W',
	'確定ＮＯ区分が「なし」の在庫に対して確定ＮＯが指定されています。\n確定ＮＯ区分:{1}\n確定ＮＯ:{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0174' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0174',
	'W',
	'出荷する在庫が確定していないため、登録できません。\n出荷指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0175' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0175',
	'W',
	'貸出在庫が存在しないため、入荷予定が作成できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0176' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0176',
	'W',
	'得意先抽出区分を指定した場合は、得意先を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0177' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0177',
	'W',
	'得意先を指定した場合は、得意先抽出区分を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0178' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0178',
	'W',
	'引当処理中に出荷予定が更新されたため、引当処理を実施しませんでした。再実行してください。\n場所ＣＤ：{1}\n物流グループＣＤ：{2}\n総量引当グループＣＤ：{3}\n品目：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0179' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0179',
	'I',
	'在庫一括引当処理が終了しました。\n処理対象件数：{1}\n全数引当できた件数：{2}\n一部引当できた件数：{3}\n引当できなかった件数：{4}\nエラー件数：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0180' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0180',
	'W',
	'物流制御マスタが登録されていません。\n出荷元物流グループＣＤ：{1}\n出荷先物流グループＣＤ：{2}\n出荷条件ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0181' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0181',
	'I',
	'在庫再引当処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0182' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0182',
	'I',
	'在庫再引当処理が終了しました。\n処理対象件数：{1}\n全数引当できた件数：{2}\n一部引当できた件数：{3}\n引当できなかった件数：{4}\nエラー件数：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0183' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0183',
	'W',
	'自給品は登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0184' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0184',
	'W',
	'確定ＮＯが設定されている貸出在庫は棚卸対象外です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0185' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0185',
	'W',
	'指定の在庫着荷先は棚卸対象外です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0186' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0186',
	'W',
	'指定の制御対象日あるいは棚卸年月ではまだ棚卸を実施できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0187' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0187',
	'W',
	'指定の場所、良品区分、在庫検査区分、積送品区分、在庫識別区分、在庫取引先、確定ＮＯ有無、在庫着荷先の組み合わせでは登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0188' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0188',
	'W',
	'支給の取引を選択した場合、入庫場所には外注場所を登録してください。\n取引ＣＤ：{1}\n入庫場所ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0189' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0189',
	'W',
	'支給返品の取引を選択した場合、入庫場所には社内場所を登録してください。\n取引ＣＤ：{1}\n入庫場所ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0190' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0190',
	'W',
	'支給返品の取引を選択した場合、出庫場所には外注場所を登録してください。\n取引ＣＤ：{1}\n出庫場所ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0191' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0191',
	'W',
	'移動・移送、もしくは移動・移送返品の取引を選択した場合、入庫場所には社内場所を登録してください。\n取引ＣＤ：{1}\n入庫場所ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0192' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0192',
	'W',
	'移動・移送、もしくは移動・移送返品の取引を選択した場合、出庫場所には社内場所を登録してください。\n取引ＣＤ：{1}\n出庫場所ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0194' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0194',
	'W',
	'同一の受領インボイスＮＯで複数件のデータが登録されています。受領インボイス一覧照会画面で対象の受領インボイスを選択して本画面に画面遷移してください。\n受領インボイスＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0195' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0195',
	'W',
	'引当済のため、引当できません。\n移動引当状況ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0196' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0196',
	'W',
	'未引当のため、引当解除できません。\n移動引当状況ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0197' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0197',
	'W',
	'引当可能な在庫、受払予定が存在しないため、引当できませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0198' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0198',
	'W',
	'伝票帳票が取得できませんでした。\n取引先マスタ、または取引マスタを確認してください。\n取引先ＣＤ：{1}\n取引ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0199' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0199',
	'W',
	'出庫場所が設定されていません。先に引当するか、移動実績登録画面で登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0200' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0200',
	'W',
	'移動・移送予定ＮＯ単位での基準単位数量の合計が更新前後で一致していません。\n移動・移送予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0201' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0201',
	'W',
	'移動実績ＮＯ、移動実績明細ＮＯ、データ更新区分の組み合わせが不正です。\n移動実績ＮＯ：{1}\n移動実績明細ＮＯ：{2}\nデータ更新区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0202' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0202',
	'W',
	'インボイス単位出荷はできません。受注インボイスＮＯが同じ出荷予定がインボイス登録対象に含まれていません。\n出荷予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0203' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0203',
	'W',
	'選択した出荷予定ＮＯの出荷予定が取得できませんでした。\n出荷予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0204' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0204',
	'W',
	'インボイス単位出荷のインボイスが混在しているため出荷できません。\nインボイスＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0205' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0205',
	'W',
	'受注登録時に指定したインボイスＮＯに対して、インボイスが登録されていないため出荷できません。\nインボイスＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0206' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0206',
	'W',
	'インボイス単位出荷でインボイス登録された出荷予定が含まれているため出荷できません。\n出荷予定ＮＯ：{1}\nインボイスＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0207' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0207',
	'W',
	'インボイス単位出荷でインボイス登録された出荷予定が含まれているため出荷指図を登録できません。\n出荷予定ＮＯ：{1}\nインボイスＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0208' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0208',
	'W',
	'出荷対象がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0209' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0209',
	'W',
	'有償支給対象に指定していますが、支給単価マスタから単価を取得できませんでした。無償支給とするか、単価を指定してください。\n品目ＣＤ：{1}\n支給先ＣＤ：{2}\n通貨ＣＤ：{3}\nワーキンググループＣＤ：{4}\n適用日：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0210' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0210',
	'W',
	'取引先マスタ、品目マスタ、会社マスタのいずれからも支給税ＣＤが取得できませんでした。支給税ＣＤを指定してください。\n品目ＣＤ：{1}\n支給先ＣＤ：{2}\n適用日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0211' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0211',
	'W',
	'入庫場所と出庫場所は異なる場所を指定してください。\n入庫場所：{1}\n出庫場所：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0212' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0212',
	'W',
	'移動・移送、移動・移送返品、もしくは支給返品の取引を選択した場合、納品先には社内場所を登録してください。\n取引ＣＤ：{1}\n納品先識別ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0213' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0213',
	'W',
	'支給の取引を選択した場合、納品先には外注場所を登録してください。\n取引ＣＤ：{1}\n納品先識別ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0214' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0214',
	'W',
	'売上、出荷、移動・移送、移動・移送返品の取引を選択した場合、出荷場所には社内場所を登録してください。\n取引ＣＤ：{1}\n出荷場所ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0215' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0215',
	'W',
	'支給返品の取引を選択した場合、出荷場所には外注場所を登録してください。\n取引ＣＤ：{1}\n出荷場所ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0216' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0216',
	'W',
	'売上、もしくは出荷で扱える在庫は、自社在庫、預りのみです。\n上記以外の在庫は出荷できません。\n取引ＣＤ：{1}\n在庫識別区分：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0217' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0217',
	'W',
	'移動・移送、もしくは移動・移送返品の取引で扱える在庫は、自社在庫、返品検収前、預り、ＶＭＩ、検収不良、無償受給のみです。\n上記以外の在庫は出荷できません。\n取引ＣＤ：{1}\n在庫識別区分：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0218' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0218',
	'W',
	'支給の取引で扱える在庫は、自社在庫、ＶＭＩ、無償受給、有償支給のみです。\n上記以外の在庫は出荷できません。\n取引ＣＤ：{1}\n在庫識別区分：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0219' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0219',
	'W',
	'支給返品の取引で扱える在庫は、自社在庫、検収不良、無償受給、有償支給のみです。\n上記以外の在庫は出荷できません。\n取引ＣＤ：{1}\n在庫識別区分：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0220' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0220',
	'W',
	'有償支給もしくは無償支給の在庫、または支給返品の取引でかつ検収不良、無償受給の在庫の場合、在庫着荷先には発注先を指定してください。\n取引ＣＤ：{1}\n在庫識別区分：{2}\n在庫着荷先ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0221' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0221',
	'W',
	'支給区分に自給は指定できません。「無償支給」または「有償支給」を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0222' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0222',
	'W',
	'返品検収前、預りの在庫の場合、在庫取引先には得意先を指定してください。\n取引ＣＤ：{1}\n在庫識別区分：{2}\n在庫取引先ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0223' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0223',
	'W',
	'ＶＭＩ、検収不良、無償受給、有償支給の在庫の場合、在庫取引先には発注先を指定してください。\n取引ＣＤ：{1}\n在庫識別区分：{2}\n在庫取引先ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0224' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0224',
	'W',
	'在庫検査区分が「４：検査済」以外の場合、工場・物流倉庫が入庫場所と一致する出庫場所を指定してください。\n\n入庫工場・物流倉庫ＣＤ：{1}\n出庫工場・物流倉庫ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0225' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0225',
	'W',
	'入庫場所もしくは出庫場所が外注先の場合、指定した良品区分は使用できません。\n入庫場所ＣＤ：{1}\n出庫場所ＣＤ：{2}\n良品区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0226' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0226',
	'W',
	'インボイス取引対象の場合、出荷予定数量を上回る出荷指図数量は指定できません。\n出荷予定ＮＯ：{1}\n出荷指図数量：{2}\n出荷予定数量：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0227' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0227',
	'W',
	'インボイス情報を登録済の場合、打切はできません。\n出荷予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0228' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0228',
	'W',
	'インボイス単位出荷の場合、インボイス数量と異なる出荷指図数量は指定できません。\nＩ／Ｖ明細ＮＯ：{1}\n出荷指図数量：{2}\nインボイス数量：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0229' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0229',
	'W',
	'引当可能な在庫、受払予定が足りませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0230' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0230',
	'W',
	'実績計上済の指図があります。そのため取消できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0231' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0231',
	'W',
	'販売単価が取得できないため、受注なしの出荷実績は登録できません。\n販売単価に関するマスタを確認するか、受注を登録してから出荷実績を登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0232' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0232',
	'W',
	'輸出対象の出荷予定の出荷実績数が輸出対象数量を満たしません。\nインボイスＮＯ：{1}\nインボイス明細ＮＯ：{2}\n出荷予定ＮＯ：{3}\n数量(基準単位)：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0233' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0233',
	'W',
	'資産管理対象外のＶＭＩ品は入荷できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0234' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0234',
	'W',
	'売上済です。出荷予定は訂正、取消できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0235' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0235',
	'W',
	'出荷対象の受注が出荷許可と判定されていないため、出荷できません。受注を確認してください。\n受注ＮＯ：{1}\n出荷予定ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0236' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0236',
	'W',
	'出荷留めが指定されているため、出荷指図を登録できません。\n出荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0237' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0237',
	'W',
	'出荷許可と判定されていないため、出荷指図を登録できません。\n出荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0238' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0238',
	'W',
	'品揃区分が「2：品揃する」の受注、もしくは品揃グループＮＯが指定されている受注について、明細が一部含まれていないため、出荷指図を登録できません。\n受注ＮＯ：{1}\n品揃区分：{2}\n品揃グループＮＯ：{3}\n出荷予定ＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0239' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0239',
	'W',
	'品揃区分が「2：品揃する」の受注、もしくは品揃グループＮＯが指定されている受注について、数量を分割して出荷指図を登録できません。\n受注ＮＯ：{1}\n品揃区分：{2}\n品揃グループＮＯ：{3}\n出荷予定ＮＯ：{4}\n予定数量(基準単位)：{5}\n出荷数量(基準単位)：{6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0240' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0240',
	'W',
	'出荷返品対象の在庫が存在しないため、入荷予定を作成できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0241' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0241',
	'W',
	'仕入・入荷禁止の発注先のため、入荷実績は登録できません。\n発注先：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0242' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0242',
	'W',
	'仕入・入荷禁止の品目のため、入荷実績は登録できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0243' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0243',
	'W',
	'出荷指図禁止の得意先のため、出荷指図は登録できません。\n得意先：{1}\n出荷指図日：{2}\n出荷指図禁止日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0244' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0244',
	'W',
	'出荷指図禁止の品目のため、出荷指図は登録できません。\n品目：{1}\n出荷指図日：{2}\n出荷指図禁止日：{3}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0245' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0245',
	'W',
	'売上・出荷禁止の得意先のため、出荷実績は登録できません。\n得意先：{1}\n出荷日：{2}\n売上・出荷禁止日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0246' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0246',
	'W',
	'出荷場所に社内場所、社外場所が混在しているため支給の出荷実績は登録できません。\n出荷場所には社内場所のみ、または同一の社外場所のみを指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0247' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0247',
	'W',
	'入荷数量が予定数量と異なるため入荷できません。\n入荷予定ＮＯ：{1}\n入荷予定数量（基準単位）：{2}\n合計の入荷数量（基準単位）：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0248' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0248',
	'W',
	'計画外の出荷実績では、インボイス取引対象の得意先を指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0249' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0249',
	'W',
	'指定した受領インボイスＮＯが複数件存在します。受領インボイス一覧照会画面から遷移してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0250' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0250',
	'W',
	'在庫管理しない品目は、登録できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0251' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0251',
	'W',
	'資産管理しない品目は、有償支給できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0252' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0252',
	'W',
	'自動時採用フラグがオンのレコードが取得できませんでした。取引マスタの設定を確認してください。\n取引パタン区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0253' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0253',
	'W',
	'取引先マスタで下請け対象として登録されている場合、有償支給時の支給計上区分は着荷基準または使用基準にしてください。\n取引先ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0254' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0254',
	'W',
	'出庫場所と入庫場所、出庫・棚ラインと入庫・棚ラインのいずれか一方は異なるように登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0255' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0255',
	'W',
	'入出庫場所の物流グループが異なるか否かが変わる（移動⇔移送）更新はできません。取消を行った後、新規登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0256' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0256',
	'W',
	'指図済など進捗状況が進んでいるため、更新できません。\n移動移送予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0257' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0257',
	'W',
	'進捗状況が未指図でないため、更新できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0258' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0258',
	'W',
	'出荷元物流グループが混在しているため、インボイス単位出荷はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0259' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0259',
	'W',
	'打切りされているため、指図できません。\n移動引当状況ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0260' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0260',
	'W',
	'出荷指図区分がピッキングありでないため、指図できません。\n移動引当状況ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0261' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0261',
	'W',
	'物流標準場所が取得できませんでした。場所マスタの設定を確認してください。\n物流グループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0262' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0262',
	'W',
	'未指図であるため、実績を登録できません。\n移動引当状況ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0263' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0263',
	'W',
	'取引パタン区分が変わる更新はできません。取消を行った後、新規登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0264' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0264',
	'W',
	'ワーキンググループ間の依頼は、マニュアル追加できません。ＷＧ間依頼登録画面などから登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0265' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0265',
	'W',
	'処理結果件数が期待した件数と異なりました。\n期待した件数：{1}\n実際の結果件数：{2}\nテーブル名：{3}\n{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0266' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0266',
	'W',
	'インボイスが登録されていないため出荷できません。\n配送先を経由しないインボイス取引の場合、出荷作業を行う前にインボイス単位出荷でインボイスを登録してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0267' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0267',
	'W',
	'インボイス単位出荷でないため出荷できません。\n配送先を経由しないインボイス取引の場合、インボイス単位出荷でインボイスを登録してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0268' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0268',
	'W',
	'物流標準場所が取得できません。出庫場所を指定するか、場所マスタで物流標準場所を指定してください。\n物流グループＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0269' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0269',
	'W',
	'出庫場所には、入庫場所と同じ物流グループの場所を指定してください。\n出庫場所の物流グループＣＤ：{1}\n入庫場所の物流グループＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0270' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0270',
	'W',
	'支給区分に「有償支給」を指定するには、支給先の有償支給先がオンである必要があります。支給区分に無償支給を指定するか、取引先マスタの有償支給先を確認してください。\n支給先（取引先）：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0271' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0271',
	'W',
	'支給区分に「有償支給」を指定するには、品目の資産管理区分が「資産管理する」である必要があります。無償支給とするか、品目マスタの資産管理区分を確認してください。\n品目：{1}\n資産管理区分：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0272' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0272',
	'W',
	'取引と出庫場所、入庫場所の関係が不正です。\n取引パタン区分が「移動・移送」または「移動・移送返品」となる取引の場合、出庫場所、入庫場所には社内場所を指定してください（空白は社内場所扱いです）。\n取引ＣＤ：{1}\n取引パタン区分：{2}\n出庫場所ＣＤ：{3}\n入庫場所ＣＤ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0273' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0273',
	'W',
	'取引と入庫場所の関係が不正です。\n取引パタン区分が「支給」となる取引の場合、入庫場所には外注場所を指定してください。\n取引ＣＤ：{1}\n取引パタン区分：{2}\n入庫場所ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0274' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0274',
	'W',
	'取引と出庫場所の関係が不正です。\n取引パタン区分が「支給返品」となる取引の場合、出庫場所には外注場所を指定してください。\n取引ＣＤ：{1}\n取引パタン区分：{2}\n出庫場所ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0275' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0275',
	'W',
	'打切済のため、引当できません。\n移動引当状況ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0276' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0276',
	'W',
	'打切済のため、引当解除できません。\n移動引当状況ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0277' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0277',
	'W',
	'取引と良品区分の関係が不正です。\n取引パタン区分が「支給」となる取引の場合、良品区分には良品を指定してください。\n取引ＣＤ：{1}\n取引パタン区分：{2}\n良品区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0278' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0278',
	'W',
	'出庫場所が指定されていません。取引パタン区分が「支給返品」となる取引の場合、出庫場所には外注場所を必ず指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0279' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0279',
	'W',
	'取引先マスタで得意先が指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0280' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0280',
	'W',
	'取引先マスタで発注先が指定されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0281' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0281',
	'W',
	'取引先マスタに有効な取引先が登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0282' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0282',
	'W',
	'出荷指図対象と出荷指図対象外の出荷予定が混在しているため、インボイス単位出荷はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0283' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0283',
	'W',
	'預り売上で売上が登録されていないため、出荷指図を登録できません。\n受注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0284' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0284',
	'W',
	'打ち切られた明細が含まれているため、出荷指図を取り消しできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0285' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0285',
	'W',
	'インボイスが登録されていないため出荷指図を登録できません。\n配送先を経由しないインボイス取引の場合、出荷作業を行う前にインボイス単位出荷でインボイスを登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0286' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0286',
	'W',
	'インボイス単位出荷でないため出荷指図を登録できません。\n配送先を経由しないインボイス取引の場合、インボイス単位出荷でインボイスを登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0287' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0287',
	'W',
	'インボイス単位出荷は解除できません。インボイスまとめ対象の出荷予定が、すでに出荷指図または出荷実績登録されています。\n出荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0288' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0288',
	'W',
	'指定した品目は、品目禁止マスタにおいて移動が禁止されています。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0289' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0289',
	'W',
	'指定した入庫場所の発注先は、取引先禁止マスタにおいて移送・移動が禁止されています。\n取引先：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0290' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0290',
	'W',
	'インボイス単位出荷が指定されているインボイスの明細が一部含まれていないため、出荷指図を登録できません。\n出荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0291' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0291',
	'W',
	'預り売上で売上が登録されていないため、出荷実績を登録できません。\n受注明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0292' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0292',
	'W',
	'インボイスが取り消されているため、更新または取り消しできません。\nインボイスＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0293' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0293',
	'W',
	'インボイス取引対象の得意先からの出荷返品の場合、予定と異なる単位または数量の入荷はできません。\n入荷予定ＮＯ：{1}\n得意先ＣＤ：{2}\n予定取引単位ＣＤ：{3}\n予定取引単位数量：{4}\n取引単位ＣＤ：{5}\n取引単位数量：{6}\n{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0294' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0294',
	'W',
	'パッキングリスト作成対象ですが、パッキングリストが登録されていません。\nインボイスＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0295' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0295',
	'W',
	'売上計上済みのため、更新または取り消しできません。\nインボイスＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0296' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0296',
	'W',
	'入荷済みのため、更新または取り消しできません。\nインボイスＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0297' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0297',
	'W',
	'預り在庫は棚卸対象外です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0298' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0298',
	'W',
	'検収不良の在庫は棚卸対象外です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0299' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0299',
	'W',
	'すでに出荷指図済の出荷予定がある為、インボイスは取消できません。\n出荷予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0300' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0300',
	'W',
	'出荷返品、移動・移送、移動・移送返品、支給、支給返品、入荷の取引では非在庫品は入荷できません。\n取引ＣＤ：{1}\n品目：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0301' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0301',
	'W',
	'資産管理する品目の場合、入荷の取引で扱える購買識別区分は、無償受給、ＶＭＩのみです。\n上記以外の購買識別区分は入荷できません。\n取引ＣＤ：{1}\n品目：{2}\n購買識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0302' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0302',
	'W',
	'入荷の取引で資産管理する品目は仕入の理由以外、または経費購買の理由は設定できません。\n取引ＣＤ：{1}\n品目：{2}\n理由ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0303' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0303',
	'W',
	'移送の取引では移送の理由以外は設定できません。\n取引ＣＤ：{1}\n理由ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0304' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0304',
	'W',
	'移送返品、支給、支給返品の取引では移送の理由以外、または他勘定出庫の理由は設定できません。\n取引ＣＤ：{1}\n理由ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0305' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0305',
	'W',
	'出荷返品の取引では売上返品の理由以外、または販売他勘定の理由は設定できません。\n取引ＣＤ：{1}\n理由ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0306' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0306',
	'W',
	'入荷の取引では購買識別区分、預りの両方に値を設定できません。\n購買識別区分、預りのいずれかを設定してください。\n取引ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0307' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0307',
	'W',
	'資産管理しない品目の場合、入荷の取引で扱える購買識別区分は無償受給のみです。\n上記以外の購買識別区分は入荷できません。\n取引ＣＤ：{1}\n品目：{2}\n購買識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0308' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0308',
	'W',
	'指定された確定ＮＯ区分は、「他勘定振替出庫」では使用できません。正しい確定ＮＯ区分を指定してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0309' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0309',
	'W',
	'指定の場所、良品区分、在庫識別区分、在庫取引先、確定ＮＯ区分、在庫着荷先の組み合わせでは登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0310' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0310',
	'W',
	'承認されている他勘定振替予定の数量より多い数量では登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0311' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0311',
	'W',
	'新規ロット入力不可の品目のため、ロット作成できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0312' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0312',
	'W',
	'現品票印刷上限枚数を超えているため、印刷できません。\n現品票印刷上限枚数：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0313' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0313',
	'W',
	'インボイス取引対象の場合、出荷予定数量を上回る出荷実績数量は指定できません。\n出荷予定ＮＯ：{1}\n出荷実績数量：{2}\n出荷予定数量：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0314' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0314',
	'W',
	'インボイス単位出荷の場合、インボイス数量と異なる出荷実績数量は指定できません。\nＩ／Ｖ明細ＮＯ：{1}\n出荷実績数量：{2}\nインボイス数量：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0315' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0315',
	'W',
	'指定したインボイスは、パッキングリスト登録対象外です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0316' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0316',
	'W',
	'指定したインボイスは、パッキングリストが既に登録されているため、新規登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0317' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0317',
	'W',
	'指定したインボイスは、パッキングリストが登録されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0318' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0318',
	'W',
	'移送・移動禁止の支給先のため、出荷実績は登録できません。\n支給先：{1}\n出荷日：{2}\n移送・移動禁止日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0319' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0319',
	'W',
	'移送・移動禁止の支給先のため、出荷指図は登録できません。\n支給先：{1}\n出荷指図日：{2}\n移送・移動禁止日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0320' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0320',
	'W',
	'インボイス未登録のため、パッキングリストを発行できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0321' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0321',
	'W',
	'パッキングリスト省略のため、パッキングリストを発行できません。\nインボイスＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0322' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0322',
	'W',
	'インボイス未登録のため、インボイスを発行できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0323' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0323',
	'W',
	'パッキングリスト未登録のため、パッキングリストを発行できません。\nインボイスＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0324' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0324',
	'W',
	'出荷予定が確定されています。\n一部指図すると出荷予定が分割されるため、確定された出荷予定は一部指図できません。\n出荷予定ＮＯ：{1}\n指図数量(基準単位)：{2}\n予定数量(基準単位)：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0325' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0325',
	'W',
	'インボイス取引対象の発注先からの入荷の場合、予定数量以上の入荷はできません。\n入荷予定ＮＯ：{1}\n発注先ＣＤ：{2}\n予定基準単位数量：{3}\n合計基準単位数量：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0326' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0326',
	'W',
	'入荷予定に対して入荷数量が異なるため入荷できません。\n支給に対する入荷の場合、入荷数量は予定と同数であること、また納品書の明細分をまとめて入荷（または入荷を取り消し）する必要があります。\n入荷予定ＮＯ：{1}\n納品書ＮＯ：{2}\n入荷予定数量（基準単位）：{3}\n合計の入荷数量（基準単位）：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0327' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0327',
	'W',
	'支給の納品書に対して入荷が不足しているため入荷できません。\n支給に対する入荷の場合、納品書の明細分をまとめて入荷（または入荷を取り消し）する必要があります。\n入荷予定ＮＯ：{1}\n納品書ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0328' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0328',
	'W',
	'予定に対する実績登録済みの数量の合計が予定数量以上のため、打切できません。\n予定数量(基準単位)：{1}\n実績数量(基準単位)：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0329' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0329',
	'W',
	'理論在庫数量がマイナスの場合は棚卸対象外です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0330' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0330',
	'W',
	'外注場所で、在庫識別区分が「無償受給」かつ在庫着荷先の指定がない場合は棚卸対象外です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0331' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0331',
	'W',
	'自社場所で、在庫識別区分が「自社在庫」かつ確定ＮＯ区分が「なし」の場合、在庫着荷先は指定できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0332' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0332',
	'I',
	'引当できなかった指図明細が存在します。\n引当対象の指図明細の件数：{1}\n引当が成功した件数：{2}\n引当が失敗した件数：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0333' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0333',
	'W',
	'仮受注のためインボイスを登録できません。\n受注ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0334' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0334',
	'W',
	'支給先に対する買掛先と日付から債務部門を取得できません。取引先マスタ及び取引先補助マスタを確認してください。\n支給先ＣＤ：{1}\n買掛先ＣＤ：{2}\n日付：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0335' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0335',
	'W',
	'支給先に対する買掛先から取得された部門が指定した日付に対して部門マスタに登録されていません。部門マスタを確認してください。\n支給先ＣＤ：{1}\n買掛先ＣＤ：{2}\n部門ＣＤ：{3}\n日付：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0336' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0336',
	'W',
	'指定した日付に対して部門マスタに登録されていません。部門マスタを確認してください。\n債務部門ＣＤ：{1}\n日付：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0337' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0337',
	'W',
	'ロット・場所提案できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0338' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0338',
	'W',
	'提案対象が、他の処理によって更新されています。再検索してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0339' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0339',
	'W',
	'出荷予定が打切されているため訂正、取消できません。訂正、取消する場合は打切解除してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0340' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0340',
	'W',
	'自社から自社への移動実績を登録する場合、在庫識別区分には「自社在庫」「VMI」「検収不良」「無償受給」「返品検収前」「仕入検収前」のいずれかを指定してください。\n出庫場所ＣＤ：{1}\n入庫場所ＣＤ：{2}\n在庫識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0341' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0341',
	'W',
	'自社から自社への出荷実績を登録する場合、在庫識別区分には「自社在庫」「VMI」「検収不良」「無償受給」「返品検収前」「預り」のいずれかを指定してください。\n出庫場所ＣＤ：{1}\n入庫場所ＣＤ：{2}\n在庫識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0342' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0342',
	'W',
	'ロット逆転が発生しました。\n有効期限の許可範囲が逆転しています。\n過去にロットチェック無視で出荷したロットが存在する可能性があります。\n得意先ＣＤ：{1}\n納品先ＣＤ：{2}\n納品（予定）日：{3}\n品目：{4}\nロットＮＯ：{5}\nサブロットＮＯ：{6}\n有効期限：{7}\n許可する有効期限：{8}～{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0343' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0343',
	'W',
	'移動実績が登録されているため、訂正できません。\n移動引当状況ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0344' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0344',
	'W',
	'移動実績が登録されているため、取消できません。\n移動指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0345' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0345',
	'W',
	'出荷予定の数量の合計が、受注明細もしくは移動・移送予定の数量と異なるため、更新できません。\n受注明細ＮＯ：{1}\n移動・移送予定ＮＯ：{2}\n出荷予定数量：{3}\n入力合計：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0346' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0346',
	'W',
	'出荷予定に紐付く出荷引当状況が複数存在するため、出荷予定をまとめられません。\n出荷予定をまとめるには、先に引当状況モードで出荷引当状況をひとつにまとめてください。\n出荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0347' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0347',
	'W',
	'引当可能な在庫、受払予定が存在しないため、引当できませんでした。\n出荷予定を変更するには、先に引当状況モードで出荷引当状況の場所引当をオフにするか、引当解除登録画面で引当を解除してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0348' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0348',
	'W',
	'インボイス単位出荷とする場合は、インボイス明細まとめはできません。\n出荷予定をまとめてからインボイス登録するか、出荷予定ごとにインボイス登録してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0349' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0349',
	'W',
	'インボイス情報を登録済の場合、インボイス数量より少ない出荷実績数量は指定できません。\n出荷予定ＮＯ：{1}\n出荷実績数量：{2}\n出荷予定数量：{3}\nインボイス数量：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0350' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0350',
	'W',
	'出荷予定のインボイス数量と出荷実績数量が異なるため、打切はできません。\n出荷予定ＮＯ：{1}\n出荷実績数量：{2}\n出荷予定数量：{3}\nインボイス数量：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0351' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0351',
	'W',
	'品目単位マスタが存在しません\n品目：{1}\n単位：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0352' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0352',
	'W',
	'税マスタに売上税として登録されていません。\n税ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0353' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0353',
	'W',
	'税マスタに支給税として登録されていません。\n税ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0354' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0354',
	'W',
	'取引先マスタ、品目マスタ、会社マスタのいずれからも売上税ＣＤが取得できませんでした。売上税ＣＤを指定してください。\n品目ＣＤ：{1}\n得意先ＣＤ：{2}\n適用日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0355' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0355',
	'W',
	'再出荷予定の数量の合計が、元の再出荷予定数量と異なるため、更新できません。\n受注明細ＮＯ：{1}\n元の再出荷予定数量：{2}\n入力合計：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL0356' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL0356',
	'W',
	'仕入実績に対応する入荷実績の負担部門が不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの負担部門がオンになっていること\n適用日：{1}\n負担部門ＣＤ：{2}\n入荷実績ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1001',
	'I',
	'投入品在庫補充処理（登録）を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1002',
	'I',
	'実行条件：\n投入予定日：{1}～{2}\n受払予定状況：{3}未確定 {4}オーダ保存 {5}依頼 {6}予定 {7}製造保存 {8}指図済 {9}着手中\n処理対象：{10}不足情報削除 {11}移送予定削除 {12}不足情報作成 {13}移送予定作成 \n場所、棚・ライン：{14}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1003',
	'I',
	'投入品在庫補充処理（登録）を終了しました。\n不足情報の削除件数：{1}\n移送予定の削除件数：{2}\n受払予定の処理件数：{3}\n不足情報の作成件数：{4}\n移送予定の作成件数：{5}\n移送予定エラー件数：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1004',
	'I',
	'投入品在庫補充処理（削除）を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1005',
	'I',
	'実行条件：\n入庫予定日：{1}～{2}\n処理対象：{3}不足情報削除 {4}移送予定削除\n場所、棚・ライン：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1006',
	'I',
	'投入品在庫補充処理（削除）を終了しました。\n不足情報の削除件数：{1}\n移送予定の削除件数：{2}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1007',
	'W',
	'投入品在庫補充処理が実行中のため、処理を中断しました。\n場所、棚・ライン：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1008',
	'W',
	'不足している投入品があるため、不足情報を作成しました。\n場所ＣＤ：{1}\n棚・ラインＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1009',
	'W',
	'引当可能な在庫、受払予定が存在しませんでした。\nデータＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1010',
	'W',
	'引当可能な在庫、受払予定が足りませんでした。一部補充しました。\nデータＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1012',
	'I',
	'発注点在庫補充処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1013',
	'I',
	'発注点在庫補充処理を終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1014',
	'W',
	'下記の品目で在庫補充方法が設定されていないため、発注情報は登録できませんでした。\n格納場所：{1}\n品目：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1015',
	'W',
	'指定された出荷予定は指図済みのため、対象外です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1016',
	'W',
	'指定された出荷予定は出荷済みのため、対象外です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1017',
	'W',
	'振替先の出荷予定日に対して引当可能日数が到来してないため、対象外です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1018',
	'W',
	'振替先の出荷予定日に対して引当可能日数が到来してないため、登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1019',
	'W',
	'出荷が完了しているため、新規で出荷実績を登録できません。\n出荷指図ＮＯ：{1}\n出荷指図明細ＮＯ：{2}\n出荷予定ＮＯ：{3}\n出荷引当状況ＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1020',
	'W',
	'入荷が完了しているため、新規で入荷実績を登録できません。\n入荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1021',
	'W',
	'対応する入荷予定情報が入荷不要のため、取り込むことができません。\n入荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1022',
	'I',
	'出荷品在庫補充処理（登録）を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1023',
	'I',
	'実行条件：\n出荷予定日時：{1}～{2}\n受払予定状況：{3}予定 {4}受注 {5}納期回答 {6}納入指示 {7}指図済\n処理対象：{8}不足情報削除 {9}移動予定削除 {10}不足情報作成 {11}移動予定作成 {12}未引当 {13}引当\n出荷条件ＣＤ：{14}\n出荷作業ＣＤ：{15}\n場所、棚・ライン：{16}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1024',
	'W',
	'出荷品在庫補充処理が実行中のため、処理を中断しました。\n場所、棚・ライン：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1025',
	'I',
	'出荷品在庫補充処理（登録）を終了しました。\n不足情報の削除件数：{1}\n移動予定の削除件数：{2}\n受払予定の処理件数：{3}\n不足情報の作成件数：{4}\n移動予定の作成件数：{5}\n移動予定エラー件数：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1026',
	'I',
	'出荷品在庫補充処理（削除）を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1027',
	'I',
	'出荷品在庫補充処理（削除）を終了しました。\n不足情報の削除件数：{1}\n移動予定の削除件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1028',
	'W',
	'使用可能な在庫が不足しているため、出荷実績を登録できません。\n品目：{1}\n場所：{2}\n棚・ライン：{3}\nロットＮＯ：{4}\nサブロットＮＯ：{5}\n手配ＮＯ：{6}\n荷姿単位：{7}\n格付：{8}\n良品区分：{9}\n在庫識別区分：{10}\n在庫取引先：{11}\n{12}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1029',
	'W',
	'使用可能な在庫または投入場所への入庫予定が不足しているため、出荷実績を登録できません。\nマイナス在庫を許可する品目であっても、出荷実績を登録するためには使用可能な入庫予定が存在する必要があります。\n品目：{1}\n場所：{2}\n棚・ライン：{3}\nロットＮＯ：{4}\nサブロットＮＯ：{5}\n手配ＮＯ：{6}\n荷姿単位：{7}\n格付：{8}\n良品区分：{9}\n在庫識別区分：{10}\n在庫取引先：{11}\n{12}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1030',
	'W',
	'使用可能な在庫が不足しているため、移動実績を登録できません。\n品目：{1}\n場所：{2}\n棚・ライン：{3}\nロットＮＯ：{4}\nサブロットＮＯ：{5}\n手配ＮＯ：{6}\n荷姿単位：{7}\n格付：{8}\n良品区分：{9}\n在庫識別区分：{10}\n在庫取引先：{11}\n{12}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1031',
	'W',
	'使用可能な在庫または投入場所への入庫予定が不足しているため、移動実績を登録できません。\nマイナス在庫を許可する品目であっても、移動実績を登録するためには使用可能な入庫予定が存在する必要があります。\n品目：{1}\n場所：{2}\n棚・ライン：{3}\nロットＮＯ：{4}\nサブロットＮＯ：{5}\n手配ＮＯ：{6}\n荷姿単位：{7}\n格付：{8}\n良品区分：{9}\n在庫識別区分：{10}\n在庫取引先：{11}\n{12}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1032',
	'W',
	'取引と送付先の関係が不正です。\n下記の取引パタン区分が指定された取引を使用する場合は、送付先に「配送先」を指定できません。\n取引パタン区分：「支給返品」\n取引ＣＤ：{1}\n取引パタン区分：{2}\n送付先識別区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1033',
	'W',
	'取引と理由の関係が不正です。\n下記の取引パタン区分が指定された取引を使用する場合は、「売上」の理由を指定してください。\n取引パタン区分：「売上」「出荷」\n取引ＣＤ：{1}\n取引パタン区分：{2}\n理由ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1034',
	'W',
	'取引と理由の関係が不正です。\n下記の取引パタン区分が指定された取引を使用する場合は、「販売他勘定」の理由を指定できません。\n取引パタン区分：「出荷」\n取引ＣＤ：{1}\n取引パタン区分：{2}\n理由ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1035',
	'W',
	'取引と理由の関係が不正です。\n下記の取引パタン区分が指定された取引を使用する場合は、「移送」の理由を指定してください。\n取引パタン区分：「移動・移送」「移動・移送返品」「支給」「支給返品」\n取引ＣＤ：{1}\n取引パタン区分：{2}\n理由ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1036',
	'W',
	'取引と理由の関係が不正です。\n下記の取引パタン区分が指定された取引を使用する場合は、「他勘定出庫」の理由を指定できません。\n取引パタン区分：「移動・移送返品」「支給」「支給返品」\n取引ＣＤ：{1}\n取引パタン区分：{2}\n理由ＣＤ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1037',
	'W',
	'取引と品目の関係が不正です。\n下記の取引パタン区分が指定された取引を使用する場合は、「在庫管理品」を指定ください。\n取引パタン区分：「出荷」「移動・移送」「移動・移送返品」「支給」「支給返品」\n取引ＣＤ：{1}\n取引パタン区分：{2}\n品目：{3}\n在庫管理区分：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1038',
	'W',
	'品目マスタの手配ＮＯ１管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ１が必須です。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1039',
	'W',
	'品目マスタの手配ＮＯ２管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ２が必須です。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1040',
	'W',
	'品目マスタの手配ＮＯ３管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ３が必須です。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1041',
	'W',
	'品目マスタの手配ＮＯ４管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ４が必須です。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1042',
	'W',
	'インボイス取引対象の発注先からの入荷は打ち切りできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1043',
	'W',
	'インボイス取引対象の得意先からの入荷は打ち切りできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1044',
	'W',
	'値引品目の入荷は打ち切りできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1045',
	'W',
	'ＩＦ送信済のため更新できません。\n出荷指図ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1046',
	'W',
	'ＩＦ送信対象に対して打ち切り、もしくは打切解除を行う場合、明細分割など、明細の件数が変わる訂正を同時に行うことはできません。\n出荷指図明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1047',
	'W',
	'ＩＦ送信済のため更新できません。\n移動指図ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1048',
	'I',
	'実行条件：\n入庫予定日時：{1}～{2}\n処理対象：{3}不足情報削除 {4}移動予定削除\n場所、棚・ライン：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1049',
	'W',
	'指定された出荷指図が存在しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n出荷指図ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1050',
	'W',
	'出荷返品の取引では出荷時に登録したロットＮＯ、サブロットＮＯを指定してください。\n納品書ＮＯ：{1}\n納品書明細ＮＯ：{2}\nロットＮＯ：{3}\nサブロットＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1051',
	'W',
	'出荷返品の取引では出荷時に登録した数量より多い数量で返品することはできません。\n納品書ＮＯ：{1}\n納品書明細ＮＯ：{2}\nロットＮＯ：{3}\nサブロットＮＯ：{4}\n数量：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1052',
	'W',
	'指定したロットＮＯ、サブロットＮＯは出荷返品済です。\n納品書ＮＯ：{1}\n納品書明細ＮＯ：{2}\nロットＮＯ：{3}\nサブロットＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1053',
	'W',
	'受領インボイス登録されている仕入予定に対する仕入実績は、受領インボイス単位で登録してください。同時計上ＦＬＧがオンの入荷は、仕入実績が登録できないため入荷実績も登録しませんでした。\n受領インボイスＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1054',
	'W',
	'インボイス明細の数量が受領インボイス未登録の数量を超えています。\n超過する数量で登録する場合、確定フラグをオンで登録してください。\n超過数量：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1055',
	'W',
	'行追加した明細は在庫管理しない品目を設定してください。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1056',
	'W',
	'行追加した明細は資産管理しない品目を設定してください。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1057',
	'W',
	'資産管理しない品目の仕入理由は経費購買の理由を設定してください。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1058',
	'W',
	'行追加した明細だけの登録はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1059',
	'W',
	'インボイス明細の数量が入荷数量より少ないため登録できません。\n入荷数量より少なく登録する場合は受領インボイスを取り消してから、受領インボイス登録対象選択画面の「入荷実績」モードで受領インボイスを再登録してください。\n仕入予定数量（基準単位）：{1}\n入荷数量（基準単位）：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1060',
	'W',
	'行追加した明細は取引パタン区分「仕入」の取引を設定してください。\n取引ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1061',
	'W',
	'インボイス明細に対応する入荷予定に製造指図が紐付けられていないため、受領インボイスを登録できません。\n入荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1062',
	'W',
	'取引先マスタに有効な得意先として登録されていません。\n得意先ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1063',
	'W',
	'出荷済の入荷予定については、出荷時に登録したロットＮＯ、サブロットＮＯ、格付を指定してください。\n入荷予定ＮＯ：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n格付：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1064',
	'W',
	'インボイス単位出荷で出荷済みのため、取り消しできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1065',
	'W',
	'指図区分が「2：ピッキングなし」の明細のみで登録できません。「１：ピッキングあり」の明細を含めて登録してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1066',
	'W',
	'仕入締が解除されているため、計上日は変更できません。\n訂正前の計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1067',
	'W',
	'出荷計上日よりも過去の売上計上日が指定されています。\n出荷計上日：{1}\n売上計上日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1068',
	'W',
	'出荷計上日よりも過去の売上計上日が指定されています。\n出荷計上日：{1}\n売上計上日：{2}\n出荷実績ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1069',
	'W',
	'入荷予定、仕入予定の残数量が同数でないため、同時に打切できません。\n入荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1070',
	'W',
	'預り売上した数量の範囲内で、出荷予定を調整してください。\n売上実績明細ＮＯ：{1}\n出荷予定NO：{2}\n調整前の数量：{3}\n調整後の数量：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1071',
	'W',
	'預り売上が既に登録されているため、出荷予定の取消はできません。\n出荷予定ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1072',
	'W',
	'場所マスタに有効な場所として登録されていません。\n入荷場所ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1073',
	'W',
	'同じヘッダに対する他の他勘定振替実績の取り込み処理でエラーが発生したため、取り込みできませんでした。\n外部他勘定振替実績ＮＯ：{1}\n取引：{2}\n場所：{3}\n他勘定振替実績日時：{4}\n実施部門：{5}\n実施担当者：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1074',
	'W',
	'不良品のロットが指定されています。\n該当の取引では不良品のロットは指定できません。\n取引ＣＤ：{1}\n取引パタン区分：{2}\n品目：{3}\nロットＮＯ：{4}\nサブロットＮＯ：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1101',
	'W',
	'納入指示済もしくは納期回答受領済のため、数量を訂正できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1102',
	'W',
	'受注明細が打切されているため訂正、取消できません。\n訂正、取消する場合は、受注明細を打切解除してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1103',
	'W',
	'発注明細が打切されているため訂正、取消できません。\n訂正、取消する場合は、発注明細を打切解除してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1104',
	'W',
	'返品元納品書ＮＯまたは返品元支給実績ＮＯより、返品元の支給計上日が取得できませんでした。入力値を確認するか支給計上日（基）を直接入力してください。\n返品元納品書ＮＯ：{1}\n返品元支給実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1105',
	'W',
	'支給返品の場合は、支給計上日（基）を入力してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1106',
	'W',
	'支給返品以外の場合は、支給元情報を入力しないでください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1109',
	'W',
	'指定したインボイスＮＯが複数件存在します。インボイス一覧照会画面から遷移してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1110',
	'W',
	'出荷指図を元にインボイスが登録済のため、インボイス数量を下回る数量に訂正できません。\n出荷指図明細ＮＯ：{1}\n出荷指図数量（合計）：{2}\nインボイス数量：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1111',
	'W',
	'インボイス情報が登録済の場合、インボイス未指図数量を上回る出荷指図数量は指定できません。\n出荷予定ＮＯ：{1}\nＩ／Ｖ明細ＮＯ：{2}\n出荷指図数量：{3}\nインボイス未指図数量：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1112',
	'W',
	'出荷実績を元にインボイスが登録済のため、インボイス数量を下回る数量に訂正できません。\n出荷実績明細ＮＯ：{1}\n出荷実績数量：{2}\nインボイス数量：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1113',
	'W',
	'インボイス情報が登録済の場合、インボイス未出荷数量を上回る出荷実績数量は指定できません。\n出荷予定ＮＯ：{1}\nＩ／Ｖ明細ＮＯ：{2}\n出荷実績数量：{3}\nインボイス未出荷数量：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1114',
	'W',
	'出荷実績が登録されているため、出荷数量を下回るインボイス数量は指定できません。\nＩ／Ｖ明細ＮＯ：{1}\nインボイス数量：{2}\n出荷数量：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1115',
	'W',
	'指定された入荷実績は受領インボイスが登録されているため、受領インボイスＮＯを仮登録できません。\n入荷実績ＮＯ：{1}\n受領インボイスＮＯ：{2}\n受領インボイス管理ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1116',
	'W',
	'出荷指図を元にインボイスが登録済のため、行削除または取消できません。\n出荷指図明細ＮＯ：{1}\n出荷引当状況ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1117',
	'W',
	'出荷実績を元にインボイスが登録済のため、行削除または取消できません。\n出荷実績明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1118',
	'W',
	'受領インボイスＮＯが重複しているため、登録できません。\n受領インボイスＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1119',
	'W',
	'出荷指図が登録されているため、出荷指図数量を下回るインボイス数量は指定できません。\nＩ／Ｖ明細ＮＯ：{1}\nインボイス数量：{2}\n出荷指図数量：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1120',
	'W',
	'行追加した明細に在庫管理または資産管理する品目を設定している場合、確定をオンからオフに変更できません。\n行削除してください。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1121',
	'W',
	'出荷指図が登録されているため、行削除または取消できません。\nＩ／Ｖ明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1122',
	'W',
	'出荷実績が登録されているため、行削除または取消できません。\nＩ／Ｖ明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1123',
	'W',
	'予定数以上の数量で打切りすることはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1124',
	'W',
	'インボイスが登録されていないため出荷できません。\n売上計上区分が出荷基準の場合、出荷作業を行う前にインボイスを登録してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1125',
	'W',
	'計画外の出荷実績では、売上計上区分が出荷基準の場合、インボイス取引対象の得意先を指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1126',
	'W',
	'インボイスが登録されていないため出荷できません。\n売上計上区分が出荷基準の場合、出荷作業を行う前にインボイスを登録してください。\n出荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1127',
	'W',
	'インボイスが登録済みのため、更新または取り消しできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1128' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1128',
	'W',
	'検索した受領インボイスは既に取り消されているため、訂正または取消できません。\n受領インボイスＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1129' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1129',
	'I',
	'確定をオフにすると仕入実績の項目がクリアされますがよろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1130' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1130',
	'W',
	'売上計上区分が出荷基準かつ配送先経由しない場合、同一のインボイスに含まれる全ての出荷実績の出荷日、計上日を揃えて登録してください。\nインボイスＮＯ：{1}\n出荷指図ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1131',
	'W',
	'売上計上区分が出荷基準かつ配送先経由しない場合、同一のインボイスに含まれる全ての対象を指定してください。\nインボイスＮＯ：{1}\n出荷指図ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1132',
	'W',
	'売上計上区分が出荷基準かつ配送先経由しない場合、インボイスに対して一部出荷となるような登録はできません。\nＩ／Ｖ明細ＮＯ：{1}\n出荷実績数量の合計：{2}\nインボイス数量：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1133',
	'I',
	'仮単価の明細が含まれています。\n売上を計上するまでに、仮単価を本単価に訂正してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1134' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1134',
	'I',
	'仮単価の明細が含まれています。\n受領インボイスを確定するまでに、仮単価を本単価に訂正してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1135' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1135',
	'I',
	'仮単価のまま仕入を計上します。\n必要に応じて本単価に訂正してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1136' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1136',
	'W',
	'入荷予定を元に作成された受領インボイスに対して、仕入実績が登録されているため、登録できません。\n受領インボイスＮＯ：{1}\n入荷予定ＮＯ：{2}\n発注明細ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1201' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1201',
	'W',
	'ロットＮＯの混在が不可の出荷予定でロットが混在しているため、処理できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1202' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1202',
	'W',
	'サブロットＮＯの混在が不可の出荷予定でサブロットが混在しているため、処理できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1203' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1203',
	'W',
	'在庫識別区分に「VMI」を指定する場合は、入庫場所には自社場所のみを指定してください。\n入庫場所：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1204' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1204',
	'W',
	'在庫識別区分に「返品検収前」、「預り」、「VMI」を指定する場合は、入庫場所には自社場所のみを指定してください。\n入庫場所：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1205' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1205',
	'W',
	'在庫識別区分に「有償支給」を指定する場合は、入庫場所には外注場所のみを指定してください。\n入庫場所：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1206' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1206',
	'W',
	'出荷可能な日が取得できませんでした。\n出荷先物流グループＣＤ：{1}\n出荷元物流グループＣＤ：{2}\n出荷条件ＣＤ：{3}\n着曜日：{4}\n出荷作業ＣＤ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1207' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1207',
	'W',
	'出荷可能な日が取得できませんでした。\n出荷先物流グループＣＤ：{1}\n出荷元物流グループＣＤ：{2}\n出荷条件ＣＤ：{3}\n出荷作業ＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1208' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1208',
	'W',
	'納品可能な日が取得できませんでした。\n出荷先物流グループＣＤ：{1}\n出荷元物流グループＣＤ：{2}\n出荷条件ＣＤ：{3}\n着曜日：{4}\n出荷作業ＣＤ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1209' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1209',
	'W',
	'納品可能な日が取得できませんでした。\n出荷先物流グループＣＤ：{1}\n出荷元物流グループＣＤ：{2}\n出荷条件ＣＤ：{3}\n出荷作業ＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1301' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1301',
	'W',
	'入力された期限がロットに設定されている期限と異なります。\n出荷元期限：{1}\nロット管理情報の有効期限：{2}\nロット管理情報の使用期限：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1302' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1302',
	'W',
	'同じロットが設定されているレコードに、異なる有効期限または期限起算日が設定されています。\n入荷予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBEL1303' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBEL1303',
	'W',
	'取得した販売単価が0でした。\n販売単価が0の場合、売上理由は必須です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFP0001',
	'I',
	'品目品管マスタに先行検査有効として登録されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFP0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFP0002',
	'W',
	'受入検査・製造検査・ロット検査以外の検査予定をまとめることはできないため、画面遷移できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFP0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFP0003',
	'W',
	'検査実施単位が実績単位もしくは未定の場合、検査予定をまとめることはできないため、画面遷移できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFP0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFP0004',
	'W',
	'まとめ不可能な検査予定が選択されているため、画面遷移できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFP0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFP0005',
	'I',
	'品目検査パタンマスタに検査方法区分が「４：抜取規格検査」として登録されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFP0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFP0006',
	'I',
	'不合格の検査項目があります。\n検査ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFP0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFP0007',
	'I',
	'特採の検査項目があります。\n検査ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0001',
	'W',
	'処理対象の品目又はその構成品に、検査判定が行われていないロットが存在します。\nロットトレース（原因調査）画面で確認してください。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0002',
	'W',
	'処理対象の品目又はその構成品に、良品以外のロットが存在します。\nロットトレース（原因調査）画面で確認してください。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0003',
	'W',
	'処理対象の品目又はその構成品に、製造記録承認が行われていないロットが存在します。\nロットトレース（原因調査）画面で確認してください。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0004',
	'W',
	'製造記録承認が行われていないロットが存在します。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0005',
	'W',
	'指定された品目は市場出荷判定の対象ではないため登録できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0006',
	'W',
	'ロット管理していない品目の場合、市場出荷判定を行うことはできません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0007',
	'W',
	'対象のロット情報は既に登録されています。\n品目：{1}\nロットＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0008',
	'W',
	'市場出荷判定情報を登録しているため取り消しできません。\n品目：{1}\nロットＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0009',
	'W',
	'市場出荷判定にて出荷許可と判定されていないロットが選択されています。\n市場出荷判定状況区分：{1}\n品目：{2}\nロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0010',
	'W',
	'ログインユーザに対する承認役割権限がありません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0011',
	'W',
	'工場出荷承認情報を取得できませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0012',
	'W',
	'工場出荷承認済または工場出荷却下済のため、処理できませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0013',
	'W',
	'製造が完了していないため、出荷承認又は却下は行えません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0014',
	'W',
	'処理対象の品目又はその構成品に、以下のいずれかのロットが存在します。\n・製造記録承認されていないロット\n・検査判定されていないロット\n・良品以外のロット\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0015',
	'W',
	'承認済または却下以外のデータは更新できません。\n工場出荷承認ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0016',
	'W',
	'該当のサブロットに対するロット検査、受入検査、製造検査が存在します。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n手配ＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0017',
	'W',
	'着荷先に存在する在庫の検査予定を作成することはできません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n手配ＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0018',
	'W',
	'再検査済のため、検査予定情報の取消は行えません。\n検査予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0019',
	'W',
	'検査予定の検査種類区分にロット検査が指定されていないため、検査予定を取り消すことはできません。\n検査予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0020',
	'W',
	'検査予定の検査予定状況区分に未指図が指定されていないため、検査予定を取り消すことはできません。\n検査予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0021',
	'W',
	'検査実施単位が実績単位の場合、検査予定をまとめることはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0022',
	'W',
	'まとめ不可能な検査予定が指定されています。\n検査予定の内容を確認してください。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0023',
	'W',
	'既に検査実績が登録されているため、検査指図の更新・取消は行えません。\n検査ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0024',
	'W',
	'既に検査規格の実績が登録されているため、検査指図の更新・取消は行えません。\n検査ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0025',
	'W',
	'既に検査規格の実績が登録されているため、検査指図承認の取消は行えません。\n検査ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0026',
	'W',
	'検査中の先行検査が存在するので登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0027',
	'W',
	'良品区分に工程不良品を設定することはできません。\n検査ＮＯ：{1}\n検査実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0028',
	'W',
	'指定した先行検査が存在しません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0029',
	'W',
	'検査予定状況区分が未指図以外のため、取り消しできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0030',
	'W',
	'有効な出来高指図が存在するため、ロットを削除することはできません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0031',
	'W',
	'有効な入荷予定が存在するため、ロットを削除することはできません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0032',
	'W',
	'有効な入庫実績が存在するため、ロットを削除することはできません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0033',
	'W',
	'ロットＮＯが重複しています。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0034',
	'W',
	'サブロットＮＯが重複しています。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0035',
	'W',
	'対象のロットは存在しません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0036',
	'W',
	'工場出荷承認にて承認済とされていないロットが選択されています。\n工場出荷承認状況区分：{1}\n品目：{2}\nロットＮＯ：{3}\nサブロットＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0037',
	'W',
	'検査が完了しているため処理を行えませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0038',
	'W',
	'市場出荷判定対象の品目は、購買納期調整登録で事前にロットを作成してください。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0039',
	'W',
	'有効な品目検査規格マスタが設定されていないため、規格検査情報が取得できません。\n品目：{1}\n検査パタン：{2}\nマスタ適用日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0040',
	'W',
	'検査指図済のため、削除できませんでした。\n出来高予定ＮＯ：{1}\n出来高実績ＮＯ：{2}\n{3}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0041',
	'W',
	'既に全数検査指図済のため、出来高の単位、数量を変更することはできません。\n製造指図ＮＯ：{1}\n品目製造指図ＮＯ：{2}\n出来高予定ＮＯ：{3}\n出来高実績ＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0042',
	'W',
	'既に検査指図済のため、良品以外に更新することはできません。\n製造指図ＮＯ：{1}\n品目製造指図ＮＯ：{2}\n出来高予定ＮＯ：{3}\n出来高実績ＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0043',
	'W',
	'既に検査指図済のため、品目ＣＤ、ロットＮＯ、サブロットＮＯを変更することはできません。\n製造指図ＮＯ：{1}\n品目製造指図ＮＯ：{2}\n出来高予定ＮＯ：{3}\n出来高実績ＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0044',
	'W',
	'既に検査指図済のため、品目ＣＤ、ロットＮＯを変更することはできません。\n製造指図ＮＯ：{1}\n品目製造指図ＮＯ：{2}\n出来高予定ＮＯ：{3}\n出来高実績ＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0045',
	'W',
	'既に検査実績が登録されているため、出来高の格付を変更することはできません。\n製造指図ＮＯ：{1}\n品目製造指図ＮＯ：{2}\n出来高予定ＮＯ：{3}\n出来高実績ＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0046',
	'W',
	'既に検査実績が登録されているため、出来高の単位を変更することはできません。\n製造指図ＮＯ：{1}\n品目製造指図ＮＯ：{2}\n出来高予定ＮＯ：{3}\n出来高実績ＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0047',
	'W',
	'既に検査指図済のため、入荷実績の更新は行えません。\n入荷実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0048',
	'W',
	'工場出荷承認済または工場出荷却下済のため、処理できませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0049',
	'W',
	'既に検査指図されているため、製造指図承認の取消はできません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0050',
	'W',
	'既に工場出荷承認されているため、製造記録承認の取消はできません。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0051',
	'W',
	'既に検査完了しているため、処理できませんでした。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0052',
	'W',
	'検査状況区分が検査予定または未指図の場合に、実績登録することはできません。\n検査ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0053',
	'W',
	'検査承認状況区分が指図未承認の場合に、実績登録することはできません。\n検査ＮＯ：{1}\n検査実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0054',
	'W',
	'検査状況区分が完了でない場合に、判定することはできません。\n検査ＮＯ：{1}\n検査実績ＮＯ：{2}\n検査状況区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0055',
	'W',
	'検査承認状況区分が未判定でない場合に、判定することはできません。\n検査ＮＯ：{1}\n検査実績ＮＯ：{2}\n検査承認状況区分：{3}\n{4}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0056',
	'W',
	'工場出荷承認済または工場出荷却下済のため、処理できませんでした。\n検査ＮＯ：{1}\n検査実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0057',
	'W',
	'既に再検査の情報が指図されているため、実績更新は行えません。\n検査ＮＯ：{1}\n検査実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0058',
	'W',
	'検査指図が承認されていないため、実績登録は行えません。\n検査ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0059',
	'W',
	'規格検査結果区分が設定されていないため、確認できません。\n規格検査実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0060',
	'W',
	'検査が完了し、規格検査必須がオンの場合は、取り消しできません。\n検査ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0061',
	'W',
	'確認済の規格検査実績情報があるため、取消できません。\n検査ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0062',
	'W',
	'下記の検査ＮＯが重複しているため、処理できません。\n検査ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0063',
	'W',
	'規格検査実績の検査ＮＯがヘッダ中に存在していないため、更新できません。\n検査ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0064',
	'W',
	'規格検査実績の規格検査指図ＮＯが重複しているため、更新できません。\n規格検査指図ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0065',
	'W',
	'規格検査実績の規格検査指図ＮＯが存在していないため、更新できません。\n規格検査指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0066',
	'W',
	'{1}に整数部有効桁数を超えた数値が指定されています。\n数値：{2}\n整数部有効桁数：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0067',
	'W',
	'条件に該当するロットが存在しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0068',
	'W',
	'条件に該当する品目製造指図または出来高実績が存在しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0069',
	'W',
	'処理対象の品目はロット継承の対象ではありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0070',
	'W',
	'良品区分、格付、検査終了日時のいずれかを指定する場合、左記の項目は全て必須項目です。\n検査ＮＯ：{1}\n検査実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0071',
	'W',
	'検査実績明細の荷姿単位数量は必須項目です。\n検査ＮＯ：{1}\n検査実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0072',
	'W',
	'検査実績明細の良品区分は必須項目です。\n検査ＮＯ：{1}\n検査実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0073',
	'W',
	'検査実績明細の格付は必須項目です。\n検査ＮＯ：{1}\n検査実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0074',
	'W',
	'検査抜取実績の抜取数量は必須項目です。\n検査ＮＯ：{1}\n検査実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0075',
	'I',
	'製造所からの出荷承認結果、品質管理結果、製造管理結果を自動取得します。\nよろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0076',
	'I',
	'自動取得を行いました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0077',
	'W',
	'検査実績明細の検査ＮＯがヘッダ中に存在していないため、更新できません。\n検査ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0078',
	'W',
	'検査抜取実績の検査ＮＯがヘッダ中に存在していないため、更新できません。\n検査ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0079',
	'W',
	'同一ロットの行が複数行選択されています。いずれか一行のみを選択して下さい。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n手配ＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0080',
	'W',
	'検査方法区分に抜取規格検査が指定されている場合は、規格検査項目を１件以上指定しないと登録できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0081',
	'W',
	'該当データが既にロット管理情報に存在します。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0082' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0082',
	'W',
	'ロット管理しない品目のロット管理情報は作成できません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0083',
	'W',
	'工場出荷承認にて却下されているロットが選択されています。\n工場出荷承認状況区分：{1}\n品目：{2}\nロットＮＯ：{3}\nサブロットＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0084' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0084',
	'W',
	'市場出荷判定にて出荷禁止と判定されているロットが選択されています。\n市場出荷判定状況区分：{1}\n品目：{2}\nロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0085',
	'W',
	'工場出荷承認対象であるため格納場所に販売場所を指定することはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0086',
	'I',
	'検査指図の承認依頼が登録されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0087',
	'I',
	'検査指図の承認依頼が取り消されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0088',
	'I',
	'検査指図が承認されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0089' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0089',
	'I',
	'検査指図の承認が取り消されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0090' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0090',
	'I',
	'検査実績の判定依頼が登録されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0091' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0091',
	'I',
	'検査実績の判定依頼が取り消されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0092' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0092',
	'I',
	'検査実績が判定されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0093' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0093',
	'I',
	'検査実績の判定が取り消されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0094' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0094',
	'I',
	'工場出荷の承認依頼が登録されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0095' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0095',
	'I',
	'工場出荷が承認されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0096',
	'I',
	'工場出荷の承認が取り消されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0097',
	'I',
	'市場出荷の判定依頼が登録されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0098',
	'I',
	'市場出荷が判定されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0099',
	'I',
	'市場出荷の判定が取り消されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0100',
	'I',
	'市場出荷の判定依頼が取り消されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0101',
	'I',
	'工場出荷の承認依頼が取り消されました。\n件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0102',
	'W',
	'製造検査または受入検査の場合、検査指図時に抜取検査または抜取規格検査から全数検査へ変更できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0103',
	'W',
	'製造検査または受入検査の場合、検査指図時に全数検査から抜取検査または抜取規格検査へ変更できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0104',
	'W',
	'対象のロットは存在しません。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0105',
	'W',
	'対象のサブロットは存在しません。\n品目：{1}\nロットＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0106',
	'W',
	'先行検査の場合、抜取規格検査以外の検査方法区分を指定することはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0107',
	'W',
	'期限再検査の場合、検査方法区分に全数検査を指定することはできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0108',
	'W',
	'検査種類区分が先行検査ではないため、取り消しできません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0109',
	'W',
	'未判定の規格検査実績が存在するため検査を完了することはできません。\n検査ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0110',
	'W',
	'未確認の規格検査実績が存在するため検査を完了することはできません。\n検査ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0111',
	'W',
	'品目品管マスタが登録されていないため、登録できません。\n品目：{1}\n製造場所ＣＤ：{2}\n発注先ＣＤ：{3}\nメーカＣＤ：{4}\nマスタ適用日：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0112',
	'W',
	'品目品管マスタが登録されていないため、有効期限、使用期限が計算できません。\n検査ＮＯ：{1}\n品目：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0113',
	'W',
	'着手時には全数引き落としできません。完了時に引き落としてください。\n検査ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0114',
	'W',
	'完了時に全数引き落とされた場合、着手中に戻すことはできません。引落数を変更するか、抜取明細を行削除してください。\n検査ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0115',
	'W',
	'再検査対象の在庫が存在しないため、再検査できません。\n検査ＮＯ：{1}\n検査実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0116',
	'I',
	'既に仕入実績が登録されているため引落の受払実績が更新されませんでした。\n引落の受払実績を更新するためには、仕入実績登録画面で仕入実績を更新してください\n検査ＮＯ：{1}\n仕入実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0117',
	'W',
	'ロット情報と異なる版ＮＯは指定できません。\n品目：{1}\n指定した版ＮＯ：{2}\nロット情報の版ＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0118',
	'W',
	'工場出荷承認役割を取得できません。品目マスタ（工場・物流倉庫）を確認してください。\n品目：{1}\n工場・物流倉庫：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0119',
	'W',
	'仕入実績が登録されているため処理できません。先に仕入実績を取り消してください。\n検査ＮＯ：{1}\n仕入実績ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0120',
	'W',
	'検査指図済のため、削除できませんでした。\n入荷実績ＮＯ：{1}\n{2}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0121',
	'W',
	'結合可能な文字数を超えたため、処理を中断しました。投入品のロット情報を訂正してください。\n結合文字列：{1}\n結合文字数：{2}\n最大文字数：{3}\n継承項目：{4}\n親品目：{5}\n親ロットＮＯ：{6}\n親サブロットＮＯ：{7}\n品目製造指図ＮＯ：{8}\n{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0122',
	'I',
	'結合可能な文字数を超えたため、最大文字数で切り捨てました。投入品のロット情報を訂正してください。\n結合文字列：{1}\n結合文字数：{2}\n最大文字数：{3}\n継承項目：{4}\n親品目：{5}\n親ロットＮＯ：{6}\n親サブロットＮＯ：{7}\n品目製造指図ＮＯ：{8}\n{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0123',
	'I',
	'結合可能な文字数を超えたため、最大文字数で切り捨てました。\n結合文字列：{1}\n結合文字数：{2}\n最大文字数：{3}\n継承項目：{4}\n親品目：{5}\n親ロットＮＯ：{6}\n親サブロットＮＯ：{7}\n品目製造指図ＮＯ：{8}\n{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0124',
	'W',
	'条件に該当するロットが存在しません。\n親品目：{1}\n親ロットＮＯ：{2}\n親サブロットＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0125',
	'W',
	'条件に該当する品目製造指図または出来高実績が存在しません。\n親品目：{1}\n親ロットＮＯ：{2}\n親サブロットＮＯ：{3}\nワーキンググループＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0126',
	'W',
	'処理対象の品目製造指図が存在しません。\n品目製造指図ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0127',
	'W',
	'処理対象の品目はロット継承の対象ではありません。\n親品目：{1}\n構成パタン：{2}\nワーキンググループＣＤ：{3}\n品目製造指図ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0128' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0128',
	'W',
	'検査実績時に指定した良品区分が良品以外の場合、判定結果に合格または特採を指定することはできません。\n検査ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0129' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0129',
	'W',
	'検査実績時に良品の行が１行も登録されていないため、判定結果に合格または特採を指定することはできません。\n検査ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0130' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0130',
	'W',
	'対象のロットは存在しません。\n品目：{1}\nロットＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0131',
	'W',
	'新規登録時に仕入実績を登録した際に複数の検査実績がまとめられたため、一部の検査実績のみの日付を変更することができません。\n検査実績一覧登録で同時に登録した検査実績の日付をすべて同じ日付にするか、検査実績を取り消して再登録してください。\n検査実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0132',
	'W',
	'新規登録時に仕入実績を登録した際に複数の検査実績明細がまとめられたため、一部の検査実績のみの計上日を変更することができません。\n検査実績一覧登録で同時に登録した検査実績明細の計上日をすべて同じ日付にするか、検査実績を取り消して再登録してください。\n検査実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0133',
	'W',
	'有効な出来高指図が存在するため、ロットを変更することはできません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0134' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0134',
	'W',
	'有効な入荷予定が存在するため、ロットを変更することはできません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0135' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0135',
	'W',
	'有効な入庫実績が存在するため、ロットを変更することはできません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0136' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0136',
	'W',
	'製造検査または受入検査、かつ、以下のいずれかの場合は、検査指図時に抜取検査または抜取規格検査から全数検査へ変更できません。\n・検査指図タイミング区分：出来高実績前可\n・検査中ロット使用許可：オン\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0137' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0137',
	'W',
	'該当のロット、サブロットに対する期限再検査が存在します。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n手配ＮＯ：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0138' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0138',
	'I',
	'継承元ロットの継承項目に値が設定されていない状態で、ロットが継承されました。\n継承項目：{1}\n継承元品目：{2}\n継承元ロットNO：{3}\n継承元サブロットNO：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0139' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0139',
	'W',
	'まとめ対象となる同一ロットの検査予定が存在します。\n検査指図一覧登録画面で再検索し、まとめて検査指図してください。\n検査予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0140' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0140',
	'W',
	'品目検査パタンマスタ、または品目品管マスタが取得できない、もしくは検査対象外となっています。\n製造指図ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0141' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0141',
	'W',
	'有効な品目製造指図が存在するため、ロットを削除することはできません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0142' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0142',
	'W',
	'有効な品目製造指図が存在するため、ロットを変更することはできません。\n品目：{1}\nロットＮＯ：{2}\nサブロットＮＯ：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0143' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0143',
	'W',
	'品目単位マスタが存在しません。\n品目：{1}\n単位：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0200' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0200',
	'W',
	'ＩＦ送信済のため更新できません。\n検査ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0201' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0201',
	'W',
	'入力された期限がロットに設定されている期限と異なります。\n使用期限：{1}\nロット管理情報の有効期限：{2}\nロット管理情報の使用期限：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBFL0202' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBFL0202',
	'W',
	'同じロットが設定されているレコードに、異なる期限または期限起算日が設定されています。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0001',
	'I',
	'請求明細選択画面で選択した情報がクリアされますがよろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0002',
	'I',
	'選択した明細がありません。\nこのまま確定すると明細の無い請求書が発行されますがよろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0003',
	'I',
	'請求明細の選択を確定しますか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0004',
	'W',
	'既に入金処理済です。更新できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0005',
	'W',
	'請求先の売上仮単価締がオフの場合、仮単価の明細を選択できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0006',
	'W',
	'一部請求金額には、元の金額以下の値を指定してください。\n元の金額：{1}\n指定した金額：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0007',
	'W',
	'一部請求税額には、元の税額以下の値を指定してください。\n元の税額：{1}\n指定した税額：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0008',
	'I',
	'明細の消込を確定しますか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0009',
	'I',
	'消込対象の明細がありません。\nこのまま確定してよろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0010',
	'I',
	'振替元と振替先に同一の請求部門、売掛先、債権部門、案件が指定されていますが、よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0011',
	'W',
	'取引と入金情報の組み合わせが不正です。\n前受金入金に対応した取引では、入金登録で登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0012',
	'W',
	'取引と入金情報の組み合わせが不正です。\n仮受金入金に対応した取引では、入金登録で登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0013',
	'W',
	'取引と入金情報の組み合わせが不正です。\n仮受金前受金相殺に対応した取引では、仮受金として登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0014',
	'W',
	'取引と入金情報の組み合わせが不正です。\n仮受金その他勘定相殺に対応した取引では、仮受金として登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0015',
	'W',
	'取引と入金情報の組み合わせが不正です。\n前受金その他勘定相殺に対応した取引では、前受金として登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0016',
	'W',
	'取引と入金情報の組み合わせが不正です。\n売上代金入金に対応した取引では、入金情報登録で登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0017',
	'W',
	'取引と入金情報の組み合わせが不正です。\n前受金相殺に対応した取引では、前受金として登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0018',
	'W',
	'取引と入金情報の組み合わせが不正です。\n仮受金売掛金相殺に対応した取引では、仮受金として登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0019',
	'W',
	'取引と入金情報の組み合わせが不正です。\nその他勘定売掛金相殺に対応した取引では、買掛金相殺として登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0020',
	'W',
	'入金を参照している場合は入金額の合計を0にできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0021',
	'W',
	'入金を参照している場合は相殺額の合計を0にできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0022',
	'W',
	'{1}と消込対象の合計金額の符号が異なるので自動消込できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0023',
	'I',
	'既に請求書を発行済ですが、入金予定調整登録を行います。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0024',
	'W',
	'一部請求税込金額には、元の税込金額以下の値を指定してください。\n元の税込金額：{1}\n指定した税込金額：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0025',
	'W',
	'0以上で元の金額未満の値を設定してください。\n項目：{1}\n元の値：{2}\n指定された値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0026',
	'W',
	'元の金額より大きく、0以下の値を設定してください。\n項目：{1}\n元の値：{2}\n指定された値：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0027',
	'W',
	'一部請求金額および一部請求税額のいずれか１つ以上に、元の値と異なる値を入力してください。\n元の金額：{1}\n元の税額：{2}\n指定された金額：{3}\n指定された税額：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGP0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGP0028',
	'W',
	'請求書出力対象の明細と請求対象の明細で、金額の合計および税額の合計が一致するように入力してください。\n明細実績ＮＯ：{1}\n請求書出力対象の金額合計：{2}\n請求書出力対象の税額合計：{3}\n請求対象の金額合計：{4}\n請求対象の税額合計：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0001',
	'W',
	'分割前の入金予定額と分割後の入金予定額が一致しません。\n分割前入金予定額：{1}\n分割後入金予定額：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0002',
	'W',
	'同一の入金予定日、入金方法の入金予定が既に存在しているため登録できません。\n入金予定日：{1}\n入金方法：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0003',
	'W',
	'指定した入金情報は、当画面で処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0004',
	'W',
	'分割先の入金情報は、当画面で処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0005',
	'W',
	'同じ請求先、請求部門を指定して入金分割はできません。\n請求先ＣＤ：{1}\n請求部門ＣＤ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0006',
	'W',
	'入金方法は、決済方法マスタで入金登録区分が「１：登録不可」「２：登録可能」の債権決済方法を指定してください。\n入金方法：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0007',
	'W',
	'既に分割処理済のため、訂正や取消はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0008',
	'W',
	'消込額が消込対象額を超えています。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0009',
	'W',
	'消込額が不正です。消込対象額を超えて消し込みを行っていないか確認してください。\n消込額：{1}\n未消込額：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0010',
	'W',
	'請求先に対する請求部門を指定してください。\n請求先ＣＤ：{1}\n請求部門ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0011',
	'W',
	'入金方法は、決済方法マスタで債権決済区分が「現金」「振込」「手形」の債権決済方法を指定してください。\n入金方法：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0012',
	'W',
	'入金方法が現金・手形の場合は口座、振込人名を指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0013',
	'W',
	'入金方法が振込の場合は口座を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0014',
	'W',
	'自動入金消込対象がオフの場合は、振込手数料、自動消込基準日は指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0015',
	'W',
	'自動入金消込対象がオンの場合は、自動消込基準日を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0016',
	'W',
	'入金方法が手形以外の場合は、手形項目（手形番号、手形区分、振出日、支払期日、振出人名、裏書人、引受人、手形理由ＣＤ、振出銀行、振出支店、予備１、予備２、予備３）は指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0017',
	'W',
	'振込手数料は、変更前の振込手数料以内で指定してください。\n変更前振込手数料：{1}\n変更後振込手数料：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0018',
	'W',
	'入金方法が手形で入金区分が「為替手形」の場合は、引受人を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0019',
	'W',
	'入金予定制御マスタが取得できませんでした。入金予定制御マスタを設定してください。\n請求先ＣＤ：{1}\nワーキンググループＣＤ：{2}\n取引通貨ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0020',
	'W',
	'入金タブの未処理残高が0の場合、振込手数料の全額を分割先の入金に引き継いでください。\n振込手数料残高：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0021',
	'W',
	'請求締日{1}に対応する入金予定日{1}、入金サイト{1}が取得できません。\n入金予定制御マスタの設定を確認してください。\n請求先ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0022',
	'W',
	'訂正対象のインボイスに対して既に売掛消込されています。\n訂正するためには売掛消込を先に取り消してください。\nインボイスＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0023',
	'W',
	'分割する入金額は、入金処理額以上の金額を指定してください。\n分割先入金ＮＯ：{1}\n入金額：{2}\n入金処理額：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0024',
	'W',
	'削除対象の分割先入金情報は入金処理済のため削除できません。\n分割先入金ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0025',
	'I',
	'与信限度額マスタが登録されていないため、与信限度額管理の対象外とします。\n与信管理先ＣＤ：{1}\n通貨ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0026',
	'I',
	'アラーム使用率を超過しました。\n与信管理先ＣＤ：{1}\n通貨ＣＤ：{2}\n与信使用額：{3}\n与信限度額：{4}\nアラーム使用率：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0027',
	'W',
	'源泉税に対応する相殺方法が指定されていないため処理できません。\n源泉税を消し込む場合は源泉税に対応する相殺方法を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0028',
	'W',
	'債権決済区分「7：振替」に対応する決済方法マスタが登録されていないため処理できません。\n決済方法マスタを登録してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0029',
	'W',
	'会社マスタの売上税または仕入税と同じ税率で内税がオンの税ＣＤが税マスタに存在しないため処理できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0030',
	'W',
	'請求部門を指定する場合は請求先を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0031',
	'W',
	'与信限度額を超過したため、登録しませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0032',
	'W',
	'請求先、請求部門が指定されている入金情報は、当画面で処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0033',
	'W',
	'入金先が指定されていない入金情報は、当画面で処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0034',
	'W',
	'税マスタに登録されていません。\n税ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0035',
	'W',
	'消込額対象額の合計が0でないため処理をスキップします。\n債権部門ＣＤ：{1}\n売掛先ＣＤ：{2}\nインボイスＮＯ：{3}\n取引通貨ＣＤ：{4}\n案件ＮＯ：{5}\n債権区分：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0036',
	'W',
	'仮単価の請求明細が存在するため、請求書を発行できません。\n売上明細訂正登録で仮単価の情報を確認・変更してください。\n請求書ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0037',
	'W',
	'源泉税額を含む請求明細を請求残高振替する場合、源泉税額をすべて売掛明細消込してから振り替えてください。\n未消込源泉税額：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0038',
	'W',
	'相殺額が不正です。源泉税を消し込む場合、未消込額以内の金額を指定してください。\n相殺額：{1}\n未消込額：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0039',
	'W',
	'請求先の請求書発行区分が「4.発行対象外」のため、請求書を発行できません。\n請求書ＮＯ：{1}\n請求先ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0040',
	'W',
	'指定された計上日で振替元の債権部門が無効です。\n仕訳対象外の取引を選択するか、計上日を見直してください。\n振替元の債権部門ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0041',
	'W',
	'入金実績ヘッダ情報の印刷データが存在しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0042',
	'W',
	'入金実績明細情報の印刷データが存在しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0043',
	'W',
	'入金情報の印刷データが存在しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0044',
	'I',
	'与信限度額を超過しました。\n与信管理先ＣＤ：{1}\n通貨ＣＤ：{2}\n与信使用額：{3}\n与信限度額：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0045',
	'W',
	'この取引を本画面で処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0046',
	'W',
	'更新対象の明細が消込処理されています。\n消込処理された明細の請求繰越回数は更新できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0047',
	'W',
	'決済方法マスタの売上仕入税区分が登録されていないため、処理できません。\n債権決済区分が「4.相殺（借方）」の決済方法に売上仕入税区分を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0048',
	'W',
	'入金情報に振込手数料が指定されていますが、振込手数料は消込されませんでした。\n入金ＮＯ：{1}\n入金額：{2}\n振込手数料：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0049',
	'W',
	'処理対象の入金実績情報が取得できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0050',
	'W',
	'指定した入金実績は既に取消済です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0051',
	'W',
	'指定した入金に対して既に消込処理がされているため、変更・取消はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0055',
	'W',
	'指定した入金情報は取り消されています。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0056',
	'W',
	'取引と入金情報の組み合わせが不正です。\n売上代金入金に対応した取引では、入金登録で登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0057',
	'W',
	'取引と入金情報の組み合わせが不正です。\n前受金入金に対応した取引では、入金登録で登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0058',
	'W',
	'取引と入金情報の組み合わせが不正です。\n仮受金入金に対応した取引では、入金登録で登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0059',
	'W',
	'取引と入金情報の組み合わせが不正です。\n前受金相殺に対応した取引では、前受金として登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0060',
	'W',
	'取引と入金情報の組み合わせが不正です。\n仮受金売掛金相殺に対応した取引では、仮受金として登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0061',
	'W',
	'取引と入金情報の組み合わせが不正です。\n仮受金その他勘定相殺に対応した取引では、仮受金として登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0062',
	'W',
	'取引と入金情報の組み合わせが不正です。\n前受金その他勘定相殺に対応した取引では、前受金として登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0063',
	'W',
	'取引と入金情報の組み合わせが不正です。\n仮受金前受金相殺に対応した取引では、仮受金として登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0064',
	'W',
	'取引と入金情報の組み合わせが不正です。\nその他勘定売掛金相殺に対応した取引では、買掛金相殺として登録された入金情報以外を処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0065',
	'W',
	'取引と入金情報の組み合わせが不正です。\n入金情報を処理できない取引です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0066',
	'W',
	'入金区分が手形の場合には手形ＮＯが必須です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0067',
	'W',
	'該当する帳票のフォーマットが存在しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0068',
	'W',
	'売上都度請求先には振替できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0069',
	'W',
	'振替元の請求明細が更新されています。\n再検索してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0070',
	'W',
	'振替対象の明細が消込処理されています。\n消込処理された明細を振替えることはできません。\n取引ＣＤ：{1}\n実績ＮＯ：{2}\n改訂番号：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0071',
	'W',
	'指定した入金方法は決済方法マスタに登録されていません。\n入金登録区分：{1}\n入金先ＣＤ：{2}\n債権決済区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0072',
	'W',
	'債権決済区分「6：源泉税」に対応する決済方法マスタが登録されていないため処理できません。\n決済方法マスタを登録してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0073',
	'W',
	'入金予定情報を作成できません。\n入金予定制御マスタの設定を確認してください。\n請求先ＣＤ：{1}\n請求部門ＣＤ：{2}\n通貨ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0074',
	'W',
	'指定した請求年月・締日での締処理は行えません。\n請求先ＣＤ：{1}\n請求部門ＣＤ：{2}\n取引通貨ＣＤ：{3}\nインボイスＮＯ：{4}\n案件ＮＯ：{5}\n請求締年月日：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0075',
	'W',
	'仮単価の請求明細が存在するため、請求締処理ができません。\n売上明細訂正登録で仮単価の情報を確認・変更してください。\n請求先ＣＤ：{1}\n請求部門ＣＤ：{2}\n取引通貨ＣＤ：{3}\nインボイスＮＯ：{4}\n案件ＮＯ：{5}\n請求締年月日：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0076',
	'I',
	'請求締処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0077',
	'I',
	'請求締処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0078',
	'W',
	'指定した請求は締解除できません。請求締年月日が最新の請求から締解除してください。\n請求先ＣＤ：{1}\n請求締年月日：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0079',
	'W',
	'請求先が無効です。締解除できません。\n請求先ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0080',
	'W',
	'マニュアル選択請求の請求先で、請求対象の明細を選択していません。\n請求先：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0081' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0081',
	'W',
	'取引パタン区分に対応した取引が取得できません。\n取引マスタを確認してください。\n取引パタン区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0082' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0082',
	'W',
	'指定した入金実績は取り消されているため、処理できません。\n入金実績ＮＯ：{1}\n改訂番号：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0083',
	'W',
	'複数の入金実績に対しての消込処理はできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0084' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0084',
	'W',
	'対象年月が指定されていないため、処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0085',
	'W',
	'指定した取引は、無効あるいは取消状態です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0086',
	'W',
	'指定した取引は、当画面で処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0087',
	'W',
	'指定した入金実績の取引は、当画面で処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0088',
	'W',
	'指定した入金情報と取引パタン区分の組み合わせが不正です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0090' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0090',
	'W',
	'指定した入金情報の手形の振出日が翌日以降となっているため処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0091' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0091',
	'W',
	'指定した入金情報は、未処理残高が0であるため処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0092' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0092',
	'W',
	'入金を参照している場合は入金額の合計を0にできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0093' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0093',
	'W',
	'入金を参照している場合は相殺額の合計を0にできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0094' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0094',
	'W',
	'消込対象の明細がありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0095' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0095',
	'W',
	'売掛明細消込金額合計と、売掛消込額が一致しません。\n売掛明細消込金額合計：{1}\n売掛消込額：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0096',
	'W',
	'未処理残高をマイナスにはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0097',
	'W',
	'未処理残高を相殺額よりも大きくできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0098',
	'W',
	'相殺額の合計をマイナスにはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0099',
	'W',
	'未処理残高をプラスにはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0100',
	'W',
	'相殺額を未処理残高よりも大きくできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0101',
	'W',
	'相殺額の合計をプラスにはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0102',
	'W',
	'未処理残高を残すことはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0103',
	'W',
	'未処理残高を入金額よりも大きくできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0104',
	'W',
	'入金額の合計をマイナスにはできません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0105',
	'W',
	'入金自動消込処理でエラーが発生したため、次の入金先は処理できませんでした。\n入金先ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0106',
	'I',
	'入金自動消込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0107',
	'I',
	'入金自動消込処理が終了しました。\n処理対象件数：{1}\n金額一致で完了した件数：{2}\n手数料込で完了した件数：{3}\n過入金で完了した件数：{4}\n入金額不足で完了した件数：{5}\n自動消込不可件数：{6}\nエラー件数：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0108',
	'W',
	'案件処理区分が未選択の場合は振替元に複数の案件を選択できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0109',
	'W',
	'振替元の計上年月と異なる計上年月には振替できません。\n振替元計上年月：{1}\n振替先計上年月：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0110',
	'I',
	'受取手形決済処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0111',
	'I',
	'受取手形決済処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0112',
	'W',
	'指定した入金実績の明細を取得できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0113',
	'W',
	'請求締が解除されています。再検索してください。\n請求書ＮＯ ： {1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0114',
	'I',
	'前回請求額が無く請求明細の出力対象も無いため印刷しませんでした。\n請求書ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0115',
	'I',
	'与信額補正処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0116',
	'I',
	'与信額補正処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0117',
	'W',
	'指定した入金方法は決済方法マスタに登録されていません、もしくは債権決済区分が手形として登録されています。\n入金登録区分：{1}\n入金先ＣＤ：{2}\n債権決済区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0118',
	'W',
	'自動売掛明細消込処理にて、売掛明細の消込を全額行うことができませんでした。\n消込残額は売掛明細消込登録画面でマニュアルで消込してください。\n入金実績明細ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0119',
	'W',
	'請求書発行区分が「3：入金予定調整後」の請求先は、入金予定を調整するまで請求書を発行できません。\n請求書ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0120',
	'W',
	'指定された計上日で引継元の部門が無効です。\n仕訳対象外の相殺方法を選択するか、計上日を見直してください。\n引継元の入金実績ＮＯ：{1}\n引継元の部門ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0121',
	'W',
	'指定された計上日で引継元の部門が無効です。\n引継元の入金実績の部門を振り替えてから登録するか、計上日を見直してください。\n引継元の入金実績ＮＯ：{1}\n引継元の部門ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0122',
	'W',
	'指定された日付において有効な債権部門として登録されていません。\n債権部門：{1}\n日付：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0123',
	'W',
	'取引先マスタの請求締日２～５を設定している場合は、入金予定制御マスタを請求先ごとに設定してください。もしくは入金サイト、入金予定日の設定を確認してください。\n請求先ＣＤ：{1}\nワーキンググループＣＤ：{2}\n取引通貨ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0124',
	'W',
	'支払実績に対応する入金情報が処理済のため、更新、取消できません。\n入金ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0125',
	'W',
	'決済方法マスタで債権決済方法がオン、債権決済区分が「4：相殺（借方）」、債権債務先識別区分が「1：支払予定管理先」の決済方法を指定してください。\n決済方法ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0126',
	'W',
	'指定した請求に含まれる、一部請求に対応する繰越分の請求明細が未請求残高振替済みのため締解除できません。\n請求書ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0127',
	'W',
	'指定した請求に含まれる、一部請求に対応する繰越分の請求明細が売掛明細消込済みのため締解除できません。\n請求書ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0128' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0128',
	'W',
	'無効な品目が請求明細に存在するため、請求締処理ができません。\n請求先ＣＤ：{1}\n請求部門ＣＤ：{2}\n取引通貨ＣＤ：{3}\nインボイスＮＯ：{4}\n案件ＮＯ：{5}\n請求締年月日：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0129' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0129',
	'W',
	'無効な品目が請求明細に存在するため、締解除できません。\n請求書ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0130' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0130',
	'W',
	'取引先マスタに有効な売掛先として登録されていません。\n売掛先ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0131',
	'W',
	'取引先マスタに有効な請求先として登録されていません。\n請求先ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0132',
	'W',
	'選択された請求明細の組み合わせが不正です。\n以下の入金実績明細を元に売掛明細消込された請求明細を全て選択するか、売掛明細消込を取り消してから請求締処理を行ってください。\n請求先ＣＤ：{1}\n請求部門ＣＤ：{2}\n取引通貨ＣＤ：{3}\nインボイスＮＯ：{4}\n案件ＮＯ：{5}\n請求締年月日：{6}\n入金実績明細ＮＯ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0133',
	'W',
	'請求部門が不正です。以下を確認してください。\n・指定した部門、適用日に対応する部門マスタが設定されていること\n・部門マスタの債権部門がオンになっていること\n・取引先マスタで請求先に対する請求先部門として指定されていること\n適用日：{1}\n請求先ＣＤ：{2}\n請求部門ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0300' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0300',
	'W',
	'基準通貨を取引通貨として設定する場合は、1以外の数値を為替レートに指定できません。\n為替レート：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0301' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0301',
	'W',
	'決済方法マスタで「現金」「振込」「手形」以外の債権決済区分が指定された入金方法は使用できません。\n入金方法：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0302' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0302',
	'W',
	'債権決済区分が「現金」「手形」の場合は口座、振込人名を指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0303' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0303',
	'W',
	'債権決済区分が「振込」の場合は口座を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0304' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0304',
	'W',
	'債権決済区分が「手形」以外の場合は、手形項目（手形番号、手形区分、振出日、支払期日、振出人名、裏書人、引受人、手形理由ＣＤ、振出銀行、振出支店、予備１、予備２、予備３）は指定できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0305' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0305',
	'W',
	'債権決済区分が「手形」で手形区分が「為替手形」の場合は、引受人を指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0501' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0501',
	'W',
	'前受金しか存在しないため、請求締処理ができません。\n請求締処理に前受金を含める場合は、売上または入金の請求明細を含めて実行してください。\n請求先ＣＤ：{1}\n請求部門ＣＤ：{2}\n取引通貨ＣＤ：{3}\nインボイスＮＯ：{4}\n案件ＮＯ：{5}\n請求締年月日：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0601' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0601',
	'W',
	'指定されたＩＦ処理区分は実行対象外です。\nＩＦ処理区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0602' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0602',
	'I',
	'処理を開始します。（請求ＩＦ送信サービス実行）');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0603' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0603',
	'I',
	'送信処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0604' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0604',
	'I',
	'処理を終了しました。（請求ＩＦ送信サービス実行）');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBGL0605' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBGL0605',
	'W',
	'保存先のパスを取得できませんでした。帳票保存先マスタにて、「取引先が未指定」のレコードを登録してください。\n業務区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHP0001',
	'I',
	'支払予定明細を設定します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHP0002',
	'I',
	'税差額を取得します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHP0003',
	'I',
	'相殺先に買掛先と異なる値が入力されています。よろしいですか？\n相殺先：{1}\n買掛先：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHP0004',
	'I',
	'相殺対象残高がマイナスとなっています。よろしいですか？\n相殺対象残高：{1}\n債務相殺先区分：{2}\n相殺先：{3}\n相殺部門：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHP0005',
	'I',
	'今回有償支給額を取得します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHP0006',
	'I',
	'手形サイトが手形サイト上限を超えています。よろしいですか？\n支払先：{1}\n振出日：{2}\n支払期日：{3}\n手形サイト：{4}\n手形サイト上限：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHP0007',
	'W',
	'すでに支払予定が登録されてるため、訂正できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHP0008',
	'W',
	'すでに支払予定が登録されてるため、取消できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHP0009',
	'W',
	'都度支払の場合、以下の項目の値が異なる買掛明細はまとめられません。\n　　支払予定管理先、通貨、案件ＮＯ、仕入実績ＮＯ、受領インボイス管理ＮＯ\n都度支払でない場合、以下の項目の値が異なる買掛明細はまとめられません。\n　　支払予定管理先、通貨、案件ＮＯ');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHP0010',
	'W',
	'振替元と振替先に同一の支払予定管理先担当部門、買掛先、債務部門、案件が指定されていますが、よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0151' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHP0151',
	'I',
	'支払実績を設定します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHP0152' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHP0152',
	'I',
	'前渡金実績を設定します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0001',
	'W',
	'支払予定管理先、基準日を元に支払予定管理先担当部門を取得できませんでした。\n支払予定管理先ＣＤ：{1}\n基準日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0002',
	'W',
	'支払予定管理先締年月日を計算できませんでした。\n支払予定管理先ＣＤ：{1}\n支払起算日：{2}\n支払繰越回数：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0003',
	'W',
	'最新の支払予定以外は登録・訂正・取消できません。\n登録・訂正・取消対象の支払予定の締年月日以降の締年月日で支払予定が登録されていないか確認してください。\n支払予定管理先ＣＤ：{1}\n支払予定管理先担当部門ＣＤ：{2}\n取引通貨ＣＤ：{3}\n案件ＮＯ：{4}\n締年月日：{5}\n支払照合ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0004',
	'W',
	'仮単価の買掛明細が含まれているため、登録できません。\n仕入実績明細ＮＯ：{1}\n買掛明細ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0005',
	'W',
	'最新の支払予定以外は登録・訂正・取消できません。\n登録・訂正・取消対象の支払予定の締年月日以降の締年月日で支払予定が登録されていないか確認してください。\n支払予定管理先ＣＤ：{1}\n支払予定管理先担当部門ＣＤ（訂正前）：{2}\n取引通貨ＣＤ：{3}\n案件ＮＯ：{4}\n締年月日（訂正前）：{5}\n支払照合ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0006',
	'W',
	'買掛明細の源泉税額合計と、債務決済区分が「源泉税」の支払予定額合計が一致しません。\n支払予定管理先ＣＤ：{1}\n買掛明細の合計金額：{2}\n支払予定の合計金額：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0007',
	'W',
	'支払予定登録時に支払実績を同時計上する場合は、支払予定日に運用日付以前の日付を指定してください。\n支払予定日と同じ日付が支払実績の計上日に設定されます。\n支払予定日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0008',
	'W',
	'税差額を再計算した結果が、指定された税差額と一致しませんでした。税差額取得ボタンを押下してから再度登録してください。\n支払予定管理先ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0009',
	'W',
	'同一のヘッダにまとめられる他の明細でエラーが発生しました。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0010',
	'W',
	'照合済の買掛明細が含まれているため、登録できません。\n支払予定管理先ＣＤ：{1}\n買掛明細ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0011',
	'W',
	'承認状況が一次承認済または最終承認済のため、取消できません。\n支払照合ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0012',
	'W',
	'同じ支払予定管理先において先に処理した支払予定でエラーが発生したため、登録できませんでした。\n支払予定管理先ＣＤ：{1}\n締日：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0013',
	'W',
	'支払状況区分が一部支払または支払済の支払予定が存在するため、取消できません。\n支払照合ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0014',
	'W',
	'繰越分の買掛明細が照合済みのため、取消できません。\n支払照合ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0015',
	'W',
	'金額と税額の合計が0になっています。\n買掛明細ＮＯ：{1}\n支払方式区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0016',
	'W',
	'買掛先、債務部門、債務区分ごとの買掛明細の金額と支払予定の金額が一致していないため、支払予定を登録できません。\n買掛先ＣＤ：{1}\n債務部門ＣＤ：{2}\n債務区分：{3}\n買掛明細の金額合計：{4}\n支払予定の金額合計：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0017',
	'W',
	'前渡金と相殺する場合、0より大きい金額を指定してください。\n前渡金支払実績ＮＯ：{1}\n金額：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0018',
	'W',
	'手数料行のみの登録はできません。\n支払予定管理先ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0019',
	'I',
	'支払予定登録処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0020',
	'I',
	'支払予定登録処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0021',
	'W',
	'支払予定管理先締年月日が設定されてない買掛明細情報を処理対象外としました。支払予定登録画面から登録してください。\n支払予定管理先：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0022',
	'W',
	'支払予定制御マスタが取得できませんでした。支払予定制御マスタを設定してください。\n支払予定管理先：{1}\nワーキンググループ：{2}\n取引通貨：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0023',
	'W',
	'都度支払の支払予定を自動で作成する処理で以下のエラーが発生したため、支払予定を登録しませんでした。マニュアルで支払予定を登録してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0024',
	'W',
	'会社マスタの仕入税と同じ税率で内税がオンの税ＣＤが税マスタに存在しないため処理できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0025',
	'W',
	'債務決済区分「7：源泉税」に対応する決済方法マスタが登録されていないため処理できません。\n決済方法マスタを登録してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0026',
	'W',
	'支払予定管理先に対応する取引先マスタが取得できませんでした。取引先マスタを設定してください。\n支払予定管理先：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0027',
	'W',
	'0より大きいかつ元の金額より小さい値を設定してください。\n元の金額：{1}\n入力した金額：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0028',
	'W',
	'0より小さいかつ元の金額より大きい値を設定してください。\n元の金額：{1}\n入力した金額：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0029',
	'W',
	'0以上かつ元の税金額より小さい値を設定してください。\n元の税金額：{1}\n入力した税金額：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0030',
	'W',
	'0以下かつ元の税金額より大きい値を設定してください。\n元の税金額：{1}\n入力した税金額：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0031',
	'W',
	'承認対象の支払予定は、承認されるまで支払予定表を発行できません。\n支払予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0032',
	'W',
	'承認対象の支払予定は、承認されるまで支払予定明細を発行できません。\n支払照合ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0033',
	'W',
	'支払予定日が取得できませんでした。支払予定制御マスタを設定してください。\n支払予定管理先ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0034',
	'W',
	'支払部門が取得できませんでした。取引先マスタに設定してください。\n支払先ＣＤ：{1}\n基準日：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0035',
	'W',
	'支払予定が承認されていないため、支払実績を登録できません。\n支払照合ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0036',
	'W',
	'手形サイトが手形サイト上限を超えているため登録できません。\n支払先：{1}\n振出日：{2}\n支払期日：{3}\n手形サイト：{4}\n手形サイト上限：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0037',
	'W',
	'支払予定に対応する支払実績を１件以上含める必要があります。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0038',
	'W',
	'支払実績の訂正で全行削除はできません。支払実績を取り消してください。\n支払実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0039',
	'W',
	'支払実績が登録されているため、為替差損益に影響する仕入実績は訂正できません。支払実績を取り消した後、訂正してください。\n仕入実績ＮＯ：{1}\n受領インボイス管理ＮＯ：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0040',
	'W',
	'既に支払予定が登録されてるため、前渡金実績を訂正できません。\n前渡金実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0041',
	'W',
	'既に支払予定が登録されてるため、前渡金実績を取消できません。\n前渡金実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0042',
	'W',
	'前渡金と相殺する場合は、相殺部門、債務部門に前渡金の負担部門と同じ部門を指定してください。\n相殺部門：{1}\n債務部門：{2}\n前渡金の負担部門：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0043',
	'W',
	'指定された前渡金実績が存在しないため、支払予定を登録できません。\n前渡金実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0044',
	'W',
	'買掛消込予定に対する支払金額の合計が支払予定額を超えているため、支払実績を登録できません。\n買掛消込予定ＮＯ：{1}\n買掛消込予定に対する支払金額合計：{2}\n支払予定額：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0045',
	'W',
	'前渡金相殺予定額が前渡金額を超えているため、支払予定を登録できません。\n前渡金相殺予定額：{1}\n前渡金額：{2}\n前渡金支払実績ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0046',
	'I',
	'支払実績計上処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0047',
	'I',
	'支払実績計上処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0048',
	'W',
	'支払予定時税差額の買掛明細しか設定されていないため、支払予定を登録できません。\n支払予定管理先ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0049',
	'W',
	'支払予定に指定されている買掛先、債務部門、債務区分が買掛明細に存在しないため、支払予定を登録できません。\n買掛先ＣＤ：{1}\n債務部門ＣＤ：{2}\n債務区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0050',
	'W',
	'既に支払締が行われているため、支払予定時税差額の買掛明細を登録できません。\n計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0051',
	'W',
	'相殺先に指定した値が取引先マスタに存在しません。\n相殺先ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0052',
	'W',
	'支払照合に対して次処理（支払実績の登録）が行われているため、承認対象となるような更新はできません。\n支払照合ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0053',
	'W',
	'先に処理した支払予定でエラーが発生したため、処理対象から除外しました。\n支払予定管理先ＣＤ：{1}\n支払予定管理先担当部門ＣＤ：{2}\n仕入実績ＮＯ：{3}\n受領インボイス管理ＮＯ：{4}\n受領インボイスＮＯ：{5}\n取引通貨ＣＤ：{6}\n案件ＮＯ：{7}\n締年月日：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0054',
	'W',
	'支払予定に設定されている買掛先、債務部門、債務区分に対応する買掛明細が存在しないため、支払予定を登録できません。\n買掛先ＣＤ：{1}\n債務部門ＣＤ：{2}\n債務区分：{3}\n支払予定の金額合計：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0055',
	'W',
	'０より小さい数字を指定してください。\n列名：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0101',
	'W',
	'案件が取得できませんでした。\n案件ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0102',
	'W',
	'手数料は振り替えできません。\n支払予定ＮＯ：{1}\n債務決済方法ＣＤ：{2}\n債務決済区分：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0103',
	'W',
	'源泉税は振り替えできません。\n支払予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0104',
	'W',
	'支払済の支払予定は振り替えできません。\n支払予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0105',
	'W',
	'承認対象の支払予定は承認されるまで振り替えできません。\n支払予定ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0106',
	'W',
	'無効の買掛明細は振り替えできません。\n買掛明細ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0107',
	'W',
	'指定された計上日で振替元の債務部門が無効です。\n仕訳対象外の債務決済方法を指定するか、計上日を見直してください。\n支払予定ＮＯ：{1}\n買掛明細ＮＯ：{2}\n債務部門ＣＤ：{3}\n計上日：{4}\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0108',
	'W',
	'指定された債務決済方法ＣＤが不正です。\n次の債務決済区分に対応する債務決済方法ＣＤを指定してください。\n債務決済方法ＣＤ：{1}\n債務決済区分：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0109',
	'W',
	'次の債務決済区分に対応する決済方法マスタが登録されていないため処理できません。\n決済方法マスタを登録してください。\n債務決済区分：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0110',
	'W',
	'買掛先、債務部門、債務区分ごとの買掛明細に対応する支払予定が設定されていないため、支払予定を登録できません。\n支払予定設定ボタンを押下してから再度登録してください。\n買掛先ＣＤ：{1}\n債務部門ＣＤ：{2}\n債務区分：{3}\n買掛明細の合計金額：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0111',
	'W',
	'繰越分の買掛明細が振替済みのため、訂正・取消できません。\n支払照合ＮＯ：{1}\n買掛明細ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0201' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0201',
	'W',
	'0より大きいかつ元の加工金額より小さい値を設定してください。\n元の加工金額：{1}\n入力した加工金額：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0202' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0202',
	'W',
	'0より小さいかつ元の加工金額より大きい値を設定してください。\n元の加工金額：{1}\n入力した加工金額：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0203' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0203',
	'W',
	'0より大きいかつ元の有償支給金額より小さい値を設定してください。\n元の有償支給金額：{1}\n入力した有償支給金額：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0204' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0204',
	'W',
	'0より小さいかつ元の有償支給金額より大きい値を設定してください。\n元の有償支給金額：{1}\n入力した有償支給金額：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0205' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0205',
	'W',
	'加工金額と有償支給金額の合計が、金額と異なります。\n加工金額と有償支給金額の合計：{1}\n金額：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0251' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0251',
	'W',
	'前渡金実績が他の支払照合ヘッダに紐づくため、登録できません。\n前渡金実績ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0252' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0252',
	'W',
	'前渡金しか存在しないため、支払照合ができません。\n支払照合に前渡金を含める場合は、支払予定または支払実績の明細を含めて実行してください。\n支払予定管理先ＣＤ：{1}\n支払予定管理先部門ＣＤ：{2}\n取引通貨ＣＤ：{3}\n受領インボイスＮＯ：{4}\n仕入実績ＮＯ：{5}\n案件ＮＯ：{6}\n支払予定管理先締年月：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0253' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0253',
	'W',
	'承認対象の支払予定は、承認されるまで支払通知書を発行できません。\n支払照合ＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBHL0254' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBHL0254',
	'W',
	'支払予定管理先の支払通知書発行対象がオフのため、支払通知書を発行できません。\n支払照合ＮＯ：{1}\n支払予定管理先ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIP0001',
	'W',
	'任意売掛先の仮締解除を行う場合は、仮締解除する売掛先を1件以上行削除してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIP0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIP0002',
	'W',
	'任意買掛先の仮締解除を行う場合は、仮締解除する買掛先を1件以上行削除してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0001',
	'W',
	'前月の売上締あるいは入金締が完了していません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0002',
	'W',
	'前月の仕入締あるいは支払締が完了していません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0003',
	'W',
	'前月の売上締が完了していません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0004',
	'W',
	'前月の入金締が完了していません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0005',
	'W',
	'前月の仕入締が完了していません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0006',
	'W',
	'前月の支払締が完了していません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0007',
	'W',
	'既に当月の売上締あるいは入金締が行われています。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0008',
	'W',
	'既に当月の仕入締あるいは支払締が行われています。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0009',
	'W',
	'既に当月の売上締が行われています。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0010',
	'W',
	'既に当月の入金締が行われています。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0011',
	'W',
	'既に当月の仕入締が行われています。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0012',
	'W',
	'既に当月の支払締が行われています。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0013',
	'W',
	'既に次月の売掛仮締が行われているため、売掛仮締を解除できません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0014',
	'W',
	'既に次月の買掛仮締が行われているため、買掛仮締を解除できません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0015',
	'W',
	'既に次月の売上締が行われています。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0016',
	'W',
	'既に次月の入金締が行われています。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0017',
	'W',
	'既に次月の仕入締が行われています。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0018',
	'W',
	'既に次月の支払締が行われています。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0019',
	'W',
	'売掛仮締の解除対象がありません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0020',
	'W',
	'買掛仮締の解除対象がありません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0021',
	'W',
	'売掛仮締が行われていません。\n処理対象年月：{1}\n売掛先：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0022',
	'W',
	'買掛仮締が行われていません。\n処理対象年月：{1}\n買掛先：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0023',
	'W',
	'当月の売上締が行われていません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0024',
	'W',
	'当月の入金締が行われていません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0025',
	'W',
	'当月の仕入締が行われていません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0026',
	'W',
	'当月の支払締が行われていません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0027',
	'W',
	'仮単価の売上実績明細が存在するため、売上締処理ができません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0028',
	'I',
	'締年月に未処理の入金が存在しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0029',
	'W',
	'仮単価の仕入実績明細が存在するため、仕入締処理ができません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0030',
	'W',
	'未処理の入金（買掛金相殺）が存在するため、支払締処理ができません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0031',
	'W',
	'前月の在庫締が完了していません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0032',
	'W',
	'既に当月の在庫締が行われています。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0033',
	'W',
	'既に次月の在庫締が行われています。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0034',
	'W',
	'当月の在庫締が行われていません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0035',
	'W',
	'既に当月の売掛仮締が行われています。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0036',
	'W',
	'既に当月の売掛仮締が行われています。\n処理対象年月：{1}\n売掛先：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0037',
	'W',
	'既に当月の買掛仮締が行われています。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0038',
	'W',
	'既に当月の買掛仮締が行われています。\n処理対象年月：{1}\n買掛先：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0039',
	'W',
	'訂正前の計上日で入出庫制限が行われているため、登録できません。\n場所：{1}\n品目：{2}\n計上日：{3}\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0040',
	'W',
	'入出庫制限が行われているため、登録できません。\n場所：{1}\n品目：{2}\n計上日：{3}\n{4}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0041',
	'W',
	'既に売上締が行われているため、登録できません。\n計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0042',
	'W',
	'既に売掛仮締が行われているため、登録できません。\n計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0043',
	'W',
	'既に売掛仮締が行われているため、登録できません。\n計上日：{1}\n売掛先：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0044',
	'W',
	'既に入金締が行われているため、登録できません。\n計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0045',
	'W',
	'既に仕入締が行われているため、登録できません。\n計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0046',
	'W',
	'既に買掛仮締が行われているため、登録できません。\n計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0047',
	'W',
	'既に買掛仮締が行われているため、登録できません。\n計上日：{1}\n買掛先：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0048',
	'W',
	'既に支払締が行われているため、登録できません。\n計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0049',
	'W',
	'既に在庫締が行われているため、登録できません。\n計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0050',
	'W',
	'棚卸中の場所があるため、在庫締処理ができません。 \n在庫締日：{1} \n制御対象日：{2} \n場所：{3} \n品目：{4} \n棚卸種別区分：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0051',
	'W',
	'月次締処理でエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0052',
	'I',
	'月次締処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0053',
	'I',
	'月次締処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0054',
	'W',
	'訂正前の計上日が売上締済のため、訂正できません。\n計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0055',
	'W',
	'訂正前の計上日が入金締済のため、訂正できません。\n計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0056',
	'W',
	'訂正前の計上日が仕入締済のため、訂正できません。\n計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0057',
	'W',
	'訂正前の計上日が支払締済のため、訂正できません。\n計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0058',
	'W',
	'訂正前の計上日が在庫締済のため、訂正できません。\n計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0059',
	'W',
	'既に次月の売掛仮締が行われているため、売上締を解除できません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0060',
	'W',
	'既に次月の売掛仮締が行われているため、入金締を解除できません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0061',
	'W',
	'既に次月の買掛仮締が行われているため、仕入締を解除できません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0062',
	'W',
	'既に次月の買掛仮締が行われているため、支払締を解除できません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0063',
	'W',
	'訂正前の計上日が売掛仮締済のため、登録できません。\n計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0064' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0064',
	'W',
	'訂正前の計上日が売掛仮締済のため、登録できません。\n計上日：{1}\n売掛先：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0065' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0065',
	'W',
	'訂正前の計上日が買掛仮締済のため、登録できません。\n計上日：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0066' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0066',
	'W',
	'訂正前の計上日が買掛仮締済のため、登録できません。\n計上日：{1}\n買掛先：{2}\n{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0067' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0067',
	'W',
	'月次受払在庫で月末在庫の数量がマイナスとなるため登録できません。\n年月：{1}\n受払区分：{2}\n品目：{3}\n場所ＣＤ：{4}\n棚・ラインＣＤ：{5}\n在庫着荷先ＣＤ：{6}\nロットＮＯ：{7}\nサブロットＮＯ：{8}\n手配ＮＯ：{9}\n確定ＮＯ区分：{10}\n確定ＮＯ：{11}\n荷姿単位ＣＤ：{12}\n格付ＣＤ：{13}\n積送品区分：{14}\n良品区分：{15}\n資産区分：{16}\n在庫検査区分：{17}\n在庫識別区分：{18}\n在庫取引先ＣＤ：{19}\n荷姿単位数量：{20}\n基準単位数量：{21}\n{22}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0068' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0068',
	'W',
	'入出庫制限が行われているため、登録できません。\n場所：{1}\n計上日：{2}\n{3}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0069',
	'W',
	'訂正前の計上日で入出庫制限が行われているため、登録できません。\n場所：{1}\n計上日：{2}\n{3}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0070',
	'W',
	'指定した処理対象年月以降の年月で売上締あるいは入金締が行われているため、仮締できません。\n処理対象年月：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0071',
	'W',
	'指定した処理対象年月以降の年月で仕入締が行われているため、仮締できません。\n処理対象年月：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0072',
	'W',
	'指定した処理対象年月以降の年月で売上締あるいは入金締が行われているため、仮締を解除できません。\n処理対象年月：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0073',
	'W',
	'指定した処理対象年月以降の年月で仕入締が行われているため、仮締を解除できません。\n処理対象年月：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0074',
	'W',
	'既に当月の仕入締が行われています。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSBIL0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSBIL0075',
	'W',
	'前月の仕入締が完了していません。\n処理対象年月：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAP0001',
	'W',
	'');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0001',
	'I',
	'受注受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0002',
	'I',
	'受注受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0003',
	'W',
	'同じ得意先、得意先注文ＮＯにおいて先に処理した注文でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0004',
	'W',
	'同じ得意先、得意先注文ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0005',
	'W',
	'受注受信ＩＦ取込処理でエラーが発生しました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメッセージＩＤ：{3}\nメッセージ：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0006',
	'W',
	'同じ得意先、得意先注文ＮＯに対する他の注文の取り込み処理でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0007',
	'W',
	'同一の得意先注文明細ＮＯが存在するため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0008',
	'W',
	'売上部門を取得できませんでした。売上部門ＣＤを指定して取込むか、得意先担当マスタを登録してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n適用日：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0009',
	'W',
	'売上担当者を元に、売上部門を取得できませんでした。担当者権限マスタに営業部門を指定してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n売上担当者：{3}\n適用日：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0010',
	'W',
	'諸口品の場合、品名は必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0011',
	'W',
	'デフォルト格付が取得できませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0012',
	'W',
	'数量の小数部桁数が正しくありません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n数量：{3}\n小数部有効桁数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0013',
	'W',
	'税を決定することができませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n税率：{3}\n税区分：{4}\n内税：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0014',
	'W',
	'注文時の税率に対応する税と、マスタから算出した税が異なります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n注文時の税率に対応する税：{3}\nマスタから算出した税：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0015',
	'W',
	'後続業務が行われているため、受注のヘッダ項目を変更できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0016',
	'W',
	'単価の小数部桁数が正しくありません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n単価：{3}\n小数部有効桁数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0017',
	'W',
	'注文時に指定された単価と、マスタの単価が異なります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n注文時に指定された単価：{3}\nマスタの単価：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0018',
	'W',
	'注文時に指定された金額と、マスタから算出した金額が異なります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n注文時に指定された金額：{3}\nマスタから算出した金額：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0019',
	'W',
	'注文時に指定された税額と、マスタから算出した税額が異なります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n注文時に指定された税額：{3}\nマスタから算出した税額：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0020',
	'W',
	'同一の得意先注文が既に存在するため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0021',
	'W',
	'対応する受注情報が複数件取得できたため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0022',
	'W',
	'対応する受注情報が取得できないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0023',
	'I',
	'納期回答受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0024',
	'I',
	'納期回答受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0025',
	'W',
	'同じ発注明細において先に処理したデータでエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n発注明細ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0026',
	'W',
	'同じ発注明細において、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n発注明細ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0027',
	'W',
	'諸口納品先の場合、納品先名は必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n納品先：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0028',
	'W',
	'諸口配送先の場合、配送先名は必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n配送先：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0029',
	'W',
	'取引の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n受注ＮＯ：{3}\n受注明細ＮＯ：{4}\n変更前の取引：{5}\n変更後の取引：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0030',
	'W',
	'同じ発注ＮＯ、発注明細ＮＯに対する他の納期回答の取り込み処理でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注：{3}\n発注明細ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0031',
	'W',
	'納期回答受信ＩＦ取込処理でエラーが発生しました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n発注明細ＮＯ：{4}\nメッセージＩＤ：{5}\nメッセージ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0032',
	'W',
	'納入指示明細が取消されているため、ＥＤＩ出荷実績を取り込みできません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n発注明細ＮＯ：{4}\n納入指示明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0033',
	'W',
	'指定された発注が存在しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n発注改訂番号：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0034',
	'W',
	'指定された発注が存在しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0035',
	'W',
	'発注時の発注先と異なる発注先が指定されています。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n発注時の発注先：{4}\nＩＦデータの発注先：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0036',
	'W',
	'発注が取消されているため、納期回答を取り込みできません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0037',
	'W',
	'発注時の品目と異なる品目は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n発注明細ＮＯ：{4}\n発注時の品目：{5}\nＩＦデータの品目：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0038',
	'W',
	'回答数量の小数部桁数が正しくありません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n発注明細ＮＯ：{4}\n回答数量：{5}\n取引単位：{6}\n小数部有効桁数：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0039' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0039',
	'W',
	'指定された納入指示明細が存在しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n発注明細ＮＯ：{4}\n納入指示明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0040' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0040',
	'W',
	'納入指示明細が取消されているため、納期回答を取り込みできません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n発注明細ＮＯ：{4}\n納入指示明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0041' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0041',
	'W',
	'値引額を設定した場合は、値引理由が必須です。業務理由マスタに売上調整の理由を登録してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0042' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0042',
	'W',
	'資産管理する品目、かつ単価が0の場合は、販売他勘定の売上理由が必須です。\n業務理由マスタに販売他勘定の売上理由を登録してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0043' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0043',
	'W',
	'納期回答の取り込み処理でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注：{3}\n発注明細ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0044' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0044',
	'W',
	'品目単位マスタが存在しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n発注明細ＮＯ：{4}\n品目：{5}\n単位：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0045' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0045',
	'W',
	'メーカが指定されている場合、発注先を特定する為に、受注引当マスタに引当場所を登録する必要があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメーカ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0046' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0046',
	'W',
	'手配区分が仕入直送、かつメーカが指定されている場合、発注先を特定する為に、仕入直送中継場所を設定する必要があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメーカ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0047' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0047',
	'W',
	'該当のメーカに対応する発注先が取得できませんでした。品目詳細マスタを登録してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメーカ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0048' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0048',
	'I',
	'入荷実績受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0049' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0049',
	'I',
	'入荷実績受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0050' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0050',
	'W',
	'同じ入荷物流グループ、外部システムＣＤ、外部入荷実績ＮＯにおいて先に処理した入荷実績でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n入荷物流グループ：{3}\n外部システムＣＤ：{4}\n外部入荷実績ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0051' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0051',
	'W',
	'同じ入荷物流グループ、外部システムＣＤ、外部入荷実績ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n入荷物流グループ：{3}\n外部システムＣＤ：{4}\n外部入荷実績ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0052' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0052',
	'W',
	'入荷実績受信ＩＦ取込処理でエラーが発生しました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメッセージＩＤ：{3}\nメッセージ：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0053' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0053',
	'W',
	'同じ入荷物流グループ、および下記ＮＯに対する他の入荷実績の取り込み処理でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n入荷物流グループ：{3}\n受領インボイスＮＯ：{4}\n発注ＮＯ：{5}\n売上返品予定ＮＯ：{6}\nインボイスＮＯ：{7}\n納品書ＮＯ：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0054' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0054',
	'W',
	'対応する入荷予定情報が取得できないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0055' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0055',
	'W',
	'入荷予定に対して既に入荷実績が登録されているため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部入荷実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0056' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0056',
	'W',
	'入荷実績情報が登録済みのため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部入荷実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0057' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0057',
	'W',
	'対応する入荷実績情報が取得できないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部入荷実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0058' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0058',
	'W',
	'入荷物流グループが入荷予定と異なるため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n入荷物流グループ：{3}\n入荷物流グループ（予定）：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0059' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0059',
	'W',
	'版ＮＯが入荷予定と異なるため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n版ＮＯ：{3}\n版ＮＯ（予定）：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0060' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0060',
	'W',
	'発注日≦回答納入日の関係で指定してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n発注明細ＮＯ：{4}\n発注日：{5}\n回答納入日：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0061' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0061',
	'W',
	'資産管理しない品目、かつ単価が0の場合は、販売他勘定ではない売上理由が必須です。\n業務理由マスタに販売他勘定ではない売上理由を登録してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0062' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0062',
	'W',
	'資産管理する品目、かつ単価が0の場合は、負担部門が必須です。\n売上部門を負担部門として設定する為、部門マスタの負担部門をオンにしてください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}\n売上部門：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0063' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0063',
	'W',
	'発注明細が以下のいずれかの状態であるため、回答を取り込みできません。\n・入荷完了\n・仕入完了\n・受領インボイス登録済\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n発注明細ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0069' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0069',
	'I',
	'製造実績受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0070' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0070',
	'I',
	'製造実績受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0071' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0071',
	'I',
	'ＳＣＭ制御マスタの設定により、受信対象外のデータであるため、スキップしました。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0072' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0072',
	'I',
	'同じ外部システムＣＤ、外部実績ＮＯにおいて、外部システムデータＮＯが大きい更新データを処理しているため、スキップしました。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0073' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0073',
	'I',
	'工程実績の取消レコードを受信しました。そのため、取消対象の工程に紐づく実績の取込をスキップしました。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0074' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0074',
	'I',
	'全工程実績作成の出来高実績の受信により、取込をスキップしました。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0075' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0075',
	'I',
	'製造取消により、取込をスキップしました。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0076' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0076',
	'I',
	'製造実績取込時、処理対象外工数であるため、スキップしました。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0077' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0077',
	'W',
	'同じ製造指図に紐づくレコードの取込処理でエラーが発生しました。エラーが発生しているレコードを確認してください。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}\n製造指図ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0078' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0078',
	'W',
	'同一の外部システムＣＤ、外部システムデータＮＯを持つ他の実績の取込処理でエラーが発生したため、取り込みできませんでした。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0079' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0079',
	'I',
	'工程完了処理を開始します。\n工程実績件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0080' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0080',
	'I',
	'工程完了処理が終了しました。\n成功件数：{1}\n失敗件数：{2}\n未処理件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0083' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0083',
	'W',
	'製造実績受信ＩＦ取込処理でエラーが発生しました。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}\nメッセージＩＤ：{4}\nメッセージ：\n{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0084' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0084',
	'W',
	'実績登録の対象工程は見つかりませんでした。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0085' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0085',
	'W',
	'指定された製造指図ＮＯ、工程ＣＤ、工程連番の組み合わせで取得される工程指図が複数存在します。そのため、実績登録の対象工程を特定できませんでした。\n工程指図ＮＯを指定し、対象工程を特定できるようにしてください。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0086' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0086',
	'W',
	'登録対象の工程指図は存在しません。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}\n工程指図ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0087' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0087',
	'W',
	'製造指図に設定されている製造指図ＮＯが、取込対象のレコードに設定されている製造指図ＮＯと一致しておらず、不整合が発生しています。取込レコードに設定されている製造指図ＮＯを確認してください。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}\n取込対象の製造指図ＮＯ：{4}\n製造指図の製造指図ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0088' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0088',
	'W',
	'製造指図に設定されている製造指図改訂番号が、取込対象のレコードに設定されている製造指図改訂番号と一致しておらず、不整合が発生しています。取込レコードに設定されている改訂番号を確認してください。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}\n取込対象の製造指図改訂番号：{4}\n製造指図の製造指図改訂番号：{5}\n製造指図ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0089' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0089',
	'W',
	'工程指図に設定されている工程ＣＤが、取込対象のレコードに設定されている工程ＣＤと一致しておらず、不整合が発生しています。取込レコードに設定されている工程ＣＤを確認してください。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}\n取込対象の工程ＣＤ：{4}\n工程指図の工程ＣＤ：{5}\n工程指図ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0090' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0090',
	'W',
	'工程指図に設定されている工程連番が、取込対象のレコードに設定されている工程連番と一致しておらず、不整合が発生しています。取込レコードに設定されている工程連番を確認してください。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}\n取込対象の工程連番：{4}\n工程指図の工程連番：{5}\n工程指図ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0091' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0091',
	'W',
	'投入予定は見つかりませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n投入予定ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0092' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0092',
	'W',
	'工数予定は見つかりませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n工数予定ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0093' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0093',
	'W',
	'出来高予定は見つかりませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n出来高予定ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0094' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0094',
	'W',
	'何も指定されていない上り電文があります。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0095' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0095',
	'W',
	'製造実績がないため、訂正や取消はできません。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}\n製造指図ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0096' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0096',
	'W',
	'製造分割の場合、MES受信できません。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}\n製造指図ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0097' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0097',
	'W',
	'ロス実績のロス数量、または、有効成分は必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0098' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0098',
	'W',
	'工程実績の着手実績日時は必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0099' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0099',
	'W',
	'投入実績の実績日時は必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0100' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0100',
	'W',
	'投入実績の投入数量、または、有効成分は必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0101',
	'W',
	'工数実績の計上日は必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0102',
	'W',
	'出来高実績の実績日時は必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0103',
	'W',
	'出来高実績の取引単位数量は必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0104',
	'W',
	'出来高実績の取引単位ＣＤは必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0105',
	'W',
	'同じ外部工程実績ＮＯ、外部システムＣＤの工程実績を重複登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部工程実績ＮＯ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0106',
	'W',
	'同じ外部工程実績ＮＯ、外部システムＣＤの工程実績は既に存在しているため、登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部工程実績ＮＯ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0107',
	'W',
	'受信しようとした工程に、すでに画面から実績が登録されているため、登録できません。製造実績登録画面から該当の実績を削除し、再度取込をしてください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n工程指図ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0108',
	'W',
	'工程の着手実績日時は終了実績日時の以前に指定する必要があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n着手実績日時：{3}\n終了実績日時：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0109' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0109',
	'W',
	'同じ外部投入実績ＮＯ、外部システムＣＤの投入実績を重複登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部投入実績ＮＯ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0110' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0110',
	'W',
	'同じ外部投入実績ＮＯ、外部システムＣＤの投入実績は既に存在しているため、登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部投入実績ＮＯ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0111' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0111',
	'W',
	'追加投入の場合、品目を指定する必要があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0112' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0112',
	'W',
	'投入の他勘定振替数量がある場合、他勘定振替理由は必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0113' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0113',
	'W',
	'投入の他勘定振替数量がある場合、他勘定振替負担部門は必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0114' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0114',
	'W',
	'同じ外部工数実績ＮＯ、外部システムＣＤの工数実績を重複登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部工数実績ＮＯ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0115' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0115',
	'W',
	'同じ外部工数実績ＮＯ、外部システムＣＤの工数実績は既に存在しているため、登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部工数実績ＮＯ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0116' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0116',
	'W',
	'追加工数の場合、工数管理ＣＤを指定する必要があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0117' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0117',
	'W',
	'工数の着手時刻は計上日と同じ日に指定する必要があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n計上日：{3}\n着手時刻：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0118' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0118',
	'W',
	'工数の終了時刻は計上日と同じ日に指定する必要があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n計上日：{3}\n終了時刻：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0119' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0119',
	'W',
	'工数の着手時刻は終了時刻の以前に指定する必要があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n着手時刻：{3}\n終了時刻：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0120' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0120',
	'W',
	'同じ外部出来高実績ＮＯ、外部システムＣＤの出来高実績を重複登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部出来高実績ＮＯ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0121' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0121',
	'W',
	'同じ外部出来高実績ＮＯ、外部システムＣＤの出来高実績は既に存在しているため、登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部出来高実績ＮＯ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0122' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0122',
	'W',
	'登録対象となる出来高予定を特定できませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0123' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0123',
	'W',
	'追加副産品の場合、品目を指定する必要があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0124' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0124',
	'W',
	'追加副産品の場合、良品区分を指定する必要があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0125' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0125',
	'W',
	'出来高不良品の場合、出来高理由を指定する必要があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0126' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0126',
	'W',
	'工程実績は見つかりませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部工程実績ＮＯ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0127' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0127',
	'W',
	'投入実績は見つかりませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部投入実績ＮＯ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0128' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0128',
	'W',
	'工数実績は見つかりませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部工数実績ＮＯ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0129' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0129',
	'W',
	'出来高実績は見つかりませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部出来高実績ＮＯ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0130' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0130',
	'W',
	'ロス品目と親の投入品目と一致しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nロス品目：{3}\n投入品目：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0131' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0131',
	'W',
	'追加ロスの場合、品目を指定する必要があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0132' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0132',
	'W',
	'ロス品目にロス理由は定義されていません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nロス品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0133' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0133',
	'W',
	'固定ロスと初期表示ロス以外の場合、ロス理由ＣＤは必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0134' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0134',
	'W',
	'ロス品目に下記のロス理由ＣＤは定義されていません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nロス理由ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0135' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0135',
	'W',
	'同じロス理由ＣＤで２回以上ロス実績を登録できません。\n前回データ行ＮＯ：{1}\n今回データ行ＮＯ：{2}\nロス理由ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0136' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0136',
	'W',
	'同じロス理由ＣＤで２回以上ロス実績を取り消せません。\n前回データ行ＮＯ：{1}\n今回データ行ＮＯ：{2}\nロス理由ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0137' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0137',
	'W',
	'同じロス理由ＣＤのロス実績は既に存在しているため、登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nロス理由ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0138' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0138',
	'W',
	'ロス実績は見つかりませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部投入実績ＮＯ：{3}\n外部システムＣＤ：{4}\nロス理由ＣＤ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0139' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0139',
	'W',
	'投入品目は見つかりませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0140' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0140',
	'W',
	'版管理対象投入品目のロット情報は見つかりませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0141' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0141',
	'W',
	'有効成分対象外の品目、投入数量は必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0142' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0142',
	'W',
	'ロス実績の数量は正数で必要があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0143' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0143',
	'W',
	'工程実績の実績数量は必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0144' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0144',
	'W',
	'製造指図に設定されている製造場所が、取込対象のレコードに設定されている製造場所と一致しておらず、不整合が発生しています。取込レコードに設定されている製造場所を確認してください。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}\n取込対象の製造場所：{4}\n製造指図の製造場所：{5}\n製造指図ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0145' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0145',
	'W',
	'製造指図に設定されている製造品目が、取込対象のレコードに設定されている製造品目と一致しておらず、不整合が発生しています。取込レコードに設定されている製造品目を確認してください。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}\n取込対象の製造品目：{4}\n製造指図の製造品目：{5}\n製造指図ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0146' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0146',
	'W',
	'工程指図に対して既に実績が上がっているため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n工程指図ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0147' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0147',
	'W',
	'投入予定に対して既に実績が上がっているため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n投入予定ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0148' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0148',
	'W',
	'工数予定に対して既に実績が上がっているため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n工数予定ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0149' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0149',
	'W',
	'出来高予定に対して既に実績が上がっているため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n出来高予定ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0150' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0150',
	'W',
	'工数受信の製造指図改訂番号と最新の製造指図改訂番号と一致しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n製造指図ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0151' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0151',
	'I',
	'工数実績受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0152' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0152',
	'I',
	'工数実績受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0153' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0153',
	'W',
	'工数実績受信ＩＦ取込処理でエラーが発生しました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメッセージＩＤ：{3}\nメッセージ：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0154' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0154',
	'W',
	'指図外工数で、品目がある場合、場所ＣＤは必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0155' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0155',
	'W',
	'指図外工数の場合、部門ＣＤは必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0156' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0156',
	'I',
	'ＳＣＭ実績受信ＩＦ一括取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0157' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0157',
	'I',
	'ＳＣＭ実績受信ＩＦ一括取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0158' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0158',
	'W',
	'処理中のレコードが存在するため処理を中止しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0159' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0159',
	'I',
	'出荷実績受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0160' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0160',
	'I',
	'出荷実績受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0161' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0161',
	'W',
	'同じ出荷元物流グループ、出荷指図ＮＯにおいて先に処理した出荷情報でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n出荷元物流グループ：{3}\n出荷指図ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0162' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0162',
	'W',
	'同じ出荷元物流グループ、外部システムＣＤ、外部出荷実績ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n出荷元物流グループ：{3}\n外部システムＣＤ：{4}\n外部出荷実績ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0163' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0163',
	'W',
	'出荷実績受信ＩＦ取込処理でエラーが発生しました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメッセージＩＤ：{3}\nメッセージ：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0164' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0164',
	'W',
	'同じ出荷元物流グループ、出荷指図ＮＯに対する他の出荷実績の取り込み処理でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n出荷元物流グループ：{3}\n出荷指図ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0165' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0165',
	'W',
	'同一の外部出荷実績ＮＯが存在するため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部出荷実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0166' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0166',
	'W',
	'同一の外部出荷実績ＮＯが既に存在するため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部出荷実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0167' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0167',
	'W',
	'対応する出荷実績情報が複数件取得できたため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0168' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0168',
	'W',
	'対応する出荷実績情報が取得できないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0169' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0169',
	'W',
	'下記項目のいずれか1つを指定してください。\n出荷引当状況ＮＯ、出荷指図明細ＮＯ、インボイス明細ＮＯ、インボイスＮＯ、納品書明細ＮＯ、納品書ＮＯ\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0170' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0170',
	'W',
	'出荷実績受信ＩＦ情報に対応する出荷引当状況を特定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n出荷引当状況ＮＯ：{3}\n出荷指図明細ＮＯ：{4}\nインボイス明細ＮＯ：{5}\nインボイスＮＯ：{6}\n納品書明細ＮＯ：{7}\n納品書ＮＯ：{8}\n出荷場所ＣＤ：{9}\n出荷棚・ラインＣＤ：{10}\nロットＮＯ：{11}\nサブロットＮＯ：{12}\n手配ＮＯ：{13}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0171' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0171',
	'I',
	'移動実績受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0172' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0172',
	'I',
	'移動実績受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0173' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0173',
	'W',
	'ＩＦ処理区分に対応する取込オペレーションの設定が正しくないため、受信IFサービスを実行できません。\nＩＦ処理区分：{1}\n取込オペレーション：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0174' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0174',
	'I',
	'ＥＤＩ出荷実績受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0175' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0175',
	'I',
	'ＥＤＩ出荷実績受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0176' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0176',
	'W',
	'指定された発注明細が存在しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注明細ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0177' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0177',
	'W',
	'発注時の発注先と異なる発注先が指定されています。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注明細ＮＯ：{3}\n発注時の発注先：{4}\nＩＦデータの発注先：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0178' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0178',
	'W',
	'品目単位マスタが存在しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注明細ＮＯ：{3}\n業者納品書ＮＯ：{4}\n業者納品書明細ＮＯ：{5}\n品目：{6}\n単位：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0179' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0179',
	'W',
	'発注時の品目と異なる品目は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注明細ＮＯ：{3}\n発注時の品目：{4}\nＩＦデータの品目：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0180' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0180',
	'W',
	'指定された納入指示が存在しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注明細ＮＯ：{3}\n納入指示ＮＯ：{4}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0181' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0181',
	'W',
	'入荷予定が打切されているため取り込みできません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注明細ＮＯ：{3}\n業者納品書ＮＯ：{4}\n業者納品書明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0182' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0182',
	'W',
	'外部入荷実績ＮＯが重複しています。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部入荷実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0183' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0183',
	'W',
	'業者納品書ＮＯと業者納品書明細ＮＯの組み合わせが重複しています。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注先：{3}\n発注明細ＮＯ：{4}\n業者納品書ＮＯ：{5}\n業者納品書明細ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0184' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0184',
	'W',
	'取引単位数量の小数部桁数が正しくありません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注明細ＮＯ：{3}\n業者納品書ＮＯ：{4}\n業者納品書明細ＮＯ：{5}\n取引単位数量：{6}\n取引単位：{7}\n小数部有効桁数：{8}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0185' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0185',
	'W',
	'同じ物流グループ、外部システムＣＤ、外部移動実績ＮＯにおいて先に処理した移動実績でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n物流グループＣＤ：{3}\n外部システムＣＤ：{4}\n外部移動実績ＮＯ：{５}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0186' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0186',
	'W',
	'同じ物流グループ、外部システムＣＤ、外部移動実績ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n物流グループ：{3}\n外部システムＣＤ：{4}\n外部移動実績ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0187' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0187',
	'W',
	'移動実績受信ＩＦ取込処理でエラーが発生しました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメッセージＩＤ：{3}\nメッセージ：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0188' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0188',
	'W',
	'発注明細ＮＯと納入指示明細ＮＯの組み合わせが不正です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注明細ＮＯ：{3}\n納入指示明細ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0189' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0189',
	'W',
	'配送先が必須です。配送先を指定して取込むか、物流制御マスタに標準配送先を登録してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n納品先：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0190' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0190',
	'W',
	'品目が入荷予定と異なるため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}\n品目（予定）：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0191' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0191',
	'W',
	'注文時に指定された仮単価と、マスタの仮単価が異なります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n注文時に指定された仮単価：{3}\nマスタの仮単価：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0192' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0192',
	'W',
	'指定された取引は利用できません。\n下記の取引パタン区分が指定された取引を指定してください。\n取引パタン区分：「移動・移送」「移動・移送返品」「支給」「支給返品」\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n取引ＣＤ：{3}\n取引パタン区分：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0193' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0193',
	'W',
	'対応する移動引当状況情報が取得できないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0194' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0194',
	'W',
	'移動指図に対して既に移動実績が登録されているため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部移動実績ＮＯ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0195' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0195',
	'W',
	'対応する移動実績情報が取得できないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部移動実績ＮＯ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0196' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0196',
	'W',
	'指定された移動指図が存在しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n移動指図ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0197' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0197',
	'W',
	'同一の移動実績が既に存在するため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部移動実績ＮＯ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0198' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0198',
	'W',
	'同じ物流グループ、外部システムＣＤに対する他の移動実績の取り込み処理でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n物流グループ：{3}\n外部システムＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0199' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0199',
	'W',
	'同じ物流グループ、外部システムＣＤ、外部移動実績ＮＯにおいて先に処理した移動実績でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n物流グループＣＤ：{3}\n外部システムＣＤ：{4}\n外部移動実績ＮＯ：{５}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0200' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0200',
	'W',
	'インボイス単価の初期値とする販売単価が取得できないため、取り込みできませんでした。\nインボイス取引、かつ単価が0の場合は、インボイス単価が必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0201' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0201',
	'W',
	'承認状況区分が一次承認済または最終承認済のため、、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先注文ＮＯ：{3}\n受注NO：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0202' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0202',
	'W',
	'指定された納入指示が存在しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n発注明細ＮＯ：{4}\n納入指示ＮＯ：{5}\n納入指示改訂番号：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0203' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0203',
	'W',
	'発注明細が取消されているため、納期回答を取り込みできません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注明細ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0204' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0204',
	'W',
	'同じヘッダに対する他の出荷実績の取り込み処理でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n出荷元物流グループ：{3}\n出荷日時：{4}\n納品日時：{5}\n得意先：{6}\n依頼元部門：{7}\n依頼元担当者：{8}\n出荷部門：{9}\n出荷担当者：{10}\n送付先識別区分：{11}\n送付先識別：{12}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0205' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0205',
	'W',
	'発生処理：{1}\n発生日時：{2}\n会社：{3}\nワーキンググループＣＤ：{4}\n得意先ＣＤ：{5}\nエラー内容：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0206' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0206',
	'W',
	'発生処理：{1}\n発生日時：{2}\n会社：{3}\nワーキンググループＣＤ：{4}\n発注先ＣＤ：{5}\nエラー内容：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0207' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0207',
	'W',
	'出荷引当状況に対して既に出荷実績が登録されているため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部出荷実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0208' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0208',
	'W',
	'取消可能な回答が存在しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注明細ＮＯ：{3}\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0209' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0209',
	'W',
	'品目の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n変更前の品目：{3}\n変更後の品目：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0210' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0210',
	'W',
	'指定されたインボイスＮＯと出荷指図のインボイスＮＯが一致しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n指定されたインボイスＮＯ：{3}\n出荷指図のインボイスＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0211' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0211',
	'W',
	'取引パタン区分が支給の場合、送付先の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n変更前の送付先識別区分：{3}\n変更前の送付先識別ＣＤ：{4}\n変更後の送付先識別区分：{5}\n変更後の送付先識別ＣＤ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0212' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0212',
	'W',
	'取引パタン区分が支給返品の場合、出荷場所の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n変更前の出荷場所ＣＤ：{3}\n変更後の出荷場所ＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0213' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0213',
	'W',
	'取引パタン区分が支給返品の場合、出荷棚・ラインの変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n変更前の出荷棚・ラインＣＤ：{3}\n変更後の出荷棚・ラインＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0214' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0214',
	'W',
	'入庫場所の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n変更前の入庫場所ＣＤ：{3}\n変更後の入庫場所ＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0215' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0215',
	'W',
	'取引パタン区分が支給返品の場合、出庫場所の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n変更前の出庫場所ＣＤ：{3}\n変更後の出庫場所ＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0216' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0216',
	'W',
	'工場・物流倉庫が異なる場合は「検査済」のみ指定可能です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n入庫工場・物流倉庫ＣＤ：{3}\n出庫工場・物流倉庫ＣＤ：{4}\n在庫検査区分：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0217' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0217',
	'W',
	'出荷指図区分が対象外のため、移動実績を取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0218' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0218',
	'W',
	'同じ発注明細に対する回答に異なる発注改訂番号が設定されています。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}\n発注明細ＮＯ：{4}\n発注改訂番号：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0219' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0219',
	'I',
	'入荷予定が入荷不要のため取り込みできません。取込対象から除外します。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注明細ＮＯ：{3}\n業者納品書ＮＯ：{4}\n業者納品書明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0220' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0220',
	'W',
	'購買識別区分が「2：無償受給」または「3：有償受給」のデータは取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n購買識別区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0221' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0221',
	'W',
	'指定された納入指示が存在しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注明細ＮＯ：{3}\n納入指示ＮＯ：{4}\n納入指示明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0222' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0222',
	'W',
	'投入数量、固定必要数量が共に０の投入予定に対して実績を登録することはできません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n投入予定ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0223' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0223',
	'W',
	'投入制御区分がＭＲＰ対象外（指図書のみ）の投入予定に対して実績を登録することはできません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n投入予定ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0300' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0300',
	'I',
	'他勘定振替実績受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0301' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0301',
	'I',
	'他勘定実績受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0302' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0302',
	'W',
	'同じ他勘定振替指図ＮＯにおいて先に処理した他勘定振替情報でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n他勘定振替指図ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0303' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0303',
	'W',
	'同じ他勘定振替明細において、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部他勘定振替実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0304' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0304',
	'W',
	'他勘定振替実績受信ＩＦ取込処理でエラーが発生しました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメッセージＩＤ：{3}\nメッセージ：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0305' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0305',
	'W',
	'同じ他勘定振替指図ＮＯに対する他の他勘定振替実績の取り込み処理でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n他勘定振替指図ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0306' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0306',
	'W',
	'同じヘッダに対する他の他勘定振替実績の取り込み処理でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n取引：{3}\n場所：{4}\n他勘定振替実績日時：{5}\n実施部門：{6}\n実施担当者：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0307' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0307',
	'W',
	'同一の外部他勘定振替実績ＮＯが存在するため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部他勘定振替実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0308' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0308',
	'W',
	'同一の外部他勘定振替実績ＮＯが既に存在するため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部他勘定振替実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0309' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0309',
	'W',
	'指定された他勘定振替指図が存在しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n他勘定振替指図ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0310' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0310',
	'W',
	'対応する他勘定振替実績情報が複数件取得できたため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0311' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0311',
	'W',
	'対応する他勘定振替実績情報が取得できないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0312' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0312',
	'W',
	'他勘定振替実績受信ＩＦ情報に対応する他勘定振替指図明細を特定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n他勘定振替指図ＮＯ：{3}\n他勘定振替指図明細ＮＯ：{4}\n品目：{5}\n棚・ラインＣＤ：{6}\nロットＮＯ：{7}\nサブロットＮＯ：{8}\n手配ＮＯ：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0313' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0313',
	'W',
	'他勘定振替指図明細に対して既に他勘定振替実績が登録されているため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部他勘定振替実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0314' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0314',
	'W',
	'場所の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n変更前の場所ＣＤ：{3}\n変更後の場所ＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0316' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0316',
	'W',
	'同じ外部システムＣＤ、外部他勘定振替実績ＮＯにおいて先に処理した他勘定振替情報でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部他勘定振替実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0317' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0317',
	'W',
	'取引の変更を伴う更新はできません。既存のデータを削除してから、新規データとして取り込んでください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n変更前の取引ＣＤ：{3}\n変更前の取引パタン区分：{4}\n変更後の場所ＣＤ：{5}\n変更後の取引パタン区分：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0400' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0400',
	'I',
	'検収受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0401' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0401',
	'I',
	'検収受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0402' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0402',
	'W',
	'売上計上可能な売上予定が取得できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0403' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0403',
	'W',
	'売上計上可能な売上予定が取得できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\nインボイスＮＯ：{4}\nインボイス明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0404' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0404',
	'W',
	'売上計上可能な売上予定が取得できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0405' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0405',
	'W',
	'対応する受注情報が取得できないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n品目：{6}\n手配ＮＯ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0406' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0406',
	'W',
	'対応する受注情報が複数件取得できたため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n品目：{5}\n手配ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0407' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0407',
	'W',
	'対応するインボイス情報が取得できないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\nインボイスＮＯ：{4}\nインボイス明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\n品目：{8}\n手配ＮＯ：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0408' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0408',
	'W',
	'対応するインボイス情報が複数件取得できたため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\nインボイスＮＯ：{4}\nインボイス明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\n品目：{8}\n手配ＮＯ：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0409' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0409',
	'W',
	'対応する納品伝票情報が取得できないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\n品目：{8}\n手配ＮＯ：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0410' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0410',
	'W',
	'対応する納品伝票情報が複数件取得できたため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\n品目：{8}\n手配ＮＯ：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0411' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0411',
	'I',
	'検収不良のデータであるため、スキップしました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0412' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0412',
	'W',
	'同じ得意先、納品書ＮＯ、得意先注文ＮＯにおいて先に処理した売上でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n得意先注文ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0413' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0413',
	'W',
	'同じ外部システムＣＤ、外部仕入実績明細ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部仕入実績明細ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0414' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0414',
	'W',
	'売上計上区分が検収基準売上または着荷基準売上ではないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0415' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0415',
	'W',
	'売上計上区分が検収基準売上または着荷基準売上ではないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\nインボイスＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0416' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0416',
	'W',
	'入金予定日が指定されていないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\nインボイスＮＯ：{4}\nインボイス明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0417' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0417',
	'W',
	'検収受信ＩＦ取込処理でエラーが発生しました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメッセージＩＤ：{3}\nメッセージ：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0418' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0418',
	'W',
	'同じ得意先、納品書ＮＯ、得意先注文ＮＯに対する他の売上の取り込み処理でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n得意先注文ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0419' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0419',
	'W',
	'受注または納品伝票またはインボイスを特定できないか、売上計上可能な売上予定が取得できないため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n品目：{6}\n手配ＮＯ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0420' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0420',
	'W',
	'インボイスの単位と異なる単位は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\nインボイスＮＯ：{4}\nインボイス明細ＮＯ：{5}\nインボイスの単位：{6}\nＩＦデータの単位：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0421' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0421',
	'W',
	'品目単位マスタに存在しない単位は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\nＩＦデータの単位：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0422' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0422',
	'W',
	'受注時の通貨と異なる通貨は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n受注ＮＯ：{6}\n受注時の通貨：{7}\nＩＦデータの通貨：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0423' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0423',
	'W',
	'インボイスの通貨と異なる通貨は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\nインボイスＮＯ：{4}\nインボイスの通貨：{5}\nＩＦデータの通貨：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0424' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0424',
	'W',
	'納品書の通貨と異なる通貨は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書の通貨：{5}\nＩＦデータの通貨：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0425' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0425',
	'W',
	'受注時の単価と異なる単価は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n受注ＮＯ：{6}\n受注明細ＮＯ：{7}\n受注時の単価（単位換算後）：{8}\nＩＦデータの単価：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0426' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0426',
	'W',
	'インボイスの単価と異なる単価は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\nインボイスＮＯ：{4}\nインボイス明細ＮＯ：{5}\nインボイスの単価：{6}\nＩＦデータの単価：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0427' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0427',
	'W',
	'納品書の単価と異なる単価は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n納品書の単価：{6}\nＩＦデータの単価：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0428' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0428',
	'W',
	'受注時の金額と異なる金額は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n受注ＮＯ：{6}\n受注明細ＮＯ：{7}\n受注時の金額（数量・税換算後）：{8}\nＩＦデータの金額：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0429' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0429',
	'W',
	'インボイスの金額と異なる金額は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\nインボイスＮＯ：{4}\nインボイス明細ＮＯ：{5}\nインボイスの金額：{6}\nＩＦデータの金額：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0430' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0430',
	'W',
	'納品書の金額と異なる金額は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n納品書の金額（数量・税換算後）：{6}\nＩＦデータの金額：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0431' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0431',
	'W',
	'受注時の値引額と異なる値引額は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n受注ＮＯ：{6}\n受注明細ＮＯ：{7}\n受注時の値引額（数量換算後）：{8}\nＩＦデータの値引額：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0432' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0432',
	'W',
	'インボイスの値引額と異なる値引額は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\nインボイスＮＯ：{4}\nインボイス明細ＮＯ：{5}\nインボイスの値引額：{6}\nＩＦデータの値引額：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0433' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0433',
	'W',
	'納品書の値引額と異なる値引額は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n納品書の値引額（数量換算後）：{6}\nＩＦデータの値引額：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0434' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0434',
	'W',
	'受注時の値引理由と異なる値引理由は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n受注ＮＯ：{6}\n受注明細ＮＯ：{7}\n受注時の値引理由：{8}\nＩＦデータの値引理由：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0435' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0435',
	'W',
	'インボイスの値引理由と異なる値引理由は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\nインボイスＮＯ：{4}\nインボイス明細ＮＯ：{5}\nインボイスの値引理由：{6}\nＩＦデータの値引理由：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0436' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0436',
	'W',
	'納品書に紐づく受注の値引理由と異なる値引理由は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n受注ＮＯ：{6}\n受注明細ＮＯ：{7}\n受注時の値引理由：{8}\nＩＦデータの値引理由：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0437' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0437',
	'W',
	'税チェック対象の場合、ＩＦデータの税率に対応する税と受注時の税率と異なる税は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n受注ＮＯ：{6}\n受注明細ＮＯ：{7}\n受注時の税：{8}\nＩＦデータの税率に対応する税：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0438' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0438',
	'W',
	'税チェック対象の場合、ＩＦデータの税率に対応する税とインボイスの税率と異なる税率は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\nインボイスＮＯ：{4}\nインボイス明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\nインボイスの税：{8}\nＩＦデータの税率に対応する税：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0439' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0439',
	'W',
	'税チェック対象の場合、ＩＦデータの税率に対応する税と納品書の税率と異なる税は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n納品書の税：{6}\nＩＦデータの税率に対応する税：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0440' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0440',
	'W',
	'単価がゼロの場合、売上理由が必須になるため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0441' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0441',
	'W',
	'同じ受注ＮＯに対する他の明細でエラーが発生したため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n受注ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0442' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0442',
	'W',
	'同じインボイスＮＯに対する他の明細でエラーが発生したため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\nインボイスＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0443' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0443',
	'W',
	'同じ納品書ＮＯに対する他の明細でエラーが発生したため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0444' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0444',
	'W',
	'仕入後計上となる場合、売上予定の売上可能数量を超過する数量は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n受注ＮＯ：{6}\n受注明細ＮＯ：{7}\n売上可能数量（基準単位）：{8}\nＩＦデータの数量（基準単位）：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0445' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0445',
	'W',
	'インボイス取引の場合、インボイス数量と異なる数量は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\nインボイス数量：{8}\nＩＦデータの数量：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0446' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0446',
	'W',
	'検収基準売上または着荷基準売上の場合、売上予定の売上可能数量を超過する数量は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\n売上可能数量（基準単位）：{8}\nＩＦデータの数量（基準単位）：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0447' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0447',
	'W',
	'打切となる残数量がないため、打切指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n受注ＮＯ：{6}\n受注明細ＮＯ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0448' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0448',
	'W',
	'インボイス取引の場合、打切指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0449' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0449',
	'W',
	'打切となる残数量がないため、打切指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0450' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0450',
	'W',
	'インボイスの全明細が処理対象となっていないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\n外部システムＣＤ：{8}\n外部仕入実績明細ＮＯ：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0451' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0451',
	'W',
	'同一インボイスで異なる入金予定日が指定されているため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\nインボイスＮＯ：{4}\nインボイス明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0452' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0452',
	'W',
	'ＩＦデータに対応する売上実績情報が取得できないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\n品目：{8}\n手配ＮＯ：{9}\n外部システムＣＤ：{10}\n外部仕入実績明細ＮＯ：{11}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0453' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0453',
	'W',
	'打切のまま取消することはできません。打切解除した後に取込を行ってください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0454' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0454',
	'W',
	'対象の得意先は売上が禁止されているため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\n売上日：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0455' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0455',
	'W',
	'対象の品目は売上が禁止されているため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\n品目：{8}\n売上日：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0456' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0456',
	'W',
	'仕入済の数量と異なる数量ため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n仕入済数量（基準単位）：{6}\nＩＦデータの数量（基準単位）：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0457' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0457',
	'W',
	'対象の外部システムＣＤ、外部仕入実績明細ＮＯに対する売上実績が既に登録されているため、新規で取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\n外部システムＣＤ：{8}\n外部仕入実績明細ＮＯ：{9}\n登録済売上実績ＮＯ：{10}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0458' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0458',
	'W',
	'下記項目のいずれかあるいは両方を指定してください。\n納品書ＮＯ、得意先注文ＮＯ\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0459' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0459',
	'W',
	'指定された税額と、算出した税額が異なります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nＩＦデータの税額：{3}\n算出した税額：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0460' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0460',
	'W',
	'取引単位数量の小数部桁数が正しくありません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\n取引単位：{8}\n取引単位数量：{9}\n小数部有効桁数：{10}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0461' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0461',
	'W',
	'同一処理グループ、同一データ更新区分で、外部システムＣＤ、外部仕入実績明細ＮＯが重複しているため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\n外部システムＣＤ：{8}\n外部仕入実績明細ＮＯ：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0462' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0462',
	'W',
	'外部システムＣＤ、外部仕入実績明細ＮＯに紐づく売上実績が特定できないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\n外部システムＣＤ：{8}\n外部仕入実績明細ＮＯ：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0463' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0463',
	'W',
	'ロット発番区分が手動のため、ロットＮＯ、サブロットＮＯを発番して取り込むことができません。\n仕入直送売上登録または売上実績一覧登録でロットＮＯ、サブロットＮＯを指定して登録してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\n品目：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0464' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0464',
	'W',
	'注文時の税（税率、税区分、内税）と、マスタから算出した税が異なります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n注文時の税率：{3}\n注文時の税区分：{4}\n注文時の内税：{5}\nマスタから算出した税：{6}\nマスタから算出した税率：{7}\nマスタから算出した税区分：{8}\nマスタから算出した内税：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0465' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0465',
	'W',
	'ロットＮＯの混在が不可の投入品でロットが混在しているため、処理できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n投入予定ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0466' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0466',
	'W',
	'サブロットＮＯの混在が不可の投入品でサブロットが混在しているため、処理できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n投入予定ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0467' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0467',
	'W',
	'混在不可の代替グループ内で投入品が混在しているため、処理できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n投入予定ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0470' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0470',
	'I',
	'発注受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0471' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0471',
	'I',
	'発注受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0472' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0472',
	'W',
	'発注受信ＩＦ取込処理でエラーが発生しました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメッセージＩＤ：{3}\nメッセージ：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0473' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0473',
	'W',
	'発生処理：{1}\n発生日時：{2}\n会社：{3}\nワーキンググループＣＤ：{4}\n外部発注NO：{5}\nエラー内容：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0474' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0474',
	'W',
	'同じ外部システムＣＤ、外部発注ＮＯにおいて先に処理したデータでエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0475' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0475',
	'I',
	'同じ外部システムＣＤ、外部発注ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0476' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0476',
	'W',
	'同一の発注明細が既に存在するため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0477' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0477',
	'W',
	'対応する発注明細が取得できなかったため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0478' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0478',
	'W',
	'対応する発注情報が複数件取得できたため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0479' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0479',
	'W',
	'同一の外部発注ＮＯを持つ他の発注明細でエラーが発生したため、取り込みできませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0480' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0480',
	'W',
	'今回の取込対象データのなかに、外部発注ＮＯ、外部発注明細ＮＯの組が重複しているデータが存在します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0481' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0481',
	'W',
	'値引品目のみの登録はできません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}\n\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0482' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0482',
	'W',
	'承認状況区分が一次承認済または最終承認済のため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部発注ＮＯ：{3}\n発注NO：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0483' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0483',
	'W',
	'同一の外部発注ＮＯを持つ明細の中に、次処理（入荷、仕入、受領インボイス登録）が行われている明細があるため、処理できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0484' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0484',
	'W',
	'取引先禁止マスタにおいて、発注が禁止されています。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注先ＣＤ：{3}\n発注日：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0485' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0485',
	'W',
	'品目禁止マスタにおいて、発注が禁止されています。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}\n発注日：{4}\n禁止日：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0486' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0486',
	'W',
	'外注品の購買識別区分には、有償受給あるいは通常購買を指定してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0487' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0487',
	'W',
	'外注品を経費購買できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0488' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0488',
	'W',
	'値引品目は購買識別区分に通常購買を指定してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0489' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0489',
	'W',
	'資産管理しない品目は、購買識別区分にＶＭＩを指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0490' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0490',
	'W',
	'入荷不要の品目は、購買識別区分に無償受給を指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0491' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0491',
	'W',
	'取引が経費購買の場合、資産管理する品目を登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}\n品目：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0492' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0492',
	'W',
	'資産管理する品目は経費購買の理由を設定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}\n品目：{6}\n理由ＣＤ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0493' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0493',
	'W',
	'資産管理しない品目は経費購買の理由を設定してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}\n品目：{6}\n理由ＣＤ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0494' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0494',
	'W',
	'下請法対象取引先の発注先に対する納入希望日は仕入予定日と同日である必要があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0495' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0495',
	'W',
	'負担発注ＮＯに対応する発注情報が見つかりません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}\n負担発注ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0496' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0496',
	'W',
	'負担受注ＮＯに対応する受注情報が見つかりません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}\n負担受注ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0497' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0497',
	'W',
	'負担インボイスＮＯに対応するインボイス情報あるいは受領インボイス情報が見つかりません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}\n負担インボイスＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0498' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0498',
	'W',
	'外部発注明細ＮＯに紐づかない発注明細があるため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0499' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0499',
	'W',
	'対応する発注明細が複数件取得できたため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0500' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0500',
	'W',
	'支給直送の場合、購買識別区分にＶＭＩを指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0501' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0501',
	'W',
	'指定された取引は利用できません。\n下記の取引パタン区分が指定された取引を指定してください。\n取引パタン区分：「仕入」「経費購買」\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}\n取引ＣＤ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0502' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0502',
	'W',
	'外部発注ＮＯが同じである各明細行の中で、手配ＮＯ１に対応する案件ＮＯが異なってます。\n外部発注ＮＯを分割するか、手配ＮＯ１を変更して、１つの外部発注ＮＯに対して１つの案件ＮＯとなるように変更してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}\n手配ＮＯ１：{6}\n案件ＮＯ：{7}\n案件名：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0503' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0503',
	'W',
	'発注ヘッダの案件ＮＯと、手配ＮＯ１に対応する案件ＮＯが異なっているため訂正できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}\n外部発注明細ＮＯ：{5}\n手配ＮＯ１：{6}\n案件ＮＯ：{7}\n案件名：{8}\n発注ヘッダの案件ＮＯ：{9}\n発注ヘッダの案件名：{10}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0504' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0504',
	'W',
	'加工単価の小数部桁数が正しくありません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n単価：{3}\n小数部有効桁数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0505' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0505',
	'W',
	'有償支給単価の小数部桁数が正しくありません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n単価：{3}\n小数部有効桁数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0506' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0506',
	'W',
	'品目マスタの購買単価変更許可がオフ、かつ、取引マスタの購買単価変更許可がオフであるため、単価を指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0507' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0507',
	'W',
	'同一の外部発注ＮＯを持つ明細の中に、打切済の明細が含まれているため、処理できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部発注ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0508' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0508',
	'W',
	'値引額小数部桁数が正しくありません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n値引額：{3}\n小数部有効桁数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0509' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0509',
	'W',
	'出荷指図明細が存在しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0510' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0510',
	'W',
	'指定された出荷指図明細が存在しません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n出荷指図明細ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0512' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0512',
	'W',
	'外部移動実績ＮＯが重複しています。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部移動実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0600' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0600',
	'I',
	'入金受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0601' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0601',
	'I',
	'入金受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0602' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0602',
	'W',
	'入金受信ＩＦ取込処理でエラーが発生しました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメッセージＩＤ：{3}\nメッセージ：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0603' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0603',
	'W',
	'発生処理：{1}\n発生日時：{2}\n会社：{3}\nワーキンググループＣＤ：{4}\n入金先ＣＤ：{5}\nエラー内容：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0604' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0604',
	'W',
	'同じ外部システムＣＤ、外部入金ＮＯにおいて先に処理したデータでエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部入金ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0605' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0605',
	'I',
	'同じ外部システムＣＤ、外部入金ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部入金ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0606' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0606',
	'W',
	'指定された口座と銀行の組み合わせが口座マスタに登録されていません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n口座：{3}\n銀行：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0607' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0607',
	'W',
	'指定された債権決済区分と入金方法の組み合わせが決済方法マスタに登録されていません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n債権決済区分：{3}\n入金方法：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0608' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0608',
	'W',
	'同一の入金が既に存在するため、取り込みができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部入金ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0609' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0609',
	'W',
	'対応する入金情報が複数件取得できたため、取り込みができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部入金ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0610' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0610',
	'W',
	'対応する入金情報が取得できないため、取り込みができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部入金ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0611' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0611',
	'W',
	'ロットＮＯが指定されていません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0612' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0612',
	'W',
	'サブロットＮＯが指定されていません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0613' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0613',
	'W',
	'品目マスタの手配ＮＯ１管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ１が必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0614' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0614',
	'W',
	'品目マスタの手配ＮＯ２管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ２が必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0615' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0615',
	'W',
	'品目マスタの手配ＮＯ３管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ３が必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0616' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0616',
	'W',
	'品目マスタの手配ＮＯ４管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ４が必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0617' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0617',
	'W',
	'計画外実績の新規登録では、出来高予定ＮＯ、工程指図ＮＯ、製造指図ＮＯ、製造指図改定番号を指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0618' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0618',
	'W',
	'計画外実績として出来高区分に副産品は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0619' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0619',
	'W',
	'計画外実績の新規登録では工数管理ＣＤが必須です。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0621' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0621',
	'W',
	'計画外実績としてロットＮＯ発番パタンが子品目ロット引継ぎの品目は登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0622' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0622',
	'W',
	'計画外実績としてサブロットＮＯ発番パタンが子品目サブロット引継ぎの品目は登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0623' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0623',
	'W',
	'計画外実績として製造品以外の品目は登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0624' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0624',
	'W',
	'計画外実績として外注品は登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}\n製造場所：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0625' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0625',
	'W',
	'品目マスタの手配ＮＯ１管理区分に「1.管理しない」が指定されているため、手配ＮＯ１は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0626' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0626',
	'W',
	'品目マスタの手配ＮＯ２管理区分に「1.管理しない」が指定されているため、手配ＮＯ２は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0627' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0627',
	'W',
	'品目マスタの手配ＮＯ３管理区分に「1.管理しない」が指定されているため、手配ＮＯ３は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0628' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0628',
	'W',
	'品目マスタの手配ＮＯ４管理区分に「1.管理しない」が指定されているため、手配ＮＯ４は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0629' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0629',
	'W',
	'計画外実績として製造承認対象の品目は登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0630' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0630',
	'W',
	'計画外実績の新規登録では、打切をオンにできません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0631' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0631',
	'W',
	'同じ外部出来高実績ＮＯを持つ出来高実績ＩＦでエラーとなったため、取り込みできませんでした。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}\n外部出来高実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0632' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0632',
	'W',
	'入金登録区分に「登録不可」が指定されている入金方法では、入金情報を登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n入金方法：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0633' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0633',
	'W',
	'今回の取込対象データのなかに、外部システムＣＤ、外部入金ＮＯの組が重複しているデータが存在します。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部入金ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0634' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0634',
	'W',
	'「ＦＢ」以外の外部システム区分が指定されている外部システムからは取込みができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0635' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0635',
	'I',
	'オーダ受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0636' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0636',
	'I',
	'オーダ受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0637' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0637',
	'W',
	'オーダ受信ＩＦ取込処理でエラーが発生しました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメッセージＩＤ：{3}\nメッセージ：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0638' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0638',
	'W',
	'同じ外部システムＣＤ、外部品目オーダＮＯにおいて先に処理したデータでエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部品目オーダＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0639' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0639',
	'I',
	'同じ外部システムＣＤ、外部品目オーダＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部品目オーダＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0640' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0640',
	'W',
	'同一の工程オーダが既に存在するため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部品目オーダＮＯ：{4}\n外部工程オーダＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0641' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0641',
	'W',
	'対応する工程オーダが取得できなかったため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0642' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0642',
	'W',
	'対応するオーダ情報が複数件取得できたため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0643' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0643',
	'W',
	'同一の外部品目オーダＮＯを持つ他の工程オーダでエラーが発生したため、取り込みできませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0644' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0644',
	'W',
	'今回の取込対象データのなかに、外部品目オーダＮＯ、外部工程オーダＮＯの組が重複しているデータが存在します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0645' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0645',
	'W',
	'外部工程オーダＮＯに紐づかない工程オーダがあるため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部品目オーダＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0646' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0646',
	'W',
	'対応する工程オーダが複数件取得できたため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0647' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0647',
	'W',
	'品目オーダ区分には「製造」、「外注」のいずれかを指定してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部品目オーダＮＯ：{4}\n外部工程オーダＮＯ：{5}\n品目オーダ区分：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0648' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0648',
	'W',
	'対象の工程オーダの中で、品目工程マスタに存在しない工程ＣＤ、工程連番が含まれています。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部品目オーダＮＯ：{4}\n外部工程オーダＮＯ：{5}\n工程ＣＤ：{6}\n工程連番：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0649' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0649',
	'W',
	'必要な工程オーダが不足しています。品目工程マスタを確認してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部品目オーダＮＯ：{4}\n場所ＣＤ：{5}\n品目：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0650' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0650',
	'W',
	'同じ受注ＮＯに対する他の明細でエラーが発生したため、取り込むことができません。\nバッチログ確認で内容を確認してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n受注ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0651' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0651',
	'W',
	'品目単位マスタに存在しない単位は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n品目：{3}\n単位：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0652' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0652',
	'W',
	'同じ出荷元物流グループ、外部システムＣＤ、外部出荷実績ＮＯにおいて先に処理した出荷情報でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n出荷元物流グループ：{3}\n外部システムＣＤ：{4}\n外部出荷実績ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0653' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0653',
	'W',
	'受注時に指定された税ＣＤが税マスタに存在しないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n受注ＮＯ：{6}\n受注明細ＮＯ：{7}\n受注時の税：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0654' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0654',
	'W',
	'インボイスに指定された税ＣＤが税マスタに存在しないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\nインボイスＮＯ：{4}\nインボイス明細ＮＯ：{5}\n得意先注文ＮＯ：{6}\n得意先注文明細ＮＯ：{7}\nインボイスの税：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0655' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0655',
	'W',
	'納品書に指定された税ＣＤが税マスタに存在しないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n納品書ＮＯ：{4}\n納品書明細ＮＯ：{5}\n納品書の税：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0700' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0700',
	'I',
	'品目マスタ送信ＩＦ処理を開始します。\n外部システムＣＤ：{1}\nマスタ適用日：{2}\nワーキンググループＣＤ：{3}\n製造場所グループＣＤ：{4}\n連携スケジューラ区分：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0701' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0701',
	'I',
	'品目マスタ送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0702' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0702',
	'W',
	'必須項目が未入力です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0703' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0703',
	'W',
	'ＧＡのAPI呼び出しでエラーが発生しました。\n発注送信ＩＦ確認画面でエラーメッセージを確認してください。\nデータＮＯ：{1}\n発注ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0704' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0704',
	'W',
	'{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0705' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0705',
	'W',
	'複数の発注をまとめて送信した際に他の伝票でエラーが発生したため、ＧＡに反映できませんでした。\n発注一覧登録から未反映の発注を再送信してください。\nデータＮＯ：{1}\n発注ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0706' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0706',
	'I',
	'品目工程マスタ送信ＩＦ処理を開始します。\n外部システムＣＤ：{1}\nマスタ適用日：{2}\nワーキンググループＣＤ：{3}\n製造場所グループＣＤ：{4}\n工場物流倉庫ＣＤ：{5}\n場所ＣＤ：{6}\n連携スケジューラ区分：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0707' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0707',
	'I',
	'品目工程マスタ送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0708' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0708',
	'I',
	'品目詳細マスタ送信ＩＦ処理を開始します。\n外部システムCD：{1}\nマスタ適用日：{2}\nワーキンググループＣＤ：{3}\n製造場所グループＣＤ：{4}\n工場物流倉庫ＣＤ：{5}\n製造場所ＣＤ：{6}\n連携スケジューラ区分：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0709' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0709',
	'I',
	'品目詳細マスタ送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0710' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0710',
	'I',
	'ＢＯＭマスタ送信ＩＦ処理を開始します。\n外部システムCD：{1}\nマスタ適用日：{2}\nワーキンググループＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0711' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0711',
	'I',
	'ＢＯＭマスタ送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0712' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0712',
	'I',
	'場所マスタ送信ＩＦ処理を開始します。\n外部システムCD：{1}\nワーキンググループＣＤ：{2}\n工場物流倉庫：{3}\n場所：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0713' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0713',
	'I',
	'場所マスタ送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0714' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0714',
	'I',
	'稼働カレンダマスタ送信ＩＦ処理を開始します。\n外部システムCD：{1}\nマスタ適用日：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0715' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0715',
	'I',
	'稼働カレンダマスタ送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0716' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0716',
	'I',
	'臨時カレンダマスタ送信ＩＦ処理を開始します。\n外部システムＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0717' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0717',
	'I',
	'臨時カレンダマスタ送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0718' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0718',
	'I',
	'入庫予定送信ＩＦ処理を開始します。\n外部システムＣＤ：{1}\nワーキンググループＣＤ：{2}\n製造場所グループＣＤ：{3}\n工場物流倉庫ＣＤ：{4}\n場所ＣＤ：{5}\n対象期間ＦＲＯＭ：{6}\n対象期間ＴＯ：{7}\n連携スケジューラ区分：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0719' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0719',
	'I',
	'入庫予定送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0720' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0720',
	'I',
	'出庫予定送信ＩＦ処理を開始します。\n外部システムＣＤ：{1}\nワーキンググループＣＤ：{2}\n製造場所グループＣＤ：{3}\n工場物流倉庫ＣＤ：{4}\n場所ＣＤ：{5}\n対象期間ＦＲＯＭ：{6}\n対象期間ＴＯ：{7}\n連携スケジューラ区分：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0721' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0721',
	'I',
	'出庫予定送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0722' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0722',
	'I',
	'在庫情報送信ＩＦ処理を開始します。\n外部システムＣＤ：{1}\nワーキンググループＣＤ：{2}\n製造場所グループＣＤ：{3}\n工場物流倉庫ＣＤ：{4}\n場所ＣＤ：{5}\n連携スケジューラ区分：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0723' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0723',
	'I',
	'在庫情報送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0724' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0724',
	'I',
	'日次需要送信ＩＦ処理を開始します。\n外部システムCD：{1}\nワーキンググループＣＤ：{2}\n工場物流倉庫：{3}\n場所：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0725' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0725',
	'I',
	'日次需要送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0726' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0726',
	'I',
	'オーダ送信ＩＦ処理を開始します。\n外部システムＣＤ：{1}\nワーキンググループＣＤ：{2}\n製造場所グループＣＤ：{3}\n工場物流倉庫ＣＤ：{4}\n製造場所ＣＤ：{5}\n対象期間ＦＲＯＭ：{6}\n対象期間ＴＯ：{7}\n未確定を含む：{8}\n連携スケジューラ区分：{9}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0727' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0727',
	'I',
	'オーダ送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0728' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0728',
	'I',
	'同じ発注ＮＯにおいて、先に処理したデータでエラーが発生したため、送信対象から除外しました。\nデータＮＯ：{1}\n発注ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0729' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0729',
	'W',
	'同じ発注ＮＯにおいて、他の発注送信処理でエラーが発生したため、ＧＡに反映できませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n発注ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0730' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0730',
	'I',
	'納入指示受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0731' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0731',
	'I',
	'納入指示受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0732' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0732',
	'W',
	'納入指示受信ＩＦ取込処理でエラーが発生しました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメッセージＩＤ：{3}\nメッセージ：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0733' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0733',
	'W',
	'同じ得意先、得意先注文ＮＯ、得意先注文明細ＮＯに対する他の納入指示の取り込み処理でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0734' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0734',
	'W',
	'対応する受注情報が複数件取得できたため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0735' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0735',
	'W',
	'対応する受注情報が取得できないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0736' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0736',
	'W',
	'受注明細が取消されているため、納入指示を取り込みできません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0737' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0737',
	'W',
	'同じ得意先、得意先注文ＮＯ、得意先注文明細ＮＯに対する納入指示に異なる注文改訂番号が設定されています。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n注文改訂番号：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0738' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0738',
	'W',
	'注文時の品目と異なる品目は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n注文時の品目：{6}\nＩＦデータの品目：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0739' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0739',
	'W',
	'納入指示受信ＩＦ取込処理でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメッセージＩＤ：{3}\nメッセージ：\n{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0741' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0741',
	'W',
	'受注明細の出荷指図区分が「ピッキングなし」であるため、納入指示を取り込みできません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0742' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0742',
	'W',
	'同じ得意先、得意先注文ＮＯ、得意先注文明細ＮＯにおいて先に処理したデータでエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0743' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0743',
	'W',
	'同じ得意先、得意先注文ＮＯ、得意先注文明細ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0744' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0744',
	'W',
	'注文時の単位と異なる単位は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n注文時の取引単位：{6}\nＩＦデータの取引単位：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0745' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0745',
	'W',
	'取引単位数量の小数部桁数が正しくありません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n取引単位：{6}\n取引単位数量：{7}\n小数部有効桁数：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0747' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0747',
	'W',
	'受注明細が打切されているため、納入指示を取り込みできません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0748' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0748',
	'W',
	'同一の得意先納入指示が既に存在するため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n得意先：{3}\n得意先注文ＮＯ：{4}\n得意先注文明細ＮＯ：{5}\n得意先納入指示ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0750' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0750',
	'I',
	'請求受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0751' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0751',
	'I',
	'請求受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0752' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0752',
	'W',
	'同じ請求元、請求書ＮＯにおいて先に処理したデータでエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n請求元ＣＤ：{3}\n請求書ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0753' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0753',
	'W',
	'同じ請求元、請求書ＮＯにおいて外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n請求元ＣＤ：{3}\n請求書ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0754' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0754',
	'W',
	'同じ請求元、請求書ＮＯに対する他の請求の取り込み処理でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n請求元ＣＤ：{3}\n請求書ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0755' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0755',
	'W',
	'請求受信ＩＦ取込処理でエラーが発生しました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメッセージＩＤ：{3}\nメッセージ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0756' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0756',
	'W',
	'データ更新区分が新規以外のデータを取り込むことはできません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n請求元ＣＤ：{3}\n請求書ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0757' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0757',
	'W',
	'今回の取込対象データのなかに、請求元ＣＤ、請求書ＮＯ、請求明細ＮＯの組が重複しているデータが存在します。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n請求元ＣＤ：{3}\n請求書ＮＯ：{4}\n請求明細ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0758' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0758',
	'W',
	'同じ外部システムデータＮＯ、請求元ＣＤ、請求書ＮＯのなかで、ヘッダ項目値が一致していないデータが存在します。	\nデータＮＯ：{1}	\nデータ行ＮＯ：{2}	\n請求元ＣＤ：{3}	\n請求書ＮＯ：{4}	');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0759' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0759',
	'W',
	'発生処理：{1}\n発生日時：{2}\n会社：{3}\n請求元ＣＤ：{4}\nエラー内容：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0760' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0760',
	'W',
	'オーダ洗い替えＦＬＧがオンの場合、データ更新区分が新規以外のデータを同時に取り込むことができません。\n取り込み対象のデータのデータ更新区分を新規のみにしてください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部品目オーダＮＯ：{4}\n外部工程オーダＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0761' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0761',
	'I',
	'請求送信ＩＦデータを作成しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0762' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0762',
	'W',
	'発生処理：{1}\n発生日時：{2}\n会社：{3}\n請求先ＣＤ：{4}\n請求書ＮＯ：{5}\nエラー内容：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0763' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0763',
	'W',
	'ＩＦ通信ルールマスタの設定が不正です。ＩＦ通信ルールマスタの以下設定を確認してください。\n・FILE_USE_HEADINGが「true」であること\n・SEND_FILE_GRPが「2」であること\nＩＦ処理区分：{1}\n外部システムＣＤ：{2}\nデータNO：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0764' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0764',
	'W',
	'送信変換処理中にエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0901' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0901',
	'I',
	'以下の引数は、指定の連携スケジューラ区分では無効です。\nそのため指定された引数の条件は無視されました。\n連携スケジューラ区分：{1}\n引数名：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0902' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0902',
	'W',
	'更新対象となる品目オーダ情報が存在しないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部品目オーダＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0903' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0903',
	'W',
	'更新対象となる品目オーダ情報の品目オーダ状況区分が「保存」ではないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部品目オーダＮＯ：{4}\n品目オーダ状況区分：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0904' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0904',
	'W',
	'更新対象となる品目オーダ情報はオーダ送信されていないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部品目オーダＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0905' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0905',
	'W',
	'他のオーダ受信ＩＦデータでエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部品目オーダＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0906' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0906',
	'W',
	'スケジューラ凍結対象の品目オーダにおいて、\n紐づく工程オーダの中に凍結前状態の工程オーダが含まれているため、\n品目オーダが確定できませんでした。\n品目オーダＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0907' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0907',
	'I',
	'工程指図実績送信ＩＦ処理を開始します。\n外部システムＣＤ：{1}\nワーキンググループＣＤ：{2}\n製造場所グループＣＤ：{3}\n工場物流倉庫ＣＤ：{4}\n製造場所ＣＤ：{5}\n対象期間ＦＲＯＭ：{6}\n対象期間ＴＯ：{7}\n連携スケジューラ区分：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0908' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0908',
	'I',
	'工程指図実績送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0909' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0909',
	'W',
	'指定された連携スケジューラ区分が無効です。\n連携スケジューラ区分に「2：FLEXSCHE」を指定してください。\n連携スケジューラ区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0910' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0910',
	'I',
	'処理を開始します。（スケジューラＩＦファイル連携サービス実行）');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0911' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0911',
	'W',
	'連携スケジューラ区分は「FLEXSCHE」を設定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0912' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0912',
	'W',
	'指定されたＩＦ処理区分は実行対象外です。\nＩＦ処理区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0913' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0913',
	'W',
	'リソースに連携対象のパスが登録されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0914' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0914',
	'W',
	'連携対象のパスが存在しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0915' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0915',
	'W',
	'リソースに連携対象のファイルが登録されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0916' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0916',
	'W',
	'連携対象のファイルが存在しません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0917' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0917',
	'W',
	'ＩＦ通信ルールマスタにローカルディレクトリが設定されていません。\n外部システムＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0918' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0918',
	'I',
	'指定されたフォルダに以下のファイルが存在しないため、送信処理をスキップしました。\nファイル名：{1}\nフォルダ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0919' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0919',
	'I',
	'処理を終了しました。（スケジューラＩＦファイル連携サービス実行）');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0920' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0920',
	'I',
	'送信処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0921' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0921',
	'I',
	'受信処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0922' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0922',
	'W',
	'連携スケジューラ区分が「FLEXSCHE」、オーダ区分が「外注」かつ外注スケジューリング許可ＦＬＧがオフの場合は、各種日付情報は更新できません。\nそのため、工程オーダ情報の「工程着手予定日時」または品目オーダ情報の「使用可能予定日」が、取込前後で変更されるデータは取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部品目オーダＮＯ：{4}\n工程着手予定日時：{5}\n使用可能予定日：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0923' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0923',
	'I',
	'オーダ引当送信ＩＦ処理を開始します。\n外部システムＣＤ：{1}\nワーキンググループＣＤ：{2}\n製造場所グループＣＤ：{3}\n工場物流倉庫ＣＤ：{4}\n製造場所ＣＤ：{5}\n対象期間ＦＲＯＭ：{6}\n対象期間ＴＯ：{7}\n連携スケジューラ区分：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0924' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0924',
	'I',
	'オーダ引当送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0925' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0925',
	'I',
	'品目詳細ＢＯＭマスタ送信ＩＦ処理を開始します。\n外部システムＣＤ：{1}\nマスタ適用日：{2}\nワーキンググループＣＤ：{3}\n製造場所グループＣＤ：{4}\n工場物流倉庫ＣＤ：{5}\n製造場所ＣＤ：{6}\n連携スケジューラ区分：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0926' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0926',
	'I',
	'品目詳細BOMマスタ送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0927' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0927',
	'I',
	'実績数量送信ＩＦ処理を開始します。\n外部システムＣＤ：{1}\nワーキンググループＣＤ：{2}\n製造場所グループＣＤ：{3}\n工場物流倉庫ＣＤ：{4}\n製造場所ＣＤ：{5}\n対象期間ＦＲＯＭ：{6}\n対象期間ＴＯ：{7}\n連携スケジューラ区分：{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0928' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0928',
	'I',
	'実績数量送信ＩＦ処理が終了しました。\n処理対象：{1}\n登録件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0929' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0929',
	'W',
	'新規登録と同時に打切はできません。打切ＦＬＧをオフにして取り込んでください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0930' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0930',
	'W',
	'更新対象となる品目オーダ情報の品目と取込対象データの品目が一致していないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部品目オーダＮＯ：{4}\n品目：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0931' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0931',
	'W',
	'同じ製造指図に紐づく異なるＩＦ処理区分または外部実績ＮＯのレコードでエラーが発生しました。\n「MSLAL0095」または「MSLAL0096」のエラーが発生している他のレコードを確認してください。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}\n製造指図ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0932' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0932',
	'W',
	'同じ製造指図に紐づく工程実績の取込処理でエラーが発生しました。エラーが発生している工程実績のレコードを確認してください。\nＩＦ処理区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}\n製造指図ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0933' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0933',
	'W',
	'売上日における税が税マスタに存在しないため、取り込むことができません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n売上日における税ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL0934' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL0934',
	'W',
	'税チェック対象の場合、売上日における税と異なる税は指定できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n売上日における税ＣＤ：{3}\nＩＦデータの税率に対応する税ＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1001',
	'I',
	'検査実績受信ＩＦ取込処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1002',
	'I',
	'検査実績受信ＩＦ取込処理が終了しました。\n処理対象：{1}\n登録件数：{2}\nエラー件数：{3}\nスキップ件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1003',
	'W',
	'データ更新区分が新規の場合、判定のみ取込ＦＬＧをオンにできないため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n検査ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1004',
	'W',
	'データ更新区分が更新または削除であり、かつ外部検査実績明細ＮＯまたは外部検査抜取実績ＮＯが指定されたレコードでは、判定のみ取込ＦＬＧをオンにできないため、取り込めません。\nデータ更新区分：{1}\nデータＮＯ：{2}\nデータ行ＮＯ：{3}\n外部検査実績ＮＯ：{4}\n外部検査実績明細ＮＯ：{5}\n外部検査抜取実績ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1005',
	'W',
	'外部検査実績明細ＮＯと外部検査抜取実績ＮＯが両方指定されているため、取り込めません。いずれか片方の値のみを設定してください。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部検査実績明細ＮＯ：{3}\n外部検査抜取実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1006',
	'W',
	'データ更新区分が新規であり、かつ外部検査実績明細ＮＯまたは外部検査抜取実績ＮＯが既に登録済みであるため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部検査実績明細ＮＯ：{4}\n外部検査抜取実績ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1007',
	'W',
	'指定された外部検査実績ＮＯは既に登録済みであり、かつ外部検査実績明細ＮＯまたは外部検査抜取実績ＮＯがいずれも未指定のため、データ更新区分が新規のデータは、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部検査実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1008',
	'W',
	'指定された外部システムＣＤおよび外部検査実績ＮＯに紐づく検査実績が取得できないため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部検査実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1009',
	'W',
	'指定された外部システムＣＤおよび外部検査実績明細ＮＯに紐づく検査実績明細が取得できないため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部検査実績明細ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1010',
	'W',
	'指定された外部システムＣＤおよび外部検査抜取実績ＮＯに紐づく検査抜取明細が取得できないため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部検査抜取実績ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1011',
	'W',
	'指定された検査ＮＯが、外部検査実績ＮＯから取得した検査ＮＯと一致しないため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n指定された検査ＮＯ：{3}\n外部検査実績ＮＯ：{4}\n取得した検査ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1012',
	'W',
	'指定された検査ＮＯが、外部検査実績明細ＮＯから取得した検査ＮＯと一致しないため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n指定された検査ＮＯ：{3}\n外部検査実績明細ＮＯ:{4}\n取得した検査ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1013',
	'W',
	'指定された検査ＮＯが、外部検査抜取実績ＮＯから取得した検査ＮＯと一致しないため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n指定された検査ＮＯ：{3}\n外部検査抜取実績ＮＯ：{4}\n取得した検査ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1014',
	'W',
	'指定された外部検査実績ＮＯから取得した検査実績のヘッダ項目が、ＩＦレコードのヘッダ項目の値と一致しないため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部検査実績ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1015',
	'W',
	'指定された検査ＮＯから取得した検査指図の検査方法区分が、外部検査実績明細ＮＯまたは外部検査抜取実績ＮＯの組み合わせと一致しないため、取り込めません。検査方法区分に沿ったいずれかの項目のみを指定してください。\n全数検査の場合：外部検査実績明細ＮＯ、全数検査以外の場合：外部検査抜取実績ＮＯを指定する必要があります。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n検査ＮＯ：{3}\n検査方法区分：{4}\n外部検査実績明細ＮＯ：{5}\n外部検査抜取実績ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1016',
	'W',
	'同じ検査ＮＯにおいて先に処理したデータでエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n検査ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1017',
	'W',
	'同じ検査ＮＯにおいて、外部システムデータＮＯが大きいデータを先に処理しているためスキップしました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n検査ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1018',
	'W',
	'検査実績が未完了のため、判定を登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n検査ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1019',
	'W',
	'以下の情報から、対応する現状在庫の情報を取得できないため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n検査予定ＮＯ：{3}\n在庫場所ＣＤ：{4}\n在庫棚・ラインＣＤ：{5}\n荷姿単位ＣＤ：{6}\n基準単位ＣＤ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1020',
	'W',
	'同じ外部システムＣＤ、データＮＯ、データ更新区分、検査ＮＯにおいて、判定のみ取込ＦＬＧのオン・オフは混在させられないため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部システムデータＮＯ：{4}\nデータ更新区分：{5}\n検査ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1021',
	'W',
	'同じ外部システムＣＤ、データＮＯ、データ更新区分、検査ＮＯにおいて、外部検査実績明細実績ＮＯまたは外部検査抜取実績ＮＯの指定あり・指定なしは混在させられないため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部システムデータＮＯ：{4}\nデータ更新区分：{5}\n検査ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1022',
	'W',
	'検査実績受信ＩＦ取込処理でエラーが発生しました。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\nメッセージＩＤ：{3}\nメッセージ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1023',
	'W',
	'検査ＮＯに紐づく検査予定の中に、指定された検査予定ＮＯが見つからないため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n検査ＮＯ：{3}\n検査予定ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1024',
	'W',
	'検査承認担当者ではないため、判定を登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n判定者ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1025',
	'W',
	'検査承認機能が無効のため、判定を登録できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1026',
	'W',
	'検査承認対象外のため、判定を登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n検査ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1027',
	'W',
	'同じ外部システムＣＤ、外部システムデータＮＯ、データ更新区分、外部検査実績ＮＯのなかで、ヘッダ項目値を混在させられないため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3} \n外部システムデータＮＯ：{4} \nデータ更新区分：{5}\n外部検査実績ＮＯ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1028',
	'W',
	'同一取込単位内で、外部検査実績ＮＯが重複しているため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部システムデータＮＯ：{4}\nデータ更新区分：{5}\n検査ＮＯ：{6}\n外部検査実績ＮＯ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1029',
	'W',
	'同一取込単位内で、外部検査実績明細ＮＯが重複しているため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部システムデータＮＯ：{4}\nデータ更新区分：{5}\n検査ＮＯ：{6}\n外部検査実績明細ＮＯ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1030',
	'W',
	'同一取込単位内で、外部検査抜取実績ＮＯが重複しているため、取り込めません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n外部システムＣＤ：{3}\n外部システムデータＮＯ：{4}\nデータ更新区分：{5}\n検査ＮＯ：{6}\n外部検査抜取実績ＮＯ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1031',
	'W',
	'同じ検査ＮＯに対する他の検査実績の取り込み処理でエラーが発生したため、取り込みできませんでした。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n検査ＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLAL1032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLAL1032',
	'W',
	'移動が完了しているため、新規で移動実績を登録できません。\nデータＮＯ：{1}\nデータ行ＮＯ：{2}\n移動指図ＮＯ：{3}\n移動引当状況ＮＯ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLBP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLBP0001',
	'W',
	'');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLBL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLBL0001',
	'W',
	'');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCB0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCB0001',
	'W',
	'ＩＦ処理区分のbi_opeの値が設定されていません。\nＩＦ処理区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCB0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCB0002',
	'W',
	'ＩＦ処理区分のbi_opeの値が不正です。\nＩＦ処理区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCB0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCB0003',
	'W',
	'指定されたＩＦ処理区分は存在しません。\nＩＦ処理区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCB0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCB0004',
	'W',
	'指定されたＩＦ処理区分は実行対象外です。\nＩＦ処理区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCB0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCB0005',
	'I',
	'ＢＩ Ｌｉｎｋバッチ処理を開始します。\nＩＦ処理区分：{1}\n外部システムＣＤ：{2}\n抽出年月日ＦＲＯＭ：{3}\n抽出年月日ＴＯ：{4}\n滞留比較日：{5}\n滞留基準日数：{6}\n会社ＣＤ：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCB0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCB0006',
	'I',
	'ＢＩ Ｌｉｎｋバッチ処理を終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0001',
	'W',
	'ＩＦ処理区分が不正です。\nＩＦ処理区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0002',
	'I',
	'受払予定送信ＩＦ処理を開始します。\n会社ＣＤ：{1}\nＩＦ処理区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0003',
	'I',
	'受払予定送信ＩＦ処理が終了しました。\n会社ＣＤ：{1}\n処理対象：{2}\n新規件数：{3}\nエラー件数：{4}\n削除件数：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0004',
	'I',
	'月末在庫送信ＩＦ処理を開始します。\n会社ＣＤ：{1}\nＩＦ処理区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0005',
	'I',
	'月末在庫送信ＩＦ処理が終了しました。\n会社ＣＤ：{1}\n処理対象：{2}\n新規件数：{3}\nエラー件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0006',
	'I',
	'受払実績送信ＩＦ処理を開始します。\n会社ＣＤ：{1}\nＩＦ処理区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0007',
	'I',
	'受払実績送信ＩＦ処理が終了しました。\n会社ＣＤ：{1}\n処理対象：{2}\n新規件数：{3}\nエラー件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0008',
	'I',
	'品目オーダ情報送信ＩＦ処理を開始します。\n会社ＣＤ：{1}\nＩＦ処理区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0009',
	'I',
	'品目オーダ情報送信ＩＦ処理が終了しました。\n会社ＣＤ：{1}\n処理対象：{2}\n新規件数：{3}\nエラー件数：{4}\n削除件数：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0010',
	'I',
	'出荷進捗送信ＩＦ処理を開始します。\n会社ＣＤ：{1}\nＩＦ処理区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0011',
	'I',
	'出荷進捗送信ＩＦ処理が終了しました。\n会社ＣＤ：{1}\n処理対象：{2}\n新規件数：{3}\nエラー件数：{4}\n削除件数：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0012',
	'I',
	'滞留在庫情報送信ＩＦ処理を開始します。\n会社ＣＤ：{1}\nＩＦ処理区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0013',
	'I',
	'滞留在庫情報送信ＩＦ処理が終了しました。\n会社ＣＤ：{1}\n処理対象：{2}\n新規件数：{3}\nエラー件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0014',
	'W',
	'バッチログＮＯ、ログサブキー１、ログサブキー２の設定に失敗したデータがあります。\n送信確認画面でデータを確認してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0015',
	'I',
	'受払予定送信ＩＦ処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0016',
	'I',
	'受払予定送信ＩＦ処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0017',
	'I',
	'月末在庫送信ＩＦ処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0018',
	'I',
	'月末在庫送信ＩＦ処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0019',
	'I',
	'受払実績送信ＩＦ処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0020',
	'I',
	'受払実績送信ＩＦ処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0021',
	'I',
	'品目オーダ情報送信ＩＦ処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0022',
	'I',
	'品目オーダ情報送信ＩＦ処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0023',
	'I',
	'出荷進捗送信ＩＦ処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0024',
	'I',
	'出荷進捗送信ＩＦ処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0025',
	'I',
	'滞留在庫情報送信ＩＦ処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0026',
	'I',
	'滞留在庫情報送信ＩＦ処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0101',
	'I',
	'入荷進捗送信ＩＦ処理を開始します。\n会社ＣＤ：{1}\nＩＦ処理区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0102',
	'I',
	'入荷進捗送信ＩＦ処理が終了しました。\n会社ＣＤ：{1}\n処理対象：{2}\n新規件数：{3}\nエラー件数：{4}\n削除件数：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0103',
	'I',
	'検査実績送信ＩＦ処理を開始します。\n会社ＣＤ：{1}\nＩＦ処理区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0104',
	'I',
	'検査実績送信ＩＦ処理が終了しました。\n会社ＣＤ：{1}\n処理対象：{2}\n新規件数：{3}\nエラー件数：{4}\n削除件数：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0105' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0105',
	'I',
	'入荷進捗送信ＩＦ処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0106' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0106',
	'I',
	'入荷進捗送信ＩＦ処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0107' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0107',
	'I',
	'検査実績送信ＩＦ処理を開始します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSLCL0108' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSLCL0108',
	'I',
	'検査実績送信ＩＦ処理が終了しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUAL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUAL0006',
	'W',
	'品目詳細マスタに、適用日・品目・ワーキンググループ・製造場所に対応する構成パタンとして登録されていません。\n適用日：{1}\n品目：{2}\nワーキンググループＣＤ：{3}\n製造場所ＣＤ：{4}\n発注先ＣＤ：{5}\nメーカＣＤ：{6}\n依頼先場所ＣＤ：{7}\n{8}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUAL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUAL0007',
	'W',
	'場所マスタに有効な発注先として登録されていません。\n場所ＣＤ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUAL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUAL0008',
	'W',
	'品目工程マスタに、適用日・品目・工程パタン・工程ＣＤ・工程連番に対応する場所として登録されていません。\n適用日：{1}\n品目：{2}\n工程パタン：{3}\n工程ＣＤ：{4}\n工程連番：{5}\n{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUBP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUBP0001',
	'W',
	'モード指定メソッド（setSnoMode）を実装してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUBP0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUBP0002',
	'W',
	'画面遷移可能な行が選択されていません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUBL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUBL0001',
	'W',
	'');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCP0001',
	'W',
	'期間は93日以内になるように指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCP0002',
	'W',
	'期間は60ヶ月以内になるように指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCP0003',
	'W',
	'買掛締年月が取得できませんでした。仕入締および支払締を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCP0004',
	'W',
	'売掛締年月が取得できませんでした。売上締および入金締を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCP0005',
	'W',
	'支払締年月が取得できませんでした。支払締を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCP0006',
	'W',
	'仕入締年月が取得できませんでした。仕入締を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCP0007',
	'W',
	'入金締年月が取得できませんでした。入金締を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCP0008',
	'W',
	'売上締年月が取得できませんでした。売上締を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCP0009',
	'W',
	'在庫締年月が取得できませんでした。在庫締を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCP0010',
	'W',
	'親品目を指定した場合は、ワーキンググループ、構成パタン、マスタ適用日も指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCP0101',
	'W',
	'期間は3年以内になるように指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCP0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCP0102',
	'W',
	'期間は498日以内になるように指定してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCL0001',
	'W',
	'ログインユーザに対して、担当者権限マスタにおいて必要な権限が登録されていないため、処理できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCL0002',
	'W',
	'買掛締年月が取得できませんでした。仕入締および支払締を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCL0003',
	'W',
	'売掛締年月が取得できませんでした。売上締および入金締を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCL0004',
	'W',
	'支払締年月が取得できませんでした。支払締を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCL0005',
	'W',
	'仕入締年月が取得できませんでした。仕入締を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCL0006',
	'W',
	'入金締年月が取得できませんでした。入金締を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCL0007',
	'W',
	'売上締年月が取得できませんでした。売上締を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCL0008',
	'W',
	'在庫締年月が取得できませんでした。在庫締を行ってください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCL0009',
	'W',
	'品目マスタの手配ＮＯ１管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ１が必須です。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCL0010',
	'W',
	'品目マスタの手配ＮＯ２管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ２が必須です。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCL0011',
	'W',
	'品目マスタの手配ＮＯ３管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ３が必須です。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCL0012',
	'W',
	'品目マスタの手配ＮＯ４管理区分に「2.管理する（必須）」が指定されているため、手配ＮＯ４が必須です。\n品目：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCL0020',
	'W',
	'ヘッダ項目にエラーが存在します。エラーの内容は{1}行目を参照してください。\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MSUCL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MSUCL0021',
	'W',
	'同一ヘッダに紐づく他の明細行にエラーが存在します。\n他の明細の行番号：{1}\n{2}');
