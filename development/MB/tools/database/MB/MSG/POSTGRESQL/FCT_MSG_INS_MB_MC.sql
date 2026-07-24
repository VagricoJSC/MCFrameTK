DELETE FROM FCT_MSG WHERE MSGID = 'MBUAL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBUAL0001',
	'W',
	'自動仕訳履歴テーブルに仕訳グループＮＯが登録されていません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBUCP0058W' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBUCP0058W',
	'W',
	'{1}の値が指定できませんでした。\n値：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBUCP0059W' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBUCP0059W',
	'W',
	'{1}の値が指定できませんでした。\n値：{2}\n行：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBUCP0060W' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBUCP0060W',
	'W',
	'テンプレート名が重複しています。\nテンプレート名：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBUCP0061W' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBUCP0061W',
	'W',
	'テンプレート情報の設定に失敗しました。処理を中断します。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBUDP0012W' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBUDP0012W',
	'W',
	'登録できませんでした。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL0001',
	'W',
	'承認情報が存在しません。\n承認ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL0002',
	'W',
	'承認情報が存在しません。\n承認ＮＯ：{1}\n承認ＮＯ連番：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL0003',
	'W',
	'承認情報が存在しません。\n承認ＮＯ：{1}\n承認ＮＯ連番：{2}\n承認役割ＣＤ：{3}\n主担当者ＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL0004',
	'W',
	'承認情報が取り消されています。\n承認ＮＯ：{1}\n承認ＮＯ連番：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL0005',
	'W',
	'承認情報が更新不可に指定されています。\n承認ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL0006',
	'W',
	'承認情報が更新不可に指定されています。\n承認ＮＯ：{1}\n承認ＮＯ連番：{2}\n承認役割ＣＤ：{3}\n主担当者ＣＤ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL0007',
	'W',
	'承認されていないため、次処理を行うことができません。\n承認ＮＯ：{1}\n承認機能区分：{2}\n承認依頼元参照ＮＯ１：{3}\n承認依頼元参照ＮＯ２：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL0008',
	'W',
	'承認情報が取消不可に指定されています。\n承認ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL0009',
	'W',
	'同一承認ＮＯで複数の承認順序を一度に更新できません。\n承認ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL0010',
	'W',
	'同一承認ＮＯで承認と却下の双方を一度に行うことはできません。\n承認ＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL0011',
	'W',
	'承認明細状況区分が不正です。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL1001',
	'I',
	'主担当の承認依頼が登録されました。\n承認機能区分名：{1}\n取引先名：{2}\n業務担当者名：{3}\n登録担当者名：{4}\n通貨：{5}\n金額：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL1002',
	'I',
	'副担当の承認依頼が登録されました。\n承認機能区分名：{1}\n取引先名：{2}\n業務担当者名：{3}\n登録担当者名：{4}\n通貨：{5}\n金額：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL1003',
	'I',
	'承認依頼が更新されました。\n承認機能区分名：{1}\n承認ＮＯ：{2}\n取引先名：{3}\n業務担当者名：{4}\n登録担当者名：{5}\n通貨：{6}\n金額：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL1004',
	'I',
	'承認依頼が承認されました。\n承認機能区分名：{1}\n承認ＮＯ：{2}\n承認依頼元ＮＯ１：{3}\n承認依頼元ＮＯ２：{4}\n取引先名：{5}\n通貨：{6}\n金額：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL1005',
	'I',
	'承認依頼が却下されました。\n承認機能区分名：{1}\n承認ＮＯ：{2}\n承認依頼元ＮＯ１：{3}\n承認依頼元ＮＯ２：{4}\n取引先名：{5}\n通貨：{6}\n金額：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL1006',
	'I',
	'承認依頼の承認が取り消されました。\n承認機能区分名：{1}\n承認ＮＯ：{2}\n承認依頼元ＮＯ１：{3}\n承認依頼元ＮＯ２：{4}\n取引先名：{5}\n通貨：{6}\n金額：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL1007',
	'I',
	'承認依頼の却下が取り消されました。\n承認機能区分名：{1}\n承認ＮＯ：{2}\n承認依頼元ＮＯ１：{3}\n承認依頼元ＮＯ２：{4}\n取引先名：{5}\n通貨：{6}\n金額：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL1008',
	'I',
	'主担当の承認依頼が代理で承認されました。\n承認機能区分名：{1}\n承認ＮＯ：{2}\n取引先名：{3}\n業務担当者名：{4}\n登録担当者名：{5}\n通貨：{6}\n金額：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL1009',
	'I',
	'主担当の承認依頼が代理で却下されました。\n承認機能区分名：{1}\n承認ＮＯ：{2}\n取引先名：{3}\n業務担当者名：{4}\n登録担当者名：{5}\n通貨：{6}\n金額：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL1010',
	'I',
	'主担当の承認依頼の承認が代理で取り消されました。\n承認機能区分名：{1}\n承認ＮＯ：{2}\n取引先名：{3}\n業務担当者名：{4}\n登録担当者名：{5}\n通貨：{6}\n金額：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAL1011',
	'I',
	'主担当の承認依頼の却下が代理で取り消されました。\n承認機能区分名：{1}\n承認ＮＯ：{2}\n取引先名：{3}\n業務担当者名：{4}\n登録担当者名：{5}\n通貨：{6}\n金額：{7}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAP0001',
	'W',
	'承認機能ＣＤが不正です。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBAP0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBAP0002',
	'I',
	'未承認伝票があります。表示しますか？\n主担当件数：{1}\n副担当件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0001',
	'W',
	'会計ＬＩＮＫプログラムがインストールされていないため処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0002',
	'W',
	'データ状況区分が「2.仕訳作成済み」の場合のみ送信できます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0003',
	'W',
	'データ状況区分が「3.送信済み」の場合のみ取り消すことができます。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0004',
	'W',
	'仕訳グループＮＯに紐づく仕訳送信ＩＦのデータがすべて未処理の場合のみ取り消すことができます。\n仕訳グループＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0005',
	'W',
	'データ状況区分が「3.送信済み」の場合、削除できません。\n{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0006',
	'W',
	'次の項目が重複したＩＦレコードが複数存在しています。\n不要なレコードの取込対象をオフとしてください。\nデータ行ＮＯ：{1}\n項目：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0007',
	'W',
	'勘定科目マスタが取得できませんでした。\n勘定科目ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0008',
	'I',
	'データＮＯ：{1}\nデータ件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0009',
	'W',
	'手形理由マスタが取得できませんでした。\nデータＮＯ：{1}\n手形理由ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0010',
	'W',
	'会計部門マスタから伝票グループＩＤを取得できませんでした。\nデータＮＯ：{1}\n会計部門ＣＤ：{2}\n手形理由ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0011',
	'I',
	'データ件数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0012',
	'I',
	'処理を開始しました。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0013',
	'I',
	'処理が終了しました。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0014',
	'W',
	'支払依頼科目マスタを取得できませんでした。\nデータＮＯ：{1}\n支払債務区分：{2}\n取引通貨ＣＤ：{3}\n国外取引区分：{4}\n買掛先ＣＤ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0015',
	'W',
	'会計部門マスタから伝票グループＩＤを取得できませんでした。\nデータＮＯ：{1}\n会計部門ＣＤ：{2}\n支払債務区分：{3}\n取引通貨ＣＤ：{4}\n国外取引区分：{5}\n買掛先ＣＤ：{6}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0016',
	'W',
	'集計ＣＤ{1}を使用する科目ですが、ＮＵＬＬとなるレコードが存在しています。\nデータＮＯ：{2}\n勘定科目ＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0017',
	'W',
	'プロジェクトを使用する科目ですが、プロジェクトがＮＵＬＬとなるレコードが存在しています。\nデータＮＯ：{1}\n勘定科目ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0018',
	'W',
	'集計ＣＤに設定しようとしましたが、桁数が大きいため設定できません。\n設定項目区分：{1} -> 集計項目区分：{2}\nデータＮＯ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBL0101',
	'W',
	'仕訳グループＮＯに紐づく仕訳送信ＩＦのデータがすべて、未処理またはエラーのいずれかの場合のみ取り消すことができます。\n仕訳グループＮＯ：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0001',
	'I',
	'処理を開始しました。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0002',
	'I',
	'処理が終了しました。{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0003',
	'W',
	'対象となるデータは処理中のため処理できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0004',
	'W',
	'エラーが発生しました。ログを確認してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0005',
	'W',
	'対象の仕訳パタンで、貸借の金額が一致していません。\n仕訳パタンＣＤ：{1}\n借方金額：{2}\n貸方金額：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0006',
	'W',
	'会計理由科目設定マスタを使用する仕訳パタンですが、対応する仕訳グループもしくは会計理由がマスタに設定されていません。\n仕訳パタンＣＤ：{1}\n連番：{2}\n会計理由ＣＤ：{3}\n仕訳グループ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0007',
	'W',
	'品目仕訳科目設定マスタを使用する仕訳パタンですが、対応する仕訳グループもしくは品目仕訳がマスタに設定されていません。\n仕訳パタンＣＤ：{1}\n連番：{2}\n品目仕訳ＣＤ：{3}\n仕訳グループ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0008' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0008',
	'W',
	'口座科目設定マスタを使用する仕訳パタンですが、対応する仕訳グループもしくは口座がマスタに設定されていません。\n仕訳パタンＣＤ：{1}\n連番：{2}\n口座ＣＤ：{3}\n仕訳グループ：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0009',
	'W',
	'自動仕訳パタンマスタもしくは対応する科目設定マスタに無効な値が設定されています。\n仕訳パタンＣＤ：{1}\n連番：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0010',
	'W',
	'勘定科目マスタに存在していない勘定科目が設定されています。\n仕訳パタンＣＤ：{1}\n連番：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0011',
	'W',
	'金額区分が無効です。自動仕訳パタンマスタもしくは対応する科目設定マスタを確認してください。\n仕訳パタンＣＤ：{1}\n連番：{2}\n金額区分：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0012',
	'W',
	'標準単価情報を取得できませんでした。標準単価マスタを確認してください。\n期：{1}\n品目：{2}\nワーキンググループＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0013',
	'W',
	'補助科目を使用する勘定科目ですが、補助科目がＮＵＬＬとなるレコードが存在しています。\n勘定科目ＣＤ：{1}\n仕訳パタンＣＤ：{2}\n連番：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0014',
	'W',
	'取引先を使用する科目ですが、取引先がＮＵＬＬとなるレコードが存在しています。\n勘定科目ＣＤ：{1}\n仕訳パタンＣＤ：{2}\n連番：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0015',
	'W',
	'借方部門もしくは貸方部門がＮＵＬＬとなるため設定できません。当該仕訳パタンの借方・貸方部門区分を確認してください。\n会計伝票区分：{1}\n仕訳パタンＣＤ：{2}\n連番：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0016',
	'W',
	'担当者を使用する科目ですが、担当者がＮＵＬＬとなるレコードが存在しています。\n勘定科目ＣＤ：{1}\n仕訳パタンＣＤ：{2}\n連番：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0017',
	'W',
	'口座を使用する科目ですが、口座がＮＵＬＬとなるレコードが存在しています。\n勘定科目ＣＤ：{1}\n仕訳パタンＣＤ：{2}\n連番：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0018',
	'W',
	'プロジェクトを使用する科目ですが、プロジェクトがＮＵＬＬとなるレコードが存在しています。\n勘定科目ＣＤ：{1}\n仕訳パタンＣＤ：{2}\n連番：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0019',
	'W',
	'集計ＣＤ{1}を使用する科目ですが、ＮＵＬＬとなるレコードが存在しています。\n勘定科目ＣＤ：{2}\n仕訳パタンＣＤ：{3}\n連番：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0020',
	'W',
	'対象の会計伝票区分、自動仕訳キーで、有効な自動仕訳マスタが１件も登録されていません。\n会計伝票区分：{1}\n自動仕訳キーＣＤ：{2}\n対象日：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0021',
	'W',
	'対象の会計伝票区分、自動仕訳キーで、仕訳パタンが登録してありますが、条件に一致する仕訳パタンが存在しないため、仕訳結果を出力できません。\n会計伝票区分：{1}\n自動仕訳キーＣＤ：{2}\n自動仕訳グループ：{3}\n品目：{4}\n伝票ＮＯ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0022' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0022',
	'W',
	'自動仕訳マスタの伝票グループＩＤが設定されていません。\n会計伝票区分：{1}\n自動仕訳キーＣＤ：{2}\n仕訳パタンＣＤ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0023' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0023',
	'W',
	'集計ＣＤに設定しようとしましたが、桁数が大きいため設定できません。\n設定項目区分：{1} -> 集計項目区分：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0024' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0024',
	'I',
	'仕訳対象レコード数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0025' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0025',
	'I',
	'仕訳伝票数：{1} 総レコード数：{2} 借方レコード数：{3} 貸方レコード数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0026' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0026',
	'I',
	'処理が終了しました。{1}\nデータ取込件数：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0027' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0027',
	'W',
	'対象の部門を会計部門に変換できませんでした。\n部門ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0028' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0028',
	'W',
	'会計税対応マスタに有効なレコードが登録されていません。\n会計伝票区分：{1}\n税ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0029' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0029',
	'W',
	'会計税マスタに有効なレコードが登録されていません。\n税ＣＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0030' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0030',
	'W',
	'在庫締処理が行われていないため在庫情報を取り込めません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0031' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0031',
	'W',
	'対象の受払データで仕訳済みのレコードがあるため再取込できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0032' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0032',
	'W',
	'対象の在庫データで仕訳済みのレコードがあるため取込できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0033' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0033',
	'W',
	'対象の入金データで仕訳済みのレコードがあるため再取込できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0034' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0034',
	'W',
	'対象の手形データで処理済みのレコードがあるため取込できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0035' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0035',
	'W',
	'仕訳対象の会計伝票区分が存在していません。会計伝票区分仕訳マスタを確認してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0036' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0036',
	'W',
	'会計部門マスタから伝票グループＩＤを取得できませんでした。\n会計部門ＣＤ：{1}\n対象日：{2}\n会計伝票区分：{3}\n自動仕訳キーＣＤ：{4}\n仕訳パタンＣＤ：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0037' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0037',
	'W',
	'対象の支払データで仕訳済みのレコードがあるため取込できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0038' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBBD0038',
	'W',
	'対象の支払依頼データで送信済みのレコードがあるため再取込できません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBCL0001',
	'W',
	'指定の帳票保存システムで取り扱えないパスが指定されています。帳票保存先マスタを確認してください。\n帳票保存システムＣＤ：{1}\nパス：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBCL0003',
	'W',
	'添付元ファイルが存在しません。パス、ファイル名を確認してください。\nパス：{1}\nファイル名：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBCL0004',
	'W',
	'保存先のパスを取得できませんでした。保存先ファイルパスを指定するか、帳票保存先マスタを登録してください。\n業務区分：{1}\n取引先ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBCL0005',
	'W',
	'指定のファイル名と同名のファイルが保存先に存在しています。パス、またはファイル名を変更してください。\nパス：{1}\nファイル名：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBCL0006',
	'W',
	'保存先のファイル名を取得できませんでした。保存先ファイル名を指定するか、帳票ファイル名称マスタを登録してください。\n業務区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBCL0009',
	'W',
	'帳票保存システムＣＤを取得できませんでした。会社マスタまたは帳票保存制御マスタを確認してください。\n業務区分：{1}\n取引先ＣＤ：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBCL0010',
	'W',
	'対応する添付ファイル情報が取得できませんでした。\n業務区分：{1}\n帳票ＩＤ：{2}\n業務キー１：{3}\n業務キー２：{4}\n業務キー３：{5}\n業務キー４：{6}\n業務キー５：{7}\n業務キー６：{8}\n業務キー７：{9}\n業務キー８：{10}\n業務キー９：{11}\n業務キー１０：{12}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBCL0011',
	'W',
	'invoiceAgentのＡＰＩ呼び出しでエラーが発生しました。\nレスポンスコード：{1}\nエラーコード：{2}\nメッセージ：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBCP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBCP0001',
	'W',
	'未保存のファイル、または保存済のファイルを選択してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBCP0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBCP0002',
	'W',
	'添付したファイルが存在しません。パス、ファイル名を確認してください。\nパス：{1}\nファイル名：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0001',
	'W',
	'SQLの構文が不正です。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0002',
	'W',
	'SQLの実行でエラーが発生しました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0003',
	'W',
	'SQLの実行でエラーが発生しました。\nメッセージ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0010',
	'I',
	'まとめ登録処理を開始します。\nテーブルＩＤ：{1}\nファイル名：{2}\nDBコンテナクラスパス：{3}\nチェックオペレーション：{4}\n登録オペレーション：{5}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0011',
	'I',
	'まとめ登録処理を終了しました。\nテーブルＩＤ：{1}\n処理件数：{2}\n登録件数：{3}\nエラー件数：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0012' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0012',
	'W',
	'オペレーションの生成に失敗しました。\nオペレーション：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0013' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0013',
	'W',
	'ＤＢコンテナの生成に失敗しました。\nオペレーション：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0014' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0014',
	'W',
	'ファイルの値が不正です。\n行番号：{1}\n項目名：{2}\n書式：{3}\n値：{4}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0015' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0015',
	'I',
	'データファイルを出力しました。\nテーブルＩＤ：{1}\nファイル名：{2}\nデータ件数：{3}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0016' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0016',
	'W',
	'DBコンテナクラスパスが設定されていないため、データ出力処理を実行できません。\nテーブルＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0017' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0017',
	'W',
	'DBコンテナクラスパス、登録オペレーションのいずれも設定されていません。\nテーブルＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0018' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0018',
	'W',
	'処理方法が「データに従う」の場合はDBコンテナが指定されたレコードを処理できません。\nテーブルＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0019' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0019',
	'W',
	'処理方法が「データに従う」以外の場合はDBコンテナが指定されていないレコードを処理できません。\nテーブルＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0020' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0020',
	'W',
	'指定されたオペレーションの上り電文ブロックが複数存在するか、リスト型でないため処理できません。\nテーブルＩＤ：{1}\nオペレーション：{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0021' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0021',
	'W',
	'Excelファイルの上限を超える行数データが出力対象となっているため、データ出力処理を中断します。\nCSV形式で出力してください。\nテーブルＩＤ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0101' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0101',
	'W',
	'ＩＦレコードに、複数の外部システムＣＤが含まれています。\n不要なレコードの取込対象をオフとしてください。\n');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0102' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0102',
	'W',
	'同一データＮＯの他のレコードでエラーが発生しました。\nデータＮＯ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0103' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0103',
	'W',
	'外部マスタ取込処理では、指定された外部マスタ連携区分を利用できません。\n外部マスタ連携区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0104' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEL0104',
	'W',
	'外部マスタ送信処理では、指定された外部マスタ連携区分を利用できません。\n外部マスタ連携区分：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0001' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEP0001',
	'I',
	'バインド変数が更新されました。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0002' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEP0002',
	'W',
	'SQLがSELECT文ではありません。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0003' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEP0003',
	'W',
	'すべての列を表示できません。列数：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0004' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEP0004',
	'I',
	'バックグラウンドで業務データダウンロードを実行しています。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0005' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEP0005',
	'I',
	'待機中の業務データダウンロードをキャンセルして処理を継続しますか？\n業務データ：{1}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0006' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEP0006',
	'I',
	'検索処理を実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0007' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEP0007',
	'I',
	'ダウンロードを実行します。よろしいですか？');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0009' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEP0009',
	'W',
	'選択をオンにしている場合はデータの更新はできません。\n選択をオフにしてから更新してください。');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0010' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEP0010',
	'W',
	'ファイルの読み取りでエラーが発生しました。\nファイル名：{1}\n{2}');
DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0011' AND LOC_CD IS NULL;
INSERT INTO FCT_MSG (MSGID, LVL, MSG) VALUES(
	'MBBEP0011',
	'I',
	'データファイルはサーバ処理確認画面からダウンロードしてください。');
