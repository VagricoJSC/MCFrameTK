
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

DELETE FROM FCT_MSG WHERE MSGID = 'MBUAL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBUAL0001',
	'en_US',
	'W',
	'The journal group No. is not entered in the Auto-Journal History table.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBUCP0058W' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBUCP0058W',
	'en_US',
	'W',
	'Could not set the value of {1}.\nValue: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBUCP0059W' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBUCP0059W',
	'en_US',
	'W',
	'Could not set the value of {1}.\nValue: {2}\nRow: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBUCP0060W' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBUCP0060W',
	'en_US',
	'W',
	'The template name is duplicated.\nTemplate name: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBUCP0061W' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBUCP0061W',
	'en_US',
	'W',
	'Configuration of template setting failed. The processing suspended.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBUDP0012W' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBUDP0012W',
	'en_US',
	'W',
	'Failed to enter.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL0001',
	'en_US',
	'W',
	'The approval information does not exist.\nApproval No.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL0002',
	'en_US',
	'W',
	'The approval information does not exist.\nApproval No.: {1}\nApproval sequence number: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL0003',
	'en_US',
	'W',
	'The approval information does not exist.\nApproval No.: {1}\nApproval sequence number: {2}\nApproval role cd.: {3}\nMain PIC cd.: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL0004',
	'en_US',
	'W',
	'The approval information has been canceled.\nApproval No.: {1}\nApproval sequence number: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL0005',
	'en_US',
	'W',
	'The approval information is not updatable.\nApproval No.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL0006',
	'en_US',
	'W',
	'The approval information is not updatable.\nApproval No.: {1}\nApproval sequence number.: {2}\nApproval role cd.: {3}\nMain PIC cd.: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL0007',
	'en_US',
	'W',
	'Since the approval information has not been approved, the next process cannot be executed.\nApproval No.: {1}\nApproval function type: {2}\nApproval request source reference No. 1: {3}\nApproval request source reference No. 2: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL0008',
	'en_US',
	'W',
	'Cannot cancel the approval information.\nApproval No.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL0009',
	'en_US',
	'W',
	'Cannot update multiple approval sequences with the same approval No. at once.\nApproval No.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL0010',
	'en_US',
	'W',
	'Cannot approve and reject at the same time for the same approval No.\nApproval No.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL0011' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL0011',
	'en_US',
	'W',
	'The Approval details status type is invalid.\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL1001',
	'en_US',
	'I',
	'An approval request to the main PIC has been entered.\nApproval function type name: {1}\nBP name: {2}\nBusiness PIC name: {3}\nEntry PIC name: {4}\nCurrency: {5}\nAmount: {6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL1002',
	'en_US',
	'I',
	'An approval request to the sub PIC has been entered.\nApproval function type name: {1}\nBP name: {2}\nBusiness PIC name: {3}\nEntry PIC name: {4}\nCurrency: {5}\nAmount: {6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL1003',
	'en_US',
	'I',
	'The approval request has been updated.\nApproval function type name: {1}\nApproval No.: {2}\nBP name: {3}\nBusiness PIC name: {4}\nEntry PIC name: {5}\nCurrency: {6}\nAmount: {7}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL1004',
	'en_US',
	'I',
	'The approval request has been approved.\nApproval function type name: {1}\nApproval No.: {2}\nApproval requesting source No. 1: {3}\nApproval requesting source No. 2: {4}\nBP name: {5}\nCurrency: {6}\nAmount: {7}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL1005',
	'en_US',
	'I',
	'The approval request has been rejected.\nApproval function type name: {1}\nApproval No.: {2}\nApproval requesting source No. 1: {3}\nApproval requesting source No. 2: {4}\nBP name: {5}\nCurrency: {6}\nAmount: {7}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL1006',
	'en_US',
	'I',
	'Approval of the approval request has been canceled.\nApproval function type name: {1}\nApproval No.: {2}\nApproval requesting source No. 1: {3}\nApproval requesting source No. 2: {4}\nBP name: {5}\nCurrency: {6}\nAmount: {7}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL1007',
	'en_US',
	'I',
	'Rejection of the approval request has been canceled.\nApproval function type name: {1}\nApproval No.: {2}\nApproval requesting source No. 1: {3}\nApproval requesting source No. 2: {4}\nBP name: {5}\nCurrency: {6}\nAmount: {7}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL1008',
	'en_US',
	'I',
	'The approval request to the main PIC has been approved from an authorized representative.\nApproval function type name: {1}\nApproval No.: {2}\nBP name: {3}\nBusiness PIC name: {4}\nEntry PIC name: {5}\nCurrency: {6}\nAmount: {7}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL1009',
	'en_US',
	'I',
	'The approval request to the main PIC has been rejected from an authorized representative.\nApproval function type name: {1}\nApproval No.: {2}\nBP name: {3}\nBusiness PIC name: {4}\nEntry PIC name: {5}\nCurrency: {6}\nAmount: {7}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL1010',
	'en_US',
	'I',
	'Approval for the approval request to the main PIC has been cancelled from an authorized representative.\nApproval function type name: {1}\nApproval No.: {2}\nBP name: {3}\nBusiness PIC name: {4}\nEntry PIC name: {5}\nCurrency: {6}\nAmount: {7}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAL1011' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAL1011',
	'en_US',
	'I',
	'Rejection for the approval request to the main PIC has been cancelled from an authorized representative.\nApproval function type name: {1}\nApproval No.: {2}\nBP name: {3}\nBusiness PIC name: {4}\nEntry PIC name: {5}\nCurrency: {6}\nAmount: {7}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAP0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAP0001',
	'en_US',
	'W',
	'The Approval function cd. is invalid. {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBAP0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBAP0002',
	'en_US',
	'I',
	'There are slips to be approved. Do you want to see the slips?\nThe number of slips for the main PIC: {1}\nThe number of slips for the sub PIC: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0001',
	'en_US',
	'W',
	'Cannot process because the Accounting LINK program is not installed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0002',
	'en_US',
	'W',
	'To export the data, the Data status type must be "2. Journal created".\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0003',
	'en_US',
	'W',
	'To cancel the data, the Data status type must be "3. Sent".\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0004',
	'en_US',
	'W',
	'To cancel the data, all the Journal Export IF data associated with the Journal group No. must be unprocessed.\nJournal group No.: {1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0005',
	'en_US',
	'W',
	'Cannot delete if the Data status type is "3. Sent".\n{1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0006',
	'en_US',
	'W',
	'Multiple IF records have the same value in the following.\nUnselect the Import target of unnecessary records.\nData row No.: {1}\nColumn: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0007',
	'en_US',
	'W',
	'Could not acquire the Account master.\nAccount cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0008',
	'en_US',
	'I',
	'Data No.: {1}\nThe number of data: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0009',
	'en_US',
	'W',
	'Could not acquire the Notes Reason master.\nData No.: {1}\nNotes reason cd.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0010',
	'en_US',
	'W',
	'Could not acquire the Slip group ID from the Accounting Dept. master.\nData No.: {1}\nAccounting dept. cd.: {2}\nNotes reason cd.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0011' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0011',
	'en_US',
	'I',
	'The number of data: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0012' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0012',
	'en_US',
	'I',
	'The processing started. {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0013' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0013',
	'en_US',
	'I',
	'The processing completed. {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0014' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0014',
	'en_US',
	'W',
	'Could not acquire the Payment Request Account master.\nData No.: {1}\nPayment obligation type: {2}\nTransaction currency cd.: {3}\nForeign transaction type: {4}\nAP supplier cd.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0015' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0015',
	'en_US',
	'W',
	'Could not acquire the Slip group ID from the Accounting Dept. master.\nData No.: {1}\nAccounting dept. cd.: {2}\nPayment obligation type: {3}\nTransaction currency cd.: {4}\nForeign transaction type: {5}\nAP supplier cd.: {6}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0016' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0016',
	'en_US',
	'W',
	'The account uses the Aggregated cd. {1}. However, there are records whose Aggregated cd. is NULL.\nData No.: {2}\nAccounting cd.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0017' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0017',
	'en_US',
	'W',
	'The account uses the Project. However, there are records whose Project is NULL.\nData No.: {1}\nAccounting cd.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0018' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0018',
	'en_US',
	'W',
	'The number cannot be set as the Aggregated cd. since the number of digits is too large.\nSetting column type: {1} -> Aggregation column type: {2}\nData No.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBL0101' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBL0101',
	'en_US',
	'W',
	'To cancel the data, all Journal Export IF data associated with the Journal group No. must be unprocessed, or must be in an error state.\nJournal group No.: {1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0001',
	'en_US',
	'I',
	'The processing started. {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0002',
	'en_US',
	'I',
	'The processing completed. {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0003',
	'en_US',
	'W',
	'Cannot process the target data since it is being used.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0004',
	'en_US',
	'W',
	'An error has occurred. See the log file.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0005',
	'en_US',
	'W',
	'Debit and credit amounts in corresponding journal pattern do not match.\nJournal pattern cd.: {1}\nDebit amount: {2}\nCredit amount: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0006',
	'en_US',
	'W',
	'The journal pattern uses the Accounting Reason Account Setting master. However, the corresponding journal group or accounting reason is not set in the master.\nJournal pattern cd.: {1}\nSequence number: {2}\nAccounting reason cd.: {3}\nJournal group: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0007',
	'en_US',
	'W',
	'The journal pattern uses the Item Journal Account Setting master. However, the corresponding journal group or item journal is not set in the master.\nJournal pattern cd.: {1}\nSequence number: {2}\nItem journal cd.: {3}\nJournal group: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0008' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0008',
	'en_US',
	'W',
	'The journal pattern uses the Bank Account Type Setting master. However the corresponding journal group or account is not set in the master.\nJournal pattern cd.: {1}\nSequence number: {2}\nBank account cd.: {3}\nJournal group: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0009',
	'en_US',
	'W',
	'An invalid value is set in the Auto-Journal Pattern master or the corresponding account setting master.\nJournal pattern cd.: {1}\nSequence number: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0010',
	'en_US',
	'W',
	'An account that does not exist in the Account master has been entered.\nJournal pattern cd.: {1}\nSequence number: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0011' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0011',
	'en_US',
	'W',
	'The Amount type is invalid. See the setting of the Auto-Journal Pattern master or the corresponding account setting master.\nJournal pattern cd.: {1}\nSequence number: {2}\nAmount type: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0012' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0012',
	'en_US',
	'W',
	'Could not acquire the standard unit cost info. See the setting of the Standard Unit Price master.\nTerm: {1}\nItem: {2}\nWG cd.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0013' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0013',
	'en_US',
	'W',
	'The account uses a subsidiary account. However, there are records whose subsidiary account is NULL.\nAccount cd.: {1}\nJournal pattern cd.: {2}\nSequence number: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0014' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0014',
	'en_US',
	'W',
	'The account uses BP. However, there are records whose BP is NULL.\nAccount cd.: {1}\nJournal pattern cd.: {2}\nSequence number: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0015' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0015',
	'en_US',
	'W',
	'Cannot set since the debit or credit dept. is NULL. See the setting of the Debit/Credit dept. type in the corresponding journal pattern.\nAccounting slip type: {1}\nJournal pattern cd.: {2}\nSequence number: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0016' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0016',
	'en_US',
	'W',
	'The account uses PIC. However, there are records whose PIC is NULL.\nAccount cd.: {1}\nJournal pattern cd.: {2}\nSequence number: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0017' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0017',
	'en_US',
	'W',
	'The account uses a bank account. However, there are records whose bank account is NULL.\nAccount cd.: {1}\nJournal pattern cd.: {2}\nSequence number: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0018' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0018',
	'en_US',
	'W',
	'The account uses a project. However, there are records whose project is NULL.\nAccount cd.: {1}\nJournal pattern cd.: {2}\nSequence number: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0019' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0019',
	'en_US',
	'W',
	'The account uses the Aggregation cd. {1}. However, there are records whose Aggregation cd. {1} is NULL.\nAccount cd.: {2}\nJournal Pattern cd.: {3}\nSequence number: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0020' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0020',
	'en_US',
	'W',
	'No valid records are entered in the Auto-Journal master for the corresponding Accounting slip type and Auto-journal key.\nAccounting slip type: {1}\nAuto-journal key cd.: {2}\nDate: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0021' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0021',
	'en_US',
	'W',
	'Although a journal pattern with the corresponding Accounting slip type and Auto-journal key has been entered,\ncannot output journal results since no journal pattern meets the criteria.\nAccounting slip type: {1}\nAuto-journal key cd.: {2}\nAuto-journal group: {3}\nItem: {4}\nSlip No.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0022' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0022',
	'en_US',
	'W',
	'The Slip group ID is not entered in the Auto-Journal master.\nAccounting slip type: {1}\nAuto-journal key cd.: {2}\nJournal pattern cd.: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0023' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0023',
	'en_US',
	'W',
	'The number cannot be set as the Aggregated cd. since the number of digits is too large.\nSetting column type: {1} -> Aggregation column type: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0024' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0024',
	'en_US',
	'I',
	'The number of records to be journalized: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0025' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0025',
	'en_US',
	'I',
	'The number of journal slips: {1} The number of total records: {2} The number of debit records: {3} The number of credit records: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0026' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0026',
	'en_US',
	'I',
	'The processing completed. {1}\nThe number of imported data: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0027' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0027',
	'en_US',
	'W',
	'Could not convert the corresponding dept. to an accounting dept.\nDept. cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0028' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0028',
	'en_US',
	'W',
	'Records valid for the following condition are not entered in the Accounting Tax Mapping master.\nAccounting slip type: {1}\nTax cd.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0029' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0029',
	'en_US',
	'W',
	'Records valid for the following condition is not entered in the Accounting Tax master.\nTax cd.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0030' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0030',
	'en_US',
	'W',
	'Cannot import the inventory info. since the inventory closing has not been performed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0031' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0031',
	'en_US',
	'W',
	'Cannot re-import the data because some records in the corresponding GR/GI data have been journalized.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0032' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0032',
	'en_US',
	'W',
	'Cannot import the data because some records in the corresponding inventory data have been journalized.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0033' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0033',
	'en_US',
	'W',
	'Cannot re-import the data because some records in the corresponding payment received data have been journalized.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0034' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0034',
	'en_US',
	'W',
	'Cannot import the data because some records in the corresponding notes data have been processed.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0035' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0035',
	'en_US',
	'W',
	'The Accounting slip type to be journalized does not exist. See the setting of the Accounting Slip Type Journal master.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0036' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0036',
	'en_US',
	'W',
	'Could not acquire the Slip group ID from the Accounting Department master.\nAccounting department cd.: {1}\nDate: {2}\nAccounting slip type: {3}\nAuto-journal key cd.: {4}\nJournal Pattern cd.: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0037' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0037',
	'en_US',
	'W',
	'Cannot import the data because some records in the corresponding payment data have been journalized.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBBD0038' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBBD0038',
	'en_US',
	'W',
	'Cannot import the data because some records in the corresponding payment data have been sent.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBCL0001',
	'en_US',
	'W',
	'A path that cannot be used by the specified report storage system has been set. See the setting of the Report Storage Location master.\nReport storage system cd.: {1}\nPath: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBCL0003',
	'en_US',
	'W',
	'Attachment source file does not exist. See if the path and file name are correct.\nPath: {1}\nFile name: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBCL0004',
	'en_US',
	'W',
	'Could not acquire the path of the storage location. Specify the path of the file storage location or enter the Report Storage Location master.\nBusiness type: {1}\nBP cd.: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBCL0005',
	'en_US',
	'W',
	'A file with the same name as the specified file name exists in the storage location. Change the path or file name.\nPath: {1}\nFile name: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBCL0006',
	'en_US',
	'W',
	'Could not acquire the name of a file to be stored. Specify the name of a file to be stored or enter the Report File Name master.\nBusiness type: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBCL0009',
	'en_US',
	'W',
	'Could not acquire the Report storage system cd. See the setting of the Company master or Report storage control master.\nBusiness type: {1}\nBP cd.: {2}\n');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBCL0010',
	'en_US',
	'W',
	'Could not acquire the corresponding attachment file information.\nBusiness type: {1}\nReport ID: {2}\nBusiness key 1: {3}\nBusiness key 2: {4}\nBusiness key 3: {5}\nBusiness key 4: {6}\nBusiness key 5: {7}\nBusiness key 6: {8}\nBusiness key 7: {9}\nBusiness key 8: {10}\nBusiness key 9: {11}\nBusiness key 10: {12}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBCL0011' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBCL0011',
	'en_US',
	'W',
	'An error has occurred while calling an API of invoiceAgent.\nresponse code: {1}\nerror code: {2}\nmessage: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBCP0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBCP0001',
	'en_US',
	'W',
	'Select an unsaved file or a saved file.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBCP0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBCP0002',
	'en_US',
	'W',
	'The attached file does not exist. See if the path and file name are correct.\nPath: {1}\nFile name: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0001',
	'en_US',
	'W',
	'Invalid SQL syntax.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0002',
	'en_US',
	'W',
	'An error has occurred while executing an SQL statement.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0003',
	'en_US',
	'W',
	'An error has occurred while executing an SQL statement.\nMessage: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0010',
	'en_US',
	'I',
	'Starting the Batch Entry processing.\nTable ID: {1}\nFile name: {2}\nDB container class path: {3}\nCheck operation: {4}\nEntry operation: {5}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0011' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0011',
	'en_US',
	'I',
	'The Batch Entry processing completed.\nTable ID: {1}\nNumber of processes: {2}\nNumber of entries: {3}\nNumber of errors: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0012' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0012',
	'en_US',
	'W',
	'Failed to generate the operation.\nOperation: {1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0013' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0013',
	'en_US',
	'W',
	'Failed to generate the DB container.\nOperation: {1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0014' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0014',
	'en_US',
	'W',
	'Invalid file value.\nRow number: {1}\nColumn name: {2}\nFormat: {3}\nValue: {4}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0015' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0015',
	'en_US',
	'I',
	'The data file has been output.\nTable ID: {1}\nFile name: {2}\nNumber of data items: {3}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0016' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0016',
	'en_US',
	'W',
	'Cannot output the data since the DB container class path is not set.\nTable ID: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0017' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0017',
	'en_US',
	'W',
	'Neither the DB container class path nor Entry operation is set.\nTable ID: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0018' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0018',
	'en_US',
	'W',
	'If the processing method is "Follow the data", records in which DB container is set cannot be processed.\nTable ID: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0019' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0019',
	'en_US',
	'W',
	'If the processing method is other than "Follow the data", records in which DB container is not set cannot be processed.\nTable ID: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0020' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0020',
	'en_US',
	'W',
	'Cannot process because multiple request message blocks exist for the specified operation, or the request message block for the specified operation is not the list type.\nTable ID: {1}\nOperation: {2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0021' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0021',
	'en_US',
	'W',
	'Data output processing suspended since the number of rows in the data to be output is larger than the upper limit of Excel. \nUse CSV file to output.\nTable ID: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0101' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0101',
	'en_US',
	'W',
	'Multiple External system cd. are included in the IF records.\nUnselect the Import target of unnecessary records.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0102' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0102',
	'en_US',
	'W',
	'An error has occurred while processing another record with the same data No.\nData No.: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0103' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0103',
	'en_US',
	'W',
	'The specified External master linkage type cannot be used in the external master import processing.\nExternal master linkage type: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEL0104' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEL0104',
	'en_US',
	'W',
	'The specified External master linkage type cannot be used in the external master export processing.\nExternal master linkage type: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0001' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEP0001',
	'en_US',
	'I',
	'The bind variable has been updated.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0002' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEP0002',
	'en_US',
	'W',
	'The SQL statement is not a SELECT statement.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0003' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEP0003',
	'en_US',
	'W',
	'There are columns which cannot be displayed. The number of columns: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0004' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEP0004',
	'en_US',
	'I',
	'The business data is being downloaded in background.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0005' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEP0005',
	'en_US',
	'I',
	'Do you want to cancel downloading the standby business data, and continue this processing?\nBusiness data: {1}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0006' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEP0006',
	'en_US',
	'I',
	'Do you want to continue the search processing?');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0007' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEP0007',
	'en_US',
	'I',
	'Do you want to download?');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0009' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEP0009',
	'en_US',
	'W',
	'Cannot update the data if the selection is turned on.\nTurn off the selection before updating.');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0010' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEP0010',
	'en_US',
	'W',
	'An error has occurred while reading the file.\nFile name: {1}\n{2}');

DELETE FROM FCT_MSG WHERE MSGID = 'MBBEP0011' AND LOC_CD = 'en_US';

INSERT INTO FCT_MSG (MSGID, LOC_CD, LVL, MSG) VALUES(
	'MBBEP0011',
	'en_US',
	'I',
	'Download the data file from the Check Server Process screen.');

